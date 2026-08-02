package com.microblink.blinkid.licence;

/* loaded from: classes10.dex */
public abstract class LicenceManager {
    public static java.lang.String IlIllIlIIl = null;
    public static boolean llIIlIlIIl = true;

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
    }

    public static void IlIllIlIIl(java.lang.String str, java.lang.String str2, android.content.Context context) {
        llIIlIlIIl(nativeSetBase64LibraryLicenseKey(str, str2), context);
        llIIlIlIIl(context);
    }

    public static void IllIIIllII(java.lang.String str, android.content.Context context) {
        llIIlIlIIl(nativeSetBase64LicenseKey(str), context);
        llIIlIlIIl(context);
    }

    public static void llIIlIlIIl(byte[] bArr, android.content.Context context) {
        llIIlIlIIl(nativeSetLicenseBuffer(bArr), context);
        llIIlIlIIl(context);
    }

    private static native long nativeGetLease();

    private static native boolean nativeIsLicenceOnline();

    private static native java.lang.String nativeSetBase64LibraryLicenseKey(java.lang.String str, java.lang.String str2);

    private static native java.lang.String nativeSetBase64LicenseKey(java.lang.String str);

    private static native java.lang.String nativeSetLibraryLicenseBuffer(byte[] bArr, java.lang.String str);

    private static native java.lang.String nativeSetLibraryLicenseFile(java.lang.String str, java.lang.String str2, android.content.res.AssetManager assetManager);

    private static native java.lang.String nativeSetLicenseBuffer(byte[] bArr);

    private static native java.lang.String nativeSetLicenseFile(java.lang.String str, android.content.res.AssetManager assetManager);

    private static native int nativeSubmitServerPermission(java.lang.String str);

    public static void IlIllIlIIl(java.lang.String str, android.content.Context context) {
        llIIlIlIIl(nativeSetLicenseFile(str, context.getAssets()), context);
        llIIlIlIIl(context);
    }

    public static void llIIlIlIIl(byte[] bArr, java.lang.String str, android.content.Context context) {
        llIIlIlIIl(nativeSetLibraryLicenseBuffer(bArr, str), context);
        llIIlIlIIl(context);
    }

    public static void llIIlIlIIl(java.lang.String str, java.lang.String str2, android.content.Context context) {
        llIIlIlIIl(nativeSetLibraryLicenseFile(str, str2, context.getAssets()), context);
        llIIlIlIIl(context);
    }

    public static com.microblink.blinkid.secured.llllllllIl llIIlIlIIl(java.lang.String str) {
        int nativeSubmitServerPermission = nativeSubmitServerPermission(str);
        int i = 0;
        boolean z = nativeSubmitServerPermission == -1;
        if (!z) {
            i = nativeSubmitServerPermission >= com.microblink.blinkid.secured.llIlIIIIIl.IlIllIlIIl(5).length ? 3 : com.microblink.blinkid.secured.llIlIIIIIl.IlIllIlIIl(5)[nativeSubmitServerPermission];
        }
        return new com.microblink.blinkid.secured.llllllllIl(z, nativeGetLease() * 1000, i);
    }

    public static void llIIlIlIIl(java.lang.String str, android.content.Context context) {
        if (str == null) {
            if (com.microblink.blinkid.recognition.RightsManager.llIIlIlIIl(com.microblink.blinkid.recognition.Right.IS_TRIAL) && llIIlIlIIl) {
                android.widget.Toast.makeText(context, "Using trial license!", 1).show();
                return;
            }
            return;
        }
        throw new com.microblink.blinkid.licence.exception.InvalidLicenceKeyException(str);
    }

    public static boolean llIIlIlIIl() {
        return nativeIsLicenceOnline();
    }

    public static void llIIlIlIIl(android.content.Context context) {
        com.microblink.blinkid.secured.IlIIlIIIll ilIIlIIIll;
        if (IlIllIlIIl != null) {
            if (!com.microblink.blinkid.recognition.RightsManager.llIIlIlIIl(com.microblink.blinkid.recognition.Right.ALLOW_PING_PROXY) && !com.microblink.blinkid.recognition.RightsManager.llIIlIlIIl(com.microblink.blinkid.recognition.Right.ALLOW_BALTAZAR_PROXY)) {
                throw new com.microblink.blinkid.licence.exception.InvalidLicenceKeyException("Microblink proxy is not enabled but proxy URL is set!");
            }
            if (!com.microblink.blinkid.recognition.RightsManager.llIIlIlIIl(com.microblink.blinkid.recognition.Right.PING_USED) && !com.microblink.blinkid.recognition.RightsManager.llIIlIlIIl(com.microblink.blinkid.recognition.Right.IS_ONLINE)) {
                throw new com.microblink.blinkid.licence.exception.InvalidLicenceKeyException("Microblink proxy URL is set but it won't be used because ping and online license check are disabled. Check your license.");
            }
        }
        com.microblink.blinkid.secured.llIIIllIlI llIIlIlIIl2 = com.microblink.blinkid.secured.llIIIllIlI.llIIlIlIIl();
        java.lang.String str = IlIllIlIIl;
        llIIlIlIIl2.llIIlIlIIl = new com.microblink.blinkid.secured.llllIIIIll(context);
        llIIlIlIIl2.IlIllIlIIl = new com.microblink.blinkid.secured.IIlIIlIIIl();
        llIIlIlIIl2.IllIIIllII = true;
        if (str != null && com.microblink.blinkid.recognition.RightsManager.llIIlIlIIl(com.microblink.blinkid.recognition.Right.ALLOW_PING_PROXY)) {
            com.microblink.blinkid.secured.IlIIIlIlII ilIIIlIlII = llIIlIlIIl2.llIIlIlIIl.llIIlIlIIl;
            if (android.webkit.URLUtil.isHttpsUrl(str)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
                if (sb.charAt(sb.length() - 1) != '/') {
                    sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
                }
                sb.append("api/v2/ping");
                ilIIIlIlII.llIIlIlIIl = sb.toString();
                ilIIIlIlII.IlIllIlIIl = sb.replace(sb.length() - 11, sb.length(), "api/v2/ping;multi").toString();
            } else {
                throw new java.lang.IllegalArgumentException("Ping proxy URL must use HTTPS protocol.");
            }
        }
        com.microblink.blinkid.secured.llllIIIIll lllliiiill = com.microblink.blinkid.secured.llIIIllIlI.llIIlIlIIl().llIIlIlIIl;
        if (lllliiiill != null) {
            lllliiiill.IlIllIlIIl();
            if (llIIlIlIIl()) {
                ilIIlIIIll = com.microblink.blinkid.secured.lllllllIll.llIIlIlIIl;
            } else {
                ilIIlIIIll = com.microblink.blinkid.secured.IlIIlIIIll.llIIlIlIIl;
            }
            ilIIlIIIll.llIIlIlIIl(IlIllIlIIl, context);
            return;
        }
        throw new java.lang.IllegalStateException("PingManager.setup wasn't called and pingRepository instance is null.");
    }
}
