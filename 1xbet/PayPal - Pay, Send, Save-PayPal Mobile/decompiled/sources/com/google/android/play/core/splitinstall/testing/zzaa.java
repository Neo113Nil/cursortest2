package com.google.android.play.core.splitinstall.testing;

/* loaded from: classes9.dex */
public final class zzaa {
    private static final com.google.android.play.core.splitinstall.internal.zzu zza = new com.google.android.play.core.splitinstall.internal.zzu("LocalTestingConfigParser");
    private final org.xmlpull.v1.XmlPullParser zzb;
    private final com.google.android.play.core.splitinstall.testing.zzu zzc = com.google.android.play.core.splitinstall.testing.zzv.zzc();

    zzaa(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        this.zzb = xmlPullParser;
    }

    public static com.google.android.play.core.splitinstall.testing.zzv zza(java.io.File file) {
        java.io.File file2 = new java.io.File(file, "local_testing_config.xml");
        if (!file2.exists()) {
            return com.google.android.play.core.splitinstall.testing.zzv.zza;
        }
        try {
            java.io.FileReader fileReader = new java.io.FileReader(file2);
            try {
                org.xmlpull.v1.XmlPullParser newPullParser = org.xmlpull.v1.XmlPullParserFactory.newInstance().newPullParser();
                newPullParser.setInput(fileReader);
                final com.google.android.play.core.splitinstall.testing.zzaa zzaaVar = new com.google.android.play.core.splitinstall.testing.zzaa(newPullParser);
                zzaaVar.zze("local-testing-config", new com.google.android.play.core.splitinstall.testing.zzz() { // from class: com.google.android.play.core.splitinstall.testing.zzy
                    @Override // com.google.android.play.core.splitinstall.testing.zzz
                    public final void zza() {
                        com.google.android.play.core.splitinstall.testing.zzaa.this.zzd();
                    }
                });
                com.google.android.play.core.splitinstall.testing.zzv zze = zzaaVar.zzc.zze();
                fileReader.close();
                return zze;
            } catch (java.lang.Throwable th) {
                try {
                    fileReader.close();
                } catch (java.lang.Throwable th2) {
                    try {
                        java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
                    } catch (java.lang.Exception unused) {
                    }
                }
                throw th;
            }
        } catch (java.io.IOException | java.lang.RuntimeException | org.xmlpull.v1.XmlPullParserException e) {
            zza.zze("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e.getMessage());
            return com.google.android.play.core.splitinstall.testing.zzv.zza;
        }
    }

    public static /* synthetic */ void zzb(final com.google.android.play.core.splitinstall.testing.zzaa zzaaVar) {
        for (int i = 0; i < zzaaVar.zzb.getAttributeCount(); i++) {
            if ("defaultErrorCode".equals(zzaaVar.zzb.getAttributeName(i))) {
                zzaaVar.zzc.zza(com.google.android.play.core.splitinstall.model.zza.zza(zzaaVar.zzb.getAttributeValue(i)));
            }
        }
        zzaaVar.zze("split-install-error", new com.google.android.play.core.splitinstall.testing.zzz() { // from class: com.google.android.play.core.splitinstall.testing.zzw
            @Override // com.google.android.play.core.splitinstall.testing.zzz
            public final void zza() {
                com.google.android.play.core.splitinstall.testing.zzaa.zzc(com.google.android.play.core.splitinstall.testing.zzaa.this);
            }
        });
    }

    public static /* synthetic */ void zzc(com.google.android.play.core.splitinstall.testing.zzaa zzaaVar) {
        java.lang.String str = null;
        java.lang.String str2 = null;
        for (int i = 0; i < zzaaVar.zzb.getAttributeCount(); i++) {
            if (com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE.equals(zzaaVar.zzb.getAttributeName(i))) {
                str = zzaaVar.zzb.getAttributeValue(i);
            }
            if ("errorCode".equals(zzaaVar.zzb.getAttributeName(i))) {
                str2 = zzaaVar.zzb.getAttributeValue(i);
            }
        }
        if (str == null || str2 == null) {
            throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.format("'%s' element does not contain 'module'/'errorCode' attributes.", "split-install-error"), zzaaVar.zzb, null);
        }
        zzaaVar.zzc.zzd().put(str, java.lang.Integer.valueOf(com.google.android.play.core.splitinstall.model.zza.zza(str2)));
        while (zzaaVar.zzb.next() != 3) {
        }
    }

    private final void zze(java.lang.String str, com.google.android.play.core.splitinstall.testing.zzz zzzVar) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        while (true) {
            int next = this.zzb.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (this.zzb.getEventType() == 2) {
                if (!this.zzb.getName().equals(str)) {
                    throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.format("Expected '%s' tag but found '%s'.", str, this.zzb.getName()), this.zzb, null);
                }
                zzzVar.zza();
            }
        }
    }

    final /* synthetic */ void zzd() throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        zze("split-install-errors", new com.google.android.play.core.splitinstall.testing.zzz() { // from class: com.google.android.play.core.splitinstall.testing.zzx
            @Override // com.google.android.play.core.splitinstall.testing.zzz
            public final void zza() {
                com.google.android.play.core.splitinstall.testing.zzaa.zzb(com.google.android.play.core.splitinstall.testing.zzaa.this);
            }
        });
    }
}
