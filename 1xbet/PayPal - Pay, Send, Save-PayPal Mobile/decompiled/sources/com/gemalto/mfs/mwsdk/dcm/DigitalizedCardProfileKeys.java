package com.gemalto.mfs.mwsdk.dcm;

/* loaded from: classes8.dex */
public final class DigitalizedCardProfileKeys {
    public static final java.lang.String ACCOUNT_TYPE;
    public static final java.lang.String ADDITIONAL_DATA;
    public static final java.lang.String ADDITIONAL_DATA_ODA_CERTIFICATE_EXPIRY_DATA;
    public static final java.lang.String ADDITIONAL_DATA_PAN_EXPIRY;
    public static final java.lang.String ADDITIONAL_DATA_PAN_LAST_4_DIGITS;
    public static final java.lang.String ADDITIONAL_DATA_PRODUCT_ID;
    public static final java.lang.String CARD_COUNTRY_CODE;
    public static final java.lang.String CVM_RESET_TIMEOUT;
    private static int Camera2StreamConfigurationMap = 0;
    public static final java.lang.String DC_TOKEN_ID;
    public static final java.lang.String DIGITIZED_CARD_ID;
    public static final java.lang.String DUAL_TAP_TIMEOUT;
    public static final java.lang.String IS_TRANSACTION_ID_REQUIRED;
    public static final java.lang.String IS_US_AIP_MASKING_SUPPORTED;
    public static final java.lang.String MASTERCARD_APPLICATION_LIFE_CYCLE_DATA;
    public static final java.lang.String MASTERCARD_CARD_LAYOUT_DESC;
    public static final java.lang.String MASTERCARD_MCHIP_ISSUER_OPTIONS;
    public static final java.lang.String MASTERCARD_SECURITY_WORD;
    public static final java.lang.String PAN;
    public static final java.lang.String PAYMENT_CHANNELS;
    public static final java.lang.String PRODUCT_TYPE;
    public static final java.lang.String SCHEME;
    public static final java.lang.String VERSION;
    private static char getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static char getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static char getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 1;
    private static char getInputSizeshNQ4ISI;
    private static int getOutputMinFrameDuration;

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (i2 + 85) % 128;
        Camera2StreamConfigurationMap = (i2 + 23) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (getHighSpeedVideoFpsRangesFor ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L))) ^ (c3 + i3)) ^ ((c3 >>> 5) + ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 3155153533016530592L)))));
                i3 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        java.lang.String str2 = new java.lang.String(cArr, 0, i);
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 75) % 128;
        objArr[0] = str2;
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 5) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr[i4] = (char) (cArr[i4] - ((int) (getOutputMinFrameDuration ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        if (z) {
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 17) % 128;
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 45) % 128;
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private DigitalizedCardProfileKeys() {
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getInputSizeshNQ4ISI = (char) 22711;
        getHighResolutionOutputSizeshNQ4ISI = (char) 32615;
        getHighSpeedVideoFpsRangesFor = (char) 36567;
        getHighSpeedVideoSizesFor = (char) 51364;
        getOutputMinFrameDuration = -1231763784;
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("넴颋쳩\u2e7b荺ᜐꍸᬮ\u1ad8譢蜦㎼䧓\ude6d᧚촫痾\uf78d﵋\uef13᪔\ue428ꍯ붶", android.text.TextUtils.getTrimmedLength("") + 23, objArr);
        IS_TRANSACTION_ID_REQUIRED = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("￢\uffe7\f\u0003\t\r\u0012", android.text.TextUtils.indexOf("", "", 0) + 7, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6, 144 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), true, objArr2);
        DIGITIZED_CARD_ID = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("墎㠽ឞ棁뵁Ҏꛥ燅簧ꕖ龄ා庶坞✫ൖ", 15 - android.graphics.Color.blue(0), objArr3);
        CARD_COUNTRY_CODE = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\u0004\u0006\ufff7", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 3, 1 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 151 - android.widget.ExpandableListView.getPackedPositionChild(0L), false, objArr4);
        PAN = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("�\u0002\f￮\fￚ\u0002\t￦\ufffa\f\u0004\u0002\u0007\u0000￬\u000e\t\t\b\u000b\r\ufffe", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.CAN, 1 - android.text.TextUtils.getOffsetBefore("", 0), android.text.TextUtils.indexOf("", "", 0, 0) + 149, false, objArr5);
        IS_US_AIP_MASKING_SUPPORTED = ((java.lang.String) objArr5[0]).intern();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\ufffa\u0005\u000e￩\t\ufff8\n\ufff9\u0004\u0007\u0005", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 11, 11 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 153 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), true, objArr6);
        PRODUCT_TYPE = ((java.lang.String) objArr6[0]).intern();
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\u000b\u0004\n￪\u000f\u0006\ufffb\ufff7\ufff9\ufff9\u0005", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10, 7 - android.text.TextUtils.indexOf("", "", 0), 152 - (android.view.KeyEvent.getMaxKeyCode() >> 16), false, objArr7);
        ACCOUNT_TYPE = ((java.lang.String) objArr7[0]).intern();
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("₯ؕ\uf864㐱蜦㎼榈烜", 8 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr8);
        VERSION = ((java.lang.String) objArr8[0]).intern();
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\u0005￼\u0003\n\u0007\ufff8\u0010\u0004￼\u0005\u000bￚ\uffff\ufff8\u0005", 15 - android.text.TextUtils.getOffsetAfter("", 0), 5 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 151 - (android.view.KeyEvent.getMaxKeyCode() >> 16), false, objArr9);
        PAYMENT_CHANNELS = ((java.lang.String) objArr9[0]).intern();
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\u000b\u000b￡\b\u0001\u0000ￛ\u0005\u000b\u0006\u0007\u0001\f\b\uffe7\n�\r", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 18, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 8, 150 - android.view.KeyEvent.normalizeMetaState(0), true, objArr10);
        MASTERCARD_MCHIP_ISSUER_OPTIONS = ((java.lang.String) objArr10[0]).intern();
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\uffde\u0014\ufffe\u0007\u0000\uffdf￼\u000f￼￼\u000b\u000b\u0007\u0004\ufffe￼\u000f\u0004\n\t\uffe7\u0004\u0001\u0000", android.view.KeyEvent.getDeadChar(0, 0) + 24, 9 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 146 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), false, objArr11);
        MASTERCARD_APPLICATION_LIFE_CYCLE_DATA = ((java.lang.String) objArr11[0]).intern();
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\ufff8\u0006\u0003￫\r\b�\u0006\t\ufff7\ufff9\u0007", 12 - android.view.KeyEvent.keyCodeFromString(""), android.text.TextUtils.indexOf("", "", 0, 0) + 12, 154 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), true, objArr12);
        MASTERCARD_SECURITY_WORD = ((java.lang.String) objArr12[0]).intern();
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("墎㠽ឞ棁ս퐅缟\ude33䝽㊤钡횙䘞螩", android.view.View.MeasureSpec.getSize(0) + 14, objArr13);
        MASTERCARD_CARD_LAYOUT_DESC = ((java.lang.String) objArr13[0]).intern();
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\u0012\u000b\u0002\t\u0011\uffde\r\u000b\ufffeￜ\ufffa�\b", 13 - android.text.TextUtils.getOffsetBefore("", 0), 13 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.graphics.Color.blue(0) + 149, true, objArr14);
        ADDITIONAL_DATA_ODA_CERTIFICATE_EXPIRY_DATA = ((java.lang.String) objArr14[0]).intern();
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("뀄ꪧ艑冷⢍䜒લꛀ沓윩", 9 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr15);
        ADDITIONAL_DATA_PAN_EXPIRY = ((java.lang.String) objArr15[0]).intern();
        java.lang.Object[] objArr16 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("뀄ꪧ贡봚鵯䰩枭⊲\ue9b1ᾷ竻赩桳Ԓ", 14 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr16);
        ADDITIONAL_DATA_PAN_LAST_4_DIGITS = ((java.lang.String) objArr16[0]).intern();
        int i = (getInputFormats + 17) % 128;
        getHighSpeedVideoFpsRanges = i;
        getInputFormats = (i + 15) % 128;
        try {
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\b�\ufff8\u0004\u0006\u0003\ufff8\t\ufff7", ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 10, 3 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 202 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), false, objArr17);
            ADDITIONAL_DATA_PRODUCT_ID = ((java.lang.String) objArr17[0]).intern();
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\u0004\u000f\u0004\uffff\uffff￼￼\u000f￼\uffdf\u0007￼\t\n", android.view.View.getDefaultSize(0, 0) + 14, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 6, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 147, true, objArr18);
            ADDITIONAL_DATA = ((java.lang.String) objArr18[0]).intern();
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\u000e�\r\u000e\b\ufffe\u0006\u0002￭\r\ufffe\f\ufffe￫\t\ufffa￭\u0005\ufffa", android.view.MotionEvent.axisFromString("") + 20, 2 - android.text.TextUtils.indexOf("", "", 0), 149 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), true, objArr19);
            DUAL_TAP_TIMEOUT = ((java.lang.String) objArr19[0]).intern();
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("￼\u0004\u0000￫\u000b￼\n￼￩\u0004\r\ufffa\u000b\f\u0006", 15 - android.view.KeyEvent.normalizeMetaState(0), 11 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.view.View.MeasureSpec.getMode(0) + 151, true, objArr20);
            CVM_RESET_TIMEOUT = ((java.lang.String) objArr20[0]).intern();
            java.lang.Object[] objArr21 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\u0005�\u0000\ufffb\u000b�", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 6, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 5, android.view.View.getDefaultSize(0, 0) + 150, true, objArr21);
            SCHEME = ((java.lang.String) objArr21[0]).intern();
            java.lang.Object[] objArr22 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("￢\uffe7\f\u0003\t\r\u0012", 7 - android.text.TextUtils.getOffsetAfter("", 0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7, android.view.KeyEvent.keyCodeFromString("") + 144, true, objArr22);
            DC_TOKEN_ID = ((java.lang.String) objArr22[0]).intern();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
