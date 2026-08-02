package util.h.xy.bk;

/* loaded from: classes18.dex */
public final class ra<T> {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private T getHighResolutionOutputSizeshNQ4ISI;

    public ra(T t) {
        this.getHighResolutionOutputSizeshNQ4ISI = t;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final T m25508() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (((i | 101) << 1) - (i ^ 101)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        T t = this.getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (i2 + 7) % 128;
        return t;
    }
}
