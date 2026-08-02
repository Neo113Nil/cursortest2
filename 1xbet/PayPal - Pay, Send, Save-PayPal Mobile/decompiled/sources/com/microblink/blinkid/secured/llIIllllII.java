package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class llIIllllII implements com.microblink.blinkid.secured.IlIIlIIIll {
    public final com.microblink.blinkid.secured.lIIIIIllll IlIllIlIIl = new com.microblink.blinkid.secured.lIIIIIllll();
    public com.microblink.blinkid.secured.lllIIIlIlI IllIIIllII;
    public final com.microblink.blinkid.secured.IlIlIlIIIl llIIIlllll;

    public llIIllllII() {
        com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = new com.microblink.blinkid.secured.IlIlIlIIIl("Baltazar");
        this.llIIIlllll = ilIlIlIIIl;
        ilIlIlIIIl.start();
    }

    @Override // com.microblink.blinkid.secured.IlIIlIIIll
    public final void llIIlIlIIl(android.content.Context context) {
        if (this.IllIIIllII == null) {
            this.IllIIIllII = new com.microblink.blinkid.secured.lllIIIlIlI(context);
        }
        if ((!llIIlIlIIl(0) || !llIIlIlIIl(this.IllIIIllII.llIIlIlIIl.getString("com.microblink.blinkid.baltazar.preferences.lastServerResponse", null)).llIIlIlIIl) && !llIIlIlIIl(context, true)) {
            throw new com.microblink.blinkid.licence.exception.LicenceLockedException();
        }
    }

    @Override // com.microblink.blinkid.secured.IlIIlIIIll
    public final void llIIlIlIIl(java.lang.String str, android.content.Context context) {
        if (this.IllIIIllII == null) {
            this.IllIIIllII = new com.microblink.blinkid.secured.lllIIIlIlI(context);
        }
        if (str != null && com.microblink.blinkid.recognition.RightsManager.llIIlIlIIl(com.microblink.blinkid.recognition.Right.ALLOW_BALTAZAR_PROXY)) {
            com.microblink.blinkid.secured.lIIIIIllll liiiiillll = this.IlIllIlIIl;
            if (android.webkit.URLUtil.isHttpsUrl(str)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
                if (sb.charAt(sb.length() - 1) != '/') {
                    sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
                }
                sb.append("api/v2/status/check");
                liiiiillll.llIIlIlIIl = sb.toString();
            } else {
                throw new java.lang.IllegalArgumentException("Baltazar proxy URL must use HTTPS protocol.");
            }
        }
        if (llIIlIlIIl(3)) {
            com.microblink.blinkid.util.Log.d("Baltazar", "using baltazar cache", new java.lang.Object[0]);
            int i = llIIlIlIIl(this.IllIIIllII.llIIlIlIIl.getString("com.microblink.blinkid.baltazar.preferences.lastServerResponse", null)).IllIIIllII;
            if (i == 0 || i == 1) {
                return;
            }
            this.llIIIlllll.llIIlIlIIl(new com.microblink.blinkid.secured.llIllIlIll(this, context));
            return;
        }
        this.llIIIlllll.llIIlIlIIl(new com.microblink.blinkid.secured.llIllIlIll(this, context));
    }

    public final boolean llIIlIlIIl(int i) {
        return java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(this.IllIIIllII.llIIlIlIIl.getLong("com.microblink.blinkid.baltazar.preferences.lease", 0L) - java.lang.System.currentTimeMillis()) > ((long) i) && this.IllIIIllII.llIIlIlIIl.getBoolean("com.microblink.blinkid.baltazar.preferences.licenceUnlocked", false);
    }

    public final boolean llIIlIlIIl(android.content.Context context, boolean z) {
        java.lang.String str;
        while (true) {
            try {
                com.microblink.blinkid.secured.IIlIIIllIl llIIlIlIIl = this.IlIllIlIIl.llIIlIlIIl(new com.microblink.blinkid.secured.llIIlIIlll(com.microblink.blinkid.settings.NativeLibraryInfo.IllIIIllII(), com.microblink.blinkid.recognition.RightsManager.IlIllIlIIl(), com.microblink.blinkid.recognition.RightsManager.IllIIIllII(), com.microblink.blinkid.recognition.RightsManager.llIIlIlIIl(), context.getPackageName()));
                if (llIIlIlIIl.llIIlIlIIl != 200 || (str = llIIlIlIIl.IlIllIlIIl) == null) {
                    if (z) {
                        return llIIlIlIIl(context, false);
                    }
                    throw new com.microblink.blinkid.licence.exception.RemoteLicenceCheckException("Unable to do remote licence check.");
                }
                com.microblink.blinkid.secured.llllllllIl llIIlIlIIl2 = llIIlIlIIl(str);
                int i = llIIlIlIIl2.IllIIIllII;
                if (i == 0 || i == 1) {
                    return llIIlIlIIl2.llIIlIlIIl;
                }
                if (z) {
                    return llIIlIlIIl(context, false);
                }
                throw new com.microblink.blinkid.licence.exception.RemoteLicenceCheckException("Unable to do remote licence check.");
            } catch (java.lang.Exception unused) {
                if (!z) {
                    throw new com.microblink.blinkid.licence.exception.RemoteLicenceCheckException("Unable to do remote licence check.");
                }
                z = false;
            }
        }
    }

    public final com.microblink.blinkid.secured.llllllllIl llIIlIlIIl(java.lang.String str) {
        this.IllIIIllII.llIIlIlIIl("com.microblink.blinkid.baltazar.preferences.lastServerResponse", str);
        com.microblink.blinkid.secured.llllllllIl llIIlIlIIl = com.microblink.blinkid.licence.LicenceManager.llIIlIlIIl(str);
        com.microblink.blinkid.secured.lllIIIlIlI llliiilili = this.IllIIIllII;
        llliiilili.llIIlIlIIl(java.lang.Boolean.valueOf(llIIlIlIIl.llIIlIlIIl));
        llliiilili.llIIlIlIIl(llIIlIlIIl.IlIllIlIIl);
        return llIIlIlIIl;
    }
}
