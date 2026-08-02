package util.h.xy.da;

/* loaded from: classes5.dex */
public final class mc {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private static util.h.xy.da.mc getHighSpeedVideoSizes;
    private static android.content.Context getInputFormats;
    private static int getOutputMinFrameDuration;
    private static char[] getHighSpeedVideoFpsRangesFor = {kotlin.text.Typography.ellipsis, 35738, 30502, 8863, 36453, 31260, 9650, 37123, 31971, 10370, 37924, 32689, 11101, 38646, 17035, 11817, 39389, 17761, 12611, 40002, 14323, 52053, 40610, 12816, 50792, 39387, 11626, 49284, 38129, 10320, 50122, 38781, 10902, 65272, 37446, 9713, 63758, 36206, 8326, 62507, 36757, 8979, 63350, 40043, 14333, 52045, 40631, 12891, 50809, 39360, 11620, 49309, 38121, 10323, 50138, 38708, 10890, 42604, 3582, 61788, 42168, 2061, 34565, 11455, 53250, 34302, 10570, 56627, 33411, 13931, 56196, 36780, 13084, 55425, 35967, 12743, 58874, 35088, 16127, 57922, 38451, 15257, 61306, 38088, 14422, 60537};
    private static long getHighSpeedVideoSizesFor = -2946483524925573220L;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.da.mc m26262() {
        util.h.xy.da.mc highSpeedVideoFpsRangesFor;
        synchronized (util.h.xy.da.mc.class) {
            getOutputMinFrameDuration = (Camera2StreamConfigurationMap + 61) % 128;
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            Camera2StreamConfigurationMap = (getOutputMinFrameDuration + 71) % 128;
        }
        return highSpeedVideoFpsRangesFor;
    }

    private static util.h.xy.da.mc getHighSpeedVideoFpsRangesFor() {
        util.h.xy.da.mc mcVar;
        synchronized (util.h.xy.da.mc.class) {
            int i = Camera2StreamConfigurationMap;
            getOutputMinFrameDuration = (i + 65) % 128;
            mcVar = getHighSpeedVideoSizes;
            if (mcVar == null) {
                int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(19 - (minimumFlingVelocity >> 16), android.view.View.resolveSize(0, 0), (char) (48233 - android.graphics.Color.blue(0)), objArr);
                throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
            }
            int i2 = i + 31;
            getOutputMinFrameDuration = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
        return mcVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m26263(android.content.Context context) throws util.h.xy.da.b {
        synchronized (util.h.xy.da.mc.class) {
            int i = getOutputMinFrameDuration + 41;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 != 0) {
                getHighSpeedVideoSizes(context);
            } else {
                getHighSpeedVideoSizes(context);
                throw new java.lang.NullPointerException();
            }
        }
    }

    private static void getHighSpeedVideoSizes(android.content.Context context) throws util.h.xy.da.b {
        synchronized (util.h.xy.da.mc.class) {
            if (getHighSpeedVideoSizes == null) {
                if (context == null) {
                    int blue = android.graphics.Color.blue(0);
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(24 - blue, 19 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
                    throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern());
                }
                getInputFormats = context.getApplicationContext();
                try {
                    int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(lastIndexOf + 15, 43 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), objArr2);
                    java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
                    android.content.Context context2 = getInputFormats;
                    long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(6 - (currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)), android.graphics.Color.red(0) + 57, (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 14859), objArr3);
                    java.lang.System.setProperty(intern, context2.getDir(((java.lang.String) objArr3[0]).intern(), 0).getPath());
                    getHighSpeedVideoSizes = new util.h.xy.da.mc();
                } catch (java.lang.Exception unused) {
                    try {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(23 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 63 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 6989), objArr4);
                        throw new util.h.xy.da.b(((java.lang.String) objArr4[0]).intern(), 10402);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            }
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoFpsRangesFor[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoSizesFor))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            int i3 = getHighSpeedVideoFpsRanges + 103;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 == 0) {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                int i4 = rbVar.f2651;
                throw new java.lang.ArithmeticException();
            }
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final android.content.Context m26264() {
        int i = getOutputMinFrameDuration;
        int i2 = i + 85;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        android.content.Context context = getInputFormats;
        int i3 = i + 73;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            return context;
        }
        throw new java.lang.ArithmeticException();
    }
}
