package util.h.xy.au;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class rb {
    private static char Camera2StreamConfigurationMap = 0;
    private static final /* synthetic */ util.h.xy.au.rb[] getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static char getInputFormats;
    private static char getInputSizeshNQ4ISI;
    private static final java.lang.String getOutputFormats;
    private static char getOutputMinFrameDuration;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.au.rb f877;

    public static util.h.xy.au.rb valueOf(java.lang.String str) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 99) % 128;
        util.h.xy.au.rb rbVar = (util.h.xy.au.rb) java.lang.Enum.valueOf(util.h.xy.au.rb.class, str);
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 91) % 128;
        return rbVar;
    }

    public static util.h.xy.au.rb[] values() {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 105) % 128;
        util.h.xy.au.rb[] rbVarArr = (util.h.xy.au.rb[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        int i = getHighSpeedVideoSizesFor + 121;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return rbVarArr;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        getHighSpeedVideoSizes();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\ue5dd娖扭뉪⪔뛓뻗\udb2d", 8 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
        util.h.xy.au.rb rbVar = new util.h.xy.au.rb(((java.lang.String) objArr[0]).intern());
        f877 = rbVar;
        int i = (getHighSpeedVideoFpsRanges + 125) % 128;
        getHighSpeedVideoSizesFor = i;
        util.h.xy.au.rb[] rbVarArr = {rbVar};
        int i2 = i + 115;
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 == 0) {
            getHighResolutionOutputSizeshNQ4ISI = rbVarArr;
            getOutputFormats = "rb";
            getHighSpeedVideoSizesFor = (i3 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            return;
        }
        throw null;
    }

    private rb(java.lang.String str) {
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25199() {
        int i = getHighSpeedVideoSizesFor + 25;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            getHighSpeedVideoFpsRangesFor();
        } else {
            getHighSpeedVideoFpsRangesFor();
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25200(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges + 103;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            getHighSpeedVideoFpsRangesFor(str);
            int i2 = getHighSpeedVideoSizesFor + 17;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        getHighSpeedVideoFpsRangesFor(str);
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25201(java.lang.String str) throws org.json.JSONException, com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        int i = getHighSpeedVideoFpsRanges + 77;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            getHighSpeedVideoSizes(str);
        } else {
            getHighSpeedVideoSizes(str);
            throw new java.lang.ArithmeticException();
        }
    }

    private static void getHighSpeedVideoFpsRangesFor() {
        util.h.xy.au.mf m25169;
        boolean z;
        int i = getHighSpeedVideoFpsRanges + 63;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            m25169 = util.h.xy.au.mf.m25169();
            z = true;
        } else {
            m25169 = util.h.xy.au.mf.m25169();
            z = false;
        }
        m25169.m25180(null, z, null);
        int i2 = getHighSpeedVideoFpsRanges + 37;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoSizes(java.lang.String str) throws org.json.JSONException, com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        byte[] bArr;
        util.h.xy.au.rg m25213 = util.h.xy.au.rg.m25213(util.h.xy.bh.ra.m25484().m25485());
        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(m25213.m25216(str), java.nio.charset.StandardCharsets.UTF_8));
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("藱졾\uef95\ue3f3鱣㓝庫ჩเȿ跠嫣", 12 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        util.h.xy.au.mc.m25164(str, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardStatus.ACTIVE, util.h.xy.au.g.m25127().m25149(jSONObject.getJSONObject(((java.lang.String) objArr[0]).intern())));
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizesFor + 19) % 128;
        byte[] bArr2 = null;
        try {
            byte[] m25226 = m25213.m25226();
            try {
                byte[] m25162 = util.h.xy.au.g.m25127().m25162(m25226, str);
                try {
                    m25213.m25224(m25162);
                    if (m25226 != null) {
                        java.util.Arrays.fill(m25226, (byte) 0);
                    }
                    if (m25162 != null) {
                        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 33) % 128;
                        java.util.Arrays.fill(m25162, (byte) 0);
                    }
                    m25213.m25221();
                    int i = getHighSpeedVideoFpsRanges + 99;
                    getHighSpeedVideoSizesFor = i % 128;
                    if (i % 2 == 0) {
                        throw null;
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    bArr2 = m25162;
                    bArr = bArr2;
                    bArr2 = m25226;
                    if (bArr2 != null) {
                        java.util.Arrays.fill(bArr2, (byte) 0);
                    }
                    if (bArr != null) {
                        java.util.Arrays.fill(bArr, (byte) 0);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            bArr = null;
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (i2 + 65) % 128;
        getHighSpeedVideoSizes = (i2 + 55) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 1) % 128;
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 75) % 128;
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (Camera2StreamConfigurationMap ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getInputFormats ^ 3155153533016530592L))) ^ (c3 + i3)) ^ ((c3 >>> 5) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L)))));
                i3 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 113) % 128;
        android.content.Context m25485 = util.h.xy.bh.ra.m25484().m25485();
        if (m25485 != null) {
            try {
                util.h.xy.au.mc.m25166(str);
                if (util.h.xy.au.g.m25127().m25132(util.h.xy.au.rg.m25213(m25485).m25226(), str)) {
                    getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 119) % 128;
                    util.h.xy.au.g.m25127().m25162(util.h.xy.au.rg.m25213(m25485).m25226(), str);
                    getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRanges + 109) % 128;
                }
            } catch (java.lang.Exception e) {
                e.getMessage();
            }
        }
    }

    static void getHighSpeedVideoSizes() {
        getInputFormats = (char) 56771;
        getInputSizeshNQ4ISI = (char) 5068;
        getOutputMinFrameDuration = (char) 29644;
        Camera2StreamConfigurationMap = (char) 9047;
    }
}
