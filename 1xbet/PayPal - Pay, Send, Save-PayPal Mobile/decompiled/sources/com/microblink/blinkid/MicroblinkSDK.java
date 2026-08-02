package com.microblink.blinkid;

/* loaded from: classes9.dex */
public final class MicroblinkSDK {
    private static com.microblink.blinkid.intent.IntentDataTransferMode Camera2StreamConfigurationMap;
    private static android.content.Context getHighResolutionOutputSizeshNQ4ISI;

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        Camera2StreamConfigurationMap = com.microblink.blinkid.intent.IntentDataTransferMode.PERSISTED_OPTIMISED;
    }

    private static native void applicationContextNativeInitialize(android.content.Context context);

    public static android.content.Context getApplicationContext() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    private static void getHighSpeedVideoFpsRanges(android.content.Context context) {
        if (!com.microblink.blinkid.hardware.MicroblinkDeviceManager.IllIIIllII) {
            throw new com.microblink.blinkid.licence.exception.InvalidLicenceKeyException("Incompatible processor. This device is not supported!");
        }
        applicationContextNativeInitialize(context);
        getHighResolutionOutputSizeshNQ4ISI = context;
        if (com.microblink.blinkid.secured.IlIlIlllIl.IllIIIIllI == null) {
            com.microblink.blinkid.secured.IlIlIlllIl.IllIIIIllI = new com.microblink.blinkid.secured.IlIlIlllIl(context.getApplicationContext());
        }
    }

    public static com.microblink.blinkid.intent.IntentDataTransferMode getIntentDataTransferMode() {
        return Camera2StreamConfigurationMap;
    }

    public static java.lang.String getNativeLibraryVersionString() {
        return com.microblink.blinkid.settings.NativeLibraryInfo.getNativeBuildVersion();
    }

    public static void setIntentDataTransferMode(com.microblink.blinkid.intent.IntentDataTransferMode intentDataTransferMode) {
        Camera2StreamConfigurationMap = intentDataTransferMode;
    }

    public static void setLicenseBuffer(byte[] bArr, android.content.Context context) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("License buffer cannot be null");
        }
        getHighSpeedVideoFpsRanges(context);
        com.microblink.blinkid.licence.LicenceManager.llIIlIlIIl(bArr, context);
    }

    public static void setLicenseFile(java.lang.String str, android.content.Context context) {
        if (str == null) {
            throw new java.lang.NullPointerException("License file path cannot be null");
        }
        if (context == null) {
            throw new java.lang.NullPointerException("Context cannot be null");
        }
        getHighSpeedVideoFpsRanges(context);
        com.microblink.blinkid.licence.LicenceManager.IlIllIlIIl(str, context);
    }

    public static void setLicenseKey(java.lang.String str, android.content.Context context) {
        if (str == null) {
            throw new java.lang.NullPointerException("License buffer cannot be null");
        }
        getHighSpeedVideoFpsRanges(context);
        com.microblink.blinkid.licence.LicenceManager.IllIIIllII(str, context);
    }

    public static void setMicroblinkProxyUrl(java.lang.String str) {
        if (!android.webkit.URLUtil.isHttpsUrl(str)) {
            throw new java.lang.IllegalArgumentException("Microblink proxy URL must use HTTPS protocol.");
        }
        com.microblink.blinkid.licence.LicenceManager.IlIllIlIIl = str;
    }

    public static void setShowTrialLicenseWarning(boolean z) {
        com.microblink.blinkid.licence.LicenceManager.llIIlIlIIl = z;
    }

    public static void setLicenseBuffer(byte[] bArr, java.lang.String str, android.content.Context context) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("License buffer cannot be null");
        }
        if (str != null) {
            getHighSpeedVideoFpsRanges(context);
            com.microblink.blinkid.licence.LicenceManager.llIIlIlIIl(bArr, str, context);
            return;
        }
        throw new java.lang.NullPointerException("Licensee cannot be null");
    }

    public static void setLicenseKey(java.lang.String str, java.lang.String str2, android.content.Context context) {
        if (str == null) {
            throw new java.lang.NullPointerException("License buffer cannot be null");
        }
        if (str2 != null) {
            getHighSpeedVideoFpsRanges(context);
            com.microblink.blinkid.licence.LicenceManager.IlIllIlIIl(str, str2, context);
            return;
        }
        throw new java.lang.NullPointerException("Licensee cannot be null");
    }

    public static void setLicenseFile(java.lang.String str, java.lang.String str2, android.content.Context context) {
        if (str == null) {
            throw new java.lang.NullPointerException("License file path cannot be null");
        }
        if (str2 == null) {
            throw new java.lang.NullPointerException("Licensee cannot be null");
        }
        if (context != null) {
            getHighSpeedVideoFpsRanges(context);
            com.microblink.blinkid.licence.LicenceManager.llIIlIlIIl(str, str2, context);
            return;
        }
        throw new java.lang.NullPointerException("Context cannot be null");
    }
}
