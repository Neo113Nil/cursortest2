package com.payair.hce;

/* loaded from: classes4.dex */
public class assertNotSuspendingTransaction extends com.payair.hce.beginTransaction {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static long DigitizedCardProfile;
    private static char[] valueOf;
    private static int values;
    private static int writeReplace;

    private static void b(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3 = i * 2;
        int i4 = 718 - i2;
        int i5 = (s * 2) + 4;
        byte[] bArr = $$a;
        char[] cArr = new char[35 - i3];
        int i6 = -1;
        if (bArr == null) {
            i4 = (i5 + (-i4)) - 2;
            i5++;
        }
        while (true) {
            i6++;
            cArr[i6] = (char) i4;
            if (i6 == 34 - i3) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            int i7 = i4;
            i4 = (i7 + (-bArr[i5])) - 2;
            i5++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5 = 99 - (i3 * 3);
        int i6 = 4 - (i2 * 3);
        byte[] bArr = $$d;
        int i7 = i * 3;
        byte[] bArr2 = new byte[1 - i7];
        int i8 = 0 - i7;
        if (bArr == null) {
            int i9 = i8;
            i4 = 0;
            i6++;
            i5 += i9;
            bArr2[i4] = (byte) i5;
            if (i4 == i8) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i4++;
            i9 = bArr[i6];
            i6++;
            i5 += i9;
            bArr2[i4] = (byte) i5;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i5;
            if (i4 == i8) {
            }
        }
    }

    public assertNotSuspendingTransaction() {
        super(new com.payair.hce.isOpenInternalannotations());
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        int i3 = 0;
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i4 = $10 + 101;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[i3] = java.lang.Integer.valueOf(valueOf[i << getcvmmodel.valueOf]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 48, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 380, (char) (62387 - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c(i3, i3, i3, objArr3);
                        java.lang.String str = (java.lang.String) objArr3[i3];
                        java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                        clsArr[i3] = java.lang.Integer.TYPE;
                        obj = cls.getMethod(str, clsArr);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue();
                    long j = getcvmmodel.valueOf;
                    long j2 = DigitizedCardProfile;
                    java.lang.Object[] objArr4 = new java.lang.Object[4];
                    objArr4[3] = java.lang.Integer.valueOf(c);
                    objArr4[2] = java.lang.Long.valueOf(j2);
                    objArr4[1] = java.lang.Long.valueOf(j);
                    objArr4[i3] = java.lang.Long.valueOf(longValue);
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 35, 3966 - (android.util.TypedValue.complexToFloat(i3) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(i3) == 0.0f ? 0 : -1)), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(i3, i3) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(i3, i3) == 0L ? 0 : -1)) + 40224));
                        java.lang.Class<?>[] clsArr2 = new java.lang.Class[4];
                        clsArr2[i3] = java.lang.Long.TYPE;
                        clsArr2[1] = java.lang.Long.TYPE;
                        clsArr2[2] = java.lang.Long.TYPE;
                        clsArr2[3] = java.lang.Integer.TYPE;
                        obj2 = cls2.getMethod("a", clsArr2);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i3, i3) + 35, (android.view.KeyEvent.getMaxKeyCode() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                        java.lang.Class<?>[] clsArr3 = new java.lang.Class[2];
                        clsArr3[i3] = java.lang.Object.class;
                        clsArr3[1] = java.lang.Object.class;
                        obj3 = cls3.getMethod("d", clsArr3);
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
                int i6 = getcvmmodel.valueOf;
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                objArr6[i3] = java.lang.Integer.valueOf(valueOf[i + getcvmmodel.valueOf]);
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(i3, i3) + 48, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 380, (char) (62388 - android.view.View.MeasureSpec.makeMeasureSpec(i3, i3)));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    c(i3, i3, i3, objArr7);
                    java.lang.String str2 = (java.lang.String) objArr7[i3];
                    java.lang.Class<?>[] clsArr4 = new java.lang.Class[1];
                    clsArr4[i3] = java.lang.Integer.TYPE;
                    obj4 = cls4.getMethod(str2, clsArr4);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(DigitizedCardProfile), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 35, android.widget.ExpandableListView.getPackedPositionType(0L) + 3966, (char) (android.text.TextUtils.getTrimmedLength("") + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i6] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 34, 212 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
            $10 = ($11 + 87) % 128;
            i3 = 0;
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj7 == null) {
                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 34, android.text.TextUtils.indexOf("", "") + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
            }
            ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
        }
        java.lang.String str3 = new java.lang.String(cArr);
        int i7 = $11 + 43;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = str3;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        writeReplace = 0;
        values = 1;
        char[] cArr = new char[1707];
        java.nio.ByteBuffer.wrap("^\u0080÷g\r\u0092£Ýø0\u000e\u0094¤Èýw\u0013«©Åþ~\u0014¸ª×ÃL\u0019¦¯ßÄ\u000b\u001a±°ÒÉ\u0018\u001f¬µìÊ\u0014`«¶îÏ\u0000e²^\u0080÷g\r\u0092£Ýø0\u000e\u0094¤Èýw\u0013«©Åþ~\u0014¸ª×ÃL\u0019·¯ÒÄ\u001f\u001a¦°èÉ\u000f\u001f¯µÁÊ\u0004`¯¶ëlAÅ¦?S\u0091\u001cÊñ<U\u0096\tÏ¶!j\u009b\u0004Ì¿&y\u0098\u0016ñ\u008d+u\u009d\u0003öÀ(a^\u0080÷p\r\u008e£Øø0\u000e\u009e¤Èý\u007f\u0013º©Ïþr\u0014äªØÃ|\u0019«¯ßÄ\t\u001aª°ÄÉ\u0003\u001f\u0080µÑÊ\u0006`¯¶ûÏ\u0006e¥»ò©Ö\u00000úÕT\u009e\u000ffùÁS\u0096\ncäé^\u0087\t.ãí^\u0080÷f\r\u0083£Èø0\u000e\u0080¤Îýv\u0013á©Óþe\u0014¤ªÏ\u0003üª\fPïþ´¥\u0002Sýù¿ HNáô\u0099£&IØ÷µ\u009e\nDÿò¦\u0099gGÞ^\u0080÷p\r\u008e£Øøk\u000e\u0096¤Êý4\u0013£©Êþu\u0014äªÓÃz\u0019¥¯ÕÄ\r\u001aí°ÄÉ\u0004^Í÷j\r\u0090£Åøp\u000e\u008barÈÃ^\u0080÷p\r\u008e£Øøk\u000e\u0096¤Êý4\u0013\u00ad©Êþy\u0014äªÑÃv\u0019ª¯ÎÄ9\u001a\u008e°\u009aÉ\u0005\u001fºµÞÊ\u0012`ö¶ìÏ\fe¹»ÿÐ\rf¼¼ë¨ª\u0001Zû¤Uò\u000eAø¼Rà\u000b\u001eå\u0087_à\bSâÎ\\û5\\ï\u0080Yä2\u0013ì¤F°?1é\u0087Cö<==J\u0094ºnDÀ\u0012\u009b¡m\\Ç\u0000\u009eþpiÊ\u0000\u009d¿w.É\u0019 °zoÌ\u001f§ÀydÓ\bª÷|XÖ\t©ß\u0003~Õ5¬\u0087\u0006nØ.^\u0080÷g\r\u0092£Ýø0\u000e\u009d¤Âýv\u0013º©Äþb\u0014®ªÌÃg\u009e^7ïÍZcJ8éÎ\u0019dH=üÓbiH>ûÔ;jH^Á÷f\r\u0096£Øøz\u000eÝ¤Éý~\u0013»^\u0080÷s\r\u0085£Äø|\u000eÜ¤Áýr\u0013£©Æþd\u0014²ªÌÃg\u0019¢¯ÖÄ\u001c^Á÷f\r\u009a£Þøl\u000e\u0095^Ý÷l\rÙ£Ûøm\u000e\u009c¤Ãýn\u0013¬©×þ9\u0014¦ªÞÃ}\u0019²¯ÝÄ\u000e\u001a °ÃÉ\u001e\u001f\u00adµÖÊ\u0015\u0089§ \tÚöt½;\u0004\u0092¼hEÆ\u000e\u009d±kH^\u0080÷s\r\u0085£Äø|\u000eÜ¤Êýt\u0013«©Öþ{\u0014®ªÌ^Ù÷a\r\u0098£Óøx\u000e\u0086¤Âýh\u0013»^è÷f\r\u0099£Òør\u000e\u009c¤Óýr\u0013 ©Í³Ò\u001aeà\u0094NÍ\u0015xã\u008cIÁ^Ì÷k\r\u0085£Äør\u000e\u009a¤Òýv^Ý÷l\rÙ£Ûøm\u000e\u009c¤Ãýn\u0013¬©×þ9\u0014¯ªÚÃe\u0019®¯ØÄ\nà8I\u0080³y\u001d2FÆ°$\u001a6]]ôó\u000e\f [ûø\r\u000f§Q\u001ctµÚO%árºÑL&æx¿øQ\u000bë'¼\u009d\u0006\u008b¯%UÚû\u008d .VÙü\u0087¥\u0007KôñØ¦bL×òÊ\u009bdcíÊ\\0é\u009eëÅ]3¬\u0099óÀ^.\u009c\u0094çÃ\t)\u0096\u0097àþG$\u0092\u0092çv#ß\u0098%clæÅB?®\u0091ëÊR<«\u0096äÏE\u0003¯ª2PÆþÊ¥\fSÇù\u0088 .Nçô\u008f£3Iª÷\u0098\u009e=DôòÚ\u0099mGêí\u0084\u0094EBóè\u0097^î÷m\r\u0093£Ùøp\u000e\u009a¤Ãý;\u0013\u009c©çþ\\\u0014ëªÝÃf\u0019®¯×Ä\u001b\u001aã°ÑÉ\u0004\u001f\u00adµ\u0093Ê\u001f`ã¶¹èÈAK»µ\u0015ÿNV¸¼\u0012åK\u001d¥º\u001fÁHz¢Í\u001cûu@¯\u0088\u0019ñr=¬Å\u0006÷\u007f\"©\u008b\u0003µ|9ÖÅ\u0000\u009fy\u001aÓÇ\r\u0099\u008dµ$\u0004Þ±p«+\u0016Ýéw«.\u0004ÀÆz¹-\u001a´Â\u001dfç\u0091IÅ\u0012sä\u0090NÞ\u0017yu\u008aÜ2&Ë\u0088\u0080Ót%\u0096^Ý÷b\r\u0099£Èøw\u000e\u0086k+Â\u009a8/\u0096-Í\u009b;j\u00915È\u0098&Z\u009c!ËÏ!_\u009f;ö\u0084,_\u009a)^Ý÷l\rÙ£Àøz\u000e\u0081¤Éý~\u0013£©\u008dþf\u0014®ªÒÃfk`^Ý÷l\rÙ£Øøz\u000e\u0090¤Òýi\u0013ªúG\u0018Ú±kKÞåÎ¾mH\u009dâÌ»xUæïÔ¸bR£ìÜ\u0085a_£éÈ^É÷v\r\u009b£Çø@\u000e\u008b¤\u009fý-^Ý÷l\rÙ£Éøj\u000e\u009a¤Ëý\u007f\u0013á©Åþ~\u0014¥ªØÃv\u0019µ¯ËÄ\u001d\u001aª°ÙÉ\u001f^È÷f\r\u0099£Îøm\u000e\u009a¤Äý4\u0013¼©Çþ|\u0014äªØÃv\u0019©¯ÞÄ\u001d\u001aª°ÔäþMP·¯\u0019øB[´¬\u001eòGr©\u0081\u0013\u00adD\u0017®Ò\u0010úyA£\u009a\u0015Ò~! Í\n·sr¥\u008e\u000fàp?Ú\u0088\fËu<ß\u0082\u0001âj1ÜÝ\u0006\u0087^È÷f\r\u0099£Îøm\u000e\u009a¤Äý4\u0013¨©Ìþx\u0014¬ªÓÃv\u0019\u0098¯ÈÄ\u000b\u001a¨°\u0098É\f\u001fºµÝÊ\u0002`©¶æÏ\u0000^È÷f\r\u0099£Îøm\u000e\u009a¤Äý4\u0013¹©Áþx\u0014³ª\u0087Ã%\u0019·¯\u0094Ä\u0019\u001a¡°ØÉ\u0013\u001fçµ\u0085Ê\u0017^È÷l\r\u0098£Ìøs\u000e\u0096¤\u0088ýh\u0013«©ÈþH\u0014¬ªÏÃ{\u0019¨¯ÕÄ\n\u001a\u009c°ÏÉS\u001féµ\u009cÊ\u0000`¾¶áÏ\u0006e¥»âÐ\u001cf\u008c¼ÿÕCk\u0019æùOHµý\u001bí@T¶¸\u001c÷ES«\u0084\u0011æFW¬\u008a\u0012é^Ý÷l\rÙ£Éøp\u000e\u009c¤Óýr\u0013¢©Âþp\u0014®ª\u0091Ãq\u0019²¯ÒÄ\u0003\u001a§°\u0099É\r\u001f¶µÝÊ\u0000`¾¶ýÏ\u0013e¥»âÐ\u0011f§^î÷m\r\u0093£Ùøp\u000e\u009a¤Ãý6\u0013·©\u009bþ!½;\u0014\u008aî?@/\u001b\u008cí|G-\u001e\u0099ð\u0007J!\u001d\u0098÷^I) \u0099ú@L$'§ùLS5É\u008e`3\u009aÑ4\u008aog^Æ÷m\r\u009e£ßø1\u000e\u0080¤Ñýx\u0013á©Òþr\u0014¦ªÊÃ>\u0019·¯ÉÄ\u0000\u001a³°Ä^Þ÷f\r\u009a£Þø1\u000e\u009b¤Ðý5\u0013¢©Âþ~\u0014¥ªÔÃv\u0019¾¯È\u0081É(qÒ\u008d|É'&Ñ\u0097{Ö\"\"Ì¾vÕ!kË¹u÷\u001cgÆ±pÁ\u001b\u001dÅ¦oÁ^Þ÷f\r\u009a£Þø1\u000e\u0080¤Áý5\u0013£©Àþs\u0014\u0094ªÛÃv\u0019©¯ÈÄ\u0006\u001a·°Î<\u0098\u0095)o\u009cÁ\u0085\u009a?lÄÆ\u008c\u009f;qæËÈ\u009c3vàÈ\u009e¡${íÍ\u0097¦Nx¨Ò\u0083«K}÷×\u0083¨F\u0097\n>»Ä\u000ej\u001e1§ÇKm\u00044âÚi`\u00117\u00adÝicF\n¥Ðff\b\rçÓzy\u0001\u0000ÑÖmóRZã V\u000eKUô£\u0011\t\u0006Pö¾5\u0004ESô¹ \u0007\u001enú´!\u0002Zi\u0087·)\u001dJd\u0094²\"\u0018Ug\u0086Í ^Ý÷l\rÙ£Ûøm\u000e\u009c¤Ãýn\u0013¬©×þ9\u0014©ªÊÃz\u0019«¯ßÄA\u001a¥°ÞÉ\u0005\u001f¸µÖÊ\u0015`«¶ýÏ\ne¹»ÿ^Ý÷l\rÙ£Øøf\u000e\u0080¤Óý~\u0013¢©\u008dþu\u0014¾ªÖÃ\u007f\u0019£¯\u0095Ä\t\u001aª°ÙÉ\f\u001fºµÁÊ\u0017`©¶æÏ\re£\u0090#9\u0092Ã'm&6\u0098À~j-3\u0080Ý\\g\u00020\u008cÚMd5\rÃ×[a0\nøÔQ~-\u0007»ÑG{$\u0004÷®Bx\u0014\u0001ï«Yu\u0007\u001eè¨Cr\r^Ý÷l\rÙ£Ýøz\u000e\u009d¤Ãýt\u0013½©\u008dþu\u0014¾ªÖÃ\u007f\u0019£¯\u0095Ä\t\u001aª°ÙÉ\f\u001fºµÁÊ\u0017`©¶æÏ\re£\u0003IªøPMþI¥îS\tùW àN)ôh£çI3÷@\u009eêD}òM\u0099\u008eG>íO\u0094\u009bBeèA\u0097\u009a=!ë|\u0092\u009281æo\u008d\u0099;.á}\u0088\u009b»°óëZ\f ù\u000e¶U[£é\t©P\u001d¾Ñ\u0004\u0097S\f¹É\u0007¤n\u001d^\u0080÷g\r\u0092£Ýø0\u000e\u0080¤Èýx\u0013¤©Æþc\u0014äªÝÃr\u0019´¯ÞÄ\r\u001a¢°ÙÉ\u000f\u001f\u0080µÔÊ\u0002`µ¶öÏ\u0007·\u008d\u001ejä\u009fJÐ\u0011=ç\u008dMÅ\u0014uú©@Ë\u0017nýéCÕ*{ð¤FÏ-\u0006^\u0080÷g\r\u0092£Ýø0\u000e\u0080¤Èýx\u0013¤©Æþc\u0014äªÎÃv\u0019ª¯ÎÄ\u000bÝët\u001b\u008eå ³{[\u008dé'©~\u001d\u0090Ñ*\u0097}\b\u0097Ò)µ@\u001b\u009aÉ^\u0080÷p\r\u008e£Øøk\u000e\u0096¤Êý4\u0013£©Êþu\u0014äªÓÃz\u0019¥¯ØÄ0\u001a®°ÖÉ\u0007\u001f³µÜÊ\u0004`\u0084¶ëÏ\u0006eµ»þÐ\u0018f\u008c¼öÕ\u001ekB\u0081öÖYlX\u0082ð\u008c©%Nß»qô*\u0019Ü¸vý/FÁ¹{í,NÆ\u0091yÂÐ%*Ð\u0084\u009fßr)Ó\u0083\u0096Ú-4Ò\u008e\u0095Ù<3ä\u008d\u0098^\u0080÷g\r\u0092£Ýø0\u000e\u0080¤Èýx\u0013¤©Æþc\u0014äªÝÃ`\u0019³¯ÝÄ\u0000\u001a¯°ÓÉ\u000e\u001f\u00adµ×\fj¥\u009a_dñ2ª\u0081\\|ö ¯ÞAIû ¬\u009fF\u000eø9\u0091\u0090KOý3\u0096öH]â;\u009bîMYç=\u0098è2Cä:\u009dã7Sé\b\u0082»4Jî\u0002@êé\r\u0013ø½·æZ\u0010ûº¾ã\u0005\rÄ·ªà\u001e\nÄ^\u0080÷g\r\u0092£Ýø0\u000e\u0091¤Ôýo\u0013¨©Úþe\u0014¤h\u008dÁj;\u009f\u0095ÐÎ=8\u009c\u0092ÙËb%¯\u009fËÈ}\"¨:x\u0093\u009fijÇ%\u009cÈjiÀ,\u0099\u0097wXÍ)\u009a\u0086pV^\u0080÷g\r\u0092£Ýø0\u000e\u0091¤Ôýo\u0013¹©Îþd\u0014¬ú¨SO©º\u0007õ\\\u0018ª¹\u0000üYG·\u0097\rìZ^°\u008a\u000eçgX^\u0080÷g\r\u0092£Ýø0\u000e\u0091¤Ôýo\u0013\u0090©Êþz\u0014®eÂÌ%6Ô\u0098\u009dÃ<5\u009e\u009f\u0081Æ6(ú\u0092\u008fÅ9/æ\u0091\u009cø5\"ö\u0094Öÿ\u0003!ù\u008b\u0097ò\u0006$ÿ\u008e\u0082ñQ[òÀ\fiâ\u0093\u0015=Sf¼\u0090\b:Bcù\u008d'7@`ì\u008a44\u001c]Ý\u008781CZ°\u0084'.ZW\u0095\u00816+[T\u00adþ8(oQ\u008bû>%u\u00883!ÀÛ6uw.ÏØor}+ÇÅ\f\u007f\u007f(ÖÂ\f|\u007f^\u009f÷e\r\u0091£\u008bø%^\u0080÷s\r\u0085£Äø|\u000eÜ¤Ôý~\u0013£©Åþ8\u0014¦ªÞÃc\u0019´\u0018c±ÚK=ål¾ØH7âo»\u009eU\u0003ïg¸ÐR\u0004ìr\u0085Ñ_\u001féx\u0082ê\\\u001bös\u001aî³GI¸çÁ¼~J\u009bàÙ¹iW\u0080íýºNPÈîá\u0087QÙìp\n\u008aï$¤\u007f\\\u0089ò#®z\u0013\u0094Ê.®y$\u0093Ä-¼D\u001b\u009eÎ(´Cp\u009d\u00817£Nj\u0098ß^Í÷o\r\u0082£Îøl\u000e\u0087¤Æýx\u0013¤©Ð\u0096r?\u0094Åqk:0ÂÆll:5\u009cÛSa%6\u0096^\u0080÷g\r\u0096£ßø~\u000eÜ¤Ãýt\u0013¸©Íþ{\u0014¤ªÞÃw\u0019´¯\u0094ÄA\u001a§°ÇÉD\u001f¾µÃÊ\u0017`¨¶¡Ï\u001beº»çnyÇ\u008a=|\u0093=È\u0085>%\u0094=Í\u0092#C\u00993Î\u0080$T\u009a)^è÷l\r\u009b£Ïøy\u000e\u009a¤ÔýsËÂb%\u0098Ô6\u009dm<\u009b\u009e1\u0088h0\u0086þ<\u0082kz\u0081ù?\u008fV>\u008cã:\u0090QA\u008fä%\u0086\\\u0006\u008aþ \u0084_Wõ¶#ýZ\u000eðö.¦EPó¿)¨@Pþ\u000e\u0014³CZù\u001f\u0017´NCä\u0011\u0012÷I`ç\u0004\u001d¸´|â\u0014\u0018¼·`".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1707);
        valueOf = cArr;
        DigitizedCardProfile = -4604690822002706685L;
    }

    static void init$1() {
        $$d = new byte[]{com.google.common.base.Ascii.ESC, -102, com.google.common.base.Ascii.SI, 46};
        $$e = 192;
    }

    static void init$0() {
        $$a = new byte[]{94, 87, -25, Byte.MAX_VALUE, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -15, 10};
        $$b = 17;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0bb0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0c7c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0d1e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0dda  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x1161  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x1235 A[Catch: all -> 0x01fd, TRY_ENTER, TryCatch #9 {all -> 0x01fd, blocks: (B:6:0x00f1, B:8:0x0104, B:9:0x0151, B:18:0x022b, B:20:0x0263, B:21:0x02b4, B:28:0x0349, B:30:0x035c, B:31:0x03ac, B:39:0x0470, B:41:0x04b7, B:42:0x0504, B:45:0x051a, B:47:0x0529, B:48:0x056e, B:54:0x0636, B:56:0x0694, B:57:0x06e9, B:76:0x07a6, B:78:0x07f3, B:79:0x0840, B:86:0x08ff, B:88:0x0912, B:89:0x095d, B:97:0x0a2b, B:99:0x0a74, B:100:0x0ac8, B:104:0x0b0a, B:106:0x0b1d, B:107:0x0b66, B:116:0x0bc8, B:118:0x0c13, B:119:0x0c66, B:140:0x0d35, B:142:0x0d72, B:143:0x0dc4, B:147:0x0dff, B:149:0x0e12, B:150:0x0e5b, B:156:0x0eb6, B:158:0x0efe, B:159:0x0f50, B:179:0x1179, B:181:0x11c8, B:182:0x121f, B:185:0x1235, B:187:0x1244, B:188:0x1285, B:192:0x1336, B:194:0x1381, B:195:0x13d3, B:198:0x13e9, B:200:0x1401, B:201:0x144c, B:207:0x1500, B:209:0x1539, B:210:0x158a, B:214:0x15ca, B:216:0x15dd, B:217:0x1626, B:219:0x162f, B:221:0x164d, B:222:0x1698, B:228:0x2440, B:230:0x2453, B:231:0x249d, B:242:0x28a9, B:244:0x28bc, B:245:0x290a, B:250:0x29d8, B:252:0x29eb, B:253:0x2a3d, B:261:0x2b0d, B:263:0x2b50, B:264:0x2ba3, B:295:0x2dea, B:297:0x2e38, B:298:0x2e8d, B:316:0x2f4f, B:318:0x2f9b, B:319:0x2fed, B:323:0x302a, B:325:0x303d, B:326:0x308c, B:330:0x3137, B:332:0x3175, B:333:0x31c9, B:337:0x31f7, B:339:0x3234, B:340:0x3284, B:362:0x24b2, B:364:0x24cf, B:365:0x251f, B:371:0x1fd9, B:373:0x1fec, B:374:0x203d, B:381:0x2059, B:383:0x206c, B:384:0x20ba, B:400:0x21e4, B:402:0x2226, B:403:0x227a, B:408:0x236d, B:410:0x23a7, B:411:0x23ff, B:416:0x22aa, B:418:0x22df, B:419:0x2333, B:437:0x105c, B:439:0x106f, B:440:0x10bd), top: B:5:0x00f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x2453 A[Catch: all -> 0x01fd, TryCatch #9 {all -> 0x01fd, blocks: (B:6:0x00f1, B:8:0x0104, B:9:0x0151, B:18:0x022b, B:20:0x0263, B:21:0x02b4, B:28:0x0349, B:30:0x035c, B:31:0x03ac, B:39:0x0470, B:41:0x04b7, B:42:0x0504, B:45:0x051a, B:47:0x0529, B:48:0x056e, B:54:0x0636, B:56:0x0694, B:57:0x06e9, B:76:0x07a6, B:78:0x07f3, B:79:0x0840, B:86:0x08ff, B:88:0x0912, B:89:0x095d, B:97:0x0a2b, B:99:0x0a74, B:100:0x0ac8, B:104:0x0b0a, B:106:0x0b1d, B:107:0x0b66, B:116:0x0bc8, B:118:0x0c13, B:119:0x0c66, B:140:0x0d35, B:142:0x0d72, B:143:0x0dc4, B:147:0x0dff, B:149:0x0e12, B:150:0x0e5b, B:156:0x0eb6, B:158:0x0efe, B:159:0x0f50, B:179:0x1179, B:181:0x11c8, B:182:0x121f, B:185:0x1235, B:187:0x1244, B:188:0x1285, B:192:0x1336, B:194:0x1381, B:195:0x13d3, B:198:0x13e9, B:200:0x1401, B:201:0x144c, B:207:0x1500, B:209:0x1539, B:210:0x158a, B:214:0x15ca, B:216:0x15dd, B:217:0x1626, B:219:0x162f, B:221:0x164d, B:222:0x1698, B:228:0x2440, B:230:0x2453, B:231:0x249d, B:242:0x28a9, B:244:0x28bc, B:245:0x290a, B:250:0x29d8, B:252:0x29eb, B:253:0x2a3d, B:261:0x2b0d, B:263:0x2b50, B:264:0x2ba3, B:295:0x2dea, B:297:0x2e38, B:298:0x2e8d, B:316:0x2f4f, B:318:0x2f9b, B:319:0x2fed, B:323:0x302a, B:325:0x303d, B:326:0x308c, B:330:0x3137, B:332:0x3175, B:333:0x31c9, B:337:0x31f7, B:339:0x3234, B:340:0x3284, B:362:0x24b2, B:364:0x24cf, B:365:0x251f, B:371:0x1fd9, B:373:0x1fec, B:374:0x203d, B:381:0x2059, B:383:0x206c, B:384:0x20ba, B:400:0x21e4, B:402:0x2226, B:403:0x227a, B:408:0x236d, B:410:0x23a7, B:411:0x23ff, B:416:0x22aa, B:418:0x22df, B:419:0x2333, B:437:0x105c, B:439:0x106f, B:440:0x10bd), top: B:5:0x00f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x24a6  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x28a7  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x2b50 A[Catch: all -> 0x01fd, TryCatch #9 {all -> 0x01fd, blocks: (B:6:0x00f1, B:8:0x0104, B:9:0x0151, B:18:0x022b, B:20:0x0263, B:21:0x02b4, B:28:0x0349, B:30:0x035c, B:31:0x03ac, B:39:0x0470, B:41:0x04b7, B:42:0x0504, B:45:0x051a, B:47:0x0529, B:48:0x056e, B:54:0x0636, B:56:0x0694, B:57:0x06e9, B:76:0x07a6, B:78:0x07f3, B:79:0x0840, B:86:0x08ff, B:88:0x0912, B:89:0x095d, B:97:0x0a2b, B:99:0x0a74, B:100:0x0ac8, B:104:0x0b0a, B:106:0x0b1d, B:107:0x0b66, B:116:0x0bc8, B:118:0x0c13, B:119:0x0c66, B:140:0x0d35, B:142:0x0d72, B:143:0x0dc4, B:147:0x0dff, B:149:0x0e12, B:150:0x0e5b, B:156:0x0eb6, B:158:0x0efe, B:159:0x0f50, B:179:0x1179, B:181:0x11c8, B:182:0x121f, B:185:0x1235, B:187:0x1244, B:188:0x1285, B:192:0x1336, B:194:0x1381, B:195:0x13d3, B:198:0x13e9, B:200:0x1401, B:201:0x144c, B:207:0x1500, B:209:0x1539, B:210:0x158a, B:214:0x15ca, B:216:0x15dd, B:217:0x1626, B:219:0x162f, B:221:0x164d, B:222:0x1698, B:228:0x2440, B:230:0x2453, B:231:0x249d, B:242:0x28a9, B:244:0x28bc, B:245:0x290a, B:250:0x29d8, B:252:0x29eb, B:253:0x2a3d, B:261:0x2b0d, B:263:0x2b50, B:264:0x2ba3, B:295:0x2dea, B:297:0x2e38, B:298:0x2e8d, B:316:0x2f4f, B:318:0x2f9b, B:319:0x2fed, B:323:0x302a, B:325:0x303d, B:326:0x308c, B:330:0x3137, B:332:0x3175, B:333:0x31c9, B:337:0x31f7, B:339:0x3234, B:340:0x3284, B:362:0x24b2, B:364:0x24cf, B:365:0x251f, B:371:0x1fd9, B:373:0x1fec, B:374:0x203d, B:381:0x2059, B:383:0x206c, B:384:0x20ba, B:400:0x21e4, B:402:0x2226, B:403:0x227a, B:408:0x236d, B:410:0x23a7, B:411:0x23ff, B:416:0x22aa, B:418:0x22df, B:419:0x2333, B:437:0x105c, B:439:0x106f, B:440:0x10bd), top: B:5:0x00f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x2aec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x2d71  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x2dd2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x2ea3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x2f37  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x3003  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x2dcd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x24b1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0856  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] values(android.content.Context context, int i, int i2, int i3) {
        java.lang.Integer num;
        java.lang.String str;
        java.lang.String str2;
        int i4;
        int i5;
        java.lang.String str3;
        int i6;
        java.lang.Integer num2;
        int i7;
        int i8;
        java.lang.String str4;
        java.lang.Object obj;
        int i9;
        int i10;
        java.lang.Object obj2;
        java.lang.String str5;
        int i11;
        java.lang.Object[] objArr;
        int i12;
        java.lang.String[][] strArr;
        int i13;
        int i14;
        java.lang.String str6;
        java.util.ArrayList arrayList;
        java.lang.String str7;
        java.lang.Object obj3;
        java.lang.Object invoke;
        int i15;
        char c;
        int i16;
        java.lang.String str8;
        int i17;
        int i18;
        java.lang.String intern;
        java.io.File file;
        java.lang.String str9;
        java.lang.String next;
        java.lang.String[] strArr2;
        int i19;
        int i20;
        java.lang.Object obj4;
        java.lang.String[] strArr3;
        java.lang.String str10;
        java.lang.String next2;
        java.lang.String next3;
        int i21 = 0;
        java.lang.Integer num3 = 0;
        java.lang.Integer num4 = 16;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(android.view.View.resolveSize(0, 0) + 465, (char) (12844 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7, objArr2);
        java.lang.String intern2 = ((java.lang.String) objArr2[0]).intern();
        java.lang.String str11 = "";
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(167 - android.graphics.Color.green(0), (char) (16257 - android.view.KeyEvent.keyCodeFromString("")), 2 - android.view.View.MeasureSpec.getSize(0), objArr3);
        java.lang.String intern3 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.FS, objArr4);
        java.lang.String intern4 = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 28, (char) android.view.View.getDefaultSize(0, 0), 26 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr5);
        java.lang.String intern5 = ((java.lang.String) objArr5[0]).intern();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(android.text.TextUtils.getTrimmedLength("") + 52, (char) (12993 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 18 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr6);
        java.lang.String intern6 = ((java.lang.String) objArr6[0]).intern();
        float f = 0.0f;
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a(70 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 29, objArr7);
        java.lang.String[] strArr4 = {intern4, intern5, intern6, ((java.lang.String) objArr7[0]).intern()};
        int i22 = 0;
        while (true) {
            if (i22 >= 4) {
                num = num3;
                str = intern2;
                str2 = intern3;
                i4 = i;
                break;
            }
            try {
                java.lang.Object[] objArr8 = {strArr4[i22]};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                if (obj5 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(i21, i21) + 36, (android.graphics.PointF.length(f, f) > f ? 1 : (android.graphics.PointF.length(f, f) == f ? 0 : -1)) + 3161, (char) (((android.os.Process.getThreadPriority(i21) + 20) >> 6) + 33099));
                    int i23 = $$a[14] + 1;
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b((byte) i23, (byte) $$b, (short) i23, objArr9);
                    obj5 = cls.getMethod((java.lang.String) objArr9[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj5);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                long j = i;
                long j2 = ~j;
                num = num3;
                long j3 = ~longValue;
                str = intern2;
                str2 = intern3;
                long j4 = ((((((-756) * longValue) + 334284330816L) + ((j2 | 441008352) * (-757))) + ((~((j3 | 441008352) | j)) * 1514)) + ((((~(j3 | j2)) | (~((-441008353) | j3))) | (((441008352 | longValue) | j) ^ (-1))) * 757)) - 1778676460;
                int i24 = ~i;
                int i25 = ~(1647143516 | i24);
                int i26 = ~((-645722962) | i24);
                if (((((int) j4) & (((5280001 | i26) * (-712)) + 2141249245 + (((~(i24 | (-5280002))) | (~((-640442961) | i))) * (-712)) + ((i26 | 791503448) * 712))) | (((int) (j4 >> 32)) & (((65552 | i25) * (-970)) + 1563020882 + ((i25 | 1647077964) * 970)))) != 0) {
                    i4 = (i22 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE) ^ i;
                    break;
                }
                i22++;
                num3 = num;
                intern2 = str;
                intern3 = str2;
                i21 = 0;
                f = 0.0f;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (i4 != i) {
            java.lang.Object[] objArr10 = {new int[]{i}, new int[]{i4}, null, null, new int[1]};
            int i27 = ~i;
            java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i3), num4, java.lang.Integer.valueOf((((((~((-15947007) | i27)) | 4329618) | r1) * (-502)) - 70652963) + (((~(i | 2046516479)) | (~(i27 | (-11617389)))) * 502))};
            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj6 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.view.KeyEvent.getDeadChar(0, 0) + 2713, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                byte b = (byte) ($$a[14] + 1);
                byte b2 = b;
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                b(b, b2, (short) (b2 | 653), objArr12);
                obj6 = cls2.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
            }
            ((int[]) objArr10[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr11)).intValue();
            return objArr10;
        }
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a(98 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (63318 - android.text.TextUtils.getCapsMode("", 0, 0)), 13 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr13);
        java.lang.String intern7 = ((java.lang.String) objArr13[0]).intern();
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        a(110 - android.text.TextUtils.getOffsetBefore("", 0), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), 12 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr14);
        java.lang.String intern8 = ((java.lang.String) objArr14[0]).intern();
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        a(171 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (23932 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), 19 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr15);
        java.lang.String[] strArr5 = {intern7, intern8, ((java.lang.String) objArr15[0]).intern()};
        int i28 = 0;
        while (true) {
            if (i28 >= 3) {
                i5 = i;
                break;
            }
            java.lang.Object[] objArr16 = {strArr5[i28]};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
            if (obj7 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 36, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3160, (char) (33099 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)));
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                b((byte) $$b, (byte) (-$$a[21]), androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, objArr17);
                obj7 = cls3.getMethod((java.lang.String) objArr17[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj7);
            }
            long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj7).invoke(null, objArr16)).longValue();
            long j5 = ~((~longValue2) | (-999996374));
            long j6 = ~(i | (-999996374));
            long j7 = (((-657) * longValue2) - 658997610466L) + (((~(longValue2 | 999996373)) | j5 | j6) * (-658)) + (658 * j5) + ((j5 | j6) * 658) + 1995431277;
            int i29 = (int) (j7 >> 32);
            int i30 = ~i;
            if (((i29 & ((((~((-311383877) | i)) | 277152000 | (~(1125842534 | i))) * (-754)) + 1515721606 + (((~((-277152001) | i)) | (~(1402994534 | i30))) * (-754)) + (((-311383877) | i30) * 754))) | (((int) j7) & ((((~(411191199 | i)) | (-1034571680)) * 576) + 1771465493 + (((~(i30 | (-623380481))) | 8536469) * 576) + 1087166464))) != 0) {
                i5 = (i28 + 270) ^ i;
                break;
            }
            i28++;
        }
        if (i5 != i) {
            values = (writeReplace + 55) % 128;
            java.lang.Object[] objArr18 = {new int[]{i}, new int[]{i5}, null, null, new int[1]};
            java.lang.Object[] objArr19 = {java.lang.Integer.valueOf(i3), num4, java.lang.Integer.valueOf(((((~(1261931292 | r2)) | 604004449) * (-108)) - 1442020753) + (((~((~i) | 788914805)) | (~((-788914806) | i)) | 1077020936) * 54) + ((i | 1077020936) * 54))};
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj8 == null) {
                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 50, android.text.TextUtils.getTrimmedLength("") + 2713, (char) (android.os.Process.getGidForName("") + 1));
                byte b3 = (byte) ($$a[14] + 1);
                byte b4 = b3;
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                b(b3, b4, (short) (b4 | 653), objArr20);
                obj8 = cls4.getMethod((java.lang.String) objArr20[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
            }
            ((int[]) objArr18[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr19)).intValue();
            return objArr18;
        }
        java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1781008036);
        if (obj9 == null) {
            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1864 - android.graphics.Color.green(0), (char) (41775 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)));
            int i31 = $$a[14] + 1;
            java.lang.Object[] objArr21 = new java.lang.Object[1];
            b((byte) i31, (byte) $$b, (short) i31, objArr21);
            obj9 = cls5.getMethod((java.lang.String) objArr21[0], null);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1781008036, obj9);
        }
        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj9).invoke(null, null)).longValue();
        long j8 = i;
        long j9 = ~(1466721906 | j8);
        long j10 = ~longValue3;
        long j11 = ~j8;
        long j12 = ((((((-139) * longValue3) - 206807788887L) + (((~(longValue3 | 1466721906)) | j9) * (-280))) + (((~(j10 | j8)) | j9) * 140)) + ((((~((1466721906 | j10) | j8)) | (~((j11 | 1466721906) | longValue3))) | (~((j10 | j11) | (-1466721907)))) * 140)) - 462490955;
        int i32 = ~i;
        int i33 = (((int) j12) & (((((~(1339637597 | i)) | (~((-97588813) | i32))) * (-318)) - 1936324173) + (((~((-265371214) | i)) | 167782401) * (-318)) + (((~(265371213 | i)) | 1171855196) * 318))) | (((int) (j12 >> 32)) & ((((~(2026604338 | i32)) | 831136546) * (-983)) + 461710280 + (((~(831136546 | i32)) | 1212253200) * 983)));
        int i34 = i33 != 0 ? (i33 + 199) ^ i : i;
        if (i34 != i) {
            java.lang.Object[] objArr22 = {new int[]{i}, new int[]{i34}, null, null, new int[1]};
            java.lang.Object[] objArr23 = {java.lang.Integer.valueOf(i3), num4, java.lang.Integer.valueOf((((((~((-485494017) | i32)) | 473956352) | (~((-1565352082) | i32))) * (-1136)) - 1299675319) + (((~((-485494017) | i)) | (~((-1565352082) | i)) | (~(1576889745 | i32))) * (-568)) + (((~(i | (-473956353))) | (~(i32 | 1565352081)) | (~(485494016 | i32))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))};
            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj10 == null) {
                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2713 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1));
                byte b5 = (byte) ($$a[14] + 1);
                byte b6 = b5;
                java.lang.Object[] objArr24 = new java.lang.Object[1];
                b(b5, b6, (short) (b6 | 653), objArr24);
                obj10 = cls6.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
            }
            ((int[]) objArr22[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr23)).intValue();
            return objArr22;
        }
        java.lang.Object[] objArr25 = new java.lang.Object[1];
        a(141 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.os.Process.myTid() >> 22), 21 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr25);
        java.lang.String intern9 = ((java.lang.String) objArr25[0]).intern();
        java.lang.Object[] objArr26 = new java.lang.Object[1];
        a(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 161, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), 6 - android.view.View.resolveSizeAndState(0, 0, 0), objArr26);
        java.lang.String intern10 = ((java.lang.String) objArr26[0]).intern();
        java.io.File file2 = new java.io.File(intern9);
        if (file2.exists() && file2.isFile()) {
            try {
                java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(file2));
                str3 = str2;
                try {
                    java.util.Scanner useDelimiter = scanner.useDelimiter(str3);
                    next3 = useDelimiter.hasNext() ? useDelimiter.next() : "";
                    useDelimiter.close();
                } catch (java.io.IOException unused) {
                }
            } catch (java.io.IOException unused2) {
            }
            if (next3.contains(intern10)) {
                i6 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
                if (i6 != i) {
                    values = (writeReplace + 55) % 128;
                    java.lang.Object[] objArr27 = {new int[]{i}, new int[]{i6}, null, null, new int[1]};
                    java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(i3), num4, java.lang.Integer.valueOf((((~((-1445599283) | i32)) | (~((-605246816) | i)) | (~(605246815 | i32))) * 959) + 1988312546 + (((~(i | (-1445599283))) | (~(i32 | (-605246816))) | (~(605246815 | i))) * 959))};
                    java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj11 == null) {
                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.blue(0), android.text.TextUtils.getOffsetBefore("", 0) + 2713, (char) android.view.View.MeasureSpec.getMode(0));
                        byte b7 = (byte) ($$a[14] + 1);
                        byte b8 = b7;
                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                        b(b7, b8, (short) (b8 | 653), objArr29);
                        obj11 = cls7.getMethod((java.lang.String) objArr29[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj11);
                    }
                    ((int[]) objArr27[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr28)).intValue();
                    return objArr27;
                }
                java.lang.Object[] objArr30 = new java.lang.Object[1];
                a(170 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) android.graphics.Color.green(0), 31 - android.graphics.Color.red(0), objArr30);
                java.lang.String intern11 = ((java.lang.String) objArr30[0]).intern();
                java.lang.Object[] objArr31 = new java.lang.Object[1];
                a(200 - android.text.TextUtils.getTrimmedLength(""), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 63019), 23 - android.text.TextUtils.getOffsetBefore("", 0), objArr31);
                java.lang.String intern12 = ((java.lang.String) objArr31[0]).intern();
                java.lang.Object[] objArr32 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getEdgeSlop() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, (char) (25545 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27, objArr32);
                java.lang.String intern13 = ((java.lang.String) objArr32[0]).intern();
                java.lang.String str12 = str3;
                java.lang.Object[] objArr33 = new java.lang.Object[1];
                a(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13, objArr33);
                java.lang.String[] strArr6 = {intern11, intern12, intern13, ((java.lang.String) objArr33[0]).intern()};
                int i35 = 0;
                while (true) {
                    if (i35 >= 4) {
                        num2 = num4;
                        i7 = i;
                        break;
                    }
                    java.lang.Object[] objArr34 = {strArr6[i35]};
                    java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                    if (obj12 == null) {
                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 36, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 3161, (char) (33099 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)));
                        int i36 = $$b;
                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                        b((byte) (i36 + 1), (byte) i36, 618, objArr35);
                        obj12 = cls8.getMethod((java.lang.String) objArr35[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj12);
                    }
                    long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj12).invoke(null, objArr34)).longValue();
                    long j13 = ~longValue4;
                    long j14 = ~(longValue4 | (-1050919876));
                    java.lang.String[] strArr7 = strArr6;
                    int i37 = i35;
                    num2 = num4;
                    long j15 = ((longValue4 * 371) - 389891273996L) + (((~(j13 | j11)) | (~(j8 | 1050919875))) * (-370)) + (((~(j11 | 1050919875)) | (~(j13 | j8)) | j14) * (-370)) + (j14 * 370) + 1958390614;
                    i32 = i32;
                    if (((((int) (j15 >> 32)) & ((((~((-1423707580) | i32)) | (~(1434033305 | i32)) | (~(1423707579 | i))) * 959) + 1992047789 + (((~(1423707579 | i32)) | (~(1434033305 | i)) | (~((-1423707580) | i))) * 959))) | (((int) j15) & ((((~((-1360642975) | i)) | 1360642710) * 576) + 1771465493 + (((~(i32 | (-265))) | 136455201) * 576) + 2046153088))) != 0) {
                        i7 = (i37 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) ^ i;
                        break;
                    }
                    i35 = i37 + 1;
                    strArr6 = strArr7;
                    num4 = num2;
                }
                if (i7 != i) {
                    java.lang.Object[] objArr36 = {new int[]{i}, new int[]{i7}, null, null, new int[1]};
                    java.lang.Object[] objArr37 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((~((-1115438) | i32)) | (~((-2016168001) | i32))) * (-184)) - 1642680999) + (((~(i32 | (-2032949331))) | (~((-17896768) | i32)) | 16781330) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 605762376)};
                    java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj13 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2713 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                        byte b9 = (byte) ($$a[14] + 1);
                        byte b10 = b9;
                        java.lang.Object[] objArr38 = new java.lang.Object[1];
                        b(b9, b10, (short) (b10 | 653), objArr38);
                        obj13 = cls9.getMethod((java.lang.String) objArr38[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj13);
                    }
                    ((int[]) objArr36[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj13).invoke(null, objArr37)).intValue();
                    return objArr36;
                }
                java.lang.Object[] objArr39 = new java.lang.Object[1];
                a(265 - android.view.View.resolveSize(0, 0), (char) (49283 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 13 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr39);
                java.lang.Object[] objArr40 = {((java.lang.String) objArr39[0]).intern()};
                java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj14 == null) {
                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 40, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1921, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    int i38 = $$a[14] + 1;
                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                    b((byte) i38, (byte) $$b, (short) i38, objArr41);
                    obj14 = cls10.getMethod((java.lang.String) objArr41[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj14);
                }
                java.lang.String str13 = (java.lang.String) ((java.lang.reflect.Method) obj14).invoke(null, objArr40);
                if (str13 != null) {
                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                    a(android.view.Gravity.getAbsoluteGravity(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 10, objArr42);
                    if (str13.contains(((java.lang.String) objArr42[0]).intern())) {
                        int i39 = values + 73;
                        writeReplace = i39 % 128;
                        i8 = i39 % 2 != 0 ? i ^ 22549 : i ^ 250;
                        if (i8 == i) {
                            java.lang.Object[] objArr43 = {new int[]{i}, new int[]{i8}, null, null, new int[1]};
                            java.lang.Object[] objArr44 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~((-1467945376) | i32)) | 37622162) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + 1106085481 + ((~((-37622163) | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(i | (-1430323214))) | (~(i32 | (-582900723))) | 545278560) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                            java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj15 == null) {
                                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 2712 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                byte b11 = (byte) ($$a[14] + 1);
                                byte b12 = b11;
                                java.lang.Object[] objArr45 = new java.lang.Object[1];
                                b(b11, b12, (short) (b12 | 653), objArr45);
                                obj15 = cls11.getMethod((java.lang.String) objArr45[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj15);
                            }
                            ((int[]) objArr43[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr44)).intValue();
                            return objArr43;
                        }
                        java.lang.Object[] objArr46 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 17 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr46);
                        java.lang.String intern14 = ((java.lang.String) objArr46[0]).intern();
                        java.lang.Object[] objArr47 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 304, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.widget.ExpandableListView.getPackedPositionChild(0L) + 7, objArr47);
                        java.lang.String intern15 = ((java.lang.String) objArr47[0]).intern();
                        java.io.File file3 = new java.io.File(intern14);
                        if (file3.exists()) {
                            int i40 = values + 91;
                            writeReplace = i40 % 128;
                            if (i40 % 2 != 0) {
                                file3.isFile();
                                throw null;
                            }
                            if (file3.isFile()) {
                                try {
                                    str4 = str12;
                                    try {
                                        java.util.Scanner useDelimiter2 = new java.util.Scanner(new java.io.FileInputStream(file3)).useDelimiter(str4);
                                        next2 = useDelimiter2.hasNext() ? useDelimiter2.next() : "";
                                        useDelimiter2.close();
                                    } catch (java.io.IOException unused3) {
                                    }
                                } catch (java.io.IOException unused4) {
                                }
                                if (next2.contains(intern15)) {
                                    i9 = i ^ 251;
                                    obj = null;
                                    if (i9 != i) {
                                        java.lang.Object[] objArr48 = {new int[]{i}, new int[]{i9}, obj, obj, new int[1]};
                                        java.lang.Object[] objArr49 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~((-216159542) | i)) | 205656084) * 1504) + 1707840417 + ((~(i | (-10503458))) * (-1504)) + 273900656)};
                                        java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj16 == null) {
                                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2713 - (android.os.Process.myPid() >> 22), (char) android.graphics.Color.blue(0));
                                            byte b13 = (byte) ($$a[14] + 1);
                                            byte b14 = b13;
                                            java.lang.Object[] objArr50 = new java.lang.Object[1];
                                            b(b13, b14, (short) (b14 | 653), objArr50);
                                            obj16 = cls12.getMethod((java.lang.String) objArr50[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj16);
                                        }
                                        ((int[]) objArr48[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, objArr49)).intValue();
                                        return objArr48;
                                    }
                                    java.lang.Object[] objArr51 = new java.lang.Object[1];
                                    a(android.text.TextUtils.getOffsetBefore("", 0) + 310, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 23, objArr51);
                                    java.lang.Object[] objArr52 = {((java.lang.String) objArr51[0]).intern()};
                                    java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj17 == null) {
                                        java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1921 - android.text.TextUtils.getOffsetBefore("", 0), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                        int i41 = $$a[14] + 1;
                                        java.lang.Object[] objArr53 = new java.lang.Object[1];
                                        b((byte) i41, (byte) $$b, (short) i41, objArr53);
                                        obj17 = cls13.getMethod((java.lang.String) objArr53[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj17);
                                    }
                                    java.lang.String lowerCase = ((java.lang.String) ((java.lang.reflect.Method) obj17).invoke(null, objArr52)).toLowerCase();
                                    java.lang.Object[] objArr54 = new java.lang.Object[1];
                                    a((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + com.visa.cbp.getCertUsage.getAppPrgrmIDAID, (char) (55151 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), android.text.TextUtils.getOffsetBefore("", 0) + 4, objArr54);
                                    int i42 = lowerCase.contains(((java.lang.String) objArr54[0]).intern()) ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE : i;
                                    if (i42 != i) {
                                        java.lang.Object[] objArr55 = {new int[]{i}, new int[]{i42}, null, null, new int[1]};
                                        java.lang.Object[] objArr56 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~((-172404229) | i)) | (~(1878441869 | i))) * 69) + 587772836 + (((~(i | (-174501381))) | 2097152 | (~(1876344717 | i))) * (-69)) + 1607776749)};
                                        java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj18 == null) {
                                            java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.argb(0, 0, 0, 0), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2665, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                            byte b15 = (byte) ($$a[14] + 1);
                                            byte b16 = b15;
                                            java.lang.Object[] objArr57 = new java.lang.Object[1];
                                            b(b15, b16, (short) (b16 | 653), objArr57);
                                            obj18 = cls14.getMethod((java.lang.String) objArr57[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj18);
                                        }
                                        ((int[]) objArr55[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj18).invoke(null, objArr56)).intValue();
                                        return objArr55;
                                    }
                                    java.lang.Object[] objArr58 = new java.lang.Object[1];
                                    a(android.graphics.Color.rgb(0, 0, 0) + 16777503, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 18, objArr58);
                                    java.lang.String intern16 = ((java.lang.String) objArr58[0]).intern();
                                    java.lang.Object[] objArr59 = new java.lang.Object[1];
                                    a(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 338, (char) (26077 - android.view.View.MeasureSpec.getMode(0)), (-16777210) - android.graphics.Color.rgb(0, 0, 0), objArr59);
                                    java.lang.String intern17 = ((java.lang.String) objArr59[0]).intern();
                                    java.io.File file4 = new java.io.File(intern16);
                                    if (file4.exists()) {
                                        int i43 = writeReplace + 25;
                                        values = i43 % 128;
                                        if (i43 % 2 == 0) {
                                            file4.isFile();
                                            throw null;
                                        }
                                        if (file4.isFile()) {
                                            try {
                                                java.util.Scanner useDelimiter3 = new java.util.Scanner(new java.io.FileInputStream(file4)).useDelimiter(str4);
                                                if (useDelimiter3.hasNext()) {
                                                    int i44 = writeReplace + 13;
                                                    values = i44 % 128;
                                                    if (i44 % 2 == 0) {
                                                        useDelimiter3.next();
                                                        throw new java.lang.ArithmeticException();
                                                    }
                                                    str10 = useDelimiter3.next();
                                                } else {
                                                    str10 = "";
                                                }
                                                useDelimiter3.close();
                                            } catch (java.io.IOException unused5) {
                                            }
                                            if (str10.contains(intern17)) {
                                                i10 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                                if (i10 == i) {
                                                    java.lang.Object[] objArr60 = {new int[]{i}, new int[]{i10}, null, null, new int[1]};
                                                    java.lang.Object[] objArr61 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((~((-1716489109) | i32)) | 334356989) * (-90)) - 150360050) + (((~((-1716489109) | i)) | (-2012212222)) * (-45)) + (((~(i | (-334356990))) | (-1716489109) | (~(i32 | 334356989))) * 45))};
                                                    java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj19 == null) {
                                                        java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2713, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                                                        byte b17 = (byte) ($$a[14] + 1);
                                                        byte b18 = b17;
                                                        java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                        b(b17, b18, (short) (b18 | 653), objArr62);
                                                        obj19 = cls15.getMethod((java.lang.String) objArr62[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj19);
                                                    }
                                                    ((int[]) objArr60[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(null, objArr61)).intValue();
                                                    return objArr60;
                                                }
                                                java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1102036426);
                                                if (obj20 == null) {
                                                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.graphics.Color.argb(0, 0, 0, 0) + 2763, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                                    int i45 = $$a[14] + 1;
                                                    java.lang.Object[] objArr63 = new java.lang.Object[1];
                                                    b((byte) i45, (byte) $$b, (short) i45, objArr63);
                                                    obj20 = cls16.getMethod((java.lang.String) objArr63[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1102036426, obj20);
                                                }
                                                long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, null)).longValue();
                                                long j16 = ~longValue5;
                                                java.lang.String str14 = str4;
                                                long j17 = (((-97) * longValue5) - 79914505200L) + (((~(j16 | j11)) | (~(j16 | (-1598290104)))) * 98) + (((~(j11 | 1598290103)) | j16 | (~((-1598290104) | j8))) * (-49)) + (((~(j16 | j8)) | (~(longValue5 | (-1598290104)))) * 49) + 1723326867;
                                                if (((((int) (j17 >> 32)) & ((((~((-14627918) | i32)) * (-560)) - 1966436662) + ((~((-8978505) | i)) * (-560)) + (((~(1451854328 | i32)) | (-1457503742)) * 560))) | (((int) j17) & ((((((~((-1799683730) | i32)) | 721463936) | r6) * (-502)) - 39583403) + (((~(2136276949 | i)) | (~((-1078219794) | i32))) * 502)))) == 1) {
                                                    java.lang.Object[] objArr64 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                                    int i46 = ~(669578000 | i);
                                                    java.lang.Object[] objArr65 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((1343490177 | i46) * (-814)) + 2010600392 + ((i46 | (~(i32 | (-1381268098))) | 631800080) * 407) + (((~(i | (-669578001))) | 631800080 | (~(1381268097 | i))) * 407))};
                                                    java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj21 == null) {
                                                        java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 51, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 2713, (char) android.text.TextUtils.indexOf("", "", 0));
                                                        byte b19 = (byte) ($$a[14] + 1);
                                                        byte b20 = b19;
                                                        java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                        b(b19, b20, (short) (b20 | 653), objArr66);
                                                        obj21 = cls17.getMethod((java.lang.String) objArr66[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj21);
                                                    }
                                                    ((int[]) objArr64[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr65)).intValue();
                                                    return objArr64;
                                                }
                                                java.lang.Object[] objArr67 = {1};
                                                java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                                if (obj22 == null) {
                                                    java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 27, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2364, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                                                    int i47 = $$a[14] + 1;
                                                    java.lang.Object[] objArr68 = new java.lang.Object[1];
                                                    b((byte) i47, (byte) $$b, (short) i47, objArr68);
                                                    obj22 = cls18.getMethod((java.lang.String) objArr68[0], java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj22);
                                                }
                                                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj22).invoke(null, objArr67)).longValue();
                                                long j18 = ~longValue6;
                                                java.lang.String str15 = str14;
                                                int i48 = i32;
                                                long j19 = (((-661) * longValue6) - 524516994315L) + ((j11 | (~(j18 | (-793520416)))) * 1324) + (((~(793520415 | j8)) | (~(longValue6 | j8))) * (-1324)) + (((~((-793520416) | longValue6)) | (~(793520415 | j18))) * 662) + 614389784;
                                                int i49 = (int) (j19 >> 32);
                                                int i50 = ~(i48 | (-1470789260));
                                                int i51 = ((i49 & ((((65856 | i50) * (-970)) - 1993540318) + ((i50 | (-1470855116)) * 970))) | (((int) j19) & ((((((~(1538754978 | i)) | 67641361) * (-140)) + 358807803) + ((~(1606396339 | i)) * 70)) + (((~(1318985907 | i)) | 355051793) * 70)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE : i;
                                                if (i51 != i) {
                                                    values = (writeReplace + 99) % 128;
                                                    java.lang.Object[] objArr69 = {new int[]{i}, new int[]{i51}, null, null, new int[1]};
                                                    java.lang.Object[] objArr70 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((~((-612915427) | i)) | 537413696) * (-283)) - 479900591) + ((~(i | (-75501731))) * 283))};
                                                    java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj23 == null) {
                                                        java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 50, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 2714, (char) android.view.View.resolveSize(0, 0));
                                                        byte b21 = (byte) ($$a[14] + 1);
                                                        byte b22 = b21;
                                                        java.lang.Object[] objArr71 = new java.lang.Object[1];
                                                        b(b21, b22, (short) (b22 | 653), objArr71);
                                                        obj23 = cls19.getMethod((java.lang.String) objArr71[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj23);
                                                    }
                                                    ((int[]) objArr69[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr70)).intValue();
                                                    return objArr69;
                                                }
                                                java.lang.Object[] objArr72 = new java.lang.Object[1];
                                                a(android.graphics.Color.argb(0, 0, 0, 0) + 310, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23, objArr72);
                                                java.lang.Object[] objArr73 = {((java.lang.String) objArr72[0]).intern()};
                                                java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj24 == null) {
                                                    java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 40, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1921, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                    int i52 = $$a[14] + 1;
                                                    java.lang.Object[] objArr74 = new java.lang.Object[1];
                                                    b((byte) i52, (byte) $$b, (short) i52, objArr74);
                                                    obj24 = cls20.getMethod((java.lang.String) objArr74[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj24);
                                                }
                                                java.lang.Object invoke2 = ((java.lang.reflect.Method) obj24).invoke(null, objArr73);
                                                if (invoke2 != null) {
                                                    java.lang.Object[] objArr75 = {invoke2, 42};
                                                    java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                    if (obj25 == null) {
                                                        java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 28, 2594 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) android.view.KeyEvent.getDeadChar(0, 0));
                                                        int i53 = $$a[14] + 1;
                                                        java.lang.Object[] objArr76 = new java.lang.Object[1];
                                                        b((byte) i53, (byte) $$b, (short) i53, objArr76);
                                                        obj25 = cls21.getMethod((java.lang.String) objArr76[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj25);
                                                    }
                                                    obj2 = null;
                                                    long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj25).invoke(null, objArr75)).longValue();
                                                    long j20 = ~longValue7;
                                                    long j21 = ~(j11 | longValue7);
                                                    long j22 = 883728809 + ((971 * longValue7) - 723967755385L) + (((~(j20 | 373371715)) | j21) * (-970)) + ((~((-373371716) | longValue7)) * 1940) + (((~((-373371716) | j20)) | j21) * 970);
                                                    if (((((int) j22) & ((((i48 | (-1155212692)) * (-757)) - 1023885388) + ((~((-1141900674) | i)) * 1514) + (((~(i48 | 282013718)) | (-1423914392) | (~((-13312019) | i))) * 757))) | (((int) (j22 >> 32)) & ((((i48 | 1079703807) * (-757)) - 1627416050) + ((~((-352650241) | i)) * 1514) + (((~(i48 | (-357522604))) | 4872363 | (~(1432354047 | i))) * 757)))) == 1986687685) {
                                                        str5 = "";
                                                        i12 = 0;
                                                        java.lang.Object[] objArr77 = new java.lang.Object[1];
                                                        a((android.util.TypedValue.complexToFraction(i12, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i12, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 446, (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15664), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16, objArr77);
                                                        java.lang.Object[] objArr78 = {((java.lang.String) objArr77[0]).intern()};
                                                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                        if (obj3 == null) {
                                                            java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777256, android.graphics.Color.alpha(0) + 1921, (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                                            int i54 = $$a[14] + 1;
                                                            java.lang.Object[] objArr79 = new java.lang.Object[1];
                                                            b((byte) i54, (byte) $$b, (short) i54, objArr79);
                                                            obj3 = cls22.getMethod((java.lang.String) objArr79[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj3);
                                                        }
                                                        invoke = ((java.lang.reflect.Method) obj3).invoke(null, objArr78);
                                                        if (invoke != null) {
                                                            writeReplace = (values + 31) % 128;
                                                            i15 = 0;
                                                        } else {
                                                            java.lang.Object[] objArr80 = {invoke, 42};
                                                            java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                            if (obj26 == null) {
                                                                java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 27, 2594 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) android.text.TextUtils.getCapsMode(str5, 0, 0));
                                                                int i55 = $$a[14] + 1;
                                                                java.lang.Object[] objArr81 = new java.lang.Object[1];
                                                                b((byte) i55, (byte) $$b, (short) i55, objArr81);
                                                                obj26 = cls23.getMethod((java.lang.String) objArr81[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj26);
                                                            }
                                                            long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr80)).longValue();
                                                            long j23 = ~(181335545 | longValue8);
                                                            long j24 = ~longValue8;
                                                            long j25 = ((longValue8 * (-448)) - 81600995700L) + (((~((-181335546) | j24 | j8)) | j23) * 449) + ((-1347) * j23) + ((j23 | (~(j24 | j11 | (-181335546)))) * 449) + 1438436070;
                                                            i15 = (((int) j25) & ((((~((-360141674) | i)) | 18940161) * (-566)) + 692970123 + ((~((-341201513) | i)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))) | (((int) (j25 >> 32)) & ((((((~((-1987591146) | i)) | 541598248) | (~((-550364735) | i))) * (-754)) - 499454086) + (((~((-541598249) | i)) | (~(i48 | (-8766487)))) * (-754)) + ((i48 | (-1987591146)) * 754)));
                                                        }
                                                        if (i15 != 1986687685 && i15 != -1514516938) {
                                                            java.lang.Object[] objArr82 = new java.lang.Object[1];
                                                            a((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1161, (char) (android.graphics.Color.red(0) + 44395), 14 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr82);
                                                            java.lang.String intern18 = ((java.lang.String) objArr82[0]).intern();
                                                            java.lang.Object[] objArr83 = new java.lang.Object[1];
                                                            a(1175 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.os.Process.getGidForName(str5) + 1), 26 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr83);
                                                            java.lang.String intern19 = ((java.lang.String) objArr83[0]).intern();
                                                            java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                            a(1201 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (59660 - android.os.Process.getGidForName(str5)), android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 18, objArr84);
                                                            java.lang.String intern20 = ((java.lang.String) objArr84[0]).intern();
                                                            java.lang.Object[] objArr85 = new java.lang.Object[1];
                                                            a((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1218, (char) android.graphics.Color.green(0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16, objArr85);
                                                            java.lang.String intern21 = ((java.lang.String) objArr85[0]).intern();
                                                            java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                            a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1235, (char) (33643 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), 15 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr86);
                                                            java.lang.String intern22 = ((java.lang.String) objArr86[0]).intern();
                                                            java.lang.Object[] objArr87 = new java.lang.Object[1];
                                                            a(1251 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) android.graphics.Color.alpha(0), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 37, objArr87);
                                                            java.lang.String intern23 = ((java.lang.String) objArr87[0]).intern();
                                                            java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                            a(android.view.Gravity.getAbsoluteGravity(0, 0) + 1287, (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 53801), android.text.TextUtils.getTrimmedLength(str5) + 12, objArr88);
                                                            java.lang.String intern24 = ((java.lang.String) objArr88[0]).intern();
                                                            java.lang.Object[] objArr89 = new java.lang.Object[1];
                                                            a((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1299, (char) (10051 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 13 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr89);
                                                            java.lang.String intern25 = ((java.lang.String) objArr89[0]).intern();
                                                            java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                            a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1312, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), 22 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr90);
                                                            java.lang.String intern26 = ((java.lang.String) objArr90[0]).intern();
                                                            java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                            a(1334 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (21226 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, objArr91);
                                                            java.lang.String intern27 = ((java.lang.String) objArr91[0]).intern();
                                                            java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                            a(1365 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (7834 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.graphics.Color.red(0) + 12, objArr92);
                                                            java.lang.String intern28 = ((java.lang.String) objArr92[0]).intern();
                                                            java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                            a(1377 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), 13 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr93);
                                                            java.lang.String intern29 = ((java.lang.String) objArr93[0]).intern();
                                                            java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                            a(1389 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (13838 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 12 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr94);
                                                            java.lang.String intern30 = ((java.lang.String) objArr94[0]).intern();
                                                            java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                            a(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1402, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 25848), android.view.View.combineMeasuredStates(0, 0) + 12, objArr95);
                                                            java.lang.String intern31 = ((java.lang.String) objArr95[0]).intern();
                                                            java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                            a(1413 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 13, objArr96);
                                                            java.lang.String intern32 = ((java.lang.String) objArr96[0]).intern();
                                                            java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                            a(1425 - android.graphics.Color.argb(0, 0, 0, 0), (char) (42024 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), android.graphics.Color.argb(0, 0, 0, 0) + 14, objArr97);
                                                            java.lang.String intern33 = ((java.lang.String) objArr97[0]).intern();
                                                            java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                            a(1439 - android.graphics.Color.red(0), (char) android.widget.ExpandableListView.getPackedPositionType(0L), (android.os.Process.myTid() >> 22) + 12, objArr98);
                                                            java.lang.String intern34 = ((java.lang.String) objArr98[0]).intern();
                                                            java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                            a((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1451, (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 15170), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 24, objArr99);
                                                            java.lang.String intern35 = ((java.lang.String) objArr99[0]).intern();
                                                            java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                            a((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1474, (char) (40589 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 29, objArr100);
                                                            strArr2 = new java.lang.String[]{intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, intern29, intern30, intern31, intern32, intern33, intern34, intern35, ((java.lang.String) objArr100[0]).intern()};
                                                            i19 = 0;
                                                            while (true) {
                                                                if (i19 < 19) {
                                                                    i19 = -1;
                                                                    break;
                                                                }
                                                                java.lang.String str16 = strArr2[i19];
                                                                java.lang.Object[] objArr101 = {str16};
                                                                java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                                if (obj27 == null) {
                                                                    java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 3161, (char) (android.os.Process.getGidForName(str5) + 33100));
                                                                    java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                                    b((byte) $$b, (byte) (-$$a[21]), androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, objArr102);
                                                                    obj27 = cls24.getMethod((java.lang.String) objArr102[0], java.lang.String.class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj27);
                                                                }
                                                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr101)).longValue();
                                                                long j26 = ~((~longValue9) | 491617954);
                                                                strArr3 = strArr2;
                                                                long j27 = ((-107) * longValue9) + 27038987470L + (((~(longValue9 | (-491617955))) | (~(j11 | longValue9))) * (-108)) + (((~((-491617955) | j8)) | j26 | (~(j11 | 491617954))) * 54) + ((j8 | j26) * 54) + 503816949;
                                                                int i56 = (int) (j27 >> 32);
                                                                int i57 = (~(i48 | (-1489855453))) | 138748292 | (~(i48 | 1367885433));
                                                                if (((i56 & ((((~((-1381053679) | i)) | 1359483986) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 437865930 + (((~(i48 | (-1381053679))) | 1359483986) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))) | (((int) j27) & ((((~((-16778274) | i)) | i57) * 590) + 1805608063 + (i57 * (-1180)) + (((~(i48 | (-1367885434))) | (~(i48 | 1489855452))) * 590)))) != 0) {
                                                                    break;
                                                                }
                                                                java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                                a(android.graphics.Color.alpha(0) + 1425, (char) (42024 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), 14 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr103);
                                                                if (str16.equals(((java.lang.String) objArr103[0]).intern())) {
                                                                    java.lang.Object[] objArr104 = {str16};
                                                                    java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                                    if (obj28 == null) {
                                                                        java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3161, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 33100));
                                                                        java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                                        b((byte) $$b, (byte) (-$$a[21]), androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, objArr105);
                                                                        obj28 = cls25.getMethod((java.lang.String) objArr105[0], java.lang.String.class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj28);
                                                                    }
                                                                    long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj28).invoke(null, objArr104)).longValue();
                                                                    long j28 = ~longValue10;
                                                                    long j29 = ((-756) * longValue10) + 174203732824L + ((j11 | 229820228) * (-757)) + ((~(229820228 | j28 | j8)) * 1514) + (((~(longValue10 | 229820228 | j8)) | (~(j28 | j11)) | (~((-229820229) | j28))) * 757) + 765614675;
                                                                    if (((((int) (j29 >> 32)) & (((((~(i48 | 1096107107)) | (-1761633778)) * (-602)) - 1720110846) + (((~(1096107107 | i)) | (-1767204340) | (~(i48 | (-1090536546)))) * (-301)) + ((~(i48 | (-1761633778))) * 301))) | (((int) j29) & (((((~(i48 | 1505304255)) | (~((-68077846) | i))) * 1900) - 1871736089) + (((~(i48 | 68077845)) | (~((-1505304256) | i))) * (-950)) + (((~(68077845 | i)) | (~(i48 | (-1505304256)))) * 950)))) != 0) {
                                                                        break;
                                                                    }
                                                                }
                                                                i19++;
                                                                strArr2 = strArr3;
                                                            }
                                                            if (i19 >= 0 && (i20 = i ^ (i19 + 130)) != i) {
                                                                java.lang.Object[] objArr106 = {new int[]{i}, new int[]{i20}, null, null, new int[1]};
                                                                java.lang.Object[] objArr107 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((i48 | (-2016561738)) * 1444) - 1191286113) + ((((~(i | 691524068)) | (-2033703918)) | (~(1359322029 | i))) * (-1444))) - 36339230)};
                                                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj4 == null) {
                                                                    java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 50, 2714 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) android.graphics.Color.red(0));
                                                                    byte b23 = (byte) ($$a[14] + 1);
                                                                    byte b24 = b23;
                                                                    java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                                    b(b23, b24, (short) (b24 | 653), objArr108);
                                                                    obj4 = cls26.getMethod((java.lang.String) objArr108[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                                                                }
                                                                ((int[]) objArr106[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr107)).intValue();
                                                                return objArr106;
                                                            }
                                                        }
                                                        java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                        a((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1502, (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 54963), 13 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr109);
                                                        java.lang.String intern36 = ((java.lang.String) objArr109[0]).intern();
                                                        java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                        a(1516 - android.view.View.resolveSizeAndState(0, 0, 0), (char) android.view.View.MeasureSpec.getMode(0), android.view.Gravity.getAbsoluteGravity(0, 0) + 5, objArr110);
                                                        java.lang.String[] strArr8 = {intern36, ((java.lang.String) objArr110[0]).intern()};
                                                        java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                        a((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1521, (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 16, objArr111);
                                                        java.lang.String intern37 = ((java.lang.String) objArr111[0]).intern();
                                                        java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                        a(1536 - android.text.TextUtils.getCapsMode(str5, 0, 0), (char) (18091 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), android.os.Process.getGidForName(str5) + 20, objArr112);
                                                        java.lang.String intern38 = ((java.lang.String) objArr112[0]).intern();
                                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                        a(1554 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (17453 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 15, objArr113);
                                                        java.lang.String[] strArr9 = {intern37, intern38, ((java.lang.String) objArr113[0]).intern()};
                                                        java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                        a((android.view.KeyEvent.getMaxKeyCode() >> 16) + 1569, (char) (34668 - android.view.View.combineMeasuredStates(0, 0)), 20 - android.view.MotionEvent.axisFromString(str5), objArr114);
                                                        java.lang.String intern39 = ((java.lang.String) objArr114[0]).intern();
                                                        java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                        a(1591 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) android.text.TextUtils.indexOf(str5, str5), 10 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr115);
                                                        c = 0;
                                                        java.lang.String[] strArr10 = {intern39, ((java.lang.String) objArr115[0]).intern()};
                                                        java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                        a(1600 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 51442), android.view.View.MeasureSpec.getSize(0) + 11, objArr116);
                                                        java.lang.String intern40 = ((java.lang.String) objArr116[0]).intern();
                                                        java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                        a((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 337, (char) (android.text.TextUtils.getOffsetAfter(str5, 0) + 26077), 5 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr117);
                                                        java.lang.String[] strArr11 = {intern40, ((java.lang.String) objArr117[0]).intern()};
                                                        java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                        a((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1610, (char) android.view.View.combineMeasuredStates(0, 0), android.graphics.Color.red(0) + 28, objArr118);
                                                        java.lang.String intern41 = ((java.lang.String) objArr118[0]).intern();
                                                        java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                        a(android.text.TextUtils.indexOf(str5, str5, 0) + 1590, (char) android.graphics.Color.alpha(0), android.view.View.MeasureSpec.getMode(0) + 10, objArr119);
                                                        java.lang.String[][] strArr12 = {strArr8, strArr9, strArr10, strArr11, new java.lang.String[]{intern41, ((java.lang.String) objArr119[0]).intern()}};
                                                        int i58 = -1;
                                                        i16 = 0;
                                                        loop4: while (true) {
                                                            if (i16 < 5) {
                                                                str8 = str15;
                                                                i17 = i;
                                                                break;
                                                            }
                                                            java.lang.String[] strArr13 = strArr12[i16];
                                                            java.lang.String str17 = strArr13[c];
                                                            java.lang.String[] strArr14 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr13, 1, strArr13.length);
                                                            int length = strArr14.length;
                                                            int i59 = 0;
                                                            while (i59 < length) {
                                                                java.lang.String str18 = strArr14[i59];
                                                                java.io.File file5 = new java.io.File(str17);
                                                                if (file5.exists() && file5.isFile()) {
                                                                    try {
                                                                        java.util.Scanner scanner2 = new java.util.Scanner(new java.io.FileInputStream(file5));
                                                                        str8 = str15;
                                                                        try {
                                                                            java.util.Scanner useDelimiter4 = scanner2.useDelimiter(str8);
                                                                            next = useDelimiter4.hasNext() ? useDelimiter4.next() : str5;
                                                                            useDelimiter4.close();
                                                                        } catch (java.io.IOException unused6) {
                                                                            continue;
                                                                        }
                                                                    } catch (java.io.IOException unused7) {
                                                                    }
                                                                    if (next.contains(str18)) {
                                                                        i17 = i ^ (i58 + 171);
                                                                        break loop4;
                                                                    }
                                                                    i59++;
                                                                    i58++;
                                                                    str15 = str8;
                                                                }
                                                                str8 = str15;
                                                                i59++;
                                                                i58++;
                                                                str15 = str8;
                                                            }
                                                            i16++;
                                                            c = 0;
                                                        }
                                                        if (i17 == i) {
                                                            java.lang.Object[] objArr120 = {new int[]{i}, new int[]{i17}, null, null, new int[1]};
                                                            java.lang.Object[] objArr121 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~(i | 1664348172)) | (~(i48 | (-50425861))) | (-2000420238)) * (-68)) + 1056375221 + ((~(i48 | (-336072066))) * (-68)) + (((~(i48 | (-1664348173))) | (-386497926)) * 68))};
                                                            java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                            if (obj29 == null) {
                                                                java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.red(0), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2712, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                                                                byte b25 = (byte) ($$a[14] + 1);
                                                                byte b26 = b25;
                                                                java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                                b(b25, b26, (short) (b26 | 653), objArr122);
                                                                obj29 = cls27.getMethod((java.lang.String) objArr122[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj29);
                                                            }
                                                            ((int[]) objArr120[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj29).invoke(null, objArr121)).intValue();
                                                            return objArr120;
                                                        }
                                                        try {
                                                            java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                            a(1640 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (12538 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), android.graphics.Color.rgb(0, 0, 0) + 16777229, objArr123);
                                                            java.lang.String intern42 = ((java.lang.String) objArr123[0]).intern();
                                                            java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                            a(1652 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.text.TextUtils.indexOf(str5, str5, 0, 0) + 8, objArr124);
                                                            intern = ((java.lang.String) objArr124[0]).intern();
                                                            file = new java.io.File(intern42);
                                                        } catch (java.lang.Exception unused8) {
                                                            i18 = i ^ 151;
                                                        }
                                                        if (file.exists() && file.isFile()) {
                                                            try {
                                                                java.util.Scanner useDelimiter5 = new java.util.Scanner(new java.io.FileInputStream(file)).useDelimiter(str8);
                                                                if (useDelimiter5.hasNext()) {
                                                                    writeReplace = (values + 113) % 128;
                                                                    str9 = useDelimiter5.next();
                                                                } else {
                                                                    str9 = str5;
                                                                }
                                                                useDelimiter5.close();
                                                            } catch (java.io.IOException unused9) {
                                                            }
                                                            if (str9.contains(intern)) {
                                                                i18 = i ^ 150;
                                                                if (i18 == i) {
                                                                    java.lang.Object[] objArr125 = {new int[]{i}, new int[]{i18}, null, null, new int[1]};
                                                                    java.lang.Object[] objArr126 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((1719277942 | i) * 140) + 864260933 + (((~(i48 | 1719277942)) | 293684233) * (-280)) + (((~(i | (-293684234))) | (~(i48 | 331568155)) | 1681394020) * 140))};
                                                                    java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj30 == null) {
                                                                        java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.view.View.getDefaultSize(0, 0) + 2713, (char) android.text.TextUtils.getOffsetBefore(str5, 0));
                                                                        byte b27 = (byte) ($$a[14] + 1);
                                                                        byte b28 = b27;
                                                                        java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                        b(b27, b28, (short) (b28 | 653), objArr127);
                                                                        obj30 = cls28.getMethod((java.lang.String) objArr127[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj30);
                                                                    }
                                                                    ((int[]) objArr125[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr126)).intValue();
                                                                    return objArr125;
                                                                }
                                                                java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                                a(android.view.MotionEvent.axisFromString(str5) + 1661, (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 38210), 47 - android.graphics.Color.green(0), objArr128);
                                                                java.lang.Object[] objArr129 = {((java.lang.String) objArr128[0]).intern()};
                                                                java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                                if (obj31 == null) {
                                                                    java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 3161 - android.text.TextUtils.indexOf(str5, str5, 0), (char) (33099 - (android.os.Process.myTid() >> 22)));
                                                                    java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                                    b((byte) $$b, (byte) (-$$a[21]), androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, objArr130);
                                                                    obj31 = cls29.getMethod((java.lang.String) objArr130[0], java.lang.String.class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj31);
                                                                }
                                                                long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj31).invoke(null, objArr129)).longValue();
                                                                long j30 = ~longValue11;
                                                                long j31 = (-838959316) | j30;
                                                                long j32 = (131 * longValue11) + 108225751764L + ((~(j30 | j11 | (-838959316))) * 130) + ((~j31) * (-260)) + (((~(longValue11 | 838959315)) | (~(j31 | j8))) * 130) + 1834394219;
                                                                int i60 = ~((-1591839030) | i);
                                                                int i61 = (((((int) (j32 >> 32)) & ((((362129450 | i60) * (-658)) + 459583326) + ((i60 | 344033312) * 658))) | (((int) j32) & ((((((~(i48 | (-1513871854))) | (~((-1343869033) | i))) * 1900) - 1871736089) + (((~(i48 | 1343869032)) | (~(1513871853 | i))) * (-950))) + (((~(1343869032 | i)) | (~(i48 | 1513871853))) * 950)))) * 263) ^ i;
                                                                int[] iArr = new int[1];
                                                                int[] iArr2 = new int[1];
                                                                if (i61 != i) {
                                                                    iArr[0] = i;
                                                                    iArr2[0] = i61;
                                                                    java.lang.Object[] objArr131 = {iArr, iArr2, null, null, new int[1]};
                                                                    java.lang.Object[] objArr132 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((~(i | (-1077402789))) | (-973443310)) * (-964)) - 811432215) + (((~(i48 | (-1077402789))) | 1077038080) * (-964)))};
                                                                    java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj32 == null) {
                                                                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.widget.ExpandableListView.getPackedPositionChild(0L), 2713 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                                        byte b29 = (byte) ($$a[14] + 1);
                                                                        byte b30 = b29;
                                                                        java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                                        b(b29, b30, (short) (b30 | 653), objArr133);
                                                                        obj32 = cls30.getMethod((java.lang.String) objArr133[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj32);
                                                                    }
                                                                    ((int[]) objArr131[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr132)).intValue();
                                                                    return objArr131;
                                                                }
                                                                iArr[0] = i;
                                                                iArr2[0] = i;
                                                                java.lang.Object[] objArr134 = {iArr, iArr2, null, null, new int[1]};
                                                                int i62 = ~(i | 2013069161);
                                                                java.lang.Object[] objArr135 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((((~(i48 | (-1399357034))) | 37776936) | i62) * (-252)) - 1314267919) + ((i62 | (~(i48 | (-1361580098)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE))};
                                                                java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj33 == null) {
                                                                    java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 50, 2713 - android.text.TextUtils.indexOf(str5, str5, 0), (char) (android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                                                                    byte b31 = (byte) ($$a[14] + 1);
                                                                    byte b32 = b31;
                                                                    java.lang.Object[] objArr136 = new java.lang.Object[1];
                                                                    b(b31, b32, (short) (b32 | 653), objArr136);
                                                                    obj33 = cls31.getMethod((java.lang.String) objArr136[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj33);
                                                                }
                                                                ((int[]) objArr134[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr135)).intValue();
                                                                return objArr134;
                                                            }
                                                        }
                                                        i18 = i;
                                                        if (i18 == i) {
                                                        }
                                                    }
                                                } else {
                                                    obj2 = null;
                                                }
                                                java.lang.Object[] objArr137 = new java.lang.Object[1];
                                                a(309 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (-16777193) - android.graphics.Color.rgb(0, 0, 0), objArr137);
                                                java.lang.String intern43 = ((java.lang.String) objArr137[0]).intern();
                                                java.lang.Object[] objArr138 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 365, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), 10 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr138);
                                                java.lang.String intern44 = ((java.lang.String) objArr138[0]).intern();
                                                java.lang.Object[] objArr139 = new java.lang.Object[1];
                                                a(375 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.view.MotionEvent.axisFromString("") + 60681), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 8, objArr139);
                                                java.lang.String intern45 = ((java.lang.String) objArr139[0]).intern();
                                                java.lang.Object[] objArr140 = new java.lang.Object[1];
                                                a(381 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '(', objArr140);
                                                java.lang.String[] strArr15 = {intern43, intern44, intern45, ((java.lang.String) objArr140[0]).intern()};
                                                java.lang.Object[] objArr141 = new java.lang.Object[1];
                                                a(android.widget.ExpandableListView.getPackedPositionType(0L) + 390, (char) android.text.TextUtils.getOffsetAfter("", 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 18, objArr141);
                                                java.lang.String intern46 = ((java.lang.String) objArr141[0]).intern();
                                                java.lang.Object[] objArr142 = new java.lang.Object[1];
                                                a(android.view.Gravity.getAbsoluteGravity(0, 0) + 407, (char) (48865 - android.view.View.combineMeasuredStates(0, 0)), android.graphics.Color.red(0) + 7, objArr142);
                                                java.lang.String intern47 = ((java.lang.String) objArr142[0]).intern();
                                                java.lang.Object[] objArr143 = new java.lang.Object[1];
                                                a(414 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (917 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), android.view.KeyEvent.keyCodeFromString("") + 7, objArr143);
                                                java.lang.String intern48 = ((java.lang.String) objArr143[0]).intern();
                                                java.lang.Object[] objArr144 = new java.lang.Object[1];
                                                a(android.text.TextUtils.getOffsetAfter("", 0) + 421, (char) (17084 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), 11 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr144);
                                                java.lang.String intern49 = ((java.lang.String) objArr144[0]).intern();
                                                java.lang.Object[] objArr145 = new java.lang.Object[1];
                                                a(android.graphics.ImageFormat.getBitsPerPixel(0) + 433, (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 22595), 14 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr145);
                                                java.lang.String[] strArr16 = {intern46, intern47, intern48, intern49, ((java.lang.String) objArr145[0]).intern()};
                                                java.lang.Object[] objArr146 = new java.lang.Object[1];
                                                a(android.graphics.Color.red(0) + 446, (char) ((android.os.Process.myPid() >> 22) + 15664), 17 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr146);
                                                java.lang.String intern50 = ((java.lang.String) objArr146[0]).intern();
                                                java.lang.Object[] objArr147 = new java.lang.Object[1];
                                                a(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.visa.cbp.getEncExpo.kernelVersion, (char) (android.view.KeyEvent.keyCodeFromString("") + 10495), 2 - android.os.Process.getGidForName(""), objArr147);
                                                java.lang.String intern51 = ((java.lang.String) objArr147[0]).intern();
                                                java.lang.Object[] objArr148 = new java.lang.Object[1];
                                                a(473 - android.view.View.MeasureSpec.getSize(0), (char) (23873 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), android.graphics.Color.blue(0) + 22, objArr148);
                                                java.lang.String intern52 = ((java.lang.String) objArr148[0]).intern();
                                                java.lang.Object[] objArr149 = new java.lang.Object[1];
                                                a(543 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.graphics.Color.blue(0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 25, objArr149);
                                                java.lang.String intern53 = ((java.lang.String) objArr149[0]).intern();
                                                java.lang.Object[] objArr150 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL, (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 46630), 29 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr150);
                                                java.lang.String[] strArr17 = {intern50, intern51, str, intern52, intern53, ((java.lang.String) objArr150[0]).intern()};
                                                java.lang.Object[] objArr151 = new java.lang.Object[1];
                                                a(android.view.View.resolveSizeAndState(0, 0, 0) + 548, (char) (54119 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 11 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr151);
                                                java.lang.String intern54 = ((java.lang.String) objArr151[0]).intern();
                                                java.lang.Object[] objArr152 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getTouchSlop() >> 8) + 559, (char) (59915 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), 9 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr152);
                                                java.lang.String intern55 = ((java.lang.String) objArr152[0]).intern();
                                                java.lang.Object[] objArr153 = new java.lang.Object[1];
                                                a(android.text.TextUtils.getOffsetAfter("", 0) + 567, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 11092), android.graphics.Color.green(0) + 6, objArr153);
                                                java.lang.String intern56 = ((java.lang.String) objArr153[0]).intern();
                                                java.lang.Object[] objArr154 = new java.lang.Object[1];
                                                a(573 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), 7 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr154);
                                                java.lang.String[] strArr18 = {intern54, intern55, intern56, ((java.lang.String) objArr154[0]).intern()};
                                                java.lang.Object[] objArr155 = new java.lang.Object[1];
                                                a(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 579, (char) (13814 - android.view.Gravity.getAbsoluteGravity(0, 0)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 17, objArr155);
                                                java.lang.String intern57 = ((java.lang.String) objArr155[0]).intern();
                                                java.lang.Object[] objArr156 = new java.lang.Object[1];
                                                a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 414, (char) (917 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), (android.os.Process.myTid() >> 22) + 7, objArr156);
                                                java.lang.String intern58 = ((java.lang.String) objArr156[0]).intern();
                                                java.lang.Object[] objArr157 = new java.lang.Object[1];
                                                a(382 - android.text.TextUtils.getCapsMode("", 0, 0), (char) android.view.Gravity.getAbsoluteGravity(0, 0), 8 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr157);
                                                java.lang.String[] strArr19 = {intern57, intern58, ((java.lang.String) objArr157[0]).intern()};
                                                java.lang.Object[] objArr158 = new java.lang.Object[1];
                                                a(595 - android.text.TextUtils.getTrimmedLength(""), (char) android.view.Gravity.getAbsoluteGravity(0, 0), 14 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr158);
                                                java.lang.String intern59 = ((java.lang.String) objArr158[0]).intern();
                                                java.lang.Object[] objArr159 = new java.lang.Object[1];
                                                a(android.text.TextUtils.getOffsetBefore("", 0) + androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_POLAR_RELATIVETO, (char) (13822 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), 1 - android.text.TextUtils.getOffsetAfter("", 0), objArr159);
                                                java.lang.String[] strArr20 = {intern59, ((java.lang.String) objArr159[0]).intern()};
                                                java.lang.Object[] objArr160 = new java.lang.Object[1];
                                                a(609 - android.os.Process.getGidForName(""), (char) android.view.View.resolveSize(0, 0), 8 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr160);
                                                java.lang.String intern60 = ((java.lang.String) objArr160[0]).intern();
                                                java.lang.Object[] objArr161 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getTouchSlop() >> 8) + 619, (char) (android.text.TextUtils.indexOf("", "") + 42200), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr161);
                                                java.lang.String[] strArr21 = {intern60, ((java.lang.String) objArr161[0]).intern()};
                                                java.lang.Object[] objArr162 = new java.lang.Object[1];
                                                a(620 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (17927 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), 16 - android.text.TextUtils.indexOf("", "", 0, 0), objArr162);
                                                java.lang.String intern61 = ((java.lang.String) objArr162[0]).intern();
                                                java.lang.Object[] objArr163 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 462, (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10495), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 3, objArr163);
                                                java.lang.String intern62 = ((java.lang.String) objArr163[0]).intern();
                                                java.lang.Object[] objArr164 = new java.lang.Object[1];
                                                a(android.view.View.combineMeasuredStates(0, 0) + 407, (char) (48865 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7, objArr164);
                                                java.lang.String intern63 = ((java.lang.String) objArr164[0]).intern();
                                                java.lang.Object[] objArr165 = new java.lang.Object[1];
                                                a(636 - android.view.KeyEvent.keyCodeFromString(""), (char) android.graphics.Color.argb(0, 0, 0, 0), 8 - android.graphics.Color.alpha(0), objArr165);
                                                java.lang.String intern64 = ((java.lang.String) objArr165[0]).intern();
                                                java.lang.Object[] objArr166 = new java.lang.Object[1];
                                                a((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING, (char) (android.view.View.MeasureSpec.getMode(0) + 17084), 11 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr166);
                                                java.lang.String intern65 = ((java.lang.String) objArr166[0]).intern();
                                                java.lang.Object[] objArr167 = new java.lang.Object[1];
                                                a(431 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (22594 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.os.Process.getGidForName("") + 15, objArr167);
                                                java.lang.String[] strArr22 = {intern61, intern62, intern63, intern64, intern65, ((java.lang.String) objArr167[0]).intern()};
                                                java.lang.Object[] objArr168 = new java.lang.Object[1];
                                                a(644 - android.graphics.Color.blue(0), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 20 - android.text.TextUtils.getCapsMode("", 0, 0), objArr168);
                                                java.lang.String intern66 = ((java.lang.String) objArr168[0]).intern();
                                                java.lang.Object[] objArr169 = new java.lang.Object[1];
                                                a(664 - android.text.TextUtils.indexOf("", "", 0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19, objArr169);
                                                java.lang.String intern67 = ((java.lang.String) objArr169[0]).intern();
                                                java.lang.Object[] objArr170 = new java.lang.Object[1];
                                                a(683 - android.view.KeyEvent.getDeadChar(0, 0), (char) (47670 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 31 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr170);
                                                java.lang.String intern68 = ((java.lang.String) objArr170[0]).intern();
                                                java.lang.Object[] objArr171 = new java.lang.Object[1];
                                                a(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 714, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26, objArr171);
                                                java.lang.String intern69 = ((java.lang.String) objArr171[0]).intern();
                                                java.lang.Object[] objArr172 = new java.lang.Object[1];
                                                a(740 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), 22 - android.os.Process.getGidForName(""), objArr172);
                                                java.lang.String intern70 = ((java.lang.String) objArr172[0]).intern();
                                                java.lang.Object[] objArr173 = new java.lang.Object[1];
                                                a(763 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), 32 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr173);
                                                java.lang.String[] strArr23 = {intern66, intern67, intern68, intern69, intern70, ((java.lang.String) objArr173[0]).intern(), str};
                                                java.lang.Object[] objArr174 = new java.lang.Object[1];
                                                a(796 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (47141 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 13, objArr174);
                                                java.lang.String intern71 = ((java.lang.String) objArr174[0]).intern();
                                                java.lang.Object[] objArr175 = new java.lang.Object[1];
                                                a(375 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 60681), 7 - android.view.KeyEvent.normalizeMetaState(0), objArr175);
                                                java.lang.String[] strArr24 = {intern71, ((java.lang.String) objArr175[0]).intern()};
                                                java.lang.Object[] objArr176 = new java.lang.Object[1];
                                                a(android.view.KeyEvent.normalizeMetaState(0) + 809, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 31 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr176);
                                                java.lang.String intern72 = ((java.lang.String) objArr176[0]).intern();
                                                java.lang.Object[] objArr177 = new java.lang.Object[1];
                                                a(android.view.View.MeasureSpec.getMode(0) + 839, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, objArr177);
                                                java.lang.String[] strArr25 = {intern72, ((java.lang.String) objArr177[0]).intern()};
                                                java.lang.Object[] objArr178 = new java.lang.Object[1];
                                                a(android.graphics.Color.red(0) + 850, (char) (58342 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), 18 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr178);
                                                java.lang.String intern73 = ((java.lang.String) objArr178[0]).intern();
                                                java.lang.Object[] objArr179 = new java.lang.Object[1];
                                                a(869 - (android.os.Process.myTid() >> 22), (char) (38741 - android.view.View.resolveSize(0, 0)), 5 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr179);
                                                java.lang.String[] strArr26 = {intern73, ((java.lang.String) objArr179[0]).intern()};
                                                java.lang.Object[] objArr180 = new java.lang.Object[1];
                                                a(874 - android.view.KeyEvent.normalizeMetaState(0), (char) android.view.View.resolveSize(0, 0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19, objArr180);
                                                java.lang.String[] strArr27 = {((java.lang.String) objArr180[0]).intern()};
                                                java.lang.Object[] objArr181 = new java.lang.Object[1];
                                                a(893 - android.text.TextUtils.getOffsetAfter("", 0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 17, objArr181);
                                                java.lang.String[] strArr28 = {((java.lang.String) objArr181[0]).intern()};
                                                java.lang.Object[] objArr182 = new java.lang.Object[1];
                                                a(909 - android.text.TextUtils.getOffsetAfter("", 0), (char) (57110 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), 18 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr182);
                                                java.lang.String[] strArr29 = {((java.lang.String) objArr182[0]).intern()};
                                                java.lang.Object[] objArr183 = new java.lang.Object[1];
                                                a(928 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19, objArr183);
                                                java.lang.String[] strArr30 = {((java.lang.String) objArr183[0]).intern()};
                                                java.lang.Object[] objArr184 = new java.lang.Object[1];
                                                a(android.text.TextUtils.indexOf("", "", 0, 0) + 947, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 25158), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 23, objArr184);
                                                java.lang.String[] strArr31 = {((java.lang.String) objArr184[0]).intern()};
                                                java.lang.Object[] objArr185 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 970, (char) (51672 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 21 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr185);
                                                java.lang.String[] strArr32 = {((java.lang.String) objArr185[0]).intern()};
                                                java.lang.Object[] objArr186 = new java.lang.Object[1];
                                                a((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.LastFrameStart, (char) (44430 - android.view.MotionEvent.axisFromString("")), 24 - android.view.KeyEvent.getDeadChar(0, 0), objArr186);
                                                java.lang.String str19 = str;
                                                java.lang.String[] strArr33 = {((java.lang.String) objArr186[0]).intern(), str19};
                                                java.lang.Object[] objArr187 = new java.lang.Object[1];
                                                a(1015 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) android.graphics.Color.argb(0, 0, 0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 28, objArr187);
                                                java.lang.String[] strArr34 = {((java.lang.String) objArr187[0]).intern(), str19};
                                                java.lang.Object[] objArr188 = new java.lang.Object[1];
                                                a(android.graphics.Color.rgb(0, 0, 0) + 16778259, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), 26 - android.view.MotionEvent.axisFromString(""), objArr188);
                                                java.lang.String[] strArr35 = {((java.lang.String) objArr188[0]).intern(), str19};
                                                java.lang.Object[] objArr189 = new java.lang.Object[1];
                                                a(android.view.View.resolveSize(0, 0) + 1070, (char) (android.text.TextUtils.indexOf("", "") + 52990), 31 - android.text.TextUtils.indexOf("", ""), objArr189);
                                                java.lang.String[] strArr36 = {((java.lang.String) objArr189[0]).intern(), str19};
                                                java.lang.Object[] objArr190 = new java.lang.Object[1];
                                                a((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1100, (char) android.view.KeyEvent.getDeadChar(0, 0), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 27, objArr190);
                                                java.lang.String[] strArr37 = {((java.lang.String) objArr190[0]).intern(), str19};
                                                java.lang.Object[] objArr191 = new java.lang.Object[1];
                                                a(1128 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.graphics.Color.rgb(0, 0, 0) + 16801172), android.view.View.MeasureSpec.getSize(0) + 32, objArr191);
                                                java.lang.String[][] strArr38 = {strArr15, strArr16, strArr17, strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, new java.lang.String[]{((java.lang.String) objArr191[0]).intern(), str19}};
                                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                                int i63 = i;
                                                int i64 = 0;
                                                int i65 = 0;
                                                while (i64 < 24) {
                                                    java.lang.String[] strArr39 = strArr38[i64];
                                                    java.lang.Object[] objArr192 = {strArr39[0]};
                                                    java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                    if (obj34 == null) {
                                                        java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 40, android.graphics.Color.blue(0) + 1921, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '0'));
                                                        int i66 = $$a[14] + 1;
                                                        strArr = strArr38;
                                                        i13 = i63;
                                                        java.lang.Object[] objArr193 = new java.lang.Object[1];
                                                        b((byte) i66, (byte) $$b, (short) i66, objArr193);
                                                        obj34 = cls32.getMethod((java.lang.String) objArr193[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj34);
                                                    } else {
                                                        strArr = strArr38;
                                                        i13 = i63;
                                                    }
                                                    java.lang.String str20 = (java.lang.String) ((java.lang.reflect.Method) obj34).invoke(null, objArr192);
                                                    java.lang.String[] strArr40 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr39, 1, strArr39.length);
                                                    if (str20 == null || str20.length() == 0) {
                                                        i14 = i64;
                                                        str6 = str11;
                                                    } else {
                                                        if (strArr39.length != 1) {
                                                            java.lang.Object[] objArr194 = {str20, strArr40};
                                                            java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                                            if (obj35 == null) {
                                                                java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 43, android.text.TextUtils.getOffsetBefore(str11, 0) + 2880, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                                                int i67 = $$a[14] + 1;
                                                                java.lang.Object[] objArr195 = new java.lang.Object[1];
                                                                b((byte) i67, (byte) $$b, (short) i67, objArr195);
                                                                obj35 = cls33.getMethod((java.lang.String) objArr195[0], java.lang.String.class, java.lang.String[].class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj35);
                                                            }
                                                            long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj35).invoke(null, objArr194)).longValue();
                                                            long j33 = ~(165378632 | longValue12);
                                                            str6 = str11;
                                                            long j34 = ~longValue12;
                                                            arrayList = arrayList2;
                                                            str7 = str20;
                                                            i14 = i64;
                                                            long j35 = (((((989 * longValue12) + 326622800175L) + ((j8 | j33) * 988)) + (((~(j34 | (-165378633))) | (~(j11 | (-165378633)))) * (-1976))) + ((((~(j34 | j8)) | j33) | (~(j11 | longValue12))) * 988)) - 1863333146;
                                                            if (((((int) j35) & (((((~(i48 | 1848767068)) | 1008973817) * (-1042)) - 882845990) + ((1848767068 | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~((-1008973818) | i)) | 740405848 | (~(i48 | 2117335037))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))) | (((int) (j35 >> 32)) & (((((~(i48 | 593433551)) | 843792859) * (-1042)) - 1269560298) + ((593433551 | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~((-843792860) | i)) | 575341003 | (~(i48 | 861885407))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)))) == 0) {
                                                                arrayList2 = arrayList;
                                                            }
                                                        } else {
                                                            arrayList = arrayList2;
                                                            str7 = str20;
                                                            i14 = i64;
                                                            str6 = str11;
                                                        }
                                                        i65++;
                                                        i63 = i ^ (i14 + 10);
                                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                        java.lang.String str21 = str7;
                                                        sb.append(str21);
                                                        java.lang.Object[] objArr196 = new java.lang.Object[1];
                                                        a(1160 - android.view.View.combineMeasuredStates(0, 0), (char) (58661 - android.graphics.Color.alpha(0)), 1 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr196);
                                                        sb.append(((java.lang.String) objArr196[0]).intern());
                                                        sb.append(str21);
                                                        arrayList2 = arrayList;
                                                        arrayList2.add(sb.toString());
                                                        i64 = i14 + 1;
                                                        str11 = str6;
                                                        strArr38 = strArr;
                                                    }
                                                    i63 = i13;
                                                    i64 = i14 + 1;
                                                    str11 = str6;
                                                    strArr38 = strArr;
                                                }
                                                int i68 = i63;
                                                java.lang.String str22 = str11;
                                                if (i65 > 2) {
                                                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i68}, arrayList2, null, new int[1]};
                                                    java.lang.Object[] objArr197 = {num, num, java.lang.Integer.valueOf(((((~((-544786405) | i)) | 4228516) * 345) - 1116420824) + (((~(i48 | (-544786405))) | 1501831177) * 345) + ((~((-4228517) | i)) * 345))};
                                                    java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj36 == null) {
                                                        java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.Gravity.getAbsoluteGravity(0, 0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2712, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                                        byte b33 = (byte) ($$a[14] + 1);
                                                        byte b34 = b33;
                                                        java.lang.Object[] objArr198 = new java.lang.Object[1];
                                                        b(b33, b34, (short) (b34 | 653), objArr198);
                                                        obj36 = cls34.getMethod((java.lang.String) objArr198[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj36);
                                                    }
                                                    i11 = 0;
                                                    ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr197)).intValue();
                                                    str5 = str22;
                                                } else {
                                                    java.lang.Object[] objArr199 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                                    java.lang.Object[] objArr200 = {num, num, java.lang.Integer.valueOf(((((~r5) | 209825472) * (-828)) - 655634803) + ((i48 | 1841020625) * (-828)) + 348311752)};
                                                    java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj37 == null) {
                                                        str5 = str22;
                                                        java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2713 - android.view.KeyEvent.keyCodeFromString(str5), (char) (android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                                        byte b35 = (byte) ($$a[14] + 1);
                                                        byte b36 = b35;
                                                        java.lang.Object[] objArr201 = new java.lang.Object[1];
                                                        b(b35, b36, (short) (b36 | 653), objArr201);
                                                        obj37 = cls35.getMethod((java.lang.String) objArr201[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj37);
                                                    } else {
                                                        str5 = str22;
                                                    }
                                                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr200)).intValue();
                                                    i11 = 0;
                                                    ((int[]) objArr199[4])[0] = intValue;
                                                    objArr = objArr199;
                                                }
                                                int i69 = ((int[]) objArr[1])[i11];
                                                if (i69 != i) {
                                                    int[] iArr3 = new int[1];
                                                    int[] iArr4 = new int[1];
                                                    java.util.List list = (java.util.List) objArr[2];
                                                    iArr3[i11] = i;
                                                    iArr4[i11] = i69;
                                                    java.lang.Object[] objArr202 = {iArr3, iArr4, list, null, new int[1]};
                                                    java.lang.Object[] objArr203 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((i48 | (-1160315273)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 1150284711) + (((~(i48 | 848453127)) | (-1966690702)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))};
                                                    java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj38 == null) {
                                                        java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 50, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2713, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                                        byte b37 = (byte) ($$a[14] + 1);
                                                        byte b38 = b37;
                                                        java.lang.Object[] objArr204 = new java.lang.Object[1];
                                                        b(b37, b38, (short) (b38 | 653), objArr204);
                                                        obj38 = cls36.getMethod((java.lang.String) objArr204[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj38);
                                                    }
                                                    ((int[]) objArr202[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr203)).intValue();
                                                    return objArr202;
                                                }
                                                i12 = i11;
                                                java.lang.Object[] objArr772 = new java.lang.Object[1];
                                                a((android.util.TypedValue.complexToFraction(i12, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i12, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 446, (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15664), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16, objArr772);
                                                java.lang.Object[] objArr782 = {((java.lang.String) objArr772[0]).intern()};
                                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj3 == null) {
                                                }
                                                invoke = ((java.lang.reflect.Method) obj3).invoke(null, objArr782);
                                                if (invoke != null) {
                                                }
                                                if (i15 != 1986687685) {
                                                    java.lang.Object[] objArr822 = new java.lang.Object[1];
                                                    a((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1161, (char) (android.graphics.Color.red(0) + 44395), 14 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr822);
                                                    java.lang.String intern182 = ((java.lang.String) objArr822[0]).intern();
                                                    java.lang.Object[] objArr832 = new java.lang.Object[1];
                                                    a(1175 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.os.Process.getGidForName(str5) + 1), 26 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr832);
                                                    java.lang.String intern192 = ((java.lang.String) objArr832[0]).intern();
                                                    java.lang.Object[] objArr842 = new java.lang.Object[1];
                                                    a(1201 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (59660 - android.os.Process.getGidForName(str5)), android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 18, objArr842);
                                                    java.lang.String intern202 = ((java.lang.String) objArr842[0]).intern();
                                                    java.lang.Object[] objArr852 = new java.lang.Object[1];
                                                    a((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1218, (char) android.graphics.Color.green(0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16, objArr852);
                                                    java.lang.String intern212 = ((java.lang.String) objArr852[0]).intern();
                                                    java.lang.Object[] objArr862 = new java.lang.Object[1];
                                                    a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1235, (char) (33643 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), 15 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr862);
                                                    java.lang.String intern222 = ((java.lang.String) objArr862[0]).intern();
                                                    java.lang.Object[] objArr872 = new java.lang.Object[1];
                                                    a(1251 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) android.graphics.Color.alpha(0), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 37, objArr872);
                                                    java.lang.String intern232 = ((java.lang.String) objArr872[0]).intern();
                                                    java.lang.Object[] objArr882 = new java.lang.Object[1];
                                                    a(android.view.Gravity.getAbsoluteGravity(0, 0) + 1287, (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 53801), android.text.TextUtils.getTrimmedLength(str5) + 12, objArr882);
                                                    java.lang.String intern242 = ((java.lang.String) objArr882[0]).intern();
                                                    java.lang.Object[] objArr892 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1299, (char) (10051 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 13 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr892);
                                                    java.lang.String intern252 = ((java.lang.String) objArr892[0]).intern();
                                                    java.lang.Object[] objArr902 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1312, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), 22 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr902);
                                                    java.lang.String intern262 = ((java.lang.String) objArr902[0]).intern();
                                                    java.lang.Object[] objArr912 = new java.lang.Object[1];
                                                    a(1334 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (21226 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, objArr912);
                                                    java.lang.String intern272 = ((java.lang.String) objArr912[0]).intern();
                                                    java.lang.Object[] objArr922 = new java.lang.Object[1];
                                                    a(1365 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (7834 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.graphics.Color.red(0) + 12, objArr922);
                                                    java.lang.String intern282 = ((java.lang.String) objArr922[0]).intern();
                                                    java.lang.Object[] objArr932 = new java.lang.Object[1];
                                                    a(1377 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), 13 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr932);
                                                    java.lang.String intern292 = ((java.lang.String) objArr932[0]).intern();
                                                    java.lang.Object[] objArr942 = new java.lang.Object[1];
                                                    a(1389 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (13838 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 12 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr942);
                                                    java.lang.String intern302 = ((java.lang.String) objArr942[0]).intern();
                                                    java.lang.Object[] objArr952 = new java.lang.Object[1];
                                                    a(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1402, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 25848), android.view.View.combineMeasuredStates(0, 0) + 12, objArr952);
                                                    java.lang.String intern312 = ((java.lang.String) objArr952[0]).intern();
                                                    java.lang.Object[] objArr962 = new java.lang.Object[1];
                                                    a(1413 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 13, objArr962);
                                                    java.lang.String intern322 = ((java.lang.String) objArr962[0]).intern();
                                                    java.lang.Object[] objArr972 = new java.lang.Object[1];
                                                    a(1425 - android.graphics.Color.argb(0, 0, 0, 0), (char) (42024 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), android.graphics.Color.argb(0, 0, 0, 0) + 14, objArr972);
                                                    java.lang.String intern332 = ((java.lang.String) objArr972[0]).intern();
                                                    java.lang.Object[] objArr982 = new java.lang.Object[1];
                                                    a(1439 - android.graphics.Color.red(0), (char) android.widget.ExpandableListView.getPackedPositionType(0L), (android.os.Process.myTid() >> 22) + 12, objArr982);
                                                    java.lang.String intern342 = ((java.lang.String) objArr982[0]).intern();
                                                    java.lang.Object[] objArr992 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1451, (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 15170), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 24, objArr992);
                                                    java.lang.String intern352 = ((java.lang.String) objArr992[0]).intern();
                                                    java.lang.Object[] objArr1002 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1474, (char) (40589 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 29, objArr1002);
                                                    strArr2 = new java.lang.String[]{intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, intern292, intern302, intern312, intern322, intern332, intern342, intern352, ((java.lang.String) objArr1002[0]).intern()};
                                                    i19 = 0;
                                                    while (true) {
                                                        if (i19 < 19) {
                                                        }
                                                        i19++;
                                                        strArr2 = strArr3;
                                                    }
                                                    if (i19 >= 0) {
                                                        java.lang.Object[] objArr1062 = {new int[]{i}, new int[]{i20}, null, null, new int[1]};
                                                        java.lang.Object[] objArr1072 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((i48 | (-2016561738)) * 1444) - 1191286113) + ((((~(i | 691524068)) | (-2033703918)) | (~(1359322029 | i))) * (-1444))) - 36339230)};
                                                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj4 == null) {
                                                        }
                                                        ((int[]) objArr1062[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr1072)).intValue();
                                                        return objArr1062;
                                                    }
                                                }
                                                java.lang.Object[] objArr1092 = new java.lang.Object[1];
                                                a((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1502, (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 54963), 13 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr1092);
                                                java.lang.String intern362 = ((java.lang.String) objArr1092[0]).intern();
                                                java.lang.Object[] objArr1102 = new java.lang.Object[1];
                                                a(1516 - android.view.View.resolveSizeAndState(0, 0, 0), (char) android.view.View.MeasureSpec.getMode(0), android.view.Gravity.getAbsoluteGravity(0, 0) + 5, objArr1102);
                                                java.lang.String[] strArr82 = {intern362, ((java.lang.String) objArr1102[0]).intern()};
                                                java.lang.Object[] objArr1112 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1521, (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 16, objArr1112);
                                                java.lang.String intern372 = ((java.lang.String) objArr1112[0]).intern();
                                                java.lang.Object[] objArr1122 = new java.lang.Object[1];
                                                a(1536 - android.text.TextUtils.getCapsMode(str5, 0, 0), (char) (18091 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), android.os.Process.getGidForName(str5) + 20, objArr1122);
                                                java.lang.String intern382 = ((java.lang.String) objArr1122[0]).intern();
                                                java.lang.Object[] objArr1132 = new java.lang.Object[1];
                                                a(1554 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (17453 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 15, objArr1132);
                                                java.lang.String[] strArr92 = {intern372, intern382, ((java.lang.String) objArr1132[0]).intern()};
                                                java.lang.Object[] objArr1142 = new java.lang.Object[1];
                                                a((android.view.KeyEvent.getMaxKeyCode() >> 16) + 1569, (char) (34668 - android.view.View.combineMeasuredStates(0, 0)), 20 - android.view.MotionEvent.axisFromString(str5), objArr1142);
                                                java.lang.String intern392 = ((java.lang.String) objArr1142[0]).intern();
                                                java.lang.Object[] objArr1152 = new java.lang.Object[1];
                                                a(1591 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) android.text.TextUtils.indexOf(str5, str5), 10 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr1152);
                                                c = 0;
                                                java.lang.String[] strArr102 = {intern392, ((java.lang.String) objArr1152[0]).intern()};
                                                java.lang.Object[] objArr1162 = new java.lang.Object[1];
                                                a(1600 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 51442), android.view.View.MeasureSpec.getSize(0) + 11, objArr1162);
                                                java.lang.String intern402 = ((java.lang.String) objArr1162[0]).intern();
                                                java.lang.Object[] objArr1172 = new java.lang.Object[1];
                                                a((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 337, (char) (android.text.TextUtils.getOffsetAfter(str5, 0) + 26077), 5 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr1172);
                                                java.lang.String[] strArr112 = {intern402, ((java.lang.String) objArr1172[0]).intern()};
                                                java.lang.Object[] objArr1182 = new java.lang.Object[1];
                                                a((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1610, (char) android.view.View.combineMeasuredStates(0, 0), android.graphics.Color.red(0) + 28, objArr1182);
                                                java.lang.String intern412 = ((java.lang.String) objArr1182[0]).intern();
                                                java.lang.Object[] objArr1192 = new java.lang.Object[1];
                                                a(android.text.TextUtils.indexOf(str5, str5, 0) + 1590, (char) android.graphics.Color.alpha(0), android.view.View.MeasureSpec.getMode(0) + 10, objArr1192);
                                                java.lang.String[][] strArr122 = {strArr82, strArr92, strArr102, strArr112, new java.lang.String[]{intern412, ((java.lang.String) objArr1192[0]).intern()}};
                                                int i582 = -1;
                                                i16 = 0;
                                                loop4: while (true) {
                                                    if (i16 < 5) {
                                                    }
                                                    i16++;
                                                    c = 0;
                                                }
                                                if (i17 == i) {
                                                }
                                            }
                                        }
                                    }
                                    java.lang.Object[] objArr205 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 343, (char) android.view.Gravity.getAbsoluteGravity(0, 0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 13, objArr205);
                                    java.lang.String intern74 = ((java.lang.String) objArr205[0]).intern();
                                    java.lang.Object[] objArr206 = new java.lang.Object[1];
                                    a(356 - android.text.TextUtils.indexOf("", "", 0, 0), (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.view.View.getDefaultSize(0, 0) + 9, objArr206);
                                    java.lang.Object[] objArr207 = {intern74, ((java.lang.String) objArr206[0]).intern()};
                                    java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                    if (obj39 == null) {
                                        java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.graphics.Color.blue(0), 2213 - (android.os.Process.myTid() >> 22), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                        int i70 = $$a[14] + 1;
                                        java.lang.Object[] objArr208 = new java.lang.Object[1];
                                        b((byte) i70, (byte) $$b, (short) i70, objArr208);
                                        obj39 = cls37.getMethod((java.lang.String) objArr208[0], java.lang.String.class, java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj39);
                                    }
                                    long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj39).invoke(null, objArr207)).longValue();
                                    long j36 = ~longValue13;
                                    long j37 = ~(j11 | longValue13);
                                    long j38 = (((((971 * longValue13) - 1912410537597L) + (((~(j36 | 986287023)) | j37) * (-970))) + ((~(longValue13 | (-986287024))) * 1940)) + (((~((-986287024) | j36)) | j37) * 970)) - 1721661625;
                                    if (((((int) j38) & ((((~(1710175595 | i)) | 268487296) * 576) + 1771465493 + (((~(1978662891 | i32)) | 4461889) * 576) + 29859840)) | (((int) (j38 >> 32)) & ((((((~(825283259 | i32)) | (-2033506236)) | r6) * (-502)) - 1475654910) + (((~((-824234650) | i)) | (~((-1208222977) | i32))) * 502)))) != 0) {
                                        int i71 = writeReplace + 7;
                                        values = i71 % 128;
                                        i10 = i71 % 2 == 0 ? i ^ 16671 : i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE;
                                    } else {
                                        i10 = i;
                                    }
                                    if (i10 == i) {
                                    }
                                }
                                obj = null;
                                i9 = i;
                                if (i9 != i) {
                                }
                            }
                        }
                        str4 = str12;
                        obj = null;
                        i9 = i;
                        if (i9 != i) {
                        }
                    }
                }
                i8 = i;
                if (i8 == i) {
                }
            }
            i6 = i;
            if (i6 != i) {
            }
        }
        str3 = str2;
        i6 = i;
        if (i6 != i) {
        }
    }
}
