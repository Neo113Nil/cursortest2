package com.payair.hce;

/* loaded from: classes4.dex */
public class readValue extends com.payair.hce.getReasonCode<java.lang.Byte> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static char[] DigitizedCardProfile;
    private static int valueOf;
    private static long values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = (s2 * 2) + 1;
        byte[] bArr = $$a;
        int i4 = 718 - s;
        int i5 = 38 - (s3 * 34);
        char[] cArr = new char[i3];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i5++;
            i4 = (i6 + i4) - 2;
            i = i2;
            i2 = i + 1;
            cArr[i] = (char) i4;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i6 = i4;
            i4 = bArr[i5];
            i5++;
            i4 = (i6 + i4) - 2;
            i = i2;
            i2 = i + 1;
            cArr[i] = (char) i4;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            cArr[i] = (char) i4;
            if (i2 == i3) {
            }
        }
    }

    private static void c(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2 = 99 - (b * 3);
        int i3 = s * 3;
        int i4 = (i * 4) + 4;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 = (-i2) + i3;
            i4++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2 = (-bArr[i4]) + i2;
            i4++;
            i5 = i6;
        }
    }

    /* synthetic */ readValue(byte b) {
        this();
    }

    @Override // com.payair.hce.getReasonCode
    public final com.payair.hce.transactionCanBeResumed valueOf() {
        java.lang.Object obj;
        int i = AlternateContactlessPaymentDataJson + 9;
        valueOf = i % 128;
        int i2 = i % 2;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        if (i2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a((-1) >> (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)), (char) (19005 / android.view.KeyEvent.keyCodeFromString("")), 5 / android.view.View.MeasureSpec.getSize(1), objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a((uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)) - 1, (char) (android.view.KeyEvent.keyCodeFromString("") + 19797), 2 - android.view.View.MeasureSpec.getSize(0), objArr2);
            obj = objArr2[0];
        }
        return com.payair.hce.transactionCanBeResumed.values(((java.lang.String) obj).intern());
    }

    private readValue() {
        try {
            valueOf(com.payair.hce.transactionCanBeResumed.writeReplace(1));
        } catch (com.payair.hce.postToastMessageOnUi unused) {
        }
    }

    public static com.payair.hce.setMobilePin<java.lang.Byte> values() {
        com.payair.hce.setMobilePin<java.lang.Byte> setmobilepin = new com.payair.hce.setMobilePin<java.lang.Byte>() { // from class: com.payair.hce.readValue.3
            private static int DigitizedCardProfile = 0;
            private static int values = 1;

            public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
                return valueOf(objArr);
            }

            private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
                com.payair.hce.readValue readvalue = new com.payair.hce.readValue((byte) 0);
                int i = values;
                int i2 = (i & (-26)) | ((~i) & 25);
                int i3 = (i & 25) << 1;
                int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
                DigitizedCardProfile = i4 % 128;
                if (i4 % 2 == 0) {
                    return readvalue;
                }
                throw new java.lang.ArithmeticException();
            }

            @Override // com.payair.hce.setMobilePin
            public final com.payair.hce.getReasonCode<java.lang.Byte> valueOf() {
                return (com.payair.hce.getReasonCode) DigitizedCardProfile(new java.lang.Object[]{this}, -1690474094, 1690474094, java.lang.System.identityHashCode(this));
            }
        };
        int i = AlternateContactlessPaymentDataJson + 25;
        valueOf = i % 128;
        if (i % 2 != 0) {
            return setmobilepin;
        }
        throw null;
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(DigitizedCardProfile[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 48, 381 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (62388 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)));
                    byte b = (byte) ($$e - 3);
                    byte b2 = b;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(values), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 3967 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 212 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            $11 = ($10 + 113) % 128;
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 34, android.text.TextUtils.getOffsetBefore("", 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.text.TextUtils.indexOf("", "", 0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
            $10 = ($11 + 59) % 128;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // com.payair.hce.getReasonCode
    public final void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed) throws com.payair.hce.postToastMessageOnUi {
        super.valueOf(transactioncanberesumed);
        java.lang.Byte b = null;
        if (transactioncanberesumed != null) {
            int i = valueOf + 73;
            AlternateContactlessPaymentDataJson = i % 128;
            if (i % 2 == 0) {
                if (transactioncanberesumed.DigitizedCardProfile() != 0) {
                    b = java.lang.Byte.valueOf(transactioncanberesumed.AlternateContactlessPaymentDataJson(0));
                }
            } else {
                transactioncanberesumed.DigitizedCardProfile();
                throw null;
            }
        }
        super.AlternateContactlessPaymentDataJson(b);
        valueOf = (AlternateContactlessPaymentDataJson + 43) % 128;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        AlternateContactlessPaymentDataJson = 0;
        valueOf = 1;
        char[] cArr = new char[1709];
        java.nio.ByteBuffer.wrap("\u0013Ã\u0091ÀHdÊVLÜÏVA\u0080ÄqFòÙh[çÞlP\u0098Ó\u000bU\u008fè1j´í8o¿â0d¬æÃyLûù~^ðäsrõù\bdw<õ\u000es\u0084ð\u000e~Øû)yªæ0d¿á4oÀìSj××iUýÒmPóÝ\u007f[ÎÙ\u008cF\u0017Ä\u008cA\u0016Ï¸L/X\u001aÚ(\\¢ß(QþÔ\u000fV\u008cÉ\u0016K\u0099Î\u0012@æÃuEñøOzØý[\u007fËò_^\u0080Ü¥Z$Ù·WdÒ\u009fP\u0016Ï\u0084M\u0012È\u0082FpÅ³Cdþå|]ûÜyYôÏr^ð<o\u0084í h¨æ\u0004e\u0083ã\u001b\u001e\u0097\u009c\u0015éøkËíQnßà\u001ceîçfx¶úo\u007fäñ\u0002r\u0094ð\u008dr¾ô$wªùi|\u008cþ\u001da\u0080ãDf\u0093èjkþí~^\u0080Ü¥Z9Ù§W*Ò\u0080P\u001dÏÏM5È¨FXÅóCuþï|uûÙyKôÇ^\u0080Ü¥Z$Ù·W?Ò\u0097P\u0014ÏÏM\u000bÈ\u0087FwÅ³Coþã|SûÖy]ô\u0088r^ð;I\u0083ËñMtÎä@jÅÄ.Á¬ä*e©ö'~¢Ö U¿\u008e=D¸Æ6:µò3,\u008e®\f\u001d\u008b\u008c\t(\u0084ª\u0002A\u0080{\u001fÿ\u009dn\u0018ý\u0096\u001c\u0015Õ\u0093PnÊìYk é4d¬^\u0080Ü¥Z$Ù·W?Ò\u0097P\u0014ÏÏM\u0005È\u0087F{Å³Cmþï|\\ûÍyiôër\u0000ð$o©í-h¹}\u0099ÿ¼y=ú®t&ñ\u008es\rìÖn\u0012ë\u009eenæª`vÝú_JØÏZC×ÒQAÓ\u001bL\u008fÎ+K¢Å\u0006F\u009eÀI=\u008f¿\u001a^\u0080Ü²Z8Ù²WdÒ\u009cP\u001cÏ\u008dM\u0012È\u0089F`ÅùCpþþ í¢\u0089$C§\u0096)\u000e¬«.%±´3y¶¶8J»ß=G\u009a\u0006\u0018t\u009eû\u001dp\u0093é\u0016\u001b\u0094Ð\u000bB\u0089ÔCDÁbGëÄoJìÏ\u0019MÛÒMPÏÕO[¢Ø!^´ã:a\u0090æ\u0011d\u0088^ÁÜ³Z0Ù±W8Ò\u0094^ÝÜ¹ZsÙ´W9Ò\u009dP\u001dÏ\u0095M\u0004È\u009aF;ÅñCbþä|DûÞy^ôÅrYð!o©í'h»^ÈÜ³Z3Ù½\u008f\u008d\rà\u008bf\bè\u0086l\u0003À^\u0080Ü¦Z/Ù«W(ÒÝP\u0014Ï\u008fM\u0003È\u009bFyÅùCp^ÙÜ´Z2Ù¼W,Ò\u0087P\u001cÏ\u0093M\u00133¤±ÿ7\u007f´ñ:j¿Ñ=A¢Å D¥Ì^ÚÜ¸Z6ÙªW$Ò\u0085P\u0017Õ¡WÓÑBRÆÜKYöÛaDà\u008d \u000fD\u0089\u008e\nI\u0084Ä\u0001`\u0083à\u001ch\u009eù\u001bg\u0095Æ\u0016\u0005\u0090\u009b-\u0001¯¥(&ª§¸\u00ad:À¼F?È±\u00074°¶}\u0011Ü\u0093§\u0015'\u0096µ\u0018-\u009d\u008f\u001f\u000e\u000e\u0019\u008cb\nâ\u0089p\u0007è\u0082J\u0000Ë\u009fn\u001dÎ\u0098\u0007\u0016ò^ÈÜ³Z3Ù¡W9Ò\u009bP\u001aÏ¿M\u001fÈÖF#ÅÃC5þ¾^ÝÜ¹ZsÙ´W9Ò\u009dP\u001dÏ\u0095M\u0004È\u009aF;ÅñClþî|TûÔ^ÜÜ²Z6^ÊÜ»Z(Ù¨W*Ò\u0086P\u0016Ï\u0092\u0018\t\u009aA\u001cÊ\u009f\u0003\u0011þ\u0094`\u0016ð\u0089s\u000bé\u008ed\u0000\u0097\u0083[\u0005\u0082¸\u0002:¤½\u007f?\u009b²)4¸¶Ü)Q«À^îÜ¸Z9Ù¶W$Ò\u009bP\u001dÏÀM4ÈªF^Å¼Caþÿ|XûÔyKô\u0086rKð;o©íbh±æHeÁNÔÌ\u0082J\u0003É\u008cG\u001eÂ¡@'ßú]\u000eØ\u0090VdÕ\u0086S[îÅlbëîiqä¼bqà\u0001\u007f\u0093ýXx\u008böruûó\u001b\u000eé\u008cbQ·ÓÓU\u0019ÖÆX@Ýê_wÀýBlÇöI\u001a´é6\u0098°\u00103\u0081½\f8ºº+%©^ÙÜ´Z2Ù¼WsÒÄ²Þ0´¶05¤» >\u0084^ÝÜ¹ZsÙ´W9Ò\u009dP\u001dÏ\u0095M\u0004È\u009aF;ÅþCqþë|_ûÜ^ÝÜ¹ZsÙ¯W.Ò\u0080P\u0017Ï\u0085M\u000bÈÀFdÅùCnþÿ^\u009e\u001bë\u0099\u008f\u001fE\u009c\u0081\u0012\u0018\u0097§\u0015:\u008a¤\b4r«^ÝÜ¹ZsÙ¦W>Ò\u009bP\u0015Ï\u0084MIÈ\u009eFgÅóCgþÿ|RûÌ\u0018Ü\u009a¶\u001c$\u009f½\u0011\u0001\u0094\u009f\u0016T\u0089Ã]\rßiY£ÚvTîÑKSÅÌTN\u0099ËXE¬Æ\"@´ý?\u007f\u0093ø\u0018z\u009d÷\u001fq\u0093óðòAp:öºu(û°~\u0012ü\u0093cFá\u009dd\u0003ê÷i:ïíRfÐÖWTÕÄXFÞÇ\t\u000e\u008bu\rõ\u008eg\u0000ÿ\u0085]\u0007Ü\u0098y\u001aÙ\u009f\u0010\u0011å\u0092u\u0014¶©(+\u009c¬!.\u0081£X%Ý§½8zºá?a±Ó2C´ÑI@ËõL-ÎäCqÏ¶MÍËMHßÆGCåÁd^±Ü~Yÿ×\u0004T\u0085Ò\u0011o\u0091í\u0010jµè%e³ã|aMþÀ|RùÒw|ôàrc^ÈÜ³Z3Ù¡W9Ò\u009bP\u001aÏÏM\u0011È\u008cFzÅäC;þ¼|Aû\u0097yIôÄrBð,oãíth¹±Ø3©µ\"6³¸7=\u0087¿F \u0083¢\u0013'\u0095©Z*ë¬c\u0011ò\u0093N\u0014Æ\u0096J\u001bé\u009dE\u001f|\u0080ý\u0002}\u0087¾\t\u0005\u008a\u0089\f\u000bñ\u0087s\u0015ôàvUûé} þ©\u0083@\u0001$\u0087î\u0004;\u008a¹\u000f\u0000\u008d\u0090\u0012\u0011\u0090\u0095\u0015\u0012\u009bì\u0018d\u009eì^ÝÜ¹ZsÙ¦W$Ò\u009dP\rÏ\u0089M\nÈ\u008fFrÅùC-þè|DûÑySôÂr\u0003ð2o²í,h®æ\u0015e\u0085ã\u000e\u001e\u0097\u009c\u0005\u001bý\u0099n^îÜ¸Z9Ù¶W$Ò\u009bP\u001dÏÍM\u001fÈÖF#^ÝÜ¹ZsÙ¦W>Ò\u009bP\u0015Ï\u0084MIÈ\u008aF|ÅïCsþæ|PûÁy\u0011ôÏrI^ÛÜ³Z.Ù°Wf^ÆÜ¸Z4Ù°WeÒ\u0081P\u000fÏ\u0083MIÈ\u009fFpÅñCvþ§|AûÊyPôÖr^^ÞÜ³Z0Ù±WeÒ\u009aP\u000eÏÎM\nÈ\u008fF|ÅòChþï|HûË$¯¦Â A£À-\u0014¨ð*nµ¿7p²þ<\u000f¿\u00889-\u0084\u0098\u0006!\u0081¤\u0003+\u008e¥\b=^ÞÜ³Z0Ù±WeÒ\u0081P\u001fÏÎM\u000bÈ\u008dFqÅÃCgþï|_ûËyVôÒrTE\nÇnA¤ÂxLùÉWKÀÔRVÜÓ\u0017]£Þ%X°å/g\u0089à\u0006b\u008cï_i\u008bëætaöàsz^ÝÜ¹ZsÙ¦W$Ò\u009dP\rÏÎM\u0016È\u008bFxÅéC-þë|GûÜy`ôÈrLð9o¾\u001cÙ\u009e½\u0018w\u009b¯\u0015+\u0090\u009b\u0012S\u008d\u0086\u000f\u0016\u008a\u0083\u0004}\u0087ü\u0001)¼è>\\¹Ò;\\¶Ç0[² -\u00ad¯/*£¤\u00004,¶H0\u0082³E=È¸l:ì¥d'õ¢k,Ê¯\u000f)\u0087\u0094\u0012\u0016¬\u0091-\u0013à\u009e1\u0018µ\u009aË\u0005M\u0087Ö\u0002J\u008cñ\u000ft\u0089ætzöév×ô³ryñ½\u007f8ú\u008bx\u0007ç\u008fe\u0000àÊn}íãk`ÖìT_Ó\u009cQSÜÅZIØ9G´Å:@³Î\bM\u0094Ë\u001a6\u009b^ÝÜ¹ZsÙ·W2Ò\u0081P\rÏ\u0085M\nÈ±FpÅäCwþ¤|SûÍyVôÊrIðzo½í+h§æ\u0017e\u0092ã\f\u001e\u0095\u009c\u001e\u001bú\u0099t\u0014õn\u0014ìpjºé{gçâU`ÔÿF}Üø\tv¾õ s£Î/L\u009cË_I\u0090Ä\u0006B\u008aÀú_wÝùXpÖËUWÓÙ.X^ÝÜ¹ZsÙ²W.Ò\u009cP\u001dÏ\u008fM\u0015È±FqÅðChþç|\u001fûÚyJôÏrAð0oõí$h æ\u001ee\u0090ã\u001b\u001e\u0097\u009c\u001c\u001bá\u0099s\u0014ï\u0092|^\u0095^\u0080Ü²Z8Ù²WdÒ\u0083P\u001cÏ\u008dM\u0012È±FeÅõCsþï9\u0091»£=)¾£0uµ\u00907\u0007¨\u0092*\u001d¯\u009a!p¢¢$p\u0099ú\u001bS\u009cÌ\u001eL\u0093Ö\u0015R\u0097!\b\u0095\u008a4\u000f½\u0081\u000f\u0002\u009f\u0084\u000b^\u0080Ü²Z8Ù²WdÒ\u0081P\u0016Ï\u0083M\fÈ\u008bFaÅ³Cdþï|_ûÁy[^\u0080Ü²Z8Ù²WdÒ\u0081P\u0016Ï\u0083M\fÈ\u008bFaÅ³Crþï|\\ûÍy[^\u0080Ü¥Z$Ù·WdÒ\u0083P\u001cÏ\u008dM\u0012È±FaÅîCbþé|TÒzP_ÖÞUMÛÅ^mÜîC5ÁñD}Ê\u008dIIÏ\u0095r\u0019ð©w!õ\u009ax1þ¶|ÂãMa×äPjÕéioá\u0092}\u0010ã\u0097\u000e\u0015¿\u0098\n\u001e\u0097\u009d\u0018\u0003¹\u0086i\u0004\u00ad\u008b>^\u0080Ü²Z8Ù²WdÒ\u0090P\nÏ\u0094M8È\u0089FeÅï^\u0080Ü²Z8Ù²WdÒ\u0090P\nÏ\u0094M8È\u009aF|ÅñCf^\u0080Ü²Z8Ù²WdÒ\u0081P\u0016Ï\u0083M\fÈ\u008bFaÅ³Caþù|EûÞyPôÊrIð1o©í&\u0091/\u0013\n\u0095\u008b\u0016\u0018\u0098\u0090\u001d8\u009f»\u0000`\u0082¤\u0007(\u0089Ø\n\u001c\u008cÀ1L³ü4u¶ã;}½ä?\u0094 \u0018\"\u0089§\u0003)\u00adª\u0007,»Ñ$SªÔ\u0012VÆÛA^\u0080Ü²Z8Ù²WdÒ\u0090P\nÏ\u0094M\u0006È\u008dFvÅù\u001dN\u009f|\u0019ö\u009a|\u0014ª\u0091^\u0013Ä\u008cZ\u000eÎ\u008bY\u0005©\u0086=¡ë#Ù¥S&Ù¨\u000f-û¯a0ÿ²a7à¹\u0019:\u0099^\u0080Ü²Z8Ù²WdÒ\u0090P\nÏ\u0094M\bÈ\u009cF|Åù\u00adÙ/ë©a*ë¤=!É£S<Í¾H;Úµ?6¢\u0086»\u0004\u0089\u0082\u0003\u0001\u0089\u008f_\n«\u00881\u0017¯\u0095,\u0010²\u009eO\u001dÎ\u009bH&Ò\u009e\u0083\u001c±\u009a;\u0019±\u0097g\u0012\u0093\u0090\t\u000f\u0097\u008d;\b\u0084\u0086{\u0005ú^\u0080Ü²Z<Ù°W*ÒÝP\u001dÏ\u008fM\u0010È\u0080FyÅóCbþî|Bû\u0097y\u0011ôÞrOð{o¹í1h½æ\u001b\u001e#\u009c\u0018\u001a\u0090\u0099\u0013\u0017Ç\u0092&\u0010³\u008f-\r \u0088\"\u0006Á\u0085L\u0003\u008f¾k<á»o9Ï´m2ï°\u0085/\u001d\u00ad\u0085(,¦¼%8£¹^#Ü½R\u0086Ð V)Õ\u00ad[.ÞÛ\\\u0016Ã\u0089A\u0011Ä\u0087JaÉîOvþ/|\u0000ú\u008byT÷Á^\u0080Ü¦Z/Ù«W(ÒÝP\nÏ\u0085M\u000bÈ\u0088F:ÅñCbþú|B>\u0018¼t:ì¹x7÷²M0Ê¯\u001e-Ð¨Q&©¥(#µ\u009e3\u001c\u0092\u009b\u0000\u0019Á\u0094\u0005\u0012\u0092gHå4c´à\bn\u008cë<i¡ö4t\u008eñ\u0016\u007fêü9zûÇnw!õ\u0012s\u0088ð\u0006~Åû>y½æ%d¯á.oëì^jÍ×OUõÒzPíÝ)[ôÙ\u0098F\u0016^ÍÜºZ(Ù¡W8Ò\u0086P\u0018Ï\u0083M\fÈ\u009d,g®T(Î«@%\u0083 x\"ñ½r?îº}4\u0081\u001e\u009e\u009c¬\u001a\"\u0099®\u00174\u0092Ã\u0010\u0003\u008f\u0091\r\u000e\u0088\u009e\u0006g\u0085í\u0003|¾ð<\\»\u00899\u000f´Ü2C°e/¤\u00ad,(§¦\u001d%Ç£\u0018^\u0096Ü\u001eÐ¸RÜ\u0001\u0012\u00834\u0005½\u00869\bº\u008dO\u000f\u0088\u0090\u0002\u0012\u0080\u0097\u0015\u0019é\u009ah\u001cþ^èÜ¹Z1Ù W-Ò\u009bP\nÏ\u0088^\u0080Ü²Z<Ù°W*ÒÝP\u0014Ï\u0089M\u0014È\u008dF:ÅìCqþå|WûÑySôÃr^ð{o¸í7h»æ_eÇãQ\u001e\u0086\u009c\u0003\u001bþ\u00994\u0014ì\u0092a\u0011ì\u008fD\nÒ\u0088R\u0007Â\u0085 \u0003-¾î<*»«9\u0018´\u00892\n±\u0087/t".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1709);
        DigitizedCardProfile = cArr;
        values = -8065426162263532330L;
    }

    static void init$1() {
        $$d = new byte[]{68, 85, -28, -99};
        $$e = 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0cd7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0d9e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x25a1 A[Catch: all -> 0x01c9, TryCatch #2 {all -> 0x01c9, blocks: (B:6:0x00d3, B:8:0x00e6, B:9:0x012f, B:18:0x01f0, B:20:0x0229, B:21:0x0278, B:30:0x0314, B:32:0x0327, B:33:0x0371, B:40:0x052d, B:42:0x056a, B:43:0x05ba, B:46:0x05d0, B:48:0x05df, B:49:0x0623, B:55:0x06dc, B:57:0x0715, B:58:0x0769, B:62:0x07c6, B:64:0x07d9, B:65:0x0825, B:71:0x08cd, B:73:0x090a, B:74:0x0960, B:81:0x0a12, B:83:0x0a25, B:84:0x0a6f, B:92:0x0b5a, B:94:0x0ba3, B:95:0x0bf9, B:99:0x0c33, B:101:0x0c46, B:102:0x0c8d, B:111:0x0cef, B:113:0x0d32, B:114:0x0d88, B:118:0x0dee, B:120:0x0e01, B:121:0x0e50, B:127:0x0ee8, B:129:0x0f24, B:130:0x0f7b, B:134:0x0fb5, B:136:0x0fc8, B:137:0x100e, B:143:0x1064, B:145:0x10b5, B:146:0x1108, B:150:0x1169, B:152:0x117c, B:153:0x11c8, B:159:0x13cb, B:161:0x1404, B:162:0x1457, B:165:0x146d, B:167:0x147c, B:168:0x14bd, B:172:0x1559, B:174:0x15a5, B:175:0x15fc, B:179:0x1613, B:181:0x162b, B:182:0x1670, B:188:0x1732, B:190:0x177c, B:191:0x17ce, B:195:0x180f, B:197:0x1822, B:198:0x1865, B:200:0x186e, B:202:0x188c, B:203:0x18dd, B:208:0x258e, B:210:0x25a1, B:211:0x25e6, B:224:0x29fc, B:226:0x2a0f, B:227:0x2a56, B:232:0x2b1f, B:234:0x2b32, B:235:0x2b80, B:247:0x2c42, B:249:0x2c7c, B:250:0x2cd0, B:280:0x2f52, B:282:0x2f9e, B:283:0x2ff4, B:298:0x315c, B:300:0x319e, B:301:0x31f2, B:305:0x322b, B:307:0x323e, B:308:0x328e, B:312:0x3336, B:314:0x3383, B:315:0x33d5, B:319:0x3403, B:321:0x3441, B:322:0x3499, B:345:0x25f2, B:347:0x2610, B:348:0x2660, B:354:0x2210, B:356:0x2223, B:357:0x226a, B:383:0x2308, B:385:0x2353, B:386:0x23a7, B:391:0x24b5, B:393:0x2501, B:394:0x2552, B:398:0x23d6, B:400:0x2421, B:401:0x2477, B:407:0x12aa, B:409:0x12bd, B:410:0x1307, B:426:0x0415, B:428:0x0428, B:429:0x047b), top: B:5:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x25ef  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x26ff  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x2eb6  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x2f3a  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x300a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x2f37 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x25f2 A[Catch: all -> 0x01c9, TryCatch #2 {all -> 0x01c9, blocks: (B:6:0x00d3, B:8:0x00e6, B:9:0x012f, B:18:0x01f0, B:20:0x0229, B:21:0x0278, B:30:0x0314, B:32:0x0327, B:33:0x0371, B:40:0x052d, B:42:0x056a, B:43:0x05ba, B:46:0x05d0, B:48:0x05df, B:49:0x0623, B:55:0x06dc, B:57:0x0715, B:58:0x0769, B:62:0x07c6, B:64:0x07d9, B:65:0x0825, B:71:0x08cd, B:73:0x090a, B:74:0x0960, B:81:0x0a12, B:83:0x0a25, B:84:0x0a6f, B:92:0x0b5a, B:94:0x0ba3, B:95:0x0bf9, B:99:0x0c33, B:101:0x0c46, B:102:0x0c8d, B:111:0x0cef, B:113:0x0d32, B:114:0x0d88, B:118:0x0dee, B:120:0x0e01, B:121:0x0e50, B:127:0x0ee8, B:129:0x0f24, B:130:0x0f7b, B:134:0x0fb5, B:136:0x0fc8, B:137:0x100e, B:143:0x1064, B:145:0x10b5, B:146:0x1108, B:150:0x1169, B:152:0x117c, B:153:0x11c8, B:159:0x13cb, B:161:0x1404, B:162:0x1457, B:165:0x146d, B:167:0x147c, B:168:0x14bd, B:172:0x1559, B:174:0x15a5, B:175:0x15fc, B:179:0x1613, B:181:0x162b, B:182:0x1670, B:188:0x1732, B:190:0x177c, B:191:0x17ce, B:195:0x180f, B:197:0x1822, B:198:0x1865, B:200:0x186e, B:202:0x188c, B:203:0x18dd, B:208:0x258e, B:210:0x25a1, B:211:0x25e6, B:224:0x29fc, B:226:0x2a0f, B:227:0x2a56, B:232:0x2b1f, B:234:0x2b32, B:235:0x2b80, B:247:0x2c42, B:249:0x2c7c, B:250:0x2cd0, B:280:0x2f52, B:282:0x2f9e, B:283:0x2ff4, B:298:0x315c, B:300:0x319e, B:301:0x31f2, B:305:0x322b, B:307:0x323e, B:308:0x328e, B:312:0x3336, B:314:0x3383, B:315:0x33d5, B:319:0x3403, B:321:0x3441, B:322:0x3499, B:345:0x25f2, B:347:0x2610, B:348:0x2660, B:354:0x2210, B:356:0x2223, B:357:0x226a, B:383:0x2308, B:385:0x2353, B:386:0x23a7, B:391:0x24b5, B:393:0x2501, B:394:0x2552, B:398:0x23d6, B:400:0x2421, B:401:0x2477, B:407:0x12aa, B:409:0x12bd, B:410:0x1307, B:426:0x0415, B:428:0x0428, B:429:0x047b), top: B:5:0x00d3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] DigitizedCardProfile(android.content.Context context, int i, int i2, int i3) {
        java.lang.String str;
        java.lang.Integer num;
        int i4;
        java.lang.String str2;
        int i5;
        int i6;
        int i7;
        long j;
        int i8;
        int i9;
        int i10;
        int i11;
        long j2;
        long j3;
        java.lang.String str3;
        java.lang.Object[] objArr;
        char c;
        java.lang.Object obj;
        java.lang.Object invoke;
        int i12;
        char c2;
        int i13;
        int i14;
        int i15;
        int i16;
        long j4 = 0;
        char c3 = 0;
        java.lang.Integer num2 = 0;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(465 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), 8 - android.view.KeyEvent.normalizeMetaState(0), objArr2);
        java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
        java.lang.String str4 = "";
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 2, (char) (5860 - android.view.KeyEvent.keyCodeFromString("")), 27 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(29 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (10684 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), 25 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr4);
        java.lang.String intern3 = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(53 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (1690 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), 18 - android.text.TextUtils.indexOf("", "", 0), objArr5);
        java.lang.String intern4 = ((java.lang.String) objArr5[0]).intern();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 72, (char) android.text.TextUtils.indexOf("", "", 0), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 28, objArr6);
        java.lang.String[] strArr = {intern2, intern3, intern4, ((java.lang.String) objArr6[0]).intern()};
        int i17 = 0;
        while (true) {
            if (i17 >= 4) {
                str = intern;
                num = num2;
                i4 = i;
                break;
            }
            valueOf = (AlternateContactlessPaymentDataJson + 89) % 128;
            try {
                java.lang.Object[] objArr7 = {strArr[i17]};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 36, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3161, (char) (33099 - android.widget.ExpandableListView.getPackedPositionType(j4)));
                    byte b = $$a[14];
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b((short) 618, (byte) (b - 1), b, objArr8);
                    java.lang.String str5 = (java.lang.String) objArr8[c3];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                    clsArr[c3] = java.lang.String.class;
                    obj2 = cls.getMethod(str5, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj2);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr7)).longValue();
                long j5 = i;
                long j6 = ~j5;
                num = num2;
                str = intern;
                java.lang.String[] strArr2 = strArr;
                long j7 = (334 * longValue) + 104339432137L + (((~(longValue | j5)) | (~(j6 | 314275396))) * 333) + (((~(longValue | j6)) | (~(314275396 | j5))) * 333) + 1221746135;
                int i18 = ~i;
                if (((((int) j7) & ((((72373669 | i) * 614) - 2118260281) + (((~((-1459793629) | i18)) | 67110020 | (~(1397947257 | i18))) * (-1228)) + (((~(i18 | (-1392683609))) | (~(1465057277 | i18))) * 614))) | (((int) (j7 >> 32)) & (((((-153096467) | i18) * 494) - 992460478) + (((~((-1236655476) | i18)) | (-690622867)) * 494)))) != 0) {
                    i4 = i ^ (i17 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
                    break;
                }
                i17++;
                strArr = strArr2;
                intern = str;
                num2 = num;
                j4 = 0;
                c3 = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (i4 != i) {
            java.lang.Object[] objArr9 = {new int[]{i}, new int[]{i4}, null, null, new int[1]};
            java.lang.Object[] objArr10 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-1250512652) | i)) | 800333446) * (-366)) + 2102490221 + (((~(i | (-1074348298))) | 624169092) * 366))};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj3 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 50, 2714 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b((short) 653, (byte) (-$$a[16]), r7[14], objArr11);
                obj3 = cls2.getMethod((java.lang.String) objArr11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
            }
            ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr10)).intValue();
            return objArr9;
        }
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        float f = 0.0f;
        a(android.view.KeyEvent.keyCodeFromString("") + 100, (char) (46967 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12, objArr12);
        java.lang.String intern5 = ((java.lang.String) objArr12[0]).intern();
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a(android.view.KeyEvent.normalizeMetaState(0) + 112, (char) ((android.os.Process.myPid() >> 22) + 44557), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 13, objArr13);
        java.lang.String intern6 = ((java.lang.String) objArr13[0]).intern();
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        a(125 - android.text.TextUtils.indexOf("", ""), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 17 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr14);
        java.lang.String[] strArr3 = {intern5, intern6, ((java.lang.String) objArr14[0]).intern()};
        int i19 = 0;
        while (i19 < 3) {
            int i20 = AlternateContactlessPaymentDataJson + 91;
            valueOf = i20 % 128;
            if (i20 % 2 == 0) {
                java.lang.Object[] objArr15 = {strArr3[i19]};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 37, (android.media.AudioTrack.getMinVolume() > f ? 1 : (android.media.AudioTrack.getMinVolume() == f ? 0 : -1)) + 3161, (char) (android.graphics.Color.alpha(0) + 33099));
                    byte b2 = $$a[14];
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    b((short) 618, (byte) (b2 - 1), b2, objArr16);
                    obj4 = cls3.getMethod((java.lang.String) objArr16[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj4);
                }
                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr15)).longValue();
                long j8 = i;
                long j9 = ~j8;
                long j10 = (603 * longValue2) + 171702293884L + (((~(j9 | (-568550643))) | longValue2) * (-602)) + (((~((-568550643) | (~longValue2))) | (~(j8 | (-568550643))) | (~(568550642 | j9 | longValue2))) * (-301)) + ((~(j9 | longValue2)) * 301) + 338920096;
                int i21 = ~i;
                int i22 = (((int) j10) & ((((~(i21 | (-647524018))) | 603997201 | (~((-2084750428) | i21))) * (-397)) + 1675249441 + (((-1524280043) | i) * 397))) | (((int) (j10 >> 81)) & ((((1073034666 | i21) * (-369)) - 802173004) + (((~((-364197289) | i21)) | 1073029122) * (-369)) + (((~(364197288 | i)) | 708837378 | (~(i21 | (-5545)))) * 369)));
                str2 = str4;
                if (i22 != 0) {
                    i5 = (i19 + 270) ^ i;
                    break;
                }
                i19++;
                str4 = str2;
                f = 0.0f;
            } else {
                java.lang.String str6 = str4;
                java.lang.Object[] objArr17 = {strArr3[i19]};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                if (obj5 == null) {
                    str2 = str6;
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter(str2, 0) + 36, 3160 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 33099));
                    byte b3 = $$a[14];
                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                    b((short) 618, (byte) (b3 - 1), b3, objArr18);
                    obj5 = cls4.getMethod((java.lang.String) objArr18[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj5);
                } else {
                    str2 = str6;
                }
                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr17)).longValue();
                long j11 = ~i;
                long j12 = (((-782) * longValue3) - 450160660544L) + ((~longValue3) * (-783)) + ((~(574184515 | j11 | longValue3)) * (-783)) + (((~(longValue3 | j11)) | 574184515) * 783) + 1481655254;
                int i23 = ~i;
                if (((((int) (j12 >> 32)) & ((((~(1024741756 | i)) | 1347750308) * 398) + 1743930128 + (((~(1024741756 | i23)) | 1347750308) * 398))) | (((int) j12) & (((((~(220101531 | i23)) | 1082228740) * 98) - 851689682) + (((~(i23 | 1217124878)) | 220101531 | (~((-1217124879) | i))) * (-49)) + (((~(220101531 | i)) | 134896138) * 49)))) != 0) {
                    i5 = (i19 + 270) ^ i;
                    break;
                }
                i19++;
                str4 = str2;
                f = 0.0f;
            }
        }
        str2 = str4;
        i5 = i;
        if (i5 != i) {
            java.lang.Object[] objArr19 = {new int[]{i}, new int[]{i5}, null, null, new int[1]};
            java.lang.Object[] objArr20 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(464770183 | i)) | (-1606147472)) * 305) + 493681076 + (((~((~i) | 464770183)) | (-1586075915)) * 305))};
            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj6 == null) {
                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50, 2713 - android.view.View.getDefaultSize(0, 0), (char) android.text.TextUtils.indexOf(str2, str2));
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                b((short) 653, (byte) (-$$a[16]), r4[14], objArr21);
                obj6 = cls5.getMethod((java.lang.String) objArr21[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
            }
            ((int[]) objArr19[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr20)).intValue();
            return objArr19;
        }
        java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1781008036);
        if (obj7 == null) {
            java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore(str2, 0) + 26, 1864 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (41774 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
            short s = (short) ($$a[14] - 1);
            byte b4 = (byte) s;
            java.lang.Object[] objArr22 = new java.lang.Object[1];
            b(s, b4, b4, objArr22);
            obj7 = cls6.getMethod((java.lang.String) objArr22[0], null);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1781008036, obj7);
        }
        long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj7).invoke(null, null)).longValue();
        long j13 = ~longValue4;
        long j14 = i;
        long j15 = ~j14;
        long j16 = j13 | j15;
        long j17 = longValue4 | (-395666627);
        long j18 = ~(j17 | j14);
        long j19 = (((((longValue4 * 253) - 100103656631L) + ((((~(j13 | 395666626)) | (~j16)) | j18) * (-252))) + (j17 * (-252))) + (((~(j16 | (-395666627))) | j18) * 252)) - 1533546235;
        int i24 = ~i;
        int i25 = (((int) j19) & (((((~(699177577 | i24)) | (~(738048832 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 638831705) + (((~(i24 | (-42))) | (~((-38871297) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) | (((int) (j19 >> 32)) & ((((~((-1468545827) | i24)) | (~((-31319416) | i))) * 959) + 1880504451 + (((~((-1468545827) | i)) | (~((-31319416) | i24))) * 959)));
        if (i25 != 0) {
            valueOf = (AlternateContactlessPaymentDataJson + 51) % 128;
            i6 = (i25 + 199) ^ i;
        } else {
            i6 = i;
        }
        if (i6 != i) {
            java.lang.Object[] objArr23 = {new int[]{i}, new int[]{i6}, null, null, new int[1]};
            java.lang.Object[] objArr24 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i | (-27541569))) | 1947741485) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 276514624 + ((~((-27541569) | i24)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))};
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj8 == null) {
                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 50, android.graphics.Color.blue(0) + 2713, (char) android.text.TextUtils.getCapsMode(str2, 0, 0));
                java.lang.Object[] objArr25 = new java.lang.Object[1];
                b((short) 653, (byte) (-$$a[16]), r2[14], objArr25);
                obj8 = cls7.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
            }
            ((int[]) objArr23[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr24)).intValue();
            return objArr23;
        }
        java.lang.Object[] objArr26 = new java.lang.Object[1];
        a(android.view.MotionEvent.axisFromString(str2) + 144, (char) (android.view.MotionEvent.axisFromString(str2) + 1), 20 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr26);
        java.lang.String intern7 = ((java.lang.String) objArr26[0]).intern();
        java.lang.Object[] objArr27 = new java.lang.Object[1];
        a(163 - android.view.View.MeasureSpec.getMode(0), (char) (5966 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), 6 - android.view.KeyEvent.getDeadChar(0, 0), objArr27);
        java.lang.Object[] objArr28 = {intern7, ((java.lang.String) objArr27[0]).intern()};
        java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
        if (obj9 == null) {
            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(38 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2213 - android.text.TextUtils.indexOf(str2, str2, 0, 0), (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
            short s2 = (short) ($$a[14] - 1);
            byte b5 = (byte) s2;
            java.lang.Object[] objArr29 = new java.lang.Object[1];
            b(s2, b5, b5, objArr29);
            obj9 = cls8.getMethod((java.lang.String) objArr29[0], java.lang.String.class, java.lang.String.class);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj9);
        }
        long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj9).invoke(null, objArr28)).longValue();
        long j20 = longValue5 | j14;
        long j21 = ((((((-929) * longValue5) + 183147793408L) + (((~j20) | 394715071) * (-465))) + ((longValue5 | (~(394715071 | j14))) * 930)) + ((394715071 | j20) * 465)) - 340659530;
        int i26 = ((((int) (j21 >> 32)) & ((((((~(584565411 | i)) | 1476401228) * 104) + (-2005432166)) + ((~((-39174818) | i24)) * (-104))) + ((2021791822 | i) * 104))) | (((int) j21) & (((((1414014976 | i24) * (-192)) + 1788176917) + (((~((-721912406) | i24)) | 721813504) * (-384))) + ((((~((-721813505) | i)) | (~((-98902) | i24))) | (~(2135927381 | i))) * 192)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE : i;
        if (i26 != i) {
            java.lang.Object[] objArr30 = {new int[]{i}, new int[]{i26}, null, null, new int[1]};
            java.lang.Object[] objArr31 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i | (-1073766417))) | 37487105) * 449) + 1662380543 + (((~((-1073766417) | i24)) | 37487105) * 449))};
            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj10 == null) {
                java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getOffsetBefore(str2, 0), android.graphics.ImageFormat.getBitsPerPixel(0) + 2714, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1));
                java.lang.Object[] objArr32 = new java.lang.Object[1];
                b((short) 653, (byte) (-$$a[16]), r2[14], objArr32);
                obj10 = cls9.getMethod((java.lang.String) objArr32[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
            }
            ((int[]) objArr30[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr31)).intValue();
            return objArr30;
        }
        java.lang.Object[] objArr33 = new java.lang.Object[1];
        a(169 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.os.Process.getGidForName(str2) + 28738), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31, objArr33);
        java.lang.String intern8 = ((java.lang.String) objArr33[0]).intern();
        java.lang.Object[] objArr34 = new java.lang.Object[1];
        a(android.view.KeyEvent.getDeadChar(0, 0) + 200, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), 23 - android.text.TextUtils.indexOf(str2, str2, 0), objArr34);
        java.lang.String intern9 = ((java.lang.String) objArr34[0]).intern();
        java.lang.Object[] objArr35 = new java.lang.Object[1];
        a(223 - android.graphics.Color.argb(0, 0, 0, 0), (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 8985), 27 - android.view.MotionEvent.axisFromString(str2), objArr35);
        java.lang.String intern10 = ((java.lang.String) objArr35[0]).intern();
        java.lang.Object[] objArr36 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 250, (char) (android.os.Process.getGidForName(str2) + 1), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 14, objArr36);
        java.lang.String[] strArr4 = {intern8, intern9, intern10, ((java.lang.String) objArr36[0]).intern()};
        int i27 = 0;
        while (true) {
            if (i27 >= 4) {
                i7 = i24;
                j = j14;
                i8 = i;
                break;
            }
            java.lang.Object[] objArr37 = {strArr4[i27]};
            java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
            if (obj11 == null) {
                java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 36, android.view.Gravity.getAbsoluteGravity(0, 0) + 3161, (char) (33099 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)));
                byte b6 = $$a[14];
                java.lang.Object[] objArr38 = new java.lang.Object[1];
                b((short) 612, b6, (byte) (b6 - 1), objArr38);
                obj11 = cls10.getMethod((java.lang.String) objArr38[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj11);
            }
            long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj11).invoke(null, objArr37)).longValue();
            long j22 = ~longValue6;
            long j23 = (-443341193) | j22;
            i7 = i24;
            long j24 = j15 | 443341192;
            j = j14;
            java.lang.String[] strArr5 = strArr4;
            int i28 = i27;
            long j25 = (569 * longValue6) + 252261138248L + (((~(j15 | (-443341193))) | (~j23) | (~(j22 | j15))) * (-1136)) + (((~(j | (-443341193))) | (~(j22 | j)) | (~(j24 | longValue6))) * (-568)) + (((~(j15 | longValue6)) | (~j24) | (~(j23 | j))) * 568) + 552093711;
            if (((((int) j25) & ((((~(i7 | 584010383)) | (-2021236794)) * (-328)) + 798966161 + (((-2021236794) | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~((-584010384) | i)) | 42355334 | (~(i7 | (-1479581745)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))) | (((((~(1862260735 | i)) * 623) - 725874582) + ((i7 | 9437504) * (-623)) + (((~(217235914 | i)) | (-1862260736) | (~(1654462325 | i))) * 623)) & ((int) (j25 >> 32)))) != 0) {
                i8 = (i28 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) ^ i;
                break;
            }
            i27 = i28 + 1;
            i24 = i7;
            j14 = j;
            strArr4 = strArr5;
        }
        if (i8 != i) {
            java.lang.Object[] objArr39 = {new int[]{i}, new int[]{i8}, null, null, new int[1]};
            java.lang.Object[] objArr40 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~((-209858579) | i)) | (~(1840987519 | i))) * 69) - 653440542) + ((((~(i | (-227752984))) | 17894405) | (~(1823093114 | i))) * (-69))) - 355966712)};
            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj12 == null) {
                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.getDefaultSize(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2713, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                java.lang.Object[] objArr41 = new java.lang.Object[1];
                b((short) 653, (byte) (-$$a[16]), r2[14], objArr41);
                obj12 = cls11.getMethod((java.lang.String) objArr41[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj12);
            }
            ((int[]) objArr39[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr40)).intValue();
            return objArr39;
        }
        java.lang.Object[] objArr42 = new java.lang.Object[1];
        a(android.view.KeyEvent.keyCodeFromString(str2) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE, (char) (32304 - android.text.TextUtils.indexOf(str2, str2, 0, 0)), 13 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr42);
        java.lang.Object[] objArr43 = {((java.lang.String) objArr42[0]).intern()};
        java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
        if (obj13 == null) {
            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.View.resolveSizeAndState(0, 0, 0), 1921 - android.text.TextUtils.indexOf(str2, str2), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
            short s3 = (short) ($$a[14] - 1);
            byte b7 = (byte) s3;
            java.lang.Object[] objArr44 = new java.lang.Object[1];
            b(s3, b7, b7, objArr44);
            obj13 = cls12.getMethod((java.lang.String) objArr44[0], java.lang.String.class);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj13);
        }
        java.lang.String str7 = (java.lang.String) ((java.lang.reflect.Method) obj13).invoke(null, objArr43);
        if (str7 != null) {
            java.lang.Object[] objArr45 = new java.lang.Object[1];
            a(278 - android.view.View.MeasureSpec.getSize(0), (char) (android.text.TextUtils.getOffsetAfter(str2, 0) + 50375), android.text.TextUtils.getTrimmedLength(str2) + 9, objArr45);
            if (str7.contains(((java.lang.String) objArr45[0]).intern())) {
                int i29 = AlternateContactlessPaymentDataJson + 113;
                valueOf = i29 % 128;
                i9 = i29 % 2 == 0 ? i ^ 10916 : i ^ 250;
                if (i9 == i) {
                    java.lang.Object[] objArr46 = {new int[]{i}, new int[]{i9}, null, null, new int[1]};
                    java.lang.Object[] objArr47 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((i7 | (-1094275458)) * 1444) - 1191286113) + ((((~(i | 478285705)) | (-1572560778)) | (~(1572560392 | i))) * (-1444))) - 207102510)};
                    java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj14 == null) {
                        java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getCapsMode(str2, 0, 0), 2713 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                        java.lang.Object[] objArr48 = new java.lang.Object[1];
                        b((short) 653, (byte) (-$$a[16]), r2[14], objArr48);
                        obj14 = cls13.getMethod((java.lang.String) objArr48[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj14);
                    }
                    ((int[]) objArr46[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr47)).intValue();
                    return objArr46;
                }
                java.lang.Object[] objArr49 = new java.lang.Object[1];
                a(287 - android.text.TextUtils.getTrimmedLength(str2), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7620), android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 18, objArr49);
                java.lang.String intern11 = ((java.lang.String) objArr49[0]).intern();
                java.lang.Object[] objArr50 = new java.lang.Object[1];
                a(android.widget.ExpandableListView.getPackedPositionChild(0L) + 305, (char) ((-1) - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 6, objArr50);
                java.lang.Object[] objArr51 = {intern11, ((java.lang.String) objArr50[0]).intern()};
                java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                if (obj15 == null) {
                    java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 39, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2213, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                    short s4 = (short) ($$a[14] - 1);
                    byte b8 = (byte) s4;
                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                    b(s4, b8, b8, objArr52);
                    obj15 = cls14.getMethod((java.lang.String) objArr52[0], java.lang.String.class, java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj15);
                }
                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj15).invoke(null, objArr51)).longValue();
                long j26 = ~longValue7;
                long j27 = (((((984 * longValue7) - 1250777738115L) + ((636528111 | j26) * 983)) + (((~(j26 | j15)) | (-636528112)) * (-983))) + (((~(longValue7 | (-636528112))) | (~(j15 | (-636528112)))) * 983)) - 1371902713;
                int i30 = ~((-957400432) | i);
                int i31 = ((((int) (j27 >> 32)) & ((((1213473162 | i30) * (-658)) - 2067407190) + ((i30 | 135266570) * 658))) | (((int) j27) & ((((i7 | (-94437398)) * 494) + 126923959) + (((~(i7 | (-228951648))) | (-1168197910)) * 494)))) != 0 ? i ^ 251 : i;
                if (i31 != i) {
                    java.lang.Object[] objArr53 = {new int[]{i}, new int[]{i31}, null, null, new int[1]};
                    int i32 = ~(i | (-994467603));
                    java.lang.Object[] objArr54 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(i7 | (-994467603))) | 16797952) * (-245)) - 232420800) + (i32 * (-245)) + ((i32 | 1056378495) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))};
                    java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj16 == null) {
                        java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 2713 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) android.text.TextUtils.getOffsetAfter(str2, 0));
                        java.lang.Object[] objArr55 = new java.lang.Object[1];
                        b((short) 653, (byte) (-$$a[16]), r2[14], objArr55);
                        obj16 = cls15.getMethod((java.lang.String) objArr55[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj16);
                    }
                    ((int[]) objArr53[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, objArr54)).intValue();
                    return objArr53;
                }
                java.lang.Object[] objArr56 = new java.lang.Object[1];
                a(311 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) android.text.TextUtils.indexOf(str2, str2, 0, 0), android.widget.ExpandableListView.getPackedPositionType(0L) + 23, objArr56);
                java.lang.Object[] objArr57 = {((java.lang.String) objArr56[0]).intern()};
                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj17 == null) {
                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString(str2) + 41, android.text.TextUtils.getOffsetBefore(str2, 0) + 1921, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                    short s5 = (short) ($$a[14] - 1);
                    byte b9 = (byte) s5;
                    java.lang.Object[] objArr58 = new java.lang.Object[1];
                    b(s5, b9, b9, objArr58);
                    obj17 = cls16.getMethod((java.lang.String) objArr58[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj17);
                }
                java.lang.String lowerCase = ((java.lang.String) ((java.lang.reflect.Method) obj17).invoke(null, objArr57)).toLowerCase();
                java.lang.Object[] objArr59 = new java.lang.Object[1];
                a(333 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.view.MotionEvent.axisFromString(str2) + 1), android.graphics.Color.rgb(0, 0, 0) + 16777220, objArr59);
                int i33 = lowerCase.contains(((java.lang.String) objArr59[0]).intern()) ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE : i;
                if (i33 != i) {
                    java.lang.Object[] objArr60 = {new int[]{i}, new int[]{i33}, null, null, new int[1]};
                    java.lang.Object[] objArr61 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(i7 | (-1447404871))) | (~(2012736847 | i))) * (-831)) - 990003114) + ((~((-1409295621) | i)) * (-1662)) + (((~(i | 603441227)) | (~(i7 | (-603441228))) | (~(1447404870 | i))) * 831))};
                    java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj18 == null) {
                        java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.resolveSizeAndState(0, 0, 0), 2713 - android.text.TextUtils.indexOf(str2, str2, 0), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        java.lang.Object[] objArr62 = new java.lang.Object[1];
                        b((short) 653, (byte) (-$$a[16]), r2[14], objArr62);
                        obj18 = cls17.getMethod((java.lang.String) objArr62[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj18);
                    }
                    ((int[]) objArr60[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj18).invoke(null, objArr61)).intValue();
                    return objArr60;
                }
                java.lang.Object[] objArr63 = new java.lang.Object[1];
                a(286 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (7620 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 17 - android.view.View.getDefaultSize(0, 0), objArr63);
                java.lang.String intern12 = ((java.lang.String) objArr63[0]).intern();
                java.lang.Object[] objArr64 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 337, (char) (android.view.KeyEvent.keyCodeFromString(str2) + 53588), android.view.KeyEvent.keyCodeFromString(str2) + 6, objArr64);
                java.lang.Object[] objArr65 = {intern12, ((java.lang.String) objArr64[0]).intern()};
                java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                if (obj19 == null) {
                    java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.graphics.Color.green(0), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 2213, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                    short s6 = (short) ($$a[14] - 1);
                    byte b10 = (byte) s6;
                    java.lang.Object[] objArr66 = new java.lang.Object[1];
                    b(s6, b10, b10, objArr66);
                    obj19 = cls18.getMethod((java.lang.String) objArr66[0], java.lang.String.class, java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj19);
                }
                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, objArr65)).longValue();
                long j28 = ~(longValue8 | j);
                long j29 = (((((111 * longValue8) - 17477015419L) + (((-160339592) | j28) * (-220))) + ((j28 | (~(160339591 | longValue8))) * 220)) + (((~((~longValue8) | 160339591)) | (~((-160339592) | longValue8))) * 110)) - 895714193;
                if (((((int) (j29 >> 32)) & (((((~((-2004609115) | i)) | (-1454013174)) * 398) - 640516558) + (((~(i7 | (-2004609115))) | (-1454013174)) * 398))) | (((int) j29) & ((((~(i7 | (-668684705))) | 629211392) * 98) + 1640719802 + (((~(i7 | 2105911114)) | (-668684705) | (~((-2105911115) | i))) * (-49)) + (((~((-668684705) | i)) | 1476699722) * 49)))) != 0) {
                    i10 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                } else {
                    java.lang.Object[] objArr67 = new java.lang.Object[1];
                    a(343 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.view.View.resolveSizeAndState(0, 0, 0) + 13, objArr67);
                    java.lang.String intern13 = ((java.lang.String) objArr67[0]).intern();
                    java.lang.Object[] objArr68 = new java.lang.Object[1];
                    a(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 356, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 9 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr68);
                    java.lang.Object[] objArr69 = {intern13, ((java.lang.String) objArr68[0]).intern()};
                    java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                    if (obj20 == null) {
                        java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2213, (char) android.text.TextUtils.indexOf(str2, str2));
                        short s7 = (short) ($$a[14] - 1);
                        byte b11 = (byte) s7;
                        java.lang.Object[] objArr70 = new java.lang.Object[1];
                        b(s7, b11, b11, objArr70);
                        obj20 = cls19.getMethod((java.lang.String) objArr70[0], java.lang.String.class, java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj20);
                    }
                    long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, objArr69)).longValue();
                    long j30 = ~longValue9;
                    long j31 = ((((((-282) * longValue9) - 129332804800L) + (((~(longValue9 | 455397199)) | (~(j | 455397199))) * (-283))) + ((~((-455397200) | j30)) * 283)) + ((~((455397199 | j30) | j)) * 283)) - 279977402;
                    int i34 = ~(i7 | 853703646);
                    if (((((int) (j31 >> 32)) & ((((~(i7 | (-583522765))) | 583162316 | (~(i7 | (-853703647))) | (~(854064094 | i))) * (-84)) + 1905160562 + (((~((-853703647) | i)) | 583522764 | i34) * (-84)) + ((i34 | (-854064095)) * 84))) | (((int) j31) & (((~(i7 | (-629376162))) * 979) + 604481022 + (((-2066602572) | i) * (-979)) + (((~((-629376162) | i)) | (~(i7 | (-2066602572)))) * 979)))) != 0) {
                        valueOf = (AlternateContactlessPaymentDataJson + 57) % 128;
                        i10 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE;
                    } else {
                        i10 = i;
                    }
                }
                if (i10 != i) {
                    java.lang.Object[] objArr71 = {new int[]{i}, new int[]{i10}, null, null, new int[1]};
                    java.lang.Object[] objArr72 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-380552383) | i)) | 337658924) * (-566)) - 107731239) + ((~(i | (-42893459))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))};
                    java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj21 == null) {
                        java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2713 - android.text.TextUtils.getCapsMode(str2, 0, 0), (char) android.graphics.Color.red(0));
                        java.lang.Object[] objArr73 = new java.lang.Object[1];
                        b((short) 653, (byte) (-$$a[16]), r2[14], objArr73);
                        obj21 = cls20.getMethod((java.lang.String) objArr73[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj21);
                    }
                    ((int[]) objArr71[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr72)).intValue();
                    return objArr71;
                }
                java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1102036426);
                if (obj22 == null) {
                    java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.text.TextUtils.indexOf(str2, str2, 0, 0) + 2763, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                    short s8 = (short) ($$a[14] - 1);
                    byte b12 = (byte) s8;
                    java.lang.Object[] objArr74 = new java.lang.Object[1];
                    b(s8, b12, b12, objArr74);
                    obj22 = cls21.getMethod((java.lang.String) objArr74[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1102036426, obj22);
                }
                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj22).invoke(null, null)).longValue();
                long j32 = ~((-120169620) | longValue10);
                long j33 = ~longValue10;
                long j34 = ~(j15 | 120169619);
                long j35 = ((-1187) * longValue10) + 71500923305L + (((~(j15 | longValue10)) | j32) * (-1188)) + (((~(j33 | j)) | j32 | j34) * 594) + (((~(j33 | j15)) | (~(120169619 | j33)) | j34) * 594) + 4867144;
                if (((((int) (j35 >> 32)) & ((((~(i7 | (-1015764082))) | 747263073) * 529) + 1520786966 + (((~((-1015764082) | i)) | 1841976803) * 529))) | (((int) j35) & (((((~((-142872649) | i)) | 1090617345) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) - 940422280) + ((~(i7 | (-142872649))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING)))) == 1) {
                    java.lang.Object[] objArr75 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                    java.lang.Object[] objArr76 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((((~((-1884998002) | i)) | (~(i7 | 2046487921))) * (-406)) - 53961721) + ((~(i7 | (-1880639826))) * (-406)) + (((~(i | (-165848097))) | (~(i7 | 1884998001))) * 406))};
                    java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj23 == null) {
                        java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.graphics.ImageFormat.getBitsPerPixel(0), 2713 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                        java.lang.Object[] objArr77 = new java.lang.Object[1];
                        b((short) 653, (byte) (-$$a[16]), r3[14], objArr77);
                        obj23 = cls22.getMethod((java.lang.String) objArr77[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj23);
                    }
                    ((int[]) objArr75[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr76)).intValue();
                    return objArr75;
                }
                java.lang.Object[] objArr78 = {1};
                java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                if (obj24 == null) {
                    java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 27, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2364, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1));
                    short s9 = (short) ($$a[14] - 1);
                    byte b13 = (byte) s9;
                    java.lang.Object[] objArr79 = new java.lang.Object[1];
                    b(s9, b13, b13, objArr79);
                    obj24 = cls23.getMethod((java.lang.String) objArr79[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj24);
                }
                long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr78)).longValue();
                long j36 = ~longValue11;
                long j37 = (46 * longValue11) + 13991242378L + (((~(j36 | j15)) | 304157443) * (-90)) + (((~(longValue11 | 304157443)) | (~(j36 | j))) * (-45)) + (((~(j15 | 304157443)) | j36 | (~(j | (-304157444)))) * 45) + 1103752756;
                int i35 = ((((int) (j37 >> 32)) & (((((((~(i7 | 2007996414)) | (~((-622593) | i))) | (~((-1157629353) | i))) * 765) + (-486666837)) + (((~(i7 | 2007373822)) | (-2007996415)) * 1530)) + (((~(2007373822 | i)) | (~(i7 | (-1157629353)))) * 765))) | (((int) j37) & ((((((-139461649) | i) * (-627)) + (-635053948)) + (((~(1593470010 | i)) | 156243600) * (-627))) + (((~(i7 | (-1593470011))) | (~(156243600 | i))) * 627)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE : i;
                if (i35 != i) {
                    java.lang.Object[] objArr80 = {new int[]{i}, new int[]{i35}, null, null, new int[1]};
                    java.lang.Object[] objArr81 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-2001841078) | i)) | 37847444) * 336) + 1106085481 + (((~(i | 49005020)) | (-2012998654)) * (-168)) + (((~(i7 | 49005020)) | (-2001841078)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                    java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj25 == null) {
                        java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString(str2) + 50, 2713 - android.view.View.resolveSize(0, 0), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                        java.lang.Object[] objArr82 = new java.lang.Object[1];
                        b((short) 653, (byte) (-$$a[16]), r2[14], objArr82);
                        obj25 = cls24.getMethod((java.lang.String) objArr82[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj25);
                    }
                    ((int[]) objArr80[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj25).invoke(null, objArr81)).intValue();
                    return objArr80;
                }
                java.lang.Object[] objArr83 = new java.lang.Object[1];
                a((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 310, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 23, objArr83);
                java.lang.Object[] objArr84 = {((java.lang.String) objArr83[0]).intern()};
                java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj26 == null) {
                    java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.alpha(0), 1969 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.text.TextUtils.indexOf(str2, str2, 0));
                    short s10 = (short) ($$a[14] - 1);
                    byte b14 = (byte) s10;
                    java.lang.Object[] objArr85 = new java.lang.Object[1];
                    b(s10, b14, b14, objArr85);
                    obj26 = cls25.getMethod((java.lang.String) objArr85[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj26);
                }
                java.lang.Object invoke2 = ((java.lang.reflect.Method) obj26).invoke(null, objArr84);
                if (invoke2 != null) {
                    java.lang.Object[] objArr86 = {invoke2, 42};
                    java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                    if (obj27 == null) {
                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2593, (char) android.text.TextUtils.indexOf(str2, str2, 0));
                        short s11 = (short) ($$a[14] - 1);
                        byte b15 = (byte) s11;
                        java.lang.Object[] objArr87 = new java.lang.Object[1];
                        b(s11, b15, b15, objArr87);
                        i11 = 2;
                        obj27 = cls26.getMethod((java.lang.String) objArr87[0], java.lang.String.class, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj27);
                    } else {
                        i11 = 2;
                    }
                    long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr86)).longValue();
                    long j38 = ((382 * longValue12) - 148353946360L) + ((longValue12 | j | (-390405123)) * (-381)) + (((~((-390405123) | (~longValue12))) | (~(j15 | longValue12)) | (~(390405122 | longValue12))) * 381) + ((~(longValue12 | (-390405123))) * 381) + 866695402;
                    if (((((int) (j38 >> 32)) & ((((((~(i7 | 1781373423)) | (~((-168102025) | i))) | (~((-536903939) | i))) * 765) - 1327309712) + (((~(i7 | 1613271399)) | (-1781373424)) * 1530) + (((~(1613271399 | i)) | (~(i7 | (-536903939)))) * 765))) | (((int) j38) & (((((~(i7 | 1423572217)) | 13654192) * (-591)) - 1475123762) + ((1423572217 | i) * 591)))) == 1986687685) {
                        str3 = str2;
                        j2 = j15;
                        j3 = j;
                        java.lang.Object[] objArr88 = new java.lang.Object[1];
                        a(447 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) android.view.View.MeasureSpec.getSize(0), android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 17, objArr88);
                        java.lang.Object[] objArr89 = {((java.lang.String) objArr88[0]).intern()};
                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj == null) {
                            java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 39, android.graphics.Color.red(0) + 1921, (char) android.text.TextUtils.indexOf(str3, str3));
                            short s12 = (short) ($$a[14] - 1);
                            byte b16 = (byte) s12;
                            java.lang.Object[] objArr90 = new java.lang.Object[1];
                            b(s12, b16, b16, objArr90);
                            obj = cls27.getMethod((java.lang.String) objArr90[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj);
                        }
                        invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr89);
                        if (invoke != null) {
                            i12 = 0;
                        } else {
                            java.lang.Object[] objArr91 = {invoke, 42};
                            java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj28 == null) {
                                java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27, android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2595, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                                short s13 = (short) ($$a[14] - 1);
                                byte b17 = (byte) s13;
                                java.lang.Object[] objArr92 = new java.lang.Object[1];
                                b(s13, b17, b17, objArr92);
                                obj28 = cls28.getMethod((java.lang.String) objArr92[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj28);
                            }
                            long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj28).invoke(null, objArr91)).longValue();
                            long j39 = ~longValue13;
                            long j40 = (-918233596) | j39;
                            long j41 = (((-496) * longValue13) - 455443863120L) + ((~j40) * 497) + (((~(j40 | j3)) | (~(j39 | j2 | 918233595))) * 497) + (((~(longValue13 | (-918233596))) | (~(j2 | (-918233596))) | (~(j39 | 918233595 | j3))) * 497) + 338866929;
                            int i36 = ~(i7 | (-1601329553));
                            i12 = (((int) (j41 >> 32)) & ((((((~(i7 | 853279379)) | (-853431192)) | (~((-583795220) | i))) * 717) - 886317137) + (((~(853279379 | i)) | (~(i7 | (-583795220))) | (-853431192)) * 717))) | (((int) j41) & (((8454213 | i36 | (~(1601329552 | i))) * (-338)) + 1420297583 + ((i36 | (~(1609783765 | i))) * 338)));
                        }
                        if (i12 != 1986687685) {
                            int i37 = AlternateContactlessPaymentDataJson + 31;
                            valueOf = i37 % 128;
                            if (i37 % 2 == 0) {
                                throw null;
                            }
                            if (i12 != -1514516938) {
                                java.lang.Object[] objArr93 = new java.lang.Object[1];
                                a(1162 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) android.text.TextUtils.getOffsetAfter(str3, 0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 14, objArr93);
                                java.lang.String intern14 = ((java.lang.String) objArr93[0]).intern();
                                java.lang.Object[] objArr94 = new java.lang.Object[1];
                                a(android.view.View.resolveSizeAndState(0, 0, 0) + 1175, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 26386), 25 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr94);
                                java.lang.String intern15 = ((java.lang.String) objArr94[0]).intern();
                                java.lang.Object[] objArr95 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1201, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 17, objArr95);
                                java.lang.String intern16 = ((java.lang.String) objArr95[0]).intern();
                                java.lang.Object[] objArr96 = new java.lang.Object[1];
                                a(1218 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17, objArr96);
                                java.lang.String intern17 = ((java.lang.String) objArr96[0]).intern();
                                java.lang.Object[] objArr97 = new java.lang.Object[1];
                                a(1235 - android.graphics.Color.green(0), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 16 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr97);
                                java.lang.String intern18 = ((java.lang.String) objArr97[0]).intern();
                                java.lang.Object[] objArr98 = new java.lang.Object[1];
                                a(1251 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36090), android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 38, objArr98);
                                java.lang.String intern19 = ((java.lang.String) objArr98[0]).intern();
                                java.lang.Object[] objArr99 = new java.lang.Object[1];
                                a(android.view.View.getDefaultSize(0, 0) + 1287, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 13, objArr99);
                                java.lang.String intern20 = ((java.lang.String) objArr99[0]).intern();
                                java.lang.Object[] objArr100 = new java.lang.Object[1];
                                a(android.os.Process.getGidForName(str3) + my.com.softspace.common.util.ScreenUtil.DEVICE_SCREEN_INFO_DP_WIDTH, (char) (android.os.Process.myPid() >> 22), 13 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr100);
                                java.lang.String intern21 = ((java.lang.String) objArr100[0]).intern();
                                java.lang.Object[] objArr101 = new java.lang.Object[1];
                                a(1312 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) android.graphics.Color.blue(0), 22 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr101);
                                java.lang.String intern22 = ((java.lang.String) objArr101[0]).intern();
                                java.lang.Object[] objArr102 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1334, (char) (android.graphics.Color.green(0) + 53167), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 30, objArr102);
                                java.lang.String intern23 = ((java.lang.String) objArr102[0]).intern();
                                java.lang.Object[] objArr103 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1365, (char) android.graphics.Color.argb(0, 0, 0, 0), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11, objArr103);
                                java.lang.String intern24 = ((java.lang.String) objArr103[0]).intern();
                                java.lang.Object[] objArr104 = new java.lang.Object[1];
                                a((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1377, (char) (17358 - android.view.View.combineMeasuredStates(0, 0)), 12 - android.view.KeyEvent.normalizeMetaState(0), objArr104);
                                java.lang.String intern25 = ((java.lang.String) objArr104[0]).intern();
                                java.lang.Object[] objArr105 = new java.lang.Object[1];
                                a(1389 - android.text.TextUtils.indexOf(str3, str3, 0, 0), (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 65387), 12 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr105);
                                java.lang.String intern26 = ((java.lang.String) objArr105[0]).intern();
                                java.lang.Object[] objArr106 = new java.lang.Object[1];
                                a((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + my.com.softspace.common.util.ScreenUtil.DEVICE_SCREEN_INFO_PX_RES_WIDTH, (char) android.view.View.MeasureSpec.getSize(0), 12 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr106);
                                java.lang.String intern27 = ((java.lang.String) objArr106[0]).intern();
                                java.lang.Object[] objArr107 = new java.lang.Object[1];
                                a(android.graphics.Color.argb(0, 0, 0, 0) + 1413, (char) ((android.os.Process.myTid() >> 22) + 62297), android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 13, objArr107);
                                java.lang.String intern28 = ((java.lang.String) objArr107[0]).intern();
                                java.lang.Object[] objArr108 = new java.lang.Object[1];
                                a(1425 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (55354 - android.graphics.ImageFormat.getBitsPerPixel(0)), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 14, objArr108);
                                java.lang.String intern29 = ((java.lang.String) objArr108[0]).intern();
                                java.lang.Object[] objArr109 = new java.lang.Object[1];
                                a(1439 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (49155 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 12, objArr109);
                                java.lang.String intern30 = ((java.lang.String) objArr109[0]).intern();
                                java.lang.Object[] objArr110 = new java.lang.Object[1];
                                a(1451 - android.view.View.resolveSize(0, 0), (char) android.text.TextUtils.getOffsetAfter(str3, 0), android.text.TextUtils.getOffsetAfter(str3, 0) + 24, objArr110);
                                java.lang.String intern31 = ((java.lang.String) objArr110[0]).intern();
                                java.lang.Object[] objArr111 = new java.lang.Object[1];
                                a(1475 - android.graphics.Color.red(0), (char) (16547 - android.view.View.MeasureSpec.getMode(0)), 'L' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr111);
                                java.lang.String[] strArr6 = {intern14, intern15, intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, intern29, intern30, intern31, ((java.lang.String) objArr111[0]).intern()};
                                int i38 = 0;
                                while (true) {
                                    if (i38 >= 19) {
                                        i38 = -1;
                                        break;
                                    }
                                    AlternateContactlessPaymentDataJson = (valueOf + 75) % 128;
                                    java.lang.String str8 = strArr6[i38];
                                    java.lang.Object[] objArr112 = {str8};
                                    java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                    if (obj29 == null) {
                                        java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 36, android.view.MotionEvent.axisFromString(str3) + 3162, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 33099));
                                        short s14 = (short) ($$a[14] - 1);
                                        byte b18 = (byte) s14;
                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                        b(s14, b18, b18, objArr113);
                                        obj29 = cls29.getMethod((java.lang.String) objArr113[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj29);
                                    }
                                    long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj29).invoke(null, objArr112)).longValue();
                                    long j42 = ~longValue14;
                                    long j43 = ~(647106977 | j42);
                                    java.lang.String[] strArr7 = strArr6;
                                    long j44 = ((((((-575) * longValue14) + 372086512350L) + (((~(j42 | j3)) | j43) * 576)) + (((~(647106977 | longValue14)) | (~((j42 | j2) | (-647106978)))) * 576)) + (j43 * 576)) - 690561130;
                                    if (((((int) (j44 >> 32)) & ((((~(i7 | (-178798631))) * 52) - 96399542) + (((~(i7 | 1683208145)) | (~(i7 | 245981734)) | (-1862006776)) * (-52)) + (((~(i7 | (-1683208146))) | 67183104) * 52))) | (((int) j44) & (((~(i7 | (-445259918))) * 979) + 326833910 + (((-1882486328) | i) * (-979)) + (((~((-445259918) | i)) | (~(i7 | (-1882486328)))) * 979)))) != 0) {
                                        break;
                                    }
                                    java.lang.Object[] objArr114 = new java.lang.Object[1];
                                    a(1426 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (55355 - android.graphics.Color.argb(0, 0, 0, 0)), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14, objArr114);
                                    if (str8.equals(((java.lang.String) objArr114[0]).intern())) {
                                        java.lang.Object[] objArr115 = {str8};
                                        java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                        if (obj30 == null) {
                                            java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3161, (char) (android.view.KeyEvent.keyCodeFromString(str3) + 33099));
                                            byte b19 = $$a[14];
                                            java.lang.Object[] objArr116 = new java.lang.Object[1];
                                            b((short) 612, b19, (byte) (b19 - 1), objArr116);
                                            obj30 = cls30.getMethod((java.lang.String) objArr116[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj30);
                                        }
                                        long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj30).invoke(null, objArr115)).longValue();
                                        long j45 = ~longValue15;
                                        long j46 = ((-590) * longValue15) + 242876038176L + ((~((-410263579) | longValue15)) * (-1182)) + (((~(longValue15 | 410263578)) | (~((-410263579) | j45 | j2))) * (-591)) + ((j3 | (-410263579) | j45) * 591) + 585171325;
                                        int i39 = (int) j46;
                                        int i40 = ~(i7 | (-1443651633));
                                        if (((((int) (j46 >> 32)) & ((((~(i7 | 2128605183)) | (~((-207113378) | i))) * (-302)) + 748024430 + ((~(2128605183 | i)) * (-604)) + (((~(1921491806 | i)) | 277152018) * 302))) | (i39 & ((((~(1579021689 | i)) | 6425222 | i40) * (-470)) + 1582627929 + ((i40 | (~(1585446911 | i))) * 470)))) != 0) {
                                            int i41 = valueOf + 115;
                                            AlternateContactlessPaymentDataJson = i41 % 128;
                                            if (i41 % 2 != 0) {
                                                throw null;
                                            }
                                        }
                                    }
                                    i38++;
                                    strArr6 = strArr7;
                                }
                                if (i38 >= 0 && (i16 = i ^ (i38 + 130)) != i) {
                                    java.lang.Object[] objArr117 = {new int[]{i}, new int[]{i16}, null, null, new int[1]};
                                    java.lang.Object[] objArr118 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((i7 | (-68436009)) * 494) + 376549827 + (((~(i7 | 1537808215)) | (-1161642350)) * 494))};
                                    java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj31 == null) {
                                        java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.green(0), 2713 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                        java.lang.Object[] objArr119 = new java.lang.Object[1];
                                        b((short) 653, (byte) (-$$a[16]), r5[14], objArr119);
                                        obj31 = cls31.getMethod((java.lang.String) objArr119[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj31);
                                    }
                                    ((int[]) objArr117[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr118)).intValue();
                                    return objArr117;
                                }
                            }
                        }
                        java.lang.Object[] objArr120 = new java.lang.Object[1];
                        a(1503 - android.view.View.combineMeasuredStates(0, 0), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3077), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 13, objArr120);
                        java.lang.String intern32 = ((java.lang.String) objArr120[0]).intern();
                        java.lang.Object[] objArr121 = new java.lang.Object[1];
                        a((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1515, (char) (android.view.KeyEvent.keyCodeFromString(str3) + 41136), android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 6, objArr121);
                        java.lang.String[] strArr8 = {intern32, ((java.lang.String) objArr121[0]).intern()};
                        java.lang.Object[] objArr122 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1521, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 15 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr122);
                        java.lang.String intern33 = ((java.lang.String) objArr122[0]).intern();
                        java.lang.Object[] objArr123 = new java.lang.Object[1];
                        a((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1535, (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 24784), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 19, objArr123);
                        java.lang.String intern34 = ((java.lang.String) objArr123[0]).intern();
                        java.lang.Object[] objArr124 = new java.lang.Object[1];
                        a(1555 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 14731), 15 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr124);
                        java.lang.String[] strArr9 = {intern33, intern34, ((java.lang.String) objArr124[0]).intern()};
                        java.lang.Object[] objArr125 = new java.lang.Object[1];
                        a(1569 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 10658), 21 - android.view.KeyEvent.getDeadChar(0, 0), objArr125);
                        java.lang.String intern35 = ((java.lang.String) objArr125[0]).intern();
                        java.lang.Object[] objArr126 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1590, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 10, objArr126);
                        java.lang.String[] strArr10 = {intern35, ((java.lang.String) objArr126[0]).intern()};
                        java.lang.Object[] objArr127 = new java.lang.Object[1];
                        a(1600 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (29415 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), android.view.KeyEvent.normalizeMetaState(0) + 11, objArr127);
                        java.lang.String intern36 = ((java.lang.String) objArr127[0]).intern();
                        java.lang.Object[] objArr128 = new java.lang.Object[1];
                        a(338 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (53587 - android.graphics.ImageFormat.getBitsPerPixel(0)), 6 - android.graphics.Color.argb(0, 0, 0, 0), objArr128);
                        java.lang.String[] strArr11 = {intern36, ((java.lang.String) objArr128[0]).intern()};
                        java.lang.Object[] objArr129 = new java.lang.Object[1];
                        a(1611 - android.graphics.Color.green(0), (char) (16414 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), 27 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr129);
                        c2 = 0;
                        java.lang.String intern37 = ((java.lang.String) objArr129[0]).intern();
                        java.lang.Object[] objArr130 = new java.lang.Object[1];
                        a(android.text.TextUtils.getOffsetBefore(str3, 0) + 1590, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10, objArr130);
                        java.lang.String[][] strArr12 = {strArr8, strArr9, strArr10, strArr11, new java.lang.String[]{intern37, ((java.lang.String) objArr130[0]).intern()}};
                        int i42 = -1;
                        i13 = 0;
                        loop4: while (true) {
                            if (i13 < 5) {
                                i14 = i;
                                break;
                            }
                            java.lang.String[] strArr13 = strArr12[i13];
                            java.lang.String str9 = strArr13[c2];
                            java.lang.String[] strArr14 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr13, 1, strArr13.length);
                            int length = strArr14.length;
                            int i43 = 0;
                            while (i43 < length) {
                                java.lang.String str10 = strArr14[i43];
                                java.io.File file = new java.io.File(str9);
                                if (file.exists() && file.isFile()) {
                                    try {
                                        java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(file));
                                        java.lang.Object[] objArr131 = new java.lang.Object[1];
                                        a(1639 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 36427), android.text.TextUtils.getOffsetBefore(str3, 0) + 2, objArr131);
                                        java.util.Scanner useDelimiter = scanner.useDelimiter(((java.lang.String) objArr131[0]).intern());
                                        java.lang.String next = useDelimiter.hasNext() ? useDelimiter.next() : str3;
                                        useDelimiter.close();
                                        if (next.contains(str10)) {
                                            i14 = i ^ (i42 + 171);
                                            break loop4;
                                        }
                                    } catch (java.io.IOException unused) {
                                        continue;
                                    }
                                }
                                i43++;
                                i42++;
                            }
                            i13++;
                            c2 = 0;
                        }
                        if (i14 == i) {
                            java.lang.Object[] objArr132 = {new int[]{i}, new int[]{i14}, null, null, new int[1]};
                            java.lang.Object[] objArr133 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((69730313 | i) * 988) - 1766469079) + (((~(i7 | 1047164333)) | 26247744) * (-1976)) + (((~(i | (-1003681765))) | 69730313 | (~(i7 | 1003681764))) * 988))};
                            java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj32 == null) {
                                java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 50, 2713 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (android.os.Process.myPid() >> 22));
                                java.lang.Object[] objArr134 = new java.lang.Object[1];
                                b((short) 653, (byte) (-$$a[16]), r4[14], objArr134);
                                obj32 = cls32.getMethod((java.lang.String) objArr134[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj32);
                            }
                            ((int[]) objArr132[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr133)).intValue();
                            return objArr132;
                        }
                        try {
                            java.lang.Object[] objArr135 = new java.lang.Object[1];
                            a(1641 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.view.View.getDefaultSize(0, 0) + 24466), 12 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr135);
                            java.lang.String intern38 = ((java.lang.String) objArr135[0]).intern();
                            java.lang.Object[] objArr136 = new java.lang.Object[1];
                            a(android.text.TextUtils.getOffsetBefore(str3, 0) + 1654, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 7, objArr136);
                            try {
                                java.lang.Object[] objArr137 = {intern38, ((java.lang.String) objArr136[0]).intern()};
                                java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                if (obj33 == null) {
                                    java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 2213 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) android.text.TextUtils.getOffsetAfter(str3, 0));
                                    short s15 = (short) ($$a[14] - 1);
                                    byte b20 = (byte) s15;
                                    java.lang.Object[] objArr138 = new java.lang.Object[1];
                                    b(s15, b20, b20, objArr138);
                                    obj33 = cls33.getMethod((java.lang.String) objArr138[0], java.lang.String.class, java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj33);
                                }
                                long j47 = ~((java.lang.Long) ((java.lang.reflect.Method) obj33).invoke(null, objArr137)).longValue();
                                long j48 = ((r4 * (-489)) - 350959517979L) + ((714785168 | j47 | j2) * (-490)) + (((~(j47 | (-714785169))) | (~(j47 | j3))) * 490) + 350224142887L;
                                int i44 = ~(i7 | 1244245695);
                                if (((((int) j48) & ((((~((-1225933925) | i)) | 676405653) * 398) + 1015738825 + (((~(i7 | (-1225933925))) | 676405653) * 398))) | (((int) (j48 >> 32)) & ((((1076430868 | i44) * (-970)) - 1968476796) + ((i44 | 167814827) * 970)))) != 0) {
                                    i15 = i ^ 150;
                                } else {
                                    AlternateContactlessPaymentDataJson = (valueOf + 11) % 128;
                                    i15 = i;
                                }
                            } catch (java.lang.Throwable th2) {
                                java.lang.Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        } catch (java.lang.Exception unused2) {
                            i15 = i ^ 151;
                        }
                        if (i15 != i) {
                            java.lang.Object[] objArr139 = {new int[]{i}, new int[]{i15}, null, null, new int[1]};
                            java.lang.Object[] objArr140 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(i7 | (-1048399063))) | 977272978) * 446) - 2093446413) + (((~(i | (-71126085))) | 25174057) * 446) + 2072051292)};
                            java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj34 == null) {
                                java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2713, (char) android.view.KeyEvent.getDeadChar(0, 0));
                                java.lang.Object[] objArr141 = new java.lang.Object[1];
                                b((short) 653, (byte) (-$$a[16]), r4[14], objArr141);
                                obj34 = cls34.getMethod((java.lang.String) objArr141[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj34);
                            }
                            ((int[]) objArr139[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr140)).intValue();
                            return objArr139;
                        }
                        java.lang.Object[] objArr142 = new java.lang.Object[1];
                        a(1662 - android.view.View.MeasureSpec.getSize(0), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 47 - android.view.KeyEvent.normalizeMetaState(0), objArr142);
                        java.lang.Object[] objArr143 = {((java.lang.String) objArr142[0]).intern()};
                        java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                        if (obj35 == null) {
                            java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 36, 3162 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 33099));
                            short s16 = (short) ($$a[14] - 1);
                            byte b21 = (byte) s16;
                            java.lang.Object[] objArr144 = new java.lang.Object[1];
                            b(s16, b21, b21, objArr144);
                            obj35 = cls35.getMethod((java.lang.String) objArr144[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj35);
                        }
                        long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj35).invoke(null, objArr143)).longValue();
                        long j49 = ((((((-159) * longValue16) + 55835069004L) + ((351163955 | longValue16) * 160)) + (((~(j2 | (-351163956))) | (~((-351163956) | longValue16))) * (-160))) + (((~((~longValue16) | j2)) | (-351163956)) * 160)) - 986504152;
                        int i45 = (((((int) (j49 >> 32)) & (((((~(i7 | (-1812043710))) | (~(374817298 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1617614880) + (((~(i7 | 2119686079)) | (~((-67174929) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) | (((int) j49) & (((((~((-1142952210) | i)) * 623) - 432814222) + ((i7 | 269025348) * (-623))) + ((((~((-1865833874) | i)) | 1142952209) | (~(991907012 | i))) * 623)))) * 263) ^ i;
                        if (i45 != i) {
                            java.lang.Object[] objArr145 = {new int[]{i}, new int[]{i45}, null, null, new int[1]};
                            java.lang.Object[] objArr146 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(i7 | (-70910209))) | (~(i7 | (-1904233474)))) * (-184)) - 1642680999) + (((~(i7 | (-108761417))) | 37851208 | (~(i7 | (-1942084682)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 1023872120)};
                            java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj36 == null) {
                                java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 50, android.widget.ExpandableListView.getPackedPositionChild(0L) + 2714, (char) android.view.View.MeasureSpec.getMode(0));
                                java.lang.Object[] objArr147 = new java.lang.Object[1];
                                b((short) 653, (byte) (-$$a[16]), r5[14], objArr147);
                                obj36 = cls36.getMethod((java.lang.String) objArr147[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj36);
                            }
                            ((int[]) objArr145[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr146)).intValue();
                            return objArr145;
                        }
                        java.lang.Object[] objArr148 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                        java.lang.Object[] objArr149 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~(i | (-1980437893))) | (-70408206)) * (-964)) + 778493417 + (((~(i7 | (-1980437893))) | 1913193856) * (-964)))};
                        java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj37 == null) {
                            java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.Gravity.getAbsoluteGravity(0, 0), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2713, (char) ((-1) - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                            java.lang.Object[] objArr150 = new java.lang.Object[1];
                            b((short) 653, (byte) (-$$a[16]), r3[14], objArr150);
                            obj37 = cls37.getMethod((java.lang.String) objArr150[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj37);
                        }
                        ((int[]) objArr148[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr149)).intValue();
                        return objArr148;
                    }
                } else {
                    i11 = 2;
                }
                java.lang.Object[] objArr151 = new java.lang.Object[1];
                a((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 309, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.text.TextUtils.indexOf(str2, str2, 0) + 23, objArr151);
                java.lang.String intern39 = ((java.lang.String) objArr151[0]).intern();
                java.lang.Object[] objArr152 = new java.lang.Object[1];
                a(android.view.View.getDefaultSize(0, 0) + 365, (char) (27980 - android.view.KeyEvent.normalizeMetaState(0)), 10 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr152);
                java.lang.String intern40 = ((java.lang.String) objArr152[0]).intern();
                java.lang.Object[] objArr153 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 375, (char) (android.os.Process.myTid() >> 22), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 7, objArr153);
                java.lang.String intern41 = ((java.lang.String) objArr153[0]).intern();
                java.lang.Object[] objArr154 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 382, (char) ((android.os.Process.myTid() >> 22) + 35693), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7, objArr154);
                java.lang.String[] strArr15 = {intern39, intern40, intern41, ((java.lang.String) objArr154[0]).intern()};
                java.lang.Object[] objArr155 = new java.lang.Object[1];
                a(390 - android.text.TextUtils.getOffsetAfter(str2, 0), (char) (54269 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16, objArr155);
                java.lang.String intern42 = ((java.lang.String) objArr155[0]).intern();
                java.lang.Object[] objArr156 = new java.lang.Object[1];
                a(android.graphics.Color.rgb(0, 0, 0) + 16777623, (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 58996), (android.os.Process.myPid() >> 22) + 7, objArr156);
                java.lang.String intern43 = ((java.lang.String) objArr156[0]).intern();
                java.lang.Object[] objArr157 = new java.lang.Object[1];
                a((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + com.datadog.android.core.internal.data.upload.DataOkHttpUploader.HTTP_ENTITY_TOO_LARGE, (char) (20245 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 7 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr157);
                java.lang.String intern44 = ((java.lang.String) objArr157[0]).intern();
                java.lang.Object[] objArr158 = new java.lang.Object[1];
                a(android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 422, (char) (20689 - android.text.TextUtils.getOffsetAfter(str2, 0)), android.view.View.getDefaultSize(0, 0) + 11, objArr158);
                java.lang.String intern45 = ((java.lang.String) objArr158[0]).intern();
                java.lang.Object[] objArr159 = new java.lang.Object[1];
                a(432 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.graphics.Color.alpha(0), 14 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr159);
                java.lang.String[] strArr16 = {intern42, intern43, intern44, intern45, ((java.lang.String) objArr159[0]).intern()};
                java.lang.Object[] objArr160 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getTouchSlop() >> 8) + 446, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), 15 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr160);
                java.lang.String intern46 = ((java.lang.String) objArr160[0]).intern();
                java.lang.Object[] objArr161 = new java.lang.Object[1];
                a(461 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3, objArr161);
                java.lang.String intern47 = ((java.lang.String) objArr161[0]).intern();
                java.lang.Object[] objArr162 = new java.lang.Object[1];
                a(472 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (18151 - android.view.View.resolveSizeAndState(0, 0, 0)), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 22, objArr162);
                java.lang.String intern48 = ((java.lang.String) objArr162[0]).intern();
                java.lang.Object[] objArr163 = new java.lang.Object[1];
                a(495 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) android.view.View.resolveSizeAndState(0, 0, 0), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 25, objArr163);
                java.lang.String intern49 = ((java.lang.String) objArr163[0]).intern();
                java.lang.Object[] objArr164 = new java.lang.Object[1];
                a(521 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4154), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28, objArr164);
                j2 = j15;
                char c4 = '0';
                j3 = j;
                str3 = str2;
                java.lang.String[] strArr17 = {intern46, intern47, str, intern48, intern49, ((java.lang.String) objArr164[0]).intern()};
                java.lang.Object[] objArr165 = new java.lang.Object[1];
                a(547 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (3946 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 11, objArr165);
                java.lang.String intern50 = ((java.lang.String) objArr165[0]).intern();
                java.lang.Object[] objArr166 = new java.lang.Object[1];
                a((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 558, (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 59937), 9 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr166);
                java.lang.String intern51 = ((java.lang.String) objArr166[0]).intern();
                java.lang.Object[] objArr167 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 567, (char) (android.os.Process.myPid() >> 22), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 6, objArr167);
                java.lang.String intern52 = ((java.lang.String) objArr167[0]).intern();
                java.lang.Object[] objArr168 = new java.lang.Object[1];
                a(572 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.KeyEvent.keyCodeFromString(str3) + 60419), 6 - (android.os.Process.myPid() >> 22), objArr168);
                java.lang.String[] strArr18 = {intern50, intern51, intern52, ((java.lang.String) objArr168[0]).intern()};
                java.lang.Object[] objArr169 = new java.lang.Object[1];
                a(android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 580, (char) (android.os.Process.myPid() >> 22), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 16, objArr169);
                java.lang.String intern53 = ((java.lang.String) objArr169[0]).intern();
                java.lang.Object[] objArr170 = new java.lang.Object[1];
                a(android.graphics.Color.red(0) + 414, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 20243), 6 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr170);
                java.lang.String intern54 = ((java.lang.String) objArr170[0]).intern();
                java.lang.Object[] objArr171 = new java.lang.Object[1];
                a(383 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (35693 - android.view.View.getDefaultSize(0, 0)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 7, objArr171);
                java.lang.String[] strArr19 = {intern53, intern54, ((java.lang.String) objArr171[0]).intern()};
                java.lang.Object[] objArr172 = new java.lang.Object[1];
                a(595 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, objArr172);
                java.lang.String intern55 = ((java.lang.String) objArr172[0]).intern();
                java.lang.Object[] objArr173 = new java.lang.Object[1];
                a(android.graphics.Color.argb(0, 0, 0, 0) + androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_POLAR_RELATIVETO, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), 1 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr173);
                java.lang.String[] strArr20 = {intern55, ((java.lang.String) objArr173[0]).intern()};
                java.lang.Object[] objArr174 = new java.lang.Object[1];
                a(610 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 17718), android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 10, objArr174);
                java.lang.String intern56 = ((java.lang.String) objArr174[0]).intern();
                java.lang.Object[] objArr175 = new java.lang.Object[1];
                a(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 620, (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11316), 1 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr175);
                java.lang.String[] strArr21 = {intern56, ((java.lang.String) objArr175[0]).intern()};
                java.lang.Object[] objArr176 = new java.lang.Object[1];
                a(620 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) android.text.TextUtils.getCapsMode(str3, 0, 0), 16 - (android.os.Process.myTid() >> 22), objArr176);
                java.lang.String intern57 = ((java.lang.String) objArr176[0]).intern();
                java.lang.Object[] objArr177 = new java.lang.Object[1];
                a(android.view.View.MeasureSpec.getSize(0) + 462, (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + i11, objArr177);
                java.lang.String intern58 = ((java.lang.String) objArr177[0]).intern();
                java.lang.Object[] objArr178 = new java.lang.Object[1];
                a(408 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (58995 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 6 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr178);
                java.lang.String intern59 = ((java.lang.String) objArr178[0]).intern();
                java.lang.Object[] objArr179 = new java.lang.Object[1];
                a(636 - android.text.TextUtils.getCapsMode(str3, 0, 0), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 17942), android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 9, objArr179);
                java.lang.String intern60 = ((java.lang.String) objArr179[0]).intern();
                java.lang.Object[] objArr180 = new java.lang.Object[1];
                a(421 - android.text.TextUtils.getOffsetAfter(str3, 0), (char) (20688 - android.widget.ExpandableListView.getPackedPositionChild(0L)), 11 - (android.os.Process.myPid() >> 22), objArr180);
                java.lang.String intern61 = ((java.lang.String) objArr180[0]).intern();
                java.lang.Object[] objArr181 = new java.lang.Object[1];
                a(android.view.View.MeasureSpec.getSize(0) + 432, (char) android.text.TextUtils.getOffsetAfter(str3, 0), 13 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr181);
                java.lang.String[] strArr22 = {intern57, intern58, intern59, intern60, intern61, ((java.lang.String) objArr181[0]).intern()};
                java.lang.Object[] objArr182 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 644, (char) (android.graphics.Color.alpha(0) + 976), (android.os.Process.myTid() >> 22) + 20, objArr182);
                java.lang.String intern62 = ((java.lang.String) objArr182[0]).intern();
                java.lang.Object[] objArr183 = new java.lang.Object[1];
                a(android.view.Gravity.getAbsoluteGravity(0, 0) + 664, (char) ((android.os.Process.myTid() >> 22) + 44169), 19 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr183);
                java.lang.String intern63 = ((java.lang.String) objArr183[0]).intern();
                java.lang.Object[] objArr184 = new java.lang.Object[1];
                a(682 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (22470 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 32, objArr184);
                java.lang.String intern64 = ((java.lang.String) objArr184[0]).intern();
                java.lang.Object[] objArr185 = new java.lang.Object[1];
                a(713 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 37245), 26 - android.graphics.Color.argb(0, 0, 0, 0), objArr185);
                java.lang.String intern65 = ((java.lang.String) objArr185[0]).intern();
                java.lang.Object[] objArr186 = new java.lang.Object[1];
                a(android.graphics.Color.red(0) + 740, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24, objArr186);
                java.lang.String intern66 = ((java.lang.String) objArr186[0]).intern();
                java.lang.Object[] objArr187 = new java.lang.Object[1];
                a(763 - android.view.View.MeasureSpec.getSize(0), (char) (61199 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 33 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr187);
                java.lang.String[] strArr23 = {intern62, intern63, intern64, intern65, intern66, ((java.lang.String) objArr187[0]).intern(), str};
                java.lang.Object[] objArr188 = new java.lang.Object[1];
                a(android.text.TextUtils.getCapsMode(str3, 0, 0) + 796, (char) (56733 - android.view.View.resolveSize(0, 0)), 13 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr188);
                java.lang.String intern67 = ((java.lang.String) objArr188[0]).intern();
                java.lang.Object[] objArr189 = new java.lang.Object[1];
                a((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 374, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 6 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr189);
                java.lang.String[] strArr24 = {intern67, ((java.lang.String) objArr189[0]).intern()};
                java.lang.Object[] objArr190 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getTapTimeout() >> 16) + 809, (char) android.text.TextUtils.getOffsetBefore(str3, 0), 30 - android.graphics.Color.green(0), objArr190);
                java.lang.String intern68 = ((java.lang.String) objArr190[0]).intern();
                java.lang.Object[] objArr191 = new java.lang.Object[1];
                a((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 839, (char) ((-1) - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 12, objArr191);
                java.lang.String[] strArr25 = {intern68, ((java.lang.String) objArr191[0]).intern()};
                java.lang.Object[] objArr192 = new java.lang.Object[1];
                a(849 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19, objArr192);
                java.lang.String intern69 = ((java.lang.String) objArr192[0]).intern();
                java.lang.Object[] objArr193 = new java.lang.Object[1];
                a(869 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 5, objArr193);
                java.lang.String[] strArr26 = {intern69, ((java.lang.String) objArr193[0]).intern()};
                java.lang.Object[] objArr194 = new java.lang.Object[1];
                a(874 - android.text.TextUtils.indexOf(str3, str3), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 19 - android.view.KeyEvent.getDeadChar(0, 0), objArr194);
                java.lang.String[] strArr27 = {((java.lang.String) objArr194[0]).intern()};
                java.lang.Object[] objArr195 = new java.lang.Object[1];
                a(894 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 17, objArr195);
                java.lang.String[] strArr28 = {((java.lang.String) objArr195[0]).intern()};
                java.lang.Object[] objArr196 = new java.lang.Object[1];
                a(android.view.View.MeasureSpec.getSize(0) + 909, (char) (31345 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 19, objArr196);
                java.lang.String[] strArr29 = {((java.lang.String) objArr196[0]).intern()};
                java.lang.Object[] objArr197 = new java.lang.Object[1];
                a(928 - android.view.KeyEvent.keyCodeFromString(str3), (char) android.graphics.Color.red(0), android.graphics.ImageFormat.getBitsPerPixel(0) + 20, objArr197);
                java.lang.String[] strArr30 = {((java.lang.String) objArr197[0]).intern()};
                java.lang.Object[] objArr198 = new java.lang.Object[1];
                a(947 - (android.os.Process.myTid() >> 22), (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 7127), android.view.KeyEvent.getDeadChar(0, 0) + 23, objArr198);
                java.lang.String[] strArr31 = {((java.lang.String) objArr198[0]).intern()};
                java.lang.Object[] objArr199 = new java.lang.Object[1];
                a(970 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) android.graphics.Color.green(0), 22 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr199);
                java.lang.String[] strArr32 = {((java.lang.String) objArr199[0]).intern()};
                java.lang.Object[] objArr200 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 991, (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16900), 24 - android.view.View.MeasureSpec.getMode(0), objArr200);
                java.lang.String str11 = str;
                java.lang.String[] strArr33 = {((java.lang.String) objArr200[0]).intern(), str11};
                java.lang.Object[] objArr201 = new java.lang.Object[1];
                a(android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1016, (char) (android.view.MotionEvent.axisFromString(str3) + 27378), 28 - android.text.TextUtils.indexOf(str3, str3), objArr201);
                java.lang.String[] strArr34 = {((java.lang.String) objArr201[0]).intern(), str11};
                java.lang.Object[] objArr202 = new java.lang.Object[1];
                a(android.view.KeyEvent.normalizeMetaState(0) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_SPOT_HALFTONE, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10249), 27 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr202);
                java.lang.String[] strArr35 = {((java.lang.String) objArr202[0]).intern(), str11};
                java.lang.Object[] objArr203 = new java.lang.Object[1];
                a(1069 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.view.View.MeasureSpec.getMode(0), (android.os.Process.myTid() >> 22) + 31, objArr203);
                java.lang.String[] strArr36 = {((java.lang.String) objArr203[0]).intern(), str11};
                java.lang.Object[] objArr204 = new java.lang.Object[1];
                a(1101 - android.graphics.Color.blue(0), (char) (12489 - android.graphics.Color.argb(0, 0, 0, 0)), android.graphics.Color.blue(0) + 27, objArr204);
                java.lang.String[] strArr37 = {((java.lang.String) objArr204[0]).intern(), str11};
                java.lang.Object[] objArr205 = new java.lang.Object[1];
                a(1127 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), 31 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr205);
                java.lang.String[][] strArr38 = {strArr15, strArr16, strArr17, strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, new java.lang.String[]{((java.lang.String) objArr205[0]).intern(), str11}};
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i46 = i;
                int i47 = 0;
                int i48 = 0;
                while (i47 < 24) {
                    java.lang.String[] strArr39 = strArr38[i47];
                    java.lang.Object[] objArr206 = {strArr39[0]};
                    java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj38 == null) {
                        java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str3, c4, 0) + 41, 1922 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (android.text.TextUtils.indexOf(str3, c4, 0) + 1));
                        short s17 = (short) ($$a[14] - 1);
                        byte b22 = (byte) s17;
                        java.lang.Object[] objArr207 = new java.lang.Object[1];
                        b(s17, b22, b22, objArr207);
                        obj38 = cls38.getMethod((java.lang.String) objArr207[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj38);
                    }
                    java.lang.String str12 = (java.lang.String) ((java.lang.reflect.Method) obj38).invoke(null, objArr206);
                    java.lang.String[] strArr40 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr39, 1, strArr39.length);
                    if (str12 != null && str12.length() != 0) {
                        int i49 = valueOf + 35;
                        AlternateContactlessPaymentDataJson = i49 % 128;
                        int i50 = i49 % 2;
                        int length2 = strArr39.length;
                        if (i50 == 0 ? length2 != 1 : length2 != 0) {
                            for (java.lang.String str13 : strArr40) {
                                if (!str12.contains(str13)) {
                                }
                            }
                        }
                        i48++;
                        i46 = i ^ (i47 + 10);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(str12);
                        java.lang.Object[] objArr208 = new java.lang.Object[1];
                        a(1160 - android.graphics.Color.red(0), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr208);
                        sb.append(((java.lang.String) objArr208[0]).intern());
                        sb.append(str12);
                        arrayList.add(sb.toString());
                        break;
                    }
                    i47++;
                    c4 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                }
                if (i48 > 2) {
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i46}, arrayList, null, new int[1]};
                    java.lang.Object[] objArr209 = {num, num, java.lang.Integer.valueOf((((478973648 | i) * (-50)) - 1054486401) + (((~((-478187201) | i)) | (~(i7 | (-1093685250)))) * 50) + (((~(i7 | 478973648)) | (~(i7 | (-1571872450))) | 1093685249) * 50))};
                    java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj39 == null) {
                        java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 50, 2713 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        java.lang.Object[] objArr210 = new java.lang.Object[1];
                        b((short) 653, (byte) (-$$a[16]), r7[14], objArr210);
                        obj39 = cls39.getMethod((java.lang.String) objArr210[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj39);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr209)).intValue();
                    c = 0;
                    ((int[]) objArr[4])[0] = intValue;
                } else {
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                    java.lang.Object[] objArr211 = {num, num, java.lang.Integer.valueOf(((((~((-866377425) | i)) | (-1184468674)) * (-318)) - 317923277) + (((~((-1184468674) | i)) | (~(i7 | 2008800977))) * 318) + (((~(i7 | (-1142423554))) | (~(2008800977 | i))) * 318))};
                    java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj40 == null) {
                        java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 50, 2712 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.view.KeyEvent.normalizeMetaState(0));
                        java.lang.Object[] objArr212 = new java.lang.Object[1];
                        b((short) 653, (byte) (-$$a[16]), r7[14], objArr212);
                        obj40 = cls40.getMethod((java.lang.String) objArr212[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj40);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj40).invoke(null, objArr211)).intValue();
                    c = 0;
                    ((int[]) objArr[4])[0] = intValue2;
                }
                int i51 = ((int[]) objArr[1])[c];
                if (i51 != i) {
                    int[] iArr = new int[1];
                    int[] iArr2 = new int[1];
                    java.util.List list = (java.util.List) objArr[2];
                    iArr[c] = i;
                    iArr2[c] = i51;
                    java.lang.Object[] objArr213 = {iArr, iArr2, list, null, new int[1]};
                    int i52 = ~(115403474 | i);
                    java.lang.Object[] objArr214 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(i | 1935442623)) | (~(i7 | (-37782163)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) - 716568839) + (((~(i7 | (-1935442624))) | i52) * (-1040)) + ((i52 | (~(i7 | (-115403475))) | 1897660461) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL))};
                    java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj41 == null) {
                        java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString(str3) + 51, 2712 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.view.KeyEvent.normalizeMetaState(0));
                        java.lang.Object[] objArr215 = new java.lang.Object[1];
                        b((short) 653, (byte) (-$$a[16]), r3[14], objArr215);
                        obj41 = cls41.getMethod((java.lang.String) objArr215[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj41);
                    }
                    ((int[]) objArr213[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj41).invoke(null, objArr214)).intValue();
                    return objArr213;
                }
                java.lang.Object[] objArr882 = new java.lang.Object[1];
                a(447 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) android.view.View.MeasureSpec.getSize(0), android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 17, objArr882);
                java.lang.Object[] objArr892 = {((java.lang.String) objArr882[0]).intern()};
                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj == null) {
                }
                invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr892);
                if (invoke != null) {
                }
                if (i12 != 1986687685) {
                }
                java.lang.Object[] objArr1202 = new java.lang.Object[1];
                a(1503 - android.view.View.combineMeasuredStates(0, 0), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3077), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 13, objArr1202);
                java.lang.String intern322 = ((java.lang.String) objArr1202[0]).intern();
                java.lang.Object[] objArr1212 = new java.lang.Object[1];
                a((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1515, (char) (android.view.KeyEvent.keyCodeFromString(str3) + 41136), android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 6, objArr1212);
                java.lang.String[] strArr82 = {intern322, ((java.lang.String) objArr1212[0]).intern()};
                java.lang.Object[] objArr1222 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1521, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 15 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr1222);
                java.lang.String intern332 = ((java.lang.String) objArr1222[0]).intern();
                java.lang.Object[] objArr1232 = new java.lang.Object[1];
                a((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1535, (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 24784), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 19, objArr1232);
                java.lang.String intern342 = ((java.lang.String) objArr1232[0]).intern();
                java.lang.Object[] objArr1242 = new java.lang.Object[1];
                a(1555 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 14731), 15 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr1242);
                java.lang.String[] strArr92 = {intern332, intern342, ((java.lang.String) objArr1242[0]).intern()};
                java.lang.Object[] objArr1252 = new java.lang.Object[1];
                a(1569 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 10658), 21 - android.view.KeyEvent.getDeadChar(0, 0), objArr1252);
                java.lang.String intern352 = ((java.lang.String) objArr1252[0]).intern();
                java.lang.Object[] objArr1262 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1590, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 10, objArr1262);
                java.lang.String[] strArr102 = {intern352, ((java.lang.String) objArr1262[0]).intern()};
                java.lang.Object[] objArr1272 = new java.lang.Object[1];
                a(1600 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (29415 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), android.view.KeyEvent.normalizeMetaState(0) + 11, objArr1272);
                java.lang.String intern362 = ((java.lang.String) objArr1272[0]).intern();
                java.lang.Object[] objArr1282 = new java.lang.Object[1];
                a(338 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (53587 - android.graphics.ImageFormat.getBitsPerPixel(0)), 6 - android.graphics.Color.argb(0, 0, 0, 0), objArr1282);
                java.lang.String[] strArr112 = {intern362, ((java.lang.String) objArr1282[0]).intern()};
                java.lang.Object[] objArr1292 = new java.lang.Object[1];
                a(1611 - android.graphics.Color.green(0), (char) (16414 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), 27 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr1292);
                c2 = 0;
                java.lang.String intern372 = ((java.lang.String) objArr1292[0]).intern();
                java.lang.Object[] objArr1302 = new java.lang.Object[1];
                a(android.text.TextUtils.getOffsetBefore(str3, 0) + 1590, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10, objArr1302);
                java.lang.String[][] strArr122 = {strArr82, strArr92, strArr102, strArr112, new java.lang.String[]{intern372, ((java.lang.String) objArr1302[0]).intern()}};
                int i422 = -1;
                i13 = 0;
                loop4: while (true) {
                    if (i13 < 5) {
                    }
                    i13++;
                    c2 = 0;
                }
                if (i14 == i) {
                }
            }
        }
        i9 = i;
        if (i9 == i) {
        }
    }

    static void init$0() {
        $$a = new byte[]{71, -67, -2, -10, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10};
        $$b = 117;
    }
}
