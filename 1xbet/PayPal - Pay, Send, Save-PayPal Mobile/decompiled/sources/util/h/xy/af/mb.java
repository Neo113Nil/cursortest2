package util.h.xy.af;

/* loaded from: classes5.dex */
public class mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static final util.h.xy.af.mb getHighSpeedVideoFpsRangesFor = new util.h.xy.af.mb();
    private static int getHighSpeedVideoSizes = 1;
    private int getHighResolutionOutputSizeshNQ4ISI = -91;

    static {
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (((i | 39) << 1) - (i ^ 39)) % 128;
    }

    private mb() {
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.af.mb m24551() {
        util.h.xy.af.mb mbVar;
        synchronized (util.h.xy.af.mb.class) {
            int i = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = ((i & 25) + (i | 25)) % 128;
            mbVar = getHighSpeedVideoFpsRangesFor;
            int i2 = (i & 3) + (i | 3);
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.NullPointerException();
            }
        }
        return mbVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m24555(int i) {
        int i2 = (Camera2StreamConfigurationMap + 87) % 128;
        getHighSpeedVideoSizes = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        int i3 = (i2 ^ 107) + ((i2 & 107) << 1);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public int m24554() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (((i | 117) << 1) - (i ^ 117)) % 128;
        getHighSpeedVideoSizes = i2;
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i2 ^ 37) + ((i2 & 37) << 1)) % 128;
        return i3;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m24552() {
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (((i | 39) << 1) - (i ^ 39)) % 128;
        this.getHighResolutionOutputSizeshNQ4ISI = -91;
        int i2 = i + 101;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public int m24553(int i) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 29) % 128;
        if (i == util.h.xy.v.ma.f2598.m27668()) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 53) % 128;
            return 804;
        }
        if (i == util.h.xy.v.ma.f2593.m27668()) {
            int i2 = getHighSpeedVideoSizes + 47;
            Camera2StreamConfigurationMap = i2 % 128;
            return i2 % 2 != 0 ? 4992 : 805;
        }
        if (i == util.h.xy.v.ma.f2565.m27668()) {
            int i3 = getHighSpeedVideoSizes;
            Camera2StreamConfigurationMap = (i3 + 9) % 128;
            int i4 = (i3 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i3 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 == 0) {
                return 802;
            }
            throw null;
        }
        if (i == util.h.xy.v.ma.f2557.m27668()) {
            return com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP;
        }
        if (i == util.h.xy.v.ma.f2597.m27668()) {
            int i5 = (Camera2StreamConfigurationMap + 93) % 128;
            getHighSpeedVideoSizes = i5;
            Camera2StreamConfigurationMap = (i5 + 93) % 128;
            return com.visa.cbp.sdk.facade.data.Constants.SUPER_USER_PERMISSION_DETECTED;
        }
        if (i == util.h.xy.v.ma.f2572.m27668()) {
            int i6 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = (((i6 | 49) << 1) - (i6 ^ 49)) % 128;
            return 111;
        }
        if (i != util.h.xy.v.ma.f2584.m27668()) {
            return -91;
        }
        int i7 = Camera2StreamConfigurationMap;
        int i8 = (((i7 | 43) << 1) - (i7 ^ 43)) % 128;
        getHighSpeedVideoSizes = i8;
        Camera2StreamConfigurationMap = (((i8 | 95) << 1) - (i8 ^ 95)) % 128;
        return com.visa.cbp.sdk.facade.data.Constants.HOOK_DETECTED;
    }
}
