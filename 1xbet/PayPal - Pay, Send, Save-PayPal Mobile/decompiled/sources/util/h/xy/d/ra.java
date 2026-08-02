package util.h.xy.d;

/* loaded from: classes5.dex */
public final class ra {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private final util.h.xy.d.rc Camera2StreamConfigurationMap;
    private final util.h.xy.d.b getHighSpeedVideoSizes;

    public ra(util.h.xy.d.b bVar, util.h.xy.d.rc rcVar) {
        this.getHighSpeedVideoSizes = bVar;
        this.Camera2StreamConfigurationMap = rcVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.d.b m26219() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (((i | 17) << 1) - (i ^ 17)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        util.h.xy.d.b bVar = this.getHighSpeedVideoSizes;
        int i3 = i2 + 1;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            return bVar;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final int m26222() {
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i = ~((identityHashCode ^ (-328850108)) | (identityHashCode & (-328850108)));
        int i2 = (i ^ 301992578) | (i & 301992578);
        int i3 = ~((-505818759) | identityHashCode);
        int i4 = -(-(((i2 ^ i3) | (i2 & i3)) * (-880)));
        int i5 = ~identityHashCode;
        int i6 = ~(((-328850108) ^ i5) | (i5 & (-328850108)));
        int i7 = ((((i4 | 903862449) << 1) - (i4 ^ 903862449)) - (~(-(-((((i6 ^ 505818758) | (i6 & 505818758)) | (~(identityHashCode | 328850107))) * (-880)))))) - 1;
        int i8 = (~((identityHashCode ^ 328850107) | (identityHashCode & 328850107))) * 880;
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i9 = ~((identityHashCode2 ^ (-1076893714)) | (identityHashCode2 & (-1076893714)));
        int i10 = -(-(((i9 ^ 42664928) | (i9 & 42664928)) * (-756)));
        int i11 = (i10 ^ (-756452746)) + ((i10 & (-756452746)) << 1);
        int i12 = ~identityHashCode2;
        int i13 = ((i12 ^ (-1076893714)) | (i12 & (-1076893714))) * 756;
        if (((i7 | i8) << 1) - (i8 ^ i7) <= (i11 ^ i13) + ((i13 & i11) << 1)) {
            this.getHighSpeedVideoSizes.m26143();
            throw null;
        }
        int m26143 = this.getHighSpeedVideoSizes.m26143();
        int i14 = getHighSpeedVideoFpsRanges + 75;
        getHighSpeedVideoFpsRangesFor = i14 % 128;
        if (i14 % 2 == 0) {
            return m26143;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final int m26224() {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 87) % 128;
        int m26139 = this.getHighSpeedVideoSizes.m26139();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 95) % 128;
        return m26139;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState m26221() {
        int i = getHighSpeedVideoFpsRanges + 37;
        getHighSpeedVideoFpsRangesFor = i % 128;
        util.h.xy.d.b bVar = this.getHighSpeedVideoSizes;
        if (i % 2 == 0) {
            return bVar.m26136();
        }
        bVar.m26136();
        throw null;
    }

    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.d.rc m26220() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 35;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        util.h.xy.d.rc rcVar = this.Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (i + 99) % 128;
        return rcVar;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final util.h.xy.d.mg m26223() {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 33) % 128;
        util.h.xy.d.mg m26133 = this.getHighSpeedVideoSizes.m26133();
        int i = getHighSpeedVideoFpsRangesFor + 83;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            return m26133;
        }
        throw null;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final int m26225() {
        int i = getHighSpeedVideoFpsRanges + 45;
        getHighSpeedVideoFpsRangesFor = i % 128;
        int m26134 = this.getHighSpeedVideoSizes.m26134();
        if (i % 2 == 0) {
            return m26134;
        }
        throw new java.lang.ArithmeticException();
    }
}
