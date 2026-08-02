package com.microblink.blinkid.hardware;

/* loaded from: classes10.dex */
public class HardwareInfo {
    static {
        com.microblink.blinkid.secured.lIIllllIIl.IlIllIlIIl();
    }

    public static long allocatedMLSize() {
        return nativeAllocatedSize();
    }

    public static long compactMLNativeMemory() {
        return doCompactNativeMemory();
    }

    private static native long doCompactNativeMemory();

    public static java.lang.String getHardwareInfo() {
        return hardwareInfoNativeGet();
    }

    private static native java.lang.String hardwareInfoNativeGet();

    private static native long nativeAllocatedSize();
}
