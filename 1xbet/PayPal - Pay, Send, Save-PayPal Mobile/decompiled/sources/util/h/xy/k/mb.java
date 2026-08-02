package util.h.xy.k;

/* loaded from: classes5.dex */
public final class mb {
    private static int Camera2StreamConfigurationMap = 1;
    private static char getHighResolutionOutputSizeshNQ4ISI = 0;
    private static char getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static final java.lang.String getHighSpeedVideoSizes;
    private static char getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 0;
    private static char getInputSizeshNQ4ISI = 0;
    private static int getOutputMinFrameDuration = 1;

    static {
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoSizes = util.h.xy.k.mb.class.getName();
        getInputFormats = (getOutputMinFrameDuration + 101) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m26926(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getOutputMinFrameDuration = (getInputFormats + 37) % 128;
        util.h.xy.k.ra.f2243.m26944(str, digitalizedCardState, false);
        util.h.xy.u.c.m27503(str);
        util.h.xy.k.ra.m26938(str, digitalizedCardState);
        util.h.xy.k.ra.f2243.m26970(str);
        int i = getOutputMinFrameDuration + 101;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m26928(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        if (util.h.xy.k.ra.f2243.m26955(str.getBytes(util.h.xy.h.a.f2221)).m26133() != util.h.xy.d.mg.f1144) {
            m26926(str, digitalizedCardState);
            int i = getInputFormats + 45;
            getOutputMinFrameDuration = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            return;
        }
        getInputFormats = (getOutputMinFrameDuration + 91) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* renamed from: ᐝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m26931(util.h.xy.d.d dVar) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        if (dVar != null) {
            int i = getOutputMinFrameDuration + 53;
            getInputFormats = i % 128;
            java.lang.String str = null;
            if (i % 2 != 0) {
                dVar.m26177();
                throw null;
            }
            if (dVar.m26177() != null && dVar.m26180() != null) {
                dVar.m26180();
                if (util.h.xy.k.ra.f2243.m26968(dVar.m26180())) {
                    int i2 = getInputFormats + 89;
                    getOutputMinFrameDuration = i2 % 128;
                    if (i2 % 2 == 0) {
                        util.h.xy.k.ra.f2243.m26958(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, (util.h.xy.d.d) null);
                        util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2193);
                        throw null;
                    }
                    util.h.xy.k.ra.f2243.m26958(com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS, (util.h.xy.d.d) null);
                    util.h.xy.f.b.f2201.m26784(util.h.xy.f.a.f2193);
                }
                if (dVar != null) {
                    int i3 = getInputFormats + 1;
                    getOutputMinFrameDuration = i3 % 128;
                    if (i3 % 2 == 0) {
                        dVar.m26179();
                        throw null;
                    }
                    if (dVar.m26179() != null) {
                        str = util.h.xy.cg.b.m25907().m25908(dVar.m26177().getBytes(java.nio.charset.StandardCharsets.UTF_8));
                        getHighSpeedVideoFpsRanges(dVar.m26180(), false);
                        if (dVar.m26179() != null) {
                            getInputFormats = (getOutputMinFrameDuration + 37) % 128;
                            getHighSpeedVideoFpsRanges(dVar.m26179(), true);
                        }
                        getHighSpeedVideoFpsRanges(dVar, str);
                        return;
                    }
                }
                getOutputMinFrameDuration = (getInputFormats + 77) % 128;
                getHighSpeedVideoFpsRanges(dVar.m26180(), false);
                if (dVar.m26179() != null) {
                }
                getHighSpeedVideoFpsRanges(dVar, str);
                return;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("둪龙\uf0b7줉\ue027ꕌ좩譼\uebb2쏦鈈湏ꟓ멐좩譼࿀漓妟紙", 20 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr[0]).intern());
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 13) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            int i2 = 58224;
            int i3 = 0;
            while (i3 < 16) {
                int i4 = getHighSpeedVideoFpsRangesFor;
                Camera2StreamConfigurationMap = (i4 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L))) ^ (c3 + i2)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoFpsRanges ^ 3155153533016530592L)))));
                i2 -= 40503;
                i3++;
                Camera2StreamConfigurationMap = (i4 + 99) % 128;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    private static void getHighSpeedVideoFpsRanges(util.h.xy.d.d dVar, java.lang.String str) {
        if (dVar != null) {
            getOutputMinFrameDuration = (getInputFormats + 45) % 128;
            if (dVar.m26180() != null) {
                try {
                    util.h.xy.t.mb.f2417.m27441(dVar.m26177().getBytes(java.nio.charset.StandardCharsets.UTF_8));
                } catch (java.lang.Exception unused) {
                }
            }
            if (dVar.m26179() == null || str == null) {
                return;
            }
            getOutputMinFrameDuration = (getInputFormats + 97) % 128;
            try {
                util.h.xy.t.mb.f2417.m27441(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            } catch (java.lang.Exception unused2) {
            }
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bytes = str.getBytes(util.h.xy.h.a.f2221);
        try {
            util.h.xy.k.ra.f2243.m26947(str);
            util.h.xy.k.ra.f2243.m26970(str);
            java.lang.String m26921 = util.h.xy.k.b.m26921(str, util.h.xy.d.ma.f1140);
            if (m26921 != null) {
                int i = getOutputMinFrameDuration + 101;
                int i2 = i % 128;
                getInputFormats = i2;
                if (i % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                if (!z) {
                    getOutputMinFrameDuration = (i2 + 5) % 128;
                    try {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("\udbbe縑엖龠썜萴\udb87讥", 8 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr);
                        util.h.xy.au.rb.f877.m25200(util.h.xy.u.d.m27506(m26921, ((java.lang.String) objArr[0]).intern()));
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            }
            if (!z && !util.h.xy.ar.b.m25070(util.h.xy.t.mb.f2417.m27448(bytes))) {
                int i3 = getOutputMinFrameDuration + 115;
                getInputFormats = i3 % 128;
                if (i3 % 2 == 0) {
                    util.h.xy.t.mb.f2417.m27418(bytes);
                } else {
                    util.h.xy.t.mb.f2417.m27418(bytes);
                    throw new java.lang.NullPointerException();
                }
            }
            util.h.xy.t.mb.f2417.m27442(bytes);
            util.h.xy.t.mb.f2417.m27459(bytes);
            util.h.xy.t.mb.f2417.m27475(bytes);
            util.h.xy.t.mb.f2417.m27421(bytes);
            util.h.xy.k.ra.f2243.m26944(str, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.ACTIVE, true);
            util.h.xy.t.mb.f2417.m27420(bytes);
            util.h.xy.t.mb.f2417.m27423(bytes);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("쒍弼ꚯ\u177c㒽\udf96", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6, objArr2);
            util.h.xy.f.b.f2201.m26751(str, util.h.xy.u.d.m27506(m26921, ((java.lang.String) objArr2[0]).intern()), com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
            util.h.xy.u.c.m27497(str);
            getHighResolutionOutputSizeshNQ4ISI(str);
            util.h.xy.ak.ma.f84.m24978(str);
            util.h.xy.ak.ma.f84.m24972(str);
            util.h.xy.ak.ma.f84.m24985(str);
        } finally {
            util.h.xy.f.mb.f2209.m26792(str);
            util.h.xy.ar.b.m25095(bytes);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [byte[], int] */
    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m26930(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState, boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getInputFormats + 83;
        getOutputMinFrameDuration = i % 128;
        ?? r0 = i % 2;
        try {
            if (r0 != 0) {
                util.h.xy.u.d.m27510(str);
                byte[] bytes = str.getBytes(util.h.xy.h.a.f2221);
                boolean m26968 = util.h.xy.k.ra.f2243.m26968(str);
                util.h.xy.k.ra.f2243.m26970(str);
                util.h.xy.k.ra.f2243.m26965(str, digitalizedCardState);
                util.h.xy.t.mb.f2417.m27420(bytes);
                if (m26968) {
                    getInputFormats = (getOutputMinFrameDuration + 91) % 128;
                    if (z) {
                        util.h.xy.u.c.m27496();
                    } else {
                        util.h.xy.u.c.m27502();
                    }
                    util.h.xy.u.c.m27505();
                }
                util.h.xy.ar.b.m25095(bytes);
                getOutputMinFrameDuration = (getInputFormats + 45) % 128;
                return;
            }
            util.h.xy.u.d.m27510(str);
            byte[] bytes2 = str.getBytes(util.h.xy.h.a.f2221);
            util.h.xy.k.ra.f2243.m26968(str);
            util.h.xy.k.ra.f2243.m26970(str);
            util.h.xy.k.ra.f2243.m26965(str, digitalizedCardState);
            util.h.xy.t.mb.f2417.m27420(bytes2);
            throw null;
        } catch (java.lang.Throwable th) {
            util.h.xy.ar.b.m25095((byte[]) r0);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r0.equalsIgnoreCase(((java.lang.String) r4[0]).intern()) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getOutputMinFrameDuration + 15;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (str != null) {
            try {
                java.lang.String m26759 = util.h.xy.f.b.f2201.m26759(str);
                if (m26759 != null) {
                    int i2 = getOutputMinFrameDuration + 59;
                    getInputFormats = i2 % 128;
                    if (i2 % 2 != 0) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("㿃猬湿燖", (-16777212) >> android.graphics.Color.rgb(0, 0, 0), objArr);
                        if (m26759.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                        }
                    } else {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("㿃猬湿燖", (-16777212) - android.graphics.Color.rgb(0, 0, 0), objArr2);
                    }
                    util.h.xy.ak.ma.f84.m24969(str);
                }
            } catch (org.json.JSONException unused) {
            }
        }
        getOutputMinFrameDuration = (getInputFormats + 19) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m26929(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        getOutputMinFrameDuration = (getInputFormats + 103) % 128;
        try {
            util.h.xy.k.ra.f2243.m26958(paymentType, (util.h.xy.d.d) null);
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m27696 = util.h.xy.x.a.m27696(null);
            int i = getOutputMinFrameDuration + 29;
            getInputFormats = i % 128;
            if (i % 2 == 0) {
                return m27696;
            }
            throw new java.lang.ArithmeticException();
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            return util.h.xy.x.a.m27692((java.lang.Exception) e);
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m26927() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.String[] m26919 = util.h.xy.k.b.m26919();
        int length = m26919.length;
        int i = 0;
        while (i < length) {
            int i2 = getOutputMinFrameDuration + 61;
            getInputFormats = i2 % 128;
            if (i2 % 2 == 0) {
                java.lang.String str = m26919[i];
                m26928(str, util.h.xy.u.d.m27509(util.h.xy.k.ra.m26937(str.getBytes(util.h.xy.h.a.f2221))));
                i++;
            } else {
                java.lang.String str2 = m26919[i];
                m26928(str2, util.h.xy.u.d.m27509(util.h.xy.k.ra.m26937(str2.getBytes(util.h.xy.h.a.f2221))));
                i += 61;
            }
        }
        int i3 = getInputFormats + 111;
        getOutputMinFrameDuration = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighSpeedVideoSizesFor = (char) 4956;
        getHighSpeedVideoFpsRanges = (char) 63945;
        getInputSizeshNQ4ISI = (char) 15309;
        getHighResolutionOutputSizeshNQ4ISI = (char) 30353;
    }
}
