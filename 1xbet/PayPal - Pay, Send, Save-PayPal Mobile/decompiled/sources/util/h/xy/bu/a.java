package util.h.xy.bu;

/* loaded from: classes18.dex */
public final class a extends com.gemalto.mfs.mwsdk.payment.CustomConfiguration {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges;
    private final long getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;
    private final long getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private final int getInputSizeshNQ4ISI;
    private final int getOutputMinFrameDuration;

    public a(int i, int i2, boolean z, int i3, long j, long j2, boolean z2) {
        if (i2 > 300 || i2 <= 0) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f508);
        }
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException(util.h.xy.al.ra.f513);
        }
        if (i3 > 50) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(util.h.xy.al.ra.f483);
            sb.append(50);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getOutputMinFrameDuration = i;
        this.getInputSizeshNQ4ISI = i2;
        this.getHighSpeedVideoSizes = z;
        this.getInputFormats = i3;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoSizesFor = j2;
        this.getHighSpeedVideoFpsRangesFor = z2;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final int m25634() {
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i + 61) % 128;
        int i2 = this.getOutputMinFrameDuration;
        Camera2StreamConfigurationMap = (((i | 95) << 1) - (i ^ 95)) % 128;
        return i2;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final int m25633() {
        int i = (getHighSpeedVideoFpsRanges + 113) % 128;
        Camera2StreamConfigurationMap = i;
        int i2 = this.getInputSizeshNQ4ISI;
        int i3 = (i & 9) + (i | 9);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final boolean m25635() {
        int i = Camera2StreamConfigurationMap + 87;
        int i2 = i % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (i % 2 != 0) {
            throw null;
        }
        boolean z = this.getHighSpeedVideoSizes;
        int i3 = i2 + 11;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final int m25636() {
        int i = getHighSpeedVideoFpsRanges + 69;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return this.getInputFormats;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final long m25637() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 29) + ((i & 29) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        long j = this.getHighResolutionOutputSizeshNQ4ISI;
        int i3 = (i ^ 61) + ((i & 61) << 1);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            return j;
        }
        throw null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final long m25631() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 89) + ((i & 89) << 1);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        long j = this.getHighSpeedVideoSizesFor;
        int i4 = i3 + 113;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            return j;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final boolean m25632() {
        int i = (Camera2StreamConfigurationMap + 83) % 128;
        getHighSpeedVideoFpsRanges = i;
        boolean z = this.getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i + 11) % 128;
        return z;
    }
}
