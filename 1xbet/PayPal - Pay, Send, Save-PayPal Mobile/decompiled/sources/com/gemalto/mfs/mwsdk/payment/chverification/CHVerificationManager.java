package com.gemalto.mfs.mwsdk.payment.chverification;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes8.dex */
public final class CHVerificationManager {
    private static int Camera2StreamConfigurationMap = 0;
    public static final com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationManager INSTANCE;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static char getHighSpeedVideoFpsRanges = 0;
    private static char getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static char getHighSpeedVideoSizesFor;
    private static final /* synthetic */ com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationManager[] getInputSizeshNQ4ISI;
    private static char getOutputFormats;
    private static int getOutputMinFrameDuration;
    private util.h.xy.bw.b getInputFormats = new util.h.xy.bw.b();

    private CHVerificationManager(java.lang.String str) {
    }

    public static com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationManager valueOf(java.lang.String str) {
        getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 17) % 128;
        com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationManager cHVerificationManager = (com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationManager) java.lang.Enum.valueOf(com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationManager.class, str);
        getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 109) % 128;
        return cHVerificationManager;
    }

    public static com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationManager[] values() {
        getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 95) % 128;
        com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationManager[] cHVerificationManagerArr = (com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationManager[]) getInputSizeshNQ4ISI.clone();
        getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 55) % 128;
        return cHVerificationManagerArr;
    }

    static {
        com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationManager[] cHVerificationManagerArr;
        getHighSpeedVideoFpsRangesFor();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("褗ᩮ畋骜肣鋼폂裒", 8 - android.view.View.resolveSize(0, 0), objArr);
        com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationManager cHVerificationManager = new com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationManager(((java.lang.String) objArr[0]).intern());
        INSTANCE = cHVerificationManager;
        int i = getOutputMinFrameDuration + 119;
        int i2 = i % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        if (i % 2 == 0) {
            cHVerificationManagerArr = new com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationManager[1];
            cHVerificationManagerArr[1] = cHVerificationManager;
        } else {
            cHVerificationManagerArr = new com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationManager[]{cHVerificationManager};
        }
        getOutputMinFrameDuration = (i2 + 115) % 128;
        getInputSizeshNQ4ISI = cHVerificationManagerArr;
        int i3 = i2 + 61;
        getOutputMinFrameDuration = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public final com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationResult<com.gemalto.mfs.mwsdk.payment.CHVerificationMethod> getCVMethod() {
        java.lang.String intern;
        java.lang.Object obj;
        int i = getHighResolutionOutputSizeshNQ4ISI + 13;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("瓽탌꒥惊", (android.view.ViewConfiguration.getMaximumFlingVelocity() / 71) + 4, objArr);
            intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("揳슍呪髣ꤥै芫祈酨莉", 23 >> android.text.TextUtils.indexOf((java.lang.CharSequence) "", (char) 16), objArr2);
            obj = objArr2[0];
        } else {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("瓽탌꒥惊", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, objArr3);
            intern = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("揳슍呪髣ꤥै芫祈酨莉", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 10, objArr4);
            obj = objArr4[0];
        }
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) obj).intern());
        com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationResult<com.gemalto.mfs.mwsdk.payment.CHVerificationMethod> m25782 = this.getInputFormats.m25782();
        getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 73) % 128;
        return m25782;
    }

    public final com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationResult<java.lang.Object> getCHVerifier() {
        getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 81) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("瓽탌꒥惊", 3 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("揳슍呪髣ꤥै揳슍鈔\ue9af", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 9, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationResult<java.lang.Object> m25783 = this.getInputFormats.m25783(null, null);
        int i = getOutputMinFrameDuration + 45;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return m25783;
        }
        throw null;
    }

    public final boolean isCHVerified() {
        getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 89) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("瓽탌꒥惊", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 5, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("揳슍呪髣䛂꤃揳슍鈔\ue9af", 9 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        boolean m25781 = this.getInputFormats.m25781();
        getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 99) % 128;
        return m25781;
    }

    public final boolean isFCDCVMSupported() {
        getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 21) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("瓽탌꒥惊", 4 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("揳슍呪髣䛂꤃䱕⻡", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 9, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        boolean m26902 = util.h.xy.j.ma.f2241.m26902();
        getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 57) % 128;
        return m26902;
    }

    public final com.gemalto.mfs.mwsdk.payment.CHVerificationMethod getDefaultFCdCvm() {
        java.lang.String intern;
        java.lang.Object obj;
        int i = getHighResolutionOutputSizeshNQ4ISI + 3;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("瓽탌꒥惊", 5 >> android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr);
            intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("揳슍呪髣ꤥै煨\ud9f6", 40 >>> android.graphics.ImageFormat.getBitsPerPixel(1), objArr2);
            obj = objArr2[0];
        } else {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("瓽탌꒥惊", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 4, objArr3);
            intern = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("揳슍呪髣ꤥै煨\ud9f6", 7 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr4);
            obj = objArr4[0];
        }
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) obj).intern());
        return util.h.xy.j.ma.f2241.m26900();
    }

    public final boolean isFCdCvmSet() {
        getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 25) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("瓽탌꒥惊", 4 - android.graphics.Color.argb(0, 0, 0, 0), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("揳슍呪髣䛂꤃䱕⻡◛裖", 10 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        boolean m26899 = util.h.xy.j.ma.f2241.m26899();
        getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
        return m26899;
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = Camera2StreamConfigurationMap + 29;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 53) % 128;
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                int i5 = (Camera2StreamConfigurationMap + 1) % 128;
                getHighSpeedVideoSizes = i5;
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (getOutputFormats ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighSpeedVideoFpsRangesFor ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getHighSpeedVideoFpsRanges ^ 3155153533016530592L))) ^ (c3 + i3)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))));
                i3 -= 40503;
                i4++;
                Camera2StreamConfigurationMap = (i5 + 109) % 128;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 19) % 128;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoFpsRanges = (char) 31955;
        getHighSpeedVideoSizesFor = (char) 27784;
        getOutputFormats = (char) 45536;
        getHighSpeedVideoFpsRangesFor = (char) 46132;
    }
}
