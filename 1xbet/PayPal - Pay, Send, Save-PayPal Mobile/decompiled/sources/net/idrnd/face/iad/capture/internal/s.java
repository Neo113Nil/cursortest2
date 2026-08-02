package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f7002a;
    public static final java.lang.String[] b;
    public static final java.lang.String[] c;
    public static final java.lang.String[] d;
    public static final java.lang.String[] e;

    static {
        byte[] bArr = {101, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE};
        byte[] bArr2 = new byte[2];
        byte[] bArr3 = {com.google.common.base.Ascii.SYN, 37, -26, com.visa.cbp.getEncExpo.IResultReceiver};
        byte b2 = 0;
        for (int i = 0; i < 2; i++) {
            bArr2[i] = (byte) ((b2 ^ bArr[i]) ^ bArr3[i & 3]);
            b2 = bArr[i];
        }
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        f7002a = str;
        byte[] bArr4 = {-38, -10, 13, 91, -116, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 69, 85, com.visa.cbp.getEncExpo.registerForActivityResult, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 69, 72, -33, -3, 5, com.google.common.base.Ascii.EM, -46, -2, 1, com.google.common.base.Ascii.GS, -118, -70, 89, 43, -15, -35, 38, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -89, -117, 110, 126, -78, -105, 110, 99, -12, -42, 46, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -7, -43, 42, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -95, -111, 114, 36, -8, -41, 40, 36, -8, -79, 66, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -40, -8, 6, com.google.common.base.Ascii.US, com.visa.cbp.getEncExpo.kernelVersion, -30, 18, 3, -56, -18, 86, 93, -111, -94, 81, 91, -111, -89, 59, 32, -10, -40, com.visa.cbp.getEncExpo.IResultReceiver2, 115, -91, -109, 118, 102, -74, -98, 108, 97, -84, -101, 108, 58, com.visa.cbp.getEncExpo.onUnminimized, -58, 32, kotlin.io.encoding.Base64.padSymbol, -10, com.visa.cbp.getEncExpo.startTransaction, 37, 56, -13, -70, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 88, -116, -31, 3, 19, -61, -14, 0, 8, -48, -31, 3, 2, -107, -91, 70, 78, -110, -93, 64, 75, -105, -90, 58, 33, -9, -39, 97, com.visa.cbp.getEncExpo.IResultReceiver2, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -109, 105, 126, -80, -106, 115, 37, -17, -39, 69, 94, -120, -90, com.google.common.base.Ascii.RS, 18, -60, -9, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FS, -51, -32, 1, com.google.common.base.Ascii.FF, -101, -75, 66, 93, -115, -67, 64, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -24, -60, 63, 105, -69, -111, 105, 118, -67, -111, 104, 100, -13, -37, 36, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -20, -38, 63, 34, -23, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 85, 66, -106, -5, 6, com.google.common.base.Ascii.ETB, com.visa.cbp.getEncExpo.startTransaction, -28, com.google.common.base.Ascii.GS, 75, Byte.MIN_VALUE, -84, 85, 89, -22, -54, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 38, -79, -127, 122, 103, -70, -112, 103, 115, -93, -114, 115, 37, -13, -34, 45, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -29, -55, 60, 47, -28, -56, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, kotlin.io.encoding.Base64.padSymbol, -114, -82, 87, 66, -43, -20, 18, 3, -53, -3, com.google.common.base.Ascii.ESC, 8, -97, -82, 87, 64, -115, -32, 17, 5, -45, -14, 5, 17, -94, -126, 123, 110, -7, -37, 33, 60, -11, -34, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 43, -5, -42, 110, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -69, com.visa.cbp.getEncExpo.registerForActivityResult, 98, 123, -80, -100, 101, 105};
        byte[] bArr5 = new byte[com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE];
        byte[] bArr6 = {-71, 67, -106, 120};
        byte b3 = 0;
        for (int i2 = 0; i2 < 276; i2++) {
            bArr5[i2] = (byte) ((b3 ^ bArr4[i2]) ^ bArr6[i2 & 3]);
            b3 = bArr4[i2];
        }
        java.lang.String[] split = new java.lang.String(bArr5, java.nio.charset.StandardCharsets.UTF_8).split(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(split, "");
        b = split;
        byte[] bArr7 = new byte[682];
        byte[] bArr8 = new byte[682];
        java.lang.System.arraycopy("\u009fZ\u00adçpµZMÙ\u001aëëb¼RW\u0085]¨¡0û\u000f\n\u0091^¶ØG\u0082u?¨m\u0082\u0095\u0001Â33ºd\u008a\u008f]\u0085pyè#×ÒI\u0086n$´w\u008e\u008f\u001dÄ;UÊ\u000fø²*é\u001e\u0015\u0087[¨¨1ô@HÁ\bùäh£MJÞ\u0011ù\u0097\bÍ:pï-ÒÚV\u0089`*ºq\u0088\u0087\u0002Ø#3¬nþùj\u00ad\u0019\u000f\u0092U«½.í\u0013YÄ\u001eôáh£KNÜ\u0002ñûbÂ;0¡%ÍÈY\u0097\u007ftá/\u009b\u009e\u0012È#2¯w\u008c\u0086\u000eÍ98´l\u0099÷h\u00adZ\u0010\u008dI·¡2ñ\u000fEÏ\u0000ôôa¥X\u0012\u008cO¹±$à\u001dWâ&ýée\u008d~væ%ÑÒ}²ZHÝ\u0014ë¡\u001eû(\u0002ô=ÈÁ\u0013Ø,,¢g\u0094\u0094F\u009aeo÷4ÀÃ\u0011Ù*\"²q\u0085\u0086T·Cfê0èåu³@JÑ(×ÁK\u0088qp¢D\u008b¬\u001b»BIØ\\¥©0ö\u001c\r\u0082\u0006ðá~¿\\HÕ\u000bòþg¿/(»|ÈÎ^\u0095lcò9ÑÁ\\\u009ap|áA´¢9½EMÐ\u0019èá|¤J\u0000\u0091Z²½$újmþ9\u008d\u0088\u0018Þ-'´p\u008fÅ_\u0087xy\u008fF³ºh°O[È\u0006îåp¾\n\u000f\u0083YÉÂL\u008152¼s\u008c\u0098\bÃ 7å'ÜÛLì\u0015\u001e\u008f\u000bóöy¶MYÕ\u0019öþnê\u0016\u0005\u009d=ÄÏ^Ú:3®t\u009eðoª]\u0017\u008fSçîs«Z[Ó\u0014áá3ð\u0004\u0013\u009bP¦®7ï\u007ftú7\u0083\u008a\u0019Ñ\"*¿f\u0091ÛF\u0082|jù:Äª5ð\u0007MÐ\u0014êüo¬R\u0018\u0093Iý÷n°\u0004\f\u009fRÂÅV\u0091% ²|\u0094\u009f\nÄpwê-ÒÄYÝ2&¾u\u009b\u009al¥\\\u0016\u0087L²½(ö\tCÙ\u0001þÿg¢U;¤a\u0096ÜS\u0096`kÿ&É\u0083\u001eÚ$2¡b\u009cÖO\u0081cw¥b\u0099\u0093\u000eÃ<*Ü\u0019ñò ç\u0018\u0013\u0098Qªºh§YEÉ\fåä|ø\u000f\n\u0098S®¯!\u0081xsâf\u0084\u008d\u001eÐ-(¹væárµ\u0001\u0006\u0093Qåæ{¼Cxç$Ö¸'â\u0015_À\u0002ùï\u007f°Y\u0013\u0083Y¬¹$ý\u0002\u0014\u009c<ÅÀH\u0081sH\u009a]¢\u0099K\u0088tO\u009dN»ª\t\u008dtqã\u0016".getBytes("ISO-8859-1"), 0, bArr8, 0, 682);
        java.lang.System.arraycopy(bArr8, 0, bArr7, 0, 682);
        byte[] bArr9 = new byte[682];
        byte[] bArr10 = {-4, -86, -102, 100};
        byte b4 = 0;
        for (int i3 = 0; i3 < 682; i3++) {
            bArr9[i3] = (byte) ((b4 ^ bArr7[i3]) ^ bArr10[i3 & 3]);
            b4 = bArr7[i3];
        }
        java.lang.String[] split2 = new java.lang.String(bArr9, java.nio.charset.StandardCharsets.UTF_8).split(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(split2, "");
        c = split2;
        byte[] bArr11 = {com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 8, 125, -38, 69, 99, 89, -2, 114, 67, 118, -42, 73, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, com.google.common.base.Ascii.RS, -78, 39, 3, 59, -108, 1, 48, 0, -55, 80, 111, 89, -76, 42, com.google.common.base.Ascii.US, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -112, 14, 40, 18, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 38, 19, 102, -41, 66, 125, 82, -14, 100, 91, 97, -55, 67, Byte.MAX_VALUE, 81, -31, 17, 37, com.google.common.base.Ascii.ESC, -10, 126, 65, 120, -51, com.google.common.base.Ascii.EM, 40, com.google.common.base.Ascii.GS, -70, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 13, 63, -104, 76, 100, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -29, 106, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, com.visa.cbp.getEncExpo.IResultReceiver2, -115, com.google.common.base.Ascii.RS, 32, 8, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 36, com.google.common.base.Ascii.CAN, 47, -119, 1, 91, 99, com.visa.cbp.getEncExpo.kernelVersion, 88, 38, 14, -84, 35, 1, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -101, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 108, 66, -29, 106, 78, 103, -59, 75, 126, 47, -113, com.google.common.base.Ascii.SUB, 39, 82, -21, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 67, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, com.visa.cbp.getEncExpo.startTransaction, 74, 117, 64, -28, 48, com.google.common.base.Ascii.DC4, 42, -124, 14, 44, com.google.common.base.Ascii.CAN, -76, 58, com.google.common.base.Ascii.CAN, 38, -120, com.google.common.base.Ascii.GS, 59, 5, -84, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 110, 86, -6, 109, 19, 41, -121, 13, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 1, -80, 43, 8, 125, -42, 69, 113, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -31, 98, 64, 116, -40, 86, com.google.common.base.Ascii.FF, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -104, com.google.common.base.Ascii.SI, 113, 75, -27, 111, 87, 99, -46, 73, 106, com.google.common.base.Ascii.US, -76, 39, 19, 45, -125, 0, 34, com.google.common.base.Ascii.SYN, -70, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 5, 58, -97, com.google.common.base.Ascii.ETB, 34, com.google.common.base.Ascii.FS, -43, 76, 115, 69, -88, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, com.google.common.base.Ascii.VT, 34, -116, com.google.common.base.Ascii.SI, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 1, -20, 126, 71, 120, -34, 86, 105, 93, -22, 64, 98, 92, -14, 97, 68, 114, -69, 34, com.google.common.base.Ascii.GS, 43, -58, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 101, 76, -30, 97, 89, 111, -126, 16, 41, com.google.common.base.Ascii.SYN, -80, 56, 7, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -124};
        byte[] bArr12 = new byte[241];
        byte[] bArr13 = {-61, -6, 80, 91};
        byte b5 = 0;
        for (int i4 = 0; i4 < 241; i4++) {
            bArr12[i4] = (byte) ((b5 ^ bArr11[i4]) ^ bArr13[i4 & 3]);
            b5 = bArr11[i4];
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(new java.lang.String(bArr12, java.nio.charset.StandardCharsets.UTF_8).split(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE), "");
        byte[] bArr14 = {68, com.google.common.base.Ascii.DC4, -4, -18, -28, -1, com.google.common.base.Ascii.SUB, 19, com.google.common.base.Ascii.ESC, 78, -85, -30, -125, -104, 117, 114, 109, 56, -98, -108, -112, -57, 47, 37, 97, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -41, -33, -101, -91, 3, 1, com.google.common.base.Ascii.VT, 75, -93, -22, -19, -74, 92, 91, 92, 71, -74, -78, -80, -22, 76, 32, 100, 35, -56, -57, -62, -39, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 19, com.google.common.base.Ascii.VT, 74, -20, -24, -22, -80, com.google.common.base.Ascii.SYN, 122, 62, 121, -119, -100, -125, -46, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, Byte.MAX_VALUE, 118, 43, -52, -123, -28, -1, 5, com.google.common.base.Ascii.SUB, 2, 66, -82, -91, -31, -73, 87, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, com.google.common.base.Ascii.ESC, 1, -19, -13, -20, -9, 116, kotlin.io.encoding.Base64.padSymbol, 37, 104, -110, Byte.MIN_VALUE, -114, -41, 113, 117, com.visa.cbp.getEncExpo.IResultReceiver, 45, -117, -117, -127, -36, 57, 44, 38, 116, -104, -47, -80, -85, 81, 78, 86, com.google.common.base.Ascii.SYN, -6, -15, -75, -14, com.google.common.base.Ascii.US, 86, 69, 19, -13, -5, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -127, 39, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 32, 103, -102, com.visa.cbp.getEncExpo.registerForActivityResult, -97, -124, 120, 109, 116, 111, -111, -110, -44, -114, 98, 97, 110, com.visa.cbp.getEncExpo.IResultReceiver, -116, -123, -127, -63, 103, com.google.common.base.Ascii.VT, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 8, -8, -19, -14, -93, 71, 14, com.google.common.base.Ascii.GS, 75, -85, -93, -25, -39, Byte.MAX_VALUE, 122, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 39, -58, -59, -127, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ESC, 17, 81, -71, com.visa.cbp.getEncExpo.onUnminimized, -111, -118, 103, 100, 121, 98};
        byte[] bArr15 = new byte[com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE];
        byte[] bArr16 = {107, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -119, 102};
        byte b6 = 0;
        for (int i5 = 0; i5 < 194; i5++) {
            bArr15[i5] = (byte) ((b6 ^ bArr14[i5]) ^ bArr16[i5 & 3]);
            b6 = bArr14[i5];
        }
        d = new java.lang.String(bArr15, java.nio.charset.StandardCharsets.UTF_8).split(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        byte[] bArr17 = {56, -55, 75, 35, 64, -89, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 32, com.google.common.base.Ascii.CAN, -23, 107, 3, com.visa.cbp.getEncExpo.IResultReceiver2, -121, 17, 37, 80, -69, 46, 63, 7, -10, 116, com.google.common.base.Ascii.FS, Byte.MAX_VALUE, -104, 14, 58, 94, -66, 44, 89, 68, -23, 97, 3, 103, -111, com.google.common.base.Ascii.SI, 121, 65, -69, 34, 80, 41, -95, 117, com.google.common.base.Ascii.CAN, 106, -122, com.google.common.base.Ascii.EM, 109, 8, -91, 60, 78, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 107, 3, 118, -99, 8, com.google.common.base.Ascii.EM, 33, -58, 73, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE};
        byte[] bArr18 = new byte[68];
        byte[] bArr19 = {com.google.common.base.Ascii.ETB, -126, -5, com.google.common.base.Ascii.ESC};
        byte b7 = 0;
        for (int i6 = 0; i6 < 68; i6++) {
            bArr18[i6] = (byte) ((b7 ^ bArr17[i6]) ^ bArr19[i6 & 3]);
            b7 = bArr17[i6];
        }
        java.lang.String[] split3 = new java.lang.String(bArr18, java.nio.charset.StandardCharsets.UTF_8).split(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(split3, "");
        e = split3;
    }
}
