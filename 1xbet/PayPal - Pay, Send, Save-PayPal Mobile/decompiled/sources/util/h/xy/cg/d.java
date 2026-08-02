package util.h.xy.cg;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ˊ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class d {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static boolean getHighSpeedVideoFpsRanges = false;
    private static boolean getHighSpeedVideoFpsRangesFor = false;
    private static int getHighSpeedVideoSizes = 0;
    private static final /* synthetic */ util.h.xy.cg.d[] getHighSpeedVideoSizesFor;
    private static int getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 1;
    private static char[] getOutputFormats;
    private static final java.lang.String getOutputMinFrameDuration;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.cg.d f1098;

    private d(java.lang.String str) {
    }

    public static util.h.xy.cg.d valueOf(java.lang.String str) {
        int i = getHighSpeedVideoSizes + 3;
        getInputSizeshNQ4ISI = i % 128;
        util.h.xy.cg.d dVar = (util.h.xy.cg.d) java.lang.Enum.valueOf(util.h.xy.cg.d.class, str);
        if (i % 2 != 0) {
            return dVar;
        }
        throw null;
    }

    public static util.h.xy.cg.d[] values() {
        getHighSpeedVideoSizes = (getInputSizeshNQ4ISI + 85) % 128;
        util.h.xy.cg.d[] dVarArr = (util.h.xy.cg.d[]) getHighSpeedVideoSizesFor.clone();
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 55) % 128;
        return dVarArr;
    }

    static {
        getHighSpeedVideoFpsRanges();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), "\u0093\u0092\u008e\u0091\u0090\u008f\u008e\u008d", objArr);
        util.h.xy.cg.d dVar = new util.h.xy.cg.d(((java.lang.String) objArr[0]).intern());
        f1098 = dVar;
        int i = getInputSizeshNQ4ISI + 79;
        getHighSpeedVideoSizes = i % 128;
        int i2 = i % 2;
        getHighSpeedVideoSizesFor = new util.h.xy.cg.d[]{dVar};
        getOutputMinFrameDuration = util.h.xy.cg.d.class.getName();
        int i3 = getInputSizeshNQ4ISI + 99;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m25913() throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoSizes + 43;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            util.h.xy.k.a.m26907(true);
        } else {
            util.h.xy.k.a.m26907(true);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final org.json.JSONObject m25914(org.json.JSONObject jSONObject) throws org.json.JSONException, util.h.xy.ck.rc, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Throwable th;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4 = null;
        try {
            util.h.xy.bx.ra raVar = util.h.xy.bx.ra.f1063;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(128 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr);
            byte[] m25786 = raVar.m25786(jSONObject.getString(((java.lang.String) objArr[0]).intern()));
            try {
                bArr3 = util.h.xy.ck.ra.f1116.m25945().mo25943(m25786);
                try {
                    util.h.xy.bx.ra raVar2 = util.h.xy.bx.ra.f1063;
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(127 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0083\u008c\u0083\u008b\u008a\u0089\u0082\u0085\u0084", objArr2);
                    bArr = raVar2.m25786(jSONObject.getString(((java.lang.String) objArr2[0]).intern()));
                    try {
                        bArr4 = util.h.xy.bx.ra.f1063.m25787(bArr3, bArr);
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject(new java.lang.String(bArr4));
                        util.h.xy.ar.b.m25095(m25786);
                        util.h.xy.ar.b.m25095(bArr3);
                        util.h.xy.ar.b.m25095(bArr);
                        util.h.xy.ar.b.m25095(bArr4);
                        getInputSizeshNQ4ISI = (getHighSpeedVideoSizes + 23) % 128;
                        return jSONObject2;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        bArr2 = bArr4;
                        bArr4 = m25786;
                        util.h.xy.ar.b.m25095(bArr4);
                        util.h.xy.ar.b.m25095(bArr3);
                        util.h.xy.ar.b.m25095(bArr);
                        util.h.xy.ar.b.m25095(bArr2);
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    bArr = null;
                    bArr4 = m25786;
                    bArr2 = null;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                bArr = null;
                bArr3 = null;
                bArr4 = m25786;
                bArr2 = null;
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            bArr = null;
            bArr2 = null;
            bArr3 = null;
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getOutputFormats;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getInputFormats);
        if (!getHighSpeedVideoFpsRangesFor) {
            if (!getHighSpeedVideoFpsRanges) {
                throw null;
            }
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 35) % 128;
            throw null;
        }
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 39) % 128;
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            int i4 = getHighResolutionOutputSizeshNQ4ISI + 103;
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = mdVar.f2643;
                int i6 = mdVar.f2642;
                throw new java.lang.ArithmeticException();
            }
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void getHighSpeedVideoFpsRanges() {
        getOutputFormats = new char[]{64280, 64285, 64290, 64275, 64302, 64303, 64308, 64282, 64284, 64272, 64335, 64287, 64330, 64305, 64316, 64319, 64322, 64332, 64334};
        getInputFormats = -1074857085;
        getHighSpeedVideoFpsRanges = true;
        getHighSpeedVideoFpsRangesFor = true;
    }
}
