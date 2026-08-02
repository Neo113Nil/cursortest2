package com.payair.hce;

/* loaded from: classes10.dex */
final class setMagstripeCvmIssuerOptions {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static short[] getAid;
    private static int getCvrMaskAnd;
    private static int getGpoResponse;
    private static byte[] getProfileVersion;
    private com.payair.hce.setMagstripeCvmIssuerOptions.writeReplace AlternateContactlessPaymentDataJson;
    private com.payair.hce.setMagstripeCvmIssuerOptions.writeReplace valueOf;
    private java.lang.String values;
    private int writeReplace = 30;
    private int DigitizedCardProfile = 30;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    private static void b(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i = b * 4;
        ?? r7 = 104 - (b3 * 2);
        byte[] bArr = $$a;
        int i2 = 4 - (b2 * 2);
        byte[] bArr2 = new byte[i + 1];
        int i3 = -1;
        byte b4 = r7;
        if (bArr == null) {
            b4 = i2 + r7;
            i2++;
        }
        while (true) {
            i3++;
            bArr2[i3] = b4;
            if (i3 == i) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b5 = b4;
            b4 = b5 + bArr[i2];
            i2++;
        }
    }

    setMagstripeCvmIssuerOptions() {
        byte b = 0;
        this.valueOf = new com.payair.hce.setMagstripeCvmIssuerOptions.writeReplace(this, b);
        this.AlternateContactlessPaymentDataJson = new com.payair.hce.setMagstripeCvmIssuerOptions.writeReplace(this, b);
    }

