package com.payair.hce;

/* loaded from: classes4.dex */
public class setVersion extends java.lang.Exception {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static char[] valueOf;
    private static long values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = 39 - (i * 2);
        int i5 = i2 + 65;
        byte[] bArr = $$a;
        int i6 = (s * 2) + 1;
        char[] cArr = new char[i6];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i5 = (i5 + i7) - 2;
            cArr[i3] = (char) i5;
            i3++;
            i4++;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i7 = bArr[i4];
            i5 = (i5 + i7) - 2;
            cArr[i3] = (char) i5;
            i3++;
            i4++;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            cArr[i3] = (char) i5;
            i3++;
            i4++;
            if (i3 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = (b * 3) + 99;
        int i4 = (s * 3) + 4;
        byte[] bArr = $$d;
        int i5 = (b2 * 3) + 1;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            i4++;
            i3 = (-i3) + i6;
            i = i7;
            bArr2[i] = (byte) i3;
            i2 = i + 1;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = i3;
            i3 = bArr[i4];
            i7 = i2;
            i4++;
            i3 = (-i3) + i6;
            i = i7;
            bArr2[i] = (byte) i3;
            i2 = i + 1;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            i2 = i + 1;
            if (i2 == i5) {
            }
        }
    }

    public setVersion(java.lang.String str) {
        super(str);
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        int i3 = $11 + 85;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 2 / 2;
        }
        while (getcvmmodel.valueOf < i2) {
            int i5 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(valueOf[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.text.TextUtils.getOffsetAfter("", 0), 380 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 62388));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c((byte) 0, (short) 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(values), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.text.TextUtils.getOffsetBefore("", 0), 3966 - android.graphics.Color.alpha(0), (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
        $10 = ($11 + 13) % 128;
        while (getcvmmodel.valueOf < i2) {
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 34, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.view.View.getDefaultSize(0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        AlternateContactlessPaymentDataJson = 0;
        DigitizedCardProfile = 1;
        char[] cArr = new char[1707];
        java.nio.ByteBuffer.wrap("^\u0080\u009a*×\b\u0010zM\u0004\u0086\u00adÃ\u0086<äyÃµ î\f+wdK¡\u009d\u009a\u0080×ä\u0010ÛL,\u0089\u0018Âo?Hx\u0085µ\u008aîè+Ög5 \u0010\u0087\u0083C)\u000e\u000bÉy\u0094\u0007_®\u001a\u0085åç Àl#7\u000fòt½Hx\u009eC\u0092\u000eêÉÌ\u00958P!\u001b{æH¡«l\u00997ïòÐyL½æðÄ7¶jÈ¡aäJ\u001b(^\u000f\u0092ìÉÀ\f»C\u0087\u0086Q½^ð57\u001dkñx³¼\u000eñ'6Lk7 \u0094åµ\u001aß_á\u0093\u0019È3\r\u0018Bw\u0087\u009e¼¾ñ×6êj\u0004¯=äG\u0019W^\u008b\u0093«Èß\rðA\u0000\u00864»^^\u0080\u009a+×\u0019\u0010oM\u0004\u0086®Ã\u008e<¦y×µ4î\n+t^\u0080\u009a+×\u0019\u0010oM\u0004\u0086¹Ã\u0080<åy\u0089µ6î\u0017+kdS^\u0080\u009a=×\t\u0010oMJ\u0086¸Ã\u008d<§yõµ\u0000î(+kdU¡§\u009a¥×á\u0010ËL?Á%\u0005\u0098H±\u008fÚÒú\u0019\n\\!£\u0002æn*\u008aq¢´\u008eûê>\u000e\u0005&HK\u008fxÓÕ\u0016«]ÖEf\u0081\u008cÌ¡\u000bÉVï\u009d\u0019õ\u009a1f\u0086ÿBB\u000fkÈ\u0000\u0095 ^Ð\u001bûäØ¡ºmP6tóT¼2yØBó\u000f\u008aÈ\u0096\u0094lQ/\u001a\rç! Èmó6Êó«¿FxdE\u001f\u000e>ËÂ\u0094â^\u0080\u009a=×\u0014\u0010\u007fM_\u0086¯Ã\u0084<§yÅµ/î\u000b++dM¡§\u009a\u008c×õ\u0010éL\u0013\u0089PÂl?Ixµµ\u0089\u0097ÍSp\u001eYÙ2\u0084\u0012Oâ\nÉõê°\u0086|b'Jâf\u00ad\u0002hæSÎ\u001e£Ù\u0097\u0085~@E\u000b\u0007ö;±ç|Æ'ºâ\u008a®5iKT6Ò\u0007\u0016\u00ad[\u008f\u009cýÁ\u0083\n#O\u000b°bõU9¦b\u0097§æè×-1}\u0095¹iô\u000b3&n\u0016¥ëàÍ\u001f¤ZÁ\u0096fÍB\b?G\u001fH\u0094\u008c~ÁY\u0006*[\u001b\u0090±ÕÒ*¸o\u0086^\u0080\u009a>×\u001f\u0010cMH\u0086åÃ\u008f<áyËµ#î\u0016+}dP¡¶\u009a\u0084×í\u0010Ì^Á\u009a+×\u0000\u0010yMX\u0086¬^Ý\u009a!×C\u0010|MY\u0086¥Ã\u008d<ýyÄµ2îK+idB¡¬\u009a\u0094×æ\u0010ÞL=\u0089\tÂi?Ix¿µ\u008bìs(\u0090e¸¢ÎXç\u009c\u0012Ñ<\u0016JKf\u0080\u0092^\u0080\u009a>×\u001f\u0010cMH\u0086åÃ\u0084<çyÃµ3î\t+adP'¼ãI®gi\u00114)ÿÚºéE\u009e\u0000¶\b\u0000ÌÃ\u0081ëF\u009d\u001b®ÐM\u0095uj\t/ ãÀç\u001e#änÂ©¦ô\u0080?yzC}¬¹Fô\u007f3\u0003n&¥Ãàü\u001f\u0085½_y£4Áóþ®Ûe' \u000fß\u007f\u009aFV°\rÉÈâ\u0087ÄB6y\n4aóX^Ù\u009a,×\u0002\u0010tM\u0013\u0086üÃ\u0099º²~Q3yô\u0013©#bÙ'ð\u000bÅÏ&\u0082\u000eEd\u0018TÓ®\u0096\u0087iÚ,Òàs»^^È\u009a+×\u0003\u0010iMY\u0086£Ã\u008a<×yßµ~îS+[d\u0015¡ö^Ý\u009a!×C\u0010|MY\u0086¥Ã\u008d<ýyÄµ2îK+idL¡¦\u009a\u0084×ìÚI\u001e¿S\u0093^Ê\u009a#×\u0018\u0010`MJ\u0086¾Ã\u0086<úùõ=%p\u0006·7êb!¤d\u009c\u009bçÞÕ\u00120I\u001b\u008c?Ã^\u0006¶=\u0088p»·çë-.\u0014eh\u0098Mß¤¼\u001bxÕ5üò\u008b¯±dV!xÞ]\u009b\u0001W÷\fÛÉÑ\u0086´CBx}5\u0019ò>®\u008bkî \u0086Ý¼\u009a\u000fWt\fUÉt%já¤¬\u008dkú6Àý'¸\tG,\u0002pÎ\u0086\u0095ªP \u001fÅÚ3á\f¬hkO7úò\u009f¹÷DÍ\u0003~Î\u0005\u0095$P\u0005\u001c\u008dÛÇæ¤^Ý\u009a!×C\u0010dMJ\u0086¸Ã\u008d<ÿyÆµ4î\u0000^È\u009a!×\u0001\u0010hMM\u0086£Ã\u009a<à^Ù\u009a,×\u0002\u0010tM\u0013\u0086ü&pâ\u0082¯®hÂ5îþ\u0012©=mÁ £ç\u009cº¹qE4mË\u001d\u008e$BÒ\u0019«Ü\u0086\u0093±VCmo \u0004^Ý\u009a!×C\u0010gMN\u0086¸Ã\u0087<íyËµhî\u0014+adN¡·n\u009c^Ý\u009a!×C\u0010\u007fMN\u0086©Ã\u009c<úyÂ\u0087ÚWb\u0093\u009eÞü\u0019ÑDá\u008f\u001cÊ:5Sp6¼\u0089ç¨\"Ômø¨\b\u0093=ÞK^É\u009a;×\u0001\u0010`Mt\u0086²ÃÑ<¾^Ý\u009a!×C\u0010nM^\u0086£Ã\u0085<ìy\u0089µ î\f+jdD¡§\u009a\u0093×ð\u0010ÍL7\u0089\u0013Âh³\u0017wô:Üý¶ \u0086k|.UÑx\u0094\u000bXý\u0003ÑÆô\u0089\u009bLxwP::ý\u0012¡èdÁÉ×\r4@\u001c\u0087vÚF\u0011¼T\u0095«ÈîÀ\"ayL¼4óO6¹\r\u0095@À\u0087ØÛy\u001eTU,¨Cï \"\u0088yâ¼Úð 7\t\nTAT\u0084õÛØ\u0015IÑª\u009c\u0082[è\u0006ØÍ\"\u0088\u000bw&2Aþ¨¥\u008b`â/Îê&Ñ?\u009cr[Z\u0007´ÂÓ\u0089útß35þ\u001d¥k`_,´ú@>£s\u008b´áéÑ\"+g\u0002\u0098/ÝY\u0011¬J\u0082\u008fôÀ\u0093\u0005|>\u0019s'´Aè´-\u009afì\u009b\u008bÜd\u0011\u0001^È\u009a!×\u0002\u0010kMG\u0086¯ÃÆ<ûyÃµ-î:+cdS¡ª\u009a\u008e×î\u0010ÚL\u0001\u0089\u0005Â$?\rxõµ\u009eîý+Ùg3 \u0007\u009d}ÖP\u0013\u008dL\u0089\u0089¨Â¹^Ý\u009a!×C\u0010nMD\u0086¥Ã\u009d<äyÈµ'î\u0001+adQk©¯Uâ7%\u001ax0³Ñöé\t\u0095L¾\u0080SÛv\u001e\u0015Qy\u0094Ô¯àâ\u009d%§yN¼'÷\u000e\n&MÀ\u0080êÛ\u0089\u001e±RR\u0095s¨\tã)&Ò\u008bÕO\u001b\u00022ÅE\u0098\u007fS\u0098\u0016¶é\u009e¬ä`E;h^Ý\u009a!×C\u0010nM^\u0086£Ã\u0085<ìy\u0089µ\"î\f+wdS¡®\u009a\u0080×ù\u0010\u0091L7\u0089\u0019ì\u0087(weB¢$ÿZ\u007f\u0017»ñöÕ1©lÔ§hâN\u001d:XX\u0094æÏÑ\n¸E\u0087\u0080>»@ö#1\u0001mÿ¨ß^Þ\u009a+×\u0000\u0010yM\u0005\u0086¢Ã\u009e<¦yÊµ'î\f+jdH¡§\u009a\u0098×ó^Þ\u009a+×\u0000\u0010yM\u0005\u0086¹Ã\u008f<¦yÁµ'î\u000e+ad|¡¡\u009a\u0080×í\u0010ÚL,\u0089\u001c\"Læ¹«\u0092lë1\u0097ú+¿\u001d@4\u0005YÉ·\u0092\u0093WÉ\u0018ÕÝ5æ\u001d«alD0¸õ\u0096^Ý\u009a!×C\u0010gMN\u0086¸Ã\u0087<íyËµhî\u0004+jdG¡°\u009a\u008e×é\u0010ÛLp\u0089\fÂy?Vx¯µ\u009d\u0080áD\u001d\t\u007fÎR\u0093xX\u0099\u001d¡â\u009a§êk\u001f04õMº1\u007f\u009fD«\tØÎÜ\u0092\fW \u001cMáb^Ý\u009a!×C\u0010cMO\u0086§ÃÇ<êyÒµ/î\t+`d\r¡¤\u009a\u0088×î\u0010ØL;\u0089\u000fÂl?Ix³µ\u0097îì^Ý\u009a!×C\u0010|MY\u0086¥Ã\u008d<ýyÄµ2îK+fdV¡«\u009a\u008d×ä\u0010\u0091L8\u0089\u0014Âr?\\x¿µ\u008bîè+Åg? \u001b\u009d`^Ý\u009a!×C\u0010\u007fMR\u0086¹Ã\u009d<íyÊµhî\u0007+qdJ¡®\u009a\u0085×®\u0010ÙL7\u0089\u0013Â{?^x¨µ\u0089îê+Þg8 \u0001p\u008b´wù\u0015>)c\u0004¨ïíË\u0012»W\u009c\u009bOÀV\u0005*J\u0001\u008fº´Õù£>\u0080bd§Oìd\u0011\u000bVå\u009bÁÀ©\u0005\u0084Ir\u008eS³0ø\f=êbÓ^Ý\u009a!×C\u0010zMN\u0086¤Ã\u008d<çyÕµhî\u0007+qdJ¡®\u009a\u0085×®\u0010ÙL7\u0089\u0013Â{?^x¨µ\u0089îê+Þg8 \u0001^Ý\u009a!×C\u0010zMN\u0086¤Ã\u008d<çyÕµ\u0019î\u0001+hdH¡¯\u009aÏ×â\u0010ÊL7\u0089\u0011Âx?\u0015x¼µ\u0090îö+Ðg3 \u0007\u009ddÖA\u0013»L\u009f\u0089ä£Ù^\u0080\u009a*×\b\u0010zM\u0004\u0086»Ã\u008c<åyÒµ\u0019î\u0015+mdS¡§^\u0080\u009a*×\b\u0010zM\u0004\u0086¹Ã\u0086<ëyÌµ#î\u0011++dA¡£\u009a\u0092×å\u0010ÝL?\u0089\u0013Âx?dx½µ\u009cîö+Îg2\u000b9Ï\u0093\u0082±EÃ\u0018½Ó\u0000\u0096?iR,uà\u009a»¨~\u00921ýô\u001eÏ6\u0082@EbÈ\u009b\f1A\u0013\u0086aÛ\u001f\u0010¢U\u009dªðï×#8x\n½0òI7¼\f\u0097Aî\u0086À^\u0080\u009a=×\u0014\u0010\u007fM\u0004\u0086»Ã\u008c<åyÒµ\u0019î\u0011+vdB¡¡\u009a\u0084è\u0015,¨a\u0081¦êûÊ0:u\u0011\u008a2Ï^\u0003ºX\u0092\u009d¾ÒÚ\u0017>,\u0016av¦uú¦?\u0089tå\u0089ÂÎ \u0003\u000fXR\u009dFÑ¦\u0016\u0082+ô`Á¥\u0018ú\u0015?`tw\u0089NÍö\u0002\u008aGñ½wyÝ4ÿó\u008d®óe_ mß\u000b\u009a\u000fVÖ\râÈ\u0080©\"m\u0088 ªçØº¦q\n48Ë^\u008eZB\u0090\u0019®ÜË\u0093äæµ\"\u001fo=¨Oõ1>\u008c{³\u0084ÞÁù\r\u0016V$\u0093\u001eÜt\u0019\u0084\" oÓ¨åô\u00071,zL\u0087|À\u008b^\u0080\u009a=×\u0014\u0010\u007fM_\u0086¯Ã\u0084<§yËµ/î\u0007++dO¡«\u009a\u0083×â\u0010ÌL*\u0089\u001bÂs?Wx¾µ\u009cîê+èg< \u001b\u009d}Ö\u001d\u0013¡L\u009eSü\u0097VÚt\u001d\u0006@x\u008bÔÎæ1\u0080tº¸Yãz&\u001d\u008döI\\\u0004~Ã\f\u009erUÞ\u0010ìï\u008aª¶fI=aø\u001d}\u0087¹-ô\u000f3}n\u0003¥¯à\u009d\u001fûZÍ\u0096$Í\u0005\bm¢Úfp+Rì ±^zò?ÀÀ¦\u0085\u0092In\u0012V×;^\u0080\u009a*×\b\u0010zM\u0004\u0086¨Ã\u009a<üyÑµ+î\u0016+ck\n¯ â\u0082%ðx\u008e³\"ö\u0010\tvL]\u0080«Û\u008e\u001eçQÙ\u0094+`Î¤déF.4sJ¸æýÔ\u0002²G¶\u008baÐF\u0015/*Jîà£Æd²9\u0080ò/·GH-\r\u001aÁâ\u009aÃ_¡\u0010\u0088ÕlîX£ed[8ìýÕ¶ùK\u0093\fcÁG\u009a9\u00adliÏ$ïã\u0094¾èuQ0lÏ\n\u008a/FÅ\u001dþØ\u009b\u0097àRli~$\u0018ã\u0000¿Úzð1\u0082Ì²\u008bRFS\u001d\u001bØ7\u0094ÞSün\u008a^\u0080\u009a>×\u001f\u0010cMH\u0086åÃ\u0080<çy×µ)î\u0017+pdP\u008bãOT\u0002wÅP\u0098m^\u0080\u009a>×\u001f\u0010cMH\u0086åÃ\u009a<íyËµ îJ+idB¡²\u009a\u0092^È\u009a<×\f\u0010`MG\u0086¥Ã\u008a<¦yÀµ)î\t+`dE¡«\u009a\u0092×è\u0010\u0091L-\u0089\u0012S|\u0097\u0098Ú°\u001dô@Ø\u008b0Î\u00051htz¸\u008aã®&\u0095iï¬\u0012\u0084«@\u0000\r2ÊD\u0097/\\\u008c\u0019§æÇ£åo\f4\u0011ñL¾g{\u008d@¯\rÈÊç\u0096[S.\u0018Zå|^Í\u009a\"×\u0018\u0010iMX\u0086¾Ã\u0088<ëyÌµ5i+\u00ad\u0080à²'Äz¯±\fô-\u000bVNb\u0082\u0099Ù½^\u0080\u009a*×\f\u0010xMJ\u0086åÃ\u008d<çyÐµ(î\t+kdB¡¦\u009a\u0092×¯\u0010\u0091L:\u0089\rÂ3?Zxªµ\u0089îë+\u0099g. \u0018\u009dx^\u0080\u009a>×\u001f\u0010cMH\u0086åÃ\u008a<øyÒµ/î\u000b+bdLo®«gæG!.|\u000b·åòÜ\r¦Ìë\bAEg\u0082\u0013ß!\u0014\u008eQï®\u008aë¿'N|!¹\u001fö:3Æ\bìE\u0082\u0082¸ÞP\u001bePX\u00ad3êÄ'à|Ü¹ìõ\u00122}\u000f\u0010D5\u0081\u0097Þ÷\u001b\u0092P\u0087\u00ad·éI&qc\t¸3õÖ2\u00ad\u000f\u0081D¨\u0080CÝz\u001a\u0001W$¬Ï".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1707);
        valueOf = cArr;
        values = 3335425773114726990L;
    }

    static void init$1() {
        $$d = new byte[]{98, 74, -39, 82};
        $$e = 174;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.DC4, -107, -36, -117, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10};
        $$b = 108;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0be7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0cac  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x24fc A[Catch: all -> 0x01cf, TryCatch #4 {all -> 0x01cf, blocks: (B:6:0x00d0, B:8:0x00e3, B:9:0x0131, B:18:0x01fe, B:20:0x0232, B:21:0x028a, B:28:0x0318, B:30:0x032b, B:31:0x037a, B:39:0x0457, B:41:0x049b, B:42:0x04f9, B:46:0x0511, B:48:0x0520, B:49:0x0565, B:55:0x061e, B:57:0x066d, B:58:0x06c7, B:77:0x07c4, B:79:0x080f, B:80:0x0868, B:87:0x092d, B:89:0x0940, B:90:0x0993, B:98:0x0a4f, B:100:0x0aae, B:101:0x0b09, B:105:0x0b48, B:107:0x0b5b, B:108:0x0ba4, B:115:0x0bff, B:117:0x0c3c, B:118:0x0c96, B:122:0x0cfc, B:124:0x0d0f, B:125:0x0d61, B:131:0x0e11, B:133:0x0e49, B:134:0x0ea2, B:138:0x0edb, B:140:0x0eee, B:141:0x0f37, B:147:0x0f98, B:149:0x0fd1, B:150:0x102c, B:154:0x1087, B:156:0x109a, B:157:0x10eb, B:163:0x12e2, B:165:0x132e, B:166:0x1388, B:169:0x139e, B:171:0x13ad, B:172:0x13f5, B:176:0x149a, B:178:0x14e5, B:179:0x1541, B:183:0x1558, B:185:0x1570, B:186:0x15b8, B:192:0x1648, B:194:0x1688, B:195:0x16e2, B:199:0x171b, B:201:0x172e, B:202:0x1773, B:204:0x177c, B:206:0x179a, B:207:0x17e9, B:213:0x24e9, B:215:0x24fc, B:216:0x2547, B:227:0x293e, B:229:0x2951, B:230:0x29a5, B:237:0x2a8e, B:239:0x2aa1, B:240:0x2aec, B:333:0x2b7b, B:335:0x2b8e, B:336:0x2bde, B:248:0x2c8d, B:250:0x2cd8, B:251:0x2d32, B:260:0x2f20, B:262:0x2f33, B:263:0x2f91, B:271:0x305d, B:274:0x30ee, B:277:0x3096, B:293:0x31d0, B:295:0x320d, B:296:0x326b, B:300:0x32ad, B:302:0x32c0, B:303:0x3310, B:307:0x33c1, B:309:0x33f9, B:310:0x344e, B:314:0x347c, B:317:0x3520, B:320:0x34c9, B:346:0x2553, B:348:0x2571, B:349:0x25c3, B:354:0x2170, B:356:0x2183, B:357:0x21d8, B:381:0x2276, B:383:0x22ab, B:384:0x2306, B:389:0x2419, B:391:0x2452, B:392:0x24ac, B:396:0x2335, B:398:0x2378, B:399:0x23d7, B:403:0x11d6, B:405:0x11e9, B:406:0x123d), top: B:5:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x2550  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x2f0e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x3045  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x3104  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x31b8  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x3281  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x3042 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x2553 A[Catch: all -> 0x01cf, TryCatch #4 {all -> 0x01cf, blocks: (B:6:0x00d0, B:8:0x00e3, B:9:0x0131, B:18:0x01fe, B:20:0x0232, B:21:0x028a, B:28:0x0318, B:30:0x032b, B:31:0x037a, B:39:0x0457, B:41:0x049b, B:42:0x04f9, B:46:0x0511, B:48:0x0520, B:49:0x0565, B:55:0x061e, B:57:0x066d, B:58:0x06c7, B:77:0x07c4, B:79:0x080f, B:80:0x0868, B:87:0x092d, B:89:0x0940, B:90:0x0993, B:98:0x0a4f, B:100:0x0aae, B:101:0x0b09, B:105:0x0b48, B:107:0x0b5b, B:108:0x0ba4, B:115:0x0bff, B:117:0x0c3c, B:118:0x0c96, B:122:0x0cfc, B:124:0x0d0f, B:125:0x0d61, B:131:0x0e11, B:133:0x0e49, B:134:0x0ea2, B:138:0x0edb, B:140:0x0eee, B:141:0x0f37, B:147:0x0f98, B:149:0x0fd1, B:150:0x102c, B:154:0x1087, B:156:0x109a, B:157:0x10eb, B:163:0x12e2, B:165:0x132e, B:166:0x1388, B:169:0x139e, B:171:0x13ad, B:172:0x13f5, B:176:0x149a, B:178:0x14e5, B:179:0x1541, B:183:0x1558, B:185:0x1570, B:186:0x15b8, B:192:0x1648, B:194:0x1688, B:195:0x16e2, B:199:0x171b, B:201:0x172e, B:202:0x1773, B:204:0x177c, B:206:0x179a, B:207:0x17e9, B:213:0x24e9, B:215:0x24fc, B:216:0x2547, B:227:0x293e, B:229:0x2951, B:230:0x29a5, B:237:0x2a8e, B:239:0x2aa1, B:240:0x2aec, B:333:0x2b7b, B:335:0x2b8e, B:336:0x2bde, B:248:0x2c8d, B:250:0x2cd8, B:251:0x2d32, B:260:0x2f20, B:262:0x2f33, B:263:0x2f91, B:271:0x305d, B:274:0x30ee, B:277:0x3096, B:293:0x31d0, B:295:0x320d, B:296:0x326b, B:300:0x32ad, B:302:0x32c0, B:303:0x3310, B:307:0x33c1, B:309:0x33f9, B:310:0x344e, B:314:0x347c, B:317:0x3520, B:320:0x34c9, B:346:0x2553, B:348:0x2571, B:349:0x25c3, B:354:0x2170, B:356:0x2183, B:357:0x21d8, B:381:0x2276, B:383:0x22ab, B:384:0x2306, B:389:0x2419, B:391:0x2452, B:392:0x24ac, B:396:0x2335, B:398:0x2378, B:399:0x23d7, B:403:0x11d6, B:405:0x11e9, B:406:0x123d), top: B:5:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x087e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] writeReplace(android.content.Context context, int i, int i2, int i3) {
        java.lang.Integer num;
        int i4;
        java.lang.String str;
        java.lang.String str2;
        int i5;
        java.lang.String str3;
        int i6;
        int i7;
        int i8;
        int i9;
        java.lang.String str4;
        long j;
        java.lang.Object[] objArr;
        char c;
        java.lang.String[][] strArr;
        java.lang.String str5;
        long j2;
        java.lang.Object obj;
        java.lang.Object invoke;
        int i10;
        java.lang.String str6;
        char c2;
        java.lang.String[][] strArr2;
        int i11;
        int i12;
        int i13;
        java.lang.String intern;
        java.io.File file;
        java.lang.String next;
        java.lang.String[][] strArr3;
        java.lang.String[] strArr4;
        int i14;
        java.lang.String[] strArr5;
        java.lang.String next2;
        int i15 = 0;
        java.lang.Integer num2 = 0;
        int i16 = 1;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(464 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 8 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
        java.lang.String intern2 = ((java.lang.String) objArr2[0]).intern();
        java.lang.String str7 = "";
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1, (char) ((-1) - android.os.Process.getGidForName("")), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 26, objArr3);
        java.lang.String intern3 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(27 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 55556), 25 - android.view.KeyEvent.keyCodeFromString(""), objArr4);
        java.lang.String intern4 = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(52 - android.graphics.Color.argb(0, 0, 0, 0), (char) (10188 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), 18 - android.view.View.resolveSize(0, 0), objArr5);
        java.lang.String intern5 = ((java.lang.String) objArr5[0]).intern();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(android.text.TextUtils.getOffsetAfter("", 0) + 70, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 9780), 28 - (android.os.Process.myPid() >> 22), objArr6);
        java.lang.String[] strArr6 = {intern3, intern4, intern5, ((java.lang.String) objArr6[0]).intern()};
        int i17 = 0;
        while (true) {
            if (i17 >= 4) {
                num = num2;
                i4 = i;
                break;
            }
            try {
                java.lang.Object[] objArr7 = {strArr6[i17]};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(i15) + 37, 3160 - (android.widget.ExpandableListView.getPackedPositionForChild(i15, i15) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(i15, i15) == 0L ? 0 : -1)), (char) (33100 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                    byte[] bArr = $$a;
                    byte b = (byte) (bArr[18] - 1);
                    byte b2 = (byte) (bArr[14] - 1);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(b, b2, (short) (b2 | 35), objArr8);
                    java.lang.String str8 = (java.lang.String) objArr8[i15];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                    clsArr[i15] = java.lang.String.class;
                    obj2 = cls.getMethod(str8, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj2);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr7)).longValue();
                long j3 = i;
                long j4 = ~j3;
                num = num2;
                long j5 = (561 * longValue) + 134308302141L + ((~(j4 | (-240265299))) * (-560)) + ((~((~longValue) | (-240265299) | j3)) * (-560)) + (((~(j4 | longValue)) | (~(longValue | 240265298))) * 560) + 1147736037;
                int i18 = ~i;
                if (((((int) j5) & ((((~((-1074277145) | i18)) | (-1783463742)) * (-591)) + 340289770 + (((-1074277145) | i) * 591))) | (((int) (j5 >> 32)) & (((((~((-1469864857) | i18)) | r12) * 1150) - 334238508) + (((~(32638445 | i)) | (~((-32638446) | i18))) * (-575)) + (((~((-1469864857) | i)) | (~(1469864856 | i18))) * 575)))) != 0) {
                    i4 = i ^ (i17 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
                    break;
                }
                i17++;
                num2 = num;
                i15 = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i19 = 3;
        if (i4 != i) {
            DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 67) % 128;
            java.lang.Object[] objArr9 = {new int[]{i}, new int[]{i4}, null, null, new int[1]};
            java.lang.Object[] objArr10 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-68157450) | r1)) * (-783)) - 1648917979) + (((~((~i) | 1940380518)) | (-110465580)) * 783))};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj3 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2713, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                byte[] bArr2 = $$a;
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b((byte) (bArr2[18] - 1), (byte) (-bArr2[16]), (short) (bArr2[14] - 1), objArr11);
                obj3 = cls2.getMethod((java.lang.String) objArr11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
            }
            ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr10)).intValue();
            return objArr9;
        }
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        a(android.text.TextUtils.getTrimmedLength("") + 98, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '$', objArr12);
        java.lang.String intern6 = ((java.lang.String) objArr12[0]).intern();
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a(111 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 13 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr13);
        java.lang.String intern7 = ((java.lang.String) objArr13[0]).intern();
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        a(123 - android.graphics.Color.argb(0, 0, 0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 18 - (android.os.Process.myTid() >> 22), objArr14);
        java.lang.String[] strArr7 = {intern6, intern7, ((java.lang.String) objArr14[0]).intern()};
        int i20 = 0;
        while (true) {
            if (i20 >= i19) {
                str = intern2;
                str2 = str7;
                i5 = i;
                break;
            }
            java.lang.Object[] objArr15 = {strArr7[i20]};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
            if (obj4 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 36, 3162 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (33100 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                byte b3 = $$a[14];
                byte b4 = b3;
                java.lang.Object[] objArr16 = new java.lang.Object[i16];
                b(b3, b4, (short) (b4 | 40), objArr16);
                java.lang.String str9 = (java.lang.String) objArr16[0];
                java.lang.Class<?>[] clsArr2 = new java.lang.Class[i16];
                clsArr2[0] = java.lang.String.class;
                obj4 = cls3.getMethod(str9, clsArr2);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj4);
            }
            long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr15)).longValue();
            long j6 = ~longValue2;
            long j7 = i;
            long j8 = (~j7) | j6;
            str = intern2;
            str2 = str7;
            long j9 = (((-112) * longValue2) - 37540289360L) + (((~j8) | 335181155) * 226) + (((~(longValue2 | (-335181156))) | (~((-335181156) | j7)) | (~(j8 | 335181155))) * (-113)) + (((-1) ^ (j6 | j7)) * 113) + 660253748;
            int i21 = (int) (j9 >> 32);
            int i22 = ~i;
            if (((((int) j9) & ((((((~((-880936035) | i22)) | (-1976804852)) | (~(886252658 | i))) * (-68)) - 655651751) + ((~((-1090552194) | i22)) * (-68)) + (((~((-886252659) | i22)) | (-1971488228)) * 68))) | ((((((1744988204 | i22) * 1324) - 818884594) + (((~(1837623662 | i)) | (~((-400397252) | i))) * (-1324))) - 1710833140) & i21)) != 0) {
                i5 = (i20 + 270) ^ i;
                break;
            }
            i20++;
            intern2 = str;
            str7 = str2;
            i19 = 3;
            i16 = 1;
        }
        if (i5 != i) {
            AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 45) % 128;
            java.lang.Object[] objArr17 = {new int[]{i}, new int[]{i5}, null, null, new int[1]};
            java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(1965031293 | r2)) | 85814804) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) - 1147803635) + (((~((~i) | 1696460380)) | 354385717) * (-440)) + ((i | 1965031293) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj5 == null) {
                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2713, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                byte[] bArr3 = $$a;
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                b((byte) (bArr3[18] - 1), (byte) (-bArr3[16]), (short) (bArr3[14] - 1), objArr19);
                obj5 = cls4.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
            }
            ((int[]) objArr17[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr18)).intValue();
            return objArr17;
        }
        java.lang.String str10 = str2;
        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1781008036);
        if (obj6 == null) {
            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(25 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.graphics.Color.green(0) + 1864, (char) (android.view.View.getDefaultSize(0, 0) + 41775));
            byte b5 = (byte) ($$a[14] - 1);
            byte b6 = b5;
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            b(b5, b6, (short) (b6 | 653), objArr20);
            obj6 = cls5.getMethod((java.lang.String) objArr20[0], null);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1781008036, obj6);
        }
        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, null)).longValue();
        long j10 = ~longValue3;
        long j11 = i;
        long j12 = ~j11;
        long j13 = ((((((-932) * longValue3) + 199464891494L) + (((~(j12 | (-213559842))) | j10) * (-933))) + (((~(j10 | j12)) | (~(j10 | 213559841))) * 933)) + ((~(longValue3 | 213559841)) * 933)) - 2142772703;
        int i23 = ~i;
        int i24 = (((int) j13) & (((715149336 | i23) * 1324) + 818885255 + (((~(1805736504 | i)) | (~(1052004381 | i))) * (-1324)) + 73939886)) | (((int) (j13 >> 32)) & ((((~(733738678 | i23)) | (-2143025087)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + 501358106 + ((~(2143025086 | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(i | (-1409286409))) | (~(2124002206 | i23)) | 19022880) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)));
        int i25 = i24 != 0 ? (i24 + 199) ^ i : i;
        if (i25 != i) {
            java.lang.Object[] objArr21 = {new int[]{i}, new int[]{i25}, null, null, new int[1]};
            java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-1453411616) | i23)) | 1411468557) * 98) + 559947141 + (((~((-597434483) | i23)) | (-1453411616) | (~(597434482 | i))) * (-49)) + (((~(i | (-1453411616))) | (-2008903040)) * 49))};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj7 == null) {
                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) android.view.View.combineMeasuredStates(0, 0));
                byte[] bArr4 = $$a;
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                b((byte) (bArr4[18] - 1), (byte) (-bArr4[16]), (short) (bArr4[14] - 1), objArr23);
                obj7 = cls6.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
            }
            ((int[]) objArr21[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr22)).intValue();
            return objArr21;
        }
        java.lang.Object[] objArr24 = new java.lang.Object[1];
        a(140 - android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (40869 - android.text.TextUtils.indexOf(str10, str10, 0)), android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 21, objArr24);
        java.lang.String intern8 = ((java.lang.String) objArr24[0]).intern();
        java.lang.Object[] objArr25 = new java.lang.Object[1];
        a(161 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (7084 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), 6 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr25);
        java.lang.String intern9 = ((java.lang.String) objArr25[0]).intern();
        java.io.File file2 = new java.io.File(intern8);
        if (file2.exists() && file2.isFile()) {
            try {
                java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(file2));
                str3 = str;
                try {
                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                    a((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 167, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43880), 2 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr26);
                    java.util.Scanner useDelimiter = scanner.useDelimiter(((java.lang.String) objArr26[0]).intern());
                    next2 = useDelimiter.hasNext() ? useDelimiter.next() : str10;
                    useDelimiter.close();
                } catch (java.io.IOException unused) {
                }
            } catch (java.io.IOException unused2) {
            }
            if (next2.contains(intern9)) {
                DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 43) % 128;
                i6 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
                if (i6 != i) {
                    java.lang.Object[] objArr27 = {new int[]{i}, new int[]{i6}, null, null, new int[1]};
                    java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-1772467539) | i23)) | 8761362) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + 1106085481 + ((~((-8761363) | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(i | (-1763706177))) | (~(i23 | (-278378560))) | 269617197) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                    java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj8 == null) {
                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51, 2761 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                        byte[] bArr5 = $$a;
                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                        b((byte) (bArr5[18] - 1), (byte) (-bArr5[16]), (short) (bArr5[14] - 1), objArr29);
                        obj8 = cls7.getMethod((java.lang.String) objArr29[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                    }
                    ((int[]) objArr27[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr28)).intValue();
                    return objArr27;
                }
                java.lang.Object[] objArr30 = new java.lang.Object[1];
                a(168 - android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 55424), 31 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr30);
                java.lang.String intern10 = ((java.lang.String) objArr30[0]).intern();
                java.lang.Object[] objArr31 = new java.lang.Object[1];
                a((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 199, (char) android.text.TextUtils.indexOf(str10, str10), 22 - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr31);
                java.lang.String intern11 = ((java.lang.String) objArr31[0]).intern();
                java.lang.Object[] objArr32 = new java.lang.Object[1];
                a(223 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (51534 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 28 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr32);
                java.lang.String intern12 = ((java.lang.String) objArr32[0]).intern();
                java.lang.Object[] objArr33 = new java.lang.Object[1];
                a(251 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (35975 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), android.view.MotionEvent.axisFromString(str10) + 15, objArr33);
                java.lang.String[] strArr8 = {intern10, intern11, intern12, ((java.lang.String) objArr33[0]).intern()};
                int i26 = 0;
                while (true) {
                    if (i26 >= 4) {
                        i7 = i;
                        break;
                    }
                    java.lang.Object[] objArr34 = {strArr8[i26]};
                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                    if (obj9 == null) {
                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.os.Process.getGidForName(str10), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 3161, (char) (33099 - android.widget.ExpandableListView.getPackedPositionType(0L)));
                        byte[] bArr6 = $$a;
                        byte b7 = (byte) (bArr6[18] - 1);
                        byte b8 = (byte) (bArr6[14] - 1);
                        strArr5 = strArr8;
                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                        b(b7, b8, (short) (b8 | 35), objArr35);
                        obj9 = cls8.getMethod((java.lang.String) objArr35[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj9);
                    } else {
                        strArr5 = strArr8;
                    }
                    long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj9).invoke(null, objArr34)).longValue();
                    long j14 = ~longValue4;
                    int i27 = i26;
                    long j15 = (503 * longValue4) + 495536076966L + (((~(j14 | j11)) | (~(longValue4 | (-989093966)))) * (-502)) + ((~(j14 | j12 | (-989093966))) * (-502)) + (((~(989093965 | j11)) | j14) * 502) + 1896564704;
                    if (((((int) j15) & ((((351681504 | i) * (-859)) - 916918178) + (((~(351681504 | i23)) | (~((-341191265) | i))) * 859) + (((~(1788907914 | i23)) | (-2130099179)) * 859))) | (((((((-17958913) | i) * (-381)) - 432672994) + (((~((-833861737) | i23)) | (-1225935237)) * 381)) - 1747589120) & ((int) (j15 >> 32)))) != 0) {
                        DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 125) % 128;
                        i7 = i ^ (i27 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                        break;
                    }
                    i26 = i27 + 1;
                    strArr8 = strArr5;
                }
                if (i7 != i) {
                    java.lang.Object[] objArr36 = {new int[]{i}, new int[]{i7}, null, null, new int[1]};
                    java.lang.Object[] objArr37 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~((-765957008) | i23)) | 210080258) | (~((-1284889091) | i23))) * (-1136)) - 1299675319) + (((~((-765957008) | i)) | (~((-1284889091) | i)) | (~(1840765839 | i23))) * (-568)) + (((~(i | (-210080259))) | (~(765957007 | i23)) | (~(1284889090 | i23))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))};
                    java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj10 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 50, android.graphics.Color.rgb(0, 0, 0) + 16779929, (char) android.graphics.Color.alpha(0));
                        byte[] bArr7 = $$a;
                        java.lang.Object[] objArr38 = new java.lang.Object[1];
                        b((byte) (bArr7[18] - 1), (byte) (-bArr7[16]), (short) (bArr7[14] - 1), objArr38);
                        obj10 = cls9.getMethod((java.lang.String) objArr38[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
                    }
                    ((int[]) objArr36[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr37)).intValue();
                    return objArr36;
                }
                java.lang.Object[] objArr39 = new java.lang.Object[1];
                a(265 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (9032 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), android.view.View.MeasureSpec.getMode(0) + 13, objArr39);
                java.lang.Object[] objArr40 = {((java.lang.String) objArr39[0]).intern()};
                java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj11 == null) {
                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 40, 1921 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                    byte b9 = (byte) ($$a[14] - 1);
                    byte b10 = b9;
                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                    b(b9, b10, (short) (b10 | 653), objArr41);
                    obj11 = cls10.getMethod((java.lang.String) objArr41[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj11);
                }
                java.lang.String str11 = (java.lang.String) ((java.lang.reflect.Method) obj11).invoke(null, objArr40);
                if (str11 != null) {
                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                    a(277 - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5716), 9 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr42);
                    if (str11.contains(((java.lang.String) objArr42[0]).intern())) {
                        i8 = i ^ 250;
                        if (i8 == i) {
                            java.lang.Object[] objArr43 = {new int[]{i}, new int[]{i8}, null, null, new int[1]};
                            java.lang.Object[] objArr44 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i | (-1846605814))) | (-204240285)) * (-964)) + 448282865 + (((~((-1846605814) | i23)) | 1645249121) * (-964)))};
                            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj12 == null) {
                                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode(str10, 0, 0) + 50, android.graphics.Color.argb(0, 0, 0, 0) + 2713, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                                byte[] bArr8 = $$a;
                                java.lang.Object[] objArr45 = new java.lang.Object[1];
                                b((byte) (bArr8[18] - 1), (byte) (-bArr8[16]), (short) (bArr8[14] - 1), objArr45);
                                obj12 = cls11.getMethod((java.lang.String) objArr45[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj12);
                            }
                            ((int[]) objArr43[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr44)).intValue();
                            return objArr43;
                        }
                        java.lang.Object[] objArr46 = new java.lang.Object[1];
                        a((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 17, objArr46);
                        java.lang.String intern13 = ((java.lang.String) objArr46[0]).intern();
                        java.lang.Object[] objArr47 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 304, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 7, objArr47);
                        java.lang.Object[] objArr48 = {intern13, ((java.lang.String) objArr47[0]).intern()};
                        java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                        if (obj13 == null) {
                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter(str10, 0) + 39, 2214 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                            byte b11 = (byte) ($$a[14] - 1);
                            byte b12 = b11;
                            java.lang.Object[] objArr49 = new java.lang.Object[1];
                            b(b11, b12, (short) (b12 | 653), objArr49);
                            obj13 = cls12.getMethod((java.lang.String) objArr49[0], java.lang.String.class, java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj13);
                        }
                        long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj13).invoke(null, objArr48)).longValue();
                        long j16 = ~longValue5;
                        long j17 = (((((407 * longValue5) + 199581062130L) + (((~(j16 | j11)) | (~((j12 | (-492792746)) | longValue5))) * (-406))) + ((~((j16 | j12) | (-492792746))) * (-406))) + (((~(longValue5 | j12)) | (~(j11 | 492792745))) * 406)) - 242581856;
                        int i28 = ((((int) j17) & ((((((~(1298180008 | i)) | (-1298771882)) * 1504) + 1320243365) + ((~((-591874) | i)) * (-1504))) + 680288368)) | ((((((~((-1538820373) | i23)) * 979) + 1789362128) + (((-101593962) | i) * (-979))) + (((~((-1538820373) | i)) | (~((-101593962) | i23))) * 979)) & ((int) (j17 >> 32)))) != 0 ? i ^ 251 : i;
                        if (i28 != i) {
                            java.lang.Object[] objArr50 = {new int[]{i}, new int[]{i28}, null, null, new int[1]};
                            java.lang.Object[] objArr51 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i | 1040006527)) | 1010839570) * (-756)) + 1475463085 + ((1040006527 | i23) * 756))};
                            java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj14 == null) {
                                java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 50, android.text.TextUtils.indexOf(str10, str10, 0) + 2713, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                byte[] bArr9 = $$a;
                                java.lang.Object[] objArr52 = new java.lang.Object[1];
                                b((byte) (bArr9[18] - 1), (byte) (-bArr9[16]), (short) (bArr9[14] - 1), objArr52);
                                obj14 = cls13.getMethod((java.lang.String) objArr52[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj14);
                            }
                            ((int[]) objArr50[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr51)).intValue();
                            return objArr50;
                        }
                        java.lang.Object[] objArr53 = new java.lang.Object[1];
                        a(android.view.KeyEvent.keyCodeFromString(str10) + 310, (char) android.text.TextUtils.indexOf(str10, str10), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 23, objArr53);
                        java.lang.Object[] objArr54 = {((java.lang.String) objArr53[0]).intern()};
                        java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj15 == null) {
                            java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), android.view.View.resolveSizeAndState(0, 0, 0) + 1921, (char) android.text.TextUtils.indexOf(str10, str10, 0, 0));
                            byte b13 = (byte) ($$a[14] - 1);
                            byte b14 = b13;
                            java.lang.Object[] objArr55 = new java.lang.Object[1];
                            b(b13, b14, (short) (b14 | 653), objArr55);
                            obj15 = cls14.getMethod((java.lang.String) objArr55[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj15);
                        }
                        java.lang.String lowerCase = ((java.lang.String) ((java.lang.reflect.Method) obj15).invoke(null, objArr54)).toLowerCase();
                        java.lang.Object[] objArr56 = new java.lang.Object[1];
                        a((android.os.Process.myPid() >> 22) + com.visa.cbp.getCertUsage.getODAData, (char) (45755 - android.view.View.getDefaultSize(0, 0)), '4' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr56);
                        int i29 = lowerCase.contains(((java.lang.String) objArr56[0]).intern()) ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE : i;
                        if (i29 != i) {
                            DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 67) % 128;
                            java.lang.Object[] objArr57 = {new int[]{i}, new int[]{i29}, null, null, new int[1]};
                            java.lang.Object[] objArr58 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(i | 2049923023)) | 923074) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) - 1727154685) + ((~(2049923023 | i23)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))};
                            java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj16 == null) {
                                java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.graphics.Color.alpha(0) + 2713, (char) (android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                                byte[] bArr10 = $$a;
                                java.lang.Object[] objArr59 = new java.lang.Object[1];
                                b((byte) (bArr10[18] - 1), (byte) (-bArr10[16]), (short) (bArr10[14] - 1), objArr59);
                                obj16 = cls15.getMethod((java.lang.String) objArr59[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj16);
                            }
                            ((int[]) objArr57[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, objArr58)).intValue();
                            return objArr57;
                        }
                        java.lang.Object[] objArr60 = new java.lang.Object[1];
                        a(287 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (-16777199) - android.graphics.Color.rgb(0, 0, 0), objArr60);
                        java.lang.String intern14 = ((java.lang.String) objArr60[0]).intern();
                        java.lang.Object[] objArr61 = new java.lang.Object[1];
                        a(android.graphics.Color.green(0) + 337, (char) (1598 - android.text.TextUtils.getTrimmedLength(str10)), 6 - android.text.TextUtils.indexOf(str10, str10, 0, 0), objArr61);
                        java.lang.Object[] objArr62 = {intern14, ((java.lang.String) objArr61[0]).intern()};
                        java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                        if (obj17 == null) {
                            java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 2212 - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.text.TextUtils.getOffsetAfter(str10, 0));
                            byte b15 = (byte) ($$a[14] - 1);
                            byte b16 = b15;
                            java.lang.Object[] objArr63 = new java.lang.Object[1];
                            b(b15, b16, (short) (b16 | 653), objArr63);
                            obj17 = cls16.getMethod((java.lang.String) objArr63[0], java.lang.String.class, java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj17);
                        }
                        long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj17).invoke(null, objArr62)).longValue();
                        long j18 = ~((~longValue6) | j11);
                        long j19 = ((((((-574) * longValue6) - 309482990502L) + (((~((-539168974) | j12)) | j18) * 1150)) + (((~(longValue6 | j12)) | j18) * (-575))) + (((~(j11 | (-539168974))) | (~(539168973 | j12))) * 575)) - 1274543575;
                        if (((((int) (j19 >> 32)) & ((((~(590661528 | i23)) | 2027887939) * (-90)) + 1687905420 + (((~(590661528 | i)) | 52478616) * (-45)) + (((~((-2027887940) | i)) | 590661528 | (~(2027887939 | i23))) * 45))) | (((int) j19) & (((((~((-1366329200) | i23)) | 1348469350) * 446) - 384374209) + (((~((-17859850) | i)) | 142942336) * 446) + 121908660))) != 0) {
                            i9 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                        } else {
                            java.lang.Object[] objArr64 = new java.lang.Object[1];
                            a(344 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.os.Process.myPid() >> 22) + 13, objArr64);
                            java.lang.String intern15 = ((java.lang.String) objArr64[0]).intern();
                            java.lang.Object[] objArr65 = new java.lang.Object[1];
                            a((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 356, (char) (31076 - android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 10 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr65);
                            java.lang.Object[] objArr66 = {intern15, ((java.lang.String) objArr65[0]).intern()};
                            java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                            if (obj18 == null) {
                                java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2214, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                byte b17 = (byte) ($$a[14] - 1);
                                byte b18 = b17;
                                java.lang.Object[] objArr67 = new java.lang.Object[1];
                                b(b17, b18, (short) (b18 | 653), objArr67);
                                obj18 = cls17.getMethod((java.lang.String) objArr67[0], java.lang.String.class, java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj18);
                            }
                            long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj18).invoke(null, objArr66)).longValue();
                            long j20 = ((((192 * longValue7) + 97683581281L) + (((~(longValue7 | j11)) | (-514124111)) * 191)) + (((~(longValue7 | j12)) | (~(514124110 | longValue7))) * 191)) - 221250491;
                            i9 = ((((int) (j20 >> 32)) & ((((((~((-1054805723) | i)) | (-382420689)) * (-318)) + 507302422) + (((~((-382420689) | i)) | (~(1054822106 | i23))) * 318)) + (((~(i23 | (-16385))) | (~(1054822106 | i))) * 318))) | (((int) j20) & ((((((-650848233) | i23) * (-757)) + (-1920273150)) + ((~(i | (-553))) * 1514)) + ((((~(786378177 | i23)) | (-786378730)) | (~((-650847681) | i))) * 757)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE : i;
                        }
                        if (i9 != i) {
                            java.lang.Object[] objArr68 = {new int[]{i}, new int[]{i9}, null, null, new int[1]};
                            java.lang.Object[] objArr69 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~((-733142562) | i)) | 556814337) | (~(1317703536 | i))) * (-754)) - 621464861) + (((~(i | (-556814338))) | (~(1874517873 | i23))) * (-754)) + (((-733142562) | i23) * 754))};
                            java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj19 == null) {
                                java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf(str10, str10, 0, 0), android.widget.ExpandableListView.getPackedPositionType(0L) + 2713, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                byte[] bArr11 = $$a;
                                java.lang.Object[] objArr70 = new java.lang.Object[1];
                                b((byte) (bArr11[18] - 1), (byte) (-bArr11[16]), (short) (bArr11[14] - 1), objArr70);
                                obj19 = cls18.getMethod((java.lang.String) objArr70[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj19);
                            }
                            ((int[]) objArr68[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(null, objArr69)).intValue();
                            return objArr68;
                        }
                        java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1102036426);
                        if (obj20 == null) {
                            java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2763, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                            byte b19 = (byte) ($$a[14] - 1);
                            byte b20 = b19;
                            java.lang.Object[] objArr71 = new java.lang.Object[1];
                            b(b19, b20, (short) (b20 | 653), objArr71);
                            obj20 = cls19.getMethod((java.lang.String) objArr71[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1102036426, obj20);
                        }
                        long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, null)).longValue();
                        long j21 = ~((~longValue8) | j11);
                        long j22 = ((-574) * longValue8) + 1073200909130L + (((~(1869687994 | j12)) | j21) * 1150) + (((~(longValue8 | j12)) | j21) * (-575)) + (((~(j11 | 1869687994)) | (~((-1869687995) | j12))) * 575) + 1994724758;
                        if (((((int) (j22 >> 32)) & (((((~((-1340649291) | i23)) | (~(96577120 | i))) * com.visa.cbp.getCertUsage.getODAData) - 521945451) + (((~((-1340649291) | i)) | (~(96577120 | i23))) * com.visa.cbp.getCertUsage.getODAData))) | (((int) j22) & ((((~(2090906260 | i23)) | 39210090) * (-241)) + 1659113887 + (((~(2130116350 | i23)) | 614469760) * 241)))) == 1) {
                            AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 55) % 128;
                            java.lang.Object[] objArr72 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                            java.lang.Object[] objArr73 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~((-6466214) | i23)) | 2044379884) * (-602)) + 2058252426 + (((~(i | (-6466214))) | 4358820 | (~(2046487277 | i23))) * (-301)) + ((~(2044379884 | i23)) * 301))};
                            java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj21 == null) {
                                java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2714 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) android.text.TextUtils.indexOf(str10, str10));
                                byte[] bArr12 = $$a;
                                java.lang.Object[] objArr74 = new java.lang.Object[1];
                                b((byte) (bArr12[18] - 1), (byte) (-bArr12[16]), (short) (bArr12[14] - 1), objArr74);
                                obj21 = cls20.getMethod((java.lang.String) objArr74[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj21);
                            }
                            ((int[]) objArr72[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr73)).intValue();
                            return objArr72;
                        }
                        java.lang.Object[] objArr75 = {1};
                        java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                        if (obj22 == null) {
                            java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.text.TextUtils.getOffsetBefore(str10, 0) + 2364, (char) android.graphics.Color.green(0));
                            byte b21 = (byte) ($$a[14] - 1);
                            byte b22 = b21;
                            java.lang.Object[] objArr76 = new java.lang.Object[1];
                            b(b21, b22, (short) (b22 | 653), objArr76);
                            obj22 = cls21.getMethod((java.lang.String) objArr76[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj22);
                        }
                        long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj22).invoke(null, objArr75)).longValue();
                        long j23 = (192 * longValue9) + 20494740261L + (((~(longValue9 | j11)) | (-107867053)) * 191) + (((~(longValue9 | j12)) | (~(107867052 | longValue9))) * 191) + 1515777252;
                        int i30 = ((((int) (j23 >> 32)) & (((((~((-644655628) | i23)) | (~(792570783 | i))) * 959) + 1553941205) + (((~((-644655628) | i)) | (~(792570783 | i23))) * 959))) | (((int) j23) & (((((~(1582807039 | i)) | 67174933) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1980215100) + ((~(1582807039 | i23)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE : i;
                        if (i30 != i) {
                            java.lang.Object[] objArr77 = {new int[]{i}, new int[]{i30}, null, null, new int[1]};
                            java.lang.Object[] objArr78 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((~(i | 855579201)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + 1692748009 + (((-1157644561) | i23) * (-216)) + (((~(855579201 | i23)) | 1195266896) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))};
                            java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj23 == null) {
                                java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 2712 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                byte[] bArr13 = $$a;
                                java.lang.Object[] objArr79 = new java.lang.Object[1];
                                b((byte) (bArr13[18] - 1), (byte) (-bArr13[16]), (short) (bArr13[14] - 1), objArr79);
                                obj23 = cls22.getMethod((java.lang.String) objArr79[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj23);
                            }
                            ((int[]) objArr77[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr78)).intValue();
                            return objArr77;
                        }
                        java.lang.Object[] objArr80 = new java.lang.Object[1];
                        a(android.view.View.MeasureSpec.getMode(0) + 310, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.View.resolveSizeAndState(0, 0, 0) + 23, objArr80);
                        java.lang.Object[] objArr81 = {((java.lang.String) objArr80[0]).intern()};
                        java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj24 == null) {
                            java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 40, android.view.KeyEvent.keyCodeFromString(str10) + 1921, (char) android.graphics.Color.argb(0, 0, 0, 0));
                            byte b23 = (byte) ($$a[14] - 1);
                            byte b24 = b23;
                            java.lang.Object[] objArr82 = new java.lang.Object[1];
                            b(b23, b24, (short) (b24 | 653), objArr82);
                            obj24 = cls23.getMethod((java.lang.String) objArr82[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj24);
                        }
                        java.lang.Object invoke2 = ((java.lang.reflect.Method) obj24).invoke(null, objArr81);
                        if (invoke2 != null) {
                            java.lang.Object[] objArr83 = {invoke2, 42};
                            java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj25 == null) {
                                java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 28, 2594 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                byte b25 = (byte) ($$a[14] - 1);
                                byte b26 = b25;
                                java.lang.Object[] objArr84 = new java.lang.Object[1];
                                b(b25, b26, (short) (b26 | 653), objArr84);
                                obj25 = cls24.getMethod((java.lang.String) objArr84[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj25);
                            }
                            long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj25).invoke(null, objArr83)).longValue();
                            long j24 = ~longValue10;
                            long j25 = ~(j11 | (-239652420));
                            long j26 = (521 * longValue10) + 124379605980L + (((~(longValue10 | j11)) | (~(j24 | 239652419 | j12))) * 520) + (((~(j24 | j12)) | j25) * (-1040)) + (((~(239652419 | j12)) | (~(j24 | (-239652420))) | j25) * 520) + 1496752944;
                            if (((((int) (j26 >> 32)) & ((((~(279415827 | i23)) | (~(1716642238 | i))) * com.visa.cbp.getCertUsage.getODAData) + 404631841 + (((~(279415827 | i)) | (~(1716642238 | i23))) * com.visa.cbp.getCertUsage.getODAData))) | (((int) j26) & ((((((~(700529435 | i23)) | 1445626052) | (~((-8399643) | i))) * 717) - 528164101) + (((~(700529435 | i)) | (~((-8399643) | i23)) | 1445626052) * 717)))) == 1986687685) {
                                str4 = str10;
                                j = j12;
                                java.lang.Object[] objArr85 = new java.lang.Object[1];
                                a(446 - android.view.View.getDefaultSize(0, 0), (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 16 - android.graphics.Color.green(0), objArr85);
                                java.lang.Object[] objArr86 = {((java.lang.String) objArr85[0]).intern()};
                                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj == null) {
                                    java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('X' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 1921 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) android.graphics.Color.green(0));
                                    byte b27 = (byte) ($$a[14] - 1);
                                    byte b28 = b27;
                                    java.lang.Object[] objArr87 = new java.lang.Object[1];
                                    b(b27, b28, (short) (b28 | 653), objArr87);
                                    obj = cls25.getMethod((java.lang.String) objArr87[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj);
                                }
                                invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr86);
                                if (invoke != null) {
                                    i10 = 0;
                                } else {
                                    java.lang.Object[] objArr88 = {invoke, 42};
                                    java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                    if (obj26 == null) {
                                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28, 2594 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                        byte b29 = (byte) ($$a[14] - 1);
                                        byte b30 = b29;
                                        java.lang.Object[] objArr89 = new java.lang.Object[1];
                                        b(b29, b30, (short) (b30 | 653), objArr89);
                                        obj26 = cls26.getMethod((java.lang.String) objArr89[0], java.lang.String.class, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj26);
                                    }
                                    long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr88)).longValue();
                                    long j27 = ~(963754712 | longValue11);
                                    long j28 = (-963754713) | (~longValue11);
                                    long j29 = ((1435 * longValue11) - 690048373792L) + (((-963754713) | longValue11) * (-1434)) + (((~(j28 | j11)) | (~(j | longValue11)) | j27) * 717) + (((~(longValue11 | j11)) | (~(j28 | j)) | j27) * 717) + 293345812;
                                    i10 = (((int) (j29 >> 32)) & ((((1840143323 | i) * 376) - 2088991750) + (((~(1672248551 | i23)) | 201458456) * (-376)) + (((~((-1672248552) | i)) | (-235022141)) * 376))) | (((int) j29) & ((((~((-83888736) | i)) | 1353337674) * (-668)) + 1055409929 + (((~(1353337674 | i)) | (-83888736)) * 1336) + (((-83886102) | i) * 668)));
                                }
                                if (i10 != 1986687685 || i10 == -1514516938) {
                                    str6 = str4;
                                } else {
                                    str6 = str4;
                                    java.lang.Object[] objArr90 = new java.lang.Object[1];
                                    a(android.text.TextUtils.lastIndexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1162, (char) android.view.KeyEvent.normalizeMetaState(0), 14 - android.view.View.getDefaultSize(0, 0), objArr90);
                                    java.lang.String intern16 = ((java.lang.String) objArr90[0]).intern();
                                    java.lang.Object[] objArr91 = new java.lang.Object[1];
                                    a(1175 - android.view.View.MeasureSpec.getSize(0), (char) android.view.View.MeasureSpec.getMode(0), 26 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr91);
                                    java.lang.String intern17 = ((java.lang.String) objArr91[0]).intern();
                                    java.lang.Object[] objArr92 = new java.lang.Object[1];
                                    a(1201 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (21945 - android.view.Gravity.getAbsoluteGravity(0, 0)), android.text.TextUtils.getOffsetBefore(str6, 0) + 17, objArr92);
                                    java.lang.String intern18 = ((java.lang.String) objArr92[0]).intern();
                                    java.lang.Object[] objArr93 = new java.lang.Object[1];
                                    a(android.text.TextUtils.indexOf(str6, str6) + 1218, (char) (38427 - android.view.Gravity.getAbsoluteGravity(0, 0)), 17 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr93);
                                    java.lang.String intern19 = ((java.lang.String) objArr93[0]).intern();
                                    java.lang.Object[] objArr94 = new java.lang.Object[1];
                                    a(1235 - android.view.View.resolveSizeAndState(0, 0, 0), (char) android.text.TextUtils.indexOf(str6, str6, 0, 0), 15 - android.view.View.resolveSize(0, 0), objArr94);
                                    java.lang.String intern20 = ((java.lang.String) objArr94[0]).intern();
                                    java.lang.Object[] objArr95 = new java.lang.Object[1];
                                    a(android.view.KeyEvent.getDeadChar(0, 0) + 1250, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 46742), 'U' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr95);
                                    java.lang.String intern21 = ((java.lang.String) objArr95[0]).intern();
                                    java.lang.Object[] objArr96 = new java.lang.Object[1];
                                    a((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1286, (char) (58359 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), android.widget.ExpandableListView.getPackedPositionType(0L) + 12, objArr96);
                                    java.lang.String intern22 = ((java.lang.String) objArr96[0]).intern();
                                    java.lang.Object[] objArr97 = new java.lang.Object[1];
                                    a(1299 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.view.KeyEvent.normalizeMetaState(0) + 63394), android.graphics.Color.alpha(0) + 13, objArr97);
                                    java.lang.String intern23 = ((java.lang.String) objArr97[0]).intern();
                                    java.lang.Object[] objArr98 = new java.lang.Object[1];
                                    a((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1312, (char) (47157 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21, objArr98);
                                    java.lang.String intern24 = ((java.lang.String) objArr98[0]).intern();
                                    java.lang.Object[] objArr99 = new java.lang.Object[1];
                                    a(1334 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 31, objArr99);
                                    java.lang.String intern25 = ((java.lang.String) objArr99[0]).intern();
                                    java.lang.Object[] objArr100 = new java.lang.Object[1];
                                    a(1365 - android.text.TextUtils.getOffsetBefore(str6, 0), (char) (3452 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), 11 - android.text.TextUtils.lastIndexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr100);
                                    java.lang.String intern26 = ((java.lang.String) objArr100[0]).intern();
                                    java.lang.Object[] objArr101 = new java.lang.Object[1];
                                    a(1376 - android.text.TextUtils.indexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.text.TextUtils.indexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 54135), android.text.TextUtils.lastIndexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 13, objArr101);
                                    java.lang.String intern27 = ((java.lang.String) objArr101[0]).intern();
                                    java.lang.Object[] objArr102 = new java.lang.Object[1];
                                    a(1389 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (9015 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 12 - android.text.TextUtils.getCapsMode(str6, 0, 0), objArr102);
                                    java.lang.String intern28 = ((java.lang.String) objArr102[0]).intern();
                                    java.lang.Object[] objArr103 = new java.lang.Object[1];
                                    a(1400 - android.text.TextUtils.indexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.os.Process.getGidForName(str6) + 64603), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 12, objArr103);
                                    java.lang.String intern29 = ((java.lang.String) objArr103[0]).intern();
                                    java.lang.Object[] objArr104 = new java.lang.Object[1];
                                    a(android.view.View.resolveSize(0, 0) + 1413, (char) (android.text.TextUtils.indexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), 12 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr104);
                                    java.lang.String intern30 = ((java.lang.String) objArr104[0]).intern();
                                    java.lang.Object[] objArr105 = new java.lang.Object[1];
                                    a(1424 - android.view.MotionEvent.axisFromString(str6), (char) (13706 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), 15 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr105);
                                    java.lang.String intern31 = ((java.lang.String) objArr105[0]).intern();
                                    java.lang.Object[] objArr106 = new java.lang.Object[1];
                                    a(android.text.TextUtils.indexOf(str6, str6, 0) + 1439, (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15950), '<' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr106);
                                    java.lang.String intern32 = ((java.lang.String) objArr106[0]).intern();
                                    java.lang.Object[] objArr107 = new java.lang.Object[1];
                                    a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1451, (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 29898), 24 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr107);
                                    java.lang.String intern33 = ((java.lang.String) objArr107[0]).intern();
                                    java.lang.Object[] objArr108 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1475, (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 62444), android.graphics.Color.red(0) + 28, objArr108);
                                    java.lang.String[] strArr9 = {intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, intern29, intern30, intern31, intern32, intern33, ((java.lang.String) objArr108[0]).intern()};
                                    int i31 = 0;
                                    while (true) {
                                        if (i31 >= 19) {
                                            i31 = -1;
                                            break;
                                        }
                                        java.lang.String str12 = strArr9[i31];
                                        java.lang.Object[] objArr109 = {str12};
                                        java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                        if (obj27 == null) {
                                            java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 36, 3161 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (33098 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                                            byte[] bArr14 = $$a;
                                            byte b31 = (byte) (bArr14[18] - 1);
                                            byte b32 = (byte) (bArr14[14] - 1);
                                            java.lang.Object[] objArr110 = new java.lang.Object[1];
                                            b(b31, b32, (short) (b32 | 35), objArr110);
                                            obj27 = cls27.getMethod((java.lang.String) objArr110[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj27);
                                        }
                                        long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr109)).longValue();
                                        long j30 = ~longValue12;
                                        long j31 = ((-167) * longValue12) + 25404986556L + (((~(j30 | j11)) | (~(152125667 | j30))) * 336) + (((~((-152125668) | longValue12)) | (~(j11 | (-152125668)))) * (-168)) + (((~(j | (-152125668))) | j30) * 168) + 1059596406;
                                        if (((((int) (j31 >> 32)) & (((((-1225408553) | i) * (-676)) - 928636918) + (((~(110103873 | i23)) | 1225408552) * 676) + (((~((-1327122538) | i23)) | 101713985 | (~(1335512425 | i))) * 676))) | (((int) j31) & ((((~(1631950385 | i)) | (~(194723975 | i23))) * (-1808)) + 811560205 + (((~((-177881223) | i)) | (~((-1615107633) | i23))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~((-194723976) | i)) | (-1809831608) | (~((-1631950386) | i23))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN)))) != 0) {
                                            break;
                                        }
                                        java.lang.Object[] objArr111 = new java.lang.Object[1];
                                        a((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1425, (char) (android.text.TextUtils.indexOf(str6, str6, 0, 0) + 13706), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 14, objArr111);
                                        if (str12.equals(((java.lang.String) objArr111[0]).intern())) {
                                            int i32 = AlternateContactlessPaymentDataJson + 77;
                                            DigitizedCardProfile = i32 % 128;
                                            if (i32 % 2 == 0) {
                                                java.lang.Object[] objArr112 = {str12};
                                                java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                if (obj28 == null) {
                                                    java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.text.TextUtils.indexOf(str6, str6, 0) + 3161, (char) (android.graphics.Color.alpha(0) + 33099));
                                                    byte b33 = $$a[14];
                                                    byte b34 = b33;
                                                    java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                    b(b33, b34, (short) (b34 | 40), objArr113);
                                                    obj28 = cls28.getMethod((java.lang.String) objArr113[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj28);
                                                }
                                                long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj28).invoke(null, objArr112)).longValue();
                                                long j32 = ~longValue13;
                                                long j33 = (longValue13 * (-978)) + 596394250760L + ((~(j32 | j)) * 979) + ((j11 | 608565562) * (-979)) + (((~(j32 | j11)) | (~(j | 608565562))) * 979) + 386869341;
                                                int i33 = ~((-1715505715) | i23);
                                                if (((((int) j33) & ((((~((-414659726) | i)) | 278279304 | i33) * (-470)) + 505027589 + ((i33 | (~((-136380422) | i))) * 470))) | (((int) (j33 << 38)) & ((((~((-448068656) | i)) | (-989157756)) * (-318)) + 1169584450 + (((~((-989157756) | i)) | (~(989199743 | i23))) * 318) + (((~((-541131089) | i23)) | (~(989199743 | i))) * 318)))) != 0) {
                                                    break;
                                                }
                                            } else {
                                                java.lang.Object[] objArr114 = {str12};
                                                java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                if (obj29 == null) {
                                                    java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3113, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33098));
                                                    byte b35 = $$a[14];
                                                    byte b36 = b35;
                                                    java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                    b(b35, b36, (short) (b36 | 40), objArr115);
                                                    obj29 = cls29.getMethod((java.lang.String) objArr115[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj29);
                                                }
                                                long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj29).invoke(null, objArr114)).longValue();
                                                long j34 = (-735925861) | longValue14;
                                                long j35 = ((-753) * longValue14) + 555624024300L + (((~(j11 | (-735925861))) | (~j34) | (~(longValue14 | j11))) * (-754)) + (((~(j34 | j11)) | (~(longValue14 | j | 735925860))) * (-754)) + ((j | (-735925861)) * 754) + 259509043;
                                                if (((((int) (j35 >> 32)) & ((((~(2063589117 | i)) | 539494544) * 449) + 1141008392 + (((~(2063589117 | i23)) | 539494544) * 449))) | (((int) j35) & ((((~(2133144696 | i)) | 724596189) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + 1307566265 + (((~(2133144696 | i23)) | 1065349) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE)))) != 0) {
                                                    break;
                                                }
                                            }
                                        }
                                        i31++;
                                    }
                                    if (i31 >= 0 && (i14 = i ^ (i31 + 130)) != i) {
                                        java.lang.Object[] objArr116 = {new int[]{i}, new int[]{i14}, null, null, new int[1]};
                                        java.lang.Object[] objArr117 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-1278168159) | i23)) | 772677939) * 226) - 2061496176) + (((~(i23 | (-1075924045))) | (~((-772677940) | i)) | 570433825) * (-113)) + ((~(i | (-1278168159))) * 113))};
                                        java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj30 == null) {
                                            java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 2713 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                            byte[] bArr15 = $$a;
                                            java.lang.Object[] objArr118 = new java.lang.Object[1];
                                            b((byte) (bArr15[18] - 1), (byte) (-bArr15[16]), (short) (bArr15[14] - 1), objArr118);
                                            obj30 = cls30.getMethod((java.lang.String) objArr118[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj30);
                                        }
                                        ((int[]) objArr116[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr117)).intValue();
                                        return objArr116;
                                    }
                                }
                                java.lang.Object[] objArr119 = new java.lang.Object[1];
                                a(android.text.TextUtils.getCapsMode(str6, 0, 0) + 1503, (char) ((-1) - android.text.TextUtils.lastIndexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), 13 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr119);
                                java.lang.String intern34 = ((java.lang.String) objArr119[0]).intern();
                                java.lang.Object[] objArr120 = new java.lang.Object[1];
                                a(1516 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.view.KeyEvent.normalizeMetaState(0) + 54652), android.graphics.Color.red(0) + 5, objArr120);
                                java.lang.String[] strArr10 = {intern34, ((java.lang.String) objArr120[0]).intern()};
                                java.lang.Object[] objArr121 = new java.lang.Object[1];
                                a((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1520, (char) (android.text.TextUtils.indexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), android.graphics.Color.red(0) + 15, objArr121);
                                java.lang.String intern35 = ((java.lang.String) objArr121[0]).intern();
                                java.lang.Object[] objArr122 = new java.lang.Object[1];
                                a(1536 - android.view.KeyEvent.keyCodeFromString(str6), (char) android.graphics.Color.argb(0, 0, 0, 0), 19 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr122);
                                java.lang.String intern36 = ((java.lang.String) objArr122[0]).intern();
                                java.lang.Object[] objArr123 = new java.lang.Object[1];
                                a(1555 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.view.View.MeasureSpec.getSize(0) + 3519), 14 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr123);
                                java.lang.String[] strArr11 = {intern35, intern36, ((java.lang.String) objArr123[0]).intern()};
                                java.lang.Object[] objArr124 = new java.lang.Object[1];
                                a((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1570, (char) (android.view.KeyEvent.getDeadChar(0, 0) + 55851), 21 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr124);
                                java.lang.String intern37 = ((java.lang.String) objArr124[0]).intern();
                                java.lang.Object[] objArr125 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1590, (char) (android.text.TextUtils.indexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), 10 - android.text.TextUtils.indexOf(str6, str6, 0, 0), objArr125);
                                java.lang.String[] strArr12 = {intern37, ((java.lang.String) objArr125[0]).intern()};
                                java.lang.Object[] objArr126 = new java.lang.Object[1];
                                a(1601 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14251), 11 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr126);
                                java.lang.String intern38 = ((java.lang.String) objArr126[0]).intern();
                                java.lang.Object[] objArr127 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 336, (char) (1598 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 6, objArr127);
                                java.lang.String[] strArr13 = {intern38, ((java.lang.String) objArr127[0]).intern()};
                                java.lang.Object[] objArr128 = new java.lang.Object[1];
                                a(1610 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 28 - android.view.KeyEvent.keyCodeFromString(str6), objArr128);
                                java.lang.String intern39 = ((java.lang.String) objArr128[0]).intern();
                                java.lang.Object[] objArr129 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1590, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 10, objArr129);
                                c2 = 0;
                                strArr2 = new java.lang.String[][]{strArr10, strArr11, strArr12, strArr13, new java.lang.String[]{intern39, ((java.lang.String) objArr129[0]).intern()}};
                                int i34 = -1;
                                i11 = 0;
                                loop4: while (true) {
                                    if (i11 < 5) {
                                        i12 = i;
                                        break;
                                    }
                                    java.lang.String[] strArr14 = strArr2[i11];
                                    java.lang.String str13 = strArr14[c2];
                                    java.lang.String[] strArr15 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr14, 1, strArr14.length);
                                    int length = strArr15.length;
                                    int i35 = 0;
                                    while (i35 < length) {
                                        java.lang.Object[] objArr130 = {str13, strArr15[i35]};
                                        java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                        if (obj31 == null) {
                                            java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode(str6, 0, 0) + 39, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2212, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                            byte b37 = (byte) ($$a[14] - 1);
                                            byte b38 = b37;
                                            strArr3 = strArr2;
                                            strArr4 = strArr15;
                                            java.lang.Object[] objArr131 = new java.lang.Object[1];
                                            b(b37, b38, (short) (b38 | 653), objArr131);
                                            obj31 = cls31.getMethod((java.lang.String) objArr131[0], java.lang.String.class, java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj31);
                                        } else {
                                            strArr3 = strArr2;
                                            strArr4 = strArr15;
                                        }
                                        long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj31).invoke(null, objArr130)).longValue();
                                        long j36 = ~longValue15;
                                        int i36 = i11;
                                        long j37 = j | 225816374;
                                        java.lang.String str14 = str13;
                                        long j38 = ((((((-885) * longValue15) + 400372431102L) + ((((~(j36 | (-225816375))) | (~(j36 | j11))) | (~(j37 | longValue15))) * 886)) + (((~(j | longValue15)) | 225816374) * (-1772))) + ((~j37) * 886)) - 961190976;
                                        if (((((int) j38) & (((((~((-908798069) | i)) | 371927092) * 305) - 1704616964) + (((~((-908798069) | i23)) | 528428341) * 305))) | (((int) (j38 >> 32)) & (((~((-83903747) | i23)) * 433) + 1424675688 + (((~((-678922341) | i)) | (-758304071)) * (-433)) + (((~((-758304071) | i)) | (-762826087)) * 433)))) != 0) {
                                            i12 = i ^ (i34 + 171);
                                            break loop4;
                                        }
                                        i35++;
                                        i34++;
                                        i11 = i36;
                                        str13 = str14;
                                        strArr2 = strArr3;
                                        strArr15 = strArr4;
                                    }
                                    i11++;
                                    strArr2 = strArr2;
                                    c2 = 0;
                                }
                                if (i12 == i) {
                                    java.lang.Object[] objArr132 = {new int[]{i}, new int[]{i12}, null, null, new int[1]};
                                    java.lang.Object[] objArr133 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((-10103813) | i23) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 1204027815) + (((~(i23 | 1029816683)) | (-28994894)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))};
                                    java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj32 == null) {
                                        java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 50, 2713 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) android.text.TextUtils.indexOf(str6, str6, 0));
                                        byte[] bArr16 = $$a;
                                        java.lang.Object[] objArr134 = new java.lang.Object[1];
                                        b((byte) (bArr16[18] - 1), (byte) (-bArr16[16]), (short) (bArr16[14] - 1), objArr134);
                                        obj32 = cls32.getMethod((java.lang.String) objArr134[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj32);
                                    }
                                    ((int[]) objArr132[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr133)).intValue();
                                    return objArr132;
                                }
                                try {
                                    java.lang.Object[] objArr135 = new java.lang.Object[1];
                                    a(android.widget.ExpandableListView.getPackedPositionType(0L) + 1639, (char) android.view.View.resolveSizeAndState(0, 0, 0), 13 - android.view.View.resolveSizeAndState(0, 0, 0), objArr135);
                                    java.lang.String intern40 = ((java.lang.String) objArr135[0]).intern();
                                    java.lang.Object[] objArr136 = new java.lang.Object[1];
                                    a(android.text.TextUtils.indexOf(str6, str6, 0, 0) + 1652, (char) (12614 - android.text.TextUtils.indexOf(str6, str6, 0, 0)), 7 - android.text.TextUtils.indexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr136);
                                    intern = ((java.lang.String) objArr136[0]).intern();
                                    file = new java.io.File(intern40);
                                } catch (java.lang.Exception unused3) {
                                    i13 = i ^ 151;
                                }
                                if (file.exists() && file.isFile()) {
                                    try {
                                        java.util.Scanner scanner2 = new java.util.Scanner(new java.io.FileInputStream(file));
                                        java.lang.Object[] objArr137 = new java.lang.Object[1];
                                        a((android.os.Process.myPid() >> 22) + 167, (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 43881), android.text.TextUtils.indexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3, objArr137);
                                        java.util.Scanner useDelimiter2 = scanner2.useDelimiter(((java.lang.String) objArr137[0]).intern());
                                        next = useDelimiter2.hasNext() ? useDelimiter2.next() : str6;
                                        useDelimiter2.close();
                                    } catch (java.io.IOException unused4) {
                                    }
                                    if (next.contains(intern)) {
                                        i13 = i ^ 150;
                                        if (i13 == i) {
                                            java.lang.Object[] objArr138 = {new int[]{i}, new int[]{i13}, null, null, new int[1]};
                                            java.lang.Object[] objArr139 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i | (-93144358))) | 3156040) * 449) + 344578844 + (((~((-93144358) | i23)) | 3156040) * 449))};
                                            java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj33 == null) {
                                                java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 2713 - android.graphics.Color.blue(0), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                                                byte[] bArr17 = $$a;
                                                java.lang.Object[] objArr140 = new java.lang.Object[1];
                                                b((byte) (bArr17[18] - 1), (byte) (-bArr17[16]), (short) (bArr17[14] - 1), objArr140);
                                                obj33 = cls33.getMethod((java.lang.String) objArr140[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj33);
                                            }
                                            ((int[]) objArr138[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr139)).intValue();
                                            return objArr138;
                                        }
                                        java.lang.Object[] objArr141 = new java.lang.Object[1];
                                        a(1660 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 37483), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 47, objArr141);
                                        java.lang.Object[] objArr142 = {((java.lang.String) objArr141[0]).intern()};
                                        java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                        if (obj34 == null) {
                                            java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 36, android.graphics.Color.green(0) + 3161, (char) (33099 - (android.view.KeyEvent.getMaxKeyCode() >> 16)));
                                            byte[] bArr18 = $$a;
                                            byte b39 = (byte) (bArr18[18] - 1);
                                            byte b40 = (byte) (bArr18[14] - 1);
                                            java.lang.Object[] objArr143 = new java.lang.Object[1];
                                            b(b39, b40, (short) (b40 | 35), objArr143);
                                            obj34 = cls34.getMethod((java.lang.String) objArr143[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj34);
                                        }
                                        long j39 = ~((java.lang.Long) ((java.lang.reflect.Method) obj34).invoke(null, objArr142)).longValue();
                                        long j40 = ((r7 * (-858)) - 245567349800L) + ((j11 | (-285543430)) * (-859)) + (((~(j | (-285543430))) | (~(285543429 | j39 | j11))) * 859) + (((~(j39 | (-285543430))) | (~(j39 | j))) * 859) + 1193014168;
                                        int i37 = (int) (j40 >> 32);
                                        int i38 = (int) j40;
                                        int i39 = ~((-1438684721) | i);
                                        int i40 = (((i37 & ((((((-1467480064) | i23) * (-192)) - 1788177110) + (((~((-1461823232) | i23)) | 1442883243) * (-384))) + ((((~((-1442883244) | i)) | (~((-18939989) | i23))) | (~((-5656833) | i))) * 192))) | (i38 & ((((((~(1609154352 | i23)) | 1458310) | i39) * (-252)) - 1069732291) + ((i39 | (~(1610612662 | i23))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE)))) * 263) ^ i;
                                        if (i40 != i) {
                                            java.lang.Object[] objArr144 = {new int[]{i}, new int[]{i40}, null, null, new int[1]};
                                            java.lang.Object[] objArr145 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i | 2042297727)) | 8548370) * (-756)) + 2134624173 + ((2042297727 | i23) * 756))};
                                            java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj35 == null) {
                                                java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 50, 2713 - android.graphics.Color.alpha(0), (char) android.graphics.Color.green(0));
                                                byte[] bArr19 = $$a;
                                                java.lang.Object[] objArr146 = new java.lang.Object[1];
                                                b((byte) (bArr19[18] - 1), (byte) (-bArr19[16]), (short) (bArr19[14] - 1), objArr146);
                                                obj35 = cls35.getMethod((java.lang.String) objArr146[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj35);
                                            }
                                            ((int[]) objArr144[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj35).invoke(null, objArr145)).intValue();
                                            return objArr144;
                                        }
                                        java.lang.Object[] objArr147 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                        java.lang.Object[] objArr148 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((497319702 | i) * (-50)) + 780118999 + (((~(i | (-478178835))) | (~((-1075347562) | i23))) * 50) + (((~((-1553526396) | i23)) | 1075347561 | (~(i23 | 497319702))) * 50))};
                                        java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj36 == null) {
                                            java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.red(0), 2712 - android.text.TextUtils.lastIndexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.graphics.Color.green(0));
                                            byte[] bArr20 = $$a;
                                            java.lang.Object[] objArr149 = new java.lang.Object[1];
                                            b((byte) (bArr20[18] - 1), (byte) (-bArr20[16]), (short) (bArr20[14] - 1), objArr149);
                                            obj36 = cls36.getMethod((java.lang.String) objArr149[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj36);
                                        }
                                        ((int[]) objArr147[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr148)).intValue();
                                        return objArr147;
                                    }
                                }
                                DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 95) % 128;
                                i13 = i;
                                if (i13 == i) {
                                }
                            }
                        }
                        java.lang.Object[] objArr150 = new java.lang.Object[1];
                        a(android.view.View.MeasureSpec.getMode(0) + 310, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 23 - android.graphics.Color.blue(0), objArr150);
                        java.lang.String intern41 = ((java.lang.String) objArr150[0]).intern();
                        java.lang.Object[] objArr151 = new java.lang.Object[1];
                        a(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 365, (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22248), 11 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr151);
                        java.lang.String intern42 = ((java.lang.String) objArr151[0]).intern();
                        java.lang.Object[] objArr152 = new java.lang.Object[1];
                        a((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 375, (char) (android.view.KeyEvent.normalizeMetaState(0) + 47556), 7 - android.graphics.Color.red(0), objArr152);
                        java.lang.String intern43 = ((java.lang.String) objArr152[0]).intern();
                        java.lang.Object[] objArr153 = new java.lang.Object[1];
                        a(382 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 9057), 8 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr153);
                        java.lang.String[] strArr16 = {intern41, intern42, intern43, ((java.lang.String) objArr153[0]).intern()};
                        java.lang.Object[] objArr154 = new java.lang.Object[1];
                        a(390 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 58242), android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 18, objArr154);
                        java.lang.String intern44 = ((java.lang.String) objArr154[0]).intern();
                        java.lang.Object[] objArr155 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 407, (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), android.graphics.Color.blue(0) + 7, objArr155);
                        java.lang.String intern45 = ((java.lang.String) objArr155[0]).intern();
                        java.lang.Object[] objArr156 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 414, (char) (58489 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6, objArr156);
                        java.lang.String intern46 = ((java.lang.String) objArr156[0]).intern();
                        java.lang.Object[] objArr157 = new java.lang.Object[1];
                        a(421 - android.view.KeyEvent.normalizeMetaState(0), (char) (21773 - android.text.TextUtils.getOffsetBefore(str10, 0)), 10 - android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr157);
                        java.lang.String intern47 = ((java.lang.String) objArr157[0]).intern();
                        java.lang.Object[] objArr158 = new java.lang.Object[1];
                        a(432 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) android.view.KeyEvent.normalizeMetaState(0), 14 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr158);
                        java.lang.String[] strArr17 = {intern44, intern45, intern46, intern47, ((java.lang.String) objArr158[0]).intern()};
                        java.lang.Object[] objArr159 = new java.lang.Object[1];
                        a(android.text.TextUtils.indexOf(str10, str10, 0) + 446, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), 16 - android.view.View.resolveSizeAndState(0, 0, 0), objArr159);
                        java.lang.String intern48 = ((java.lang.String) objArr159[0]).intern();
                        java.lang.Object[] objArr160 = new java.lang.Object[1];
                        a(android.view.View.resolveSize(0, 0) + 462, (char) (33941 - android.view.View.MeasureSpec.getMode(0)), android.view.View.MeasureSpec.getSize(0) + 3, objArr160);
                        java.lang.String intern49 = ((java.lang.String) objArr160[0]).intern();
                        java.lang.Object[] objArr161 = new java.lang.Object[1];
                        a(473 - android.text.TextUtils.indexOf(str10, str10), (char) (android.os.Process.getGidForName(str10) + 42780), 22 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr161);
                        java.lang.String intern50 = ((java.lang.String) objArr161[0]).intern();
                        java.lang.Object[] objArr162 = new java.lang.Object[1];
                        a((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 495, (char) (58101 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), 25 - android.graphics.Color.green(0), objArr162);
                        java.lang.String intern51 = ((java.lang.String) objArr162[0]).intern();
                        java.lang.Object[] objArr163 = new java.lang.Object[1];
                        a(android.text.TextUtils.getCapsMode(str10, 0, 0) + my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL, (char) (31620 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), android.view.View.MeasureSpec.getMode(0) + 28, objArr163);
                        long j41 = j12;
                        java.lang.String[] strArr18 = {intern48, intern49, str3, intern50, intern51, ((java.lang.String) objArr163[0]).intern()};
                        java.lang.Object[] objArr164 = new java.lang.Object[1];
                        a(549 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 10 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr164);
                        java.lang.String intern52 = ((java.lang.String) objArr164[0]).intern();
                        java.lang.Object[] objArr165 = new java.lang.Object[1];
                        a(559 - (android.os.Process.myPid() >> 22), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 7 - android.os.Process.getGidForName(str10), objArr165);
                        java.lang.String intern53 = ((java.lang.String) objArr165[0]).intern();
                        java.lang.Object[] objArr166 = new java.lang.Object[1];
                        a(567 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 6, objArr166);
                        java.lang.String intern54 = ((java.lang.String) objArr166[0]).intern();
                        java.lang.Object[] objArr167 = new java.lang.Object[1];
                        a(573 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.text.TextUtils.getTrimmedLength(str10) + 30893), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 6, objArr167);
                        java.lang.String[] strArr19 = {intern52, intern53, intern54, ((java.lang.String) objArr167[0]).intern()};
                        java.lang.Object[] objArr168 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 579, (char) (63456 - android.graphics.Color.red(0)), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 16, objArr168);
                        java.lang.String intern55 = ((java.lang.String) objArr168[0]).intern();
                        java.lang.Object[] objArr169 = new java.lang.Object[1];
                        a((android.view.KeyEvent.getMaxKeyCode() >> 16) + 414, (char) ((android.os.Process.myPid() >> 22) + 58490), 7 - (android.os.Process.myTid() >> 22), objArr169);
                        java.lang.String intern56 = ((java.lang.String) objArr169[0]).intern();
                        java.lang.Object[] objArr170 = new java.lang.Object[1];
                        a((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 381, (char) (9057 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7, objArr170);
                        java.lang.String[] strArr20 = {intern55, intern56, ((java.lang.String) objArr170[0]).intern()};
                        java.lang.Object[] objArr171 = new java.lang.Object[1];
                        a(594 - android.os.Process.getGidForName(str10), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), 14 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr171);
                        java.lang.String intern57 = ((java.lang.String) objArr171[0]).intern();
                        java.lang.Object[] objArr172 = new java.lang.Object[1];
                        a(android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, (char) (12290 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), -android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr172);
                        java.lang.String[] strArr21 = {intern57, ((java.lang.String) objArr172[0]).intern()};
                        java.lang.Object[] objArr173 = new java.lang.Object[1];
                        a(610 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), android.view.MotionEvent.axisFromString(str10) + 10, objArr173);
                        java.lang.String intern58 = ((java.lang.String) objArr173[0]).intern();
                        java.lang.Object[] objArr174 = new java.lang.Object[1];
                        a(619 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((android.os.Process.myPid() >> 22) + 55621), 1 - android.graphics.Color.blue(0), objArr174);
                        java.lang.String[] strArr22 = {intern58, ((java.lang.String) objArr174[0]).intern()};
                        java.lang.Object[] objArr175 = new java.lang.Object[1];
                        a(android.graphics.Color.blue(0) + 620, (char) (2495 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16, objArr175);
                        java.lang.String intern59 = ((java.lang.String) objArr175[0]).intern();
                        java.lang.Object[] objArr176 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 462, (char) (33941 - android.widget.ExpandableListView.getPackedPositionType(0L)), 2 - android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr176);
                        java.lang.String intern60 = ((java.lang.String) objArr176[0]).intern();
                        java.lang.Object[] objArr177 = new java.lang.Object[1];
                        a(407 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) android.view.View.getDefaultSize(0, 0), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6, objArr177);
                        java.lang.String intern61 = ((java.lang.String) objArr177[0]).intern();
                        java.lang.Object[] objArr178 = new java.lang.Object[1];
                        a(635 - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 8 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr178);
                        java.lang.String intern62 = ((java.lang.String) objArr178[0]).intern();
                        java.lang.Object[] objArr179 = new java.lang.Object[1];
                        a(android.text.TextUtils.getOffsetAfter(str10, 0) + 421, (char) (21773 - (android.os.Process.myPid() >> 22)), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '%', objArr179);
                        java.lang.String intern63 = ((java.lang.String) objArr179[0]).intern();
                        java.lang.Object[] objArr180 = new java.lang.Object[1];
                        a(android.graphics.Color.alpha(0) + 432, (char) ((-1) - android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), '>' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr180);
                        java.lang.String[] strArr23 = {intern59, intern60, intern61, intern62, intern63, ((java.lang.String) objArr180[0]).intern()};
                        java.lang.Object[] objArr181 = new java.lang.Object[1];
                        a(android.graphics.Color.green(0) + 644, (char) (android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), 20 - android.text.TextUtils.getOffsetAfter(str10, 0), objArr181);
                        java.lang.String intern64 = ((java.lang.String) objArr181[0]).intern();
                        java.lang.Object[] objArr182 = new java.lang.Object[1];
                        a(664 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 60895), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 19, objArr182);
                        java.lang.String intern65 = ((java.lang.String) objArr182[0]).intern();
                        java.lang.Object[] objArr183 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getTouchSlop() >> 8) + 683, (char) (38687 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 'O' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr183);
                        java.lang.String intern66 = ((java.lang.String) objArr183[0]).intern();
                        java.lang.Object[] objArr184 = new java.lang.Object[1];
                        a((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 713, (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 19329), 26 - android.view.KeyEvent.keyCodeFromString(str10), objArr184);
                        java.lang.String intern67 = ((java.lang.String) objArr184[0]).intern();
                        java.lang.Object[] objArr185 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 740, (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 42120), android.view.KeyEvent.getDeadChar(0, 0) + 23, objArr185);
                        java.lang.String intern68 = ((java.lang.String) objArr185[0]).intern();
                        java.lang.Object[] objArr186 = new java.lang.Object[1];
                        a(android.view.View.getDefaultSize(0, 0) + 763, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), android.view.View.MeasureSpec.getSize(0) + 33, objArr186);
                        java.lang.String[] strArr24 = {intern64, intern65, intern66, intern67, intern68, ((java.lang.String) objArr186[0]).intern(), str3};
                        java.lang.Object[] objArr187 = new java.lang.Object[1];
                        a(796 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 13 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr187);
                        java.lang.String intern69 = ((java.lang.String) objArr187[0]).intern();
                        java.lang.Object[] objArr188 = new java.lang.Object[1];
                        a(375 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (47556 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6, objArr188);
                        java.lang.String[] strArr25 = {intern69, ((java.lang.String) objArr188[0]).intern()};
                        java.lang.Object[] objArr189 = new java.lang.Object[1];
                        a(810 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (13683 - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 30 - android.graphics.Color.blue(0), objArr189);
                        java.lang.String intern70 = ((java.lang.String) objArr189[0]).intern();
                        java.lang.Object[] objArr190 = new java.lang.Object[1];
                        a(840 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (54588 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 11 - android.text.TextUtils.indexOf(str10, str10), objArr190);
                        java.lang.String[] strArr26 = {intern70, ((java.lang.String) objArr190[0]).intern()};
                        java.lang.Object[] objArr191 = new java.lang.Object[1];
                        a(850 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 19 - android.view.View.MeasureSpec.getSize(0), objArr191);
                        java.lang.String intern71 = ((java.lang.String) objArr191[0]).intern();
                        java.lang.Object[] objArr192 = new java.lang.Object[1];
                        a(869 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (45660 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4, objArr192);
                        java.lang.String[] strArr27 = {intern71, ((java.lang.String) objArr192[0]).intern()};
                        java.lang.Object[] objArr193 = new java.lang.Object[1];
                        a((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 873, (char) (8657 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), 18 - android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr193);
                        java.lang.String[] strArr28 = {((java.lang.String) objArr193[0]).intern()};
                        java.lang.Object[] objArr194 = new java.lang.Object[1];
                        a(android.text.TextUtils.indexOf(str10, str10, 0) + 893, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 16 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr194);
                        java.lang.String[] strArr29 = {((java.lang.String) objArr194[0]).intern()};
                        java.lang.Object[] objArr195 = new java.lang.Object[1];
                        a(908 - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.text.TextUtils.getCapsMode(str10, 0, 0), 20 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr195);
                        java.lang.String[] strArr30 = {((java.lang.String) objArr195[0]).intern()};
                        java.lang.Object[] objArr196 = new java.lang.Object[1];
                        a(android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + com.google.zxing.pdf417.PDF417Common.NUMBER_OF_CODEWORDS, (char) (android.text.TextUtils.indexOf(str10, str10) + 31890), 18 - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr196);
                        java.lang.String[] strArr31 = {((java.lang.String) objArr196[0]).intern()};
                        java.lang.Object[] objArr197 = new java.lang.Object[1];
                        a(947 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) android.view.View.MeasureSpec.getSize(0), android.view.MotionEvent.axisFromString(str10) + 24, objArr197);
                        java.lang.String[] strArr32 = {((java.lang.String) objArr197[0]).intern()};
                        java.lang.Object[] objArr198 = new java.lang.Object[1];
                        a((android.view.KeyEvent.getMaxKeyCode() >> 16) + 970, (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 56892), 20 - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr198);
                        java.lang.String[] strArr33 = {((java.lang.String) objArr198[0]).intern()};
                        java.lang.Object[] objArr199 = new java.lang.Object[1];
                        a(android.view.View.resolveSize(0, 0) + 991, (char) android.text.TextUtils.indexOf(str10, str10), 24 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr199);
                        java.lang.String str15 = str3;
                        java.lang.String[] strArr34 = {((java.lang.String) objArr199[0]).intern(), str15};
                        java.lang.Object[] objArr200 = new java.lang.Object[1];
                        a(android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1016, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), 28 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr200);
                        java.lang.String[] strArr35 = {((java.lang.String) objArr200[0]).intern(), str15};
                        java.lang.Object[] objArr201 = new java.lang.Object[1];
                        a(1043 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 26, objArr201);
                        java.lang.String[] strArr36 = {((java.lang.String) objArr201[0]).intern(), str15};
                        java.lang.Object[] objArr202 = new java.lang.Object[1];
                        a(1069 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 11814), 32 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr202);
                        java.lang.String[] strArr37 = {((java.lang.String) objArr202[0]).intern(), str15};
                        java.lang.Object[] objArr203 = new java.lang.Object[1];
                        a(1102 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 27 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr203);
                        char c3 = 0;
                        java.lang.String[] strArr38 = {((java.lang.String) objArr203[0]).intern(), str15};
                        java.lang.Object[] objArr204 = new java.lang.Object[1];
                        a(android.view.View.MeasureSpec.getSize(0) + 1128, (char) android.view.KeyEvent.normalizeMetaState(0), android.text.TextUtils.indexOf(str10, str10) + 32, objArr204);
                        java.lang.String[][] strArr39 = {strArr16, strArr17, strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, new java.lang.String[]{((java.lang.String) objArr204[0]).intern(), str15}};
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        int i41 = i;
                        int i42 = 0;
                        int i43 = 0;
                        int i44 = 24;
                        while (i42 < i44) {
                            java.lang.String[] strArr40 = strArr39[i42];
                            java.lang.Object[] objArr205 = {strArr40[c3]};
                            java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj37 == null) {
                                java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 40, android.graphics.Color.argb(0, 0, 0, 0) + 1921, (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                byte b41 = (byte) ($$a[14] - 1);
                                byte b42 = b41;
                                strArr = strArr39;
                                str5 = str10;
                                j2 = j41;
                                java.lang.Object[] objArr206 = new java.lang.Object[1];
                                b(b41, b42, (short) (b42 | 653), objArr206);
                                obj37 = cls37.getMethod((java.lang.String) objArr206[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj37);
                            } else {
                                strArr = strArr39;
                                str5 = str10;
                                j2 = j41;
                            }
                            java.lang.String str16 = (java.lang.String) ((java.lang.reflect.Method) obj37).invoke(null, objArr205);
                            java.lang.String[] strArr41 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr40, 1, strArr40.length);
                            if (str16 != null && str16.length() != 0) {
                                if (strArr40.length != 1) {
                                    for (java.lang.String str17 : strArr41) {
                                        if (!str16.contains(str17)) {
                                        }
                                    }
                                }
                                i43++;
                                i41 = i ^ (i42 + 10);
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(str16);
                                java.lang.Object[] objArr207 = new java.lang.Object[1];
                                a(1160 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 64843), 1 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr207);
                                sb.append(((java.lang.String) objArr207[0]).intern());
                                sb.append(str16);
                                arrayList.add(sb.toString());
                                break;
                            }
                            i42++;
                            strArr39 = strArr;
                            str10 = str5;
                            j41 = j2;
                            i44 = 24;
                            c3 = 0;
                        }
                        str4 = str10;
                        j = j41;
                        if (i43 > 2) {
                            objArr = new java.lang.Object[]{new int[]{i}, new int[]{i41}, arrayList, null, new int[1]};
                            java.lang.Object[] objArr208 = {num, num, java.lang.Integer.valueOf(((~(1790167754 | i)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 1287363669 + (((~(1790167754 | i23)) | 176259778) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))};
                            java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj38 == null) {
                                java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 2713 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                byte[] bArr21 = $$a;
                                java.lang.Object[] objArr209 = new java.lang.Object[1];
                                b((byte) (bArr21[18] - 1), (byte) (-bArr21[16]), (short) (bArr21[14] - 1), objArr209);
                                obj38 = cls38.getMethod((java.lang.String) objArr209[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj38);
                            }
                            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr208)).intValue();
                            c = 0;
                            ((int[]) objArr[4])[0] = intValue;
                        } else {
                            objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                            java.lang.Object[] objArr210 = {num, num, java.lang.Integer.valueOf(((~(2050800625 | i)) * (-301)) + 912278004 + (((~((-1344584113) | i)) | (~(706261985 | i23))) * (-301)) + (((~((-706261986) | i)) | (-1344584113)) * 301))};
                            java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj39 == null) {
                                java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2713 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                                byte[] bArr22 = $$a;
                                java.lang.Object[] objArr211 = new java.lang.Object[1];
                                b((byte) (bArr22[18] - 1), (byte) (-bArr22[16]), (short) (bArr22[14] - 1), objArr211);
                                obj39 = cls39.getMethod((java.lang.String) objArr211[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj39);
                            }
                            int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr210)).intValue();
                            c = 0;
                            ((int[]) objArr[4])[0] = intValue2;
                        }
                        int i45 = ((int[]) objArr[1])[c];
                        if (i45 != i) {
                            DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 111) % 128;
                            java.lang.Object[] objArr212 = {new int[]{i}, new int[]{i45}, (java.util.List) objArr[2], null, new int[1]};
                            java.lang.Object[] objArr213 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-1108347946) | i23)) * 130) - 576299465) + (((~(i | (-1108347946))) | 2121796) * 130))};
                            java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj40 == null) {
                                java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 50, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2713, (char) android.graphics.Color.red(0));
                                byte[] bArr23 = $$a;
                                java.lang.Object[] objArr214 = new java.lang.Object[1];
                                b((byte) (bArr23[18] - 1), (byte) (-bArr23[16]), (short) (bArr23[14] - 1), objArr214);
                                obj40 = cls40.getMethod((java.lang.String) objArr214[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj40);
                            }
                            ((int[]) objArr212[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj40).invoke(null, objArr213)).intValue();
                            return objArr212;
                        }
                        java.lang.Object[] objArr852 = new java.lang.Object[1];
                        a(446 - android.view.View.getDefaultSize(0, 0), (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 16 - android.graphics.Color.green(0), objArr852);
                        java.lang.Object[] objArr862 = {((java.lang.String) objArr852[0]).intern()};
                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj == null) {
                        }
                        invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr862);
                        if (invoke != null) {
                        }
                        if (i10 != 1986687685) {
                        }
                        str6 = str4;
                        java.lang.Object[] objArr1192 = new java.lang.Object[1];
                        a(android.text.TextUtils.getCapsMode(str6, 0, 0) + 1503, (char) ((-1) - android.text.TextUtils.lastIndexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), 13 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr1192);
                        java.lang.String intern342 = ((java.lang.String) objArr1192[0]).intern();
                        java.lang.Object[] objArr1202 = new java.lang.Object[1];
                        a(1516 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.view.KeyEvent.normalizeMetaState(0) + 54652), android.graphics.Color.red(0) + 5, objArr1202);
                        java.lang.String[] strArr102 = {intern342, ((java.lang.String) objArr1202[0]).intern()};
                        java.lang.Object[] objArr1212 = new java.lang.Object[1];
                        a((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1520, (char) (android.text.TextUtils.indexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), android.graphics.Color.red(0) + 15, objArr1212);
                        java.lang.String intern352 = ((java.lang.String) objArr1212[0]).intern();
                        java.lang.Object[] objArr1222 = new java.lang.Object[1];
                        a(1536 - android.view.KeyEvent.keyCodeFromString(str6), (char) android.graphics.Color.argb(0, 0, 0, 0), 19 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr1222);
                        java.lang.String intern362 = ((java.lang.String) objArr1222[0]).intern();
                        java.lang.Object[] objArr1232 = new java.lang.Object[1];
                        a(1555 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.view.View.MeasureSpec.getSize(0) + 3519), 14 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr1232);
                        java.lang.String[] strArr112 = {intern352, intern362, ((java.lang.String) objArr1232[0]).intern()};
                        java.lang.Object[] objArr1242 = new java.lang.Object[1];
                        a((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1570, (char) (android.view.KeyEvent.getDeadChar(0, 0) + 55851), 21 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr1242);
                        java.lang.String intern372 = ((java.lang.String) objArr1242[0]).intern();
                        java.lang.Object[] objArr1252 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1590, (char) (android.text.TextUtils.indexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), 10 - android.text.TextUtils.indexOf(str6, str6, 0, 0), objArr1252);
                        java.lang.String[] strArr122 = {intern372, ((java.lang.String) objArr1252[0]).intern()};
                        java.lang.Object[] objArr1262 = new java.lang.Object[1];
                        a(1601 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14251), 11 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr1262);
                        java.lang.String intern382 = ((java.lang.String) objArr1262[0]).intern();
                        java.lang.Object[] objArr1272 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 336, (char) (1598 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 6, objArr1272);
                        java.lang.String[] strArr132 = {intern382, ((java.lang.String) objArr1272[0]).intern()};
                        java.lang.Object[] objArr1282 = new java.lang.Object[1];
                        a(1610 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 28 - android.view.KeyEvent.keyCodeFromString(str6), objArr1282);
                        java.lang.String intern392 = ((java.lang.String) objArr1282[0]).intern();
                        java.lang.Object[] objArr1292 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1590, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 10, objArr1292);
                        c2 = 0;
                        strArr2 = new java.lang.String[][]{strArr102, strArr112, strArr122, strArr132, new java.lang.String[]{intern392, ((java.lang.String) objArr1292[0]).intern()}};
                        int i342 = -1;
                        i11 = 0;
                        loop4: while (true) {
                            if (i11 < 5) {
                            }
                            i11++;
                            strArr2 = strArr2;
                            c2 = 0;
                        }
                        if (i12 == i) {
                        }
                    }
                }
                i8 = i;
                if (i8 == i) {
                }
            } else {
                AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 65) % 128;
                i6 = i;
                if (i6 != i) {
                }
            }
        }
        str3 = str;
        i6 = i;
        if (i6 != i) {
        }
    }
}
