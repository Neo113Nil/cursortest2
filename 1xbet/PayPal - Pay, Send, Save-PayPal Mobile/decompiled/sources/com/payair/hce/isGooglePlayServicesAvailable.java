package com.payair.hce;

/* loaded from: classes4.dex */
public class isGooglePlayServicesAvailable implements com.payair.hce.getMCallbacksannotations {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static long AlternateContactlessPaymentDataJson;
    private static char[] DigitizedCardProfile;
    private static int getProfileVersion;
    private static int values;
    private com.payair.hce.getMCallbacksannotations valueOf;
    private java.security.SecureRandom writeReplace;

    private static void b(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i = s + 65;
        byte[] bArr = $$a;
        int i2 = (b * 34) + 4;
        int i3 = b2 * 2;
        char[] cArr = new char[i3 + 1];
        int i4 = -1;
        if (bArr == null) {
            i2++;
            i = (i2 + (-i)) - 2;
        }
        while (true) {
            i4++;
            cArr[i4] = (char) i;
            if (i4 == i3) {
                objArr[0] = new java.lang.String(cArr);
                return;
            } else {
                byte b3 = bArr[i2];
                i2++;
                i = (i + (-b3)) - 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (i * 3) + 4;
        byte[] bArr = $$d;
        int i5 = b * 3;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            i3 = i4;
            int i7 = i6;
            int i8 = 0;
            i4 += i7;
            i3++;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i3];
            i4 += i7;
            i3++;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i4 = (s * 2) + 99;
            i3 = i4;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    public final java.security.SecureRandom DigitizedCardProfile() {
        int i = values + 75;
        getProfileVersion = i % 128;
        java.security.SecureRandom secureRandom = this.writeReplace;
        if (i % 2 != 0) {
            return secureRandom;
        }
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.getMCallbacksannotations valueOf() {
        int i = values;
        getProfileVersion = (i + 73) % 128;
        com.payair.hce.getMCallbacksannotations getmcallbacksannotations = this.valueOf;
        getProfileVersion = (i + 125) % 128;
        return getmcallbacksannotations;
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            $11 = ($10 + 113) % 128;
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(DigitizedCardProfile[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 382, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 62387));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c((short) 0, 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(AlternateContactlessPaymentDataJson), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3966, (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 33, (android.view.ViewConfiguration.getTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.os.Process.myPid() >> 22))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
            $10 = ($11 + 23) % 128;
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 213 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) android.view.KeyEvent.keyCodeFromString(""))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
        values = 0;
        getProfileVersion = 1;
        char[] cArr = new char[1707];
        java.nio.ByteBuffer.wrap("^\u0080¹\u001a\u0091héªÁÄÙÝ0&\bt`Cx\u0090Pì«'\u0083\u000b\u009bmó Ëô#Û:<\u0012xj_B\u0088ZÕµ*\u008d\u0018åVý¥Õð^\u0080¹\u001a\u0091héªÁÄÙÝ0&\bt`Cx\u0090Pì«'\u0083\u000b\u009bmó±Ëù#Ï:+\u0012BjHB\u008bZøµ:\u008d\u001cåS1\u0092Ö\bþz\u0086¸®Ö¶Ï_4gf\u000fQ\u0017\u0082?þÄ5ì\u0019ô\u007f\u009c ¤ûLÃU?\u0013(ô¥ÜÜ¤\u0007\u008cl\u0094\u007f}\u008eEÔ-ú52\u001dHæÓÎ¬Öõ¾\u0005\u0086\\nqw\u008f_Æ'ì\u000f\f\u0017@ø\u0090À´¨ë°\u000b\u0098O`u^\u0080¹\u001b\u0091yé¿ÁÄÙÞ0.\b6`Wx\u0084Pê«$^\u0080¹\u001b\u0091yé¿ÁÄÙÉ0 \bu`\tx\u0086P÷«;\u0083\u0013²iUä}\u0080\u0005V-c5!ÜÄäÞ\u008c\u009c\u0094Y¼!GÒoüw¾\u001fl'\u0018Ï\"ÖÆ¶dQéy\u0090\u0001K){1;ØÀàÓ\u0088¯\u0090{¸\u0003C\u009fkës¿\u001bG#\u001aË9Ò\u0084ú\u008a\u0082§^Í¹\u0017\u0091jé²Á\u0084ÙÂ\u008bîl\"^\u0080¹\r\u0091té¯Á\u009fÙß0$\b7`Ex\u009fPë«{\u0083\r\u009bWó¬Ëå#é:\u0003\u00120jBB\u009eZçµ,\u008dEåTý©Õû-Ð\u0004\u0001\u001cmt½^\u0080¹\r\u0091té¯Á\u009fÙß0$\b7`Ex\u009fPë«{\u0083\r\u009bWó¬Ëå#é:\u0003\u00120j\\B\u0089Zåµ)^\u0080¹\r\u0091té¯Á\u009fÙß0$\b7`Kx\u009fPç«{\u0083\u000f\u009b[ó£Ëþ#Ú:#\u0012hjzB¶Zúµ+\u008d\u0007åGýèÕæ-Ëã\u009c\u0004\u0006,tT¶|ØdÈ\u008d0µiÝNÅ\u008díì\u0016->\f&Z^Ý¹\u0011\u0091#é¾Á\u009eÙÓ0%\b|`\tx\u009ePê«'\u0083\u0017\u0087e`¿HÈ0\u000b\u0018*\u00000é\u0083ÑÙ¹÷ý\u009a\u001a\u00142eJ©b\u0092z\u008f\u00935«kÃQÛ\u0089óì\b7 \n8\\P¾hç\u0080Ö^ø¹\"\u0091Yé\u0090Á¡ÙåÀ*'æ\u000fÔw[_nG\"®Ú\u0096\u009aþ³æuÎ\\5Î\u001dõ\u0005«mCU\u0001½)¤Ú\u008c\u009eô®Ü~Ä\u0018+ÜEn¢½\u008aÅò\u0003¢ðE5mK\u0015\u008d=±%õò?\u0015±=ÀE\fm7u*\u009c\u009b¤ÈÌüÔ<üV\u0007\u008e/¯\u0016åñ Ù^¡\u0098\u0089°\u0091óx\u0010@W(oàO\u0007¼/ÄW\u0002\u007f!gr\u008e\u009a¶ÖÞïÆ?^Ú¹\u0010\u0091fé²Á\u0084ÙÍ0'\u008b\u0001lÛD²<~\u0014K\f\u001eåñÝ¸xM\u009f\u0081·³Ï<ç\tÿE\u0016½.ýFÔ^\u0012v;\u008d ¥\u0096½ÔÕ8íc\u0005J^Ù¹\u001c\u0091bé¤ÁÓÙ\u008c09^È¹\u001b\u0091cé¹Á\u0099ÙÓ0*^È¹\u001b\u0091cé¹Á\u0099ÙÓ0*\bG`_xÎP³^È¹\u001b\u0091cé¹Á\u0099ÙÓ0*\bG`_xÎP³«\u000b\u0083U\u009b\u0006_\r¸Á\u0090óè|ÀIØ\u00051ý\t½a\u0094yRQ{ªé\u0082Ü\u009a\u0086òtÊ,^Ü¹\u001a\u0091fg=\u0080ä¨\u008fÐGø}à9\tÑ1\u009d\u0091Lv¬^ß&^\u000e\u001b\u0016mÿ\u0085ÇÎ¯ì·9\u009fBdÖL§Tÿ<\u0011\u0004\u0012ì^õ\u0084ÝÍ¥á\u008d4\u0095M^î¹\u0010\u0091ié®Á\u0084ÙÓ0-\b8`tx²PÎ«t\u0083\u0001\u009bGó¨Ëü#Ë:n\u0012{jCB\u0089Zªµ!\u008dPå\u0001^î¹\u0010\u0091ié®Á\u0084ÙÓ0-\b8`tx²PÎ«t\u0083\u0001\u009bGó¨Ëü#Ë:n\u0012{jCB\u0089Zªµ!\u008dPå\u0001ý\u0099Õ£-\u0090¹b^®v\u009c\u000e\u000b&5>w×\u0092ïÐ\u0087ù\u009f;·_^È¹\u0011\u0091aé¸Á\u008dÙÓ0:\bp7©Ðlø\u0012\u0080Ô¨£°ü^Ý¹\u001f\u0091cé¿Á\u0083ÙÏÿ \u0018l0^HÑ`äx¨\u0091P©\u0010Á9ÙÿñÖ\nK\"l:.RÒj\u0089\u009dÏz\u0003R1*¥\u0002\u009c\u001aÚó5Ëo£Y»Ê\u0093æh#@\u001cXUR\u0014U\u008f²C\u009aqâýÊÜÒ\u008b;n\u00038k\u0010^\u009f\u008a¢mnE\\=Á\u0015á\r¬äZÜ\u0003´v¬ù\u0084\u0088\u007fDWxO8'Ý\u001f\u009b^É¹\u000b\u0091aé°Á´ÙÂ0q\b.\u0083\fdÀLò4o\u001cO\u0004\u0002íôÕ\u00ad½Ø¥A\u008d=vë^ÕF\u0086.b\u00161þ\u001cçöÏ¢·\u0089Ý©:z\u0012\u0002jØBøZ²³K\u008bVã5ûóÓ\u008f(\u001a\u0000e\u00186pÎH\u0094 ¬¹F\u0091\u001f#ÏÄ\u001cìd\u0094¾¼\u009e¤ÔM-u@\u001dX\u0005É-´Ö|þ\u0017æQ\u008e\u00ad¶È^ÀGqo,\u0017\u0004?\u009b'èÈ0ð\n\u0098B\u0080¨¨ñPüy\fa=\tà^È¹\u001b\u0091cé¹Á\u0099ÙÓ0*\b7`@x\u0099Pê«3\u0083\u000f\u009bWó\u009eËã#Û:%\u00122jKB\u009eZäµ<\u008d\u001aå^ý¥^È¹\u001b\u0091cé¹Á\u0099ÙÓ0*\b7`Qx\u0094Pê«,\u0083[\u009b\u0004ó±Ë¿#É:,\u0012rjTBÃZ¼µ)^È¹\u0011\u0091bé»Á\u0087Ùß0f\bk`Cx\u009dPÚ«3\u0083\u0013\u009bZó®Ëþ#Ú:\u0011\u0012ej\u0014BÍZ¥µ>\u008d\råYý£Õç-Í\u0004\u0010\u001c]t©LØ¤¹ëc\f¯$\u009d\\\u0000t:lk\u0085\u0083½ÊÕöÍ)å_\u001e\u008f6¯^Ý¹\u0011\u0091#é¾Á\u0084ÙÕ0=\bq`Jx\u0097Pâ«1\u0083M\u009bPó´Ëù#Ó:*\u00123jJB\u0092Zäµ>\u008d\råEý¶Õç-Í\u0004\u001d\u001cv\u001d÷ú\tÒpª·\u0082\u009d\u009aÊs4K,#F;×\u0013ª^Ý¹\u0011\u0091#é¾Á\u009eÙÓ0%\b|`\tx\u0092Pì«'\u0083\u0013\u009b^ó Ëé#\u0091:'\u0012y^Û¹\u001b\u0091~é¨ÁÆ\u009c.{øS\u008c+@\u0003-\u001b!ò×Ê\u0093¢áºo\u0092\biÑAþY÷1Y\t\ná8øÖÐ\u0086^Þ¹\u001b\u0091`é©ÁÅÙÒ0>\b6`Jx\u0097Pì«:\u0083\b\u009bWó¸Ëãqt\u0096±¾ÊÆ\u0003îoöc\u001f\u0085'\u009cOëW=\u007fD\u0084\u009b¬\u0096´ûÜ\näW\fp\u0015\u0096=Ö^Þ¹\u001b\u0091`é©ÁÅÙÉ0/\b6`Kx\u0095Pá«\u000b\u0083\u0007\u009bWó¯Ëã#Ö::\u0012d\u001c§ûkÓY«Í\u0083ô\u009b²r]J\u0007\"1:¢\u0012\u009eé@Á}Ù:±Ô\u0089\u0083a¡x\u001aP\u0016(3\u0000ì\u0018\u0085÷G^Ý¹\u0011\u0091#é¾Á\u0084ÙÕ0=\b6`Vx\u0093Pè«!\u0083M\u009bSó·Ëô#à: \u0012|jAB\u009e^Ý¹\u0011\u0091#é³Á\u008fÙ×0g\bz`Rx\u009fPé«0\u0083M\u009bTó¨Ëþ#Ø:+\u0012oj\\B\u0089Zãµ7\u008d\u001cÂÛ%\u0017\r%uª]\u009fEÓ¬+\u0094küBä\u0084Ì\u00ad70\u001f\u0010\u0007]o«Wò¿\u0097¦.\u008eröDÞ\u009aÆé)-\u0011\u001eyCa©Iý±Ö^Ý¹\u0011\u0091#é¯Á\u0092ÙÉ0=\b}`JxØPç«!\u0083\n\u009b^ó¥Ë¾#Ù:'\u0012sjKB\u009eZøµ)\u008d\u001aå^ý¨ÕáqÚ\u0096\u0016¾$Æ¨î\u0095öÎ\u001f:'zOMW®\u007fç\u0084+¬\u0010´\u001bÜ¤äâ\fÑ\u0015%=~E\u0005m\u009auä\u009a0¢\bÊUÒ³úâ\u0002Ñ+\u001d3k[¢Ë#,ï\u0004Ý|TTpL*¥Ó\u009d\u0089õ«í&Å\u0019>ß\u0016ô\u000e f[^@¶'¯Ù\u0087\u008dÿµ×`Ï\u0006 ×\u0018äp hV@\u001f^Ý¹\u0011\u0091#éªÁ\u008eÙÔ0-\bw`Ux©Pá«8\u0083\b\u009b_óïËò#Ê:'\u0012qjHBÕZìµ0\u008d\u0006åPý£Õç-Ô\u0004\u0001\u001ckt¿L\u0094ññ^\u0080¹\u001a\u0091héªÁÄÙË0,\bu`Rx©Põ«=\u0083\u0013\u009bWµ$R¾zÌ\u0002\u000e*`2mÛ\u0082ãß\u008bè\u00937»U@ßh¥p÷\u0018\u0016 QÈyÑ\u008bù×\u0081ì©\u0000±I^\u0098f¢\u000eê\u0016\u0006à\f\u0007\u0096/äW&\u007fHgE\u008eª¶÷ÞÀÆ\u001fî}\u0015÷=\u0088%ÛM#ue\u009dW^\u0080¹\u001a\u0091héªÁÄÙÉ0&\b{`Lx\u0093Pñ«{\u0083\u0012\u009bWó¬Ëå#Û¢EEÈm±\u0015j=\u0001%\u000eÌéô°\u009c\u0097\u0084l¬4Wã\u007fÇg\u0094\u000fa^\u0080¹\r\u0091té¯Á\u009fÙß0$\b7`Kx\u009fPç«{\u0083\u000f\u009b[ó£Ëó#à:#\u0012|j@B\u0097Zåµ:\u008d7åSý£Õ÷-Ñ\u0004\u0014\u001c]t L\u0085¤â¿+\u0097CïOÇ¤Ëõ,o\u0004\u001d|ßT±L\u00ad¥O\u009d\u0019õ\ríäÅ\u0080>R^\u0080¹\u001a\u0091héªÁÄÙØ0:\bl`xx\u0082Pì«9\u0083\u0006ìè\u000br#\u0000[Âs¬k¡\u0082Nº\u0013Ò$Êûâ\u0099\u0019\u00131i))AÝy\u009e\u0091¸\u0088J \u0011Ø!ðáè\u0086^\u0080¹\r\u0091té¯Á\u009fÙß0$\b7`Kx\u009fPç«{\u0083\u000f\u009b[ó£Ëò#Ì::\u0012{jCB\u0097Zîµ<\u008d\u001aåhý¬Õû-Í\u0004]\u001cqt¾^\u0080¹\u001a\u0091héªÁÄÙØ0:\bl`Fx\u0095Pæ«1^\u0080¹\u001a\u0091héªÁÄÙØ0:\bl`@x\u008fP÷«;&ÿÁeé\u0017\u0091Õ¹»¡§HEp\u0013\u00185\u0000ì(\u009dÓE^\u0080¹\u001a\u0091héªÁÄÙØ0:\bl`Hx\u0084Pì«1^\u0080¹\u001a\u0091héªÁÄÙØ0:\bl`Qx\u009bPö«3^\u0080¹\u001a\u0091héªÁÄÙØ0:\bl`Wx\u0091Pä«=\u0083\u0013\u009bQ^\u0080¹\u001a\u0091héªÁÄÙØ0:\bl`xx\u009fPè«1^\u0080¹\u001a\u0091lé¨Á\u008aÙ\u00950-\bw`Px\u0098Pé«;\u0083\u0002\u009bVó²Ë¿#\u0091:6\u0012\u007fj\u0003B\u0099Zùµ-\u008d\u0003^\u0080¹\u0013\u0091cé¨ÁÄÙÍ0 \bv`Cx\u0099Pò«'\u0083L\u009bpó²Ëä#ì:&\u0012|j^B\u009eZîµ\u001f\u008d\u0007å[ý¢Õð-Ö^\u0080¹\u000e\u0091\u007fé³Á\u0088Ù\u00950 \bw`Wx\u0099P÷« \u0083\u0010ý±\u001a62EJÒbÿ\u0097¼p2XC \u008f\b´\u0010©ù\u0006ÁA©w±¬\u0099\u0096b\u0005J>R~:\u008e^È¹\f\u0091lé°Á\u0087ÙÕ0*\b6`@x\u0099Pé«0\u0083\u0005\u009b[ó²Ëø#\u0091:=\u0012r^Ã¹\u0017\u0091oé\u009bÁ§Ùÿ0\u001a\bG`Ex\u0085Pñ«z\u0083\u0010\u009b]^\u0080¹\u001b\u0091yé¿ÁÄÙ×0,\b|`Nx\u0097PÚ«7\u0083\f\u009bVó¤Ëó#Ì:`\u0012ejAB\u0097^Í¹\u0012\u0091xé¹Á\u0098ÙÎ0(\b{`Lx\u0085?÷Ølð\u000e\u0088È ³¸ QQi\u001a\u0001>\u0019õ1\u0081^\u0080¹\u001a\u0091lé¨Á\u008aÙ\u00950-\bw`Px\u0098Pé«;\u0083\u0002\u009bVó²Ë¿#\u0091:*\u0012mj\u0003B\u009aZúµ)\u008d\u001bå\u0019ý¾Õø-Èw|\u0090ò¸\u0083ÀOètði\u0019Ö!\u0094I®Qcy\u0017\u0082Îªð^è¹\u0011\u0091aé¸Á\u008dÙÓ0:\bp^\u0080¹\u001a\u0091lé¨Á\u008aÙ\u00950$\bq`Tx\u0095Pª«$\u0083\u0011\u009b]ó§Ëù#Ó:+\u0012nj\u0003B\u0098Zÿµ+\u008dGå\u0007ýéÕö-Ë\u0004\u001e\u001c,t¼L\u0089¤ì¿,\u0097\u0002ïJÇ¢ßè7Ý\u000eVfj~³V\u0088®Á\u0089*á\u007fùD".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1707);
        DigitizedCardProfile = cArr;
        AlternateContactlessPaymentDataJson = 8682149278380767614L;
    }

    static void init$1() {
        $$d = new byte[]{89, 16, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -117};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.EM, -31, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, com.google.common.base.Ascii.DC4, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -15, 10};
        $$b = 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x17fe, code lost:
    
        if (((((int) (r13 >> 32)) & ((((((~(944511918 | r58)) | (-2051907503)) * 1504) - 1320242614) + ((~((-1107395585) | r58)) * (-1504))) + 744867712)) | (((int) r13) & ((((((~(r28 | (-2076668665))) | (~((-781072222) | r58))) | (~(r28 | 781072221))) * 959) + 1570707052) + ((((~((-2076668665) | r58)) | (~(r28 | (-781072222)))) | (~(781072221 | r58))) * 959)))) != 1986687685) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x21ff, code lost:
    
        if (((((int) r2) & ((((((~((-535700235) | r58)) | (~(r28 | (-1611684021)))) * (-406)) - 841962689) + ((~(r28 | (-361242625))) * (-406))) + (((~(1972926644 | r58)) | (~(r28 | 535700234))) * 406))) | (((((((~(r28 | 2068946589)) | (-2136317888)) * 446) + 384374654) + (((~((-67371299) | r58)) | 1347523592) * 446)) + 684961664) & ((int) (r2 >> 32)))) != 0) goto L266;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0b68  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0c25  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0cfe  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0dd2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0833  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] writeReplace(android.content.Context context, int i, int i2, int i3) {
        java.lang.String str;
        java.lang.Integer num;
        java.lang.Integer num2;
        int i4;
        java.lang.String str2;
        int i5;
        int i6;
        long j;
        int i7;
        int i8;
        int i9;
        int i10;
        long j2;
        int i11;
        int i12;
        int i13;
        java.lang.Object[] objArr;
        char c;
        java.lang.String[][] strArr;
        int i14;
        int i15;
        int i16;
        int i17;
        java.lang.String[][] strArr2;
        java.lang.String next;
        int i18;
        java.lang.String str3;
        java.lang.String next2;
        int i19 = 0;
        java.lang.Integer num3 = 0;
        java.lang.String str4 = "";
        int i20 = 1;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(466 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (android.view.View.combineMeasuredStates(0, 0) + 14839), 7 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
        java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
        int i21 = 16;
        java.lang.Integer num4 = 16;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(android.graphics.Color.blue(0), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), 27 - android.text.TextUtils.getTrimmedLength(""), objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 27, (char) android.graphics.Color.argb(0, 0, 0, 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 26, objArr4);
        java.lang.String intern3 = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 52, (char) (android.graphics.Color.argb(0, 0, 0, 0) + 28434), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 18, objArr5);
        java.lang.String intern4 = ((java.lang.String) objArr5[0]).intern();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 71, (char) (19880 - android.text.TextUtils.indexOf("", "", 0)), 28 - android.view.View.resolveSize(0, 0), objArr6);
        java.lang.String[] strArr3 = {intern2, intern3, intern4, ((java.lang.String) objArr6[0]).intern()};
        int i22 = 0;
        while (true) {
            if (i22 >= 4) {
                str = intern;
                num = num3;
                num2 = num4;
                i4 = i;
                break;
            }
            getProfileVersion = (values + 49) % 128;
            try {
                java.lang.Object[] objArr7 = {strArr3[i22]};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.text.TextUtils.getCapsMode("", i19, i19), 3161 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> i21), (char) (android.graphics.ImageFormat.getBitsPerPixel(i19) + 33100));
                    byte b = (byte) ($$a[14] + i20);
                    java.lang.Object[] objArr8 = new java.lang.Object[i20];
                    b(b, b, (short) (b | 653), objArr8);
                    java.lang.String str5 = (java.lang.String) objArr8[i19];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[i20];
                    clsArr[i19] = java.lang.String.class;
                    obj = cls.getMethod(str5, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr7)).longValue();
                long j3 = ~longValue;
                num = num3;
                long j4 = i;
                num2 = num4;
                long j5 = ~j4;
                str = intern;
                java.lang.String[] strArr4 = strArr3;
                long j6 = ((((((-317) * longValue) - 85121226938L) + (((~(j4 | 266837701)) | j3) * (-318))) + (((~(j3 | j4)) | (~((j5 | (-266837702)) | longValue))) * 318)) + (((~((j3 | j5) | (-266837702))) | ((j4 | (longValue | (-266837702))) ^ (-1))) * 318)) - 1070830406;
                int i23 = ~i;
                if (((((int) j6) & ((((~((-843992586) | i23)) | (~(2013748300 | i))) * com.visa.cbp.getCertUsage.getODAData) + 1544370377 + (((~(i23 | 2013748300)) | (~((-843992586) | i))) * com.visa.cbp.getCertUsage.getODAData))) | (((int) (j6 >> 32)) & ((((~(2102634828 | i)) | (~((-755106057) | i))) * 69) + 1523346902 + (((~(1023648012 | i)) | 1078986816 | (~((-1834092873) | i))) * (-69)) + 1349525780))) != 0) {
                    i4 = i ^ (i22 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
                    break;
                }
                i22++;
                num3 = num;
                num4 = num2;
                intern = str;
                strArr3 = strArr4;
                i19 = 0;
                i21 = 16;
                i20 = 1;
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
            java.lang.Object[] objArr9 = {new int[]{i}, new int[]{i4}, null, null, new int[1]};
            int i25 = ~((~i) | 1161728342);
            java.lang.Object[] objArr10 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((1090519364 | i25) * (-970)) - 1355524859) + ((i25 | 71208978) * 970))};
            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj2 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.getSize(0), 2713 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int i26 = $$a[14] + 1;
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b((byte) i26, r6[16], (short) i26, objArr11);
                obj2 = cls2.getMethod((java.lang.String) objArr11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
            }
            ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr10)).intValue();
            return objArr9;
        }
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        a(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 98, (char) android.text.TextUtils.indexOf("", ""), android.view.KeyEvent.normalizeMetaState(0) + 12, objArr12);
        java.lang.String intern5 = ((java.lang.String) objArr12[0]).intern();
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a(110 - android.view.KeyEvent.keyCodeFromString(""), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13, objArr13);
        java.lang.String intern6 = ((java.lang.String) objArr13[0]).intern();
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        a(122 - android.view.MotionEvent.axisFromString(""), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 60650), android.view.View.MeasureSpec.getMode(0) + 18, objArr14);
        java.lang.String[] strArr5 = {intern5, intern6, ((java.lang.String) objArr14[0]).intern()};
        int i27 = 0;
        while (true) {
            if (i27 >= i24) {
                str2 = str4;
                i5 = i;
                break;
            }
            java.lang.Object[] objArr15 = {strArr5[i27]};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 36, 3160 - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.view.MotionEvent.axisFromString(str4) + 33100));
                byte b2 = (byte) (-$$a[14]);
                byte b3 = (byte) (b2 - 1);
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                b(b2, b3, (short) (b3 | 35), objArr16);
                obj3 = cls3.getMethod((java.lang.String) objArr16[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj3);
            }
            long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr15)).longValue();
            long j7 = ~longValue2;
            long j8 = i;
            str2 = str4;
            long j9 = j7 | (-301123209);
            long j10 = 1208593947 + (131 * longValue2) + 38844893961L + ((~((~j8) | j7 | (-301123209))) * 130) + ((~j9) * (-260)) + (((~(301123208 | longValue2)) | (~(j9 | j8))) * 130);
            int i28 = ~i;
            if (((((int) j10) & ((((((~(1632420454 | i28)) | 178400408) * 446) - 384374209) + (((~(1810820862 | i)) | 16793636) * 446)) - 2037796656)) | (((int) (j10 >> 32)) & ((((((~((-95715341) | i28)) | (-1341511071)) | (~(1207206302 | i))) * (-68)) - 586925342) + ((~((-134304769) | i28)) * (-68)) + (((~((-1207206303) | i28)) | (-230020109)) * 68)))) != 0) {
                i5 = (i27 + 270) ^ i;
                break;
            }
            i27++;
            str4 = str2;
            i24 = 3;
        }
        if (i5 != i) {
            java.lang.Object[] objArr17 = {new int[]{i}, new int[]{i5}, null, null, new int[1]};
            int i29 = ~i;
            java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((~((-1434976372) | i29)) | (~(615869726 | i))) * 959) - 1788377627) + (((~(i | (-1434976372))) | (~(i29 | 615869726))) * 959))};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj4 == null) {
                java.lang.String str6 = str2;
                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf(str6, str6, 0, 0), 2713 - android.view.View.resolveSizeAndState(0, 0, 0), (char) ((-1) - android.view.MotionEvent.axisFromString(str6)));
                int i30 = $$a[14] + 1;
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                b((byte) i30, r2[16], (short) i30, objArr19);
                obj4 = cls4.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
            }
            ((int[]) objArr17[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr18)).intValue();
            return objArr17;
        }
        java.lang.String str7 = str2;
        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1781008036);
        if (obj5 == null) {
            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1864 - android.view.View.MeasureSpec.getSize(0), (char) (41774 - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
            byte b4 = (byte) ($$a[14] + 1);
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            b(b4, b4, (short) (b4 | 653), objArr20);
            obj5 = cls5.getMethod((java.lang.String) objArr20[0], null);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1781008036, obj5);
        }
        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, null)).longValue();
        long j11 = ~longValue3;
        long j12 = i;
        long j13 = ~j12;
        long j14 = ~((-1185121603) | j12);
        long j15 = (((((521 * longValue3) + 615078111957L) + (((~(longValue3 | j12)) | (~((j11 | 1185121602) | j13))) * 520)) + (((~(j11 | j13)) | j14) * (-1040))) + ((((~(1185121602 | j13)) | (~(j11 | (-1185121603)))) | j14) * 520)) - 744091259;
        int i31 = ~i;
        int i32 = (((int) (j15 >> 32)) & ((((~((-1466228871) | i)) | (~(29002459 | i31))) * 1900) + 1871737038 + (((~(1466228870 | i31)) | (~((-29002460) | i))) * (-950)) + (((~((-29002460) | i31)) | (~(1466228870 | i))) * 950))) | (((int) j15) & (((((~(415214226 | i)) | 608174341) * (-283)) - 1122579748) + ((~(1023388567 | i)) * 283)));
        int i33 = i32 != 0 ? (i32 + 199) ^ i : i;
        if (i33 != i) {
            java.lang.Object[] objArr21 = {new int[]{i}, new int[]{i33}, null, null, new int[1]};
            java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~((-1671615940) | i31)) | (~((-379230159) | i)) | (~(379230158 | i31))) * 959) + 319713170 + (((~(i | 379230158)) | (~(i31 | (-379230159))) | (~((-1671615940) | i))) * 959))};
            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj6 == null) {
                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 49, 2713 - android.view.View.MeasureSpec.getSize(0), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                int i34 = $$a[14] + 1;
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                b((byte) i34, r2[16], (short) i34, objArr23);
                obj6 = cls6.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
            }
            ((int[]) objArr21[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr22)).intValue();
            return objArr21;
        }
        java.lang.Object[] objArr24 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 141, (char) (59620 - android.text.TextUtils.indexOf(str7, str7)), 20 - android.text.TextUtils.getCapsMode(str7, 0, 0), objArr24);
        java.lang.String intern7 = ((java.lang.String) objArr24[0]).intern();
        java.lang.Object[] objArr25 = new java.lang.Object[1];
        a(android.graphics.Color.rgb(0, 0, 0) + 16777377, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.view.KeyEvent.getDeadChar(0, 0) + 6, objArr25);
        java.lang.String intern8 = ((java.lang.String) objArr25[0]).intern();
        java.io.File file = new java.io.File(intern7);
        if (file.exists() && file.isFile()) {
            try {
                java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(file));
                java.lang.Object[] objArr26 = new java.lang.Object[1];
                a(166 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 54557), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 2, objArr26);
                java.util.Scanner useDelimiter = scanner.useDelimiter(((java.lang.String) objArr26[0]).intern());
                next2 = useDelimiter.hasNext() ? useDelimiter.next() : str7;
                useDelimiter.close();
            } catch (java.io.IOException unused) {
            }
            if (next2.contains(intern8)) {
                i6 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
                if (i6 == i) {
                    java.lang.Object[] objArr27 = {new int[]{i}, new int[]{i6}, null, null, new int[1]};
                    int i35 = ~(i | 1979443053);
                    java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((((~((-1146742630) | i31)) | 71403044) | i35) * (-252)) - 1430423295) + ((i35 | (~(i31 | (-1075339586)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE))};
                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj7 == null) {
                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49, android.view.View.MeasureSpec.getMode(0) + 2713, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                        int i36 = $$a[14] + 1;
                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                        b((byte) i36, r2[16], (short) i36, objArr29);
                        obj7 = cls7.getMethod((java.lang.String) objArr29[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                    }
                    ((int[]) objArr27[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr28)).intValue();
                    return objArr27;
                }
                java.lang.Object[] objArr30 = new java.lang.Object[1];
                a(168 - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), 31 - android.text.TextUtils.indexOf(str7, str7), objArr30);
                java.lang.String intern9 = ((java.lang.String) objArr30[0]).intern();
                java.lang.Object[] objArr31 = new java.lang.Object[1];
                a(200 - android.view.View.MeasureSpec.getSize(0), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 22 - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr31);
                java.lang.String intern10 = ((java.lang.String) objArr31[0]).intern();
                java.lang.Object[] objArr32 = new java.lang.Object[1];
                a(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, (char) android.text.TextUtils.indexOf(str7, str7, 0), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29, objArr32);
                java.lang.String intern11 = ((java.lang.String) objArr32[0]).intern();
                java.lang.Object[] objArr33 = new java.lang.Object[1];
                a(251 - android.view.KeyEvent.normalizeMetaState(0), (char) (48412 - android.view.View.MeasureSpec.getSize(0)), 13 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr33);
                java.lang.String[] strArr6 = {intern9, intern10, intern11, ((java.lang.String) objArr33[0]).intern()};
                int i37 = 0;
                while (true) {
                    if (i37 >= 4) {
                        j = j13;
                        i7 = i;
                        break;
                    }
                    java.lang.Object[] objArr34 = {strArr6[i37]};
                    java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                    if (obj8 == null) {
                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 3161, (char) ((-16744117) - android.graphics.Color.rgb(0, 0, 0)));
                        byte b5 = (byte) (-$$a[14]);
                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                        b(b5, b5, (short) (b5 | 40), objArr35);
                        obj8 = cls8.getMethod((java.lang.String) objArr35[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj8);
                    }
                    long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj8).invoke(null, objArr34)).longValue();
                    long j16 = ~longValue4;
                    long j17 = ~(536610908 | j13 | longValue4);
                    j = j13;
                    long j18 = (471 * longValue4) + 252743737668L + ((longValue4 | 536610908) * (-470)) + (((~((-536610909) | j16)) | (~(j16 | j12)) | j17) * (-470)) + (((~(536610908 | j16 | j12)) | j17) * 470) + 458823995;
                    if (((((int) j18) & ((((~((-1002056396) | i)) | (-1855684491)) * (-964)) + 299009877 + (((~((-1002056396) | i31)) | 287309889) * (-964)))) | (((int) (j18 >> 32)) & ((((~((-1950571169) | i31)) | (~(513344757 | i))) * (-370)) + 635053406 + (((~((-1950571169) | i)) | (~(513344757 | i31)) | 177734741) * (-370)) + 1337344730))) != 0) {
                        i7 = i ^ (i37 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                        break;
                    }
                    i37++;
                    j13 = j;
                }
                if (i7 != i) {
                    java.lang.Object[] objArr36 = {new int[]{i}, new int[]{i7}, null, null, new int[1]};
                    java.lang.Object[] objArr37 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((4194756 | i31) * 1324) + 1600395419) + (((~(i | 1089741261)) | (~(961104836 | i))) * (-1324))) - 808438970)};
                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj9 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str7, str7) + 50, android.graphics.Color.alpha(0) + 2713, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        int i38 = $$a[14] + 1;
                        java.lang.Object[] objArr38 = new java.lang.Object[1];
                        b((byte) i38, r2[16], (short) i38, objArr38);
                        obj9 = cls9.getMethod((java.lang.String) objArr38[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj9);
                    }
                    ((int[]) objArr36[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr37)).intValue();
                    return objArr36;
                }
                java.lang.Object[] objArr39 = new java.lang.Object[1];
                a(265 - android.text.TextUtils.getTrimmedLength(str7), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 14 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr39);
                java.lang.Object[] objArr40 = {((java.lang.String) objArr39[0]).intern()};
                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj10 == null) {
                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1920 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    byte b6 = (byte) ($$a[14] + 1);
                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                    b(b6, b6, (short) (b6 | 653), objArr41);
                    obj10 = cls10.getMethod((java.lang.String) objArr41[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj10);
                }
                java.lang.String str8 = (java.lang.String) ((java.lang.reflect.Method) obj10).invoke(null, objArr40);
                if (str8 != null) {
                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                    a(android.view.KeyEvent.normalizeMetaState(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, (char) (55717 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 10 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr42);
                    if (str8.contains(((java.lang.String) objArr42[0]).intern())) {
                        i8 = i ^ 250;
                        if (i8 == i) {
                            java.lang.Object[] objArr43 = {new int[]{i}, new int[]{i8}, null, null, new int[1]};
                            java.lang.Object[] objArr44 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((~((-738572912) | i)) | 536873037) * (-283)) - 632907088) + ((~(i | (-201699875))) * 283))};
                            java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj11 == null) {
                                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49, android.graphics.ImageFormat.getBitsPerPixel(0) + 2714, (char) android.graphics.Color.red(0));
                                int i39 = $$a[14] + 1;
                                java.lang.Object[] objArr45 = new java.lang.Object[1];
                                b((byte) i39, r2[16], (short) i39, objArr45);
                                obj11 = cls11.getMethod((java.lang.String) objArr45[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj11);
                            }
                            ((int[]) objArr43[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr44)).intValue();
                            return objArr43;
                        }
                        java.lang.Object[] objArr46 = new java.lang.Object[1];
                        a(android.view.MotionEvent.axisFromString(str7) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 41754), android.text.TextUtils.indexOf(str7, str7, 0) + 17, objArr46);
                        java.lang.String intern12 = ((java.lang.String) objArr46[0]).intern();
                        java.lang.Object[] objArr47 = new java.lang.Object[1];
                        a(304 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 57), android.widget.ExpandableListView.getPackedPositionChild(0L) + 7, objArr47);
                        java.lang.String intern13 = ((java.lang.String) objArr47[0]).intern();
                        java.io.File file2 = new java.io.File(intern12);
                        if (file2.exists() && file2.isFile()) {
                            try {
                                java.util.Scanner scanner2 = new java.util.Scanner(new java.io.FileInputStream(file2));
                                java.lang.Object[] objArr48 = new java.lang.Object[1];
                                a(166 - android.os.Process.getGidForName(str7), (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 54557), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2, objArr48);
                                java.util.Scanner useDelimiter2 = scanner2.useDelimiter(((java.lang.String) objArr48[0]).intern());
                                if (useDelimiter2.hasNext()) {
                                    int i40 = values + 3;
                                    getProfileVersion = i40 % 128;
                                    if (i40 % 2 == 0) {
                                        useDelimiter2.next();
                                        throw new java.lang.ArithmeticException();
                                    }
                                    str3 = useDelimiter2.next();
                                } else {
                                    str3 = str7;
                                }
                                useDelimiter2.close();
                            } catch (java.io.IOException unused2) {
                            }
                            if (str3.contains(intern13)) {
                                int i41 = (values + 63) % 128;
                                getProfileVersion = i41;
                                int i42 = i41 + 57;
                                values = i42 % 128;
                                int i43 = i42 % 2;
                                i9 = i ^ 251;
                                if (i9 == i) {
                                    java.lang.Object[] objArr49 = {new int[]{i}, new int[]{i9}, null, null, new int[1]};
                                    java.lang.Object[] objArr50 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((((~((-1011795611) | i31)) | (~((-1039050488) | i))) | (~(1039050487 | i31))) * 959) - 1877781406) + (((~(i | 1039050487)) | (~(i31 | (-1039050488))) | (~((-1011795611) | i))) * 959))};
                                    java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj12 == null) {
                                        java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 49, android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2714, (char) android.view.KeyEvent.keyCodeFromString(str7));
                                        int i44 = $$a[14] + 1;
                                        java.lang.Object[] objArr51 = new java.lang.Object[1];
                                        b((byte) i44, r2[16], (short) i44, objArr51);
                                        obj12 = cls12.getMethod((java.lang.String) objArr51[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj12);
                                    }
                                    ((int[]) objArr49[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr50)).intValue();
                                    return objArr49;
                                }
                                java.lang.Object[] objArr52 = new java.lang.Object[1];
                                a(358 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (40695 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 23, objArr52);
                                java.lang.Object[] objArr53 = {((java.lang.String) objArr52[0]).intern()};
                                java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj13 == null) {
                                    java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.getOffsetBefore(str7, 0), 1922 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                                    byte b7 = (byte) ($$a[14] + 1);
                                    java.lang.Object[] objArr54 = new java.lang.Object[1];
                                    b(b7, b7, (short) (b7 | 653), objArr54);
                                    obj13 = cls13.getMethod((java.lang.String) objArr54[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj13);
                                }
                                java.lang.String lowerCase = ((java.lang.String) ((java.lang.reflect.Method) obj13).invoke(null, objArr53)).toLowerCase();
                                java.lang.Object[] objArr55 = new java.lang.Object[1];
                                a(333 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (7079 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 4 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr55);
                                int i45 = lowerCase.contains(((java.lang.String) objArr55[0]).intern()) ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE : i;
                                if (i45 != i) {
                                    java.lang.Object[] objArr56 = {new int[]{i}, new int[]{i45}, null, null, new int[1]};
                                    java.lang.Object[] objArr57 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~(1453035115 | i31)) | 555766020) * (-108)) + 1958898289 + (((~(i31 | 597810982)) | (~((-597810983) | i)) | 1410990153) * 54) + ((i | 1410990153) * 54))};
                                    java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj14 == null) {
                                        java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 50, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                        int i46 = $$a[14] + 1;
                                        java.lang.Object[] objArr58 = new java.lang.Object[1];
                                        b((byte) i46, r2[16], (short) i46, objArr58);
                                        obj14 = cls14.getMethod((java.lang.String) objArr58[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj14);
                                    }
                                    ((int[]) objArr56[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr57)).intValue();
                                    return objArr56;
                                }
                                java.lang.Object[] objArr59 = new java.lang.Object[1];
                                a(287 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (41754 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 17 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr59);
                                java.lang.String intern14 = ((java.lang.String) objArr59[0]).intern();
                                java.lang.Object[] objArr60 = new java.lang.Object[1];
                                a(337 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (64553 - (android.os.Process.myTid() >> 22)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 6, objArr60);
                                java.lang.Object[] objArr61 = {intern14, ((java.lang.String) objArr60[0]).intern()};
                                java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                if (obj15 == null) {
                                    java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39, android.text.TextUtils.indexOf(str7, str7) + 2213, (char) ((-1) - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                    byte b8 = (byte) ($$a[14] + 1);
                                    java.lang.Object[] objArr62 = new java.lang.Object[1];
                                    b(b8, b8, (short) (b8 | 653), objArr62);
                                    obj15 = cls15.getMethod((java.lang.String) objArr62[0], java.lang.String.class, java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj15);
                                }
                                long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj15).invoke(null, objArr61)).longValue();
                                long j19 = ~longValue5;
                                long j20 = ~(930406983 | j19 | j12);
                                long j21 = ((((((-475) * longValue5) + 443804130891L) + (((~(longValue5 | (-930406984))) | j20) * (-476))) + (j20 * 952)) + ((~((j19 | j) | 930406983)) * 476)) - 1665781585;
                                if (((((int) (j21 >> 32)) & ((((((~((-2083071392) | i31)) | 645844980) | (~(2083071391 | i))) * (-564)) - 1347199046) + ((~(2122313727 | i)) * 1128) + (((~(645844980 | i31)) | 39242336) * 564))) | (((int) j21) & (((((-1999441734) | i) * (-50)) - 671060381) + (((~((-8564891) | i)) | (~((-553650434) | i31))) * 50) + (((~((-1999441734) | i31)) | (~((-562215324) | i31)) | 553650433) * 50)))) != 0) {
                                    int i47 = values + 51;
                                    getProfileVersion = i47 % 128;
                                    i11 = i47 % 2 == 0 ? i ^ 17924 : i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                    i10 = i31;
                                    j2 = j12;
                                } else {
                                    java.lang.Object[] objArr63 = new java.lang.Object[1];
                                    a((android.os.Process.myTid() >> 22) + 343, (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 44223), android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 14, objArr63);
                                    java.lang.String intern15 = ((java.lang.String) objArr63[0]).intern();
                                    java.lang.Object[] objArr64 = new java.lang.Object[1];
                                    a(356 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 18493), 9 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr64);
                                    java.lang.Object[] objArr65 = {intern15, ((java.lang.String) objArr64[0]).intern()};
                                    java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                    if (obj16 == null) {
                                        java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2213 - android.graphics.Color.argb(0, 0, 0, 0), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1));
                                        byte b9 = (byte) ($$a[14] + 1);
                                        java.lang.Object[] objArr66 = new java.lang.Object[1];
                                        b(b9, b9, (short) (b9 | 653), objArr66);
                                        obj16 = cls16.getMethod((java.lang.String) objArr66[0], java.lang.String.class, java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj16);
                                    }
                                    long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj16).invoke(null, objArr65)).longValue();
                                    long j22 = j | (-1009091265);
                                    long j23 = ~longValue6;
                                    long j24 = j23 | j;
                                    i10 = i31;
                                    j2 = j12;
                                    long j25 = ((((((-183) * longValue6) - 184663701312L) + (((~(j22 | longValue6)) | (~(j24 | 1009091264))) * (-184))) + ((((~((-1009091265) | j23)) | (~j22)) | (~j24)) * 184)) + ((1009091264 | longValue6) * 184)) - 1744465866;
                                    int i48 = ~((-772817370) | i);
                                    int i49 = ~((-253730811) | i);
                                    i11 = ((((int) j25) & ((((((~(i10 | 1690957220)) | i49) * 1150) + 334239082) + ((i49 | (~(i10 | 253730810))) * (-575))) + (((~(1690957220 | i)) | (~(i10 | (-1690957221)))) * 575))) | (((int) (j25 >> 32)) & ((((((~(i10 | (-664409042))) | i48) * 1150) + (-334238508)) + ((i48 | (~(i10 | 772817369))) * (-575))) + (((~((-664409042) | i)) | (~(i10 | 664409041))) * 575)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE : i;
                                }
                                if (i11 != i) {
                                    java.lang.Object[] objArr67 = {new int[]{i}, new int[]{i11}, null, null, new int[1]};
                                    java.lang.Object[] objArr68 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((~((-1649144040) | i)) | 401702058) * (-366)) - 1278446291) + (((~(i | (-1611300934))) | 363858952) * 366))};
                                    java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj17 == null) {
                                        java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 50, android.os.Process.getGidForName(str7) + 2714, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                        int i50 = $$a[14] + 1;
                                        java.lang.Object[] objArr69 = new java.lang.Object[1];
                                        b((byte) i50, r2[16], (short) i50, objArr69);
                                        obj17 = cls17.getMethod((java.lang.String) objArr69[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj17);
                                    }
                                    ((int[]) objArr67[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj17).invoke(null, objArr68)).intValue();
                                    return objArr67;
                                }
                                java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1102036426);
                                if (obj18 == null) {
                                    java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 2763, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                    byte b10 = (byte) ($$a[14] + 1);
                                    java.lang.Object[] objArr70 = new java.lang.Object[1];
                                    b(b10, b10, (short) (b10 | 653), objArr70);
                                    obj18 = cls18.getMethod((java.lang.String) objArr70[0], null);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1102036426, obj18);
                                }
                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj18).invoke(null, null)).longValue();
                                long j26 = ~longValue7;
                                long j27 = ~(j2 | (-348959061));
                                long j28 = (521 * longValue7) + 181109752659L + (((~(longValue7 | j2)) | (~(348959060 | j26 | j))) * 520) + (((~(j26 | j)) | j27) * (-1040)) + (((~(j | 348959060)) | (~(j26 | (-348959061))) | j27) * 520) + 473995824;
                                if (((((int) (j28 >> 32)) & (((~(i10 | (-65541))) * 130) + 163983138 + (((~((-65541) | i)) | 1099989568) * 130))) | (((int) j28) & (((((~((-524906405) | i)) | (-1807395563)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) - 502275175) + (((~(i10 | (-524906405))) | (-1807395563)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE)))) == 1) {
                                    java.lang.Object[] objArr71 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                    java.lang.Object[] objArr72 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((i10 | (-16908353)) * 494) + 1505911811 + (((~(i10 | 2025192239)) | (-2033355086)) * 494))};
                                    java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj19 == null) {
                                        java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf(str7, str7, 0, 0), 2713 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                                        int i51 = $$a[14] + 1;
                                        java.lang.Object[] objArr73 = new java.lang.Object[1];
                                        b((byte) i51, r4[16], (short) i51, objArr73);
                                        obj19 = cls19.getMethod((java.lang.String) objArr73[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj19);
                                    }
                                    ((int[]) objArr71[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(null, objArr72)).intValue();
                                    return objArr71;
                                }
                                java.lang.Object[] objArr74 = {1};
                                java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                if (obj20 == null) {
                                    java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.text.TextUtils.getOffsetBefore(str7, 0), 2364 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) android.graphics.Color.blue(0));
                                    byte b11 = (byte) ($$a[14] + 1);
                                    java.lang.Object[] objArr75 = new java.lang.Object[1];
                                    b(b11, b11, (short) (b11 | 653), objArr75);
                                    obj20 = cls20.getMethod((java.lang.String) objArr75[0], java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj20);
                                }
                                long j29 = ~((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, objArr74)).longValue();
                                long j30 = ~((-951392) | j29);
                                long j31 = ((r2 * (-463)) - 442397280) + (((~(j29 | j)) | j30 | (~(j | (-951392)))) * 464) + ((j29 | j2 | 951391) * (-464)) + (((~(j2 | (-951392))) | j30) * 464) + 1408861591;
                                if (((((int) j31) & (((((-1440544953) | i) * 140) - 1346969515) + (((~(i10 | (-1440544953))) | 1089544) * (-280)) + (((~(i10 | 3318542)) | (-1442773951) | (~((-1089545) | i))) * 140))) | (((int) (j31 >> 32)) & ((((287314442 | r7) * (-476)) - 856120126) + ((~((-1149321249) | i)) * 952) + ((~(i10 | (-1149321249))) * 476)))) != 0) {
                                    i12 = 1;
                                    values = (getProfileVersion + 1) % 128;
                                    i13 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
                                } else {
                                    i12 = 1;
                                    i13 = i;
                                }
                                if (i13 != i) {
                                    int[] iArr = new int[i12];
                                    int[] iArr2 = new int[i12];
                                    iArr[0] = i;
                                    iArr2[0] = i13;
                                    java.lang.Object[] objArr76 = {iArr, iArr2, null, null, new int[i12]};
                                    java.lang.Object[] objArr77 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((~(i10 | 1979538687)) * 52) + 1594829901 + (((~(i10 | 616830195)) | (~(i10 | (-1434015903))) | 1362708492) * (-52)) + (((~(i10 | (-616830196))) | 545522785) * 52))};
                                    java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj21 == null) {
                                        java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2713, (char) android.text.TextUtils.getTrimmedLength(str7));
                                        int i52 = $$a[14] + 1;
                                        java.lang.Object[] objArr78 = new java.lang.Object[1];
                                        b((byte) i52, r4[16], (short) i52, objArr78);
                                        obj21 = cls21.getMethod((java.lang.String) objArr78[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj21);
                                    }
                                    ((int[]) objArr76[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr77)).intValue();
                                    return objArr76;
                                }
                                java.lang.Object[] objArr79 = new java.lang.Object[1];
                                a(310 - (android.os.Process.myPid() >> 22), (char) (40695 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), android.graphics.ImageFormat.getBitsPerPixel(0) + 24, objArr79);
                                java.lang.Object[] objArr80 = {((java.lang.String) objArr79[0]).intern()};
                                java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj22 == null) {
                                    java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1921 - android.view.View.resolveSize(0, 0), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1));
                                    byte b12 = (byte) ($$a[14] + 1);
                                    java.lang.Object[] objArr81 = new java.lang.Object[1];
                                    b(b12, b12, (short) (b12 | 653), objArr81);
                                    obj22 = cls22.getMethod((java.lang.String) objArr81[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj22);
                                }
                                java.lang.Object invoke = ((java.lang.reflect.Method) obj22).invoke(null, objArr80);
                                if (invoke != null) {
                                    java.lang.Object[] objArr82 = {invoke, 42};
                                    java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                    if (obj23 == null) {
                                        java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 29, 2594 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.graphics.Color.argb(0, 0, 0, 0));
                                        byte b13 = (byte) ($$a[14] + 1);
                                        java.lang.Object[] objArr83 = new java.lang.Object[1];
                                        b(b13, b13, (short) (b13 | 653), objArr83);
                                        obj23 = cls23.getMethod((java.lang.String) objArr83[0], java.lang.String.class, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj23);
                                    }
                                    long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj23).invoke(null, objArr82)).longValue();
                                    long j32 = ~longValue8;
                                    long j33 = (-631111724) | j32;
                                    long j34 = j32 | j;
                                    long j35 = (193 * longValue8) + 121804562539L + ((j | (~(longValue8 | (-631111724)))) * (-192)) + (((~j33) | (~j34)) * (-384)) + (((~(j33 | j2)) | (~(631111723 | j34)) | (~(631111723 | longValue8 | j2))) * 192) + 625988801;
                                }
                                java.lang.Object[] objArr84 = new java.lang.Object[1];
                                a(android.graphics.Color.argb(0, 0, 0, 0) + 310, (char) (40695 - android.widget.ExpandableListView.getPackedPositionType(0L)), android.text.TextUtils.getCapsMode(str7, 0, 0) + 23, objArr84);
                                java.lang.String intern16 = ((java.lang.String) objArr84[0]).intern();
                                java.lang.Object[] objArr85 = new java.lang.Object[1];
                                a(366 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 48806), 10 - android.graphics.Color.argb(0, 0, 0, 0), objArr85);
                                java.lang.String intern17 = ((java.lang.String) objArr85[0]).intern();
                                java.lang.Object[] objArr86 = new java.lang.Object[1];
                                a(376 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionType(0L), 7 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr86);
                                java.lang.String intern18 = ((java.lang.String) objArr86[0]).intern();
                                java.lang.Object[] objArr87 = new java.lang.Object[1];
                                a(android.graphics.Color.blue(0) + 382, (char) (54734 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), android.view.View.MeasureSpec.getMode(0) + 8, objArr87);
                                java.lang.String[] strArr7 = {intern16, intern17, intern18, ((java.lang.String) objArr87[0]).intern()};
                                java.lang.Object[] objArr88 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getTouchSlop() >> 8) + 390, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9871), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 16, objArr88);
                                java.lang.String intern19 = ((java.lang.String) objArr88[0]).intern();
                                java.lang.Object[] objArr89 = new java.lang.Object[1];
                                a(407 - android.graphics.Color.blue(0), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 7 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr89);
                                java.lang.String intern20 = ((java.lang.String) objArr89[0]).intern();
                                java.lang.Object[] objArr90 = new java.lang.Object[1];
                                a(414 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 8 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr90);
                                java.lang.String intern21 = ((java.lang.String) objArr90[0]).intern();
                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                a(android.view.View.combineMeasuredStates(0, 0) + 421, (char) android.graphics.Color.red(0), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10, objArr91);
                                java.lang.String intern22 = ((java.lang.String) objArr91[0]).intern();
                                java.lang.Object[] objArr92 = new java.lang.Object[1];
                                a(432 - (android.os.Process.myPid() >> 22), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 13 - android.view.MotionEvent.axisFromString(str7), objArr92);
                                java.lang.String[] strArr8 = {intern19, intern20, intern21, intern22, ((java.lang.String) objArr92[0]).intern()};
                                java.lang.Object[] objArr93 = new java.lang.Object[1];
                                a(446 - android.view.View.getDefaultSize(0, 0), (char) (463 - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), android.view.KeyEvent.normalizeMetaState(0) + 16, objArr93);
                                java.lang.String intern23 = ((java.lang.String) objArr93[0]).intern();
                                java.lang.Object[] objArr94 = new java.lang.Object[1];
                                a((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 462, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), android.text.TextUtils.indexOf(str7, str7, 0, 0) + 3, objArr94);
                                java.lang.String intern24 = ((java.lang.String) objArr94[0]).intern();
                                java.lang.Object[] objArr95 = new java.lang.Object[1];
                                a(android.graphics.Color.red(0) + 473, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 53153), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 21, objArr95);
                                java.lang.String intern25 = ((java.lang.String) objArr95[0]).intern();
                                java.lang.Object[] objArr96 = new java.lang.Object[1];
                                a(495 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), 25 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr96);
                                java.lang.String intern26 = ((java.lang.String) objArr96[0]).intern();
                                java.lang.Object[] objArr97 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE, (char) android.widget.ExpandableListView.getPackedPositionType(0L), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29, objArr97);
                                java.lang.String[] strArr9 = {intern23, intern24, str, intern25, intern26, ((java.lang.String) objArr97[0]).intern()};
                                java.lang.Object[] objArr98 = new java.lang.Object[1];
                                a(548 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 59328), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 11, objArr98);
                                java.lang.String intern27 = ((java.lang.String) objArr98[0]).intern();
                                java.lang.Object[] objArr99 = new java.lang.Object[1];
                                a(559 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 9, objArr99);
                                java.lang.String intern28 = ((java.lang.String) objArr99[0]).intern();
                                java.lang.Object[] objArr100 = new java.lang.Object[1];
                                a(android.view.View.resolveSize(0, 0) + 567, (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 26992), 6 - android.view.View.resolveSize(0, 0), objArr100);
                                java.lang.String intern29 = ((java.lang.String) objArr100[0]).intern();
                                java.lang.Object[] objArr101 = new java.lang.Object[1];
                                a(android.widget.ExpandableListView.getPackedPositionChild(0L) + 574, (char) android.view.View.resolveSizeAndState(0, 0, 0), android.view.View.getDefaultSize(0, 0) + 6, objArr101);
                                java.lang.String[] strArr10 = {intern27, intern28, intern29, ((java.lang.String) objArr101[0]).intern()};
                                java.lang.Object[] objArr102 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 579, (char) (android.view.KeyEvent.normalizeMetaState(0) + 41341), 15 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr102);
                                java.lang.String intern30 = ((java.lang.String) objArr102[0]).intern();
                                java.lang.Object[] objArr103 = new java.lang.Object[1];
                                a(android.view.View.resolveSize(0, 0) + 414, (char) (android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), 7 - android.text.TextUtils.getOffsetBefore(str7, 0), objArr103);
                                java.lang.String intern31 = ((java.lang.String) objArr103[0]).intern();
                                java.lang.Object[] objArr104 = new java.lang.Object[1];
                                a(382 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 54733), (-16777208) - android.graphics.Color.rgb(0, 0, 0), objArr104);
                                java.lang.String[] strArr11 = {intern30, intern31, ((java.lang.String) objArr104[0]).intern()};
                                java.lang.Object[] objArr105 = new java.lang.Object[1];
                                a(594 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (android.view.View.getDefaultSize(0, 0) + 49938), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, objArr105);
                                java.lang.String intern32 = ((java.lang.String) objArr105[0]).intern();
                                java.lang.Object[] objArr106 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_POLAR_RELATIVETO, (char) (3210 - android.text.TextUtils.getCapsMode(str7, 0, 0)), android.view.KeyEvent.normalizeMetaState(0) + 1, objArr106);
                                java.lang.String[] strArr12 = {intern32, ((java.lang.String) objArr106[0]).intern()};
                                java.lang.Object[] objArr107 = new java.lang.Object[1];
                                a(android.graphics.Color.argb(0, 0, 0, 0) + androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, (char) (2898 - android.text.TextUtils.indexOf(str7, str7, 0, 0)), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 9, objArr107);
                                java.lang.String intern33 = ((java.lang.String) objArr107[0]).intern();
                                java.lang.Object[] objArr108 = new java.lang.Object[1];
                                a(618 - android.os.Process.getGidForName(str7), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), 1 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr108);
                                java.lang.String[] strArr13 = {intern33, ((java.lang.String) objArr108[0]).intern()};
                                java.lang.Object[] objArr109 = new java.lang.Object[1];
                                a(android.text.TextUtils.indexOf(str7, str7) + 620, (char) (54399 - android.view.View.resolveSize(0, 0)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 15, objArr109);
                                java.lang.String intern34 = ((java.lang.String) objArr109[0]).intern();
                                java.lang.Object[] objArr110 = new java.lang.Object[1];
                                a(android.graphics.Color.blue(0) + 462, (char) android.graphics.Color.blue(0), 3 - android.graphics.Color.argb(0, 0, 0, 0), objArr110);
                                java.lang.String intern35 = ((java.lang.String) objArr110[0]).intern();
                                java.lang.Object[] objArr111 = new java.lang.Object[1];
                                a(407 - android.text.TextUtils.getTrimmedLength(str7), (char) android.text.TextUtils.getOffsetAfter(str7, 0), android.text.TextUtils.getOffsetAfter(str7, 0) + 7, objArr111);
                                java.lang.String intern36 = ((java.lang.String) objArr111[0]).intern();
                                java.lang.Object[] objArr112 = new java.lang.Object[1];
                                a(636 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), 7 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr112);
                                java.lang.String intern37 = ((java.lang.String) objArr112[0]).intern();
                                java.lang.Object[] objArr113 = new java.lang.Object[1];
                                a(android.graphics.Color.red(0) + 421, (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.view.KeyEvent.keyCodeFromString(str7) + 11, objArr113);
                                java.lang.String intern38 = ((java.lang.String) objArr113[0]).intern();
                                java.lang.Object[] objArr114 = new java.lang.Object[1];
                                a((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 431, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 15 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr114);
                                java.lang.String[] strArr14 = {intern34, intern35, intern36, intern37, intern38, ((java.lang.String) objArr114[0]).intern()};
                                java.lang.Object[] objArr115 = new java.lang.Object[1];
                                a(644 - android.view.View.MeasureSpec.getSize(0), (char) (56785 - android.text.TextUtils.getOffsetAfter(str7, 0)), android.view.View.combineMeasuredStates(0, 0) + 20, objArr115);
                                java.lang.String intern39 = ((java.lang.String) objArr115[0]).intern();
                                java.lang.Object[] objArr116 = new java.lang.Object[1];
                                a((android.view.KeyEvent.getMaxKeyCode() >> 16) + 664, (char) (33632 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), 19 - android.graphics.Color.argb(0, 0, 0, 0), objArr116);
                                java.lang.String intern40 = ((java.lang.String) objArr116[0]).intern();
                                java.lang.Object[] objArr117 = new java.lang.Object[1];
                                a(682 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (32007 - android.view.View.resolveSizeAndState(0, 0, 0)), 31 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr117);
                                java.lang.String intern41 = ((java.lang.String) objArr117[0]).intern();
                                java.lang.Object[] objArr118 = new java.lang.Object[1];
                                a(714 - android.view.View.MeasureSpec.getMode(0), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 26 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr118);
                                java.lang.String intern42 = ((java.lang.String) objArr118[0]).intern();
                                java.lang.Object[] objArr119 = new java.lang.Object[1];
                                a(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 692, (char) android.view.KeyEvent.keyCodeFromString(str7), 23 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr119);
                                java.lang.String intern43 = ((java.lang.String) objArr119[0]).intern();
                                java.lang.Object[] objArr120 = new java.lang.Object[1];
                                a(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 763, (char) android.view.Gravity.getAbsoluteGravity(0, 0), 33 - android.view.View.getDefaultSize(0, 0), objArr120);
                                java.lang.String[] strArr15 = {intern39, intern40, intern41, intern42, intern43, ((java.lang.String) objArr120[0]).intern(), str};
                                java.lang.Object[] objArr121 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 796, (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 46526), 13 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr121);
                                java.lang.String intern44 = ((java.lang.String) objArr121[0]).intern();
                                java.lang.Object[] objArr122 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 375, (char) android.view.KeyEvent.getDeadChar(0, 0), 7 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr122);
                                java.lang.String[] strArr16 = {intern44, ((java.lang.String) objArr122[0]).intern()};
                                java.lang.Object[] objArr123 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 809, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), 30 - (android.os.Process.myPid() >> 22), objArr123);
                                java.lang.String intern45 = ((java.lang.String) objArr123[0]).intern();
                                java.lang.Object[] objArr124 = new java.lang.Object[1];
                                a(840 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 17177), 11 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr124);
                                java.lang.String[] strArr17 = {intern45, ((java.lang.String) objArr124[0]).intern()};
                                java.lang.Object[] objArr125 = new java.lang.Object[1];
                                a(849 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.text.TextUtils.indexOf(str7, str7, 0, 0) + 19, objArr125);
                                java.lang.String intern46 = ((java.lang.String) objArr125[0]).intern();
                                java.lang.Object[] objArr126 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 869, (char) android.graphics.Color.blue(0), 4 - android.os.Process.getGidForName(str7), objArr126);
                                java.lang.String[] strArr18 = {intern46, ((java.lang.String) objArr126[0]).intern()};
                                java.lang.Object[] objArr127 = new java.lang.Object[1];
                                a(874 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (49896 - android.view.KeyEvent.getDeadChar(0, 0)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 19, objArr127);
                                java.lang.String[] strArr19 = {((java.lang.String) objArr127[0]).intern()};
                                java.lang.Object[] objArr128 = new java.lang.Object[1];
                                a(android.text.TextUtils.indexOf(str7, str7) + 893, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.view.MotionEvent.axisFromString(str7) + 17, objArr128);
                                java.lang.String[] strArr20 = {((java.lang.String) objArr128[0]).intern()};
                                java.lang.Object[] objArr129 = new java.lang.Object[1];
                                a((android.os.Process.myTid() >> 22) + 909, (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 12202), 19 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr129);
                                java.lang.String[] strArr21 = {((java.lang.String) objArr129[0]).intern()};
                                java.lang.Object[] objArr130 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + com.google.zxing.pdf417.PDF417Common.MAX_CODEWORDS_IN_BARCODE, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 19 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr130);
                                java.lang.String[] strArr22 = {((java.lang.String) objArr130[0]).intern()};
                                java.lang.Object[] objArr131 = new java.lang.Object[1];
                                a((-16776269) - android.graphics.Color.rgb(0, 0, 0), (char) (android.graphics.Color.rgb(0, 0, 0) + 16794234), android.graphics.Color.blue(0) + 23, objArr131);
                                java.lang.String[] strArr23 = {((java.lang.String) objArr131[0]).intern()};
                                java.lang.Object[] objArr132 = new java.lang.Object[1];
                                a((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 970, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf(str7, str7, 0, 0) + 21, objArr132);
                                java.lang.String[] strArr24 = {((java.lang.String) objArr132[0]).intern()};
                                java.lang.Object[] objArr133 = new java.lang.Object[1];
                                a(991 - android.text.TextUtils.indexOf(str7, str7, 0), (char) android.text.TextUtils.indexOf(str7, str7, 0, 0), 25 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr133);
                                java.lang.String str9 = str;
                                java.lang.String[] strArr25 = {((java.lang.String) objArr133[0]).intern(), str9};
                                java.lang.Object[] objArr134 = new java.lang.Object[1];
                                a(1015 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 39942), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 28, objArr134);
                                java.lang.String[] strArr26 = {((java.lang.String) objArr134[0]).intern(), str9};
                                java.lang.Object[] objArr135 = new java.lang.Object[1];
                                a(1043 - android.graphics.Color.green(0), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), android.widget.ExpandableListView.getPackedPositionChild(0L) + 28, objArr135);
                                char c2 = 0;
                                java.lang.String[] strArr27 = {((java.lang.String) objArr135[0]).intern(), str9};
                                java.lang.Object[] objArr136 = new java.lang.Object[1];
                                a(1070 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 12040), 31 - android.view.View.getDefaultSize(0, 0), objArr136);
                                java.lang.String[] strArr28 = {((java.lang.String) objArr136[0]).intern(), str9};
                                java.lang.Object[] objArr137 = new java.lang.Object[1];
                                a(android.view.KeyEvent.normalizeMetaState(0) + 1101, (char) (38398 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), android.view.Gravity.getAbsoluteGravity(0, 0) + 27, objArr137);
                                java.lang.String[] strArr29 = {((java.lang.String) objArr137[0]).intern(), str9};
                                java.lang.Object[] objArr138 = new java.lang.Object[1];
                                a(android.view.View.MeasureSpec.getSize(0) + 1128, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 32 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr138);
                                java.lang.String[][] strArr30 = {strArr7, strArr8, strArr9, strArr10, strArr11, strArr12, strArr13, strArr14, strArr15, strArr16, strArr17, strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, new java.lang.String[]{((java.lang.String) objArr138[0]).intern(), str9}};
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                int i53 = i;
                                int i54 = 0;
                                int i55 = 0;
                                while (i54 < 24) {
                                    java.lang.String[] strArr31 = strArr30[i54];
                                    java.lang.Object[] objArr139 = {strArr31[c2]};
                                    java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj24 == null) {
                                        java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1921, (char) android.text.TextUtils.indexOf(str7, str7));
                                        byte b14 = (byte) ($$a[14] + 1);
                                        java.lang.Object[] objArr140 = new java.lang.Object[1];
                                        b(b14, b14, (short) (b14 | 653), objArr140);
                                        obj24 = cls24.getMethod((java.lang.String) objArr140[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj24);
                                    }
                                    java.lang.String str10 = (java.lang.String) ((java.lang.reflect.Method) obj24).invoke(null, objArr139);
                                    java.lang.String[] strArr32 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr31, 1, strArr31.length);
                                    if (str10 == null || str10.length() == 0) {
                                        strArr = strArr30;
                                        i14 = i53;
                                    } else {
                                        if (strArr31.length != 1) {
                                            java.lang.Object[] objArr141 = {str10, strArr32};
                                            java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                            if (obj25 == null) {
                                                java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 43, android.graphics.Color.red(0) + 2880, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1));
                                                byte b15 = (byte) ($$a[14] + 1);
                                                java.lang.Object[] objArr142 = new java.lang.Object[1];
                                                b(b15, b15, (short) (b15 | 653), objArr142);
                                                obj25 = cls25.getMethod((java.lang.String) objArr142[0], java.lang.String.class, java.lang.String[].class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj25);
                                            }
                                            long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj25).invoke(null, objArr141)).longValue();
                                            long j36 = ~longValue9;
                                            i14 = i53;
                                            strArr = strArr30;
                                            long j37 = (-833636291) + ((-167) * longValue9) + 199577606496L + (((~(j36 | 1195075487)) | (~(j36 | j2))) * 336) + (((~((-1195075488) | longValue9)) | (~(j2 | (-1195075488)))) * (-168)) + (((~(j | (-1195075488))) | j36) * 168);
                                        } else {
                                            strArr = strArr30;
                                        }
                                        i55++;
                                        i53 = i ^ (i54 + 10);
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                        sb.append(str10);
                                        java.lang.Object[] objArr143 = new java.lang.Object[1];
                                        a(1160 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (android.text.TextUtils.getOffsetAfter(str7, 0) + 44900), 1 - android.view.View.MeasureSpec.getMode(0), objArr143);
                                        sb.append(((java.lang.String) objArr143[0]).intern());
                                        sb.append(str10);
                                        arrayList.add(sb.toString());
                                        i54++;
                                        strArr30 = strArr;
                                        c2 = 0;
                                    }
                                    i53 = i14;
                                    i54++;
                                    strArr30 = strArr;
                                    c2 = 0;
                                }
                                int i56 = i53;
                                if (i55 > 2) {
                                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i56}, arrayList, null, new int[1]};
                                    java.lang.Object[] objArr144 = {num, num, java.lang.Integer.valueOf((((((~((-1791396079) | i)) | (~(i10 | 259450019))) | r2) * (-516)) - 2033937219) + (((~((-172392611) | i)) | (~(i10 | (-87057410)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + (((~(i10 | 1791396078)) | 87057409) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))};
                                    java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj26 == null) {
                                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.os.Process.getGidForName(str7) + 2714, (char) android.graphics.Color.green(0));
                                        int i57 = $$a[14] + 1;
                                        java.lang.Object[] objArr145 = new java.lang.Object[1];
                                        b((byte) i57, r5[16], (short) i57, objArr145);
                                        obj26 = cls26.getMethod((java.lang.String) objArr145[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj26);
                                    }
                                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj26).invoke(null, objArr144)).intValue();
                                    c = 0;
                                    ((int[]) objArr[4])[0] = intValue;
                                } else {
                                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, null, new int[1]};
                                    int i58 = ~((-869038379) | i);
                                    java.lang.Object[] objArr146 = {num, num, java.lang.Integer.valueOf(((831260936 | i58) * (-280)) + 1212811317 + ((i58 | (~((-1181807720) | i))) * 140) + (((~((-37777443) | i)) | (~(i10 | (-831260937))) | (~(i10 | (-1144030278)))) * 140))};
                                    java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj27 == null) {
                                        java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2713 - android.graphics.Color.alpha(0), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                        int i59 = $$a[14] + 1;
                                        java.lang.Object[] objArr147 = new java.lang.Object[1];
                                        b((byte) i59, r5[16], (short) i59, objArr147);
                                        obj27 = cls27.getMethod((java.lang.String) objArr147[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj27);
                                    }
                                    c = 0;
                                    ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj27).invoke(null, objArr146)).intValue();
                                }
                                int i60 = ((int[]) objArr[1])[c];
                                if (i60 != i) {
                                    values = (getProfileVersion + 59) % 128;
                                    java.lang.Object[] objArr148 = {new int[]{i}, new int[]{i60}, (java.util.List) objArr[2], null, new int[1]};
                                    java.lang.Object[] objArr149 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~(i10 | (-1342734738))) * 130) - 1333816849) + (((~(i | (-1342734738))) | 632555520) * 130))};
                                    java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj28 == null) {
                                        java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter(str7, 0) + 50, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2713, (char) android.text.TextUtils.getTrimmedLength(str7));
                                        int i61 = $$a[14] + 1;
                                        java.lang.Object[] objArr150 = new java.lang.Object[1];
                                        b((byte) i61, r2[16], (short) i61, objArr150);
                                        obj28 = cls28.getMethod((java.lang.String) objArr150[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj28);
                                    }
                                    ((int[]) objArr148[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr149)).intValue();
                                    return objArr148;
                                }
                                java.lang.Object[] objArr151 = new java.lang.Object[1];
                                a(446 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (465 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), 16 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr151);
                                java.lang.Object[] objArr152 = {((java.lang.String) objArr151[0]).intern()};
                                java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj29 == null) {
                                    java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 40, 1921 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) android.view.KeyEvent.normalizeMetaState(0));
                                    byte b16 = (byte) ($$a[14] + 1);
                                    java.lang.Object[] objArr153 = new java.lang.Object[1];
                                    b(b16, b16, (short) (b16 | 653), objArr153);
                                    obj29 = cls29.getMethod((java.lang.String) objArr153[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj29);
                                }
                                java.lang.Object invoke2 = ((java.lang.reflect.Method) obj29).invoke(null, objArr152);
                                if (invoke2 == null) {
                                    i15 = 0;
                                } else {
                                    java.lang.Object[] objArr154 = {invoke2, 42};
                                    java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                    if (obj30 == null) {
                                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 28, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2595, (char) (android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                        byte b17 = (byte) ($$a[14] + 1);
                                        java.lang.Object[] objArr155 = new java.lang.Object[1];
                                        b(b17, b17, (short) (b17 | 653), objArr155);
                                        obj30 = cls30.getMethod((java.lang.String) objArr155[0], java.lang.String.class, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj30);
                                    }
                                    long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj30).invoke(null, objArr154)).longValue();
                                    long j38 = ~longValue10;
                                    long j39 = 862964011 | longValue10;
                                    long j40 = (longValue10 * (-751)) + 648085973012L + (((~(862964011 | j38)) | (~(j2 | 862964011))) * 1504) + ((~(j39 | j2)) * (-1504)) + (((~(j38 | (-862964012))) | (~j39)) * 752) + 2120064536;
                                    i15 = (((int) j40) & ((((~((-136666711) | i)) | 2116182) * 345) + 484646344 + (((~(i10 | (-136666711))) | (-1576009303)) * 345) + ((~((-2116183) | i)) * 345))) | (((int) (j40 >> 32)) & ((((~(i10 | 910989857)) | (~(1946751027 | i))) * 1900) + 1871737038 + (((~(i10 | (-1946751028))) | (~((-910989858) | i))) * (-950)) + (((~((-1946751028) | i)) | (~(i10 | (-910989858)))) * 950)));
                                }
                                if (i15 != 1986687685 && i15 != -1514516938) {
                                    java.lang.Object[] objArr156 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1161, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), android.view.View.getDefaultSize(0, 0) + 14, objArr156);
                                    java.lang.String intern47 = ((java.lang.String) objArr156[0]).intern();
                                    java.lang.Object[] objArr157 = new java.lang.Object[1];
                                    a(android.view.Gravity.getAbsoluteGravity(0, 0) + 1175, (char) (60325 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 26 - (android.os.Process.myPid() >> 22), objArr157);
                                    java.lang.String intern48 = ((java.lang.String) objArr157[0]).intern();
                                    java.lang.Object[] objArr158 = new java.lang.Object[1];
                                    a(1202 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (48780 - android.view.KeyEvent.normalizeMetaState(0)), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16, objArr158);
                                    java.lang.String intern49 = ((java.lang.String) objArr158[0]).intern();
                                    java.lang.Object[] objArr159 = new java.lang.Object[1];
                                    a(android.graphics.Color.rgb(0, 0, 0) + 16778434, (char) (android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), android.view.KeyEvent.getDeadChar(0, 0) + 17, objArr159);
                                    java.lang.String intern50 = ((java.lang.String) objArr159[0]).intern();
                                    java.lang.Object[] objArr160 = new java.lang.Object[1];
                                    a(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1235, (char) (64709 - android.widget.ExpandableListView.getPackedPositionType(0L)), 15 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr160);
                                    java.lang.String intern51 = ((java.lang.String) objArr160[0]).intern();
                                    java.lang.Object[] objArr161 = new java.lang.Object[1];
                                    a(1249 - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 37 - android.text.TextUtils.indexOf(str7, str7, 0, 0), objArr161);
                                    java.lang.String intern52 = ((java.lang.String) objArr161[0]).intern();
                                    java.lang.Object[] objArr162 = new java.lang.Object[1];
                                    a(android.view.Gravity.getAbsoluteGravity(0, 0) + 1287, (char) (android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 38262), android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 13, objArr162);
                                    java.lang.String intern53 = ((java.lang.String) objArr162[0]).intern();
                                    java.lang.Object[] objArr163 = new java.lang.Object[1];
                                    a(1299 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.widget.ExpandableListView.getPackedPositionChild(0L) + 14, objArr163);
                                    java.lang.String intern54 = ((java.lang.String) objArr163[0]).intern();
                                    java.lang.Object[] objArr164 = new java.lang.Object[1];
                                    a(android.text.TextUtils.getOffsetAfter(str7, 0) + 1312, (char) (android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 45673), 22 - android.view.View.MeasureSpec.getMode(0), objArr164);
                                    java.lang.String intern55 = ((java.lang.String) objArr164[0]).intern();
                                    java.lang.Object[] objArr165 = new java.lang.Object[1];
                                    a(1334 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((-1) - android.view.MotionEvent.axisFromString(str7)), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 30, objArr165);
                                    java.lang.String intern56 = ((java.lang.String) objArr165[0]).intern();
                                    java.lang.Object[] objArr166 = new java.lang.Object[1];
                                    a(1365 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) android.text.TextUtils.indexOf(str7, str7), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, objArr166);
                                    java.lang.String intern57 = ((java.lang.String) objArr166[0]).intern();
                                    java.lang.Object[] objArr167 = new java.lang.Object[1];
                                    a(1377 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 12, objArr167);
                                    java.lang.String intern58 = ((java.lang.String) objArr167[0]).intern();
                                    java.lang.Object[] objArr168 = new java.lang.Object[1];
                                    a(1389 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30847), 12 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr168);
                                    java.lang.String intern59 = ((java.lang.String) objArr168[0]).intern();
                                    java.lang.Object[] objArr169 = new java.lang.Object[1];
                                    a(1401 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), 12 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr169);
                                    java.lang.String intern60 = ((java.lang.String) objArr169[0]).intern();
                                    java.lang.Object[] objArr170 = new java.lang.Object[1];
                                    a(1413 - android.text.TextUtils.getTrimmedLength(str7), (char) (android.os.Process.getGidForName(str7) + 1), android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 13, objArr170);
                                    java.lang.String intern61 = ((java.lang.String) objArr170[0]).intern();
                                    java.lang.Object[] objArr171 = new java.lang.Object[1];
                                    a(1424 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.graphics.Color.alpha(0) + 14, objArr171);
                                    java.lang.String intern62 = ((java.lang.String) objArr171[0]).intern();
                                    java.lang.Object[] objArr172 = new java.lang.Object[1];
                                    a(1439 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), 12 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr172);
                                    java.lang.String intern63 = ((java.lang.String) objArr172[0]).intern();
                                    java.lang.Object[] objArr173 = new java.lang.Object[1];
                                    a(android.text.TextUtils.indexOf(str7, str7, 0, 0) + 1451, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), 25 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr173);
                                    java.lang.String intern64 = ((java.lang.String) objArr173[0]).intern();
                                    java.lang.Object[] objArr174 = new java.lang.Object[1];
                                    a(android.view.View.resolveSizeAndState(0, 0, 0) + 1475, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 29 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr174);
                                    java.lang.String[] strArr33 = {intern47, intern48, intern49, intern50, intern51, intern52, intern53, intern54, intern55, intern56, intern57, intern58, intern59, intern60, intern61, intern62, intern63, intern64, ((java.lang.String) objArr174[0]).intern()};
                                    int i62 = 0;
                                    while (true) {
                                        if (i62 >= 19) {
                                            i62 = -1;
                                            break;
                                        }
                                        java.lang.String str11 = strArr33[i62];
                                        java.lang.Object[] objArr175 = {str11};
                                        java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                        if (obj31 == null) {
                                            java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '\f', android.text.TextUtils.indexOf(str7, str7, 0) + 3161, (char) (33099 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
                                            byte b18 = (byte) (-$$a[14]);
                                            byte b19 = (byte) (b18 - 1);
                                            java.lang.Object[] objArr176 = new java.lang.Object[1];
                                            b(b18, b19, (short) (b19 | 35), objArr176);
                                            obj31 = cls31.getMethod((java.lang.String) objArr176[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj31);
                                        }
                                        long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj31).invoke(null, objArr175)).longValue();
                                        long j41 = ~longValue11;
                                        long j42 = ~(j | 301887162);
                                        long j43 = ((713 * longValue11) - 214641772182L) + (((~(301887162 | j41)) | j42) * (-712)) + (((~(longValue11 | 301887162 | j2)) | (~(j41 | j | 301887162))) * (-712)) + ((j41 | j42) * 712) + 605583576;
                                        if (((((int) (j43 >> 32)) & (((((~((-33711630) | i)) | (~(i10 | (-295766273)))) * 497) - 324917795) + (((~(i10 | (-1107748510))) | 1074036880 | (~((-295766273) | i))) * 497))) | (((int) j43) & ((((~(i10 | 2136635641)) | (-2147122176)) * 98) + 1705950248 + (((~(i10 | (-699409232))) | 2136635641 | (~(699409231 | i))) * (-49)) + (((~(2136635641 | i)) | 1447712944) * 49)))) != 0) {
                                            break;
                                        }
                                        java.lang.Object[] objArr177 = new java.lang.Object[1];
                                        a(android.view.View.getDefaultSize(0, 0) + 1425, (char) (android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), 14 - android.text.TextUtils.indexOf(str7, str7, 0, 0), objArr177);
                                        if (str11.equals(((java.lang.String) objArr177[0]).intern())) {
                                            java.lang.Object[] objArr178 = {str11};
                                            java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                            if (obj32 == null) {
                                                java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 3161 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (33100 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                                byte b20 = (byte) (-$$a[14]);
                                                java.lang.Object[] objArr179 = new java.lang.Object[1];
                                                b(b20, b20, (short) (b20 | 40), objArr179);
                                                obj32 = cls32.getMethod((java.lang.String) objArr179[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj32);
                                            }
                                            long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj32).invoke(null, objArr178)).longValue();
                                            long j44 = ~((~longValue12) | 416656983);
                                            long j45 = ((522 * longValue12) - 216661631160L) + ((~((-416656984) | longValue12 | j2)) * 521) + ((-1042) * j44) + (((~(longValue12 | j | (-416656984))) | j44) * 521) + 578777920;
                                            if (((((int) (j45 >> 32)) & (((((~(i10 | (-2140735944))) | (-703509533)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) - 1453938172) + (((~(i10 | (-696778757))) | (~((-6730777) | i))) * (-519)) + (((~((-703509533) | i)) | 2140735943) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))) | (((int) j45) & (((((~(i10 | (-28329353))) | 10503304) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 501357939) + ((~((-10503305) | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(i10 | 1465555762)) | (-1476059067) | (~((-17826049) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)))) != 0) {
                                                break;
                                            }
                                        }
                                        i62++;
                                    }
                                    if (i62 >= 0 && (i18 = i ^ (i62 + 130)) != i) {
                                        java.lang.Object[] objArr180 = {new int[]{i}, new int[]{i18}, null, null, new int[1]};
                                        java.lang.Object[] objArr181 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((~(i | 61053591)) | 1989792506) * 56) - 303735335) + (((~(i10 | 1989792506)) | 61053591) * 56))};
                                        java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj33 == null) {
                                            java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString(str7) + 51, 2713 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) android.text.TextUtils.getTrimmedLength(str7));
                                            int i63 = $$a[14] + 1;
                                            java.lang.Object[] objArr182 = new java.lang.Object[1];
                                            b((byte) i63, r2[16], (short) i63, objArr182);
                                            obj33 = cls33.getMethod((java.lang.String) objArr182[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj33);
                                        }
                                        ((int[]) objArr180[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr181)).intValue();
                                        return objArr180;
                                    }
                                }
                                java.lang.Object[] objArr183 = new java.lang.Object[1];
                                a(1503 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) android.view.View.combineMeasuredStates(0, 0), 13 - android.graphics.Color.green(0), objArr183);
                                java.lang.String intern65 = ((java.lang.String) objArr183[0]).intern();
                                java.lang.Object[] objArr184 = new java.lang.Object[1];
                                a(1517 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (41773 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 5 - (android.os.Process.myTid() >> 22), objArr184);
                                java.lang.String[] strArr34 = {intern65, ((java.lang.String) objArr184[0]).intern()};
                                java.lang.Object[] objArr185 = new java.lang.Object[1];
                                a(1521 - android.text.TextUtils.indexOf(str7, str7), (char) (51516 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), 15 - android.text.TextUtils.getOffsetAfter(str7, 0), objArr185);
                                java.lang.String intern66 = ((java.lang.String) objArr185[0]).intern();
                                java.lang.Object[] objArr186 = new java.lang.Object[1];
                                a(1536 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) android.view.View.getDefaultSize(0, 0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19, objArr186);
                                java.lang.String intern67 = ((java.lang.String) objArr186[0]).intern();
                                java.lang.Object[] objArr187 = new java.lang.Object[1];
                                a(android.text.TextUtils.getOffsetAfter(str7, 0) + 1555, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 15 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr187);
                                java.lang.String[] strArr35 = {intern66, intern67, ((java.lang.String) objArr187[0]).intern()};
                                java.lang.Object[] objArr188 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1569, (char) ((-1) - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), android.graphics.Color.red(0) + 21, objArr188);
                                java.lang.String intern68 = ((java.lang.String) objArr188[0]).intern();
                                java.lang.Object[] objArr189 = new java.lang.Object[1];
                                a(1590 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) android.graphics.Color.argb(0, 0, 0, 0), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 10, objArr189);
                                java.lang.String[] strArr36 = {intern68, ((java.lang.String) objArr189[0]).intern()};
                                java.lang.Object[] objArr190 = new java.lang.Object[1];
                                a(1600 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 24950), android.view.View.MeasureSpec.getSize(0) + 11, objArr190);
                                java.lang.String intern69 = ((java.lang.String) objArr190[0]).intern();
                                java.lang.Object[] objArr191 = new java.lang.Object[1];
                                a((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 337, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 64505), 5 - android.view.MotionEvent.axisFromString(str7), objArr191);
                                java.lang.String[] strArr37 = {intern69, ((java.lang.String) objArr191[0]).intern()};
                                java.lang.Object[] objArr192 = new java.lang.Object[1];
                                a(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1611, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 28 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr192);
                                char c3 = 0;
                                java.lang.String intern70 = ((java.lang.String) objArr192[0]).intern();
                                java.lang.Object[] objArr193 = new java.lang.Object[1];
                                a(1590 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10, objArr193);
                                java.lang.String[][] strArr38 = {strArr34, strArr35, strArr36, strArr37, new java.lang.String[]{intern70, ((java.lang.String) objArr193[0]).intern()}};
                                int i64 = -1;
                                int i65 = 0;
                                loop4: while (true) {
                                    if (i65 >= 5) {
                                        i16 = i;
                                        break;
                                    }
                                    java.lang.String[] strArr39 = strArr38[i65];
                                    java.lang.String str12 = strArr39[c3];
                                    java.lang.String[] strArr40 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr39, 1, strArr39.length);
                                    int length = strArr40.length;
                                    int i66 = 0;
                                    while (i66 < length) {
                                        java.lang.String str13 = strArr40[i66];
                                        java.io.File file3 = new java.io.File(str12);
                                        if (file3.exists() && file3.isFile()) {
                                            try {
                                                java.util.Scanner scanner3 = new java.util.Scanner(new java.io.FileInputStream(file3));
                                                strArr2 = strArr38;
                                                try {
                                                    java.lang.Object[] objArr194 = new java.lang.Object[1];
                                                    a(android.graphics.Color.red(0) + 167, (char) (android.view.KeyEvent.getDeadChar(0, 0) + 54557), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2, objArr194);
                                                    java.util.Scanner useDelimiter3 = scanner3.useDelimiter(((java.lang.String) objArr194[0]).intern());
                                                    next = useDelimiter3.hasNext() ? useDelimiter3.next() : str7;
                                                    useDelimiter3.close();
                                                } catch (java.io.IOException unused3) {
                                                    continue;
                                                }
                                            } catch (java.io.IOException unused4) {
                                            }
                                            if (next.contains(str13)) {
                                                values = (getProfileVersion + 65) % 128;
                                                i16 = i ^ (i64 + 171);
                                                break loop4;
                                            }
                                            i66++;
                                            i64++;
                                            strArr38 = strArr2;
                                        }
                                        strArr2 = strArr38;
                                        i66++;
                                        i64++;
                                        strArr38 = strArr2;
                                    }
                                    i65++;
                                    c3 = 0;
                                }
                                if (i16 != i) {
                                    values = (getProfileVersion + 5) % 128;
                                    java.lang.Object[] objArr195 = {new int[]{i}, new int[]{i16}, null, null, new int[1]};
                                    java.lang.Object[] objArr196 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~(i | (-1601721329))) | 440406432) * 576) + 1879500625 + (((~(i10 | (-1161314897))) | 8718337) * 576) + 271034368)};
                                    java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj34 == null) {
                                        java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.getDefaultSize(0, 0), (android.os.Process.myPid() >> 22) + 2713, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1));
                                        int i67 = $$a[14] + 1;
                                        java.lang.Object[] objArr197 = new java.lang.Object[1];
                                        b((byte) i67, r5[16], (short) i67, objArr197);
                                        obj34 = cls34.getMethod((java.lang.String) objArr197[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj34);
                                    }
                                    ((int[]) objArr195[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr196)).intValue();
                                    return objArr195;
                                }
                                try {
                                    java.lang.Object[] objArr198 = new java.lang.Object[1];
                                    a(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1639, (char) (10748 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 13, objArr198);
                                    java.lang.String intern71 = ((java.lang.String) objArr198[0]).intern();
                                    java.lang.Object[] objArr199 = new java.lang.Object[1];
                                    a(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1652, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 8 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr199);
                                    try {
                                        java.lang.Object[] objArr200 = {intern71, ((java.lang.String) objArr199[0]).intern()};
                                        java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                        if (obj35 == null) {
                                            java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2213 - android.view.KeyEvent.normalizeMetaState(0), (char) android.text.TextUtils.getCapsMode(str7, 0, 0));
                                            byte b21 = (byte) ($$a[14] + 1);
                                            java.lang.Object[] objArr201 = new java.lang.Object[1];
                                            b(b21, b21, (short) (b21 | 653), objArr201);
                                            obj35 = cls35.getMethod((java.lang.String) objArr201[0], java.lang.String.class, java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj35);
                                        }
                                        long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj35).invoke(null, objArr200)).longValue();
                                        long j46 = ~longValue13;
                                        long j47 = ((((longValue13 * 965) + 591216465923L) + (((~(j46 | j2)) | 613931948) * (-964))) + (((~(j46 | j)) | (~((-613931949) | j46))) * (-964))) - 121442653;
                                        if (((((int) j47) & (((i10 | (-716350977)) * (-369)) + 802172634 + (((~(i10 | 716353193)) | (-720873217)) * (-369)) + (((~((-716353194) | i)) | 2217 | (~(i10 | (-4522241)))) * 369))) | (((int) (j47 >> 32)) & (((((-1216134002) | r6) * 764) - 88066646) + (((~(i10 | (-1216134002))) | 136581392) * (-1528)) + (((~(i10 | (-1641606884))) | 698635666) * 764)))) != 0) {
                                            i17 = i ^ 150;
                                        } else {
                                            int i68 = values + 89;
                                            getProfileVersion = i68 % 128;
                                            if (i68 % 2 == 0) {
                                                throw null;
                                            }
                                            i17 = i;
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        java.lang.Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                } catch (java.lang.Exception unused5) {
                                    i17 = i ^ 151;
                                }
                                if (i17 != i) {
                                    java.lang.Object[] objArr202 = {new int[]{i}, new int[]{i17}, null, null, new int[1]};
                                    java.lang.Object[] objArr203 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((~((-172364435) | i)) | (~(1878481663 | i))) * 69) + 1362591720 + (((~(i | 1248271059)) | (~((-802575039) | i)) | 630210604) * (-69)) + 1223113093)};
                                    java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj36 == null) {
                                        java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 50, android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                        int i69 = $$a[14] + 1;
                                        java.lang.Object[] objArr204 = new java.lang.Object[1];
                                        b((byte) i69, r2[16], (short) i69, objArr204);
                                        obj36 = cls36.getMethod((java.lang.String) objArr204[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj36);
                                    }
                                    ((int[]) objArr202[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr203)).intValue();
                                    return objArr202;
                                }
                                java.lang.Object[] objArr205 = new java.lang.Object[1];
                                a(android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1661, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 47, objArr205);
                                java.lang.Object[] objArr206 = {((java.lang.String) objArr205[0]).intern()};
                                java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                if (obj37 == null) {
                                    java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3161, (char) (android.view.View.resolveSize(0, 0) + 33099));
                                    byte b22 = (byte) (-$$a[14]);
                                    byte b23 = (byte) (b22 - 1);
                                    java.lang.Object[] objArr207 = new java.lang.Object[1];
                                    b(b22, b23, (short) (b23 | 35), objArr207);
                                    obj37 = cls37.getMethod((java.lang.String) objArr207[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj37);
                                }
                                long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj37).invoke(null, objArr206)).longValue();
                                long j48 = ~longValue14;
                                long j49 = ~(j | (-1122760545) | longValue14);
                                long j50 = ((471 * longValue14) - 528820216695L) + ((longValue14 | (-1122760545)) * (-470)) + (((~(1122760544 | j48)) | (~(j48 | j2)) | j49) * (-470)) + (((~((-1122760545) | j48 | j2)) | j49) * 470) + 2030231283;
                                int i70 = ~((-541206563) | i);
                                int i71 = (((((int) (j50 >> 32)) & (((((((~(i10 | (-531896197))) | 167772544) | i70) * (-713)) + 1466743928) + (i70 * 1426)) + ((~(i10 | (-905330215))) * 713))) | (((int) j50) & (((((((~(i10 | (-1143095561))) | (~((-570490882) | i))) | (~((-1058885) | i))) * 765) + 1895715439) + (((~(i10 | (-1713586442))) | 1143095560) * 1530)) + (((~((-1713586442) | i)) | (~(i10 | (-1058885)))) * 765)))) * 263) ^ i;
                                if (i71 != i) {
                                    java.lang.Object[] objArr208 = {new int[]{i}, new int[]{i71}, null, null, new int[1]};
                                    java.lang.Object[] objArr209 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((1630539021 | r2) * (-814)) - 1570389234) + (((~(348893314 | i)) | (~(i10 | (-1701952784))) | 277479552) * 407) + (((~(i | 1701952783)) | (~((-348893315) | i)) | 277479552) * 407))};
                                    java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj38 == null) {
                                        java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.green(0), android.graphics.ImageFormat.getBitsPerPixel(0) + 2714, (char) (android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                        int i72 = $$a[14] + 1;
                                        java.lang.Object[] objArr210 = new java.lang.Object[1];
                                        b((byte) i72, r4[16], (short) i72, objArr210);
                                        obj38 = cls38.getMethod((java.lang.String) objArr210[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj38);
                                    }
                                    ((int[]) objArr208[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr209)).intValue();
                                    return objArr208;
                                }
                                java.lang.Object[] objArr211 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                java.lang.Object[] objArr212 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((538455121 | r2) * (-280)) - 591782435) + (((~((-739880050) | i)) | (~((-1310966049) | i))) * 140) + (((~(i | (-201424929))) | (~(i10 | (-538455122))) | (~(i10 | (-1109541121)))) * 140))};
                                java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj39 == null) {
                                    java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str7, str7, 0, 0) + 50, android.text.TextUtils.getTrimmedLength(str7) + 2713, (char) (android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                    int i73 = $$a[14] + 1;
                                    java.lang.Object[] objArr213 = new java.lang.Object[1];
                                    b((byte) i73, r4[16], (short) i73, objArr213);
                                    obj39 = cls39.getMethod((java.lang.String) objArr213[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj39);
                                }
                                ((int[]) objArr211[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr212)).intValue();
                                return objArr211;
                            }
                        }
                        i9 = i;
                        if (i9 == i) {
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
}
