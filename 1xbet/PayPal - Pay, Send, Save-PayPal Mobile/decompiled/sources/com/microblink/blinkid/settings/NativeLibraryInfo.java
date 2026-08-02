package com.microblink.blinkid.settings;

/* loaded from: classes10.dex */
public class NativeLibraryInfo {
    public final long llIIlIlIIl;

    static {
        com.microblink.blinkid.secured.lIIllllIIl.IlIllIlIIl();
        com.microblink.blinkid.secured.lIIllllIIl.IlIllIlIIl();
    }

    public NativeLibraryInfo(long j) {
        this.llIIlIlIIl = j;
    }

    public static native java.lang.String getNativeBuildVersion();

    public static native boolean isProtectionEnabled();

    private static native void nativeDestruct(long j);

    private static native java.lang.String nativeGetErrorList(long j);

    private static native boolean nativeIsLibrarySuccessfullyInitialized(long j);

    private static native int nativeObtainProductId();

    public final boolean IlIllIlIIl() {
        return nativeIsLibrarySuccessfullyInitialized(this.llIIlIlIIl);
    }

    public final void finalize() {
        super.finalize();
        long j = this.llIIlIlIIl;
        if (j != 0) {
            nativeDestruct(j);
        }
    }

    public final java.lang.String llIIlIlIIl() {
        java.lang.String nativeGetErrorList = nativeGetErrorList(this.llIIlIlIIl);
        return nativeGetErrorList == null ? "" : nativeGetErrorList;
    }

    public static com.microblink.blinkid.secured.IIlIIllIII IllIIIllII() {
        return new com.microblink.blinkid.secured.IIlIIllIII(getNativeBuildVersion(), com.microblink.blinkid.secured.llIlIIIIIl.IlIllIlIIl(8)[nativeObtainProductId()]);
    }
}
