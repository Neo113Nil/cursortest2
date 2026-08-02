package util.h.xy.eu;

/* loaded from: classes18.dex */
public abstract class mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 1;

    /* renamed from: ˋ, reason: contains not printable characters */
    protected util.h.xy.ey.b f2171;

    /* renamed from: ˏ, reason: contains not printable characters */
    protected util.h.xy.eu.a f2172;

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected util.h.xy.eu.a f2173;

    public int hashCode() {
        int i;
        int i2 = Camera2StreamConfigurationMap;
        int i3 = (i2 & 69) + (i2 | 69);
        getHighSpeedVideoFpsRanges = i3 % 128;
        int hashCode = m26719().hashCode();
        if (i3 % 2 == 0) {
            int m26830 = util.h.xy.fb.b.m26830(m26720().m26711().hashCode(), 120);
            i = ((hashCode & (~m26830)) | ((~hashCode) & m26830)) ^ util.h.xy.fb.b.m26830(m26717().m26711().hashCode(), 23);
        } else {
            int m268302 = util.h.xy.fb.b.m26830(m26720().m26711().hashCode(), 8);
            int i4 = (hashCode & (~m268302)) | ((~hashCode) & m268302);
            int m268303 = util.h.xy.fb.b.m26830(m26717().m26711().hashCode(), 16);
            i = (i4 & (~m268303)) | ((~i4) & m268303);
        }
        int i5 = getHighSpeedVideoFpsRanges;
        int i6 = ((i5 | 121) << 1) - (i5 ^ 121);
        Camera2StreamConfigurationMap = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        throw null;
    }

    public boolean equals(java.lang.Object obj) {
        boolean z;
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i & 101) + (i | 101)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (this != obj) {
            int i3 = (i2 & 39) + (i2 | 39);
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            if (!(obj instanceof util.h.xy.eu.mb) || !m26718((util.h.xy.eu.mb) obj)) {
                int i4 = getHighSpeedVideoFpsRanges;
                Camera2StreamConfigurationMap = ((i4 & 37) + (i4 | 37)) % 128;
                z = false;
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 105) % 128;
                return z;
            }
        }
        z = true;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 105) % 128;
        return z;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public boolean m26718(util.h.xy.eu.mb mbVar) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 59;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this != mbVar) {
            if (mbVar == null) {
                return false;
            }
            Camera2StreamConfigurationMap = (((i | 53) << 1) - (i ^ 53)) % 128;
            if (!m26719().equals(mbVar.m26719()) || !m26720().m26711().equals(mbVar.m26720().m26711())) {
                return false;
            }
            int i3 = Camera2StreamConfigurationMap + 117;
            getHighSpeedVideoFpsRanges = i3 % 128;
            boolean equals = m26717().m26711().equals(mbVar.m26717().m26711());
            if (i3 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (!equals) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public util.h.xy.eu.a m26717() {
        int i = (getHighSpeedVideoFpsRanges + 31) % 128;
        Camera2StreamConfigurationMap = i;
        util.h.xy.eu.a aVar = this.f2172;
        getHighSpeedVideoFpsRanges = ((i & 17) + (i | 17)) % 128;
        return aVar;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public util.h.xy.eu.a m26720() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i ^ 59) + ((i & 59) << 1)) % 128;
        Camera2StreamConfigurationMap = i2;
        util.h.xy.eu.a aVar = this.f2173;
        int i3 = (i2 & 63) + (i2 | 63);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            return aVar;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public util.h.xy.ey.b m26719() {
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i + 51) % 128;
        util.h.xy.ey.b bVar = this.f2171;
        Camera2StreamConfigurationMap = ((i ^ 77) + ((i & 77) << 1)) % 128;
        return bVar;
    }
}
