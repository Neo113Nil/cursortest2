package util.h.xy.bf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class c {
    static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    static int getHighSpeedVideoFpsRangesFor = 1;
    private static final /* synthetic */ util.h.xy.bf.c[] getHighSpeedVideoSizesFor;
    private static int getInputFormats = 1;
    private static char[] getInputSizeshNQ4ISI;
    private static final java.lang.String getOutputFormats;
    private static long getOutputMinFrameDuration;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.bf.c f934;
    com.gemalto.mfs.mwsdk.payment.APDUProcessorSetupCallbacks getHighResolutionOutputSizeshNQ4ISI;
    com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener getHighSpeedVideoSizes;

    private c(java.lang.String str) {
    }

    public static util.h.xy.bf.c valueOf(java.lang.String str) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 109) % 128;
        util.h.xy.bf.c cVar = (util.h.xy.bf.c) java.lang.Enum.valueOf(util.h.xy.bf.c.class, str);
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 13) % 128;
        return cVar;
    }

    public static util.h.xy.bf.c[] values() {
        int i = getHighSpeedVideoFpsRangesFor + 57;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        util.h.xy.bf.c[] cVarArr = (util.h.xy.bf.c[]) getHighSpeedVideoSizesFor.clone();
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 45) % 128;
        return cVarArr;
    }

    static {
        util.h.xy.bf.c[] cVarArr;
        getHighSpeedVideoFpsRangesFor();
        long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(9 - (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 157, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
        util.h.xy.bf.c cVar = new util.h.xy.bf.c(((java.lang.String) objArr[0]).intern());
        f934 = cVar;
        int i = Camera2StreamConfigurationMap;
        int i2 = i + 39;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            cVarArr = new util.h.xy.bf.c[1];
            cVarArr[1] = cVar;
        } else {
            cVarArr = new util.h.xy.bf.c[]{cVar};
        }
        getHighSpeedVideoSizesFor = cVarArr;
        getOutputFormats = "c";
        getHighSpeedVideoFpsRangesFor = (i + 93) % 128;
    }

    static void getHighResolutionOutputSizeshNQ4ISI(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getInputFormats = (getHighSpeedVideoFpsRanges + 55) % 128;
            jArr[rbVar.f2651] = (((char) (getInputSizeshNQ4ISI[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputMinFrameDuration))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        getInputFormats = (getHighSpeedVideoFpsRanges + 83) % 128;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25414() {
        int i = getHighSpeedVideoFpsRangesFor + 51;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            this.getHighResolutionOutputSizeshNQ4ISI.setupPluginRegistration();
            int i2 = Camera2StreamConfigurationMap + 23;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.setupPluginRegistration();
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final boolean m25412() {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 51) % 128;
        boolean z = this.getHighResolutionOutputSizeshNQ4ISI.setupCardActivation();
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 41) % 128;
        return z;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener m25413() {
        int i = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i + 21) % 128;
        com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener contactlessPaymentServiceListener = this.getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (i + 69) % 128;
        return contactlessPaymentServiceListener;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getInputSizeshNQ4ISI = new char[]{40032, 55839, 4281, 20286, 34281, 64597, 15098, 29024, 44820, 58796, 23614, 39636, 53595, 4036, 18016, 48135, 64148, 12607, 28670, 42570, 7413, 23403, 37143, 53122, 1586, 31956, 47966, 61883, 10346, 26134, 56459, 6973, 20910, 34907, 50877, 15721, 31516, 45511, 59451, 9910, 40285, 56307, 40013, 55814, 4270, 20287, 34268, 64585, 15088, 29041, 44881, 58812, 23596, 39637, 53575, 4088, 18033, 48211, 64131, 12586, 28573, 42565, 7404, 23403, 37145, 47159, 65148, 13524, 27461, 41382, 55347, 7818, 21771, 35627, 49612, 30788, 48865, 62774, 11157, 25103, 39020, 57080, 5441, 19362, 33333, 14531, 32521, 46432, 60345, 8777, 22688, 40823, 54670, 3093, 16941, 63723, 16208, 30155, 44080, 58077, 6481, 24384, 38386, 52289, 717, 47402, 65414, 13827, 27757, 41718, 55646, 8140, 22041, 36026, 49932, 31082, 49140, 63053, 11465, 25372, 39356, 53273, 5747, 19710, 33602, 14806, 28673, 46774, 60698, 9103, 23024, 36937, 54996, 3377, 40002, 55808, 4275, 20287, 34268, 64607, 15073, 28963, 44818, 58814, 23587, 39637, 53574, 4067, 17957, 48145, 64132, 12655, 28627, 42590, 7413, 23403, 40008, 55841, 4238, 20255, 34296, 64617, 15062, 28998};
        getOutputMinFrameDuration = 6622287018857847407L;
    }
}
