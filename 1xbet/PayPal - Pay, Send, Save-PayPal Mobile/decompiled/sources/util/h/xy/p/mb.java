package util.h.xy.p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class mb {
    private static char[] Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static int getHighSpeedVideoSizesFor;
    private static boolean getInputFormats;
    private static boolean getInputSizeshNQ4ISI;
    private static final /* synthetic */ util.h.xy.p.mb[] getOutputFormats;
    private static final java.lang.String getOutputMinFrameDuration;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.p.mb f2292;

    private mb(java.lang.String str) {
    }

    public static util.h.xy.p.mb valueOf(java.lang.String str) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 107) % 128;
        util.h.xy.p.mb mbVar = (util.h.xy.p.mb) java.lang.Enum.valueOf(util.h.xy.p.mb.class, str);
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 117) % 128;
        return mbVar;
    }

    public static util.h.xy.p.mb[] values() {
        int i = getHighSpeedVideoFpsRanges + 5;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        util.h.xy.p.mb[] mbVarArr = (util.h.xy.p.mb[]) getOutputFormats.clone();
        int i2 = getHighSpeedVideoFpsRangesFor + 27;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return mbVarArr;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        util.h.xy.p.mb[] mbVarArr;
        getHighResolutionOutputSizeshNQ4ISI();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(android.graphics.Color.blue(0) + 127, "\u0094\u0087\u0090\u0093\u0092\u0091\u0090\u008f", objArr);
        util.h.xy.p.mb mbVar = new util.h.xy.p.mb(((java.lang.String) objArr[0]).intern());
        f2292 = mbVar;
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 1;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            mbVarArr = new util.h.xy.p.mb[0];
            mbVarArr[0] = mbVar;
        } else {
            mbVarArr = new util.h.xy.p.mb[]{mbVar};
        }
        getOutputFormats = mbVarArr;
        getOutputMinFrameDuration = "mb";
        getHighSpeedVideoFpsRanges = (i + 25) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m27045() {
        try {
            for (java.lang.String str : util.h.xy.k.b.m26919()) {
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails> m26209 = new util.h.xy.d.md(str).m26209();
                if (m26209.isSuccessful() && m26209.getResult() != null) {
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 67) % 128;
                    java.lang.String scheme = m26209.getResult().getScheme();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, "\u0088\u0086\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
                    if (scheme.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                        util.h.xy.f.b bVar = util.h.xy.f.b.f2201;
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(128 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u0088\u0086\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
                        bVar.m26760(str, ((java.lang.String) objArr2[0]).intern(), com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 23) % 128;
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
        try {
            java.lang.String m26922 = util.h.xy.k.b.m26922(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
            if (m26922 == null || m26922.length() <= 0) {
                return;
            }
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<com.gemalto.mfs.mwsdk.dcm.DigitalizedCardDetails> m262092 = new util.h.xy.d.md(m26922).m26209();
            if (m262092.isSuccessful()) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 65) % 128;
                if (m262092.getResult() != null) {
                    int i = getHighSpeedVideoFpsRangesFor + 27;
                    getHighSpeedVideoFpsRanges = i % 128;
                    if (i % 2 != 0) {
                        java.lang.String scheme2 = m262092.getResult().getScheme();
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(97 << android.text.TextUtils.lastIndexOf("", (char) 6, 0, 0), "\u0088\u0086\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
                        if (!scheme2.equalsIgnoreCase(((java.lang.String) objArr3[0]).intern())) {
                            return;
                        }
                    } else {
                        java.lang.String scheme3 = m262092.getResult().getScheme();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "\u0088\u0086\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr4);
                        if (!scheme3.equalsIgnoreCase(((java.lang.String) objArr4[0]).intern())) {
                            return;
                        }
                    }
                    util.h.xy.f.b.f2201.m26752(m26922, false);
                }
            }
        } catch (java.lang.Exception unused2) {
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final boolean m27042() {
        try {
            java.lang.String m26922 = util.h.xy.k.b.m26922(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
            if (m26922 == null) {
                return false;
            }
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 25) % 128;
            if (m26922.length() <= 0) {
                return false;
            }
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 103) % 128;
            java.lang.String m26921 = util.h.xy.k.b.m26921(m26922, util.h.xy.d.ma.f1140);
            if (m26921 == null) {
                return false;
            }
            int i = getHighSpeedVideoFpsRanges + 61;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            if (m26921.isEmpty()) {
                return false;
            }
            return new org.json.JSONObject(m26921).optBoolean(util.h.xy.s.ma.f2348);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException | org.json.JSONException unused) {
            return false;
        }
    }

    private static void getHighSpeedVideoFpsRanges(int i, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = Camera2StreamConfigurationMap;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getHighSpeedVideoSizesFor);
        if (!getInputFormats) {
            if (!getInputSizeshNQ4ISI) {
                throw null;
            }
            throw null;
        }
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 21) % 128;
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
            mdVar.f2643++;
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 65) % 128;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final boolean m27041() {
        java.lang.String m26921;
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 37) % 128;
        try {
            java.lang.String m26922 = util.h.xy.k.b.m26922(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
            if (m26922 != null && m26922.length() > 0 && (m26921 = util.h.xy.k.b.m26921(m26922, util.h.xy.d.ma.f1140)) != null && !m26921.isEmpty()) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(m26921);
                if (!jSONObject.optBoolean(util.h.xy.s.ma.f2348)) {
                    if (jSONObject.has(util.h.xy.s.ma.f2347)) {
                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 69) % 128;
                        java.lang.String string = jSONObject.getString(util.h.xy.s.ma.f2347);
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(127 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), "\u0085\u0086\u008a\u0089", objArr);
                        if (string.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                            return true;
                        }
                    }
                } else {
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 85) % 128;
                    return false;
                }
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException | org.json.JSONException unused) {
        }
        return false;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final boolean m27044() {
        java.lang.String m26921;
        try {
            java.lang.String m26922 = util.h.xy.k.b.m26922(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
            if (m26922 != null && m26922.length() > 0 && (m26921 = util.h.xy.k.b.m26921(m26922, util.h.xy.d.ma.f1140)) != null) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 49) % 128;
                if (!m26921.isEmpty()) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(m26921);
                    if (jSONObject.has(util.h.xy.s.ma.f2347)) {
                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 9) % 128;
                        java.lang.String string = jSONObject.getString(util.h.xy.s.ma.f2347);
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges(127 - android.text.TextUtils.indexOf("", ""), "\u0082\u0083\u008c\u008b", objArr);
                        if (string.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                            int i = getHighSpeedVideoFpsRanges + 71;
                            int i2 = i % 128;
                            getHighSpeedVideoFpsRangesFor = i2;
                            boolean z = i % 2 != 0;
                            int i3 = i2 + 77;
                            getHighSpeedVideoFpsRanges = i3 % 128;
                            if (i3 % 2 == 0) {
                                return z;
                            }
                            throw new java.lang.ArithmeticException();
                        }
                    }
                }
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException | org.json.JSONException unused) {
        }
        return false;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m27043() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.String m26180;
        util.h.xy.d.d m26956 = util.h.xy.k.ra.f2243.m26956();
        if (m26956 == null || (m26180 = m26956.m26180()) == null || m26180.isEmpty()) {
            return;
        }
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 85) % 128;
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCard digitalizedCard = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardManager.getDigitalizedCard(m26180);
        if (digitalizedCard != null) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 95) % 128;
            m27040(((util.h.xy.d.md) digitalizedCard).m26210().getResult().getState(), m26180);
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 91) % 128;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m27040(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState, java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoFpsRanges + 57;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState2 = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE;
            throw null;
        }
        if (com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE == digitalizedCardState) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 99) % 128;
            util.h.xy.k.ra.f2243.m26946(str.getBytes(util.h.xy.h.a.f2221));
            int i2 = getHighSpeedVideoFpsRanges + 31;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 19) % 128;
        util.h.xy.k.ra.f2243.m26958(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, util.h.xy.k.ra.f2243.m26950(str).getResult());
        int i3 = getHighSpeedVideoFpsRanges + 105;
        int i4 = i3 % 128;
        getHighSpeedVideoFpsRangesFor = i4;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        getHighSpeedVideoFpsRanges = (i4 + 11) % 128;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static boolean m27038() {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 21) % 128;
        android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(android.text.TextUtils.getCapsMode("", 0, 0) + 127, "\u0082\u0083\u008e\u008d\u0088\u0082\u008d\u0083", objArr);
        android.content.SharedPreferences.Editor edit = m24558.getSharedPreferences(((java.lang.String) objArr[0]).intern(), 0).edit();
        edit.clear();
        edit.apply();
        boolean commit = edit.commit();
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 111) % 128;
        return commit;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public static boolean m27039() {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 73) % 128;
        try {
            boolean m26868 = util.h.xy.g.c.m26868();
            int i = getHighSpeedVideoFpsRangesFor + 65;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                return m26868;
            }
            throw null;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        Camera2StreamConfigurationMap = new char[]{64306, 64302, 64280, 64283, 64298, 64281, 64328, 64299, 64319, 64282, 64293, 64278, 64272, 64275, 64310, 64317, 64312, 64315, 64334, 64330};
        getHighSpeedVideoSizesFor = -1074857073;
        getInputSizeshNQ4ISI = true;
        getInputFormats = true;
    }
}
