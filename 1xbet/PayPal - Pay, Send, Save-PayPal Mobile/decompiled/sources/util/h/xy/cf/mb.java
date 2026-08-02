package util.h.xy.cf;

/* loaded from: classes5.dex */
public class mb extends util.h.xy.cf.b {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 81) % 128;

    public mb(java.lang.String str) {
        super(str);
    }

    @Override // util.h.xy.cf.b
    /* renamed from: ˎ */
    public org.json.JSONObject mo25896() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (((i | 29) << 1) - (i ^ 29)) % 128;
        Camera2StreamConfigurationMap = i2;
        getHighSpeedVideoFpsRangesFor = (i2 + 7) % 128;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    @Override // util.h.xy.cf.b
    /* renamed from: ˋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public org.json.JSONObject mo25894() throws org.json.JSONException {
        int i;
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = ((i2 | 81) << 1) - (i2 ^ 81);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            this.f1095.has(util.h.xy.al.ra.f613);
            throw null;
        }
        if (this.f1095.has(util.h.xy.al.ra.f613)) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 31) % 128;
            if (!this.f1095.isNull(util.h.xy.al.ra.f613)) {
                int i4 = getHighSpeedVideoFpsRangesFor + 91;
                Camera2StreamConfigurationMap = i4 % 128;
                if (i4 % 2 == 0) {
                    this.f1096 = this.f1095.getJSONObject(util.h.xy.al.ra.f613);
                    throw new java.lang.ArithmeticException();
                }
                this.f1096 = this.f1095.getJSONObject(util.h.xy.al.ra.f613);
                org.json.JSONObject jSONObject = this.f1096;
                int i5 = Camera2StreamConfigurationMap;
                i = (i5 & 71) + (i5 | 71);
                getHighSpeedVideoFpsRangesFor = i % 128;
                if (i % 2 != 0) {
                    return jSONObject;
                }
                throw null;
            }
        }
        if (this.f1095.has(util.h.xy.al.ra.f685) && !this.f1095.isNull(util.h.xy.al.ra.f685)) {
            int i6 = getHighSpeedVideoFpsRangesFor + 63;
            Camera2StreamConfigurationMap = i6 % 128;
            if (i6 % 2 == 0) {
                this.f1096 = this.f1095.getJSONObject(util.h.xy.al.ra.f685);
                throw null;
            }
            this.f1096 = this.f1095.getJSONObject(util.h.xy.al.ra.f685);
        }
        org.json.JSONObject jSONObject2 = this.f1096;
        int i52 = Camera2StreamConfigurationMap;
        i = (i52 & 71) + (i52 | 71);
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
        }
    }

    @Override // util.h.xy.cf.b
    /* renamed from: ᐝ */
    public int mo25889() throws org.json.JSONException {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (((i | 99) << 1) - (i ^ 99)) % 128;
        int i2 = 2;
        if (this.f1095.getJSONObject(util.h.xy.al.ra.f588).optString(util.h.xy.al.ra.f832, util.h.xy.al.ra.f515).equalsIgnoreCase(util.h.xy.al.ra.f515)) {
            int i3 = Camera2StreamConfigurationMap;
            int i4 = (i3 ^ 77) + ((i3 & 77) << 1);
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            return i4 % 2 != 0 ? util.h.xy.ar.b.m25083(getHighResolutionOutputSizeshNQ4ISI()[1], 0) : util.h.xy.ar.b.m25083(getHighResolutionOutputSizeshNQ4ISI()[0], 1);
        }
        if (this.f1095.has(util.h.xy.al.ra.f631)) {
            int m25083 = util.h.xy.ar.b.m25083(getHighResolutionOutputSizeshNQ4ISI()[0], 1);
            if (this.f1095.getJSONObject(util.h.xy.al.ra.f631).optString(util.h.xy.s.md.f2394, util.h.xy.al.ra.f690).equalsIgnoreCase(util.h.xy.al.ra.f690)) {
                int i5 = getHighSpeedVideoFpsRangesFor;
                Camera2StreamConfigurationMap = (i5 + 111) % 128;
                Camera2StreamConfigurationMap = ((i5 & 45) + (i5 | 45)) % 128;
            } else {
                i2 = m25083;
            }
            int i6 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = ((i6 & 23) + (i6 | 23)) % 128;
            return i2;
        }
        if (!this.f1095.has(util.h.xy.al.ra.f613)) {
            return 255;
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 83) % 128;
        if (!this.f1095.getJSONObject(util.h.xy.al.ra.f613).optString(util.h.xy.s.md.f2394, util.h.xy.al.ra.f690).equalsIgnoreCase(util.h.xy.al.ra.f690)) {
            return 255;
        }
        int i7 = getHighSpeedVideoFpsRangesFor;
        int i8 = (i7 ^ 45) + ((i7 & 45) << 1);
        Camera2StreamConfigurationMap = i8 % 128;
        return i8 % 2 == 0 ? 3 : 2;
    }

    private byte[] getHighResolutionOutputSizeshNQ4ISI() throws org.json.JSONException {
        byte[] m25076 = util.h.xy.ar.b.m25076(this.f1095.getJSONObject(util.h.xy.al.ra.f631).getJSONObject(util.h.xy.s.ma.f2350).getString(util.h.xy.s.ma.f2353));
        util.h.xy.aq.ra m25039 = new util.h.xy.aq.mb().m25046(m25076, 0, m25076.length).m25039(new util.h.xy.aq.b(-126));
        byte[] bArr = null;
        if (m25039 != null) {
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = (i & 93) + (i | 93);
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                int length = m25039.m25047().length;
                bArr = m25039.m25047();
            } else {
                int length2 = m25039.m25047().length;
                m25039.m25047();
                throw null;
            }
        }
        util.h.xy.ar.b.m25074(bArr);
        if (bArr == null) {
            throw new org.json.JSONException(util.h.xy.al.ra.f667);
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 103) % 128;
        return bArr;
    }
}
