package util.h.xy.cf;

/* loaded from: classes5.dex */
public abstract class b {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoSizes = 1;

    /* renamed from: ʻ, reason: contains not printable characters */
    protected java.lang.String f1092;

    /* renamed from: ˊ, reason: contains not printable characters */
    protected org.json.JSONObject f1093;

    /* renamed from: ˋ, reason: contains not printable characters */
    protected org.json.JSONObject f1094;

    /* renamed from: ˎ, reason: contains not printable characters */
    protected org.json.JSONObject f1095;

    /* renamed from: ˏ, reason: contains not printable characters */
    protected org.json.JSONObject f1096;

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected org.json.JSONObject f1097;

    /* renamed from: ᐝ */
    public abstract int mo25889() throws org.json.JSONException;

    static {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = ((i & 3) + (i | 3)) % 128;
    }

    public b(java.lang.String str) {
        this.f1092 = str;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m25900(org.json.JSONObject jSONObject) throws org.json.JSONException {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = ((i ^ 65) + ((i & 65) << 1)) % 128;
        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(util.h.xy.al.ra.f576);
        org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject(util.h.xy.al.ra.f588);
        m25893(jSONObject2);
        m25895(jSONObject3);
        int i2 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = (((i2 | 37) << 1) - (i2 ^ 37)) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public java.lang.String m25892() {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = (i + 95) % 128;
        java.lang.String str = this.f1092;
        int i2 = i + 99;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m25893(org.json.JSONObject jSONObject) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 71) << 1) - (i ^ 71);
        int i3 = i2 % 128;
        getHighSpeedVideoSizes = i3;
        if (i2 % 2 != 0) {
            this.f1095 = jSONObject;
            int i4 = (i3 & 35) + (i3 | 35);
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.f1095 = jSONObject;
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m25895(org.json.JSONObject jSONObject) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 53) + (i | 53);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            this.f1093 = jSONObject;
        } else {
            this.f1093 = jSONObject;
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public org.json.JSONObject mo25898() throws org.json.JSONException {
        int i = getHighSpeedVideoSizes + 125;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            this.f1095.has(util.h.xy.al.ra.f631);
            throw null;
        }
        if (this.f1095.has(util.h.xy.al.ra.f631) && !this.f1095.isNull(util.h.xy.al.ra.f631)) {
            int i2 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRanges = ((i2 ^ 47) + ((i2 & 47) << 1)) % 128;
            this.f1094 = this.f1095.getJSONObject(util.h.xy.al.ra.f631);
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 19) % 128;
        }
        org.json.JSONObject jSONObject = this.f1094;
        int i3 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = ((i3 ^ 61) + ((i3 & 61) << 1)) % 128;
        return jSONObject;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public org.json.JSONObject mo25896() throws org.json.JSONException {
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 53) + ((i & 53) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            if (this.f1095.has(util.h.xy.al.ra.f607) && !this.f1095.isNull(util.h.xy.al.ra.f607)) {
                int i3 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoSizes = ((i3 & 111) + (i3 | 111)) % 128;
                this.f1097 = this.f1095.getJSONObject(util.h.xy.al.ra.f607);
                int i4 = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRanges = ((i4 & 47) + (i4 | 47)) % 128;
            }
            return this.f1097;
        }
        this.f1095.has(util.h.xy.al.ra.f607);
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public org.json.JSONObject mo25894() throws org.json.JSONException {
        int i = getHighSpeedVideoFpsRanges + 109;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            if (this.f1095.has(util.h.xy.al.ra.f613) && !this.f1095.isNull(util.h.xy.al.ra.f613)) {
                int i2 = getHighSpeedVideoFpsRanges;
                int i3 = (i2 & 23) + (i2 | 23);
                getHighSpeedVideoSizes = i3 % 128;
                if (i3 % 2 != 0) {
                    this.f1096 = this.f1095.getJSONObject(util.h.xy.al.ra.f613);
                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 11) % 128;
                } else {
                    this.f1096 = this.f1095.getJSONObject(util.h.xy.al.ra.f613);
                    throw null;
                }
            }
            org.json.JSONObject jSONObject = this.f1096;
            int i4 = getHighSpeedVideoFpsRanges;
            int i5 = ((i4 | 101) << 1) - (i4 ^ 101);
            getHighSpeedVideoSizes = i5 % 128;
            if (i5 % 2 != 0) {
                return jSONObject;
            }
            throw null;
        }
        this.f1095.has(util.h.xy.al.ra.f613);
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult mo25897(java.lang.String str, util.h.xy.d.c cVar) throws org.json.JSONException {
        int i = getHighSpeedVideoSizes;
        int i2 = i + 69;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        getHighSpeedVideoFpsRanges = ((i ^ 25) + ((i & 25) << 1)) % 128;
        return null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m25899(java.lang.String str) throws org.json.JSONException, util.h.xy.d.g {
        boolean z;
        boolean z2;
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 125) % 128;
        org.json.JSONObject jSONObject = this.f1095.getJSONObject(util.h.xy.al.ra.f588);
        util.h.xy.u.mb.m27534(str, jSONObject, null);
        boolean z3 = false;
        if (this.f1095.has(util.h.xy.al.ra.f631)) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 57) % 128;
            if (this.f1095.optString(util.h.xy.al.ra.f631) != null) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 79) % 128;
                if (!this.f1095.optString(util.h.xy.al.ra.f631).isEmpty()) {
                    int i = getHighSpeedVideoSizes;
                    getHighSpeedVideoFpsRanges = ((i ^ 17) + ((i & 17) << 1)) % 128;
                    org.json.JSONObject jSONObject2 = this.f1095.getJSONObject(util.h.xy.al.ra.f631);
                    if (!jSONObject2.keys().hasNext()) {
                        throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, util.h.xy.al.ra.f618, null);
                    }
                    util.h.xy.u.mb.m27536(str, jSONObject, jSONObject2, null);
                    util.h.xy.u.mb.m27540(str, jSONObject, jSONObject2, null);
                    util.h.xy.u.mb.m27538(str, jSONObject, jSONObject2, null);
                    util.h.xy.u.mb.m27535(str, jSONObject, jSONObject2, null);
                    util.h.xy.u.mb.m27539(str, jSONObject, jSONObject2, null);
                    z = true;
                }
            }
            throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, util.h.xy.al.ra.f618, null);
        }
        z = false;
        if (!this.f1095.has(util.h.xy.al.ra.f607)) {
            z2 = false;
        } else {
            if (this.f1095.optString(util.h.xy.al.ra.f607) == null || this.f1095.optString(util.h.xy.al.ra.f607).isEmpty()) {
                throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, util.h.xy.al.ra.f568, null);
            }
            int i2 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoSizes = ((i2 & 11) + (i2 | 11)) % 128;
            org.json.JSONObject jSONObject3 = this.f1095.getJSONObject(util.h.xy.al.ra.f607);
            if (!jSONObject3.keys().hasNext()) {
                throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, util.h.xy.al.ra.f568, null);
            }
            util.h.xy.u.mb.m27533(str, jSONObject, jSONObject3, null);
            z2 = true;
        }
        if (this.f1095.has(util.h.xy.al.ra.f613)) {
            int i3 = getHighSpeedVideoSizes;
            int i4 = (i3 ^ 125) + ((i3 & 125) << 1);
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 != 0) {
                this.f1095.optString(util.h.xy.al.ra.f613);
                throw new java.lang.ArithmeticException();
            }
            if (this.f1095.optString(util.h.xy.al.ra.f613) == null || this.f1095.optString(util.h.xy.al.ra.f613).isEmpty()) {
                throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, util.h.xy.al.ra.f684, null);
            }
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 87) % 128;
            org.json.JSONObject jSONObject4 = this.f1095.getJSONObject(util.h.xy.al.ra.f613);
            if (!jSONObject4.keys().hasNext()) {
                throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.PROFILE_VALIDATION_FAILED, util.h.xy.al.ra.f684, null);
            }
            util.h.xy.u.mb.m27532(str, jSONObject, jSONObject4, null);
            z3 = true;
        }
        if (!z && !z2 && !z3) {
            throw new util.h.xy.d.g(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes.CONTACTLESS_DATA_MISSING, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_CONTACTLESS_DATA_MISSING, null);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public java.lang.String m25891() {
        java.lang.String str;
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (((i | 39) << 1) - (i ^ 39)) % 128;
        getHighSpeedVideoSizes = i2;
        org.json.JSONObject jSONObject = this.f1094;
        if (jSONObject != null) {
            int i3 = i2 + 117;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 == 0) {
                str = jSONObject.toString();
            } else {
                throw null;
            }
        } else {
            str = null;
        }
        int i4 = getHighSpeedVideoFpsRanges;
        int i5 = (i4 & 7) + (i4 | 7);
        getHighSpeedVideoSizes = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public java.lang.String m25901() {
        java.lang.String str;
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = ((i ^ 75) + ((i & 75) << 1)) % 128;
        org.json.JSONObject jSONObject = this.f1097;
        if (jSONObject != null) {
            getHighSpeedVideoSizes = ((i ^ 125) + ((i & 125) << 1)) % 128;
            str = jSONObject.toString();
        } else {
            str = null;
        }
        int i2 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = (((i2 | 31) << 1) - (i2 ^ 31)) % 128;
        return str;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public java.lang.String m25890() throws org.json.JSONException {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 5) + ((i & 5) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        java.lang.String str = null;
        if (i2 % 2 != 0) {
            org.json.JSONObject mo25894 = mo25894();
            this.f1096 = mo25894;
            if (mo25894 != null) {
                int i3 = getHighSpeedVideoFpsRanges;
                int i4 = (i3 ^ 27) + ((i3 & 27) << 1);
                getHighSpeedVideoSizes = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                str = mo25894.toString();
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 83) % 128;
            }
            int i5 = getHighSpeedVideoSizes;
            int i6 = (i5 & 93) + (i5 | 93);
            getHighSpeedVideoFpsRanges = i6 % 128;
            if (i6 % 2 == 0) {
                return str;
            }
            throw new java.lang.ArithmeticException();
        }
        this.f1096 = mo25894();
        throw null;
    }
}
