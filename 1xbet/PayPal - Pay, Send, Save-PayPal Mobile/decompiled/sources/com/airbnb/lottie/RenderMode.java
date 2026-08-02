package com.airbnb.lottie;

/* loaded from: classes.dex */
public enum RenderMode {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* renamed from: com.airbnb.lottie.RenderMode$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[com.airbnb.lottie.RenderMode.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[com.airbnb.lottie.RenderMode.HARDWARE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[com.airbnb.lottie.RenderMode.SOFTWARE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[com.airbnb.lottie.RenderMode.AUTOMATIC.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public final boolean useSoftwareRendering(int i, boolean z, int i2) {
        int i3 = com.airbnb.lottie.RenderMode.AnonymousClass1.Camera2StreamConfigurationMap[ordinal()];
        if (i3 == 1) {
            return false;
        }
        if (i3 != 2) {
            return (z && i < 28) || i2 > 4 || i <= 25;
        }
        return true;
    }
}
