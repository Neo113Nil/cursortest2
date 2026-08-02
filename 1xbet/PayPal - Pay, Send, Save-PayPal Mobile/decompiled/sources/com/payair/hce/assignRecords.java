package com.payair.hce;

/* loaded from: classes4.dex */
public class assignRecords {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static java.lang.Object SdkCoreCardRiskManagementDataImpl;
    private static long SdkCoreContactlessPaymentDataImpl;
    private static int buildRecords;
    private static java.lang.Object getAdditionalCheckTable;
    private static byte[] getCardholderValidators;
    private static long getCdol1RelatedDataLength;
    public static final java.util.Map getCvmResetTimeout;
    private static byte[] getMagstripeCvmIssuerOptions;
    public static final java.util.Map getMchipCvmIssuerOptions;
    private static long getPpseFci;

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    static {
        /*
            Method dump skipped, instructions count: 7590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.payair.hce.assignRecords.<clinit>():void");
    }

    public static int DigitizedCardProfile(int i) {
        int i2 = $10 + 19;
        int i3 = i2 % 128;
        $11 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        java.lang.Object obj = SdkCoreCardRiskManagementDataImpl;
        $10 = (i3 + 49) % 128;
        try {
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i)};
            byte[] bArr = $$a;
            int intValue = ((java.lang.Integer) java.lang.Class.forName($$c(558, bArr[284], bArr[13]), true, (java.lang.ClassLoader) getAdditionalCheckTable).getMethod($$c(1111, bArr[7], bArr[317]), java.lang.Integer.TYPE).invoke(obj, objArr)).intValue();
            $10 = ($11 + 3) % 128;
            return intValue;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int values(java.lang.Object obj) {
        int i = $10 + 99;
        int i2 = i % 128;
        $11 = i2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.Object obj2 = SdkCoreCardRiskManagementDataImpl;
        int i3 = i2 + 9;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        $10 = (i2 + 69) % 128;
        try {
            byte[] bArr = $$a;
            return ((java.lang.Integer) java.lang.Class.forName($$c(558, bArr[284], bArr[13]), true, (java.lang.ClassLoader) getAdditionalCheckTable).getMethod($$c(1111, bArr[7], bArr[317]), java.lang.Object.class).invoke(obj2, obj)).intValue();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void init$0() {
        $10 = ($11 + 43) % 128;
        byte[] bArr = new byte[1127];
        java.lang.System.arraycopy(";V\u008d»ð\u0007ï\u0000\u0003\u00023Äò\u000eî\u0005ü\u0003íBèÑ\u0000úúò\nýôñÿ;¼\få\u0015õô@Ä\u0002û3Êê\tú\u0005\u000bòòô\r\u000fýñÿ<»\få\u0015õôAÃ\u0002ûð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001úë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þÿî+Úú\u0004ï,Øôÿî.Ñ\bü\u001fßûø\u0000\u001eØôÿî.ßûø\u0000\u001eØôÈ\u0000ê\u0010/È\u0000ê\u0010/\u0006è\u00120Â÷>åÚú\u0004\u0006è\u00120Â÷>·\u0004ú\tøô\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõÿî!Û\u0000ü\bðûøñ\bü\u0003ùÿûø\u0000ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\föé\u0013ø÷ÿð\u0014â\u0006ò\f\u0012÷\u0013õ\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñôúù\u000b\u0012ú\u0010õËëý\u000bîþAÉñÿ;¼\få\u0015õô@Ä\u0002û3õþÎ2ûÉÿ/ù\u0000ø\u0003ûÌ*ýÒ3ÿî\u001fêï\u0001÷\u0000\fû\u0006è\u00120½\u0006îCÖ\u0000\u0003ÿî!ìê\t\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñ\n\u0001ú\u001bÎ\u0006ýð\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ññÿ<»\få\u0015õôAÃ\u0002û4Êëý\u0007ÿö\u0014óòý\u0004î\u001fêö\bê\fþ\u001dàê\u0010ñÿ<»\få\u0015õôAÃ\u0002û4Éê\tú\u0005\u000bòòô\r\u000fýØÿûò\bì\u0012þ\u001eßì\u000b\u0011Û\u0000\u0006úú\u0004\u0005ÿö\n\u0001ú\u000bî\u001fê\u0001ú\u0012Þÿð\u0012ù\u0011õ\u0002\u0006ò\fÿî+ÿ\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú÷\b\b\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ú\u000bú\u001dÜêÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tüö\u0004î\fÿî.Ô\bëý$Ú\u000búüð\u0006è\u00120¶þ\bú;±\u000eö?Ñîö$Øûøþ\u001eÜÿ\n\u0001ñÿî#æê\u0001,Ô÷ÿö\u0006è\u00120¶þ\bú;±\u000eö?Ñîö(Ô÷ÿöÿî\u001eçì\u0012\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñ\u0002*Æ\u0002\f!Ìý\u000eå\u0006è\u00120Â÷>èÔúù\u000b\u0001üó\u0004\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþð\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüð\u0002\u000eî\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüð\fê\t\u0019àóü\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þÿî.Ñÿúþþ\u0006ô÷\u001dØ\u0006\b\u0012õ\u0015õú\u000bú\u001eÔ\bëýñÿ;¼\få\u0015õô@Ä\u0002û3Ëëý\u0007ÿö\u0019êÿñú\u000bîL¹Ëëý\u000bîþAÉñÿ;¼\få\u0015õô@Ä\u0002û3øË2Ì*Í0Í/úûþÿÿù\u0001É4\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïH\u0002\u0006ò\f\u0010êò\u0001\bûû".getBytes("ISO-8859-1"), 0, bArr, 0, 1127);
        $$a = bArr;
        $$b = 89;
        int i = $11;
        $10 = ((i ^ 79) + ((i & 79) << 1)) % 128;
    }

    public static java.lang.Object writeReplace(char c, int i, int i2) {
        int i3 = $10;
        $11 = ((i3 & 81) + (i3 | 81)) % 128;
        java.lang.Object obj = SdkCoreCardRiskManagementDataImpl;
        $11 = ((i3 & 45) + (i3 | 45)) % 128;
        try {
            java.lang.Object[] objArr = {java.lang.Character.valueOf(c), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)};
            byte[] bArr = $$a;
            return java.lang.Class.forName($$c(558, bArr[284], bArr[13]), true, (java.lang.ClassLoader) getAdditionalCheckTable).getMethod($$c(584, bArr[10], bArr[35]), java.lang.Character.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(obj, objArr);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x00b4 -> B:4:0x00cd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(int i, int i2, int i3) {
        int i4;
        int i5 = $10;
        int i6 = (((i5 | 109) << 1) - (i5 ^ 109)) % 128;
        $11 = i6;
        int i7 = i + 4;
        byte[] bArr = $$a;
        int i8 = -i3;
        int i9 = i8 * 71;
        int i10 = ~i8;
        int i11 = ~((i10 ^ 41) | (i10 & 41));
        int i12 = ~((i ^ 41) | (i & 41));
        int i13 = ((((i9 | (-2829)) << 1) - (i9 ^ (-2829))) - (~(-(-(((i12 & i11) | (i12 ^ i11)) * (-140)))))) - 1;
        int i14 = (i8 ^ 41) | (i8 & 41);
        int i15 = (~((i14 ^ i) | (i14 & i))) * 70;
        int i16 = ~((i8 & (-42)) | (i8 ^ (-42)));
        int i17 = (i11 ^ i16) | (i11 & i16);
        int i18 = ~(i8 | i);
        int i19 = ((((i13 | i15) << 1) - (i15 ^ i13)) - (~(-(-(((i18 ^ i17) | (i18 & i17)) * 70))))) - 1;
        int i20 = -i2;
        int i21 = ((i20 | 119) << 1) - (i20 ^ 119);
        byte[] bArr2 = new byte[i19];
        int i22 = (i19 & 89) + (i19 | 89);
        int i23 = ((i22 | (-90)) << 1) - (i22 ^ (-90));
        if (bArr == null) {
            int i24 = (i6 + 5) % 128;
            $10 = i24;
            $11 = (((i24 | 105) << 1) - (i24 ^ 105)) % 128;
            int i25 = i7;
            int i26 = 0;
            int i27 = i23;
            int i28 = -i21;
            int i29 = ((i28 * (-515)) - (~(i27 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CERTIFICATE))) - 1;
            int i30 = ~i27;
            int i31 = ~((i30 ^ i) | (i30 & i));
            int i32 = ~i;
            int i33 = ~((i32 ^ i28) | (i32 & i28));
            int i34 = (i31 ^ i33) | (i31 & i33);
            int i35 = ~((i32 & i27) | (i32 ^ i27));
            int i36 = -(-(((i34 ^ i35) | (i34 & i35)) * (-516)));
            int i37 = ~i28;
            int i38 = (i30 ^ i37) | (i30 & i37);
            int i39 = ~((i38 ^ i) | (i38 & i));
            int i40 = (i32 ^ i37) | (i37 & i32);
            int i41 = ~((i40 ^ i27) | (i40 & i27));
            int i42 = (i29 & i36) + (i29 | i36) + (((i41 & i39) | (i39 ^ i41)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR);
            int i43 = ~((i37 & i27) | (i37 ^ i27));
            int i44 = -(-(((i43 ^ i35) | (i43 & i35)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR));
            int i45 = (i42 & i44) + (i44 | i42);
            i21 = (i45 ^ (-3)) + ((i45 & (-3)) << 1);
            i7 = i25;
            i4 = i26;
            int i46 = ((i7 | (-114)) << 1) - (i7 ^ (-114));
            int i47 = ((i46 | 115) << 1) - (i46 ^ 115);
            bArr2[i4] = (byte) i21;
            if (i4 == i23) {
                java.lang.String str = new java.lang.String(bArr2, 0);
                int i48 = $10 + 53;
                $11 = i48 % 128;
                if (i48 % 2 != 0) {
                    return str;
                }
                throw null;
            }
            int i49 = bArr[i47];
            int i50 = $10;
            $11 = ((i50 & 31) + (i50 | 31)) % 128;
            i26 = (i4 ^ (-121)) + ((i4 & (-121)) << 1) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
            i25 = i47;
            i27 = i21;
            i21 = i49;
            int i282 = -i21;
            int i292 = ((i282 * (-515)) - (~(i27 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CERTIFICATE))) - 1;
            int i302 = ~i27;
            int i312 = ~((i302 ^ i) | (i302 & i));
            int i322 = ~i;
            int i332 = ~((i322 ^ i282) | (i322 & i282));
            int i342 = (i312 ^ i332) | (i312 & i332);
            int i352 = ~((i322 & i27) | (i322 ^ i27));
            int i362 = -(-(((i342 ^ i352) | (i342 & i352)) * (-516)));
            int i372 = ~i282;
            int i382 = (i302 ^ i372) | (i302 & i372);
            int i392 = ~((i382 ^ i) | (i382 & i));
            int i402 = (i322 ^ i372) | (i372 & i322);
            int i412 = ~((i402 ^ i27) | (i402 & i27));
            int i422 = (i292 & i362) + (i292 | i362) + (((i412 & i392) | (i392 ^ i412)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR);
            int i432 = ~((i372 & i27) | (i372 ^ i27));
            int i442 = -(-(((i432 ^ i352) | (i432 & i352)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR));
            int i452 = (i422 & i442) + (i442 | i422);
            i21 = (i452 ^ (-3)) + ((i452 & (-3)) << 1);
            i7 = i25;
            i4 = i26;
            int i462 = ((i7 | (-114)) << 1) - (i7 ^ (-114));
            int i472 = ((i462 | 115) << 1) - (i462 ^ 115);
            bArr2[i4] = (byte) i21;
            if (i4 == i23) {
            }
        } else {
            i4 = 0;
            int i4622 = ((i7 | (-114)) << 1) - (i7 ^ (-114));
            int i4722 = ((i4622 | 115) << 1) - (i4622 ^ 115);
            bArr2[i4] = (byte) i21;
            if (i4 == i23) {
            }
        }
    }

    private assignRecords() {
    }
}
