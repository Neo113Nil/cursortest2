package util.h.xy.by;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class b {
    private static char Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static final /* synthetic */ util.h.xy.by.b[] getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static final java.lang.String getInputFormats;
    private static int getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static long getOutputMinFrameDuration;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.by.b f1066;
    private util.h.xy.da.ra getHighSpeedVideoSizesFor;

    private b(java.lang.String str) {
    }

    public static util.h.xy.by.b valueOf(java.lang.String str) {
        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
        util.h.xy.by.b bVar = (util.h.xy.by.b) java.lang.Enum.valueOf(util.h.xy.by.b.class, str);
        int i = getHighResolutionOutputSizeshNQ4ISI + 31;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            return bVar;
        }
        throw new java.lang.ArithmeticException();
    }

    public static util.h.xy.by.b[] values() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 5;
        getOutputFormats = i % 128;
        util.h.xy.by.b[] bVarArr = getHighSpeedVideoFpsRanges;
        if (i % 2 == 0) {
            return (util.h.xy.by.b[]) bVarArr.clone();
        }
        throw null;
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("릏\u173a\ue93a啲臷큸鏶赬", (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, "갎Ⴜ懓ꐰ", "\u0000\u0000\u0000\u0000", objArr);
            util.h.xy.by.b bVar = new util.h.xy.by.b(((java.lang.String) objArr[0]).intern());
            f1066 = bVar;
            int i = (getHighResolutionOutputSizeshNQ4ISI + 115) % 128;
            getOutputFormats = i;
            util.h.xy.by.b[] bVarArr = {bVar};
            int i2 = i + 73;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                getHighSpeedVideoFpsRanges = bVarArr;
                getInputFormats = util.h.xy.by.b.class.getName();
                return;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final boolean m25794() {
        int i = getOutputFormats + 67;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        try {
            if (i % 2 != 0) {
                getHighSpeedVideoFpsRanges();
                boolean mo26079 = this.getHighSpeedVideoSizesFor.mo26079();
                int i2 = getHighResolutionOutputSizeshNQ4ISI + 3;
                getOutputFormats = i2 % 128;
                if (i2 % 2 == 0) {
                    return mo26079;
                }
                throw null;
            }
            getHighSpeedVideoFpsRanges();
            this.getHighSpeedVideoSizesFor.mo26079();
            throw new java.lang.ArithmeticException();
        } catch (util.h.xy.da.b unused) {
            return false;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25793() {
        getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 65) % 128;
        try {
            getHighSpeedVideoFpsRanges();
            util.h.xy.ak.d.m24967(this.getHighSpeedVideoSizesFor);
            getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 51) % 128;
        } catch (util.h.xy.da.b unused) {
        }
    }

    private void getHighSpeedVideoFpsRanges() throws util.h.xy.da.b {
        getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 53) % 128;
        if (this.getHighSpeedVideoSizesFor == null) {
            util.h.xy.da.ma maVar = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("荠\uf5e7ꂅ熥雗榱", (char) (8916 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "䃭⋗푗栢", "\u0000\u0000\u0000\u0000", objArr);
            this.getHighSpeedVideoSizesFor = util.h.xy.da.d.m26260(maVar, ((java.lang.String) objArr[0]).intern());
            getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 71) % 128;
        }
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 45) % 128;
        char[] charArray = str3.toCharArray();
        char[] charArray2 = str2.toCharArray();
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 121) % 128;
        char[] cArr = charArray2;
        char[] charArray3 = str.toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int length2 = charArray.length;
        char[] cArr3 = new char[length2];
        java.lang.System.arraycopy(cArr, 0, cArr2, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c);
        cArr3[2] = (char) (cArr3[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr4 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            int i2 = (rcVar.f2652 + 2) % 4;
            int i3 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr2[rcVar.f2652 % 4] * 32718) + cArr3[i2]) % 65535);
            cArr3[i3] = (char) (((cArr2[i3] * 32718) + cArr3[i2]) / 65535);
            cArr2[i3] = rcVar.f2653;
            cArr4[rcVar.f2652] = (char) ((((cArr2[i3] ^ charArray3[rcVar.f2652]) ^ (getOutputMinFrameDuration ^ 2457411417541981002L)) ^ ((int) (getInputSizeshNQ4ISI ^ 2457411417541981002L))) ^ ((char) (Camera2StreamConfigurationMap ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getOutputMinFrameDuration = 2457411417541981002L;
        getInputSizeshNQ4ISI = -1622003291;
        Camera2StreamConfigurationMap = (char) 13130;
    }
}
