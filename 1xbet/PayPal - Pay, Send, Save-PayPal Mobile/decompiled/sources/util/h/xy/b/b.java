package util.h.xy.b;

/* loaded from: classes5.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static int m25285(int i, int i2) {
        int i3 = ~((1211810059 ^ i) | (i & 1211810059));
        int i4 = (((i3 ^ (-1820312908)) | (i3 & (-1820312908))) * (-140)) - 1423455955;
        int i5 = (~(((-608502849) ^ i) | (i & (-608502849)))) * 70;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        int i7 = ~(((-1685521476) ^ i) | (i & (-1685521476)));
        int i8 = ((i7 ^ (-743294281)) | (i7 & (-743294281))) * 70;
        int i9 = ~i;
        int i10 = (2104794769 & i9) | (i9 ^ 2104794769);
        int i11 = ~(((-1696360292) ^ i10) | (i10 & (-1696360292)));
        int i12 = (i9 ^ 1696360291) | (i9 & 1696360291);
        int i13 = ~(((-2104794770) ^ i12) | (i12 & (-2104794770)));
        int i14 = (((i11 ^ i13) | (i11 & i13)) * (-184)) - 173325606;
        int i15 = ~i10;
        int i16 = (i15 ^ (-2105343988)) | (i15 & (-2105343988));
        int i17 = ~i12;
        int i18 = -(-(((i17 ^ i16) | (i17 & i16)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
        return (i6 ^ i8) + ((i8 & i6) << 1) > (((i14 | i18) << 1) - (i18 ^ i14)) + 1503374992 ? (i ^ i2) + ((i & i2) << 1) : i / i2;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static int m25286(int i, int i2) {
        int i3 = Camera2StreamConfigurationMap;
        int i4 = (((i3 | 55) << 1) - (i3 ^ 55)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i4;
        Camera2StreamConfigurationMap = ((i4 & 61) + (i4 | 61)) % 128;
        return i % i2;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static int m25284(int i, int i2, int i3) {
        int i4 = i3 * i;
        int i5 = ~i2;
        int i6 = ~i4;
        int i7 = (((i2 * (-495)) + (i4 * (-495))) - (~(((~(i5 | i6)) | (~((i5 & i) | (i5 ^ i)))) * 992))) - 1;
        int i8 = ~((i6 ^ i5) | (i6 & i5));
        int i9 = ~(i5 | i);
        int i10 = ((~(i2 | (~i) | i4)) | (i9 ^ i8) | (i9 & i8)) * (-496);
        int i11 = (i7 & i10) + (i10 | i7);
        int i12 = ((i ^ i4) | (i & i4)) * 496;
        int i13 = Camera2StreamConfigurationMap + 83;
        getHighResolutionOutputSizeshNQ4ISI = i13 % 128;
        if (i13 % 2 != 0) {
            return ((i11 | i12) << 1) - (i12 ^ i11);
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static int m25283(int i, int i2) {
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i3 & 79) + (i3 | 79)) % 128;
        int i4 = (i2 * (-419)) + (i * 421);
        int i5 = ~i;
        int i6 = -(-(i5 * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
        int i7 = ~i2;
        int i8 = (((i4 ^ i6) + ((i4 & i6) << 1)) - (~(-(-(((i ^ i7) | (i & i7)) * (-420)))))) - 1;
        int i9 = ((~((i ^ i5) | (i & i5))) | (~((i7 & i5) | (i5 ^ i7)))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        Camera2StreamConfigurationMap = (((i3 | 37) << 1) - (i3 ^ 37)) % 128;
        return ((~i10) + (i10 << 1)) % i2;
    }
}
