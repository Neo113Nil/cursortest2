package com.microblink.blinkid.recognition;

/* loaded from: classes.dex */
public abstract class RightsManager {
    public static java.lang.String IlIllIlIIl() {
        java.lang.String nativeGetLicenseID = nativeGetLicenseID();
        return nativeGetLicenseID == null ? "" : nativeGetLicenseID;
    }

    public static java.lang.String IllIIIllII() {
        java.lang.String nativeGetLicensee = nativeGetLicensee();
        return nativeGetLicensee == null ? "" : nativeGetLicensee;
    }

    public static boolean llIIIlllll() {
        return nativeIsLicenseOk();
    }

    public static boolean llIIlIlIIl(com.microblink.blinkid.recognition.Right right) {
        return nativeIsRightEnabled(right.llIIlIlIIl());
    }

    private static native java.lang.String[] nativeGetApplicationIDs();

    private static native java.lang.String nativeGetLicenseID();

    private static native java.lang.String nativeGetLicensee();

    private static native boolean nativeIsLicenseOk();

    private static native boolean nativeIsRightEnabled(int i);

    public static java.lang.String[] llIIlIlIIl() {
        java.lang.String[] nativeGetApplicationIDs = nativeGetApplicationIDs();
        return nativeGetApplicationIDs == null ? new java.lang.String[]{""} : nativeGetApplicationIDs;
    }
}
