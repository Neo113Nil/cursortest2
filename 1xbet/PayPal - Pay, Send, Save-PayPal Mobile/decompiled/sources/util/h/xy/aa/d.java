package util.h.xy.aa;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class d {
    private static char[] Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static long getHighSpeedVideoSizes = 0;
    private static final /* synthetic */ util.h.xy.aa.d[] getInputFormats;
    private static int getOutputFormats = 1;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.aa.d f62;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.aa.d f63;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.aa.d f64;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.aa.d f65;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.aa.d f66;

    private d(java.lang.String str, int i) {
    }

    public static util.h.xy.aa.d valueOf(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor + 17;
        getOutputFormats = i % 128;
        util.h.xy.aa.d dVar = (util.h.xy.aa.d) java.lang.Enum.valueOf(util.h.xy.aa.d.class, str);
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i2 = getHighSpeedVideoFpsRangesFor + 89;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return dVar;
        }
        throw null;
    }

    public static util.h.xy.aa.d[] values() {
        int i = getOutputFormats + 1;
        getHighSpeedVideoFpsRangesFor = i % 128;
        util.h.xy.aa.d[] dVarArr = getInputFormats;
        if (i % 2 == 0) {
            return (util.h.xy.aa.d[]) dVarArr.clone();
        }
        throw null;
    }

    static {
        util.h.xy.aa.d[] dVarArr;
        getHighSpeedVideoFpsRangesFor();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(27 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.text.TextUtils.getOffsetBefore("", 0), (char) (android.view.KeyEvent.normalizeMetaState(0) + 1645), objArr);
        util.h.xy.aa.d dVar = new util.h.xy.aa.d(((java.lang.String) objArr[0]).intern(), 0);
        f65 = dVar;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 22, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 27, (char) (android.graphics.Color.red(0) + 42252), objArr2);
        util.h.xy.aa.d dVar2 = new util.h.xy.aa.d(((java.lang.String) objArr2[0]).intern(), 1);
        f62 = dVar2;
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 21, 49 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr3);
            util.h.xy.aa.d dVar3 = new util.h.xy.aa.d(((java.lang.String) objArr3[0]).intern(), 2);
            f64 = dVar3;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(17 - android.view.View.getDefaultSize(0, 0), 70 - android.graphics.Color.alpha(0), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr4);
            util.h.xy.aa.d dVar4 = new util.h.xy.aa.d(((java.lang.String) objArr4[0]).intern(), 3);
            f66 = dVar4;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(16 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 87 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.graphics.Color.argb(0, 0, 0, 0) + 1523), objArr5);
            util.h.xy.aa.d dVar5 = new util.h.xy.aa.d(((java.lang.String) objArr5[0]).intern(), 4);
            f63 = dVar5;
            int i = getOutputFormats + 5;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                dVarArr = new util.h.xy.aa.d[4];
                dVarArr[0] = dVar;
                dVarArr[0] = dVar2;
                dVarArr[4] = dVar3;
                dVarArr[5] = dVar4;
                dVarArr[4] = dVar5;
            } else {
                dVarArr = new util.h.xy.aa.d[]{dVar, dVar2, dVar3, dVar4, dVar5};
            }
            getInputFormats = dVarArr;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 93) % 128;
            jArr[rbVar.f2651] = (((char) (Camera2StreamConfigurationMap[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoSizes))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 19) % 128;
        while (rbVar.f2651 < i) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 33) % 128;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void getHighSpeedVideoFpsRangesFor() {
        Camera2StreamConfigurationMap = new char[]{39481, 53623, 3210, 31708, 46971, 57998, 22999, 38267, 49307, 16336, 27504, 42639, 7631, 18806, 33935, 62414, 12131, 39560, 53717, 3424, 30861, 47046, 58225, 24198, 38358, 49517, 15499, 14680, 29195, 45026, 55456, 5126, 16874, 64188, 13834, 25594, 40113, 51210, 1534, 48825, 59929, 10213, 20642, 35860, 14827, 29366, 44566, 56300, 5296, 40010, 55057, 2802, 32161, 45317, 58605, 24493, 37663, 50920, 14770, 27926, 41192, 7081, 20239, 33518, 62900, 10503, 40165, 55223, 2823, 32481, 40010, 55057, 2802, 32161, 45312, 58598, 24493, 37655, 50922, 14771, 27909, 41187, 7087, 20241, 33509, 62902, 10516, 39353, 53986, 3841, 30802, 46319, 57621, 23117, 38626, 49945, 15434, 26867, 42246, 7751, 19169, 34584, 61516};
        getHighSpeedVideoSizes = 8002589172374296404L;
    }
}
