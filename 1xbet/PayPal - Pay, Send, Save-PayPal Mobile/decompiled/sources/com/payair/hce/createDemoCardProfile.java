package com.payair.hce;

/* loaded from: classes4.dex */
public final class createDemoCardProfile extends com.payair.hce.getReasonCode<com.payair.hce.transactionCanBeResumed> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static char[] valueOf;
    private static int values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2 = s2 + 4;
        int i3 = 718 - s;
        byte[] bArr = $$a;
        int i4 = b * 2;
        char[] cArr = new char[35 - i4];
        int i5 = 34 - i4;
        if (bArr == null) {
            int i6 = i3;
            i = 0;
            i3 = i5;
            i3 = (i3 + (-i6)) - 2;
            cArr[i] = (char) i3;
            if (i == i5) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i2++;
            i6 = bArr[i2];
            i++;
            i3 = (i3 + (-i6)) - 2;
            cArr[i] = (char) i3;
            if (i == i5) {
            }
        } else {
            i = 0;
            cArr[i] = (char) i3;
            if (i == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        int i2 = s * 2;
        int i3 = (b * 4) + 99;
        byte[] bArr = $$d;
        int i4 = (s2 * 3) + 4;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i3 = (-i3) + i6;
            i4++;
            i = i7;
            bArr2[i] = (byte) i3;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i + 1;
            i6 = i3;
            i3 = bArr[i4];
            i7 = i8;
            i3 = (-i3) + i6;
            i4++;
            i = i7;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        }
    }

    /* synthetic */ createDemoCardProfile(byte b) {
        this();
    }

    @Override // com.payair.hce.getReasonCode
    public final com.payair.hce.transactionCanBeResumed valueOf() {
        AlternateContactlessPaymentDataJson = (values + 95) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.widget.ExpandableListView.getPackedPositionType(0L), (char) ((android.os.Process.myPid() >> 22) + 27446), 4 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        com.payair.hce.transactionCanBeResumed values2 = com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr[0]).intern());
        AlternateContactlessPaymentDataJson = (values + 81) % 128;
        return values2;
    }

    private createDemoCardProfile() {
    }

    @Override // com.payair.hce.getReasonCode
    public final void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed) {
        AlternateContactlessPaymentDataJson = (values + 87) % 128;
        super.AlternateContactlessPaymentDataJson(transactioncanberesumed);
        int i = AlternateContactlessPaymentDataJson + 51;
        values = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        $11 = ($10 + 93) % 128;
        while (getcvmmodel.valueOf < i2) {
            int i3 = $11 + 33;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(valueOf[i + getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 47, 381 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 62388));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c((short) 0, (short) 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(DigitizedCardProfile), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 3966 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (40223 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 34, 212 - android.text.TextUtils.indexOf("", "", 0), (char) android.graphics.Color.argb(0, 0, 0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
            } else {
                int i5 = getcvmmodel.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(valueOf[i + getcvmmodel.valueOf])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 382 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (62388 - android.view.KeyEvent.getDeadChar(0, 0)));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    c((short) 0, (short) 0, (byte) 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(DigitizedCardProfile), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.widget.ExpandableListView.getPackedPositionType(0L), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 3966, (char) (40223 - android.view.View.MeasureSpec.getMode(0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 35, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i6 = $10 + 121;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj7 == null) {
                    obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 34, android.view.View.resolveSizeAndState(0, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
                }
                ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
                throw new java.lang.ArithmeticException();
            }
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr11 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj8 == null) {
                obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.widget.ExpandableListView.getPackedPositionType(0L), 212 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj8);
            }
            ((java.lang.reflect.Method) obj8).invoke(null, objArr11);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        AlternateContactlessPaymentDataJson = 0;
        values = 1;
        char[] cArr = new char[1711];
        java.nio.ByteBuffer.wrap("5 q\r¼\tûÚÚb\u009eûS\u008c\u0014MÉ*\u00820FÎ;\u009fü¹±Ij\u0010/8ãý¤¸\u0019PÒg\u0097\tKÍ\fìÁ¨ºV\u007f(02ôã©\u009cb¬'|^\u0080\u001a\u0019×n\u0090¯MÈ\u0006ÒÂ,¿}x[5«îò«Úg\u001f Z\u009d£V\u0088\u0013ÿÏ8\u00884E]>·ûç´Àp\u0005-{ëg¯þb\u0089%Hø/³5wË\n\u009aÍ¼\u0080L[\u0015\u001e=Òø\u0095½(Gã\u007f¦\u0006zÙ^\u0080\u001a\u000e×r\u0090ªMÈ\u0006ØÂ,¿uxJ5¡îþ«\u0086g\u0010 j\u009d¿V\u0085\u0013éÏ4\u0088\u0018EQ>\u0098û÷´Âp\u0005-kæH£\u0089\u001cð+\u0097o\u000f¢hå\u00ad8ßsÆ·3Ê(\rX@¨\u009bãÞÎ\u001a\u009f^\u0007\u0093`Ô¥\t×BÙ\u00865ûc<\u000eq¢ªöïÙ#\u0018^\u0080\u001a\u000e×o\u0090ºM\u0086\u0006ÇÂ'¿>xm5\u008bîÖ«Æg\u0001 `\u009d\u0097V\u0080\u0013ûÏ<XÀ\u001cNÑ2\u0096êKÓ\u0000\u0090Än¹~~\u00133äè¹\u00adÆa[&,\u009bñPÏ\u0015\u00adÉ3\u008eXC\u0016S\u00ad\u0017tÚ\f\u009d×@è\u000b\u00adÊ+\u008e¥CÙ\u0004\u0001Ù8\u0092{V\u0085+\u0095ìö¡\u000fz^?-ó²´Ë\t\u0015Â?\u0087r[»\u001cíÑüª\toS }ä÷¹×ré7>\u0088VL\u008e\u0001¡Úô\u0010´T:\u0099FÞ\u009e\u0003§Hä\u008c\u001añ\n6i{\u0090 Áå²)-nTÓ\u008a\u0018 ]í\u0081$Ær\u000b}p\u0081µÎúç§ÜãR..iö´Ïÿ\u008c;rFb\u0081\u000fÌø\u0017¥RÚ\u009eGÙ0dí¯Óê¶6lqB¼3ÇÖ\u0002¹M\u008d\u0089BÔ3\u001f_ZÔåº^\u0080\u001a\u0019×n\u0090¯MÈ\u0006ÛÂ&¿|xJ5ªîî«Ìg\u0004 q<ÿx0µ\u0007ò\u0099/°dþ \rÝW\u001a3W\u0087\u008cÖÉø\u0005!^Á\u001a\u0018×j\u0090ªM\u0082\u0006\u009bÂ-¿txK\u0094\u0019Ð\u0094\u001dàZ/\u0087\u001dÌ\u0003\b¼uá²Êÿ1$qaI\u00ad\u009dêèW/\u009c\u0015Ùe^Á\u001a\u0018×f\u0090¬M\u0094\u0006Ó\u0086´Â{^Ý\u001a\u0012×%\u0090©M\u0095\u0006ÚÂ'¿dx\\5¹îµ«Äg\u0016 k\u009d¦V\u0087\u0013îÏ>\u0088\u001fEL>µûð´Ñ^È\u001a\u0018×e\u0090 ý\u001f¹Ùt¢3gîR¥\u0015?Ô{Y¶-ñâ,ÐgÎ£zÞ*\u0019\u000fTì\u008f£Ê\u0098\u0006P^Ù\u001a\u001f×d\u0090¡M\u0080\u0006ÀÂ&¿bxK^è\u001a\u0018×e\u0090 M\u008a\u0006ÚÂ7¿xxP5£uÛ1\u0012üa»¶f\u0089-Ãé,\u0001íE4\u0088XÏ\u0097\u0012«Yý\u009d\u0017à]\\z\u0018µÕ\u0082\u0092\u000eO2\u0004}À\u0080½Ãzû7\u001eì\u0012©jeµ\"Ô\u009f\u001dT%\u0011M^Ù\u001a\u001f×d\u0090¡Mß\u0006\u0083Â3ÑÃ\u0095\u0013Xn\u001f·Â\u009e\u0089×M+^È\u001a\u0018×e\u0090¼M\u0095\u0006ÜÂ ¿NxG5õî\u00ad±Ëõ\u001b8f\u007f¿¢\u0096éß-#PM\u0097DÚö\u0001®Dõ\u0088BÏ2^Ý\u001a\u0012×%\u0090©M\u0095\u0006ÚÂ'¿dx\\5¹îµ«Äg\u0018 a\u009d¶V\u008d?È{\r¶t^Ê\u001a\u0010×~\u0090µM\u0086\u0006ÁÂ,¿c$q`\u0092\u00adäêf7*|_¸²Åú\u0002ÉO?\u0094aÑ\u0016\u001d\u008eZõç>,^iSµªò\u0086?ÉD5\u0081oø\u008e¼sq\u000f6Ëëè ¼dG\u0019QÞ\f\u0093éH°\réÁu\u0086\u0010;Úðíµ\u009bi\u001d.mã6\u0098Õ]Õ\u0012»Ö)\u008bI^î\u001a\u0013×o\u0090«M\u0088\u0006ÜÂ'¿1xl5\u0089îÐ«\u0089g\u0015 p\u009dºV\u008d\u0013ûÏ}\u0088\rEV>µûµ´ÛpI-)ær£Í\u001c½^Ý\u001a\u0012×%\u0090±M\u0086\u0006ÇÂ'¿fx^5¿îþu51ïü\u009a»@f|-!éÍ\u0094\u0084^Ù\u001a\u001f×d\u0090¡Mß\u0006\u0083^Ý\u001a\u001c×e\u0090ºM\u008f\u0006À^Ý\u001a\u0012×%\u0090©M\u0095\u0006ÚÂ'¿dx\\5¹îµ«Ëg\u0005 d\u009d½V\u0085^Ý\u001a\u0012×%\u0090²M\u0082\u0006ÇÂ-¿txS5ãîê«Ìg\u001a p^\u009e^Ý\u001a\u0012×%\u0090ªM\u0082\u0006ÖÂ6¿cxZ^\u009f^Ý\u001a\u0012×%\u0090»M\u0092\u0006ÜÂ/¿ux\u00115½îé«Æg\u0013 p\u009d°V\u0095^É\u001a\b×g\u0090µM¸\u0006ÍÂ{¿'°ßô\u00109'~¹£\u0090èÞ,-Qw\u0096\u0013Û©\u0000ðEÅ\u0089\u0012Îbs£¸\u0093ýÿ!6f\u0007«O^È\u001a\u0018×e\u0090¼M\u0095\u0006ÜÂ ¿>xL5©îð«\u0086g\u0010 `\u009d½V\u0084\u0013ýÏ4\u0088\b^È\u001a\u0018×e\u0090¼M\u0095\u0006ÜÂ ¿NxG5õî\u00ad«\u0086g\u0004 a\u009d¸V¾\u0013÷Ïe\u0088]E\u0016> ûð´Íp\u0014-mæD£\u0098\u001cÖØ/\u0095]N\u0005\u0001xE¨\u0088ÕÏ\f\u0012%Yl\u009d\u0090à\u008e'èj\u0012±Dô~8«\u007fÐÂ<\t\"L[\u0090\u0086×ô\u001aîa\u0012¤Këv/³rÆ¹þ^È\u001a\u0018×e\u0090¼M\u0095\u0006ÜÂ ¿>xI5¯îô«ÑgO 3\u009d£VÎ\u0013ùÏ?\u0088\u0004EA>ÿû£´Ó^È\u001a\u0012×d\u0090¾M\u008b\u0006ÐÂl¿bx[5¦îÄ«Îg\u0007 m\u009d¼V\u008f\u0013êÏ\u0002\u0088\u0013E\u0001>ñûº´Äp\u0014-qæH£\u0089\u001càØ4\u0095:NK\u000bùÄÙf-\"âïÕ¨Kux>*úÇ\u0087\u008d@ \r\\Ö\u000f\u0093<_õ^Ý\u001a\u0012×%\u0090»M\u0088\u0006ÚÂ7¿xxR5¬îü«ÌgY g\u009d¦V\u0088\u0013ãÏ9\u0088EE_>®ûû´Äp\u0014-mæ]£\u0089\u001càØ9\u0095\u0011^î\u001a\u0013×o\u0090«M\u0088\u0006ÜÂ'¿<xG5õî\u00ad^Ý\u001a\u0012×%\u0090»M\u0092\u0006ÜÂ/¿ux\u00115©îò«Úg\u0007 i\u009d²V\u0098\u0013¡Ï4\u0088\u000fêY®\u009acú$/ùHJÖ\u000e\u0003Ãr\u0084½YÙ\u0012ÖÖ%«bl\u0001!¬úî¿Ôs\u001248\u0089³B\u0083\u0007ðÛ=\u009c\b\u0000}D»\u0089ÅÎ\u000f\u0013jX~\u009c\u0097á\u009c&ñk\u000f°Qõd9¿~ÃÃ\t\b1^Þ\u001a\u0018×f\u0090¬MÉ\u0006ÆÂ%¿?xY5¬îð«Ìg( f\u009d²V\u008c\u0013êÏ/\u0088\n^Þ\u001a\u0018×f\u0090¬MÉ\u0006ÆÂ%¿?xS5®îÿ«ög\u0013 `\u009d½V\u0092\u0013æÏ)\u0088\u0012^Ý\u001a\u0012×%\u0090²M\u0082\u0006ÇÂ-¿txS5ãîú«Çg\u0013 w\u009d¼V\u0088\u0013ëÏs\u0088\u001aE\\>ªûà´Ç^Ý\u001a\u0012×%\u0090»M\u0088\u0006ÚÂ7¿?xN5¨îö«ÜgY d\u009d¥V\u0085\u0013ÐÏ3\u0088\nET>¢òk¶¤{\u0093<\u0000á5ªnnÛ\u0013ÅÔü\u0099\u0012BA\u0007{Ëï\u008cÕ1\fú9¿^c\u008e$¯éÿ\u0092\u0003WJ\u0018{Ü³^Ý\u001a\u0012×%\u0090©M\u0095\u0006ÚÂ'¿dx\\5¹îµ«Ëg\u0002 l\u009d¿V\u0085\u0013¡Ï;\u0088\u0002EW> ûð´Ñp\u0001-mæD£\u0095\u001cý^Ý\u001a\u0012×%\u0090ªM\u009e\u0006ÆÂ7¿txR5ãîù«Üg\u001e i\u009d·VÏ\u0013éÏ4\u0088\u0005E^>¢ûç´Óp\u0003-væC£\u008f^Ý\u001a\u0012×%\u0090ªM\u009e\u0006ÆÂ7¿txR5\u0092îþ«Ñg\u0003 +\u009d±V\u0094\u0013æÏ1\u0088\u000fE\u0017>¡ûü´Íp\u0016-zæ_£\u008b\u001cûØ>\u0095\u000bNGyx=·ð\u0080·\nj'!~å\u0082\u0098Û_è\u0012FÉ\\\u008cy@»\u0007Ìº\u0012qj4Lè\u0091¯ bû\u0019\u0007ÜB\u0093vW¦\nÓÁæ\u0084*±\u000eõÁ8ö\u007f|¢Qé\b-ôP\u00ad\u0097\u009eÚA\u0001,D\u0016\u0088ÏÏ»r.¹Pü) çgÔª\u008eÑ:\u0014 [\u0019\u009fÌÂ«\t\u009bLZó*7özß¡\u008eäf\u0005ð½aùø4\u008fsN®)å%!Ç\\\u009d\u009b«Ös\r\nH!\u0084æÃ\u0081^\u0080\u001a\u0019×n\u0090¯MÈ\u0006ÆÂ,¿rxT5¨îï«\u0086g\u0015 d\u009d V\u0084\u0013íÏ<\u0088\u0005E]>\u0098ûò´Æp\u001f-fæIµ\fñ\u0095<â{#¦DíJ) Tþ\u0093ØÞ$\u0005c@\n\u008c\u009cËìv1½\u0014øg\u00ad,éµ$Âc\u0003¾dõj1\u0080LÞ\u008bøÆ\u0004\u001dCX*\u0094ªÓÌn\u0012¥8àG^\u0080\u001a\u000e×r\u0090ªMÈ\u0006ÄÂ&¿|xJ5\u0092îï«Ûg\u0016 f\u009d¶ÿ\u0093»\u001dva1¹ì\u0080§Ãc=\u001e-Ù@\u0094·Oê\n\u0095Æ\b\u0081\u007f<¢÷\u0091²Ãn#)\u0019äF\u009f¸Zé\u0015ÓÑ=\u008chG[\u0002\u008a½ïy#4)ïQª·e\u0091 ÛÜv\u0097yR[\u0010½T$\u0099SÞ\u0092\u0003õHê\u008c\rñX6]{\u0097 Öåç^\u0080\u001a\u0019×n\u0090¯MÈ\u0006×Â0¿ex`5¹îò«Äg\u0012\u0090^ÔÇ\u0019°^q\u0083\u0016È\u0018\fòq¬¶\u008aûv 1eX©Ëî¨Sy\u0098YÝ>\u0001ïFÑ\u008b\u0082ðk5/^\u0080\u001a\u000e×r\u0090ªM\u0093\u0006ÐÂ.¿>xS5¤îù«\u0086g\u001b l\u009d±V\u0083\u0013üÏ)\u0088\rEV>«ûñ´Æp\u0003-@æG£\u0095\u001càØy\u0095\u0016N\\\u001e,Zµ\u0097ÂÐ\u0003\rdF{\u0082\u009cÿÉ8òu\u0002®Të`\u000fëKr\u0086\u0005ÁÄ\u001c£W¼\u0093[î\u000e)3dß¿\u0082ú\u00ad^\u0080\u001a\u0019×n\u0090¯MÈ\u0006×Â0¿exR5¨îü«Çâ\u0003¦\u009akí,,ñKºT~³\u0003æÄÓ\u0089<Rq\u0017O\t]MÄ\u0080³Çr\u001a\u0015Q\n\u0095íè¸/\u0094b}¹5ü\u0013^\u0080\u001a\u0019×n\u0090¯MÈ\u0006×Â0¿exO5ªîú«Àg\u0007 f\u0014QPÈ\u009d¿Ú~\u0007\u0019L\u0006\u0088áõ´2±\u007fu¤'á\u001dÜâ\u0098{U\b\u0012ÏÏä\u0084ø@E=\u001cú*·Ál\u0095)¤åt¢\u0003\u001fÂÔ¬\u0091ÃMG\nkÇt¼Çy\u00846µòx^\u0080\u001a\u0010×e\u0090\u00adMÈ\u0006ÂÂ*¿\u007fx[5¢îì«ÚgX G\u009d V\u0095\u0013ÜÏ5\u0088\nEK>¢ûñ´åp\u001e-sæI£\u009e\u001cû^\u0080\u001a\r×y\u0090¶M\u0084\u0006\u009aÂ*¿~xO5¢îé«Ýg\u0004\u0002¶F2\u008bDÌÐ\u0011ô\u009b\fß\u0081\u0012õU:\u0088\bÃ\u0016\u0007¼zø½ßð'+8nH¢\u009aåùX,^È\u001a\u000f×j\u0090µM\u008b\u0006ÚÂ ¿?xX5¢î÷«Íg\u0011 l\u009d V\u0089\u0013¡Ï.\u0088\u0004\u000bÈO\u001f\u0082bÅ\u0095\u0018 Sû\u0097\u001bêE-V`µ»äþ\u008c2\u000fua^\u0080\u001a\u0018×\u007f\u0090ºMÈ\u0006ØÂ&¿uxV5¬îÄ«Êg\u0018 a\u009d¶V\u0082\u0013üÏs\u0088\u0013ET>«^Í\u001a\u0011×~\u0090¼M\u0094\u0006ÁÂ\"¿rxT5¾^\u0080\u001a\u0018×\u007f\u0090ºMÈ\u0006ØÂ,¿dxQ5¹îè9¼}%°V÷\u0091*ºa¦¥\u001bØB\u001ftR\u009f\u0089ËÌú\u0000*G]ú\u009c1òt\u009d¨\u0005ï'\"*Y\u009a\u009cÙÓï\u0017>J\r\u0081iÄª{Ù^\u0080\u001a\r×y\u0090¶M\u0084\u0006\u009aÂ ¿axJ5¤îõ«Ïg\u0018Á\u0098\u0085bH\u0017\u000fÍÒñ\u0099¬]@ \t^\u0080\u001a\u0019×j\u0090\u00adM\u0086\u0006\u009aÂ.¿xxL5®î´«Ùg\u0005 j\u009dµV\u0088\u0013ãÏ8\u0088\u0018E\u0016>¤ûà´Ñp^-/æ\u0002£\u0098\u001cæØ:\u0095KN^\u000b¨Ä\u008c\u0081Ï}$6oóN¬\u0087i÷%\u007f\u009e\u0012[h\u0014¶Ñ\u009c\u008aÞF(\u0003v".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1711);
        valueOf = cArr;
        DigitizedCardProfile = -5544222561413424515L;
    }

    static void init$1() {
        $$d = new byte[]{92, -25, 4, -11};
        $$e = 18;
    }

    static void init$0() {
        $$a = new byte[]{68, 10, 35, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -15, 10};
        $$b = 66;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0c63  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0d32  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0e04  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0eca  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x1262  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x131e A[Catch: all -> 0x01e2, TRY_ENTER, TryCatch #1 {all -> 0x01e2, blocks: (B:6:0x00d1, B:8:0x00e4, B:9:0x0132, B:18:0x0208, B:20:0x023e, B:21:0x028b, B:28:0x031f, B:30:0x0332, B:31:0x0383, B:39:0x0476, B:41:0x04b7, B:42:0x050b, B:45:0x0521, B:47:0x0530, B:48:0x0581, B:54:0x063d, B:56:0x067f, B:57:0x06d4, B:61:0x0736, B:63:0x0749, B:64:0x079c, B:70:0x0853, B:72:0x0894, B:73:0x08ea, B:80:0x09b2, B:82:0x09c5, B:83:0x0a13, B:91:0x0ae8, B:93:0x0b31, B:94:0x0b86, B:98:0x0bc3, B:100:0x0bd6, B:101:0x0c22, B:108:0x0c7b, B:110:0x0cc8, B:111:0x0d1c, B:134:0x0e25, B:136:0x0e5d, B:137:0x0eb4, B:141:0x0ef0, B:143:0x0f03, B:144:0x0f50, B:150:0x0fa9, B:152:0x0fee, B:153:0x1041, B:169:0x127a, B:171:0x12b3, B:172:0x1308, B:175:0x131e, B:177:0x132d, B:178:0x137a, B:182:0x143b, B:184:0x1479, B:185:0x14cc, B:189:0x14e3, B:191:0x14fb, B:192:0x1549, B:198:0x15f3, B:200:0x162b, B:201:0x1683, B:205:0x16c0, B:207:0x16d3, B:208:0x1723, B:210:0x172c, B:212:0x174a, B:213:0x179a, B:219:0x2432, B:221:0x2445, B:222:0x2491, B:233:0x28b4, B:235:0x28c7, B:236:0x2918, B:241:0x29de, B:243:0x29f1, B:244:0x2a45, B:253:0x2b01, B:255:0x2b34, B:256:0x2b89, B:265:0x2d70, B:267:0x2d83, B:268:0x2de0, B:276:0x2e8f, B:278:0x2ed0, B:279:0x2f21, B:296:0x300f, B:298:0x3058, B:299:0x30ae, B:303:0x30e8, B:305:0x30fb, B:306:0x314c, B:310:0x3211, B:312:0x325c, B:313:0x32b4, B:317:0x32e2, B:319:0x332b, B:320:0x3382, B:340:0x24a0, B:342:0x24be, B:343:0x250e, B:349:0x20be, B:351:0x20d1, B:352:0x212b, B:376:0x21d1, B:378:0x2212, B:379:0x2268, B:384:0x2372, B:386:0x23a5, B:387:0x23fc, B:391:0x229d, B:393:0x22db, B:394:0x232b, B:403:0x1157, B:405:0x116a, B:406:0x11ba), top: B:5:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x2445 A[Catch: all -> 0x01e2, TryCatch #1 {all -> 0x01e2, blocks: (B:6:0x00d1, B:8:0x00e4, B:9:0x0132, B:18:0x0208, B:20:0x023e, B:21:0x028b, B:28:0x031f, B:30:0x0332, B:31:0x0383, B:39:0x0476, B:41:0x04b7, B:42:0x050b, B:45:0x0521, B:47:0x0530, B:48:0x0581, B:54:0x063d, B:56:0x067f, B:57:0x06d4, B:61:0x0736, B:63:0x0749, B:64:0x079c, B:70:0x0853, B:72:0x0894, B:73:0x08ea, B:80:0x09b2, B:82:0x09c5, B:83:0x0a13, B:91:0x0ae8, B:93:0x0b31, B:94:0x0b86, B:98:0x0bc3, B:100:0x0bd6, B:101:0x0c22, B:108:0x0c7b, B:110:0x0cc8, B:111:0x0d1c, B:134:0x0e25, B:136:0x0e5d, B:137:0x0eb4, B:141:0x0ef0, B:143:0x0f03, B:144:0x0f50, B:150:0x0fa9, B:152:0x0fee, B:153:0x1041, B:169:0x127a, B:171:0x12b3, B:172:0x1308, B:175:0x131e, B:177:0x132d, B:178:0x137a, B:182:0x143b, B:184:0x1479, B:185:0x14cc, B:189:0x14e3, B:191:0x14fb, B:192:0x1549, B:198:0x15f3, B:200:0x162b, B:201:0x1683, B:205:0x16c0, B:207:0x16d3, B:208:0x1723, B:210:0x172c, B:212:0x174a, B:213:0x179a, B:219:0x2432, B:221:0x2445, B:222:0x2491, B:233:0x28b4, B:235:0x28c7, B:236:0x2918, B:241:0x29de, B:243:0x29f1, B:244:0x2a45, B:253:0x2b01, B:255:0x2b34, B:256:0x2b89, B:265:0x2d70, B:267:0x2d83, B:268:0x2de0, B:276:0x2e8f, B:278:0x2ed0, B:279:0x2f21, B:296:0x300f, B:298:0x3058, B:299:0x30ae, B:303:0x30e8, B:305:0x30fb, B:306:0x314c, B:310:0x3211, B:312:0x325c, B:313:0x32b4, B:317:0x32e2, B:319:0x332b, B:320:0x3382, B:340:0x24a0, B:342:0x24be, B:343:0x250e, B:349:0x20be, B:351:0x20d1, B:352:0x212b, B:376:0x21d1, B:378:0x2212, B:379:0x2268, B:384:0x2372, B:386:0x23a5, B:387:0x23fc, B:391:0x229d, B:393:0x22db, B:394:0x232b, B:403:0x1157, B:405:0x116a, B:406:0x11ba), top: B:5:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x249a  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x2d5e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x2e77  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x2f37 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x2ff7  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x30c4  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x2e74 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x24a0 A[Catch: all -> 0x01e2, TryCatch #1 {all -> 0x01e2, blocks: (B:6:0x00d1, B:8:0x00e4, B:9:0x0132, B:18:0x0208, B:20:0x023e, B:21:0x028b, B:28:0x031f, B:30:0x0332, B:31:0x0383, B:39:0x0476, B:41:0x04b7, B:42:0x050b, B:45:0x0521, B:47:0x0530, B:48:0x0581, B:54:0x063d, B:56:0x067f, B:57:0x06d4, B:61:0x0736, B:63:0x0749, B:64:0x079c, B:70:0x0853, B:72:0x0894, B:73:0x08ea, B:80:0x09b2, B:82:0x09c5, B:83:0x0a13, B:91:0x0ae8, B:93:0x0b31, B:94:0x0b86, B:98:0x0bc3, B:100:0x0bd6, B:101:0x0c22, B:108:0x0c7b, B:110:0x0cc8, B:111:0x0d1c, B:134:0x0e25, B:136:0x0e5d, B:137:0x0eb4, B:141:0x0ef0, B:143:0x0f03, B:144:0x0f50, B:150:0x0fa9, B:152:0x0fee, B:153:0x1041, B:169:0x127a, B:171:0x12b3, B:172:0x1308, B:175:0x131e, B:177:0x132d, B:178:0x137a, B:182:0x143b, B:184:0x1479, B:185:0x14cc, B:189:0x14e3, B:191:0x14fb, B:192:0x1549, B:198:0x15f3, B:200:0x162b, B:201:0x1683, B:205:0x16c0, B:207:0x16d3, B:208:0x1723, B:210:0x172c, B:212:0x174a, B:213:0x179a, B:219:0x2432, B:221:0x2445, B:222:0x2491, B:233:0x28b4, B:235:0x28c7, B:236:0x2918, B:241:0x29de, B:243:0x29f1, B:244:0x2a45, B:253:0x2b01, B:255:0x2b34, B:256:0x2b89, B:265:0x2d70, B:267:0x2d83, B:268:0x2de0, B:276:0x2e8f, B:278:0x2ed0, B:279:0x2f21, B:296:0x300f, B:298:0x3058, B:299:0x30ae, B:303:0x30e8, B:305:0x30fb, B:306:0x314c, B:310:0x3211, B:312:0x325c, B:313:0x32b4, B:317:0x32e2, B:319:0x332b, B:320:0x3382, B:340:0x24a0, B:342:0x24be, B:343:0x250e, B:349:0x20be, B:351:0x20d1, B:352:0x212b, B:376:0x21d1, B:378:0x2212, B:379:0x2268, B:384:0x2372, B:386:0x23a5, B:387:0x23fc, B:391:0x229d, B:393:0x22db, B:394:0x232b, B:403:0x1157, B:405:0x116a, B:406:0x11ba), top: B:5:0x00d1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] values(android.content.Context context, int i, int i2, int i3) {
        java.lang.Object obj;
        java.lang.String str;
        java.lang.Integer num;
        int i4;
        java.lang.String str2;
        int i5;
        java.lang.String str3;
        java.lang.String str4;
        int i6;
        int i7;
        java.lang.String str5;
        int i8;
        java.lang.String str6;
        int i9;
        java.lang.String str7;
        java.lang.String str8;
        long j;
        long j2;
        char c;
        java.lang.String[][] strArr;
        long j3;
        java.lang.Object obj2;
        java.lang.Object invoke;
        java.lang.String str9;
        int i10;
        int i11;
        java.lang.String str10;
        char c2;
        int i12;
        int i13;
        int i14;
        java.lang.String intern;
        java.io.File file;
        java.lang.String next;
        java.lang.String[][] strArr2;
        java.lang.String[] strArr3;
        int i15;
        int i16;
        java.lang.String next2;
        java.lang.String next3;
        int i17 = 0;
        java.lang.Integer num2 = 0;
        java.lang.String str11 = "";
        int i18 = 1;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(470 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 9 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        java.lang.String intern2 = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        int i19 = 4;
        a(4 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (34019 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), android.graphics.Color.red(0) + 27, objArr2);
        java.lang.String intern3 = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(android.graphics.Color.argb(0, 0, 0, 0) + 31, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 25 - android.text.TextUtils.indexOf("", ""), objArr3);
        java.lang.String intern4 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(55 - android.view.MotionEvent.axisFromString(""), (char) (46566 - android.graphics.ImageFormat.getBitsPerPixel(0)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18, objArr4);
        java.lang.String intern5 = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(android.view.Gravity.getAbsoluteGravity(0, 0) + 74, (char) android.view.View.MeasureSpec.getMode(0), 27 - android.os.Process.getGidForName(""), objArr5);
        java.lang.String[] strArr4 = {intern3, intern4, intern5, ((java.lang.String) objArr5[0]).intern()};
        int i20 = 0;
        while (true) {
            obj = null;
            if (i20 >= i19) {
                str = intern2;
                num = num2;
                i4 = i;
                break;
            }
            try {
                java.lang.Object[] objArr6 = {strArr4[i20]};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 35, 3160 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i17, i17), (char) (33099 - android.text.TextUtils.indexOf("", "", i17, i17)));
                    byte[] bArr = $$a;
                    java.lang.Object[] objArr7 = new java.lang.Object[i18];
                    b(bArr[16], (short) ($$b | com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_ATC_OUT_SIDE_PERMISSIBLE_RANGE), bArr[14], objArr7);
                    java.lang.String str12 = (java.lang.String) objArr7[i17];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[i18];
                    clsArr[i17] = java.lang.String.class;
                    obj3 = cls.getMethod(str12, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj3);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).longValue();
                long j4 = i;
                num = num2;
                long j5 = ~((~j4) | 920777148);
                str = intern2;
                java.lang.String[] strArr5 = strArr4;
                long j6 = 1828247887 + (339 * longValue) + 310301899213L + (((~(j4 | (-920777149))) | (~((~longValue) | (-920777149))) | j5) * (-338)) + ((~(920777148 | longValue)) * 338) + ((((((-920777149) | longValue) | j4) ^ (-1)) | j5) * 338);
                int i21 = (int) (j6 >> 32);
                int i22 = ~i;
                int i23 = ~((-1030382517) | i22);
                if (((((int) j6) & (((((~((-406843894) | i22)) | 1413185) * (-1188)) - 1304876557) + (((~(406843893 | i)) | 1413185 | i23) * 594) + ((i23 | (~(406843893 | i22)) | 624951808) * 594))) | ((((~((-673448073) | i22)) * (-783)) + 1780594112 + (((~(i22 | (-675041503))) | (-2112267914)) * 783)) & i21)) != 0) {
                    i4 = (i20 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE) ^ i;
                    break;
                }
                i20++;
                strArr4 = strArr5;
                num2 = num;
                intern2 = str;
                i17 = 0;
                i19 = 4;
                i18 = 1;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i24 = 3;
        if (i4 != i) {
            java.lang.Object[] objArr8 = {new int[]{i}, new int[]{i4}, null, null, new int[1]};
            java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(1358481929 | i)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) - 392982311) + (((~((~i) | 1358481929)) | 4227592) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 50, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2713, (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                byte b = $$a[14];
                byte b2 = (byte) (b + 1);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                b(b2, (short) (b2 | 653), b, objArr10);
                obj4 = cls2.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
            }
            ((int[]) objArr8[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr9)).intValue();
            return objArr8;
        }
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        a(102 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.text.TextUtils.getOffsetBefore("", 0) + 29975), android.graphics.ImageFormat.getBitsPerPixel(0) + 13, objArr11);
        java.lang.String intern6 = ((java.lang.String) objArr11[0]).intern();
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        a(114 - android.text.TextUtils.getTrimmedLength(""), (char) (17439 - android.text.TextUtils.getOffsetAfter("", 0)), android.graphics.Color.green(0) + 13, objArr12);
        java.lang.String intern7 = ((java.lang.String) objArr12[0]).intern();
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a(127 - android.graphics.Color.argb(0, 0, 0, 0), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (android.os.Process.myPid() >> 22) + 18, objArr13);
        java.lang.String[] strArr6 = {intern6, intern7, ((java.lang.String) objArr13[0]).intern()};
        int i25 = 0;
        while (true) {
            if (i25 >= i24) {
                str2 = str11;
                i5 = i;
                break;
            }
            values = (AlternateContactlessPaymentDataJson + 63) % 128;
            java.lang.Object[] objArr14 = {strArr6[i25]};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
            if (obj5 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.text.TextUtils.indexOf(str11, str11) + 3161, (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33099));
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                b((byte) (-$$a[21]), (short) 612, r11[23], objArr15);
                obj5 = cls3.getMethod((java.lang.String) objArr15[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj5);
            }
            long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(obj, objArr14)).longValue();
            long j7 = ~longValue2;
            long j8 = i;
            str2 = str11;
            long j9 = longValue2 | 391094921;
            long j10 = (longValue2 * (-751)) + 293712286422L + (((~(j7 | 391094921)) | (~(j8 | 391094921))) * 1504) + ((~(j9 | j8)) * (-1504)) + (((~j9) | (~(j7 | (-391094922)))) * 752) + 1386529825;
            int i26 = (int) (j10 >> 32);
            int i27 = ~i;
            if (((i26 & ((((~((-2018723160) | i27)) | (~(581496748 | i27)) | 1481834579) * (-1136)) + 1738041050 + (((~(581496748 | i)) | (~((-2018723160) | i)) | (~((-44608169) | i27))) * (-568)) + (((~((-581496749) | i27)) | (~(2018723159 | i27)) | (~((-1481834580) | i))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))) | (((int) j10) & (((((~((-1075848103) | i27)) | (~((-1781892784) | i27))) * (-867)) - 1972008908) + (((~((-1075848103) | i)) | 1075839654 | (~((-1781892784) | i))) * (-1734)) + (((~(i27 | (-1075839655))) | (~(i | (-8449))) | (~((-706053130) | i))) * 867)))) != 0) {
                i5 = i ^ (i25 + 270);
                break;
            }
            i25++;
            str11 = str2;
            i24 = 3;
            obj = null;
        }
        if (i5 != i) {
            java.lang.Object[] objArr16 = {new int[]{i}, new int[]{i5}, null, null, new int[1]};
            java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(276037336 | r2)) * (-560)) - 450745919) + ((~(i | (-1770520610))) * (-560)) + (((~(1774808761 | (~i))) | 271749184) * 560))};
            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj6 == null) {
                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.getDefaultSize(0, 0), (android.os.Process.myPid() >> 22) + 2713, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                byte b3 = $$a[14];
                byte b4 = (byte) (b3 + 1);
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                b(b4, (short) (b4 | 653), b3, objArr18);
                obj6 = cls4.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
            }
            ((int[]) objArr16[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr17)).intValue();
            return objArr16;
        }
        java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1781008036);
        if (obj7 == null) {
            str3 = str2;
            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(25 - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1864, (char) (41775 - android.view.KeyEvent.getDeadChar(0, 0)));
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            b(r3[16], (short) ($$a[14] + 1), r3[2], objArr19);
            obj7 = cls5.getMethod((java.lang.String) objArr19[0], null);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1781008036, obj7);
        } else {
            str3 = str2;
        }
        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj7).invoke(null, null)).longValue();
        long j11 = i;
        long j12 = ~j11;
        long j13 = ~longValue3;
        long j14 = 1868893345 | j13;
        long j15 = (-60319516) + ((868 * longValue3) - 1622199424328L) + (((~(j13 | j12)) | (~(j12 | 1868893345))) * (-867)) + (((~j14) | (~(1868893345 | j11)) | (~(j13 | j11))) * (-1734)) + (((~(j14 | j12)) | (~(longValue3 | 1868893345 | j11)) | (~((-1868893346) | j13 | j11))) * 867);
        int i28 = ~i;
        int i29 = (((int) j15) & (((((-1116417) | i28) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 1433124547) + (((~((-136163137) | i28)) | (-1167132970)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))) | (((int) (j15 >> 32)) & ((((~((-827284433) | i)) | 2030456452) * (-668)) + 2017878894 + (((~(2030456452 | i)) | (-827284433)) * 1336) + (((-4788561) | i) * 668)));
        int i30 = i29 != 0 ? (i29 + 199) ^ i : i;
        if (i30 != i) {
            java.lang.Object[] objArr20 = {new int[]{i}, new int[]{i30}, null, null, new int[1]};
            java.lang.Object[] objArr21 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-1730617048) | i28)) * 979) - 34500950) + ((320229050 | i) * (-979)) + (((~(i | (-1730617048))) | (~(320229050 | i28))) * 979))};
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj8 == null) {
                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.combineMeasuredStates(0, 0), android.text.TextUtils.indexOf(str3, str3, 0, 0) + 2713, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                byte b5 = $$a[14];
                byte b6 = (byte) (b5 + 1);
                java.lang.Object[] objArr22 = new java.lang.Object[1];
                b(b6, (short) (b6 | 653), b5, objArr22);
                obj8 = cls6.getMethod((java.lang.String) objArr22[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
            }
            ((int[]) objArr20[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr21)).intValue();
            return objArr20;
        }
        java.lang.Object[] objArr23 = new java.lang.Object[1];
        a(android.text.TextUtils.getTrimmedLength(str3) + 145, (char) (1600 - android.text.TextUtils.getCapsMode(str3, 0, 0)), android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 21, objArr23);
        java.lang.String intern8 = ((java.lang.String) objArr23[0]).intern();
        java.lang.Object[] objArr24 = new java.lang.Object[1];
        a((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, (char) (android.text.TextUtils.indexOf(str3, str3, 0) + 3424), 6 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr24);
        java.lang.Object[] objArr25 = {intern8, ((java.lang.String) objArr24[0]).intern()};
        java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
        if (obj9 == null) {
            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 39, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2213, (char) (android.view.MotionEvent.axisFromString(str3) + 1));
            java.lang.Object[] objArr26 = new java.lang.Object[1];
            b(r11[16], (short) ($$a[14] + 1), r11[2], objArr26);
            obj9 = cls7.getMethod((java.lang.String) objArr26[0], java.lang.String.class, java.lang.String.class);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj9);
        }
        long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj9).invoke(null, objArr25)).longValue();
        java.lang.String str13 = str3;
        long j16 = ((((306 * longValue4) + 166181060158L) + (((~(longValue4 | 543075358)) | (~(j11 | 543075358))) * 305)) + (((~longValue4) | (~(543075358 | j12))) * 305)) - 1278449960;
        int i31 = ((((int) (j16 >> 32)) & ((((((~((-1510233621) | i)) | (~((-18907265) | i28))) * 920) + 2038856378) + (((~(91914473 | i28)) | 1510233620) * 920)) + ((((~((-1510233621) | i28)) | (~(1602148093 | i))) | (~((-18907265) | i))) * 920))) | (((int) j16) & (((((~((-1098909717) | i)) * 623) + 368820760) + ((67707393 | i28) * (-623))) + ((((~(203012043 | i)) | 1098909716) | (~((-1234214367) | i))) * 623)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE : i;
        if (i31 != i) {
            java.lang.Object[] objArr27 = {new int[]{i}, new int[]{i31}, null, null, new int[1]};
            java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-1633091851) | i28)) | (~(417754247 | i))) * 959) + 478222995 + (((~(i | (-1633091851))) | (~(417754247 | i28))) * 959))};
            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj10 == null) {
                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.KeyEvent.getDeadChar(0, 0), 2712 - android.text.TextUtils.lastIndexOf(str13, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                byte b7 = $$a[14];
                byte b8 = (byte) (b7 + 1);
                java.lang.Object[] objArr29 = new java.lang.Object[1];
                b(b8, (short) (b8 | 653), b7, objArr29);
                obj10 = cls8.getMethod((java.lang.String) objArr29[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
            }
            ((int[]) objArr27[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr28)).intValue();
            return objArr27;
        }
        java.lang.String str14 = str13;
        java.lang.Object[] objArr30 = new java.lang.Object[1];
        a(172 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (android.text.TextUtils.getOffsetBefore(str14, 0) + 38059), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31, objArr30);
        java.lang.String intern9 = ((java.lang.String) objArr30[0]).intern();
        java.lang.Object[] objArr31 = new java.lang.Object[1];
        a(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 202, (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 20020), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 23, objArr31);
        java.lang.String intern10 = ((java.lang.String) objArr31[0]).intern();
        java.lang.Object[] objArr32 = new java.lang.Object[1];
        a(226 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (63836 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 28 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr32);
        java.lang.String intern11 = ((java.lang.String) objArr32[0]).intern();
        java.lang.Object[] objArr33 = new java.lang.Object[1];
        a(android.view.View.MeasureSpec.getSize(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 14 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr33);
        java.lang.String[] strArr7 = {intern9, intern10, intern11, ((java.lang.String) objArr33[0]).intern()};
        int i32 = 0;
        while (true) {
            if (i32 >= 4) {
                str4 = str14;
                i6 = i;
                break;
            }
            java.lang.Object[] objArr34 = {strArr7[i32]};
            java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
            if (obj11 == null) {
                java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.View.getDefaultSize(0, 0), 3161 - android.text.TextUtils.getOffsetBefore(str14, 0), (char) (33099 - android.view.View.getDefaultSize(0, 0)));
                java.lang.Object[] objArr35 = new java.lang.Object[1];
                b((byte) (-$$a[21]), (short) 612, r13[23], objArr35);
                obj11 = cls9.getMethod((java.lang.String) objArr35[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj11);
            }
            long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj11).invoke(null, objArr34)).longValue();
            long j17 = ~((-103630091) | longValue5);
            str4 = str14;
            long j18 = ~longValue5;
            int i33 = i32;
            long j19 = ~(j12 | 103630090);
            long j20 = ((-1187) * longValue5) + 61659903550L + (((~(longValue5 | j12)) | j17) * (-1188)) + (((~(j18 | j11)) | j17 | j19) * 594) + ((j19 | (~(j18 | 103630090)) | (~(j18 | j12))) * 594) + 891804813;
            int i34 = ~(602624688 | i);
            if (((((int) j20) & ((((~(1687956446 | i28)) * 979) - 1838704386) + ((250730036 | i) * (-979)) + (((~(1687956446 | i)) | (~(250730036 | i28))) * 979))) | (((int) (j20 >> 32)) & ((((((~((-602624689) | i)) | 564855472) | (~((-834601723) | i))) * (-880)) - 818885110) + (((~((-602624689) | i28)) | 834601722 | i34) * (-880)) + (i34 * 880)))) != 0) {
                i6 = (i33 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) ^ i;
                break;
            }
            i32 = i33 + 1;
            str14 = str4;
        }
        if (i6 != i) {
            java.lang.Object[] objArr36 = {new int[]{i}, new int[]{i6}, null, null, new int[1]};
            int i35 = ~((-699684373) | i);
            java.lang.Object[] objArr37 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((691290112 | i35) * (-280)) + 1038329893 + ((i35 | (~((-1351161726) | i))) * 140) + (((~((-8394261) | i)) | (~((-691290113) | i28)) | (~((-1342767466) | i28))) * 140))};
            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj12 == null) {
                java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.widget.ExpandableListView.getPackedPositionGroup(0L), android.view.KeyEvent.keyCodeFromString(str4) + 2713, (char) ((-1) - android.view.MotionEvent.axisFromString(str4)));
                byte b9 = $$a[14];
                byte b10 = (byte) (b9 + 1);
                java.lang.Object[] objArr38 = new java.lang.Object[1];
                b(b10, (short) (b10 | 653), b9, objArr38);
                obj12 = cls10.getMethod((java.lang.String) objArr38[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj12);
            }
            ((int[]) objArr36[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr37)).intValue();
            return objArr36;
        }
        java.lang.Object[] objArr39 = new java.lang.Object[1];
        a(267 - android.view.View.MeasureSpec.getMode(0), (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 25122), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13, objArr39);
        java.lang.Object[] objArr40 = {((java.lang.String) objArr39[0]).intern()};
        java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
        if (obj13 == null) {
            java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 40, 1921 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.view.View.getDefaultSize(0, 0));
            java.lang.Object[] objArr41 = new java.lang.Object[1];
            b(r4[16], (short) ($$a[14] + 1), r4[2], objArr41);
            obj13 = cls11.getMethod((java.lang.String) objArr41[0], java.lang.String.class);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj13);
        }
        java.lang.String str15 = (java.lang.String) ((java.lang.reflect.Method) obj13).invoke(null, objArr40);
        if (str15 != null) {
            java.lang.Object[] objArr42 = new java.lang.Object[1];
            a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 9 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr42);
            if (str15.contains(((java.lang.String) objArr42[0]).intern())) {
                i7 = i ^ 250;
                if (i7 == i) {
                    java.lang.Object[] objArr43 = {new int[]{i}, new int[]{i7}, null, null, new int[1]};
                    java.lang.Object[] objArr44 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-1344630371) | i28)) | (~((-706215728) | i)) | (~(706215727 | i28))) * 959) + 1709563890 + (((~(i | (-1344630371))) | (~((-706215728) | i28)) | (~(706215727 | i))) * 959))};
                    java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj14 == null) {
                        java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 50, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2713, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        byte b11 = $$a[14];
                        byte b12 = (byte) (b11 + 1);
                        java.lang.Object[] objArr45 = new java.lang.Object[1];
                        b(b12, (short) (b12 | 653), b11, objArr45);
                        obj14 = cls12.getMethod((java.lang.String) objArr45[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj14);
                    }
                    ((int[]) objArr43[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr44)).intValue();
                    return objArr43;
                }
                java.lang.Object[] objArr46 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE, (char) (51865 - android.view.KeyEvent.normalizeMetaState(0)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 17, objArr46);
                java.lang.String intern12 = ((java.lang.String) objArr46[0]).intern();
                java.lang.Object[] objArr47 = new java.lang.Object[1];
                a(306 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 7 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr47);
                java.lang.String intern13 = ((java.lang.String) objArr47[0]).intern();
                java.io.File file2 = new java.io.File(intern12);
                if (file2.exists() && file2.isFile()) {
                    try {
                        java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(file2));
                        str5 = str4;
                        try {
                            java.lang.Object[] objArr48 = new java.lang.Object[1];
                            a(311 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 55366), android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 3, objArr48);
                            java.util.Scanner useDelimiter = scanner.useDelimiter(((java.lang.String) objArr48[0]).intern());
                            next3 = useDelimiter.hasNext() ? useDelimiter.next() : str5;
                            useDelimiter.close();
                        } catch (java.io.IOException unused) {
                        }
                    } catch (java.io.IOException unused2) {
                    }
                    if (next3.contains(intern13)) {
                        int i36 = values;
                        int i37 = i36 + 113;
                        AlternateContactlessPaymentDataJson = i37 % 128;
                        if (i37 % 2 == 0) {
                            int i38 = i36 + 73;
                            AlternateContactlessPaymentDataJson = i38 % 128;
                            i8 = i38 % 2 != 0 ? i ^ 16916 : i ^ 251;
                            if (i8 != i) {
                                java.lang.Object[] objArr49 = {new int[]{i}, new int[]{i8}, null, null, new int[1]};
                                java.lang.Object[] objArr50 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((r1 * 992) - 1556536159) + (((~((-442008538) | i)) | 440435096 | (~(1610411001 | i28))) * (-496)) + ((1608837560 | i) * 496))};
                                java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj15 == null) {
                                    java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 50, 2712 - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                    byte b13 = $$a[14];
                                    byte b14 = (byte) (b13 + 1);
                                    java.lang.Object[] objArr51 = new java.lang.Object[1];
                                    b(b14, (short) (b14 | 653), b13, objArr51);
                                    obj15 = cls13.getMethod((java.lang.String) objArr51[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj15);
                                }
                                ((int[]) objArr49[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr50)).intValue();
                                return objArr49;
                            }
                            java.lang.Object[] objArr52 = new java.lang.Object[1];
                            a((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 314, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), 'G' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr52);
                            java.lang.Object[] objArr53 = {((java.lang.String) objArr52[0]).intern()};
                            java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj16 == null) {
                                java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 40, android.graphics.Color.argb(0, 0, 0, 0) + 1921, (char) (android.os.Process.getGidForName(str5) + 1));
                                java.lang.Object[] objArr54 = new java.lang.Object[1];
                                b(r4[16], (short) ($$a[14] + 1), r4[2], objArr54);
                                obj16 = cls14.getMethod((java.lang.String) objArr54[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj16);
                            }
                            java.lang.String lowerCase = ((java.lang.String) ((java.lang.reflect.Method) obj16).invoke(null, objArr53)).toLowerCase();
                            java.lang.Object[] objArr55 = new java.lang.Object[1];
                            a(android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 338, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 4 - android.text.TextUtils.getOffsetAfter(str5, 0), objArr55);
                            int i39 = lowerCase.contains(((java.lang.String) objArr55[0]).intern()) ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE : i;
                            if (i39 != i) {
                                java.lang.Object[] objArr56 = {new int[]{i}, new int[]{i39}, null, null, new int[1]};
                                java.lang.Object[] objArr57 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-83919113) | i28)) | (~(1072627085 | i))) * 988) - 470961335) + (((~(i | (-1062138125))) | 978219012 | (~(1072627085 | i28))) * 988))};
                                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj17 == null) {
                                    java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 50, 2713 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                    byte b15 = $$a[14];
                                    byte b16 = (byte) (b15 + 1);
                                    java.lang.Object[] objArr58 = new java.lang.Object[1];
                                    b(b16, (short) (b16 | 653), b15, objArr58);
                                    obj17 = cls15.getMethod((java.lang.String) objArr58[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj17);
                                }
                                ((int[]) objArr56[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj17).invoke(null, objArr57)).intValue();
                                return objArr56;
                            }
                            java.lang.Object[] objArr59 = new java.lang.Object[1];
                            a(289 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (51866 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 17 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr59);
                            java.lang.String intern14 = ((java.lang.String) objArr59[0]).intern();
                            java.lang.Object[] objArr60 = new java.lang.Object[1];
                            a(android.os.Process.getGidForName(str5) + com.visa.cbp.getCertUsage.isReperso, (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 41926), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6, objArr60);
                            java.lang.String intern15 = ((java.lang.String) objArr60[0]).intern();
                            java.io.File file3 = new java.io.File(intern14);
                            if (file3.exists() && file3.isFile()) {
                                try {
                                    java.util.Scanner scanner2 = new java.util.Scanner(new java.io.FileInputStream(file3));
                                    java.lang.Object[] objArr61 = new java.lang.Object[1];
                                    a(311 - android.view.MotionEvent.axisFromString(str5), (char) (android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 55368), 3 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr61);
                                    java.util.Scanner useDelimiter2 = scanner2.useDelimiter(((java.lang.String) objArr61[0]).intern());
                                    next2 = useDelimiter2.hasNext() ? useDelimiter2.next() : str5;
                                    useDelimiter2.close();
                                } catch (java.io.IOException unused3) {
                                }
                                if (next2.contains(intern15)) {
                                    i9 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                    str6 = str5;
                                    if (i9 == i) {
                                        java.lang.Object[] objArr62 = {new int[]{i}, new int[]{i9}, null, null, new int[1]};
                                        java.lang.Object[] objArr63 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~((-831868937) | i)) | 1076363781) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) - 491005408) + ((~((-831868937) | i28)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))};
                                        java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj18 == null) {
                                            java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 50, (android.os.Process.myTid() >> 22) + 2713, (char) android.view.View.resolveSize(0, 0));
                                            byte b17 = $$a[14];
                                            byte b18 = (byte) (b17 + 1);
                                            java.lang.Object[] objArr64 = new java.lang.Object[1];
                                            b(b18, (short) (b18 | 653), b17, objArr64);
                                            obj18 = cls16.getMethod((java.lang.String) objArr64[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj18);
                                        }
                                        ((int[]) objArr62[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj18).invoke(null, objArr63)).intValue();
                                        return objArr62;
                                    }
                                    java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1102036426);
                                    if (obj19 == null) {
                                        str7 = str6;
                                        java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44, 2762 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                                        java.lang.Object[] objArr65 = new java.lang.Object[1];
                                        b(r3[16], (short) ($$a[14] + 1), r3[2], objArr65);
                                        obj19 = cls17.getMethod((java.lang.String) objArr65[0], null);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1102036426, obj19);
                                    } else {
                                        str7 = str6;
                                    }
                                    long j21 = ~((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, null)).longValue();
                                    long j22 = ((r11 * (-489)) - 231238023655L) + ((470953204 | j21 | j12) * (-490)) + (((~(j21 | (-470953205))) | (~(j21 | j11))) * 490) + 231363059928L;
                                    if (((((int) (j22 >> 32)) & ((((~((-654705953) | i28)) | (~((-782520459) | i28))) * (-867)) + 1972008040 + (((~((-654705953) | i)) | 637796352 | (~((-782520459) | i))) * (-1734)) + (((~((-637796353) | i28)) | (~((-16909601) | i)) | (~((-144724107) | i))) * 867))) | (((int) j22) & ((((((~((-522040328) | i28)) | 336068609) | (~((-1959266738) | i28))) * 464) - 1712469243) + (((-185971719) | i) * (-464)) + (((~((-1959266738) | i)) | 336068609) * 464)))) == 1) {
                                        AlternateContactlessPaymentDataJson = (values + 113) % 128;
                                        java.lang.Object[] objArr66 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                        java.lang.Object[] objArr67 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~((-731791876) | i28)) | 553664513 | (~(1319054222 | i28))) * (-397)) + 74448757 + ((i | 1694591373) * 397))};
                                        java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj20 == null) {
                                            java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 50, 2713 - android.view.View.MeasureSpec.getMode(0), (char) android.graphics.Color.green(0));
                                            byte b19 = $$a[14];
                                            byte b20 = (byte) (b19 + 1);
                                            java.lang.Object[] objArr68 = new java.lang.Object[1];
                                            b(b20, (short) (b20 | 653), b19, objArr68);
                                            obj20 = cls18.getMethod((java.lang.String) objArr68[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj20);
                                        }
                                        ((int[]) objArr66[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj20).invoke(null, objArr67)).intValue();
                                        return objArr66;
                                    }
                                    java.lang.Object[] objArr69 = {1};
                                    java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                    if (obj21 == null) {
                                        java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 28, 2365 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) android.view.View.MeasureSpec.getSize(0));
                                        java.lang.Object[] objArr70 = new java.lang.Object[1];
                                        b(r11[16], (short) ($$a[14] + 1), r11[2], objArr70);
                                        obj21 = cls19.getMethod((java.lang.String) objArr70[0], java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj21);
                                    }
                                    long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj21).invoke(null, objArr69)).longValue();
                                    long j23 = ~((-795362563) | longValue6);
                                    java.lang.String str16 = str7;
                                    long j24 = 612547637 + ((-396) * longValue6) + 316554299676L + (((~(j12 | longValue6)) | (~(j12 | (-795362563))) | j23) * (-397)) + ((-397) * j23) + ((j11 | j23 | (~((~longValue6) | 795362562))) * 397);
                                    int i40 = (int) (j24 >> 32);
                                    int i41 = ~((-1136099092) | i);
                                    int i42 = ((i40 & (((((~((-1523352246) | i)) * 920) + 2038856378) + (((~(86125834 | i28)) | 1523352245) * 920)) + (((~((-1523352246) | i28)) | (~(1609478079 | i))) * 920))) | (((int) j24) & ((((1380297093 | i41) * (-658)) + 1881144733) + ((i41 | 1107634433) * 658)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE : i;
                                    if (i42 != i) {
                                        java.lang.Object[] objArr71 = {new int[]{i}, new int[]{i42}, null, null, new int[1]};
                                        java.lang.Object[] objArr72 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(1027399025 | i)) | 1023447072) * (-756)) - 936830371) + ((1027399025 | i28) * 756))};
                                        java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj22 == null) {
                                            java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), android.view.MotionEvent.axisFromString(str16) + 2714, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                            byte b21 = $$a[14];
                                            byte b22 = (byte) (b21 + 1);
                                            java.lang.Object[] objArr73 = new java.lang.Object[1];
                                            b(b22, (short) (b22 | 653), b21, objArr73);
                                            obj22 = cls20.getMethod((java.lang.String) objArr73[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj22);
                                        }
                                        ((int[]) objArr71[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr72)).intValue();
                                        return objArr71;
                                    }
                                    java.lang.Object[] objArr74 = new java.lang.Object[1];
                                    a(315 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) android.text.TextUtils.indexOf(str16, str16, 0, 0), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 23, objArr74);
                                    java.lang.Object[] objArr75 = {((java.lang.String) objArr74[0]).intern()};
                                    java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj23 == null) {
                                        java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.getOffsetBefore(str16, 0), 1921 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                        java.lang.Object[] objArr76 = new java.lang.Object[1];
                                        b(r11[16], (short) ($$a[14] + 1), r11[2], objArr76);
                                        obj23 = cls21.getMethod((java.lang.String) objArr76[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj23);
                                    }
                                    java.lang.Object invoke2 = ((java.lang.reflect.Method) obj23).invoke(null, objArr75);
                                    if (invoke2 != null) {
                                        java.lang.Object[] objArr77 = {invoke2, 42};
                                        java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                        if (obj24 == null) {
                                            java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str16, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 29, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2594, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                            java.lang.Object[] objArr78 = new java.lang.Object[1];
                                            b(r11[16], (short) ($$a[14] + 1), r11[2], objArr78);
                                            obj24 = cls22.getMethod((java.lang.String) objArr78[0], java.lang.String.class, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj24);
                                        }
                                        long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr77)).longValue();
                                        long j25 = ~longValue7;
                                        str8 = str16;
                                        long j26 = 1723263750 + (407 * longValue7) + 188796106530L + (((~(j12 | (-466163226) | longValue7)) | (~(j25 | j11))) * (-406)) + ((~(j25 | j12 | (-466163226))) * (-406)) + (((~(466163225 | j11)) | (~(j12 | longValue7))) * 406);
                                        if (((((int) j26) & (((~(2069871535 | i28)) * 433) + 252059830 + (((~((-324842244) | i)) | 1762068653) * (-433)) + (((~(1762068653 | i)) | 1745029292) * 433))) | (((int) (j26 >> 32)) & ((((~((-1105382138) | i)) | 1378173000) * 398) + 761452188 + (((~((-1105382138) | i28)) | 1378173000) * 398)))) == 1986687685) {
                                            j = j11;
                                            j2 = j12;
                                            java.lang.Object[] objArr79 = new java.lang.Object[1];
                                            a(450 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) android.text.TextUtils.getTrimmedLength(str8), 16 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr79);
                                            java.lang.Object[] objArr80 = {((java.lang.String) objArr79[0]).intern()};
                                            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj2 == null) {
                                                java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.view.Gravity.getAbsoluteGravity(0, 0) + 1921, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                java.lang.Object[] objArr81 = new java.lang.Object[1];
                                                b(r5[16], (short) ($$a[14] + 1), r5[2], objArr81);
                                                obj2 = cls23.getMethod((java.lang.String) objArr81[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj2);
                                            }
                                            invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr80);
                                            if (invoke != null) {
                                                str9 = str8;
                                                i10 = i;
                                                i11 = 0;
                                            } else {
                                                java.lang.Object[] objArr82 = {invoke, 42};
                                                java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                if (obj25 == null) {
                                                    java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 2594, (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                                    java.lang.Object[] objArr83 = new java.lang.Object[1];
                                                    b(r4[16], (short) ($$a[14] + 1), r4[2], objArr83);
                                                    obj25 = cls24.getMethod((java.lang.String) objArr83[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj25);
                                                }
                                                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj25).invoke(null, objArr82)).longValue();
                                                long j27 = ~longValue8;
                                                long j28 = 159549374 | j27;
                                                str9 = str8;
                                                long j29 = ((868 * longValue8) - 138488857500L) + (((~(j27 | j2)) | (~(j2 | 159549374))) * (-867)) + (((~(j | 159549374)) | (~j28) | (~(j27 | j))) * (-1734)) + (((~(j28 | j2)) | (~(longValue8 | 159549374 | j)) | (~((-159549375) | j27 | j))) * 867) + 1416649899;
                                                i10 = i;
                                                i11 = (((int) (j29 >> 32)) & (((((~(1993864941 | i28)) | (~((-139265) | i28))) * (-184)) - 1019427974) + (((~(278388897 | i28)) | 1715476044 | (~((-1715615309) | i28))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 341674896)) | (((int) j29) & ((((((~(1612392374 | i28)) | (~((-175165965) | i10))) * (-370)) - 635053777) + ((((~(1612392374 | i10)) | (~((-175165965) | i28))) | 1611343282) * (-370))) - 803439804));
                                            }
                                            if (i11 != 1986687685 || i11 == -1514516938) {
                                                str10 = str9;
                                            } else {
                                                str10 = str9;
                                                java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                a(1165 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 58337), 14 - android.text.TextUtils.getCapsMode(str10, 0, 0), objArr84);
                                                java.lang.String intern16 = ((java.lang.String) objArr84[0]).intern();
                                                java.lang.Object[] objArr85 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1179, (char) ((-1) - android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 25 - android.os.Process.getGidForName(str10), objArr85);
                                                java.lang.String intern17 = ((java.lang.String) objArr85[0]).intern();
                                                java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                a(1205 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.view.View.MeasureSpec.getSize(0) + 60300), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17, objArr86);
                                                java.lang.String intern18 = ((java.lang.String) objArr86[0]).intern();
                                                java.lang.Object[] objArr87 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1222, (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 62380), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 17, objArr87);
                                                java.lang.String intern19 = ((java.lang.String) objArr87[0]).intern();
                                                java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                a(1239 - android.graphics.Color.red(0), (char) android.text.TextUtils.getCapsMode(str10, 0, 0), android.graphics.ImageFormat.getBitsPerPixel(0) + 16, objArr88);
                                                java.lang.String intern20 = ((java.lang.String) objArr88[0]).intern();
                                                java.lang.Object[] objArr89 = new java.lang.Object[1];
                                                a(1254 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 41235), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 37, objArr89);
                                                java.lang.String intern21 = ((java.lang.String) objArr89[0]).intern();
                                                java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                a(android.widget.ExpandableListView.getPackedPositionChild(0L) + 1292, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 20030), android.text.TextUtils.indexOf(str10, str10, 0) + 12, objArr90);
                                                java.lang.String intern22 = ((java.lang.String) objArr90[0]).intern();
                                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1302, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 12 - android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr91);
                                                java.lang.String intern23 = ((java.lang.String) objArr91[0]).intern();
                                                java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                a(1316 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (52958 - (android.os.Process.myTid() >> 22)), android.view.KeyEvent.normalizeMetaState(0) + 22, objArr92);
                                                java.lang.String intern24 = ((java.lang.String) objArr92[0]).intern();
                                                java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getTapTimeout() >> 16) + 1338, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), 31 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr93);
                                                java.lang.String intern25 = ((java.lang.String) objArr93[0]).intern();
                                                java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                a(1369 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (16557 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 11 - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr94);
                                                java.lang.String intern26 = ((java.lang.String) objArr94[0]).intern();
                                                java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                a((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1381, (char) (20844 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 12, objArr95);
                                                java.lang.String intern27 = ((java.lang.String) objArr95[0]).intern();
                                                java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                a(android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1394, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 12 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr96);
                                                java.lang.String intern28 = ((java.lang.String) objArr96[0]).intern();
                                                java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1405, (char) (android.view.View.MeasureSpec.getSize(0) + 48259), android.text.TextUtils.getCapsMode(str10, 0, 0) + 12, objArr97);
                                                java.lang.String intern29 = ((java.lang.String) objArr97[0]).intern();
                                                java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                a(1417 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (22493 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 12, objArr98);
                                                java.lang.String intern30 = ((java.lang.String) objArr98[0]).intern();
                                                java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                a(1429 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 14 - android.text.TextUtils.getCapsMode(str10, 0, 0), objArr99);
                                                java.lang.String intern31 = ((java.lang.String) objArr99[0]).intern();
                                                java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                a(1443 - android.text.TextUtils.getOffsetBefore(str10, 0), (char) (19153 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11, objArr100);
                                                java.lang.String intern32 = ((java.lang.String) objArr100[0]).intern();
                                                java.lang.Object[] objArr101 = new java.lang.Object[1];
                                                a(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1455, (char) (33378 - android.view.KeyEvent.getDeadChar(0, 0)), 23 - android.view.MotionEvent.axisFromString(str10), objArr101);
                                                java.lang.String intern33 = ((java.lang.String) objArr101[0]).intern();
                                                java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                a((android.os.Process.myPid() >> 22) + 1479, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 20, objArr102);
                                                java.lang.String[] strArr8 = {intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, intern29, intern30, intern31, intern32, intern33, ((java.lang.String) objArr102[0]).intern()};
                                                int i43 = 0;
                                                while (i43 < 19) {
                                                    java.lang.String str17 = strArr8[i43];
                                                    java.lang.Object[] objArr103 = {str17};
                                                    java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                    if (obj26 == null) {
                                                        java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 3161 - android.text.TextUtils.getCapsMode(str10, 0, 0), (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 33099));
                                                        java.lang.Object[] objArr104 = new java.lang.Object[1];
                                                        b((byte) (-$$a[21]), (short) 612, r8[23], objArr104);
                                                        obj26 = cls25.getMethod((java.lang.String) objArr104[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj26);
                                                    }
                                                    long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr103)).longValue();
                                                    long j30 = ~longValue9;
                                                    long j31 = 933573871 | longValue9;
                                                    java.lang.String[] strArr9 = strArr8;
                                                    int i44 = i43;
                                                    long j32 = (longValue9 * (-751)) + 701113977872L + (((~(j30 | 933573871)) | (~(j | 933573871))) * 1504) + ((~(j31 | j)) * (-1504)) + (((~j31) | (~(j30 | (-933573872)))) * 752) + 1929008775;
                                                    int i45 = (int) (j32 >> 32);
                                                    int i46 = (int) j32;
                                                    int i47 = ~((-1290568233) | i28);
                                                    if (((i45 & (((((-2111138303) | i28) * 1324) - 818884594) + (((~((-1037125975) | i10)) | (~((-1820614911) | i10))) * (-1324)) + 1379514480)) | (i46 & ((((~(1290568232 | i10)) | (~((-146658178) | i28)) | i47) * (-516)) + 1010672057 + (((~(1291703209 | i10)) | (~((-1145045033) | i28))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((i47 | 1145045032) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR)))) == 0) {
                                                        java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                        a(1428 - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13, objArr105);
                                                        if (str17.equals(((java.lang.String) objArr105[0]).intern())) {
                                                            java.lang.Object[] objArr106 = {str17};
                                                            java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                            if (obj27 == null) {
                                                                java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 36, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3161, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 33100));
                                                                java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                                b((byte) (-$$a[21]), (short) 612, r3[23], objArr107);
                                                                obj27 = cls26.getMethod((java.lang.String) objArr107[0], java.lang.String.class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj27);
                                                            }
                                                            long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr106)).longValue();
                                                            long j33 = ~longValue10;
                                                            long j34 = ~(438821541 | longValue10);
                                                            long j35 = (longValue10 * 371) + 162802791711L + (((~(j | (-438821542))) | (~(j33 | j2))) * (-370)) + (((~(j33 | j)) | (~(j2 | (-438821542))) | j34) * (-370)) + (j34 * 370) + 556613362;
                                                            if (((((int) j35) & (((((-487147350) | r2) * 764) - 116347399) + (((~((-487147350) | i28)) | 84427009) * (-1528)) + (((~((-950079061) | i28)) | 631785729) * 764))) | (((int) (j35 >> 32)) & ((((((~((-463807719) | i10)) | 436543684) * 1504) - 1320242614) + ((~((-27264035) | i10)) * (-1504))) - 969202720))) != 0) {
                                                            }
                                                        }
                                                        i43 = i44 + 1;
                                                        strArr8 = strArr9;
                                                    }
                                                    i15 = i44;
                                                }
                                                i15 = -1;
                                                if (i15 >= 0 && (i16 = i10 ^ (i15 + 130)) != i10) {
                                                    java.lang.Object[] objArr108 = {new int[]{i10}, new int[]{i16}, null, null, new int[1]};
                                                    int i48 = ~(1251534806 | i10);
                                                    java.lang.Object[] objArr109 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((1075339844 | i48) * (-196)) - 2105383463) + ((i48 | 176194962) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE))};
                                                    java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj28 == null) {
                                                        java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2713 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.view.View.combineMeasuredStates(0, 0));
                                                        byte b23 = $$a[14];
                                                        byte b24 = (byte) (b23 + 1);
                                                        java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                        b(b24, (short) (b24 | 653), b23, objArr110);
                                                        obj28 = cls27.getMethod((java.lang.String) objArr110[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj28);
                                                    }
                                                    ((int[]) objArr108[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr109)).intValue();
                                                    return objArr108;
                                                }
                                            }
                                            java.lang.Object[] objArr111 = new java.lang.Object[1];
                                            a(1506 - android.os.Process.getGidForName(str10), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13, objArr111);
                                            java.lang.String intern34 = ((java.lang.String) objArr111[0]).intern();
                                            java.lang.Object[] objArr112 = new java.lang.Object[1];
                                            a(1520 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.text.TextUtils.indexOf(str10, str10, 0) + 23593), (android.os.Process.myTid() >> 22) + 5, objArr112);
                                            java.lang.String[] strArr10 = {intern34, ((java.lang.String) objArr112[0]).intern()};
                                            java.lang.Object[] objArr113 = new java.lang.Object[1];
                                            a(android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1526, (char) (50572 - android.view.View.MeasureSpec.getSize(0)), android.view.View.MeasureSpec.getMode(0) + 15, objArr113);
                                            java.lang.String intern35 = ((java.lang.String) objArr113[0]).intern();
                                            java.lang.Object[] objArr114 = new java.lang.Object[1];
                                            a(android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1541, (char) android.view.View.getDefaultSize(0, 0), android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 20, objArr114);
                                            java.lang.String intern36 = ((java.lang.String) objArr114[0]).intern();
                                            java.lang.Object[] objArr115 = new java.lang.Object[1];
                                            a(android.text.TextUtils.getOffsetBefore(str10, 0) + 1559, (char) (android.view.MotionEvent.axisFromString(str10) + 21772), 15 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr115);
                                            java.lang.String[] strArr11 = {intern35, intern36, ((java.lang.String) objArr115[0]).intern()};
                                            java.lang.Object[] objArr116 = new java.lang.Object[1];
                                            a(1574 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 22, objArr116);
                                            java.lang.String intern37 = ((java.lang.String) objArr116[0]).intern();
                                            java.lang.Object[] objArr117 = new java.lang.Object[1];
                                            a(1594 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 10, objArr117);
                                            java.lang.String[] strArr12 = {intern37, ((java.lang.String) objArr117[0]).intern()};
                                            java.lang.Object[] objArr118 = new java.lang.Object[1];
                                            a(1603 - android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 12 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr118);
                                            c2 = 0;
                                            java.lang.String intern38 = ((java.lang.String) objArr118[0]).intern();
                                            java.lang.Object[] objArr119 = new java.lang.Object[1];
                                            a(340 - android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (41926 - android.graphics.Color.green(0)), 7 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr119);
                                            java.lang.String[] strArr13 = {intern38, ((java.lang.String) objArr119[0]).intern()};
                                            java.lang.Object[] objArr120 = new java.lang.Object[1];
                                            a(1615 - android.text.TextUtils.getTrimmedLength(str10), (char) (26428 - android.view.Gravity.getAbsoluteGravity(0, 0)), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.GS, objArr120);
                                            java.lang.String intern39 = ((java.lang.String) objArr120[0]).intern();
                                            java.lang.Object[] objArr121 = new java.lang.Object[1];
                                            a(1594 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 9 - android.os.Process.getGidForName(str10), objArr121);
                                            java.lang.String[][] strArr14 = {strArr10, strArr11, strArr12, strArr13, new java.lang.String[]{intern39, ((java.lang.String) objArr121[0]).intern()}};
                                            i12 = 0;
                                            int i49 = -1;
                                            loop4: while (true) {
                                                if (i12 < 5) {
                                                    i13 = i10;
                                                    break;
                                                }
                                                java.lang.String[] strArr15 = strArr14[i12];
                                                java.lang.String str18 = strArr15[c2];
                                                java.lang.String[] strArr16 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr15, 1, strArr15.length);
                                                int length = strArr16.length;
                                                int i50 = 0;
                                                while (i50 < length) {
                                                    java.lang.Object[] objArr122 = {str18, strArr16[i50]};
                                                    java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                                    if (obj29 == null) {
                                                        java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 39, 2213 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.graphics.Color.green(0));
                                                        strArr2 = strArr14;
                                                        strArr3 = strArr16;
                                                        java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                        b(r14[16], (short) ($$a[14] + 1), r14[2], objArr123);
                                                        obj29 = cls28.getMethod((java.lang.String) objArr123[0], java.lang.String.class, java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj29);
                                                    } else {
                                                        strArr2 = strArr14;
                                                        strArr3 = strArr16;
                                                    }
                                                    long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj29).invoke(null, objArr122)).longValue();
                                                    long j36 = ~longValue11;
                                                    int i51 = i50;
                                                    long j37 = ((((((-282) * longValue11) - 81215554124L) + (((~(j | 285970260)) | (~(longValue11 | 285970260))) * (-283))) + ((~((-285970261) | j36)) * 283)) + ((~((285970260 | j36) | j)) * 283)) - 449404341;
                                                    int i52 = ~(836291674 | i10);
                                                    if (((((int) j37) & ((((1235489185 | i52) * (-658)) - 2057983403) + ((i52 | 1210323361) * 658))) | (((int) (j37 >> 32)) & (((((~(749155797 | i10)) | (-2108585088)) * (-366)) - 1529896534) + (((~((-1359495211) | i10)) | 65920) * 366)))) != 0) {
                                                        i13 = i10 ^ (i49 + 171);
                                                        break loop4;
                                                    }
                                                    i50 = i51 + 1;
                                                    i49++;
                                                    strArr14 = strArr2;
                                                    strArr16 = strArr3;
                                                }
                                                i12++;
                                                c2 = 0;
                                            }
                                            if (i13 == i10) {
                                                java.lang.Object[] objArr124 = {new int[]{i10}, new int[]{i13}, null, null, new int[1]};
                                                java.lang.Object[] objArr125 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~((-1284716485) | i28)) | 209860036) * 446) - 2093446413) + (((~((-1074856449) | i10)) | 556269577) * 446)) - 891704456)};
                                                java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj30 == null) {
                                                    java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str10, str10) + 50, android.graphics.Color.green(0) + 2713, (char) android.text.TextUtils.indexOf(str10, str10, 0, 0));
                                                    byte b25 = $$a[14];
                                                    byte b26 = (byte) (b25 + 1);
                                                    java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                    b(b26, (short) (b26 | 653), b25, objArr126);
                                                    obj30 = cls29.getMethod((java.lang.String) objArr126[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj30);
                                                }
                                                ((int[]) objArr124[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr125)).intValue();
                                                return objArr124;
                                            }
                                            try {
                                                java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1643, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.text.TextUtils.getOffsetBefore(str10, 0) + 13, objArr127);
                                                java.lang.String intern40 = ((java.lang.String) objArr127[0]).intern();
                                                java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                a(1656 - android.graphics.Color.blue(0), (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 40816), 9 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr128);
                                                intern = ((java.lang.String) objArr128[0]).intern();
                                                file = new java.io.File(intern40);
                                            } catch (java.lang.Exception unused4) {
                                                i14 = i10 ^ 151;
                                            }
                                            if (file.exists() && file.isFile()) {
                                                try {
                                                    java.util.Scanner scanner3 = new java.util.Scanner(new java.io.FileInputStream(file));
                                                    java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                    a(312 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (55366 - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), '2' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr129);
                                                    java.util.Scanner useDelimiter3 = scanner3.useDelimiter(((java.lang.String) objArr129[0]).intern());
                                                    next = useDelimiter3.hasNext() ? useDelimiter3.next() : str10;
                                                    useDelimiter3.close();
                                                } catch (java.io.IOException unused5) {
                                                }
                                                if (next.contains(intern)) {
                                                    AlternateContactlessPaymentDataJson = (values + 1) % 128;
                                                    i14 = i10 ^ 150;
                                                    if (i14 == i10) {
                                                        java.lang.Object[] objArr130 = {new int[]{i10}, new int[]{i14}, null, null, new int[1]};
                                                        java.lang.Object[] objArr131 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(1467867622 | i28)) | (-2013260784) | (~((-37585315) | i10))) * 717) + 1465048578 + (((~(1467867622 | i10)) | (~((-37585315) | i28)) | (-2013260784)) * 717))};
                                                        java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj31 == null) {
                                                            java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51, 2712 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (android.os.Process.myTid() >> 22));
                                                            byte b27 = $$a[14];
                                                            byte b28 = (byte) (b27 + 1);
                                                            java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                            b(b28, (short) (b28 | 653), b27, objArr132);
                                                            obj31 = cls30.getMethod((java.lang.String) objArr132[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj31);
                                                        }
                                                        ((int[]) objArr130[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr131)).intValue();
                                                        return objArr130;
                                                    }
                                                    java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                    a(1664 - android.graphics.Color.green(0), (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), 47 - android.text.TextUtils.getTrimmedLength(str10), objArr133);
                                                    java.lang.Object[] objArr134 = {((java.lang.String) objArr133[0]).intern()};
                                                    java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                                    if (obj32 == null) {
                                                        java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.KeyEvent.getDeadChar(0, 0), android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3162, (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33099));
                                                        java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                        b(r3[16], (short) ($$a[14] + 1), r3[2], objArr135);
                                                        obj32 = cls31.getMethod((java.lang.String) objArr135[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj32);
                                                    }
                                                    long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj32).invoke(null, objArr134)).longValue();
                                                    long j38 = ((((((-301) * longValue12) + 142549622097L) + (((~((j2 | (-470460800)) | longValue12)) | (~((470460799 | longValue12) | j))) * (-302))) + ((~(((-470460800) | longValue12) | j)) * (-604))) + (((~((~longValue12) | 470460799)) | (~(longValue12 | j))) * 302)) - 1808128907;
                                                    int i53 = (int) (j38 >> 32);
                                                    int i54 = (int) j38;
                                                    int i55 = ~(427037384 | i28);
                                                    int i56 = (((i53 & ((((((~((-2008712355) | i10)) | 1159757824) * (-140)) + 1010715466) + ((~((-848954531) | i10)) * 70)) + (((~((-849028531) | i10)) | 1159831824) * 70))) | (i54 & ((((((~((-1864263795) | i28)) | 152305728) * (-1188)) + 1657140241) + ((((~(1864263794 | i10)) | 152305728) | i55) * 594)) + ((i55 | ((~(1864263794 | i28)) | (-2138995451))) * 594)))) * 263) ^ i10;
                                                    if (i56 == i10) {
                                                        java.lang.Object[] objArr136 = {new int[]{i10}, new int[]{i10}, null, null, new int[1]};
                                                        java.lang.Object[] objArr137 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((((~((-205884949) | i10)) | (~(1844961149 | i10))) * 69) + 2007815390) + (((~(1305841428 | i10)) | ((~(i10 | (-745004670))) | 539119721)) * (-69))) - 1412414208)};
                                                        java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj33 == null) {
                                                            java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2712 - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.View.resolveSize(0, 0));
                                                            byte b29 = $$a[14];
                                                            byte b30 = (byte) (b29 + 1);
                                                            java.lang.Object[] objArr138 = new java.lang.Object[1];
                                                            b(b30, (short) (b30 | 653), b29, objArr138);
                                                            obj33 = cls32.getMethod((java.lang.String) objArr138[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj33);
                                                        }
                                                        ((int[]) objArr136[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr137)).intValue();
                                                        return objArr136;
                                                    }
                                                    values = (AlternateContactlessPaymentDataJson + 29) % 128;
                                                    java.lang.Object[] objArr139 = {new int[]{i10}, new int[]{i56}, null, null, new int[1]};
                                                    java.lang.Object[] objArr140 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-4331171) | i10)) | (~(2046514927 | i28))) * (-318)) + 842962907 + (((~(14358251 | i10)) | 2032156676) * (-318)) + (((~((-14358252) | i10)) | (-2036487847)) * 318))};
                                                    java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj34 == null) {
                                                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 2713 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.os.Process.myPid() >> 22));
                                                        byte b31 = $$a[14];
                                                        byte b32 = (byte) (b31 + 1);
                                                        java.lang.Object[] objArr141 = new java.lang.Object[1];
                                                        b(b32, (short) (b32 | 653), b31, objArr141);
                                                        obj34 = cls33.getMethod((java.lang.String) objArr141[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj34);
                                                    }
                                                    ((int[]) objArr139[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr140)).intValue();
                                                    return objArr139;
                                                }
                                            }
                                            AlternateContactlessPaymentDataJson = (values + 113) % 128;
                                            i14 = i10;
                                            if (i14 == i10) {
                                            }
                                        }
                                    } else {
                                        str8 = str16;
                                    }
                                    java.lang.Object[] objArr142 = new java.lang.Object[1];
                                    a(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 314, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 23 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr142);
                                    java.lang.String intern41 = ((java.lang.String) objArr142[0]).intern();
                                    java.lang.Object[] objArr143 = new java.lang.Object[1];
                                    a(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 369, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10, objArr143);
                                    java.lang.String intern42 = ((java.lang.String) objArr143[0]).intern();
                                    java.lang.Object[] objArr144 = new java.lang.Object[1];
                                    a(379 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (11009 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), 7 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr144);
                                    java.lang.String intern43 = ((java.lang.String) objArr144[0]).intern();
                                    j = j11;
                                    java.lang.Object[] objArr145 = new java.lang.Object[1];
                                    a(386 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (24353 - android.graphics.Color.argb(0, 0, 0, 0)), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 8, objArr145);
                                    java.lang.String[] strArr17 = {intern41, intern42, intern43, ((java.lang.String) objArr145[0]).intern()};
                                    java.lang.Object[] objArr146 = new java.lang.Object[1];
                                    a(394 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 679), 17 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr146);
                                    java.lang.String intern44 = ((java.lang.String) objArr146[0]).intern();
                                    java.lang.Object[] objArr147 = new java.lang.Object[1];
                                    a((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 411, (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), android.view.View.MeasureSpec.getMode(0) + 7, objArr147);
                                    java.lang.String intern45 = ((java.lang.String) objArr147[0]).intern();
                                    java.lang.Object[] objArr148 = new java.lang.Object[1];
                                    a(418 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 36620), 8 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr148);
                                    java.lang.String intern46 = ((java.lang.String) objArr148[0]).intern();
                                    java.lang.Object[] objArr149 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE, (char) android.graphics.Color.alpha(0), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 11, objArr149);
                                    java.lang.String intern47 = ((java.lang.String) objArr149[0]).intern();
                                    java.lang.Object[] objArr150 = new java.lang.Object[1];
                                    a(435 - android.view.MotionEvent.axisFromString(str8), (char) (61186 - android.view.MotionEvent.axisFromString(str8)), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 14, objArr150);
                                    java.lang.String[] strArr18 = {intern44, intern45, intern46, intern47, ((java.lang.String) objArr150[0]).intern()};
                                    java.lang.Object[] objArr151 = new java.lang.Object[1];
                                    a(450 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), android.view.MotionEvent.axisFromString(str8) + 17, objArr151);
                                    java.lang.String intern48 = ((java.lang.String) objArr151[0]).intern();
                                    java.lang.Object[] objArr152 = new java.lang.Object[1];
                                    a(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 466, (char) (android.view.View.MeasureSpec.getMode(0) + 24852), android.graphics.Color.alpha(0) + 3, objArr152);
                                    java.lang.String intern49 = ((java.lang.String) objArr152[0]).intern();
                                    java.lang.Object[] objArr153 = new java.lang.Object[1];
                                    a(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 477, (char) (android.text.TextUtils.indexOf(str8, str8, 0, 0) + 31391), 22 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr153);
                                    java.lang.String intern50 = ((java.lang.String) objArr153[0]).intern();
                                    java.lang.Object[] objArr154 = new java.lang.Object[1];
                                    a((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 499, (char) (android.view.View.combineMeasuredStates(0, 0) + 42592), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 25, objArr154);
                                    java.lang.String intern51 = ((java.lang.String) objArr154[0]).intern();
                                    java.lang.Object[] objArr155 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 524, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 29 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr155);
                                    java.lang.String[] strArr19 = {intern48, intern49, str, intern50, intern51, ((java.lang.String) objArr155[0]).intern()};
                                    java.lang.Object[] objArr156 = new java.lang.Object[1];
                                    a(android.view.View.resolveSize(0, 0) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_ATC_OUT_SIDE_PERMISSIBLE_RANGE, (char) android.view.KeyEvent.getDeadChar(0, 0), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, objArr156);
                                    java.lang.String intern52 = ((java.lang.String) objArr156[0]).intern();
                                    java.lang.Object[] objArr157 = new java.lang.Object[1];
                                    a(android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 564, (char) (android.view.KeyEvent.normalizeMetaState(0) + 11261), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 8, objArr157);
                                    java.lang.String intern53 = ((java.lang.String) objArr157[0]).intern();
                                    java.lang.Object[] objArr158 = new java.lang.Object[1];
                                    a(android.graphics.Color.alpha(0) + 571, (char) android.view.KeyEvent.keyCodeFromString(str8), android.text.TextUtils.indexOf(str8, str8, 0, 0) + 6, objArr158);
                                    java.lang.String intern54 = ((java.lang.String) objArr158[0]).intern();
                                    java.lang.Object[] objArr159 = new java.lang.Object[1];
                                    a(577 - android.text.TextUtils.indexOf(str8, str8), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 6 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr159);
                                    java.lang.String[] strArr20 = {intern52, intern53, intern54, ((java.lang.String) objArr159[0]).intern()};
                                    java.lang.Object[] objArr160 = new java.lang.Object[1];
                                    a(android.view.View.MeasureSpec.getMode(0) + 583, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.graphics.Color.argb(0, 0, 0, 0) + 16, objArr160);
                                    java.lang.String intern55 = ((java.lang.String) objArr160[0]).intern();
                                    java.lang.Object[] objArr161 = new java.lang.Object[1];
                                    a(418 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (36619 - android.view.View.resolveSize(0, 0)), android.graphics.Color.blue(0) + 7, objArr161);
                                    java.lang.String intern56 = ((java.lang.String) objArr161[0]).intern();
                                    java.lang.Object[] objArr162 = new java.lang.Object[1];
                                    a(386 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (24353 - android.text.TextUtils.indexOf(str8, str8)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 8, objArr162);
                                    java.lang.String[] strArr21 = {intern55, intern56, ((java.lang.String) objArr162[0]).intern()};
                                    java.lang.Object[] objArr163 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getTapTimeout() >> 16) + 599, (char) ((-1) - android.os.Process.getGidForName(str8)), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14, objArr163);
                                    java.lang.String intern57 = ((java.lang.String) objArr163[0]).intern();
                                    java.lang.Object[] objArr164 = new java.lang.Object[1];
                                    a(android.graphics.Color.red(0) + 613, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr164);
                                    java.lang.String[] strArr22 = {intern57, ((java.lang.String) objArr164[0]).intern()};
                                    java.lang.Object[] objArr165 = new java.lang.Object[1];
                                    a(613 - android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9, objArr165);
                                    java.lang.String intern58 = ((java.lang.String) objArr165[0]).intern();
                                    java.lang.Object[] objArr166 = new java.lang.Object[1];
                                    a((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 623, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 1 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr166);
                                    java.lang.String[] strArr23 = {intern58, ((java.lang.String) objArr166[0]).intern()};
                                    java.lang.Object[] objArr167 = new java.lang.Object[1];
                                    a(android.graphics.Color.argb(0, 0, 0, 0) + 624, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 15, objArr167);
                                    java.lang.String intern59 = ((java.lang.String) objArr167[0]).intern();
                                    java.lang.Object[] objArr168 = new java.lang.Object[1];
                                    a(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 466, (char) (24852 - android.view.View.resolveSizeAndState(0, 0, 0)), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2, objArr168);
                                    java.lang.String intern60 = ((java.lang.String) objArr168[0]).intern();
                                    java.lang.Object[] objArr169 = new java.lang.Object[1];
                                    a(410 - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.os.Process.myPid() >> 22), 7 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr169);
                                    java.lang.String intern61 = ((java.lang.String) objArr169[0]).intern();
                                    java.lang.Object[] objArr170 = new java.lang.Object[1];
                                    a(640 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.view.Gravity.getAbsoluteGravity(0, 0) + 8, objArr170);
                                    java.lang.String intern62 = ((java.lang.String) objArr170[0]).intern();
                                    java.lang.Object[] objArr171 = new java.lang.Object[1];
                                    a(android.view.View.MeasureSpec.getMode(0) + androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 11, objArr171);
                                    java.lang.String intern63 = ((java.lang.String) objArr171[0]).intern();
                                    java.lang.Object[] objArr172 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 436, (char) (61187 - android.text.TextUtils.getOffsetAfter(str8, 0)), android.text.TextUtils.indexOf(str8, str8, 0, 0) + 14, objArr172);
                                    java.lang.String[] strArr24 = {intern59, intern60, intern61, intern62, intern63, ((java.lang.String) objArr172[0]).intern()};
                                    java.lang.Object[] objArr173 = new java.lang.Object[1];
                                    a(648 - (android.os.Process.myTid() >> 22), (char) (android.text.TextUtils.indexOf(str8, str8, 0) + 60930), 20 - android.text.TextUtils.getTrimmedLength(str8), objArr173);
                                    java.lang.String intern64 = ((java.lang.String) objArr173[0]).intern();
                                    java.lang.Object[] objArr174 = new java.lang.Object[1];
                                    a(668 - android.graphics.Color.argb(0, 0, 0, 0), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 19 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr174);
                                    java.lang.String intern65 = ((java.lang.String) objArr174[0]).intern();
                                    java.lang.Object[] objArr175 = new java.lang.Object[1];
                                    a(688 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 31 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr175);
                                    java.lang.String intern66 = ((java.lang.String) objArr175[0]).intern();
                                    java.lang.Object[] objArr176 = new java.lang.Object[1];
                                    a((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 718, (char) (android.view.View.resolveSize(0, 0) + 24496), 26 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr176);
                                    java.lang.String intern67 = ((java.lang.String) objArr176[0]).intern();
                                    java.lang.Object[] objArr177 = new java.lang.Object[1];
                                    a(android.graphics.ImageFormat.getBitsPerPixel(0) + 745, (char) android.view.KeyEvent.getDeadChar(0, 0), 23 - (android.os.Process.myPid() >> 22), objArr177);
                                    java.lang.String intern68 = ((java.lang.String) objArr177[0]).intern();
                                    java.lang.Object[] objArr178 = new java.lang.Object[1];
                                    a(767 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) android.text.TextUtils.getOffsetBefore(str8, 0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32, objArr178);
                                    java.lang.String[] strArr25 = {intern64, intern65, intern66, intern67, intern68, ((java.lang.String) objArr178[0]).intern(), str};
                                    java.lang.Object[] objArr179 = new java.lang.Object[1];
                                    a(android.view.KeyEvent.normalizeMetaState(0) + com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP, (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 14576), android.os.Process.getGidForName(str8) + 14, objArr179);
                                    java.lang.String intern69 = ((java.lang.String) objArr179[0]).intern();
                                    java.lang.Object[] objArr180 = new java.lang.Object[1];
                                    a(android.widget.ExpandableListView.getPackedPositionChild(0L) + 380, (char) (11009 - android.view.View.combineMeasuredStates(0, 0)), 7 - android.text.TextUtils.getOffsetBefore(str8, 0), objArr180);
                                    java.lang.String[] strArr26 = {intern69, ((java.lang.String) objArr180[0]).intern()};
                                    java.lang.Object[] objArr181 = new java.lang.Object[1];
                                    a(android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 814, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 31 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr181);
                                    java.lang.String intern70 = ((java.lang.String) objArr181[0]).intern();
                                    java.lang.Object[] objArr182 = new java.lang.Object[1];
                                    a(843 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), android.graphics.Color.rgb(0, 0, 0) + 16777227, objArr182);
                                    java.lang.String[] strArr27 = {intern70, ((java.lang.String) objArr182[0]).intern()};
                                    java.lang.Object[] objArr183 = new java.lang.Object[1];
                                    a(854 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 20, objArr183);
                                    java.lang.String intern71 = ((java.lang.String) objArr183[0]).intern();
                                    java.lang.Object[] objArr184 = new java.lang.Object[1];
                                    a((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 872, (char) (46209 - android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 4 - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr184);
                                    java.lang.String[] strArr28 = {intern71, ((java.lang.String) objArr184[0]).intern()};
                                    java.lang.Object[] objArr185 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 878, (char) (android.text.TextUtils.getCapsMode(str8, 0, 0) + 5136), android.text.TextUtils.getCapsMode(str8, 0, 0) + 19, objArr185);
                                    java.lang.String[] strArr29 = {((java.lang.String) objArr185[0]).intern()};
                                    java.lang.Object[] objArr186 = new java.lang.Object[1];
                                    a(897 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.view.View.MeasureSpec.getSize(0) + 24227), android.graphics.Color.red(0) + 16, objArr186);
                                    java.lang.String[] strArr30 = {((java.lang.String) objArr186[0]).intern()};
                                    java.lang.Object[] objArr187 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 913, (char) android.graphics.Color.red(0), 18 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr187);
                                    java.lang.String[] strArr31 = {((java.lang.String) objArr187[0]).intern()};
                                    java.lang.Object[] objArr188 = new java.lang.Object[1];
                                    a((android.view.KeyEvent.getMaxKeyCode() >> 16) + 932, (char) android.text.TextUtils.indexOf(str8, str8, 0), 20 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr188);
                                    java.lang.String[] strArr32 = {((java.lang.String) objArr188[0]).intern()};
                                    java.lang.Object[] objArr189 = new java.lang.Object[1];
                                    a(951 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 22 - android.os.Process.getGidForName(str8), objArr189);
                                    java.lang.String[] strArr33 = {((java.lang.String) objArr189[0]).intern()};
                                    java.lang.Object[] objArr190 = new java.lang.Object[1];
                                    a(974 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 21 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr190);
                                    java.lang.String[] strArr34 = {((java.lang.String) objArr190[0]).intern()};
                                    java.lang.Object[] objArr191 = new java.lang.Object[1];
                                    a(995 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 44214), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 24, objArr191);
                                    java.lang.String str19 = str;
                                    java.lang.String[] strArr35 = {((java.lang.String) objArr191[0]).intern(), str19};
                                    java.lang.Object[] objArr192 = new java.lang.Object[1];
                                    a(1019 - (android.os.Process.myPid() >> 22), (char) android.graphics.Color.alpha(0), android.graphics.Color.argb(0, 0, 0, 0) + 28, objArr192);
                                    java.lang.String[] strArr36 = {((java.lang.String) objArr192[0]).intern(), str19};
                                    java.lang.Object[] objArr193 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getTapTimeout() >> 16) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_TRANSPARENT_INDEX, (char) ((-1) - android.os.Process.getGidForName(str8)), 27 - android.view.KeyEvent.keyCodeFromString(str8), objArr193);
                                    java.lang.String[] strArr37 = {((java.lang.String) objArr193[0]).intern(), str19};
                                    java.lang.Object[] objArr194 = new java.lang.Object[1];
                                    a(1074 - android.graphics.Color.blue(0), (char) android.view.View.resolveSizeAndState(0, 0, 0), (android.os.Process.myTid() >> 22) + 31, objArr194);
                                    java.lang.String[] strArr38 = {((java.lang.String) objArr194[0]).intern(), str19};
                                    java.lang.Object[] objArr195 = new java.lang.Object[1];
                                    a(1105 - (android.os.Process.myPid() >> 22), (char) (10148 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 27 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr195);
                                    char c3 = 0;
                                    java.lang.String[] strArr39 = {((java.lang.String) objArr195[0]).intern(), str19};
                                    java.lang.Object[] objArr196 = new java.lang.Object[1];
                                    a(android.text.TextUtils.indexOf(str8, str8, 0) + 1132, (char) (61394 - android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 31 - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr196);
                                    java.lang.String[][] strArr40 = {strArr17, strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, new java.lang.String[]{((java.lang.String) objArr196[0]).intern(), str19}};
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    int i57 = i;
                                    int i58 = 0;
                                    int i59 = 0;
                                    while (i58 < 24) {
                                        java.lang.String[] strArr41 = strArr40[i58];
                                        java.lang.Object[] objArr197 = {strArr41[c3]};
                                        java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj35 == null) {
                                            java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 40, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1921, (char) ((-1) - android.view.MotionEvent.axisFromString(str8)));
                                            byte[] bArr2 = $$a;
                                            byte b33 = bArr2[16];
                                            strArr = strArr40;
                                            j3 = j12;
                                            short s = (short) (bArr2[14] + 1);
                                            byte b34 = bArr2[2];
                                            java.lang.Object[] objArr198 = new java.lang.Object[1];
                                            b(b33, s, b34, objArr198);
                                            obj35 = cls34.getMethod((java.lang.String) objArr198[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj35);
                                        } else {
                                            strArr = strArr40;
                                            j3 = j12;
                                        }
                                        java.lang.String str20 = (java.lang.String) ((java.lang.reflect.Method) obj35).invoke(null, objArr197);
                                        java.lang.String[] strArr42 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr41, 1, strArr41.length);
                                        if (str20 != null && str20.length() != 0) {
                                            if (strArr41.length != 1) {
                                                int length2 = strArr42.length;
                                                int i60 = 0;
                                                while (i60 < length2) {
                                                    if (!str20.contains(strArr42[i60])) {
                                                        i60++;
                                                        values = (AlternateContactlessPaymentDataJson + 61) % 128;
                                                    }
                                                }
                                            }
                                            i59++;
                                            i57 = i ^ (i58 + 10);
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                            sb.append(str20);
                                            java.lang.Object[] objArr199 = new java.lang.Object[1];
                                            a(1164 - android.graphics.Color.blue(0), (char) (23396 - android.graphics.ImageFormat.getBitsPerPixel(0)), -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr199);
                                            sb.append(((java.lang.String) objArr199[0]).intern());
                                            sb.append(str20);
                                            arrayList.add(sb.toString());
                                            break;
                                        }
                                        i58++;
                                        strArr40 = strArr;
                                        j12 = j3;
                                        c3 = 0;
                                    }
                                    j2 = j12;
                                    java.lang.Object[] objArr200 = new java.lang.Object[5];
                                    if (i59 > 2) {
                                        objArr200[0] = new int[]{i};
                                        objArr200[1] = new int[]{i57};
                                        objArr200[4] = new int[1];
                                        objArr200[2] = arrayList;
                                        objArr200[3] = null;
                                        java.lang.Object[] objArr201 = {num, num, java.lang.Integer.valueOf(((((~((-986153165) | i28)) | r5) * 1150) - 364620574) + (((~((-1064692934) | i)) | (~(1064692933 | i28))) * (-575)) + (((~((-986153165) | i)) | (~(986153164 | i28))) * 575))};
                                        java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj36 == null) {
                                            java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myTid() >> 22), 2713 - android.view.View.resolveSize(0, 0), (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216));
                                            byte b35 = $$a[14];
                                            byte b36 = (byte) (b35 + 1);
                                            java.lang.Object[] objArr202 = new java.lang.Object[1];
                                            b(b36, (short) (b36 | 653), b35, objArr202);
                                            obj36 = cls35.getMethod((java.lang.String) objArr202[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj36);
                                        }
                                        c = 0;
                                        ((int[]) objArr200[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr201)).intValue();
                                    } else {
                                        objArr200[0] = new int[]{i};
                                        objArr200[1] = new int[]{i};
                                        objArr200[4] = new int[1];
                                        objArr200[2] = null;
                                        objArr200[3] = null;
                                        java.lang.Object[] objArr203 = {num, num, java.lang.Integer.valueOf((((~((-1349142398) | i28)) * 979) - 431445754) + ((701703700 | i) * (-979)) + (((~((-1349142398) | i)) | (~(701703700 | i28))) * 979))};
                                        java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj37 == null) {
                                            java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.text.TextUtils.getOffsetAfter(str8, 0) + 2713, (char) android.text.TextUtils.getCapsMode(str8, 0, 0));
                                            byte b37 = $$a[14];
                                            byte b38 = (byte) (b37 + 1);
                                            java.lang.Object[] objArr204 = new java.lang.Object[1];
                                            b(b38, (short) (b38 | 653), b37, objArr204);
                                            obj37 = cls36.getMethod((java.lang.String) objArr204[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj37);
                                        }
                                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr203)).intValue();
                                        c = 0;
                                        ((int[]) objArr200[4])[0] = intValue;
                                    }
                                    int i61 = ((int[]) objArr200[1])[c];
                                    if (i61 != i) {
                                        values = (AlternateContactlessPaymentDataJson + 87) % 128;
                                        java.lang.Object[] objArr205 = {new int[]{i}, new int[]{i61}, (java.util.List) objArr200[2], null, new int[1]};
                                        int i62 = ~(i | 352868365);
                                        java.lang.Object[] objArr206 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((1883065737 | i62) * (-658)) - 1350134605) + ((i62 | 1614087552) * 658))};
                                        java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj38 == null) {
                                            java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.argb(0, 0, 0, 0), 2713 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                            byte b39 = $$a[14];
                                            byte b40 = (byte) (b39 + 1);
                                            java.lang.Object[] objArr207 = new java.lang.Object[1];
                                            b(b40, (short) (b40 | 653), b39, objArr207);
                                            obj38 = cls37.getMethod((java.lang.String) objArr207[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj38);
                                        }
                                        ((int[]) objArr205[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr206)).intValue();
                                        return objArr205;
                                    }
                                    java.lang.Object[] objArr792 = new java.lang.Object[1];
                                    a(450 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) android.text.TextUtils.getTrimmedLength(str8), 16 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr792);
                                    java.lang.Object[] objArr802 = {((java.lang.String) objArr792[0]).intern()};
                                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj2 == null) {
                                    }
                                    invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr802);
                                    if (invoke != null) {
                                    }
                                    if (i11 != 1986687685) {
                                    }
                                    str10 = str9;
                                    java.lang.Object[] objArr1112 = new java.lang.Object[1];
                                    a(1506 - android.os.Process.getGidForName(str10), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13, objArr1112);
                                    java.lang.String intern342 = ((java.lang.String) objArr1112[0]).intern();
                                    java.lang.Object[] objArr1122 = new java.lang.Object[1];
                                    a(1520 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.text.TextUtils.indexOf(str10, str10, 0) + 23593), (android.os.Process.myTid() >> 22) + 5, objArr1122);
                                    java.lang.String[] strArr102 = {intern342, ((java.lang.String) objArr1122[0]).intern()};
                                    java.lang.Object[] objArr1132 = new java.lang.Object[1];
                                    a(android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1526, (char) (50572 - android.view.View.MeasureSpec.getSize(0)), android.view.View.MeasureSpec.getMode(0) + 15, objArr1132);
                                    java.lang.String intern352 = ((java.lang.String) objArr1132[0]).intern();
                                    java.lang.Object[] objArr1142 = new java.lang.Object[1];
                                    a(android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1541, (char) android.view.View.getDefaultSize(0, 0), android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 20, objArr1142);
                                    java.lang.String intern362 = ((java.lang.String) objArr1142[0]).intern();
                                    java.lang.Object[] objArr1152 = new java.lang.Object[1];
                                    a(android.text.TextUtils.getOffsetBefore(str10, 0) + 1559, (char) (android.view.MotionEvent.axisFromString(str10) + 21772), 15 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr1152);
                                    java.lang.String[] strArr112 = {intern352, intern362, ((java.lang.String) objArr1152[0]).intern()};
                                    java.lang.Object[] objArr1162 = new java.lang.Object[1];
                                    a(1574 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 22, objArr1162);
                                    java.lang.String intern372 = ((java.lang.String) objArr1162[0]).intern();
                                    java.lang.Object[] objArr1172 = new java.lang.Object[1];
                                    a(1594 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 10, objArr1172);
                                    java.lang.String[] strArr122 = {intern372, ((java.lang.String) objArr1172[0]).intern()};
                                    java.lang.Object[] objArr1182 = new java.lang.Object[1];
                                    a(1603 - android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 12 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr1182);
                                    c2 = 0;
                                    java.lang.String intern382 = ((java.lang.String) objArr1182[0]).intern();
                                    java.lang.Object[] objArr1192 = new java.lang.Object[1];
                                    a(340 - android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (41926 - android.graphics.Color.green(0)), 7 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr1192);
                                    java.lang.String[] strArr132 = {intern382, ((java.lang.String) objArr1192[0]).intern()};
                                    java.lang.Object[] objArr1202 = new java.lang.Object[1];
                                    a(1615 - android.text.TextUtils.getTrimmedLength(str10), (char) (26428 - android.view.Gravity.getAbsoluteGravity(0, 0)), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.GS, objArr1202);
                                    java.lang.String intern392 = ((java.lang.String) objArr1202[0]).intern();
                                    java.lang.Object[] objArr1212 = new java.lang.Object[1];
                                    a(1594 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 9 - android.os.Process.getGidForName(str10), objArr1212);
                                    java.lang.String[][] strArr142 = {strArr102, strArr112, strArr122, strArr132, new java.lang.String[]{intern392, ((java.lang.String) objArr1212[0]).intern()}};
                                    i12 = 0;
                                    int i492 = -1;
                                    loop4: while (true) {
                                        if (i12 < 5) {
                                        }
                                        i12++;
                                        c2 = 0;
                                    }
                                    if (i13 == i10) {
                                    }
                                }
                            }
                            java.lang.Object[] objArr208 = new java.lang.Object[1];
                            a(347 - android.view.KeyEvent.normalizeMetaState(0), (char) ((-16752300) - android.graphics.Color.rgb(0, 0, 0)), android.view.MotionEvent.axisFromString(str5) + 14, objArr208);
                            java.lang.String intern72 = ((java.lang.String) objArr208[0]).intern();
                            java.lang.Object[] objArr209 = new java.lang.Object[1];
                            a(360 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) android.text.TextUtils.indexOf(str5, str5, 0), android.graphics.Color.alpha(0) + 9, objArr209);
                            java.lang.Object[] objArr210 = {intern72, ((java.lang.String) objArr209[0]).intern()};
                            java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                            if (obj39 == null) {
                                java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 39, 2213 - android.text.TextUtils.getCapsMode(str5, 0, 0), (char) android.text.TextUtils.getTrimmedLength(str5));
                                java.lang.Object[] objArr211 = new java.lang.Object[1];
                                b(r4[16], (short) ($$a[14] + 1), r4[2], objArr211);
                                obj39 = cls38.getMethod((java.lang.String) objArr211[0], java.lang.String.class, java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj39);
                            }
                            long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj39).invoke(null, objArr210)).longValue();
                            long j39 = ~longValue13;
                            long j40 = ~((-1364929290) | j39);
                            str6 = str5;
                            long j41 = ((((((-445) * longValue13) - 607393533605L) + (((~(j39 | j12)) | j40) * 446)) + (((~(longValue13 | (-1364929290))) | (~((1364929289 | j39) | j11))) * 446)) + (j40 * 446)) - 2100303891;
                            if (((((int) (j41 >> 32)) & (((((~(962921825 | i)) | 1234542994) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) - 1999931766) + (((~(962921825 | i28)) | 1234542994) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))) | (((int) j41) & ((((-47187371) | i28) * (-369)) + 802172634 + (((~(1121586622 | i28)) | (-315639788)) * (-369)) + (((~((-1121586623) | i)) | 1074399252 | (~((-268452418) | i28))) * 369)))) != 0) {
                                int i63 = AlternateContactlessPaymentDataJson + 81;
                                values = i63 % 128;
                                i9 = i63 % 2 == 0 ? i ^ 18889 : i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE;
                            } else {
                                i9 = i;
                            }
                            if (i9 == i) {
                            }
                        }
                    }
                    i8 = i;
                    if (i8 != i) {
                    }
                }
                str5 = str4;
                i8 = i;
                if (i8 != i) {
                }
            }
        }
        i7 = i;
        if (i7 == i) {
        }
    }
}
