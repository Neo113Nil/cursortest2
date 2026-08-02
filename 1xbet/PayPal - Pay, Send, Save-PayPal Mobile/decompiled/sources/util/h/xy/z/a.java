package util.h.xy.z;

/* loaded from: classes5.dex */
public final class a {
    private static int Camera2StreamConfigurationMap = 15;
    private static util.h.xy.z.a getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRangesFor;
    private android.content.Context getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoSizes = null;

    static {
        int i = 15 % 2;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.z.a m27702(android.content.Context context) {
        util.h.xy.z.a aVar;
        synchronized (util.h.xy.z.a.class) {
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = (i & 59) + (i | 59);
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                if (getHighResolutionOutputSizeshNQ4ISI == null) {
                    getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.z.a(context);
                    int i3 = getHighSpeedVideoFpsRangesFor + 101;
                    Camera2StreamConfigurationMap = i3 % 128;
                    int i4 = i3 % 2;
                }
                aVar = getHighResolutionOutputSizeshNQ4ISI;
            } else {
                throw null;
            }
        }
        return aVar;
    }

    private a(android.content.Context context) {
        this.getHighSpeedVideoFpsRanges = context;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final boolean m27704() {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 119) % 128;
        boolean m25236 = util.h.xy.av.ra.m25236(this.getHighSpeedVideoFpsRanges);
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i & 57) + (i | 57)) % 128;
        return m25236;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m27707(byte[] bArr) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i ^ 69) + ((i & 69) << 1)) % 128;
        util.h.xy.av.ra.m25239(this.getHighSpeedVideoFpsRanges, util.h.xy.al.ra.f550, util.h.xy.al.rb.m25016(bArr));
        int i2 = Camera2StreamConfigurationMap + 73;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m27703() {
        int i = getHighSpeedVideoFpsRangesFor + 29;
        Camera2StreamConfigurationMap = i % 128;
        java.lang.String m25238 = util.h.xy.av.ra.m25238(this.getHighSpeedVideoFpsRanges);
        if (i % 2 != 0) {
            return util.h.xy.al.rb.m25017(m25238);
        }
        util.h.xy.al.rb.m25017(m25238);
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m27706() {
        synchronized (this) {
            int i = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = ((i & 117) + (i | 117)) % 128;
            this.getHighSpeedVideoSizes = null;
            util.h.xy.av.ra.m25235(this.getHighSpeedVideoFpsRanges, util.h.xy.al.ra.f550);
            getHighResolutionOutputSizeshNQ4ISI = null;
            int i2 = getHighSpeedVideoFpsRangesFor;
            int i3 = (i2 ^ 101) + ((i2 & 101) << 1);
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m27705() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i + 57) % 128;
        int i2 = i + 105;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        byte[] bArr = this.getHighSpeedVideoSizes;
        boolean z = bArr != null;
        int i3 = i + 9;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (z) {
            Camera2StreamConfigurationMap = (i + 31) % 128;
            return bArr;
        }
        if (!m27704()) {
            int i4 = getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap = ((i4 ^ 117) + ((i4 & 117) << 1)) % 128;
            m27707(new byte[]{0, 0});
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 3) % 128;
        }
        byte[] bArr2 = new byte[0];
        this.getHighSpeedVideoSizes = bArr2;
        int i5 = Camera2StreamConfigurationMap;
        int i6 = ((i5 | 61) << 1) - (i5 ^ 61);
        getHighSpeedVideoFpsRangesFor = i6 % 128;
        if (i6 % 2 == 0) {
            return bArr2;
        }
        throw null;
    }
}