    /* renamed from: com.payair.hce.setMagstripeCvmIssuerOptions$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
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

        private static void b(short s, int i, int i2, java.lang.Object[] objArr) {
            int i3 = 718 - i2;
            int i4 = i * 2;
            byte[] bArr = $$a;
            int i5 = s + 4;
            char[] cArr = new char[i4 + 1];
            int i6 = -1;
            if (bArr == null) {
                i3 = (i4 + (-i3)) - 2;
            }
            while (true) {
                i6++;
                i5++;
                cArr[i6] = (char) i3;
                if (i6 == i4) {
                    objArr[0] = new java.lang.String(cArr);
                    return;
                }
                i3 = (i3 + (-bArr[i5])) - 2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0031). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void c(short s, byte b, short s2, java.lang.Object[] objArr) {
            int i;
            byte[] bArr = $$d;
            int i2 = (s * 3) + 99;
            int i3 = b * 3;
            int i4 = 3 - (s2 * 4);
            byte[] bArr2 = new byte[1 - i3];
            int i5 = 0 - i3;
            if (bArr == null) {
                i2 = i5;
                int i6 = i4;
                int i7 = 0;
                i2 += -i4;
                i4 = i6;
                i = i7;
                int i8 = i4 + 1;
                bArr2[i] = (byte) i2;
                if (i == i5) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                int i9 = i + 1;
                i6 = i8;
                i4 = bArr[i8];
                i7 = i9;
                i2 += -i4;
                i4 = i6;
                i = i7;
                int i82 = i4 + 1;
                bArr2[i] = (byte) i2;
                if (i == i5) {
                }
            } else {
                i = 0;
                int i822 = i4 + 1;
                bArr2[i] = (byte) i2;
                if (i == i5) {
                }
            }
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
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 49, 381 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (62388 - (android.os.Process.myTid() >> 22)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c((short) 0, (byte) 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(values), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 3966 - android.text.TextUtils.indexOf("", "", 0), (char) (40223 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 34, 212 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) android.view.View.combineMeasuredStates(0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
            $10 = ($11 + 109) % 128;
            while (getcvmmodel.valueOf < i2) {
                int i4 = $11 + 37;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                    java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.text.TextUtils.getCapsMode("", 0, 0), 212 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                    throw new java.lang.ArithmeticException();
                }
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr7 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 213, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
            }
            objArr[0] = new java.lang.String(cArr);
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            valueOf = 0;
            AlternateContactlessPaymentDataJson = 1;
            char[] cArr = new char[1707];
            java.nio.ByteBuffer.wrap("^\u0080\u0013?Å\"·\u0005iPÛ\f\u008dx\u007fo1kã]UN\u0007 ù·«\u0094\u001d\u0096Ï\u0087\u0081\u008bsé%â\u0097ÀIÌ;ôì$^3\u0010.Â\u0018´\u0002¶¤û\u001b-\u0006_!\u0081t3(e\\\u0097KÙO\u000by½jï\u0084\u0011\u0093C°õ£'®i»\u009bÚÍü\u007fó¡ëÓý\u0004\u0010¶\u0013ø\u000fµ«ø\u0014.\t\\.\u0082{0'fS\u0094DÚ@\bv¾eì\u008b\u0012\u009c@¿ö¯$±jª\u0098ÓÁE\u008cíZû(Åö\u0095DÃ\u0012½à¢®¿|\u0092Ê\u0087\u00989f}4a\u0082^PB\u001eLì7º1\b\u001eÖ%¤\fsóÁò\u008fþ]Û+Ðù¯+æfX°UÂv\u001c6®iø\u0016\nKD\u0019\u0096/ .rÅZ\u009d\u0017#Á.³\rmMß\u0005\u0089c{s5<çVQH\u0003¡ý²^\u0080\u0013(Å#·\u0010i\u001eÛ\u0019\u008ds\u007f,1]ã}Uj\u0007¼ù©«®\u001d³Ï\u0082\u0081\u009bsú^\u0080\u0013(Å>·\u0000i\u000bÛ\u000e\u008dz\u007f,1cãRUE\u0007üù³«¢\u001d\u0095Ï\u008d\u0081\u008dsµ%ô\u0097Ü÷¹ºFlT\u001eiÀdrgûR¶»^\u0080\u0013(Å>·\u0000i\u000bÛ\u000e\u008dz\u007f,1mãRUI\u0007üù±«®\u001d\u009aÏ\u0096\u0081¹sÖ%ª\u0097ÝIÚ;Æì\"^n\u0010,Â\u0014´\tfgØm\u008ad|[Ýy\u0090ÑFÇ4ùêòX÷\u000e\u0083üÕ²\u0094`«Ö°\u0084\u0005zH(W\u009ecLo\u0002@ð/¦S\u0014:Ê4¸=oÞ^\u0080\u0013(Å>·\u0000i\u000bÛ\u000e\u008dz\u007f,1cãRUE\u0007üù³«¢\u001d\u0095Ï\u008d\u0081\u008asö%ò\u0097åIò;Ûì%^,\u0010?ÂU´\u0014f|£\u0011î®8³J\u0094\u0094Á&\u0094pã\u0082ÿÌë\u001eÍ¨Ãú'\u0004=V.U\u0091\u0018xÎ%¼]bFÐN\u00867t+:mè\u001f^\u0004\fìòç^Á\u0013>Å&·\u0000i\u001aÛE\u008dy\u007ff1{áu¬ÞzÀ\béÖéd±2\u0084À\u009f\u008e\u0096\\«ê¡¸_FY\u0014J¢gp{>i\u009e\u008aÓu\u0005awM©G\u001bF^Ý\u00134Åi·\u0003i\rÛ\u0004\u008ds\u007fv1lãOU\t\u0007¾ù¾«¥\u001d\u0082Ï\u0085\u0081\u008esø%ó\u0097ÆIÍ;Îì%ØZ\u0095¬C»1\u0098^Ù\u00139Å(·\u000bi\fÛ\r^\u0080\u0013+Å5·\u001ci\u001cÛD\u008dz\u007fl1kãNUK\u0007¶ù¬'fj\u0086¼\u0097Î´\u0010§¢¡ôÍ\u0006ÏHÄ\u008f\u009bÂM\u0014Zfy¸a\nw\\\u0010®\u0019à\u00132&^Ú\u00135Å,·\u001di\u0010Û\u001c\u008dy^Ì\u00133Å5·\u001ci\u0012Û\u0002\u008db\u007fnvñ;\u0018íE\u009f/A!ó(¥_WZ\u0019@Ëc}%/\u009bÑ\u0096\u0083\u00915²ç¬©¦eä(\u0004þ\u0015\u008c6Rzà`¶Z^È\u0013>Å)·\u0016i\rÛ\u0002\u008dt^È\u0013>Å)·\u0016i\rÛ\u0002\u008dt\u007f\\1wã\u0003U\u00114¥yS¯DÝ{\u0003`±oç\u0019\u00151[\u001a\u0089n?|má\u0093\u0084Á\u0092^Ý\u00134Åi·\u0003i\rÛ\u0004\u008ds\u007fv1lãOU\t\u0007¾ù°«¯\u001d\u0092Ï\u008f^Ü\u0013?Å,s©>UèQ\u009a|D}ö| \u001bR\u0012Ed\b¡Þ½¬Ùr§À\u0094\u0096ódý*ìøÜNÈ\u001cyâ3°.\u0006\u000fÔI\u009a&hy>\u007f\u008cVRX D^î\u00135Å#·\u0001i\u0010Û\u0002\u008ds\u007f#1\\ã\u007fUl\u0007óù½«¾\u001d\u009eÏ\u008f\u0081\u009bs»%á\u0097ÜIÍ;\u008bì/^{\u0010y^î\u00135Å#·\u0001i\u0010Û\u0002\u008ds\u007f#1\\ã\u007fUl\u0007óù½«¾\u001d\u009eÏ\u008f\u0081\u009bs»%á\u0097ÜIÍ;\u008bì/^{\u0010yÂ$´Qf'0m}\u0084«ÙÙ«\u0007®µ©ãÃ\u0011Ä_Þ\u008dù;ò^È\u00134Å+·\u0017i\u0019Û\u0002\u008dd\u007fk^Ù\u00139Å(·\u000biGÛ]^Ý\u0013:Å)·\u0010i\u0017Û\u001eY7\u0014ÞÂ\u0083°énçÜî\u008a\u0099x\u009c6\u0086ä¥Rã\u0000[þG¬@\u001asÈm^Ý\u00134Åi·\u0018i\u001aÛ\u0019\u008dy\u007ff1cã\u0015UV\u0007¶ù²«¾^\u009e^Ý\u00134Åi·\u0000i\u001aÛ\b\u008db\u007fq1j\u0084Pxç5\u000eãS\u0091+O0ý8«AY]\u0017\u001bÅqso!\u0086ß\u0081\u008d\u0084;®é\u00adå°¨W~R\ffÒY`j6VÄL\u0083\u0083Îj\u00187jO´T\u0006\\P%¢9ì\u007f>\u0003\u0088\u0010Úã$ævðÀÛ\u0012Í\\Ã®¬ø·J\u0099Vû\u001b\rÍ\u001a¿%a>Ó1\u0085Gw\u001f9Oël]\u007f\u000fÏñ\u008b£\u009d\u0015ªÇµ\u0089®{Á-×^È\u0013>Å)·\u0016i\rÛ\u0002\u008dt\u007f\\1wã\u0003U\u0011\u0007üù¬«¯\u001d\u009cÏ¼\u0081\u0097s£%±\u0097\u009cIØ;Îì9^&\u0010=Â\u0012´\u0004fLØg\u008a3|\u0001j¬'ZñM\u0083r]iïf¹\u0010KH\u0005\f×0a,3ÐÍ×\u009fÊ)ÌûôµïG\u0094\u0011Ì£°}¾\u000f¡ØVjU$Bö|^È\u0013>Å)·\u0016i\rÛ\u0002\u008dt\u007f,1yãYUH\u0007«ùç«ý\u001d\u0087ÏÌ\u0081\u0099sù%è\u0097ËI\u0087;\u009dì'/åb\u0019´\u0005Æ9\u0018>ª#ü\u0015\u000e]@F\u0092}$Uv\u0099\u0088\u0082Ú\u008elµ¾ ð§\u0002éTÒæ¦8¤J©\u009d\u001d/\u000ba\f³3Å8\u0017W©Qûy\rb_6\u00914^Ý\u00134Åi·\u0011i\u0010Û\u0004\u008dc\u007fo1`ãZUC\u0007¶ù\u00ad\u0005\u0015Hü\u009e¡ìÙ2Ø\u0080ÌÖ«$¢jª¸\u0092\u000e\u0088\\~¢9ðaFJ\u0094BÚK(7~aÌ\u001d\u0012\u001e`\r·ø\u0005îKõ\u0099ÃïÝ=²\u0083¹Ñ·ø\u001dµÆcÐ\u0011òÏã}ñ+\u0080ÙÝ\u0097\u0084Eðóâ^Ý\u00134Åi·\u0011i\nÛ\u0002\u008d{\u007fg1!ã_UN\u0007 ù¯«§\u001d\u0096Ï\u009a\u0081Ásò%ã\u007f=2ØäÒ\u0096áH´¢Gï´9¯K\u0086\u0095Ð'\u0099qà\u0083áÍ \u001fË©Ãû?\u0005+Wgá\u00063\u0010}\u0001\u008fjÙu^Þ\u0013>Å*·\u0006iQÛ\u0003\u008d`\u007f-1bãZUN\u0007½ù´«®\u001d\u008eÏ\u0090\u008a)ÇÉ\u0011Ýcñ½¦\u000fïY\u0086«Úå\u009e7\u00ad\u0081»ÓA-w\u007f_Éa\u001byU}§\u001eñ\u0011Éã\u0084\u0003R\u0017 ;þlL%\u001aLè\u0010¦^teÂ~\u0090±n\u0086<\u0093\u008a¤X\u00ad\u0016»äÒ²Ãüs±\u009agÇ\u0015¶Ë´y·/×ÝÈ\u0093ÍA»÷è¥\u0013[\u0015\t\u0017¿6m$#%Ñ\u001b\u0087X5xë|\u0099pN\u009d^Ý\u00134Åi·\u0011i\u0010Û\u0004\u008dc\u007f-1~ã^UJ\u0007¦ùñ«ª\u001d\u0081Ï\u0087\u0081°sõ%æ\u0097ÞIÚ^Ý\u00134Åi·\u001ci\u001bÛ\u0006\u008d9\u007fa1zãRUK\u0007·ùñ«\u00ad\u001d\u009eÏ\u008d\u0081\u0088sþ%õ\u0097ÃIÍ;Âì9^7^Ý\u00134Åi·\u0003i\rÛ\u0004\u008ds\u007fv1lãOU\t\u0007±ùª«¢\u001d\u009bÏ\u0087\u0081Ásý%î\u0097ÝIØ;Îì%^3\u0010=Â\u0012´\tfg^Ý\u00134Åi·\u0000i\u0006Û\u0018\u008dc\u007ff1bã\u0015UE\u0007¦ù¶«§\u001d\u0093ÏÍ\u0081\u0089sò%é\u0097ÔIÚ;Ùì'^1\u0010&Â\u0015´\u0013{\u00126ûà¦\u0092ÏLÉþ×¨¬Z©\u0014\u00adÆ«p\u008d\"dÜd\u008e*8ZêY¤IV8\u0000,²Rl\u0016\u001e\rÉö{ë5åçÆ\u0091ØC®ý¹¯ªY\u008c^Ý\u00134Åi·\u0005i\u001aÛ\u0005\u008ds\u007fl1}ã\u0015UE\u0007¦ù¶«§\u001d\u0093ÏÍ\u0081\u0089sò%é\u0097ÔIÚ;Ùì'^1\u0010&Â\u0015´\u0013^Ý\u00134Åi·\u0005i\u001aÛ\u0005\u008ds\u007fl1}ãdUC\u0007¿ù´«¦\u001dÙÏ\u0081\u0081\u009asò%ë\u0097×I\u0091;Íì>^-\u0010(Â\u001e´\u0015fcØm\u008ab|Y.Wù\nl\u0090!/÷2\u0085\u0015[@é\n¿bM~\u0003jÑtgG5ªË¿\u0099¾^\u0080\u0013?Å\"·\u0005iPÛ\u0018\u008dx\u007f`1dã^US\u0007üù½«ª\u001d\u0084Ï\u0086\u0081\u008dsú%é\u0097×Ià;Ìì2^-\u00106Â\u001f^\u0080\u0013?Å\"·\u0005iPÛ\u0018\u008dx\u007f`1dã^US\u0007üù¸«®\u001d\u0099Ï\u009a\u0081\u008b\u0085åÈZ\u001eGl`²5\u0000}V\u001d¤\u0005ê\u00018;\u008e6Ü\u0099\"ËpËÆÿ\u0014óZî`8-\u0090û\u0086\u0089¸Wèå¢³ÊAÖ\u000fÂÝÜkë9\u0019Ç\u0006\u0095\u0010#*^\u0080\u0013(Å>·\u0000i\u000bÛ\u000e\u008dz\u007f,1cãRUE\u0007üù³«¢\u001d\u0095Ï\u0080\u0081°sö%æ\u0097ßIÓ;Äì4^\u001c\u0010+Â\u001e´\u0005ffØx\u008aT|F.FàBR®\u0004éö\u0080¨\u0090\u0083÷ÎH\u0018Ujr´'\u0006~P\u0013¢\u0000ì'>+\u0088 Ú×^\u0080\u0013?Å\"·\u0005iPÛ\t\u008dd\u007fw1PãOUN\u0007¾ùº^\u0080\u0013?Å\"·\u0005iPÛ\u0018\u008dx\u007f`1dã^US\u0007üù½«¸\u001d\u0083Ï\u0085\u0081\u0080s÷%ã\u0097ÖIÍ;Ï^\u0080\u0013(Å>·\u0000i\u000bÛ\u000e\u008dz\u007f,1cãRUE\u0007üù³«¢\u001d\u0095Ï\u0081\u0081\u009csï%á\u0097ÜIÓ;Ïì2^1\u0010\u0010Â\u0011´\tfzØ1\u008ax|X^\u0080\u0013?Å\"·\u0005iPÛ\t\u008dd\u007fw1nãXUD\u0007¶§©ê\u0016<\u000bN,\u0090y\" tM\u0086^ÈA\u001ak¬|þ\u0095tÎ9qïl\u009dKC\u001eñG§*U9\u001b,É\u0010\u007f\u000e-ó\u009a\u0096×)\u00014s\u0013\u00adF\u001f\u001fIr»aõv'_\u0091XÃ ^\u0080\u0013?Å\"·\u0005iPÛ\t\u008dd\u007fw1yãVUT\u0007´\b%E\u009a\u0093\u0087á ?õ\u008d¬ÛÁ)ÒgÚµù\u0003ãQ\u001f¯\ný\r~Ú3eåx\u0097_I\nûS\u00ad>_-\u0011\nÃ\bu\u0010'ì^\u0080\u0013?Å&·\u0007i\u001eÛD\u008ds\u007fl1xãUUK\u0007¼ù¾«¯\u001d\u0084ÏÌ\u0081Ásã%å\u0097\u009cIÝ;Øì#^(oÈ\"~ôa\u0086OX\u0018êT¼6N%\u0000#Ò\u001cd\u00186èÈ¸\u009aÁ,Ìþß°ôB»\u0014®¦\u0089x\u0092\n\u0087ÝYod!kóW\u0085JW)é%¤\u008er\u0090\u0000¹Þ¹lá:ÛÈÉ\u0086ÚTñâð°\u0002N\t^\u009f\u0013=Å!·SiE^\u0080\u0013+Å5·\u001ci\u001cÛD\u008dd\u007ff1cã]U\b\u0007¾ù¾«»\u001d\u0084^È\u0013)Å&·\u001fi\u0013Û\u0004\u008dt\u007f-1hãTUK\u0007·ù¹«¢\u001d\u0084Ï\u008b\u0081Ásè%è^Ã\u00132Å%·4i3Û.\u008dD\u007f\\1mãHUS\u0007ýù¬«¤\u00ad\u0089à76:D\u0019\u009aY(\u000f~{\u008cnÂo\u0010S¦qô¹\n¹X¦î\u009b<\u0089r\u0095\u0080¼Ööd×ºÚ^Í\u00137Å2·\u0016i\fÛ\u001f\u008dv\u007f`1dãH\u001dQPï\u0086âôÁ*\u0081\u0098×Î©<§r° \u009e\u0016\u0085~s3ÌåÕ\u0097ôIíû·\u00ad\u0080_\u009f\u0011\u008bÃ¦u¸'OÙM\u008b\\=wï?¡2S\f\u0005\u0004·oi-\u001b(ÌÔ~Ã0\u0092âð\u0094ùF\u008c^\u0080\u0013+Å5·\u001ci\u001cÛD\u008dt\u007fs1zãRUI\u0007µù°ýÍ°\u0011f\u000e\u00142Ê<x'.AÜN^\u0080\u0013?Å&·\u0007i\u001eÛD\u008dz\u007fj1|ãXU\b\u0007£ù\u00ad«¤\u001d\u0091Ï\u008a\u0081\u0083sþ%ô\u0097\u009cIÜ;Þì%^l\u0010\u007fÂT´\u0004f|Ør\u008a%|Z.JàLR©\u0004¨ö\u0085¨\u0096\u001a\u0099Ìã¾\u00adpâ\"Þ\u0094ÊI&;6í&_\u0012".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1707);
            DigitizedCardProfile = cArr;
            values = -3644244889744501925L;
        }

        static void init$1() {
            $$d = new byte[]{125, com.google.common.base.Ascii.SI, -77, -54};
            $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:376:0x242f, code lost:
        
            if (((((int) r3) & ((((r6 | 1610612730) * 494) + 1362686807) + (((~(r6 | 129738056)) | 1524522938) * 494))) | (((int) (r3 >> 32)) & ((((((~(1620682694 | r64)) | 183456283) * (-668)) - 1136589462) + (((~(183456283 | r64)) | 1620682694) * 1336)) + ((1795160031 | r64) * 668)))) != 0) goto L272;
         */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0c8c  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0d5f  */
        /* JADX WARN: Removed duplicated region for block: B:212:0x274b A[Catch: all -> 0x02e4, TryCatch #1 {all -> 0x02e4, blocks: (B:8:0x00dc, B:10:0x00ef, B:11:0x0138, B:19:0x0319, B:21:0x034f, B:22:0x03a1, B:29:0x0430, B:31:0x0443, B:32:0x048e, B:41:0x0552, B:43:0x058b, B:44:0x05e3, B:47:0x05f9, B:49:0x060a, B:50:0x0652, B:56:0x070d, B:58:0x0749, B:59:0x079e, B:75:0x088e, B:77:0x08d5, B:78:0x092a, B:85:0x09e7, B:87:0x09fa, B:88:0x0a43, B:96:0x0b2b, B:98:0x0b65, B:99:0x0bb9, B:103:0x0bf5, B:105:0x0c08, B:106:0x0c53, B:113:0x0ca4, B:115:0x0cf0, B:116:0x0d49, B:120:0x0dab, B:122:0x0dbe, B:123:0x0e0e, B:129:0x0ecc, B:131:0x0f05, B:132:0x0f5a, B:136:0x0f94, B:138:0x0fa7, B:139:0x0ff2, B:145:0x104b, B:147:0x108f, B:148:0x10e2, B:152:0x1142, B:154:0x1155, B:155:0x11a3, B:161:0x131b, B:163:0x1368, B:164:0x13bc, B:167:0x13d2, B:169:0x13e1, B:170:0x1426, B:174:0x14fe, B:176:0x155a, B:177:0x15b0, B:181:0x15c7, B:183:0x15df, B:184:0x1624, B:190:0x16d8, B:192:0x1722, B:193:0x177d, B:197:0x17bd, B:199:0x17d0, B:200:0x181b, B:202:0x1824, B:204:0x1842, B:205:0x1890, B:210:0x2738, B:212:0x274b, B:213:0x2793, B:224:0x2b84, B:226:0x2b97, B:227:0x2be3, B:244:0x2df5, B:246:0x2e33, B:247:0x2e89, B:233:0x2cbf, B:235:0x2cd2, B:236:0x2d21, B:266:0x3060, B:268:0x3073, B:269:0x30cc, B:279:0x31ba, B:281:0x3207, B:282:0x325f, B:297:0x33fd, B:299:0x3437, B:300:0x348f, B:304:0x34c9, B:306:0x34dc, B:307:0x352e, B:311:0x35e1, B:313:0x3627, B:314:0x367b, B:318:0x36a9, B:320:0x36ed, B:321:0x3746, B:339:0x279f, B:341:0x27bd, B:342:0x280b, B:348:0x21af, B:350:0x21c2, B:351:0x220e, B:360:0x2236, B:362:0x2249, B:363:0x229d, B:371:0x2342, B:373:0x235c, B:374:0x23ab, B:385:0x24b8, B:387:0x24ed, B:388:0x2547, B:393:0x2649, B:395:0x26ad, B:396:0x26ff, B:401:0x2576, B:403:0x25be, B:404:0x2610, B:445:0x01e9, B:447:0x01fc, B:448:0x0248), top: B:7:0x00dc }] */
        /* JADX WARN: Removed duplicated region for block: B:215:0x279c  */
        /* JADX WARN: Removed duplicated region for block: B:223:0x2b82  */
        /* JADX WARN: Removed duplicated region for block: B:246:0x2e33 A[Catch: all -> 0x02e4, TryCatch #1 {all -> 0x02e4, blocks: (B:8:0x00dc, B:10:0x00ef, B:11:0x0138, B:19:0x0319, B:21:0x034f, B:22:0x03a1, B:29:0x0430, B:31:0x0443, B:32:0x048e, B:41:0x0552, B:43:0x058b, B:44:0x05e3, B:47:0x05f9, B:49:0x060a, B:50:0x0652, B:56:0x070d, B:58:0x0749, B:59:0x079e, B:75:0x088e, B:77:0x08d5, B:78:0x092a, B:85:0x09e7, B:87:0x09fa, B:88:0x0a43, B:96:0x0b2b, B:98:0x0b65, B:99:0x0bb9, B:103:0x0bf5, B:105:0x0c08, B:106:0x0c53, B:113:0x0ca4, B:115:0x0cf0, B:116:0x0d49, B:120:0x0dab, B:122:0x0dbe, B:123:0x0e0e, B:129:0x0ecc, B:131:0x0f05, B:132:0x0f5a, B:136:0x0f94, B:138:0x0fa7, B:139:0x0ff2, B:145:0x104b, B:147:0x108f, B:148:0x10e2, B:152:0x1142, B:154:0x1155, B:155:0x11a3, B:161:0x131b, B:163:0x1368, B:164:0x13bc, B:167:0x13d2, B:169:0x13e1, B:170:0x1426, B:174:0x14fe, B:176:0x155a, B:177:0x15b0, B:181:0x15c7, B:183:0x15df, B:184:0x1624, B:190:0x16d8, B:192:0x1722, B:193:0x177d, B:197:0x17bd, B:199:0x17d0, B:200:0x181b, B:202:0x1824, B:204:0x1842, B:205:0x1890, B:210:0x2738, B:212:0x274b, B:213:0x2793, B:224:0x2b84, B:226:0x2b97, B:227:0x2be3, B:244:0x2df5, B:246:0x2e33, B:247:0x2e89, B:233:0x2cbf, B:235:0x2cd2, B:236:0x2d21, B:266:0x3060, B:268:0x3073, B:269:0x30cc, B:279:0x31ba, B:281:0x3207, B:282:0x325f, B:297:0x33fd, B:299:0x3437, B:300:0x348f, B:304:0x34c9, B:306:0x34dc, B:307:0x352e, B:311:0x35e1, B:313:0x3627, B:314:0x367b, B:318:0x36a9, B:320:0x36ed, B:321:0x3746, B:339:0x279f, B:341:0x27bd, B:342:0x280b, B:348:0x21af, B:350:0x21c2, B:351:0x220e, B:360:0x2236, B:362:0x2249, B:363:0x229d, B:371:0x2342, B:373:0x235c, B:374:0x23ab, B:385:0x24b8, B:387:0x24ed, B:388:0x2547, B:393:0x2649, B:395:0x26ad, B:396:0x26ff, B:401:0x2576, B:403:0x25be, B:404:0x2610, B:445:0x01e9, B:447:0x01fc, B:448:0x0248), top: B:7:0x00dc }] */
        /* JADX WARN: Removed duplicated region for block: B:258:0x2dd4 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:263:0x304c  */
        /* JADX WARN: Removed duplicated region for block: B:278:0x319a  */
        /* JADX WARN: Removed duplicated region for block: B:285:0x3275 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:337:0x3197 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:339:0x279f A[Catch: all -> 0x02e4, TryCatch #1 {all -> 0x02e4, blocks: (B:8:0x00dc, B:10:0x00ef, B:11:0x0138, B:19:0x0319, B:21:0x034f, B:22:0x03a1, B:29:0x0430, B:31:0x0443, B:32:0x048e, B:41:0x0552, B:43:0x058b, B:44:0x05e3, B:47:0x05f9, B:49:0x060a, B:50:0x0652, B:56:0x070d, B:58:0x0749, B:59:0x079e, B:75:0x088e, B:77:0x08d5, B:78:0x092a, B:85:0x09e7, B:87:0x09fa, B:88:0x0a43, B:96:0x0b2b, B:98:0x0b65, B:99:0x0bb9, B:103:0x0bf5, B:105:0x0c08, B:106:0x0c53, B:113:0x0ca4, B:115:0x0cf0, B:116:0x0d49, B:120:0x0dab, B:122:0x0dbe, B:123:0x0e0e, B:129:0x0ecc, B:131:0x0f05, B:132:0x0f5a, B:136:0x0f94, B:138:0x0fa7, B:139:0x0ff2, B:145:0x104b, B:147:0x108f, B:148:0x10e2, B:152:0x1142, B:154:0x1155, B:155:0x11a3, B:161:0x131b, B:163:0x1368, B:164:0x13bc, B:167:0x13d2, B:169:0x13e1, B:170:0x1426, B:174:0x14fe, B:176:0x155a, B:177:0x15b0, B:181:0x15c7, B:183:0x15df, B:184:0x1624, B:190:0x16d8, B:192:0x1722, B:193:0x177d, B:197:0x17bd, B:199:0x17d0, B:200:0x181b, B:202:0x1824, B:204:0x1842, B:205:0x1890, B:210:0x2738, B:212:0x274b, B:213:0x2793, B:224:0x2b84, B:226:0x2b97, B:227:0x2be3, B:244:0x2df5, B:246:0x2e33, B:247:0x2e89, B:233:0x2cbf, B:235:0x2cd2, B:236:0x2d21, B:266:0x3060, B:268:0x3073, B:269:0x30cc, B:279:0x31ba, B:281:0x3207, B:282:0x325f, B:297:0x33fd, B:299:0x3437, B:300:0x348f, B:304:0x34c9, B:306:0x34dc, B:307:0x352e, B:311:0x35e1, B:313:0x3627, B:314:0x367b, B:318:0x36a9, B:320:0x36ed, B:321:0x3746, B:339:0x279f, B:341:0x27bd, B:342:0x280b, B:348:0x21af, B:350:0x21c2, B:351:0x220e, B:360:0x2236, B:362:0x2249, B:363:0x229d, B:371:0x2342, B:373:0x235c, B:374:0x23ab, B:385:0x24b8, B:387:0x24ed, B:388:0x2547, B:393:0x2649, B:395:0x26ad, B:396:0x26ff, B:401:0x2576, B:403:0x25be, B:404:0x2610, B:445:0x01e9, B:447:0x01fc, B:448:0x0248), top: B:7:0x00dc }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0869  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0940  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context context, int i, int i2, int i3) {
            java.lang.String str;
            java.lang.String str2;
            java.lang.Integer num;
            int i4;
            int i5;
            int i6;
            long j;
            int i7;
            int i8;
            int i9;
            long j2;
            long j3;
            java.lang.String str3;
            java.lang.Object[] objArr;
            int i10;
            int i11;
            java.lang.String str4;
            java.lang.String[][] strArr;
            java.util.ArrayList arrayList;
            int i12;
            java.lang.String str5;
            java.util.ArrayList arrayList2;
            java.lang.String str6;
            java.lang.Object obj;
            java.lang.Object invoke;
            int i13;
            char c;
            int i14;
            int i15;
            int i16;
            java.lang.String intern;
            java.lang.Object[] objArr2;
            java.lang.String[][] strArr2;
            java.lang.String[] strArr3;
            int i17;
            int i18;
            java.lang.Object obj2;
            java.lang.String[] strArr4;
            java.lang.String next;
            java.lang.String str7 = "";
            char c2 = 0;
            java.lang.Integer num2 = 0;
            int i19 = 1;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(465 - android.view.KeyEvent.keyCodeFromString(""), (char) (11619 - android.view.KeyEvent.normalizeMetaState(0)), 8 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            int i20 = 16;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(android.view.ViewConfiguration.getEdgeSlop() >> 16, (char) (android.os.Process.myTid() >> 22), 27 - android.graphics.Color.alpha(0), objArr4);
            java.lang.String intern3 = ((java.lang.String) objArr4[0]).intern();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 27, (char) (59428 - (android.os.Process.myPid() >> 22)), 25 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr5);
            java.lang.String intern4 = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(android.graphics.ImageFormat.getBitsPerPixel(0) + 53, (char) ((-16717013) - android.graphics.Color.rgb(0, 0, 0)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, objArr6);
            java.lang.String intern5 = ((java.lang.String) objArr6[0]).intern();
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            a(70 - android.graphics.Color.alpha(0), (char) (40900 - android.graphics.ImageFormat.getBitsPerPixel(0)), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27, objArr7);
            java.lang.String[] strArr5 = {intern3, intern4, intern5, ((java.lang.String) objArr7[0]).intern()};
            int i21 = 0;
            while (i21 < 4) {
                int i22 = valueOf + 97;
                AlternateContactlessPaymentDataJson = i22 % 128;
                if (i22 % 2 == 0) {
                    try {
                        java.lang.Object[] objArr8 = {strArr5[i21]};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                        if (obj3 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> i20), 3161 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (33099 - (android.view.ViewConfiguration.getTouchSlop() >> 8)));
                            byte b = $$a[i20];
                            java.lang.Object[] objArr9 = new java.lang.Object[i19];
                            b(b, (byte) (-b), androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, objArr9);
                            java.lang.String str8 = (java.lang.String) objArr9[c2];
                            java.lang.Class<?>[] clsArr = new java.lang.Class[i19];
                            clsArr[c2] = java.lang.String.class;
                            obj3 = cls.getMethod(str8, clsArr);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj3);
                        }
                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr8)).longValue();
                        long j4 = i;
                        num = num2;
                        long j5 = ~longValue;
                        long j6 = ~j4;
                        str = str7;
                        str2 = intern2;
                        long j7 = ((-675) * longValue) + 280180908045L + ((j4 | 413856585 | j5) * (-676)) + (((~(j6 | 413856585)) | (~(j5 | 413856585))) * 676) + (((~((-413856586) | j5)) | (~(j5 | j6)) | (((413856585 | longValue) | j4) ^ (-1))) * 676) + 581578318;
                        int i23 = ~i;
                        if (((((int) j7) & ((((~((-523039938) | i)) | (-1811660459)) * 398) + 332523273 + (((~(i23 | (-523039938))) | (-1811660459)) * 398))) | (((int) (j7 << 83)) & ((((673270160 | i) * 614) - 1806842614) + (((~(1092251746 | i23)) | 673253776 | (~((-1765489139) | i23))) * (-1228)) + (((~(1765505522 | i23)) | (~((-1092235363) | i23))) * 614)))) != 0) {
                            i4 = i ^ (i21 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
                            break;
                        }
                        i21++;
                        num2 = num;
                        str7 = str;
                        intern2 = str2;
                        c2 = 0;
                        i20 = 16;
                        i19 = 1;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    str = str7;
                    str2 = intern2;
                    num = num2;
                    java.lang.Object[] objArr10 = {strArr5[i21]};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                    if (obj4 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.View.resolveSizeAndState(0, 0, 0), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3161, (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 33099));
                        byte b2 = $$a[16];
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        b(b2, (byte) (-b2), androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, objArr11);
                        obj4 = cls2.getMethod((java.lang.String) objArr11[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj4);
                    }
                    long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr10)).longValue();
                    long j8 = i;
                    long j9 = ((-55) * longValue2) + 56498050345L + (((~((-1027237279) | j8)) | longValue2) * 56) + ((~((-1027237279) | longValue2)) * (-56)) + (((~(longValue2 | (~j8))) | (-1027237279)) * 56) + 2022672182;
                    if (((((int) (j9 >> 32)) & (((((~(2136670175 | r3)) | (~((-5780122) | i))) * (-302)) - 1174465778) + ((~(2136670175 | i)) * (-604)) + (((~(2130890054 | i)) | 687883522) * 302))) | (((int) j9) & ((((~(1597945099 | r3)) * 979) - 1987262676) + ((160718689 | i) * (-979)) + (((~((~i) | 160718689)) | (~(1597945099 | i))) * 979)))) != 0) {
                        i4 = i ^ (i21 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
                        break;
                    }
                    i21++;
                    num2 = num;
                    str7 = str;
                    intern2 = str2;
                    c2 = 0;
                    i20 = 16;
                    i19 = 1;
                }
            }
            str = str7;
            str2 = intern2;
            num = num2;
            i4 = i;
            int i24 = 3;
            if (i4 != i) {
                java.lang.Object[] objArr12 = {new int[]{i}, new int[]{i4}, null, null, new int[1]};
                java.lang.Object[] objArr13 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((r2 * 992) - 1556536159) + (((~((-611989463) | i)) | 71447954 | (~((~i) | 1979398143))) * (-496)) + ((i | 1438856635) * 496))};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.widget.ExpandableListView.getPackedPositionChild(0L), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2713, (char) (android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    b((byte) (-$$a[16]), r2[18], 653, objArr14);
                    obj5 = cls3.getMethod((java.lang.String) objArr14[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                }
                ((int[]) objArr12[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr13)).intValue();
                return objArr12;
            }
            java.lang.String str9 = str;
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            a(98 - android.text.TextUtils.indexOf(str9, str9), (char) (30054 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), 12 - android.view.View.MeasureSpec.getMode(0), objArr15);
            java.lang.String intern6 = ((java.lang.String) objArr15[0]).intern();
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            a(110 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_ALPHA_IDENTIFIERS), (-16777203) - android.graphics.Color.rgb(0, 0, 0), objArr16);
            java.lang.String intern7 = ((java.lang.String) objArr16[0]).intern();
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            a(122 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.view.KeyEvent.normalizeMetaState(0), 18 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr17);
            java.lang.String[] strArr6 = {intern6, intern7, ((java.lang.String) objArr17[0]).intern()};
            int i25 = 0;
            while (true) {
                if (i25 >= i24) {
                    i5 = i;
                    break;
                }
                java.lang.Object[] objArr18 = {strArr6[i25]};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                if (obj6 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.graphics.Color.argb(0, 0, 0, 0) + 3161, (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 33099));
                    byte b3 = $$a[16];
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    b(b3, (byte) (-b3), androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, objArr19);
                    obj6 = cls4.getMethod((java.lang.String) objArr19[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj6);
                }
                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr18)).longValue();
                long j10 = 1136737984 | longValue3;
                long j11 = i;
                long j12 = ~j11;
                int i26 = i25;
                long j13 = (((-753) * longValue3) - 858237178675L) + (((~j10) | (~(j11 | 1136737984)) | (~(longValue3 | j11))) * (-754)) + (((~(j10 | j11)) | ((((-1136737985) | j12) | longValue3) ^ (-1))) * (-754)) + ((j12 | 1136737984) * 754) + 2132172888;
                int i27 = (int) (j13 >> 32);
                int i28 = ~i;
                if (((((int) j13) & ((((~(1185509204 | i)) | 1235847425) * 398) + 2036450029 + (((~(1185509204 | i28)) | 1235847425) * 398))) | (((((-1075054601) | i28) * 494) + 873721974 + (((~(i28 | (-1813301263))) | (-1381247561)) * 494)) & i27)) != 0) {
                    i5 = (i26 + 270) ^ i;
                    break;
                }
                i25 = i26 + 1;
                i24 = 3;
            }
            if (i5 != i) {
                java.lang.Object[] objArr20 = {new int[]{i}, new int[]{i5}, null, null, new int[1]};
                java.lang.Object[] objArr21 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((r2 * 992) - 1556536159) + (((~((-458263989) | i)) | 440438164 | (~((~i) | 1610407933))) * (-496)) + ((i | 1592582109) * 496))};
                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj7 == null) {
                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2714 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    b((byte) (-$$a[16]), r2[18], 653, objArr22);
                    obj7 = cls5.getMethod((java.lang.String) objArr22[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                }
                ((int[]) objArr20[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr21)).intValue();
                return objArr20;
            }
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1781008036);
            if (obj8 == null) {
                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 1863 - android.text.TextUtils.indexOf(str9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 41775));
                byte b4 = (byte) ($$a[16] + 1);
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                b((short) 35, b4, b4, objArr23);
                obj8 = cls6.getMethod((java.lang.String) objArr23[0], null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1781008036, obj8);
            }
            long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj8).invoke(null, null)).longValue();
            long j14 = i;
            long j15 = ~j14;
            long j16 = (-1838203325) | j15;
            long j17 = ((((((-494) * longValue4) + 908072442550L) + ((~(longValue4 | (-1838203325))) * (-495))) + (495 * j16)) + (((~((~longValue4) | 1838203324)) | (~j16)) * 495)) - 91009537;
            int i29 = ~i;
            int i30 = (((int) j17) & (((((~(1832208052 | i29)) | (-2143287231)) * 98) - 95232375) + (((~((-394981643) | i29)) | 1832208052 | (~(394981642 | i))) * (-49)) + (((~(1832208052 | i)) | 1748305588) * 49))) | (((int) (j17 >> 32)) & (((((~((-671127980) | i)) | ((~(673815471 | i29)) | (-766098432))) * 717) - 1394046549) + (((~((-671127980) | i29)) | (-766098432) | (~(673815471 | i))) * 717)));
            int i31 = i30 != 0 ? (i30 + 199) ^ i : i;
            if (i31 != i) {
                java.lang.Object[] objArr24 = {new int[]{i}, new int[]{i31}, null, null, new int[1]};
                java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((i | (-17982465)) * (-381)) + 67948650) + (((~(1592101263 | i29)) | (-1169321358)) * 381)) - 1738615808)};
                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj9 == null) {
                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 50, 2712 - android.text.TextUtils.indexOf(str9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                    b((byte) (-$$a[16]), r3[18], 653, objArr26);
                    obj9 = cls7.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj9);
                }
                ((int[]) objArr24[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr25)).intValue();
                return objArr24;
            }
            java.lang.Object[] objArr27 = new java.lang.Object[1];
            a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 141, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 19 - android.text.TextUtils.lastIndexOf(str9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr27);
            java.lang.String intern8 = ((java.lang.String) objArr27[0]).intern();
            java.lang.Object[] objArr28 = new java.lang.Object[1];
            a(161 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (43380 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), 6 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr28);
            java.lang.String intern9 = ((java.lang.String) objArr28[0]).intern();
            java.io.File file = new java.io.File(intern8);
            if (file.exists() && file.isFile()) {
                try {
                    java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(file));
                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                    a(166 - android.text.TextUtils.lastIndexOf(str9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 42401), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2, objArr29);
                    java.util.Scanner useDelimiter = scanner.useDelimiter(((java.lang.String) objArr29[0]).intern());
                    next = useDelimiter.hasNext() ? useDelimiter.next() : str9;
                    useDelimiter.close();
                } catch (java.io.IOException unused) {
                }
                if (next.contains(intern9)) {
                    i6 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
                    if (i6 == i) {
                        AlternateContactlessPaymentDataJson = (valueOf + 85) % 128;
                        java.lang.Object[] objArr30 = {new int[]{i}, new int[]{i6}, null, null, new int[1]};
                        int i32 = ~(259016737 | i);
                        java.lang.Object[] objArr31 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(i | (-1791829361))) | ((~((-259016738) | i)) | 171966496)) * (-880)) - 1385820159) + (((~((-259016738) | i29)) | 1791829360 | i32) * (-880)) + (i32 * 880))};
                        java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj10 == null) {
                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.red(0), 2713 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            b((byte) (-$$a[16]), r2[18], 653, objArr32);
                            obj10 = cls8.getMethod((java.lang.String) objArr32[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
                        }
                        ((int[]) objArr30[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr31)).intValue();
                        return objArr30;
                    }
                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                    a(170 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) android.text.TextUtils.indexOf(str9, str9), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31, objArr33);
                    java.lang.String intern10 = ((java.lang.String) objArr33[0]).intern();
                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                    a(200 - android.text.TextUtils.indexOf(str9, str9, 0, 0), (char) (33785 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 23, objArr34);
                    java.lang.String intern11 = ((java.lang.String) objArr34[0]).intern();
                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                    a(223 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), android.graphics.Color.argb(0, 0, 0, 0) + 28, objArr35);
                    java.lang.String intern12 = ((java.lang.String) objArr35[0]).intern();
                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                    a(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 252, (char) (64913 - android.graphics.Color.red(0)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15, objArr36);
                    java.lang.String[] strArr7 = {intern10, intern11, intern12, ((java.lang.String) objArr36[0]).intern()};
                    int i33 = 0;
                    while (true) {
                        if (i33 >= 4) {
                            j = j15;
                            i7 = i;
                            break;
                        }
                        java.lang.Object[] objArr37 = {strArr7[i33]};
                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                        if (obj11 == null) {
                            java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.graphics.Color.blue(0) + 3161, (char) (33099 - android.text.TextUtils.getTrimmedLength(str9)));
                            byte b5 = (byte) ($$a[16] + 1);
                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                            b((short) 35, b5, b5, objArr38);
                            obj11 = cls9.getMethod((java.lang.String) objArr38[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj11);
                        }
                        long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj11).invoke(null, objArr37)).longValue();
                        long j18 = ~longValue5;
                        long j19 = j18 | (-422331987);
                        long j20 = j18 | j15;
                        java.lang.String[] strArr8 = strArr7;
                        int i34 = i33;
                        j = j15;
                        long j21 = (((((193 * longValue5) + 81510073298L) + (((~(longValue5 | (-422331987))) | j15) * (-192))) + (((~j19) | (~j20)) * (-384))) + ((((~(j19 | j14)) | (~(422331986 | j20))) | (~((longValue5 | 422331986) | j14))) * 192)) - 1760000094;
                        int i35 = ~((-1746175146) | i);
                        if (((((int) j21) & (((((~(i29 | 1700378439)) | (~((-1615894083) | i))) * (-831)) - 1043473670) + ((~(1879046111 | i)) * (-1662)) + (((~(i29 | (-263152030))) | (~(263152029 | i)) | (~((-1700378440) | i))) * 831))) | (((int) (j21 >> 32)) & ((((~(i29 | 1783997867)) | (~((-1111565740) | i))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) + 721635738 + (((~(i29 | 1111565739)) | i35) * (-1040)) + ((i35 | (~(i29 | 1746175145)) | 672432128) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL)))) != 0) {
                            i7 = i ^ (i34 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                            break;
                        }
                        i33 = i34 + 1;
                        strArr7 = strArr8;
                        j15 = j;
                    }
                    if (i7 != i) {
                        java.lang.Object[] objArr39 = {new int[]{i}, new int[]{i7}, null, null, new int[1]};
                        java.lang.Object[] objArr40 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i | (-623992897))) | 1351093505) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 375037276 + ((~(i29 | (-623992897))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))};
                        java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj12 == null) {
                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.text.TextUtils.getTrimmedLength(str9) + 2713, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                            java.lang.Object[] objArr41 = new java.lang.Object[1];
                            b((byte) (-$$a[16]), r2[18], 653, objArr41);
                            obj12 = cls10.getMethod((java.lang.String) objArr41[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj12);
                        }
                        ((int[]) objArr39[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr40)).intValue();
                        return objArr39;
                    }
                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                    a(android.text.TextUtils.indexOf(str9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, (char) (2892 - android.text.TextUtils.indexOf(str9, str9, 0, 0)), android.graphics.Color.rgb(0, 0, 0) + 16777229, objArr42);
                    java.lang.Object[] objArr43 = {((java.lang.String) objArr42[0]).intern()};
                    java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj13 == null) {
                        java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 40, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1921, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        byte b6 = (byte) ($$a[16] + 1);
                        java.lang.Object[] objArr44 = new java.lang.Object[1];
                        b((short) 35, b6, b6, objArr44);
                        obj13 = cls11.getMethod((java.lang.String) objArr44[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj13);
                    }
                    java.lang.String str10 = (java.lang.String) ((java.lang.reflect.Method) obj13).invoke(null, objArr43);
                    if (str10 != null) {
                        java.lang.Object[] objArr45 = new java.lang.Object[1];
                        a(278 - android.view.View.getDefaultSize(0, 0), (char) android.view.View.resolveSizeAndState(0, 0, 0), 10 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr45);
                        if (str10.contains(((java.lang.String) objArr45[0]).intern())) {
                            i8 = i ^ 250;
                            if (i8 == i) {
                                java.lang.Object[] objArr46 = {new int[]{i}, new int[]{i8}, null, null, new int[1]};
                                java.lang.Object[] objArr47 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((10621000 | i) * 988) + 1761603557 + (((~(i29 | 15703530)) | 2030060037) * (-1976)) + (((~(i | (-2035142568))) | 10621000 | (~(i29 | 2035142567))) * 988))};
                                java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj14 == null) {
                                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 50, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2712, (char) (android.text.TextUtils.lastIndexOf(str9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                                    java.lang.Object[] objArr48 = new java.lang.Object[1];
                                    b((byte) (-$$a[16]), r3[18], 653, objArr48);
                                    obj14 = cls12.getMethod((java.lang.String) objArr48[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj14);
                                }
                                ((int[]) objArr46[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr47)).intValue();
                                return objArr46;
                            }
                            java.lang.Object[] objArr49 = new java.lang.Object[1];
                            a(287 - android.text.TextUtils.indexOf(str9, str9, 0, 0), (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 49141), 17 - android.graphics.Color.green(0), objArr49);
                            java.lang.String intern13 = ((java.lang.String) objArr49[0]).intern();
                            java.lang.Object[] objArr50 = new java.lang.Object[1];
                            a((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 303, (char) (49227 - android.graphics.Color.red(0)), 6 - android.graphics.Color.red(0), objArr50);
                            java.lang.Object[] objArr51 = {intern13, ((java.lang.String) objArr50[0]).intern()};
                            java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                            if (obj15 == null) {
                                java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.graphics.Color.blue(0), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2213, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1));
                                byte b7 = (byte) ($$a[16] + 1);
                                java.lang.Object[] objArr52 = new java.lang.Object[1];
                                b((short) 35, b7, b7, objArr52);
                                obj15 = cls13.getMethod((java.lang.String) objArr52[0], java.lang.String.class, java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj15);
                            }
                            long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj15).invoke(null, objArr51)).longValue();
                            long j22 = ~(longValue6 | j14);
                            long j23 = (((((111 * longValue6) + 43646049993L) + ((400422476 | j22) * (-220))) + ((j22 | (~((-400422477) | longValue6))) * 220)) + (((~((~longValue6) | (-400422477))) | (~(400422476 | longValue6))) * 110)) - 334952125;
                            int i36 = ~(980564964 | i);
                            int i37 = ((((int) (j23 >> 32)) & ((((((~(i29 | 1877175920)) | i36) * 1150) + (-334238508)) + ((i36 | (~(i29 | (-980564965)))) * (-575))) + (((~(1877175920 | i)) | (~(i29 | (-1877175921)))) * 575))) | (((int) j23) & (((((~(i29 | (-136397833))) * 433) + 707570302) + (((~((-1897544488) | i)) | (-960196399)) * (-433))) + (((~((-960196399) | i)) | (-2033942320)) * 433)))) != 0 ? i ^ 251 : i;
                            if (i37 != i) {
                                AlternateContactlessPaymentDataJson = (valueOf + 69) % 128;
                                java.lang.Object[] objArr53 = {new int[]{i}, new int[]{i37}, null, null, new int[1]};
                                java.lang.Object[] objArr54 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~r1) | 172064770) * (-828)) - 655634803) + ((i29 | 1878781327) * (-828))) - 852778432)};
                                java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj16 == null) {
                                    java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49, android.graphics.Color.green(0) + 2713, (char) (android.os.Process.myPid() >> 22));
                                    java.lang.Object[] objArr55 = new java.lang.Object[1];
                                    b((byte) (-$$a[16]), r4[18], 653, objArr55);
                                    obj16 = cls14.getMethod((java.lang.String) objArr55[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj16);
                                }
                                ((int[]) objArr53[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, objArr54)).intValue();
                                return objArr53;
                            }
                            java.lang.Object[] objArr56 = new java.lang.Object[1];
                            a(android.os.Process.getGidForName(str9) + 311, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), (android.os.Process.myTid() >> 22) + 23, objArr56);
                            java.lang.Object[] objArr57 = {((java.lang.String) objArr56[0]).intern()};
                            java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj17 == null) {
                                java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39, 1921 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) android.view.View.MeasureSpec.getMode(0));
                                byte b8 = (byte) ($$a[16] + 1);
                                java.lang.Object[] objArr58 = new java.lang.Object[1];
                                b((short) 35, b8, b8, objArr58);
                                obj17 = cls15.getMethod((java.lang.String) objArr58[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj17);
                            }
                            java.lang.String lowerCase = ((java.lang.String) ((java.lang.reflect.Method) obj17).invoke(null, objArr57)).toLowerCase();
                            java.lang.Object[] objArr59 = new java.lang.Object[1];
                            a(334 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (34451 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), android.view.View.MeasureSpec.getSize(0) + 4, objArr59);
                            int i38 = lowerCase.contains(((java.lang.String) objArr59[0]).intern()) ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE : i;
                            if (i38 != i) {
                                java.lang.Object[] objArr60 = {new int[]{i}, new int[]{i38}, null, null, new int[1]};
                                java.lang.Object[] objArr61 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(1057567063 | i)) | (-993279035)) * (-465)) - 252261847) + (((~((-993279035) | i)) | 1057567063) * 930) + ((i | (-3410985)) * 465))};
                                java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj18 == null) {
                                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 50, android.view.KeyEvent.keyCodeFromString(str9) + 2713, (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                    java.lang.Object[] objArr62 = new java.lang.Object[1];
                                    b((byte) (-$$a[16]), r3[18], 653, objArr62);
                                    obj18 = cls16.getMethod((java.lang.String) objArr62[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj18);
                                }
                                ((int[]) objArr60[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj18).invoke(null, objArr61)).intValue();
                                return objArr60;
                            }
                            java.lang.Object[] objArr63 = new java.lang.Object[1];
                            a(((android.os.Process.getThreadPriority(0) + 20) >> 6) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, (char) (android.view.View.getDefaultSize(0, 0) + 49141), android.graphics.Color.blue(0) + 17, objArr63);
                            java.lang.String intern14 = ((java.lang.String) objArr63[0]).intern();
                            java.lang.Object[] objArr64 = new java.lang.Object[1];
                            a((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 337, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.view.MotionEvent.axisFromString(str9) + 7, objArr64);
                            java.lang.Object[] objArr65 = {intern14, ((java.lang.String) objArr64[0]).intern()};
                            java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                            if (obj19 == null) {
                                java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 39, android.graphics.ImageFormat.getBitsPerPixel(0) + 2214, (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                byte b9 = (byte) ($$a[16] + 1);
                                java.lang.Object[] objArr66 = new java.lang.Object[1];
                                b((short) 35, b9, b9, objArr66);
                                obj19 = cls17.getMethod((java.lang.String) objArr66[0], java.lang.String.class, java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj19);
                            }
                            long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, objArr65)).longValue();
                            long j24 = ~longValue7;
                            long j25 = 1069954257 | j24;
                            long j26 = (((((131 * longValue7) - 138024099153L) + ((~((j24 | j) | 1069954257)) * 130)) + ((~j25) * (-260))) + (((~(longValue7 | (-1069954258))) | (~(j25 | j14))) * 130)) - 1805328859;
                            if (((((int) (j26 >> 32)) & ((((~(1605598766 | i)) | (~(i29 | (-68178441)))) * 920) + 2038856378 + (((~(i29 | 1320320558)) | (-1605598767)) * 920) + (((~(i29 | 1605598766)) | (~((-285278209) | i)) | (~((-68178441) | i))) * 920))) | (((int) j26) & ((((~((-603590573) | i)) | (~(i29 | (-2040816983)))) * (-1808)) + 1105386733 + (((~((-39455401) | i)) | (~(i29 | (-1476681811)))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(2040816982 | i)) | 564135172 | (~(i29 | 603590572))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN)))) != 0) {
                                i9 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                            } else {
                                java.lang.Object[] objArr67 = new java.lang.Object[1];
                                a(343 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 12 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr67);
                                java.lang.String intern15 = ((java.lang.String) objArr67[0]).intern();
                                java.lang.Object[] objArr68 = new java.lang.Object[1];
                                a(356 - android.graphics.Color.alpha(0), (char) (31167 - android.graphics.Color.green(0)), 8 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr68);
                                java.lang.String intern16 = ((java.lang.String) objArr68[0]).intern();
                                java.io.File file2 = new java.io.File(intern15);
                                if (file2.exists() && file2.isFile()) {
                                    try {
                                        java.util.Scanner scanner2 = new java.util.Scanner(new java.io.FileInputStream(file2));
                                        java.lang.Object[] objArr69 = new java.lang.Object[1];
                                        a(167 - android.text.TextUtils.indexOf(str9, str9, 0), (char) (42401 - android.view.Gravity.getAbsoluteGravity(0, 0)), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2, objArr69);
                                        java.util.Scanner useDelimiter2 = scanner2.useDelimiter(((java.lang.String) objArr69[0]).intern());
                                        java.lang.String next2 = useDelimiter2.hasNext() ? useDelimiter2.next() : str9;
                                        useDelimiter2.close();
                                        if (next2.contains(intern16)) {
                                            i9 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE;
                                        }
                                    } catch (java.io.IOException unused2) {
                                    }
                                }
                                i9 = i;
                            }
                            if (i9 != i) {
                                java.lang.Object[] objArr70 = {new int[]{i}, new int[]{i9}, null, null, new int[1]};
                                java.lang.Object[] objArr71 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i29 | (-1949677535))) | 67483026) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + 1106085481 + ((~((-67483027) | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(i | (-1882194509))) | (~(i29 | (-101168564))) | 33685537) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                                java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj20 == null) {
                                    java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString(str9) + 50, 2713 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.text.TextUtils.getCapsMode(str9, 0, 0));
                                    java.lang.Object[] objArr72 = new java.lang.Object[1];
                                    b((byte) (-$$a[16]), r3[18], 653, objArr72);
                                    obj20 = cls18.getMethod((java.lang.String) objArr72[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj20);
                                }
                                ((int[]) objArr70[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj20).invoke(null, objArr71)).intValue();
                                return objArr70;
                            }
                            java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1102036426);
                            if (obj21 == null) {
                                java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str9, str9) + 44, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2762, (char) ((-1) - android.text.TextUtils.lastIndexOf(str9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                byte b10 = (byte) ($$a[16] + 1);
                                java.lang.Object[] objArr73 = new java.lang.Object[1];
                                b((short) 35, b10, b10, objArr73);
                                obj21 = cls19.getMethod((java.lang.String) objArr73[0], null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1102036426, obj21);
                            }
                            long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj21).invoke(null, null)).longValue();
                            long j27 = ~longValue8;
                            long j28 = 774947338 | j27;
                            long j29 = j | (-774947339);
                            long j30 = ((569 * longValue8) - 440945035891L) + (((~j28) | (~(j | 774947338)) | (~(j27 | j))) * (-1136)) + (((~(774947338 | j14)) | (~(j27 | j14)) | (~(j29 | longValue8))) * (-568)) + (((~(j | longValue8)) | (~j29) | (~(j28 | j14))) * 568) + 899984102;
                            int i39 = (~(i29 | (-837825825))) | 272635168 | (~(i29 | 599400586));
                            if (((((int) j30) & (((1540794998 | i) * 376) + 2088992125 + (((~(i29 | 121055975)) | 1489010704) * (-376)) + (((~((-121055976) | i)) | (-1558282386)) * 376))) | (((int) (j30 >> 32)) & ((((~((-34209931) | i)) | i39) * 590) + 374196062 + (i39 * (-1180)) + (((~(i29 | (-599400587))) | (~(i29 | 837825824))) * 590)))) == 1) {
                                AlternateContactlessPaymentDataJson = (valueOf + 49) % 128;
                                java.lang.Object[] objArr74 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                java.lang.Object[] objArr75 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~(i29 | (-182228098))) | (~(i29 | (-1868618001)))) * (-867)) + 2017951652 + (((~((-182228098) | i)) | 172003328 | (~((-1868618001) | i))) * (-1734)) + (((~(i | (-10224770))) | (~(i29 | (-172003329))) | (~((-1696614673) | i))) * 867))};
                                java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj22 == null) {
                                    java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 50, android.view.KeyEvent.keyCodeFromString(str9) + 2713, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                    java.lang.Object[] objArr76 = new java.lang.Object[1];
                                    b((byte) (-$$a[16]), r3[18], 653, objArr76);
                                    obj22 = cls20.getMethod((java.lang.String) objArr76[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj22);
                                }
                                ((int[]) objArr74[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr75)).intValue();
                                return objArr74;
                            }
                            java.lang.Object[] objArr77 = {1};
                            java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                            if (obj23 == null) {
                                java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 27, 2364 - android.graphics.Color.alpha(0), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                byte b11 = (byte) ($$a[16] + 1);
                                java.lang.Object[] objArr78 = new java.lang.Object[1];
                                b((short) 35, b11, b11, objArr78);
                                obj23 = cls21.getMethod((java.lang.String) objArr78[0], java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj23);
                            }
                            long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj23).invoke(null, objArr77)).longValue();
                            long j31 = ~((-330194470) | longValue9);
                            long j32 = ~longValue9;
                            long j33 = ~(j | 330194469);
                            long j34 = ((-1187) * longValue9) + 196465709055L + (((~(j | longValue9)) | j31) * (-1188)) + (((~(j32 | j14)) | j31 | j33) * 594) + (((~(j32 | j)) | (~(330194469 | j32)) | j33) * 594) + 1077715730;
                            int i40 = ((((int) j34) & ((((((~(i29 | 1632771967)) | 1224968918) * (-328)) + 402550289) + ((1224968918 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE)) + ((((~((-1632771968) | i)) | 1090652758) | (~(i29 | 1767088127))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))) | (((int) (j34 >> 32)) & (((((~(i29 | 1782373972)) | 1075366912) * (-591)) + 207881662) + ((1782373972 | i) * 591)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE : i;
                            if (i40 != i) {
                                java.lang.Object[] objArr79 = {new int[]{i}, new int[]{i40}, null, null, new int[1]};
                                java.lang.Object[] objArr80 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i29 | (-908327875))) | (-1142518224)) * (-865)) + 1339657124 + ((~(i | 908327874)) * 865) + (((~(i29 | 908327874)) | (~(i29 | (-1142518224)))) * 865))};
                                java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj24 == null) {
                                    java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 50, (-16774503) - android.graphics.Color.rgb(0, 0, 0), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                                    java.lang.Object[] objArr81 = new java.lang.Object[1];
                                    b((byte) (-$$a[16]), r2[18], 653, objArr81);
                                    obj24 = cls22.getMethod((java.lang.String) objArr81[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj24);
                                }
                                ((int[]) objArr79[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj24).invoke(null, objArr80)).intValue();
                                return objArr79;
                            }
                            java.lang.Object[] objArr82 = new java.lang.Object[1];
                            a(311 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 23, objArr82);
                            java.lang.Object[] objArr83 = {((java.lang.String) objArr82[0]).intern()};
                            java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj25 == null) {
                                java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1921, (char) android.graphics.Color.alpha(0));
                                byte b12 = (byte) ($$a[16] + 1);
                                java.lang.Object[] objArr84 = new java.lang.Object[1];
                                b((short) 35, b12, b12, objArr84);
                                obj25 = cls23.getMethod((java.lang.String) objArr84[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj25);
                            }
                            java.lang.Object invoke2 = ((java.lang.reflect.Method) obj25).invoke(null, objArr83);
                            if (invoke2 != null) {
                                java.lang.Object[] objArr85 = {invoke2, 42};
                                java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj26 == null) {
                                    java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength(str9) + 28, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2594, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                    byte b13 = (byte) ($$a[16] + 1);
                                    java.lang.Object[] objArr86 = new java.lang.Object[1];
                                    b((short) 35, b13, b13, objArr86);
                                    obj26 = cls24.getMethod((java.lang.String) objArr86[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj26);
                                }
                                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr85)).longValue();
                                long j35 = ~longValue10;
                                long j36 = (((-932) * longValue10) - 508383732710L) + (((~(j | 544308064)) | j35) * (-933)) + (((~(j35 | j)) | (~(j35 | (-544308065)))) * 933) + ((~((-544308065) | longValue10)) * 933) + 1801408589;
                                if (((((int) j36) & ((((((~((-354701947) | i)) | 354439770) * 576) + 1771465493) + (((~(i29 | (-262177))) | (-2146368127)) * 576)) - 2001122688)) | (((int) (j36 >> 32)) & ((((((~(i29 | (-1157892521))) | (~(i29 | (-8404995)))) * (-184)) - 1019427974) + ((((~(i29 | (-1293356969))) | 135464448) | (~(i29 | (-143869443)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) - 993967568))) == 1986687685) {
                                    str3 = str9;
                                    j2 = j;
                                    i11 = 0;
                                    j3 = j14;
                                    java.lang.Object[] objArr87 = new java.lang.Object[1];
                                    a(446 - android.view.View.MeasureSpec.getMode(i11), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 16 - android.view.View.resolveSize(i11, i11), objArr87);
                                    java.lang.Object[] objArr88 = {((java.lang.String) objArr87[i11]).intern()};
                                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj == null) {
                                        java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 1921, (char) android.graphics.Color.blue(0));
                                        byte b14 = (byte) ($$a[16] + 1);
                                        java.lang.Object[] objArr89 = new java.lang.Object[1];
                                        b((short) 35, b14, b14, objArr89);
                                        obj = cls25.getMethod((java.lang.String) objArr89[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj);
                                    }
                                    invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr88);
                                    if (invoke != null) {
                                        i13 = 0;
                                    } else {
                                        java.lang.Object[] objArr90 = {invoke, 42};
                                        java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                        if (obj27 == null) {
                                            java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 28, 2594 - android.text.TextUtils.getOffsetBefore(str3, 0), (char) android.view.KeyEvent.keyCodeFromString(str3));
                                            byte b15 = (byte) ($$a[16] + 1);
                                            java.lang.Object[] objArr91 = new java.lang.Object[1];
                                            b((short) 35, b15, b15, objArr91);
                                            obj27 = cls26.getMethod((java.lang.String) objArr91[0], java.lang.String.class, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj27);
                                        }
                                        long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr90)).longValue();
                                        long j37 = ~longValue11;
                                        long j38 = (((-958) * longValue11) - 740034135718L) + (((~(j37 | j2)) | (~(j3 | (-772478222))) | (~(j2 | 772478221))) * 959) + ((~(longValue11 | 772478221)) * (-959)) + (((~(j2 | (-772478222))) | (~(j37 | j3)) | (~(j3 | 772478221))) * 959) + 484622303;
                                        i13 = (((int) (j38 >> 32)) & ((((~(i29 | (-219594001))) | 84157696 | (~(i29 | 1217632410))) * (-397)) + 1302101928 + ((1166353802 | i) * 397))) | (((int) j38) & ((((((~(i29 | (-910018974))) | 873840792) * 446) - 384374209) + (((~((-36178182) | i)) | 1073881120) * 446)) - 1109030704));
                                    }
                                    if (i13 != 1986687685 && i13 != -1514516938) {
                                        java.lang.Object[] objArr92 = new java.lang.Object[1];
                                        a(android.graphics.Color.alpha(0) + 1161, (char) (12817 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14, objArr92);
                                        java.lang.String intern17 = ((java.lang.String) objArr92[0]).intern();
                                        java.lang.Object[] objArr93 = new java.lang.Object[1];
                                        a((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1174, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 26 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr93);
                                        java.lang.String intern18 = ((java.lang.String) objArr93[0]).intern();
                                        java.lang.Object[] objArr94 = new java.lang.Object[1];
                                        a(android.view.View.MeasureSpec.getSize(0) + 1201, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), 17 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr94);
                                        java.lang.String intern19 = ((java.lang.String) objArr94[0]).intern();
                                        java.lang.Object[] objArr95 = new java.lang.Object[1];
                                        a(1219 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 56165), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 17, objArr95);
                                        java.lang.String intern20 = ((java.lang.String) objArr95[0]).intern();
                                        java.lang.Object[] objArr96 = new java.lang.Object[1];
                                        a(1235 - android.text.TextUtils.indexOf(str3, str3, 0, 0), (char) (16056 - android.view.View.resolveSize(0, 0)), 15 - android.graphics.Color.alpha(0), objArr96);
                                        java.lang.String intern21 = ((java.lang.String) objArr96[0]).intern();
                                        java.lang.Object[] objArr97 = new java.lang.Object[1];
                                        a(1251 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (android.os.Process.myTid() >> 22) + 37, objArr97);
                                        java.lang.String intern22 = ((java.lang.String) objArr97[0]).intern();
                                        java.lang.Object[] objArr98 = new java.lang.Object[1];
                                        a(android.view.KeyEvent.keyCodeFromString(str3) + 1287, (char) (56696 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 12, objArr98);
                                        java.lang.String intern23 = ((java.lang.String) objArr98[0]).intern();
                                        java.lang.Object[] objArr99 = new java.lang.Object[1];
                                        a(1299 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 13 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr99);
                                        java.lang.String intern24 = ((java.lang.String) objArr99[0]).intern();
                                        java.lang.Object[] objArr100 = new java.lang.Object[1];
                                        a(android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1313, (char) android.view.View.MeasureSpec.getSize(0), 21 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr100);
                                        java.lang.String intern25 = ((java.lang.String) objArr100[0]).intern();
                                        java.lang.Object[] objArr101 = new java.lang.Object[1];
                                        a(1334 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) android.view.View.MeasureSpec.getMode(0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 30, objArr101);
                                        java.lang.String intern26 = ((java.lang.String) objArr101[0]).intern();
                                        java.lang.Object[] objArr102 = new java.lang.Object[1];
                                        a(1364 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.os.Process.myTid() >> 22) + 12, objArr102);
                                        java.lang.String intern27 = ((java.lang.String) objArr102[0]).intern();
                                        java.lang.Object[] objArr103 = new java.lang.Object[1];
                                        a(android.graphics.Color.green(0) + 1377, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 63737), android.graphics.Color.alpha(0) + 12, objArr103);
                                        java.lang.String intern28 = ((java.lang.String) objArr103[0]).intern();
                                        java.lang.Object[] objArr104 = new java.lang.Object[1];
                                        a(1389 - android.text.TextUtils.indexOf(str3, str3), (char) (android.view.View.MeasureSpec.getMode(0) + 10830), 12 - android.view.View.MeasureSpec.getMode(0), objArr104);
                                        java.lang.String intern29 = ((java.lang.String) objArr104[0]).intern();
                                        java.lang.Object[] objArr105 = new java.lang.Object[1];
                                        a((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1401, (char) (android.view.KeyEvent.keyCodeFromString(str3) + 50198), 13 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr105);
                                        java.lang.String intern30 = ((java.lang.String) objArr105[0]).intern();
                                        java.lang.Object[] objArr106 = new java.lang.Object[1];
                                        a((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1413, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 13 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr106);
                                        java.lang.String intern31 = ((java.lang.String) objArr106[0]).intern();
                                        java.lang.Object[] objArr107 = new java.lang.Object[1];
                                        a(1425 - (android.os.Process.myTid() >> 22), (char) (android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 22182), android.text.TextUtils.indexOf(str3, str3) + 14, objArr107);
                                        java.lang.String intern32 = ((java.lang.String) objArr107[0]).intern();
                                        java.lang.Object[] objArr108 = new java.lang.Object[1];
                                        a(1439 - (android.os.Process.myPid() >> 22), (char) (8282 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), 12 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr108);
                                        java.lang.String intern33 = ((java.lang.String) objArr108[0]).intern();
                                        java.lang.Object[] objArr109 = new java.lang.Object[1];
                                        a(1451 - android.text.TextUtils.getOffsetBefore(str3, 0), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 23 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr109);
                                        java.lang.String intern34 = ((java.lang.String) objArr109[0]).intern();
                                        java.lang.Object[] objArr110 = new java.lang.Object[1];
                                        a(android.view.View.combineMeasuredStates(0, 0) + 1475, (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12616), android.text.TextUtils.getTrimmedLength(str3) + 28, objArr110);
                                        strArr3 = new java.lang.String[]{intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, intern29, intern30, intern31, intern32, intern33, intern34, ((java.lang.String) objArr110[0]).intern()};
                                        i17 = 0;
                                        while (true) {
                                            if (i17 < 19) {
                                                i17 = -1;
                                                break;
                                            }
                                            java.lang.String str11 = strArr3[i17];
                                            java.lang.Object[] objArr111 = {str11};
                                            java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                            if (obj28 == null) {
                                                java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 36, android.text.TextUtils.getTrimmedLength(str3) + 3161, (char) (33099 - (android.view.ViewConfiguration.getTouchSlop() >> 8)));
                                                byte b16 = (byte) ($$a[16] + 1);
                                                java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                b((short) 35, b16, (short) (b16 | 618), objArr112);
                                                obj28 = cls27.getMethod((java.lang.String) objArr112[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj28);
                                            }
                                            long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj28).invoke(null, objArr111)).longValue();
                                            long j39 = ~longValue12;
                                            strArr4 = strArr3;
                                            long j40 = ((-661) * longValue12) + 458761338299L + ((j2 | (~(694041358 | j39))) * 1324) + (((~(longValue12 | j3)) | (~(j3 | (-694041359)))) * (-1324)) + (((~(694041358 | longValue12)) | (~((-694041359) | j39))) * 662) + 1601512097;
                                            int i41 = (~((-258618019) | i)) | 104866304;
                                            if (((((int) (j40 >> 32)) & ((i41 * 992) + 1537498186 + ((i41 | (~(i29 | 1332360106))) * (-496)) + ((1178608392 | i) * 496))) | (((int) j40) & (((((~(i29 | (-1369370295))) | (-1488370592)) * (-865)) - 1293268212) + ((~(1369370294 | i)) * 865) + (((~(i29 | 1369370294)) | (~(i29 | (-1488370592)))) * 865)))) != 0) {
                                                int i42 = AlternateContactlessPaymentDataJson + 25;
                                                valueOf = i42 % 128;
                                                if (i42 % 2 != 0) {
                                                    throw null;
                                                }
                                            } else {
                                                java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1425, (char) (22181 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 14 - android.view.View.getDefaultSize(0, 0), objArr113);
                                                if (str11.equals(((java.lang.String) objArr113[0]).intern())) {
                                                    valueOf = (AlternateContactlessPaymentDataJson + 65) % 128;
                                                    java.lang.Object[] objArr114 = {str11};
                                                    java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                    if (obj29 == null) {
                                                        java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 36, 3161 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 33099));
                                                        byte b17 = $$a[16];
                                                        java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                        b(b17, (byte) (-b17), androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, objArr115);
                                                        obj29 = cls28.getMethod((java.lang.String) objArr115[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj29);
                                                    }
                                                    long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj29).invoke(null, objArr114)).longValue();
                                                    long j41 = (565 * longValue13) + 528006362857L + (((~((~longValue13) | j2)) | 937844338 | (~(longValue13 | j3))) * (-564)) + ((~(937844338 | longValue13 | j3)) * 1128) + (((~(longValue13 | (-937844339))) | (~(j2 | 937844338))) * 564) + 1933279242;
                                                    if (((((int) (j41 >> 32)) & (((((~(i29 | (-136331275))) | (~((-1079356678) | i))) * 988) - 964620154) + (((~(1642052933 | i)) | (-1778384208) | (~(i29 | (-1079356678)))) * 988))) | (((int) j41) & (((((~(i29 | (-1403996070))) | (~(i29 | (-1453744817)))) * (-867)) - 1972008908) + (((~((-1403996070) | i)) | 1386627744 | (~((-1453744817) | i))) * (-1734)) + (((~(i29 | (-1386627745))) | (~((-17368326) | i)) | (~((-67117073) | i))) * 867)))) != 0) {
                                                        break;
                                                    }
                                                }
                                                i17++;
                                                strArr3 = strArr4;
                                            }
                                        }
                                        if (i17 >= 0 && (i18 = i ^ (i17 + 130)) != i) {
                                            java.lang.Object[] objArr116 = {new int[]{i}, new int[]{i18}, null, null, new int[1]};
                                            java.lang.Object[] objArr117 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(i | (-1310682159))) | (-740163940)) * (-964)) - 2020372935) + (((~(i29 | (-1310682159))) | 1107389452) * (-964)))};
                                            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj2 == null) {
                                                java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 50, 2713 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.os.Process.myTid() >> 22));
                                                java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                b((byte) (-$$a[16]), r3[18], 653, objArr118);
                                                obj2 = cls29.getMethod((java.lang.String) objArr118[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                                            }
                                            ((int[]) objArr116[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr117)).intValue();
                                            return objArr116;
                                        }
                                    }
                                    java.lang.Object[] objArr119 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1503, (char) (47013 - android.text.TextUtils.indexOf(str3, str3, 0, 0)), 13 - android.text.TextUtils.indexOf(str3, str3), objArr119);
                                    java.lang.String intern35 = ((java.lang.String) objArr119[0]).intern();
                                    java.lang.Object[] objArr120 = new java.lang.Object[1];
                                    a(android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1517, (char) android.view.View.resolveSize(0, 0), android.graphics.Color.argb(0, 0, 0, 0) + 5, objArr120);
                                    java.lang.String[] strArr9 = {intern35, ((java.lang.String) objArr120[0]).intern()};
                                    java.lang.Object[] objArr121 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1521, (char) android.text.TextUtils.indexOf(str3, str3), 15 - android.text.TextUtils.getCapsMode(str3, 0, 0), objArr121);
                                    java.lang.String intern36 = ((java.lang.String) objArr121[0]).intern();
                                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                                    a((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1536, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), android.text.TextUtils.indexOf(str3, str3) + 19, objArr122);
                                    java.lang.String intern37 = ((java.lang.String) objArr122[0]).intern();
                                    java.lang.Object[] objArr123 = new java.lang.Object[1];
                                    a(1554 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.text.TextUtils.indexOf(str3, str3, 0), 14 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr123);
                                    java.lang.String[] strArr10 = {intern36, intern37, ((java.lang.String) objArr123[0]).intern()};
                                    java.lang.Object[] objArr124 = new java.lang.Object[1];
                                    a(android.view.View.MeasureSpec.getSize(0) + 1569, (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 62217), 21 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr124);
                                    java.lang.String intern38 = ((java.lang.String) objArr124[0]).intern();
                                    java.lang.Object[] objArr125 = new java.lang.Object[1];
                                    a(android.graphics.Color.blue(0) + 1590, (char) (android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), 10 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr125);
                                    java.lang.String[] strArr11 = {intern38, ((java.lang.String) objArr125[0]).intern()};
                                    java.lang.Object[] objArr126 = new java.lang.Object[1];
                                    a(1600 - android.view.View.MeasureSpec.getSize(0), (char) (android.text.TextUtils.getOffsetAfter(str3, 0) + 17361), 12 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr126);
                                    c = 0;
                                    java.lang.String intern39 = ((java.lang.String) objArr126[0]).intern();
                                    java.lang.Object[] objArr127 = new java.lang.Object[1];
                                    a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 337, (char) android.text.TextUtils.indexOf(str3, str3, 0, 0), 5 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr127);
                                    java.lang.String[] strArr12 = {intern39, ((java.lang.String) objArr127[0]).intern()};
                                    java.lang.Object[] objArr128 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1611, (char) (8435 - android.view.Gravity.getAbsoluteGravity(0, 0)), 27 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr128);
                                    java.lang.String intern40 = ((java.lang.String) objArr128[0]).intern();
                                    java.lang.Object[] objArr129 = new java.lang.Object[1];
                                    a(1590 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) android.view.View.getDefaultSize(0, 0), 10 - android.text.TextUtils.indexOf(str3, str3, 0, 0), objArr129);
                                    java.lang.String[][] strArr13 = {strArr9, strArr10, strArr11, strArr12, new java.lang.String[]{intern40, ((java.lang.String) objArr129[0]).intern()}};
                                    int i43 = -1;
                                    i14 = 0;
                                    while (true) {
                                        if (i14 < 5) {
                                            i15 = i;
                                            break;
                                        }
                                        java.lang.String[] strArr14 = strArr13[i14];
                                        java.lang.String str12 = strArr14[c];
                                        java.lang.String[] strArr15 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr14, 1, strArr14.length);
                                        int length = strArr15.length;
                                        int i44 = 0;
                                        while (i44 < length) {
                                            int i45 = i43 + 1;
                                            java.lang.Object[] objArr130 = {str12, strArr15[i44]};
                                            java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                            if (obj30 == null) {
                                                java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(38 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 2213, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1));
                                                byte b18 = (byte) ($$a[16] + 1);
                                                strArr2 = strArr13;
                                                java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                b((short) 35, b18, b18, objArr131);
                                                obj30 = cls30.getMethod((java.lang.String) objArr131[0], java.lang.String.class, java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj30);
                                            } else {
                                                strArr2 = strArr13;
                                            }
                                            long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj30).invoke(null, objArr130)).longValue();
                                            long j42 = ~longValue14;
                                            java.lang.String[] strArr16 = strArr15;
                                            long j43 = ((((((-987) * longValue14) + 515128472990L) + (((~((j42 | j2) | 520857910)) | (~((longValue14 | 520857910) | j3))) * 988)) + ((520857910 | j42) * (-988))) + (((~(longValue14 | (j2 | 520857910))) | ((~((-520857911) | j42)) | (~(j42 | j3)))) * 988)) - 1256232512;
                                            if (((((int) j43) & (((((i29 | 1331245053) * (-490)) - 2129119457) + (((~(240201645 | i)) | 1091043408) * 490)) - 1868385192)) | (((int) (j43 >> 32)) & ((((~(i29 | (-62272854))) | 1374953557) * (-235)) + 874555071 + (((~((-62272854) | i)) | 1374953557) * (-470)) + (((~((-33690881) | i)) | 1346371584) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE)))) != 0) {
                                                int i46 = AlternateContactlessPaymentDataJson + 81;
                                                valueOf = i46 % 128;
                                                i15 = i46 % 2 != 0 ? i ^ (i45 * 31318) : i ^ (i43 + 171);
                                            } else {
                                                i43 = i45;
                                                i44++;
                                                strArr15 = strArr16;
                                                strArr13 = strArr2;
                                            }
                                        }
                                        i14++;
                                        c = 0;
                                    }
                                    if (i15 == i) {
                                        valueOf = (AlternateContactlessPaymentDataJson + 41) % 128;
                                        java.lang.Object[] objArr132 = {new int[]{i}, new int[]{i15}, null, null, new int[1]};
                                        java.lang.Object[] objArr133 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(i29 | (-567505904))) | 1483340194) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) - 1481356134) + (((~(i29 | (-563216974))) | (~(2046557167 | i))) * (-519)) + (((~(i | 1483340194)) | 567505903) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))};
                                        java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj31 == null) {
                                            java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2713 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                            java.lang.Object[] objArr134 = new java.lang.Object[1];
                                            b((byte) (-$$a[16]), r2[18], 653, objArr134);
                                            obj31 = cls31.getMethod((java.lang.String) objArr134[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj31);
                                        }
                                        ((int[]) objArr132[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr133)).intValue();
                                        return objArr132;
                                    }
                                    try {
                                        java.lang.Object[] objArr135 = new java.lang.Object[1];
                                        a((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1639, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 12 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr135);
                                        intern = ((java.lang.String) objArr135[0]).intern();
                                        objArr2 = new java.lang.Object[1];
                                        a(android.view.View.resolveSize(0, 0) + 1652, (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 41765), 8 - android.graphics.Color.argb(0, 0, 0, 0), objArr2);
                                    } catch (java.lang.Exception unused3) {
                                        i16 = i ^ 151;
                                    }
                                    try {
                                        java.lang.Object[] objArr136 = {intern, ((java.lang.String) objArr2[0]).intern()};
                                        java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                        if (obj32 == null) {
                                            java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 2213 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                            byte b19 = (byte) ($$a[16] + 1);
                                            java.lang.Object[] objArr137 = new java.lang.Object[1];
                                            b((short) 35, b19, b19, objArr137);
                                            obj32 = cls32.getMethod((java.lang.String) objArr137[0], java.lang.String.class, java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj32);
                                        }
                                        long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj32).invoke(null, objArr136)).longValue();
                                        long j44 = ~longValue15;
                                        long j45 = ((((((-68) * longValue15) + 65042521180L) + (((~(((-929178875) | j44) | j3)) | (~((929178874 | longValue15) | j3))) * 69)) + (((~(longValue15 | j3)) | ((~((-929178875) | longValue15)) | (~(j3 | (-929178875))))) * (-69))) + ((~(929178874 | j44)) * 69)) - 1664553476;
                                        i16 = ((((int) (j45 >> 32)) & ((((((~(i29 | (-712311023))) | 724915388) * (-90)) + 1687905420) + (((~((-712311023) | i)) | (-729109759)) * (-45))) + ((((~((-724915389) | i)) | (-712311023)) | (~(i29 | 724915388))) * 45))) | (((int) j45) & ((((((~(i29 | (-1065288590))) | (~((-1792452297) | i))) * 1900) + (-1871736089)) + (((~(i29 | 1792452296)) | (~(1065288589 | i))) * (-950))) + (((~(1792452296 | i)) | (~(i29 | 1065288589))) * 950)))) != 0 ? i ^ 150 : i;
                                        if (i16 != i) {
                                            java.lang.Object[] objArr138 = {new int[]{i}, new int[]{i16}, null, null, new int[1]};
                                            java.lang.Object[] objArr139 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(i | (-704708745))) | 1342205189) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1250817888) + ((~(i29 | (-704708745))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))};
                                            java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj33 == null) {
                                                java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 2713 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                                                java.lang.Object[] objArr140 = new java.lang.Object[1];
                                                b((byte) (-$$a[16]), r2[18], 653, objArr140);
                                                obj33 = cls33.getMethod((java.lang.String) objArr140[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj33);
                                            }
                                            ((int[]) objArr138[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr139)).intValue();
                                            return objArr138;
                                        }
                                        java.lang.Object[] objArr141 = new java.lang.Object[1];
                                        a(1660 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.view.Gravity.getAbsoluteGravity(0, 0) + 47, objArr141);
                                        java.lang.Object[] objArr142 = {((java.lang.String) objArr141[0]).intern()};
                                        java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                        if (obj34 == null) {
                                            java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (-16774055) - android.graphics.Color.rgb(0, 0, 0), (char) (33100 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                                            byte b20 = (byte) ($$a[16] + 1);
                                            java.lang.Object[] objArr143 = new java.lang.Object[1];
                                            b((short) 35, b20, (short) (b20 | 618), objArr143);
                                            obj34 = cls34.getMethod((java.lang.String) objArr143[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj34);
                                        }
                                        long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj34).invoke(null, objArr142)).longValue();
                                        long j46 = ~longValue16;
                                        long j47 = j2 | (-685906244);
                                        long j48 = (((-885) * longValue16) - 1216111770612L) + (((~(j46 | j3)) | (~(685906243 | j46)) | (~(j47 | longValue16))) * 886) + (((~(j2 | longValue16)) | (-685906244)) * (-1772)) + ((~j47) * 886) + 1593376982;
                                        int i47 = (((((int) (j48 >> 32)) & ((((((~(i29 | 1494231411)) | (~(1363509473 | i))) | (~(i29 | (-1363509474)))) * 959) - 40762763) + ((((~(1494231411 | i)) | (~(i29 | 1363509473))) | (~((-1363509474) | i))) * 959))) | (((int) j48) & ((((((~(i29 | 501999540)) | (-1073737718)) * 446) - 384374209) + (((~((-571738178) | i)) | 138510848) * 446)) - 2145652372))) * 263) ^ i;
                                        if (i47 != i) {
                                            java.lang.Object[] objArr144 = {new int[]{i}, new int[]{i47}, null, null, new int[1]};
                                            java.lang.Object[] objArr145 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-1960120812) | i)) | (-1979538416)) * (-502)) - 110438177) + ((~(i29 | (-1888813130))) * (-502)) + (((~(i | (-90725287))) | (-1960120812)) * 502))};
                                            java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj35 == null) {
                                                java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 50, android.graphics.ImageFormat.getBitsPerPixel(0) + 2714, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                                java.lang.Object[] objArr146 = new java.lang.Object[1];
                                                b((byte) (-$$a[16]), r2[18], 653, objArr146);
                                                obj35 = cls35.getMethod((java.lang.String) objArr146[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj35);
                                            }
                                            ((int[]) objArr144[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj35).invoke(null, objArr145)).intValue();
                                            return objArr144;
                                        }
                                        java.lang.Object[] objArr147 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                        java.lang.Object[] objArr148 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~(988381019 | i)) | (-1062465079)) * (-465)) + 1854477541 + (((~((-1062465079) | i)) | 988381019) * 930) + ((i | (-85098533)) * 465))};
                                        java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj36 == null) {
                                            java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2713, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                                            java.lang.Object[] objArr149 = new java.lang.Object[1];
                                            b((byte) (-$$a[16]), r2[18], 653, objArr149);
                                            obj36 = cls36.getMethod((java.lang.String) objArr149[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj36);
                                        }
                                        ((int[]) objArr147[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr148)).intValue();
                                        return objArr147;
                                    } catch (java.lang.Throwable th2) {
                                        java.lang.Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                }
                            }
                            java.lang.Object[] objArr150 = new java.lang.Object[1];
                            a((android.view.ViewConfiguration.getTapTimeout() >> 16) + 310, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 23 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr150);
                            java.lang.String intern41 = ((java.lang.String) objArr150[0]).intern();
                            java.lang.Object[] objArr151 = new java.lang.Object[1];
                            a(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 365, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 53618), android.view.View.getDefaultSize(0, 0) + 10, objArr151);
                            java.lang.String intern42 = ((java.lang.String) objArr151[0]).intern();
                            java.lang.Object[] objArr152 = new java.lang.Object[1];
                            a((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 374, (char) android.view.View.resolveSizeAndState(0, 0, 0), 8 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr152);
                            java.lang.String intern43 = ((java.lang.String) objArr152[0]).intern();
                            java.lang.Object[] objArr153 = new java.lang.Object[1];
                            a(android.graphics.Color.green(0) + 382, (char) android.graphics.Color.red(0), android.graphics.Color.rgb(0, 0, 0) + 16777224, objArr153);
                            java.lang.String[] strArr17 = {intern41, intern42, intern43, ((java.lang.String) objArr153[0]).intern()};
                            java.lang.Object[] objArr154 = new java.lang.Object[1];
                            a(390 - android.text.TextUtils.indexOf(str9, str9, 0), (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 10284), 18 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr154);
                            java.lang.String intern44 = ((java.lang.String) objArr154[0]).intern();
                            java.lang.Object[] objArr155 = new java.lang.Object[1];
                            a(android.view.KeyEvent.getDeadChar(0, 0) + 407, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 15164), 7 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr155);
                            java.lang.String intern45 = ((java.lang.String) objArr155[0]).intern();
                            java.lang.Object[] objArr156 = new java.lang.Object[1];
                            a(414 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7, objArr156);
                            java.lang.String intern46 = ((java.lang.String) objArr156[0]).intern();
                            java.lang.Object[] objArr157 = new java.lang.Object[1];
                            a(android.view.KeyEvent.getDeadChar(0, 0) + 421, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), android.graphics.ImageFormat.getBitsPerPixel(0) + 12, objArr157);
                            java.lang.String intern47 = ((java.lang.String) objArr157[0]).intern();
                            java.lang.Object[] objArr158 = new java.lang.Object[1];
                            a((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 432, (char) (android.text.TextUtils.getOffsetBefore(str9, 0) + 27245), 14 - android.view.View.MeasureSpec.getMode(0), objArr158);
                            java.lang.String[] strArr18 = {intern44, intern45, intern46, intern47, ((java.lang.String) objArr158[0]).intern()};
                            java.lang.Object[] objArr159 = new java.lang.Object[1];
                            a(446 - android.text.TextUtils.getCapsMode(str9, 0, 0), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16, objArr159);
                            java.lang.String intern48 = ((java.lang.String) objArr159[0]).intern();
                            java.lang.Object[] objArr160 = new java.lang.Object[1];
                            a(461 - android.os.Process.getGidForName(str9), (char) android.graphics.Color.red(0), android.graphics.Color.red(0) + 3, objArr160);
                            java.lang.String intern49 = ((java.lang.String) objArr160[0]).intern();
                            java.lang.Object[] objArr161 = new java.lang.Object[1];
                            a(473 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (7050 - (android.os.Process.myPid() >> 22)), android.graphics.Color.green(0) + 22, objArr161);
                            java.lang.String intern50 = ((java.lang.String) objArr161[0]).intern();
                            java.lang.Object[] objArr162 = new java.lang.Object[1];
                            a(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.visa.cbp.getEncExpo.onUnminimized, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 25 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr162);
                            java.lang.String intern51 = ((java.lang.String) objArr162[0]).intern();
                            java.lang.Object[] objArr163 = new java.lang.Object[1];
                            a(520 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 28 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr163);
                            j2 = j;
                            j3 = j14;
                            int i48 = 2;
                            java.lang.String[] strArr19 = {intern48, intern49, str2, intern50, intern51, ((java.lang.String) objArr163[0]).intern()};
                            java.lang.Object[] objArr164 = new java.lang.Object[1];
                            a(android.view.View.combineMeasuredStates(0, 0) + 548, (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 28336), android.text.TextUtils.indexOf(str9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 12, objArr164);
                            java.lang.String intern52 = ((java.lang.String) objArr164[0]).intern();
                            java.lang.Object[] objArr165 = new java.lang.Object[1];
                            a(559 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 8 - android.text.TextUtils.getOffsetAfter(str9, 0), objArr165);
                            java.lang.String intern53 = ((java.lang.String) objArr165[0]).intern();
                            java.lang.Object[] objArr166 = new java.lang.Object[1];
                            a(567 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) android.text.TextUtils.getCapsMode(str9, 0, 0), 7 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr166);
                            java.lang.String intern54 = ((java.lang.String) objArr166[0]).intern();
                            java.lang.Object[] objArr167 = new java.lang.Object[1];
                            a(573 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 6 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr167);
                            java.lang.String[] strArr20 = {intern52, intern53, intern54, ((java.lang.String) objArr167[0]).intern()};
                            java.lang.Object[] objArr168 = new java.lang.Object[1];
                            a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 579, (char) (2027 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 16 - (android.os.Process.myPid() >> 22), objArr168);
                            java.lang.String intern55 = ((java.lang.String) objArr168[0]).intern();
                            java.lang.Object[] objArr169 = new java.lang.Object[1];
                            a(414 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) android.graphics.Color.red(0), android.graphics.ImageFormat.getBitsPerPixel(0) + 8, objArr169);
                            java.lang.String intern56 = ((java.lang.String) objArr169[0]).intern();
                            java.lang.Object[] objArr170 = new java.lang.Object[1];
                            a(381 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((-1) - android.text.TextUtils.indexOf(str9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 8 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr170);
                            java.lang.String[] strArr21 = {intern55, intern56, ((java.lang.String) objArr170[0]).intern()};
                            java.lang.Object[] objArr171 = new java.lang.Object[1];
                            a(android.text.TextUtils.getCapsMode(str9, 0, 0) + 595, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.text.TextUtils.lastIndexOf(str9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 15, objArr171);
                            java.lang.String intern57 = ((java.lang.String) objArr171[0]).intern();
                            java.lang.Object[] objArr172 = new java.lang.Object[1];
                            a(android.view.KeyEvent.getDeadChar(0, 0) + androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_POLAR_RELATIVETO, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr172);
                            java.lang.String[] strArr22 = {intern57, ((java.lang.String) objArr172[0]).intern()};
                            java.lang.Object[] objArr173 = new java.lang.Object[1];
                            a((android.view.ViewConfiguration.getTapTimeout() >> 16) + androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), 8 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr173);
                            java.lang.String intern58 = ((java.lang.String) objArr173[0]).intern();
                            java.lang.Object[] objArr174 = new java.lang.Object[1];
                            a(619 - android.view.View.MeasureSpec.getMode(0), (char) (android.view.View.getDefaultSize(0, 0) + 56015), 1 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr174);
                            java.lang.String[] strArr23 = {intern58, ((java.lang.String) objArr174[0]).intern()};
                            java.lang.Object[] objArr175 = new java.lang.Object[1];
                            a((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 620, (char) (android.os.Process.getGidForName(str9) + 9787), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, objArr175);
                            java.lang.String intern59 = ((java.lang.String) objArr175[0]).intern();
                            java.lang.Object[] objArr176 = new java.lang.Object[1];
                            a(462 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) android.view.View.MeasureSpec.getSize(0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 3, objArr176);
                            java.lang.String intern60 = ((java.lang.String) objArr176[0]).intern();
                            java.lang.Object[] objArr177 = new java.lang.Object[1];
                            a(android.text.TextUtils.getTrimmedLength(str9) + 407, (char) (15165 - android.widget.ExpandableListView.getPackedPositionType(0L)), (android.os.Process.myTid() >> 22) + 7, objArr177);
                            java.lang.String intern61 = ((java.lang.String) objArr177[0]).intern();
                            java.lang.Object[] objArr178 = new java.lang.Object[1];
                            a(635 - android.view.MotionEvent.axisFromString(str9), (char) (47993 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), 7 - android.text.TextUtils.indexOf(str9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr178);
                            java.lang.String intern62 = ((java.lang.String) objArr178[0]).intern();
                            java.lang.Object[] objArr179 = new java.lang.Object[1];
                            a(421 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 11 - android.graphics.Color.alpha(0), objArr179);
                            java.lang.String intern63 = ((java.lang.String) objArr179[0]).intern();
                            java.lang.Object[] objArr180 = new java.lang.Object[1];
                            a((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 431, (char) (27245 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), 14 - android.text.TextUtils.indexOf(str9, str9), objArr180);
                            java.lang.String[] strArr24 = {intern59, intern60, intern61, intern62, intern63, ((java.lang.String) objArr180[0]).intern()};
                            java.lang.Object[] objArr181 = new java.lang.Object[1];
                            a(android.text.TextUtils.indexOf(str9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 645, (char) (56670 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 21 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr181);
                            java.lang.String intern64 = ((java.lang.String) objArr181[0]).intern();
                            java.lang.Object[] objArr182 = new java.lang.Object[1];
                            a(663 - android.text.TextUtils.indexOf(str9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (2099 - android.view.View.resolveSize(0, 0)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 19, objArr182);
                            java.lang.String intern65 = ((java.lang.String) objArr182[0]).intern();
                            java.lang.Object[] objArr183 = new java.lang.Object[1];
                            a(android.view.MotionEvent.axisFromString(str9) + 684, (char) android.text.TextUtils.indexOf(str9, str9, 0, 0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 30, objArr183);
                            java.lang.String intern66 = ((java.lang.String) objArr183[0]).intern();
                            java.lang.Object[] objArr184 = new java.lang.Object[1];
                            a(714 - android.graphics.Color.argb(0, 0, 0, 0), (char) (13412 - android.view.View.getDefaultSize(0, 0)), 26 - android.view.View.resolveSize(0, 0), objArr184);
                            java.lang.String intern67 = ((java.lang.String) objArr184[0]).intern();
                            java.lang.Object[] objArr185 = new java.lang.Object[1];
                            a((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 740, (char) (android.os.Process.myTid() >> 22), 23 - android.text.TextUtils.getCapsMode(str9, 0, 0), objArr185);
                            java.lang.String intern68 = ((java.lang.String) objArr185[0]).intern();
                            java.lang.Object[] objArr186 = new java.lang.Object[1];
                            a(763 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (28973 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), android.view.View.MeasureSpec.getMode(0) + 33, objArr186);
                            java.lang.String str13 = str9;
                            java.lang.String[] strArr25 = {intern64, intern65, intern66, intern67, intern68, ((java.lang.String) objArr186[0]).intern(), str2};
                            java.lang.Object[] objArr187 = new java.lang.Object[1];
                            a((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 796, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 13, objArr187);
                            java.lang.String intern69 = ((java.lang.String) objArr187[0]).intern();
                            java.lang.Object[] objArr188 = new java.lang.Object[1];
                            a(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 375, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), 7 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr188);
                            java.lang.String[] strArr26 = {intern69, ((java.lang.String) objArr188[0]).intern()};
                            java.lang.Object[] objArr189 = new java.lang.Object[1];
                            a(809 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.view.KeyEvent.getDeadChar(0, 0) + 23496), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 30, objArr189);
                            java.lang.String intern70 = ((java.lang.String) objArr189[0]).intern();
                            java.lang.Object[] objArr190 = new java.lang.Object[1];
                            a(840 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (42738 - android.graphics.ImageFormat.getBitsPerPixel(0)), 11 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr190);
                            java.lang.String[] strArr27 = {intern70, ((java.lang.String) objArr190[0]).intern()};
                            java.lang.Object[] objArr191 = new java.lang.Object[1];
                            a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 850, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 19, objArr191);
                            java.lang.String intern71 = ((java.lang.String) objArr191[0]).intern();
                            java.lang.Object[] objArr192 = new java.lang.Object[1];
                            a(869 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.view.KeyEvent.keyCodeFromString(str13) + 8678), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '+', objArr192);
                            java.lang.String[] strArr28 = {intern71, ((java.lang.String) objArr192[0]).intern()};
                            java.lang.Object[] objArr193 = new java.lang.Object[1];
                            a((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 873, (char) (64641 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 19, objArr193);
                            java.lang.String[] strArr29 = {((java.lang.String) objArr193[0]).intern()};
                            java.lang.Object[] objArr194 = new java.lang.Object[1];
                            a((android.os.Process.myPid() >> 22) + 893, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 15 - android.text.TextUtils.indexOf(str13, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr194);
                            java.lang.String[] strArr30 = {((java.lang.String) objArr194[0]).intern()};
                            java.lang.Object[] objArr195 = new java.lang.Object[1];
                            a(android.graphics.Color.blue(0) + 909, (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 54519), 19 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr195);
                            java.lang.String[] strArr31 = {((java.lang.String) objArr195[0]).intern()};
                            java.lang.Object[] objArr196 = new java.lang.Object[1];
                            a((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + com.google.zxing.pdf417.PDF417Common.MAX_CODEWORDS_IN_BARCODE, (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 38717), 19 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr196);
                            java.lang.String[] strArr32 = {((java.lang.String) objArr196[0]).intern()};
                            java.lang.Object[] objArr197 = new java.lang.Object[1];
                            a(947 - android.graphics.Color.red(0), (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 41646), 23 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr197);
                            java.lang.String[] strArr33 = {((java.lang.String) objArr197[0]).intern()};
                            java.lang.Object[] objArr198 = new java.lang.Object[1];
                            a(970 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) android.view.KeyEvent.normalizeMetaState(0), android.view.View.resolveSize(0, 0) + 21, objArr198);
                            java.lang.String[] strArr34 = {((java.lang.String) objArr198[0]).intern()};
                            java.lang.Object[] objArr199 = new java.lang.Object[1];
                            a(android.text.TextUtils.indexOf(str13, str13, 0) + 991, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), android.text.TextUtils.indexOf(str13, str13, 0, 0) + 24, objArr199);
                            java.lang.String str14 = str2;
                            java.lang.String[] strArr35 = {((java.lang.String) objArr199[0]).intern(), str14};
                            java.lang.Object[] objArr200 = new java.lang.Object[1];
                            a(1014 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.graphics.Color.blue(0), 28 - android.view.KeyEvent.getDeadChar(0, 0), objArr200);
                            java.lang.String[] strArr36 = {((java.lang.String) objArr200[0]).intern(), str14};
                            java.lang.Object[] objArr201 = new java.lang.Object[1];
                            a(1044 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 27, objArr201);
                            java.lang.String[] strArr37 = {((java.lang.String) objArr201[0]).intern(), str14};
                            java.lang.Object[] objArr202 = new java.lang.Object[1];
                            a(android.text.TextUtils.getTrimmedLength(str13) + 1070, (char) (9679 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31, objArr202);
                            java.lang.String[] strArr38 = {((java.lang.String) objArr202[0]).intern(), str14};
                            java.lang.Object[] objArr203 = new java.lang.Object[1];
                            a(android.graphics.Color.red(0) + 1101, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 26, objArr203);
                            java.lang.String[] strArr39 = {((java.lang.String) objArr203[0]).intern(), str14};
                            java.lang.Object[] objArr204 = new java.lang.Object[1];
                            a(1129 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 32 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr204);
                            java.lang.String[][] strArr40 = {strArr17, strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, new java.lang.String[]{((java.lang.String) objArr204[0]).intern(), str14}};
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            int i49 = i;
                            int i50 = 0;
                            int i51 = 0;
                            while (i50 < 24) {
                                java.lang.String[] strArr41 = strArr40[i50];
                                java.lang.Object[] objArr205 = {strArr41[0]};
                                java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj37 == null) {
                                    java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.indexOf(str13, str13, 0), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1921, (char) ((-1) - android.text.TextUtils.lastIndexOf(str13, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                    byte b21 = (byte) ($$a[16] + 1);
                                    java.lang.Object[] objArr206 = new java.lang.Object[1];
                                    b((short) 35, b21, b21, objArr206);
                                    obj37 = cls37.getMethod((java.lang.String) objArr206[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj37);
                                }
                                java.lang.String str15 = (java.lang.String) ((java.lang.reflect.Method) obj37).invoke(null, objArr205);
                                java.lang.String[] strArr42 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr41, 1, strArr41.length);
                                if (str15 == null || str15.length() == 0) {
                                    str4 = str13;
                                    strArr = strArr40;
                                    arrayList = arrayList3;
                                    i12 = i50;
                                } else {
                                    if (strArr41.length != 1) {
                                        int i52 = valueOf + 109;
                                        AlternateContactlessPaymentDataJson = i52 % 128;
                                        if (i52 % 2 == 0) {
                                            java.lang.Object[] objArr207 = {str15, strArr42};
                                            java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                            if (obj38 == null) {
                                                java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 42, 2880 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((-1) - android.text.TextUtils.indexOf(str13, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                                byte b22 = (byte) ($$a[16] + 1);
                                                java.lang.Object[] objArr208 = new java.lang.Object[1];
                                                b((short) 35, b22, b22, objArr208);
                                                obj38 = cls38.getMethod((java.lang.String) objArr208[0], java.lang.String.class, java.lang.String[].class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj38);
                                            }
                                            long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) obj38).invoke(null, objArr207)).longValue();
                                            long j49 = ~longValue17;
                                            strArr = strArr40;
                                            long j50 = longValue17 | 438885145;
                                            str5 = str13;
                                            arrayList2 = arrayList3;
                                            i12 = i50;
                                            long j51 = (((((longValue17 * (-751)) + 329602744646L) + (((~(j49 | 438885145)) | (~(j3 | 438885145))) * 1504)) + ((~(j50 | j3)) * (-1504))) + (((~j50) | (~((-438885146) | j49))) * 752)) - 1589826633;
                                            int i53 = (int) (j51 << 112);
                                            int i54 = ~((-39338631) | i);
                                            if (((((int) j51) & (((((~(i29 | (-956674428))) | 1901066458) * (-90)) - 1687905466) + (((~((-956674428) | i)) | (-2035284476)) * (-45)) + (((~((-1901066459) | i)) | (-956674428) | (~(i29 | 1901066458))) * 45))) | (((((((~(i29 | 41772678)) | 1476565041) | i54) * (-252)) - 130538010) + ((i54 | (~(i29 | 1518337719))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE)) & i53)) != 0) {
                                            }
                                            str4 = str5;
                                            arrayList = arrayList2;
                                        } else {
                                            java.lang.String str16 = str13;
                                            strArr = strArr40;
                                            arrayList2 = arrayList3;
                                            i12 = i50;
                                            java.lang.Object[] objArr209 = {str15, strArr42};
                                            java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                            if (obj39 == null) {
                                                str6 = str16;
                                                java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 43, android.text.TextUtils.indexOf(str6, str6) + 2880, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                byte b23 = (byte) ($$a[16] + 1);
                                                java.lang.Object[] objArr210 = new java.lang.Object[1];
                                                b((short) 35, b23, b23, objArr210);
                                                obj39 = cls39.getMethod((java.lang.String) objArr210[0], java.lang.String.class, java.lang.String[].class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj39);
                                            } else {
                                                str6 = str16;
                                            }
                                            long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) obj39).invoke(null, objArr209)).longValue();
                                            long j52 = ~longValue18;
                                            long j53 = ~(longValue18 | j3);
                                            str5 = str6;
                                            long j54 = ((((((-195) * longValue18) + 523863629098L) + (((~(j52 | (-1339804678))) | j53) * (-196))) + ((longValue18 | (-1339804678)) * 392)) + (((~(1339804677 | j52)) | j53) * 196)) - 688907101;
                                        }
                                    } else {
                                        str5 = str13;
                                        strArr = strArr40;
                                        arrayList2 = arrayList3;
                                        i12 = i50;
                                    }
                                    i51++;
                                    i49 = i ^ (i12 + 10);
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append(str15);
                                    str4 = str5;
                                    java.lang.Object[] objArr211 = new java.lang.Object[1];
                                    a(1160 - android.text.TextUtils.getCapsMode(str4, 0, 0), (char) (42959 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 1 - android.graphics.Color.alpha(0), objArr211);
                                    sb.append(((java.lang.String) objArr211[0]).intern());
                                    sb.append(str15);
                                    java.lang.String obj40 = sb.toString();
                                    arrayList = arrayList2;
                                    arrayList.add(obj40);
                                }
                                i50 = i12 + 1;
                                strArr40 = strArr;
                                arrayList3 = arrayList;
                                str13 = str4;
                                i48 = 2;
                            }
                            int i55 = i48;
                            str3 = str13;
                            java.util.ArrayList arrayList4 = arrayList3;
                            if (i51 > i55) {
                                AlternateContactlessPaymentDataJson = (valueOf + 19) % 128;
                                objArr = new java.lang.Object[]{new int[]{i}, new int[]{i49}, arrayList4, null, new int[1]};
                                java.lang.Object[] objArr212 = {num, num, java.lang.Integer.valueOf((((~(i29 | (-17723811))) | (-2033122288)) * (-591)) + 656287182 + (((-17723811) | i) * 591))};
                                java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj41 == null) {
                                    java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2713, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                    java.lang.Object[] objArr213 = new java.lang.Object[1];
                                    b((byte) (-$$a[16]), r6[18], 653, objArr213);
                                    obj41 = cls40.getMethod((java.lang.String) objArr213[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj41);
                                }
                                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj41).invoke(null, objArr212)).intValue();
                                i10 = 0;
                                ((int[]) objArr[4])[0] = intValue;
                            } else {
                                objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                                java.lang.Object[] objArr214 = {num, num, java.lang.Integer.valueOf((((1242213131 | i) * 140) - 631981359) + (((~(i29 | 1242213131)) | 808468612) * (-280)) + (((~(i29 | 808632966)) | 1242048777 | (~((-808468613) | i))) * 140))};
                                java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj42 == null) {
                                    java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf(str3, str3), 2712 - android.os.Process.getGidForName(str3), (char) android.view.View.MeasureSpec.getSize(0));
                                    java.lang.Object[] objArr215 = new java.lang.Object[1];
                                    b((byte) (-$$a[16]), r6[18], 653, objArr215);
                                    obj42 = cls41.getMethod((java.lang.String) objArr215[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj42);
                                }
                                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj42).invoke(null, objArr214)).intValue();
                                i10 = 0;
                                ((int[]) objArr[4])[0] = intValue2;
                            }
                            int i56 = ((int[]) objArr[1])[i10];
                            if (i56 != i) {
                                int[] iArr = new int[1];
                                int[] iArr2 = new int[1];
                                java.util.List list = (java.util.List) objArr[2];
                                iArr[i10] = i;
                                iArr2[i10] = i56;
                                java.lang.Object[] objArr216 = {iArr, iArr2, list, null, new int[1]};
                                java.lang.Object[] objArr217 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~(i29 | (-851437059))) | 37586434) | (~(i29 | (-1199409040)))) * (-1136)) - 1299675319) + (((~((-851437059) | i)) | (~((-1199409040) | i)) | (~(i29 | 2013259663))) * (-568)) + (((~(i | (-37586435))) | (~(i29 | 851437058)) | (~(i29 | 1199409039))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))};
                                java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj43 == null) {
                                    java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2713, (char) android.graphics.Color.green(0));
                                    java.lang.Object[] objArr218 = new java.lang.Object[1];
                                    b((byte) (-$$a[16]), r2[18], 653, objArr218);
                                    obj43 = cls42.getMethod((java.lang.String) objArr218[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj43);
                                }
                                ((int[]) objArr216[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj43).invoke(null, objArr217)).intValue();
                                return objArr216;
                            }
                            i11 = i10;
                            java.lang.Object[] objArr872 = new java.lang.Object[1];
                            a(446 - android.view.View.MeasureSpec.getMode(i11), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 16 - android.view.View.resolveSize(i11, i11), objArr872);
                            java.lang.Object[] objArr882 = {((java.lang.String) objArr872[i11]).intern()};
                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj == null) {
                            }
                            invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr882);
                            if (invoke != null) {
                            }
                            if (i13 != 1986687685) {
                                java.lang.Object[] objArr922 = new java.lang.Object[1];
                                a(android.graphics.Color.alpha(0) + 1161, (char) (12817 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14, objArr922);
                                java.lang.String intern172 = ((java.lang.String) objArr922[0]).intern();
                                java.lang.Object[] objArr932 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1174, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 26 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr932);
                                java.lang.String intern182 = ((java.lang.String) objArr932[0]).intern();
                                java.lang.Object[] objArr942 = new java.lang.Object[1];
                                a(android.view.View.MeasureSpec.getSize(0) + 1201, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), 17 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr942);
                                java.lang.String intern192 = ((java.lang.String) objArr942[0]).intern();
                                java.lang.Object[] objArr952 = new java.lang.Object[1];
                                a(1219 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 56165), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 17, objArr952);
                                java.lang.String intern202 = ((java.lang.String) objArr952[0]).intern();
                                java.lang.Object[] objArr962 = new java.lang.Object[1];
                                a(1235 - android.text.TextUtils.indexOf(str3, str3, 0, 0), (char) (16056 - android.view.View.resolveSize(0, 0)), 15 - android.graphics.Color.alpha(0), objArr962);
                                java.lang.String intern212 = ((java.lang.String) objArr962[0]).intern();
                                java.lang.Object[] objArr972 = new java.lang.Object[1];
                                a(1251 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (android.os.Process.myTid() >> 22) + 37, objArr972);
                                java.lang.String intern222 = ((java.lang.String) objArr972[0]).intern();
                                java.lang.Object[] objArr982 = new java.lang.Object[1];
                                a(android.view.KeyEvent.keyCodeFromString(str3) + 1287, (char) (56696 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 12, objArr982);
                                java.lang.String intern232 = ((java.lang.String) objArr982[0]).intern();
                                java.lang.Object[] objArr992 = new java.lang.Object[1];
                                a(1299 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 13 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr992);
                                java.lang.String intern242 = ((java.lang.String) objArr992[0]).intern();
                                java.lang.Object[] objArr1002 = new java.lang.Object[1];
                                a(android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1313, (char) android.view.View.MeasureSpec.getSize(0), 21 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr1002);
                                java.lang.String intern252 = ((java.lang.String) objArr1002[0]).intern();
                                java.lang.Object[] objArr1012 = new java.lang.Object[1];
                                a(1334 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) android.view.View.MeasureSpec.getMode(0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 30, objArr1012);
                                java.lang.String intern262 = ((java.lang.String) objArr1012[0]).intern();
                                java.lang.Object[] objArr1022 = new java.lang.Object[1];
                                a(1364 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.os.Process.myTid() >> 22) + 12, objArr1022);
                                java.lang.String intern272 = ((java.lang.String) objArr1022[0]).intern();
                                java.lang.Object[] objArr1032 = new java.lang.Object[1];
                                a(android.graphics.Color.green(0) + 1377, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 63737), android.graphics.Color.alpha(0) + 12, objArr1032);
                                java.lang.String intern282 = ((java.lang.String) objArr1032[0]).intern();
                                java.lang.Object[] objArr1042 = new java.lang.Object[1];
                                a(1389 - android.text.TextUtils.indexOf(str3, str3), (char) (android.view.View.MeasureSpec.getMode(0) + 10830), 12 - android.view.View.MeasureSpec.getMode(0), objArr1042);
                                java.lang.String intern292 = ((java.lang.String) objArr1042[0]).intern();
                                java.lang.Object[] objArr1052 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1401, (char) (android.view.KeyEvent.keyCodeFromString(str3) + 50198), 13 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr1052);
                                java.lang.String intern302 = ((java.lang.String) objArr1052[0]).intern();
                                java.lang.Object[] objArr1062 = new java.lang.Object[1];
                                a((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1413, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 13 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr1062);
                                java.lang.String intern312 = ((java.lang.String) objArr1062[0]).intern();
                                java.lang.Object[] objArr1072 = new java.lang.Object[1];
                                a(1425 - (android.os.Process.myTid() >> 22), (char) (android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 22182), android.text.TextUtils.indexOf(str3, str3) + 14, objArr1072);
                                java.lang.String intern322 = ((java.lang.String) objArr1072[0]).intern();
                                java.lang.Object[] objArr1082 = new java.lang.Object[1];
                                a(1439 - (android.os.Process.myPid() >> 22), (char) (8282 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), 12 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr1082);
                                java.lang.String intern332 = ((java.lang.String) objArr1082[0]).intern();
                                java.lang.Object[] objArr1092 = new java.lang.Object[1];
                                a(1451 - android.text.TextUtils.getOffsetBefore(str3, 0), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 23 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr1092);
                                java.lang.String intern342 = ((java.lang.String) objArr1092[0]).intern();
                                java.lang.Object[] objArr1102 = new java.lang.Object[1];
                                a(android.view.View.combineMeasuredStates(0, 0) + 1475, (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12616), android.text.TextUtils.getTrimmedLength(str3) + 28, objArr1102);
                                strArr3 = new java.lang.String[]{intern172, intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, intern292, intern302, intern312, intern322, intern332, intern342, ((java.lang.String) objArr1102[0]).intern()};
                                i17 = 0;
                                while (true) {
                                    if (i17 < 19) {
                                    }
                                    i17++;
                                    strArr3 = strArr4;
                                }
                                if (i17 >= 0) {
                                    java.lang.Object[] objArr1162 = {new int[]{i}, new int[]{i18}, null, null, new int[1]};
                                    java.lang.Object[] objArr1172 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(i | (-1310682159))) | (-740163940)) * (-964)) - 2020372935) + (((~(i29 | (-1310682159))) | 1107389452) * (-964)))};
                                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj2 == null) {
                                    }
                                    ((int[]) objArr1162[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr1172)).intValue();
                                    return objArr1162;
                                }
                            }
                            java.lang.Object[] objArr1192 = new java.lang.Object[1];
                            a((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1503, (char) (47013 - android.text.TextUtils.indexOf(str3, str3, 0, 0)), 13 - android.text.TextUtils.indexOf(str3, str3), objArr1192);
                            java.lang.String intern352 = ((java.lang.String) objArr1192[0]).intern();
                            java.lang.Object[] objArr1202 = new java.lang.Object[1];
                            a(android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1517, (char) android.view.View.resolveSize(0, 0), android.graphics.Color.argb(0, 0, 0, 0) + 5, objArr1202);
                            java.lang.String[] strArr92 = {intern352, ((java.lang.String) objArr1202[0]).intern()};
                            java.lang.Object[] objArr1212 = new java.lang.Object[1];
                            a((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1521, (char) android.text.TextUtils.indexOf(str3, str3), 15 - android.text.TextUtils.getCapsMode(str3, 0, 0), objArr1212);
                            java.lang.String intern362 = ((java.lang.String) objArr1212[0]).intern();
                            java.lang.Object[] objArr1222 = new java.lang.Object[1];
                            a((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1536, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), android.text.TextUtils.indexOf(str3, str3) + 19, objArr1222);
                            java.lang.String intern372 = ((java.lang.String) objArr1222[0]).intern();
                            java.lang.Object[] objArr1232 = new java.lang.Object[1];
                            a(1554 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.text.TextUtils.indexOf(str3, str3, 0), 14 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr1232);
                            java.lang.String[] strArr102 = {intern362, intern372, ((java.lang.String) objArr1232[0]).intern()};
                            java.lang.Object[] objArr1242 = new java.lang.Object[1];
                            a(android.view.View.MeasureSpec.getSize(0) + 1569, (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 62217), 21 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr1242);
                            java.lang.String intern382 = ((java.lang.String) objArr1242[0]).intern();
                            java.lang.Object[] objArr1252 = new java.lang.Object[1];
                            a(android.graphics.Color.blue(0) + 1590, (char) (android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), 10 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr1252);
                            java.lang.String[] strArr112 = {intern382, ((java.lang.String) objArr1252[0]).intern()};
                            java.lang.Object[] objArr1262 = new java.lang.Object[1];
                            a(1600 - android.view.View.MeasureSpec.getSize(0), (char) (android.text.TextUtils.getOffsetAfter(str3, 0) + 17361), 12 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr1262);
                            c = 0;
                            java.lang.String intern392 = ((java.lang.String) objArr1262[0]).intern();
                            java.lang.Object[] objArr1272 = new java.lang.Object[1];
                            a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 337, (char) android.text.TextUtils.indexOf(str3, str3, 0, 0), 5 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr1272);
                            java.lang.String[] strArr122 = {intern392, ((java.lang.String) objArr1272[0]).intern()};
                            java.lang.Object[] objArr1282 = new java.lang.Object[1];
                            a((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1611, (char) (8435 - android.view.Gravity.getAbsoluteGravity(0, 0)), 27 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr1282);
                            java.lang.String intern402 = ((java.lang.String) objArr1282[0]).intern();
                            java.lang.Object[] objArr1292 = new java.lang.Object[1];
                            a(1590 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) android.view.View.getDefaultSize(0, 0), 10 - android.text.TextUtils.indexOf(str3, str3, 0, 0), objArr1292);
                            java.lang.String[][] strArr132 = {strArr92, strArr102, strArr112, strArr122, new java.lang.String[]{intern402, ((java.lang.String) objArr1292[0]).intern()}};
                            int i432 = -1;
                            i14 = 0;
                            while (true) {
                                if (i14 < 5) {
                                }
                                i14++;
                                c = 0;
                            }
                            if (i15 == i) {
                            }
                        }
                    }
                    i8 = i;
                    if (i8 == i) {
                    }
                }
            }
            i6 = i;
            if (i6 == i) {
            }
        }

        static void init$0() {
            $$a = new byte[]{6, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -80, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -15, 10, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
            $$b = 26;
        }
    }

    public final com.payair.hce.DeleteCardRequestEncrypted valueOf() {
        com.payair.hce.DeleteCardRequestEncrypted deleteCardRequestEncrypted = new com.payair.hce.DeleteCardRequestEncrypted();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(65494354 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 279990614 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) - 27, (byte) ((-104) - android.view.Gravity.getAbsoluteGravity(0, 0)), (short) (android.view.View.MeasureSpec.getMode(0) - 41), objArr);
        com.payair.hce.DeleteCardRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{deleteCardRequestEncrypted, ((java.lang.String) objArr[0]).intern()}, 79710895, -79710889, java.lang.System.identityHashCode(deleteCardRequestEncrypted));
        int i = this.writeReplace;
        com.payair.hce.DeleteCardRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{deleteCardRequestEncrypted, java.lang.Integer.valueOf(i)}, 913702488, -913702478, i);
        int i2 = this.DigitizedCardProfile;
        com.payair.hce.DeleteCardRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{deleteCardRequestEncrypted, java.lang.Integer.valueOf(i2)}, 1617780165, -1617780156, i2);
        com.payair.hce.DeleteCardRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{deleteCardRequestEncrypted, this.values}, 1625219159, -1625219148, java.lang.System.identityHashCode(deleteCardRequestEncrypted));
        com.payair.hce.setIsRedigitization setisredigitization = new com.payair.hce.setIsRedigitization();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 65494373, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 279990644, (-42) - (android.view.ViewConfiguration.getTapTimeout() >> 16), (byte) (android.view.View.combineMeasuredStates(0, 0) - 26), (short) ((-79) - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr2);
        setisredigitization.DigitizedCardProfile(((java.lang.String) objArr2[0]).intern());
        com.payair.hce.DeleteCardRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{deleteCardRequestEncrypted, setisredigitization}, 1512922139, -1512922135, java.lang.System.identityHashCode(deleteCardRequestEncrypted));
        com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted = new com.payair.hce.NotifyProvisionRequestEncrypted();
        com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted, java.lang.Boolean.valueOf(this.AlternateContactlessPaymentDataJson.writeReplace)}, 1452208372, -1452208371, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted));
        com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted, java.lang.Boolean.valueOf(this.AlternateContactlessPaymentDataJson.values)}, 1151331013, -1151331011, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted));
        com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted, java.lang.Boolean.valueOf(this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson)}, 601004559, -601004552, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted));
        com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted, java.lang.Boolean.valueOf(this.AlternateContactlessPaymentDataJson.valueOf)}, -1277116510, 1277116513, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted));
        com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted, java.lang.Boolean.valueOf(this.AlternateContactlessPaymentDataJson.DigitizedCardProfile)}, -1019184917, 1019184928, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted));
        com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted, java.lang.Boolean.valueOf(this.AlternateContactlessPaymentDataJson.SdkCoreAlternateContactlessPaymentDataImpl)}, -1064580591, 1064580600, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted));
        com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted, java.lang.Boolean.valueOf(this.AlternateContactlessPaymentDataJson.getProfileVersion)}, -1711745080, 1711745095, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted));
        com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted, java.lang.Boolean.valueOf(this.AlternateContactlessPaymentDataJson.getAid)}, -1594786204, 1594786216, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted));
        com.payair.hce.DeleteCardRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{deleteCardRequestEncrypted, notifyProvisionRequestEncrypted}, 548804967, -548804962, java.lang.System.identityHashCode(deleteCardRequestEncrypted));
        com.payair.hce.NotifyProvisionRequestEncrypted notifyProvisionRequestEncrypted2 = new com.payair.hce.NotifyProvisionRequestEncrypted();
        com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2, java.lang.Boolean.valueOf(this.valueOf.writeReplace)}, 1452208372, -1452208371, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2));
        com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2, java.lang.Boolean.valueOf(this.valueOf.values)}, 1151331013, -1151331011, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2));
        com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2, java.lang.Boolean.valueOf(this.valueOf.AlternateContactlessPaymentDataJson)}, 601004559, -601004552, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2));
        com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2, java.lang.Boolean.valueOf(this.valueOf.valueOf)}, -1277116510, 1277116513, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2));
        com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2, java.lang.Boolean.valueOf(this.valueOf.DigitizedCardProfile)}, -1019184917, 1019184928, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2));
        com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2, java.lang.Boolean.valueOf(this.valueOf.SdkCoreAlternateContactlessPaymentDataImpl)}, -1064580591, 1064580600, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2));
        com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2, java.lang.Boolean.valueOf(this.valueOf.getProfileVersion)}, -1711745080, 1711745095, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2));
        com.payair.hce.NotifyProvisionRequestEncrypted.AlternateContactlessPaymentDataJson(new java.lang.Object[]{notifyProvisionRequestEncrypted2, java.lang.Boolean.valueOf(this.valueOf.getAid)}, -1594786204, 1594786216, java.lang.System.identityHashCode(notifyProvisionRequestEncrypted2));
        int i3 = getGpoResponse + 113;
        getCvrMaskAnd = i3 % 128;
        if (i3 % 2 != 0) {
            return deleteCardRequestEncrypted;
        }
        throw null;
    }

    final class writeReplace {
        boolean AlternateContactlessPaymentDataJson;
        boolean DigitizedCardProfile;
        boolean SdkCoreAlternateContactlessPaymentDataImpl;
        boolean getAid;
        boolean getProfileVersion;
        boolean valueOf;
        boolean values;
        boolean writeReplace;

        private writeReplace() {
            this.writeReplace = false;
            this.values = false;
            this.AlternateContactlessPaymentDataJson = false;
            this.valueOf = false;
            this.DigitizedCardProfile = true;
            this.SdkCoreAlternateContactlessPaymentDataImpl = true;
            this.getProfileVersion = false;
            this.getAid = true;
        }

        /* synthetic */ writeReplace(com.payair.hce.setMagstripeCvmIssuerOptions setmagstripecvmissueroptions, byte b) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        long j;
        int i4;
        boolean z;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(RecordsJson)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 27, 28 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            boolean z2 = intValue == -1;
            if (z2) {
                byte[] bArr = getProfileVersion;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i5])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 5088, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr2[i5] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr == null) {
                    j = -4897270311952305750L;
                    intValue = (short) (((short) (getAid[i2 + ((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (RecordsJson ^ (-4897270311952305750L))));
                    if (intValue > 0) {
                        int i6 = (int) (SdkCoreAlternateContactlessPaymentDataImpl ^ j);
                        if (z2) {
                            $11 = ($10 + 1) % 128;
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + i6 + i4;
                        java.lang.Object[] objArr4 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson), sb};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj3 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 27, 2364 - android.text.TextUtils.getTrimmedLength(""), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            b((byte) 0, (byte) 0, (byte) 0, objArr5);
                            obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj3);
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        byte[] bArr3 = getProfileVersion;
                        if (bArr3 != null) {
                            int length2 = bArr3.length;
                            byte[] bArr4 = new byte[length2];
                            for (int i7 = 0; i7 < length2; i7++) {
                                int i8 = $11 + 95;
                                $10 = i8 % 128;
                                if (i8 % 2 != 0) {
                                    bArr4[i7] = (byte) (bArr3[i7] ^ (-4897270311952305750L));
                                    throw new java.lang.ArithmeticException();
                                }
                                bArr4[i7] = (byte) (bArr3[i7] ^ (-4897270311952305750L));
                            }
                            bArr3 = bArr4;
                        }
                        if (bArr3 != null) {
                            int i9 = ($11 + 35) % 128;
                            $10 = i9;
                            $11 = (i9 + 13) % 128;
                            z = true;
                        } else {
                            z = false;
                        }
                        gettrack2constructiondata.DigitizedCardProfile = 1;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                            if (z) {
                                $11 = ($10 + 41) % 128;
                                byte[] bArr5 = getProfileVersion;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr5[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                            } else {
                                short[] sArr = getAid;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                            }
                            sb.append(gettrack2constructiondata.values);
                            gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                            gettrack2constructiondata.DigitizedCardProfile++;
                        }
                    }
                    objArr[0] = sb.toString();
                }
                byte[] bArr6 = getProfileVersion;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 27, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 29, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                }
                intValue = (byte) (((byte) (bArr6[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).intValue()] ^ (-4897270311952305750L))) + ((int) (RecordsJson ^ (-4897270311952305750L))));
            }
            j = -4897270311952305750L;
            if (intValue > 0) {
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getGpoResponse = 0;
        getCvrMaskAnd = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = -263479552;
        RecordsJson = 520368529;
        IccPrivateKeyCrtComponentsJson = -484666507;
        getProfileVersion = new byte[]{107, 107, 107, 107, 107, 107, 107, 107, 107, 107, 107, 107, 107, 107, 107, 107, 107, 107, 107, 107, 107, 107, 107, 107, 107, 107, 107, 107, 107, 107, 107, com.visa.cbp.getEncExpo.registerForActivityResult, -59, -51, -26, -59, -97, -101, com.visa.cbp.getEncExpo.kernelVersion, -98, -14, -26, -98, -58, com.visa.cbp.getEncExpo.kernelVersion, -19, -99, -86, -86};
    }

    static void init$0() {
        $$a = new byte[]{5, -77, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -4};
        $$b = 72;
    }
}
