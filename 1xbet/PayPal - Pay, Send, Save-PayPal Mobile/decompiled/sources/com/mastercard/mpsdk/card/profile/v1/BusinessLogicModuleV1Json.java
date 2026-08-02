package com.mastercard.mpsdk.card.profile.v1;

/* loaded from: classes4.dex */
public class BusinessLogicModuleV1Json {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static long AlternateContactlessPaymentDataJson;
    private static int valueOf;
    private static char[] values;
    private static int writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "applicationLifeCycleData")
    public java.lang.String applicationLifeCycleData;

    @com.payair.hce.setSelectionFromTop(valueOf = "cardLayoutDescription")
    public java.lang.String cardLayoutDescription;

    @com.payair.hce.setSelectionFromTop(valueOf = "cardholderValidators")
    public java.lang.String[] cardholderValidators;

    @com.payair.hce.setSelectionFromTop(valueOf = "cvmResetTimeout")
    public int cvmResetTimeout;

    @com.payair.hce.setSelectionFromTop(valueOf = "dualTapResetTimeout")
    public int dualTapResetTimeout;

    @com.payair.hce.setSelectionFromTop(valueOf = "magstripeCvmIssuerOptions")
    public com.mastercard.mpsdk.card.profile.v1.MagstripeCvmIssuerOptionsV1Json magstripeCvmIssuerOptions;

    @com.payair.hce.setSelectionFromTop(valueOf = "mChipCvmIssuerOptions")
    public com.mastercard.mpsdk.card.profile.v1.MChipCvmIssuerOptionsV1Json mchipCvmIssuerOptions;

    @com.payair.hce.setSelectionFromTop(valueOf = "securityWord")
    public java.lang.String securityWord;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = 38 - (i * 34);
        byte[] bArr = $$a;
        int i5 = s * 2;
        char[] cArr = new char[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 = i4;
            int i7 = i5;
            i4 = (i4 + (-i7)) - 2;
            i3++;
            i6++;
            cArr[i6] = (char) i4;
            if (i6 == i5) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i7 = bArr[i3];
            i4 = (i4 + (-i7)) - 2;
            i3++;
            i6++;
            cArr[i6] = (char) i4;
            if (i6 == i5) {
            }
        } else {
            int i8 = 718 - i2;
            i3 = i4;
            i4 = i8;
            i6++;
            cArr[i6] = (char) i4;
            if (i6 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = (s * 4) + 1;
        int i6 = i2 + 4;
        byte[] bArr = $$d;
        int i7 = (i * 4) + 99;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i7 = i5;
            int i8 = i6;
            int i9 = 0;
            i7 += i6;
            i6 = i8;
            i3 = i9;
            bArr2[i3] = (byte) i7;
            i4 = i3 + 1;
            int i10 = i6 + 1;
            if (i4 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = i10;
            i6 = bArr[i10];
            i9 = i4;
            i7 += i6;
            i6 = i8;
            i3 = i9;
            bArr2[i3] = (byte) i7;
            i4 = i3 + 1;
            int i102 = i6 + 1;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i7;
            i4 = i3 + 1;
            int i1022 = i6 + 1;
            if (i4 == i5) {
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
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(values[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 48, 381 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 62388));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c(0, (short) 0, -1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(AlternateContactlessPaymentDataJson), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 35, 3966 - android.text.TextUtils.getOffsetBefore("", 0), (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.graphics.Color.green(0), android.view.KeyEvent.normalizeMetaState(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
            $10 = ($11 + 99) % 128;
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.graphics.Color.red(0), 211 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.graphics.Color.argb(0, 0, 0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        java.lang.String str = new java.lang.String(cArr);
        $11 = ($10 + 107) % 128;
        objArr[0] = str;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        writeReplace = 0;
        valueOf = 1;
        char[] cArr = new char[1707];
        java.nio.ByteBuffer.wrap("1(À\u009bÒ\u0092ä\u0099öÈ\u0088¸\u009a¸¬£¾£°ÙBÞTÜfÏxÀ\nö\u001cë.ã \r2\u0012Ä\u001cÖ\u0014è\u0000ú$\u008c?\u009e&\u0090\\¢R^\u0080¯3½:\u008b1\u0099`ç\u0010õ\u0010Ã\u000bÑ\u000bßq-v;t\tg\u0017heOsNA_O²]\u0080«£¹¿\u0087\u0085\u0095\u009cã\u0093ñ\u008b^\u0080¯3½:\u008b1\u0099`ç\u0010õ\u0010Ã\u000bÑ\u000bßq-v;t\tg\u0017heLs^AAO´ÿÓ\u000ew\u001cu*g83FITCbPpI~(\u008c)\u009a{¨;¶\u000bÄ\u0000Ò\u0010à\u001aîíüÿ\nü\u0018Ã&Æ4ÍBÀPÈ^¡l¾z\u00ad\u0086Éw{ebSmA)?Z-Q\u001b\u0000\tV\u0007,õ9ã>^\u0080¯2½+\u008b$\u0099`ç\u0004õ\u0016Ã\nÑAßg-m;h\t\u007fÀ01\u0094#\u008b\u0015\u0094\u0007\u009eyµk«]øO\u008dAá³â¥Ø\u0097É\u0089âûËíößëÑ\u0006^\u0080¯$½&\u008b4\u0099;ç\u0012õ\u0012ÃHÑ\u0003ß~-};(\tc\u0017^e]sIAMOù]¬«¨^Í¯>½8\u008b)\u0099 ç\u000f^\u0080¯$½&\u008b4\u0099;ç\u0012õ\u0012ÃHÑ\rß~-q;(\ta\u0017ReRsRAyO\u009a]ò«©¹ª\u0087\u009a\u0095\u008aãÊñ\u008cÿøÍñÛó)ý7Ø\u0005Ó\u001bWêóøñÎãÜì¢Å°Å\u0086\u009f\u0094Ú\u009a©h¦~ÿL¶R\u0085 \u00856\u0085\u0004®\nM\u0018%î`üjÂOÐX^\u0080¯$½&\u008b4\u0099;ç\u0012õ\u0012ÃHÑ\u0003ß~-};(\tc\u0017^e]sIAJOº]ª«\u0091¹\u0082\u0087\u0087\u0095\u008dã\u0088ñ\u009fÿ¹ÍìÛè\u00992h\u0081z\u0088L\u0083^Ò «2¨\u0004¸\u0016¨\u0018ÂêØüÐÎÎÐñ^Ý¯8½q\u008b%\u0099:ç\u001eõ\u0013Ã\u0003ÑAß\u007f-p;t\t{^Á¯2½>\u008b4\u0099*çYõ\u0011Ã\u0002Ñ\u001bYô¨SºY\u008c\\\u009eXà,òmÄzÖwØ\u0006*\u0018<\n\u000e\b\u00107b.t>F(^Ç¯4½4\u008b4\u0099:ç\u0017ké\u009a\f^Ý¯8½q\u008b7\u0099=ç\u0018õ\u001bÃ\u0012Ñ\fßc-1;j\tn\u0017YeJsAANO´]««²¹½\u0087\u0092\u0095\u008d\u008e7\u007fÍmÎ[Á^Ù¯5½0\u008b?\u0099<ç\u0011^\u0080¯'½-\u008b(\u0099,çXõ\u0012Ã\bÑ\u000bßb-s;b\t|^Ù¯5½0\u008b?\u0099(ç\u0002õ\u001aÃ\u0014Ñ\u001b\tsø©êªÜ¥Î¹°\u0083¢\u0090\u0094\u0095\u0086\u009b\u0088â^Ú¯9½4\u008b)\u0099 ç\u0000õ\u0011jñ\u009b\u0002\u0089\u0010¿\u0015\u00ad\u001fÓ#Á7÷7¥JT¯Fæp bª\u001c\u008f\u000e\u008c8\u0085*\u009b$ôÖ¦ÀôòýìÖ\u009eÁ\u0088ÓºÝ^Ù¯5½0\u008b?\u0099wçAõ\u000f^È¯2½1\u008b\"\u0099=ç\u001eõ\u001c^È¯2½1\u008b\"\u0099=ç\u001eõ\u001cÃ8Ñ\u0017ß/-)æq\u0017\u008b\u0005\u00883\u009b!\u0084_§M¥{\u0081i®g\u0096\u0095\u0090\u0083á±\u0080¯ºéØ\u0018=\nt<2.8P\u001dB\u001et\u0017f\thf\u009a4\u008co¾e VÒ_ÄN^Ü¯3½4^Ê¯:½*\u008b+\u0099.ç\u0003õ\u0010Ã\u0015H\u0095¹\\«T\u009d\u001c\u008ffñyãjÕhÇ}É\u0001;\u0001-\\\u001f\u0012\u0001#s6e|W\u0017YÄKÖ½Ó¯Ù\u0091é^î¯9½;\u008b5\u0099 ç\u001eõ\u001bÃGÑ<ßS-T;'\tm\u0017BeVsKA[O÷]¹«¨¹½\u0087×\u0095\u0087ãßñÙ^î¯9½;\u008b5\u0099 ç\u001eõ\u001bÃGÑ<ßS-T;'\tm\u0017BeVsKA[O÷]¹«¨¹½\u0087×\u0095\u0087ãßñÙÿÈÍ©Û³^Ý¯8½q\u008b/\u0099.ç\u0005õ\u001bÃ\u0010Ñ\u000eße-z,uÝ\u0085Ï\u008eù\u009eë\u0094\u0095£\u0087±±²^Ù¯5½0\u008b?\u0099wçA^Ý¯6½1\u008b$\u0099'ç\u0002^Ý¯8½q\u008b7\u0099=ç\u0018õ\u001bÃ\u0012Ñ\fßc-1;e\t}\u0017VeQsC~¹\u008f\\\u009d\u0015«H¹NÇaÕuãfñgÿ]\r\n\u001b\u0006)\u00067&^\u009e\u000e\u0002ÿçí®ÛëÉõ·Ë¥Õ\u0093Ê\u0081Õ\u0010I^Ý¯8½q\u008b%\u0099:ç\u001eõ\u0013Ã\u0003ÑAßg-m;h\tk\u0017Be\\sS^É¯\"½3\u008b+\u0099\u0010ç\u000fõGÃQ¤9UÜG\u0095qÁcÞ\u001dú\u000f÷9ç+¥%\u0095×\u0092Á\u008dó\u008cí¶\u009f©\u0089³»¹µZ§UQW^È¯2½1\u008b\"\u0099=ç\u001eõ\u001cÃHÑ\u001cßs-t;(\th\u0017ReQsBA]O¾]¼ôv\u0005\u008c\u0017\u008f!\u009c3\u0083M _¢i\u0086{©u\u0091\u0087\u0097\u0091\u0096£Â½íÏêÙÆëéåQ÷W\u0001V\u0013\u0016-,?/I<[#U@gBqf\u0083I\u009d1¯7^È¯2½1\u008b\"\u0099=ç\u001eõ\u001cÃHÑ\bßx-p;`\tc\u0017Re`sTAKO¼]ð« ¹ª\u0087\u0099\u0095\u009aã\u0095ñ\u0086ÿô^È¯2½1\u008b\"\u0099=ç\u001eõ\u001cÃHÑ\u0019ßu-p;\u007f\t7\u0017\u0001eOs\bAYOµ]°«¿¹÷\u0087Á\u0095\u008f^È¯8½0\u008b \u0099#ç\u0012õPÃ\u0014Ñ\u000bß|-@;`\t\u007f\u0017_ePsIAJO\u0088]§«ÿ¹ù\u0087Ø\u0095\u0098ã\u0082ñ\u0081ÿòÍíÛî)ì7è\u0005Ç\u0013\u009fa\u0099ëc\u001a\u0086\bÏ>\u009b,\u009eR¦@µvµd¾jÈ\u0098Å\u008eÜ¼Ã^Ý¯8½q\u008b%\u0099 ç\u0018õ\u000bÃ\u000eÑ\u0002ßv-x;b\t!\u0017UeJsNACO³]ñ«¡¹¦\u0087\u0099\u0095\u0098ã\u0082ñ\u009dÿçÍíÛî)á7Ã^î¯9½;\u008b5\u0099 ç\u001eõ\u001bÃJÑ\u0017ß/-)H\u001d¹ø«±\u009då\u008fúñÞãÓÕÃÇ\u0081É³;¶-´\u001f¿\u0001\u009bs\u009ee\u009eWÁY~K{z\u0016\u008bÿ\u0099á¯þ½¯^Æ¯9½6\u008b3\u0099aç\u0004õ\tÃ\u0004ÑAßf-z;j\tz\u0017\u001aeOsUA@O§]¬b\u0081\u0093m\u0081m·m¥>Û@ÉWÿ\u0016í]ã)\u0011)\u000765;+\rY\u0019O\u000bªã[\u000fI\u000f\u007f\u000fm\\\u00139\u0001$7t%4+KÙIÏ_ýmãi\u0091c\u0087wµw»\u0098©\u0083>\u0084ÏhÝhëhù;\u0087^\u0095C£\u0013±Y¿.M![\u0002i1w\b\u0005\u000b\u0013\u000e!\u001c/ù=üë:\u001aß\b\u0096>Ë,ÍRâ@övådäjÞ\u0098\u0099\u008e\u008e¼\u008c¢¢Ð·Æ©ô¬ú\u001eèI\u001eE\fE2e |Eo´\u008a¦Ã\u0090\u0097\u0082\u0092üªî¹ØûÊ¬ÄÀ6À À\u0012\u0093\fä~ûhñZÂT\u000bF\f°\u0018¢\u0018!\u0012Ð÷Â¾ôçæä\u0098Õ\u008a\u009e¼Ê®Õ ±R¼D¬vîh\u009e\u001a\u0099\f\u0086>\u00870}\"bÔxÆrøQê^\u009c\\åð\u0014\u0015\u0006\\0\u001a\"\u0010\\5N6x?j!dN\u0096\u001c\u0080H²W¬sÞ~Ènú,ô\u009cæ\u009b\u0010\u0084\u0002\u0085<¿. XºJ°DÓvÜ`Þ^Ý¯8½q\u008b4\u00996ç\u0004õ\u000bÃ\u0002Ñ\u0002ß9-};r\tf\u0017[e[s\tAIO¾]±« ¹ª\u0087\u0085\u0095\u008fã\u0095ñ\u0086ÿùÍë}-\u008cÈ\u009e\u0081¨ÄºÆÄôÖûàòòòü¸\u000e\u008a\u0018\u008f*\u008b4éF\u00adP¢b¶lK~K\u0088\u0019\u009aY¤n¶aÀpÒzÜ\u0015î\u001fø\u0005\n\u0016\u0014)&;à\u0013\u0011ö\u0003¿5ÿ'äY×KÕ}ÆoÓa÷\u0093³\u0085¼·¨©\u0095Û\u0095ÍÇÿ\u0087ñpã\u007f\u0015n\u0007d9K+A][OHA7s%^Ý¯8½q\u008b1\u0099*ç\u0019õ\u001bÃ\bÑ\u001dßH-{;k\td\u0017Ze\u0011sEAZO¾]³«£¹á\u0087\u0091\u0095\u0096ã\u0089ñ\u0088ÿòÍíÛ÷)ý7Þ\u0005Ñ\u0013Ó Ã\"\u0010Ó£Áª÷¡åð\u009b\u0096\u0089\u008a¿\u009a\u00ad\u008a£ØQÿGþuïkÂ^\u0080¯3½:\u008b1\u0099`ç\u0004õ\u0010Ã\u0004Ñ\u0004ßr-k;(\tm\u0017VeLsBAMO¶]±«£¹\u0090\u0087\u0090\u0095\u009aã\u0089ñ\u0096ÿó?\u000eÎ½Ü´ê¿øî\u0086\u008a\u0094\u009e¢\u008a°\u008a¾üLåZ¦hævÜ\u0004ß\u0012Ð Å^\u0080¯3½:\u008b1\u0099`ç\u0004õ\u0010Ã\u0004Ñ\u0004ßr-k;(\t~\u0017ReRsRAK^\u0080¯$½&\u008b4\u0099`ç\u0006õ\u001aÃ\nÑ\u001aßH-k;u\tn\u0017TeZÃ\u00832' %\u00167\u00048z\u0011h\u0011^KL\u0000B}°~¦+\u0094`\u008a]ø^îGÜsÒ¹À½6¨$ \u001a\u009b\b\u009f~»l\u0088bñPþFñ´ëªë\u0098Í\u008eÁüÁó!ár×7Å#^\u0080¯3½:\u008b1\u0099`ç\u0015õ\fÃ\u0013Ñ0ßp-o;tã©\u0012\u001a\u0000\u00136\u0018$IZ<H%~:l\u0019bJ\u0090_\u0086C´C^\u0080¯3½:\u008b1\u0099`ç\u0004õ\u0010Ã\u0004Ñ\u0004ßr-k;(\tm\u0017DeKsAA@O»]»«¢¹½\u0087\u0093î{\u001fß\rÝ;Ï)ÀWéEés³aøo\u0085\u009d\u0086\u008bÓ¹\u0098§¥Õ¦Ã¾ñ§ÿXíB\u001bS\tX7h%aSnAKO\u0006}\nk\u0015\u0099Z\u0087?µ+\u0087ñvBdKR@@\u0011>d,}\u001ab\b\u007f\u0006\u0005ô\râ\u0013õ\u0097\u0004$\u0016- &2wL\u0002^\u001bh\u0004z\u001fty\u0086z\u0090\u007f^\u0080¯3½:\u008b1\u0099`ç\u0015õ\fÃ\u0013Ñ\u0002ßr-x;i^\u0080¯3½:\u008b1\u0099`ç\u0015õ\fÃ\u0013Ñ\u0000ße-v;b^\u0080¯3½:\u008b1\u0099`ç\u0015õ\fÃ\u0013Ñ\u0019ßz-l;`^\u0080¯3½:\u008b1\u0099`ç\u0015õ\fÃ\u0013Ñ\u001fßp-~;n\t\u007f\u0017T\u000eLÿÿíöÛýÉ¬·Ù¥À\u0093ß\u0081ü\u008f²}¾k®\f\u0088ý;ï6Ù;Ë&µP§\u0013\u0091\u0000\u0083\u0010\u008dq\u007f{i`[fE[7D!\u0000\u0013\t\u001d§\u000fµùàë¥Õ\u008cÇ\u0083±\u0084^\u0080¯:½1\u008b3\u0099`ç\u0000õ\u0016Ã\tÑ\u000bßx-h;t\t \u0017ueLsSA|O¿]¾«µ¹ª\u0087\u0093\u0095¹ã\u0088ñ\u0083ÿóÍúÛõÜ -\u0007?\r\t\b\u001b\fexw6A(S?]X¯M¹S\u008b\\^\u009f¯1½9\u008bg\u0099u^\u0080¯'½-\u008b(\u0099,çXõ\fÃ\u0002Ñ\u0003ßq-0;j\tn\u0017GeL^È¯%½>\u008b+\u0099#ç\u0018õ\u001cÃIÑ\bßx-s;c\ti\u0017^eLsOA\u0001O¤]° àQ\u001dC\u001eu#g \u0019\u0011\u000b\u000f=\u001b/.!GÓHÅ\n÷_é{¾\u008cO>]'k(yl\u0007\u0016\u0015\u0016#\u000f1\n?zÍLÛhél÷_\u0085V\u0093H¡P¯õ½«K¦Y¯^Í¯;½*\u008b\"\u0099<ç\u0003õ\u001eÃ\u0004Ñ\u0004ßd\u00952d\u0080v\u0099@\u0096RÒ,¨>¢\b \u001a³\u0014ÑæÞ^\u0080¯3½>\u008b3\u0099.çXõ\u001bÃ\bÑ\u0018ßy-s;h\tn\u0017SeLs\bA\u0001O³]¯«è¹®\u0087\u0087\u0095\u008fã\u0094ñÁÿïÍòÛë^\u0080¯'½-\u008b(\u0099,çXõ\u001cÃ\u0017Ñ\u001aß~-q;a\t`^è¯8½3\u008b#\u0099)ç\u001eõ\fÃ\u000f^\u0080¯3½>\u008b3\u0099.çXõ\u0012Ã\u000eÑ\u001cßt-0;w\t}\u0017XeYsNACO²]¬«è¹¬\u0087\u0082\u0095\u008dãÈñßÿ¸ÍüÛè)â7\u0099\u0005Ò\u0013ÎaÌn%|0J1X&¦\u0005´\u000b\u0082I\u0090\u0002\u009erìrúrÈfÖZ$Z".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1707);
        values = cArr;
        AlternateContactlessPaymentDataJson = 4582285272868761431L;
    }

    static void init$1() {
        $$d = new byte[]{123, 115, -118, 86};
        $$e = 238;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0ce8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0da3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0e59  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0f1f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x25db A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:6:0x00cc, B:8:0x00df, B:9:0x0126, B:18:0x01eb, B:20:0x0232, B:21:0x0283, B:28:0x030c, B:30:0x031f, B:31:0x0368, B:39:0x042c, B:41:0x0468, B:42:0x04ba, B:45:0x04d0, B:47:0x04df, B:48:0x0524, B:54:0x05e5, B:56:0x0630, B:57:0x0683, B:61:0x06e3, B:63:0x06f6, B:64:0x0745, B:70:0x07e9, B:72:0x0835, B:73:0x0887, B:81:0x0951, B:83:0x0964, B:84:0x09b2, B:91:0x0b8b, B:93:0x0bc3, B:94:0x0c17, B:98:0x0c53, B:100:0x0c66, B:101:0x0cae, B:108:0x0d00, B:110:0x0d39, B:111:0x0d8d, B:128:0x0e71, B:130:0x0eb3, B:131:0x0f09, B:135:0x0f43, B:137:0x0f56, B:138:0x0f98, B:144:0x0ff5, B:146:0x1025, B:147:0x107a, B:151:0x10df, B:153:0x10f2, B:154:0x1140, B:160:0x1346, B:162:0x1379, B:163:0x13d3, B:167:0x13eb, B:169:0x13fa, B:170:0x143d, B:174:0x14e0, B:176:0x1519, B:177:0x1570, B:180:0x1586, B:182:0x159e, B:183:0x15e9, B:189:0x169a, B:191:0x16e5, B:192:0x1740, B:196:0x1780, B:198:0x1793, B:199:0x17d9, B:201:0x17e2, B:203:0x1800, B:204:0x184b, B:209:0x25c8, B:211:0x25db, B:212:0x2622, B:223:0x2a0e, B:225:0x2a21, B:226:0x2a6e, B:231:0x2b23, B:233:0x2b36, B:234:0x2b81, B:244:0x2c55, B:246:0x2c93, B:247:0x2ce6, B:264:0x2ec3, B:266:0x2ed6, B:267:0x2f29, B:275:0x300c, B:277:0x3055, B:278:0x30aa, B:294:0x3229, B:296:0x3268, B:297:0x32c0, B:301:0x32fb, B:303:0x330e, B:304:0x335a, B:308:0x3421, B:310:0x345c, B:311:0x34b0, B:315:0x34e3, B:317:0x3516, B:318:0x356c, B:335:0x2631, B:337:0x264f, B:338:0x269e, B:344:0x2152, B:346:0x2165, B:347:0x21ac, B:354:0x21c8, B:356:0x21db, B:357:0x2226, B:372:0x2354, B:374:0x238e, B:375:0x23e4, B:380:0x24f1, B:382:0x252e, B:383:0x2586, B:387:0x2413, B:389:0x245f, B:390:0x24b3, B:395:0x122f, B:397:0x1242, B:398:0x128a, B:412:0x0a6b, B:414:0x0a7e, B:415:0x0aca), top: B:5:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x262b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x2a0c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x2c93 A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:6:0x00cc, B:8:0x00df, B:9:0x0126, B:18:0x01eb, B:20:0x0232, B:21:0x0283, B:28:0x030c, B:30:0x031f, B:31:0x0368, B:39:0x042c, B:41:0x0468, B:42:0x04ba, B:45:0x04d0, B:47:0x04df, B:48:0x0524, B:54:0x05e5, B:56:0x0630, B:57:0x0683, B:61:0x06e3, B:63:0x06f6, B:64:0x0745, B:70:0x07e9, B:72:0x0835, B:73:0x0887, B:81:0x0951, B:83:0x0964, B:84:0x09b2, B:91:0x0b8b, B:93:0x0bc3, B:94:0x0c17, B:98:0x0c53, B:100:0x0c66, B:101:0x0cae, B:108:0x0d00, B:110:0x0d39, B:111:0x0d8d, B:128:0x0e71, B:130:0x0eb3, B:131:0x0f09, B:135:0x0f43, B:137:0x0f56, B:138:0x0f98, B:144:0x0ff5, B:146:0x1025, B:147:0x107a, B:151:0x10df, B:153:0x10f2, B:154:0x1140, B:160:0x1346, B:162:0x1379, B:163:0x13d3, B:167:0x13eb, B:169:0x13fa, B:170:0x143d, B:174:0x14e0, B:176:0x1519, B:177:0x1570, B:180:0x1586, B:182:0x159e, B:183:0x15e9, B:189:0x169a, B:191:0x16e5, B:192:0x1740, B:196:0x1780, B:198:0x1793, B:199:0x17d9, B:201:0x17e2, B:203:0x1800, B:204:0x184b, B:209:0x25c8, B:211:0x25db, B:212:0x2622, B:223:0x2a0e, B:225:0x2a21, B:226:0x2a6e, B:231:0x2b23, B:233:0x2b36, B:234:0x2b81, B:244:0x2c55, B:246:0x2c93, B:247:0x2ce6, B:264:0x2ec3, B:266:0x2ed6, B:267:0x2f29, B:275:0x300c, B:277:0x3055, B:278:0x30aa, B:294:0x3229, B:296:0x3268, B:297:0x32c0, B:301:0x32fb, B:303:0x330e, B:304:0x335a, B:308:0x3421, B:310:0x345c, B:311:0x34b0, B:315:0x34e3, B:317:0x3516, B:318:0x356c, B:335:0x2631, B:337:0x264f, B:338:0x269e, B:344:0x2152, B:346:0x2165, B:347:0x21ac, B:354:0x21c8, B:356:0x21db, B:357:0x2226, B:372:0x2354, B:374:0x238e, B:375:0x23e4, B:380:0x24f1, B:382:0x252e, B:383:0x2586, B:387:0x2413, B:389:0x245f, B:390:0x24b3, B:395:0x122f, B:397:0x1242, B:398:0x128a, B:412:0x0a6b, B:414:0x0a7e, B:415:0x0aca), top: B:5:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x2eb1  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x2ff4  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x30c0  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x2ff1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x2631 A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:6:0x00cc, B:8:0x00df, B:9:0x0126, B:18:0x01eb, B:20:0x0232, B:21:0x0283, B:28:0x030c, B:30:0x031f, B:31:0x0368, B:39:0x042c, B:41:0x0468, B:42:0x04ba, B:45:0x04d0, B:47:0x04df, B:48:0x0524, B:54:0x05e5, B:56:0x0630, B:57:0x0683, B:61:0x06e3, B:63:0x06f6, B:64:0x0745, B:70:0x07e9, B:72:0x0835, B:73:0x0887, B:81:0x0951, B:83:0x0964, B:84:0x09b2, B:91:0x0b8b, B:93:0x0bc3, B:94:0x0c17, B:98:0x0c53, B:100:0x0c66, B:101:0x0cae, B:108:0x0d00, B:110:0x0d39, B:111:0x0d8d, B:128:0x0e71, B:130:0x0eb3, B:131:0x0f09, B:135:0x0f43, B:137:0x0f56, B:138:0x0f98, B:144:0x0ff5, B:146:0x1025, B:147:0x107a, B:151:0x10df, B:153:0x10f2, B:154:0x1140, B:160:0x1346, B:162:0x1379, B:163:0x13d3, B:167:0x13eb, B:169:0x13fa, B:170:0x143d, B:174:0x14e0, B:176:0x1519, B:177:0x1570, B:180:0x1586, B:182:0x159e, B:183:0x15e9, B:189:0x169a, B:191:0x16e5, B:192:0x1740, B:196:0x1780, B:198:0x1793, B:199:0x17d9, B:201:0x17e2, B:203:0x1800, B:204:0x184b, B:209:0x25c8, B:211:0x25db, B:212:0x2622, B:223:0x2a0e, B:225:0x2a21, B:226:0x2a6e, B:231:0x2b23, B:233:0x2b36, B:234:0x2b81, B:244:0x2c55, B:246:0x2c93, B:247:0x2ce6, B:264:0x2ec3, B:266:0x2ed6, B:267:0x2f29, B:275:0x300c, B:277:0x3055, B:278:0x30aa, B:294:0x3229, B:296:0x3268, B:297:0x32c0, B:301:0x32fb, B:303:0x330e, B:304:0x335a, B:308:0x3421, B:310:0x345c, B:311:0x34b0, B:315:0x34e3, B:317:0x3516, B:318:0x356c, B:335:0x2631, B:337:0x264f, B:338:0x269e, B:344:0x2152, B:346:0x2165, B:347:0x21ac, B:354:0x21c8, B:356:0x21db, B:357:0x2226, B:372:0x2354, B:374:0x238e, B:375:0x23e4, B:380:0x24f1, B:382:0x252e, B:383:0x2586, B:387:0x2413, B:389:0x245f, B:390:0x24b3, B:395:0x122f, B:397:0x1242, B:398:0x128a, B:412:0x0a6b, B:414:0x0a7e, B:415:0x0aca), top: B:5:0x00cc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] DigitizedCardProfile(android.content.Context context, int i, int i2, int i3) {
        java.lang.Integer num;
        java.lang.Integer num2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        java.lang.String str;
        int i9;
        java.lang.String str2;
        long j;
        int i10;
        java.lang.Object[] objArr;
        char c;
        java.lang.String[][] strArr;
        int i11;
        int i12;
        java.util.ArrayList arrayList;
        java.lang.String str3;
        java.lang.Object obj;
        java.lang.Object invoke;
        java.lang.String str4;
        int i13;
        int i14;
        char c2;
        int i15;
        int i16;
        int i17;
        java.lang.String[] strArr2;
        java.lang.String[][] strArr3;
        int i18;
        int i19;
        int i20;
        java.lang.Object obj2;
        java.lang.String str5;
        java.lang.String[] strArr4;
        int i21 = 16;
        java.lang.Integer num3 = 16;
        int i22 = 0;
        java.lang.Integer num4 = 0;
        int i23 = 1;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(465 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 8 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
        java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(android.graphics.Color.argb(0, 0, 0, 0), (char) (28585 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), android.graphics.Color.red(0) + 27, objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 27, (char) (android.os.Process.myPid() >> 22), 25 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr4);
        java.lang.String intern3 = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(android.widget.ExpandableListView.getPackedPositionChild(0L) + 53, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 18, objArr5);
        java.lang.String intern4 = ((java.lang.String) objArr5[0]).intern();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(70 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (41298 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), android.view.MotionEvent.axisFromString("") + 29, objArr6);
        java.lang.String[] strArr5 = {intern2, intern3, intern4, ((java.lang.String) objArr6[0]).intern()};
        int i24 = 0;
        while (true) {
            if (i24 >= 4) {
                num = num3;
                num2 = num4;
                i4 = i;
                break;
            }
            try {
                java.lang.Object[] objArr7 = {strArr5[i24]};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getLongPressTimeout() >> i21), 3161 - android.graphics.Color.argb(i22, i22, i22, i22), (char) (33099 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i22) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i22) == 0.0d ? 0 : -1))));
                    byte b = (byte) (-$$a[14]);
                    byte b2 = (byte) (b - 1);
                    java.lang.Object[] objArr8 = new java.lang.Object[i23];
                    b(b, b2, b2, objArr8);
                    java.lang.String str6 = (java.lang.String) objArr8[i22];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[i23];
                    clsArr[i22] = java.lang.String.class;
                    obj3 = cls.getMethod(str6, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj3);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7)).longValue();
                long j2 = ~longValue;
                num = num3;
                long j3 = i;
                num2 = num4;
                long j4 = longValue | (-603745366);
                long j5 = (((((longValue * (-751)) - 453412769115L) + (((~(j2 | (-603745366))) | (~(j3 | (-603745366)))) * 1504)) + ((~(j3 | j4)) * (-1504))) + (((~j4) | ((j2 | 603745365) ^ (-1))) * 752)) - 1941413473;
                int i25 = (int) (j5 >> 32);
                int i26 = ~i;
                if (((i25 & ((((~(i26 | (-1145131009))) * 130) - 2074157738) + (((~((-1145131009) | i)) | 269484458) * 130))) | (((int) j5) & ((((~((-921019173) | i)) | (-516207238)) * 56) + 1821701853 + (((~((-516207238) | i26)) | (-921019173)) * 56)))) != 0) {
                    i4 = i ^ (i24 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
                    break;
                }
                i24++;
                num3 = num;
                num4 = num2;
                i21 = 16;
                i22 = 0;
                i23 = 1;
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
            int i27 = ~i;
            java.lang.Object[] objArr10 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~((-1701846819) | i27)) | (-348999280) | (~(1701846818 | i))) * (-564)) + 552679405 + ((~(i | (-277692494))) * 1128) + (((~((-348999280) | i27)) | (-1979539312)) * 564))};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 2713 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b((byte) (-$$a[14]), r8[16], 653, objArr11);
                obj4 = cls2.getMethod((java.lang.String) objArr11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
            }
            ((int[]) objArr9[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr10)).intValue();
            return objArr9;
        }
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        a(98 - android.view.View.MeasureSpec.getSize(0), (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 55369), 12 - android.text.TextUtils.getOffsetBefore("", 0), objArr12);
        java.lang.String intern5 = ((java.lang.String) objArr12[0]).intern();
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a(110 - android.text.TextUtils.getOffsetBefore("", 0), (char) android.widget.ExpandableListView.getPackedPositionType(0L), 13 - android.view.View.MeasureSpec.getSize(0), objArr13);
        java.lang.String intern6 = ((java.lang.String) objArr13[0]).intern();
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, (char) (40624 - android.graphics.Color.red(0)), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, objArr14);
        java.lang.String[] strArr6 = {intern5, intern6, ((java.lang.String) objArr14[0]).intern()};
        int i28 = 0;
        while (true) {
            if (i28 >= 3) {
                i5 = i;
                break;
            }
            java.lang.Object[] objArr15 = {strArr6[i28]};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
            if (obj5 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 37, 3160 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33099));
                byte b3 = (byte) ($$a[14] + 1);
                byte b4 = b3;
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                b(b3, b4, (short) (b4 | 618), objArr16);
                obj5 = cls3.getMethod((java.lang.String) objArr16[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj5);
            }
            long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr15)).longValue();
            long j6 = i;
            long j7 = ~longValue2;
            java.lang.String[] strArr7 = strArr6;
            long j8 = (302 * longValue2) + 303590819100L + ((~(longValue2 | (-1011969397) | j6)) * (-301)) + (((~((~j6) | (-1011969397))) | (~(j7 | j6))) * (-301)) + ((((1011969396 | j6) ^ (-1)) | j7) * 301) + 1919440135;
            int i29 = (int) (j8 >> 32);
            int i30 = ~i;
            int i31 = ~((-224410446) | i30);
            if (((((int) j8) & ((((-1212815965) | i31) * 764) + 963774629 + (((~((-1212815965) | i30)) | 1074397200) * (-1528)) + ((i31 | 1160388881) * 764))) | (((((~(1763058651 | i30)) | (~(1094682233 | i))) * (-370)) + 635053406 + (((~(i30 | 1094682233)) | (~(1763058651 | i)) | 1091961433) * (-370)) + 298804386) & i29)) != 0) {
                i5 = i ^ (i28 + 270);
                break;
            }
            i28++;
            strArr6 = strArr7;
        }
        if (i5 != i) {
            java.lang.Object[] objArr17 = {new int[]{i}, new int[]{i5}, null, null, new int[1]};
            int i32 = ~i;
            java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~((-936531029) | i32)) | 37883924) * (-241)) + 869069004 + (((~(i32 | (-898647105))) | 1076431145) * 241))};
            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj6 == null) {
                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 51, 2713 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                b((byte) (-$$a[14]), r5[16], 653, objArr19);
                obj6 = cls4.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
            }
            ((int[]) objArr17[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr18)).intValue();
            return objArr17;
        }
        java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1781008036);
        if (obj7 == null) {
            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 26, 1864 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (41775 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)));
            byte b5 = (byte) (-$$a[14]);
            byte b6 = (byte) (b5 - 1);
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            b(b5, b6, b6, objArr20);
            obj7 = cls5.getMethod((java.lang.String) objArr20[0], null);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1781008036, obj7);
        }
        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj7).invoke(null, null)).longValue();
        long j9 = i;
        long j10 = ~j9;
        long j11 = ((((((-271) * longValue3) + 20822016306L) + (((~((longValue3 | 76271122) | j9)) | (~(((~longValue3) | (-76271123)) | j10))) * (-272))) + (((~(longValue3 | (-76271123))) | (~((-76271123) | j9))) * (-272))) + ((longValue3 | (~(76271122 | j9))) * 272)) - 2005483984;
        int i33 = ~(1354803068 | i);
        int i34 = ~i;
        int i35 = ~((-985982402) | i34);
        int i36 = (((int) (j11 >> 32)) & (((152371328 | i33) * (-280)) + 701254650 + ((i33 | (~(1502937816 | i))) * 140) + (((~(1507174396 | i)) | (~((-152371329) | i34)) | (~((-4236581) | i34))) * 140))) | ((((((1158676500 | i35) | (~(985982401 | i))) * (-338)) - 646593347) + ((i35 | (~(2144658901 | i))) * 338)) & ((int) j11));
        int i37 = i36 != 0 ? (i36 + 199) ^ i : i;
        if (i37 != i) {
            java.lang.Object[] objArr21 = {new int[]{i}, new int[]{i37}, null, null, new int[1]};
            java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((((~(i | 1770150245)) | ((~((-8523813) | i34)) | (-2042322286))) * (-68)) - 447804819) + ((~((-272172041) | i34)) * (-68)) + (((~(i34 | (-1770150246))) | (-280695853)) * 68))};
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj8 == null) {
                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 50, 2713 - android.text.TextUtils.getOffsetBefore("", 0), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                b((byte) (-$$a[14]), r5[16], 653, objArr23);
                obj8 = cls6.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
            }
            ((int[]) objArr21[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr22)).intValue();
            return objArr21;
        }
        java.lang.Object[] objArr24 = new java.lang.Object[1];
        a(android.view.Gravity.getAbsoluteGravity(0, 0) + 141, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), android.text.TextUtils.getTrimmedLength("") + 20, objArr24);
        java.lang.String intern7 = ((java.lang.String) objArr24[0]).intern();
        java.lang.Object[] objArr25 = new java.lang.Object[1];
        a(161 - (android.os.Process.myTid() >> 22), (char) android.view.KeyEvent.keyCodeFromString(""), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5, objArr25);
        java.lang.Object[] objArr26 = {intern7, ((java.lang.String) objArr25[0]).intern()};
        java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
        if (obj9 == null) {
            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 38, 2212 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            byte b7 = (byte) (-$$a[14]);
            byte b8 = (byte) (b7 - 1);
            java.lang.Object[] objArr27 = new java.lang.Object[1];
            b(b7, b8, b8, objArr27);
            obj9 = cls7.getMethod((java.lang.String) objArr27[0], java.lang.String.class, java.lang.String.class);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj9);
        }
        long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj9).invoke(null, objArr26)).longValue();
        long j12 = (~((~longValue4) | 318557223)) | (~(318557223 | j9));
        long j13 = ((((((-495) * longValue4) + 157685825880L) + (992 * j12)) + ((j12 | (~((j10 | (-318557224)) | longValue4))) * (-496))) + ((longValue4 | j9) * 496)) - 416817378;
        int i38 = ((((int) (j13 >> 32)) & (((((~(1543436031 | i)) | 5259304) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1030346142) + ((~(1543436031 | i34)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))) | (((int) j13) & ((((((~(656799742 | i34)) | (-780426668)) * (-602)) + 1064094986) + ((((~(656799742 | i)) | (-799408128)) | (~((-637818283) | i34))) * (-301))) + ((~((-780426668) | i34)) * 301)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE : i;
        if (i38 != i) {
            java.lang.Object[] objArr28 = {new int[]{i}, new int[]{i38}, null, null, new int[1]};
            java.lang.Object[] objArr29 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~((-276075561) | i)) | 271844352 | (~(1774770537 | i))) * (-754)) + 1611232287 + (((~(i | (-271844353))) | (~(2046614889 | i34))) * (-754)) + (((-276075561) | i34) * 754))};
            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj10 == null) {
                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 50, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 2714, (char) android.text.TextUtils.indexOf("", "", 0));
                java.lang.Object[] objArr30 = new java.lang.Object[1];
                b((byte) (-$$a[14]), r4[16], 653, objArr30);
                obj10 = cls8.getMethod((java.lang.String) objArr30[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
            }
            ((int[]) objArr28[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr29)).intValue();
            return objArr28;
        }
        java.lang.Object[] objArr31 = new java.lang.Object[1];
        a((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 166, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 31, objArr31);
        java.lang.String intern8 = ((java.lang.String) objArr31[0]).intern();
        java.lang.Object[] objArr32 = new java.lang.Object[1];
        a(198 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (17880 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 23 - android.text.TextUtils.getOffsetBefore("", 0), objArr32);
        java.lang.String intern9 = ((java.lang.String) objArr32[0]).intern();
        java.lang.Object[] objArr33 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, (char) (android.os.Process.myPid() >> 22), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 28, objArr33);
        java.lang.String intern10 = ((java.lang.String) objArr33[0]).intern();
        java.lang.Object[] objArr34 = new java.lang.Object[1];
        a((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, (char) (51122 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), 14 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr34);
        java.lang.String[] strArr8 = {intern8, intern9, intern10, ((java.lang.String) objArr34[0]).intern()};
        int i39 = 0;
        for (int i40 = 4; i39 < i40; i40 = 4) {
            int i41 = writeReplace + 105;
            valueOf = i41 % 128;
            if (i41 % 2 == 0) {
                java.lang.Object[] objArr35 = {strArr8[i39]};
                java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                if (obj11 == null) {
                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.text.TextUtils.indexOf("", "", 0), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3161, (char) (33099 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)));
                    byte b9 = $$a[14];
                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                    b((byte) (b9 + 1), (byte) (-b9), androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, objArr36);
                    obj11 = cls9.getMethod((java.lang.String) objArr36[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj11);
                }
                long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj11).invoke(null, objArr35)).longValue();
                strArr4 = strArr8;
                long j14 = ((-520) * longValue5) + 301329623430L + (((~(j10 | longValue5)) | 577259815) * (-1042)) + ((longValue5 | j9) * 521) + (((~((~longValue5) | (-577259816))) | (~((-577259816) | j9)) | (~(longValue5 | j10 | 577259815))) * 521) + 418175088;
                if (((((int) (j14 >> 62)) & ((((1242628432 | r4) * (-280)) - 1317085846) + (((~((-1337682302) | i)) | (~((-99544110) | i))) * 140) + (((~((-95053870) | i)) | (~((-1242628433) | i34)) | (~((-4490241) | i34))) * 140))) | (((int) j14) & (((((~((-602506951) | i34)) | (~(2039733360 | i34))) * (-867)) - 1972008908) + (((~((-602506951) | i)) | 40370822 | (~(2039733360 | i))) * (-1734)) + (((~((-40370823) | i34)) | (~((-562136129) | i)) | (~(2080104182 | i))) * 867)))) != 0) {
                    i6 = i ^ (i39 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    break;
                }
                i39++;
                strArr8 = strArr4;
            } else {
                strArr4 = strArr8;
                java.lang.Object[] objArr37 = {strArr4[i39]};
                java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                if (obj12 == null) {
                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 36, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 3161, (char) (33099 - (android.view.KeyEvent.getMaxKeyCode() >> 16)));
                    byte b10 = $$a[14];
                    java.lang.Object[] objArr38 = new java.lang.Object[1];
                    b((byte) (b10 + 1), (byte) (-b10), androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, objArr38);
                    obj12 = cls10.getMethod((java.lang.String) objArr38[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj12);
                }
                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj12).invoke(null, objArr37)).longValue();
                long j15 = ((565 * longValue6) - 37932105858L) + (((~(longValue6 | j9)) | (~((~longValue6) | j10)) | (-67374967)) * (-564)) + ((~((-67374967) | longValue6 | j9)) * 1128) + (((~(j10 | (-67374967))) | (~(longValue6 | 67374966))) * 564) + 928059937;
                if (((((int) (j15 >> 32)) & ((((((~((-40682189) | i)) | 36471500) * 576) - 1771464918) + (((~((-4210689) | i34)) | 1360072722) * 576)) - 467252480)) | (((int) j15) & ((((~((-1229062149) | i34)) | (~(2043665869 | i))) * (-302)) + 212685919 + ((~((-1229062149) | i)) * (-604)) + (((~(814603721 | i)) | 528705) * 302)))) != 0) {
                    i6 = i ^ (i39 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    break;
                }
                i39++;
                strArr8 = strArr4;
            }
        }
        i6 = i;
        if (i6 != i) {
            writeReplace = (valueOf + 39) % 128;
            java.lang.Object[] objArr39 = {new int[]{i}, new int[]{i6}, null, null, new int[1]};
            java.lang.Object[] objArr40 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~(i | 1606138861)) | 444707236) * (-756)) + 181865981 + ((1606138861 | i34) * 756))};
            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj13 == null) {
                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2713, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                java.lang.Object[] objArr41 = new java.lang.Object[1];
                b((byte) (-$$a[14]), r2[16], 653, objArr41);
                obj13 = cls11.getMethod((java.lang.String) objArr41[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj13);
            }
            ((int[]) objArr39[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj13).invoke(null, objArr40)).intValue();
            return objArr39;
        }
        java.lang.Object[] objArr42 = new java.lang.Object[1];
        a(android.view.View.resolveSizeAndState(0, 0, 0) + 263, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 13, objArr42);
        java.lang.Object[] objArr43 = {((java.lang.String) objArr42[0]).intern()};
        java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
        if (obj14 == null) {
            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.KeyEvent.normalizeMetaState(0), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1921, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
            byte b11 = (byte) (-$$a[14]);
            byte b12 = (byte) (b11 - 1);
            java.lang.Object[] objArr44 = new java.lang.Object[1];
            b(b11, b12, b12, objArr44);
            obj14 = cls12.getMethod((java.lang.String) objArr44[0], java.lang.String.class);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj14);
        }
        java.lang.String str7 = (java.lang.String) ((java.lang.reflect.Method) obj14).invoke(null, objArr43);
        if (str7 != null) {
            java.lang.Object[] objArr45 = new java.lang.Object[1];
            a(android.view.View.getDefaultSize(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 9 - android.text.TextUtils.getTrimmedLength(""), objArr45);
            if (str7.contains(((java.lang.String) objArr45[0]).intern())) {
                i7 = i ^ 250;
                if (i7 == i) {
                    java.lang.Object[] objArr46 = {new int[]{i}, new int[]{i7}, null, null, new int[1]};
                    java.lang.Object[] objArr47 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((((~((-958630221) | i)) | 941754632) * (-283)) - 2015532695) + ((~(i | (-16875589))) * 283))};
                    java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj15 == null) {
                        java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 50, 2713 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) android.graphics.Color.blue(0));
                        java.lang.Object[] objArr48 = new java.lang.Object[1];
                        b((byte) (-$$a[14]), r4[16], 653, objArr48);
                        obj15 = cls13.getMethod((java.lang.String) objArr48[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj15);
                    }
                    ((int[]) objArr46[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr47)).intValue();
                    return objArr46;
                }
                java.lang.Object[] objArr49 = new java.lang.Object[1];
                a(285 - android.view.View.MeasureSpec.getSize(0), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1909), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17, objArr49);
                java.lang.String intern11 = ((java.lang.String) objArr49[0]).intern();
                java.lang.Object[] objArr50 = new java.lang.Object[1];
                a(android.view.View.MeasureSpec.getMode(0) + 302, (char) (android.text.TextUtils.getOffsetAfter("", 0) + 6), 6 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr50);
                java.lang.String intern12 = ((java.lang.String) objArr50[0]).intern();
                java.io.File file = new java.io.File(intern11);
                if (file.exists() && file.isFile()) {
                    try {
                        java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(file));
                        java.lang.Object[] objArr51 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 307, (char) (13642 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 3 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr51);
                        java.util.Scanner useDelimiter = scanner.useDelimiter(((java.lang.String) objArr51[0]).intern());
                        if (useDelimiter.hasNext()) {
                            valueOf = (writeReplace + 7) % 128;
                            str5 = useDelimiter.next();
                        } else {
                            str5 = "";
                        }
                        useDelimiter.close();
                    } catch (java.io.IOException unused) {
                    }
                    if (str5.contains(intern12)) {
                        i8 = i ^ 251;
                        if (i8 == i) {
                            java.lang.Object[] objArr52 = {new int[]{i}, new int[]{i8}, null, null, new int[1]};
                            java.lang.Object[] objArr53 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~((-1667546395) | i34)) * 979) - 1096213960) + ((383299703 | i) * (-979)) + (((~(i | (-1667546395))) | (~(i34 | 383299703))) * 979))};
                            java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj16 == null) {
                                java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myTid() >> 22), 2713 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                java.lang.Object[] objArr54 = new java.lang.Object[1];
                                b((byte) (-$$a[14]), r4[16], 653, objArr54);
                                obj16 = cls14.getMethod((java.lang.String) objArr54[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj16);
                            }
                            ((int[]) objArr52[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, objArr53)).intValue();
                            return objArr52;
                        }
                        java.lang.Object[] objArr55 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 309, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), android.widget.ExpandableListView.getPackedPositionChild(0L) + 24, objArr55);
                        java.lang.Object[] objArr56 = {((java.lang.String) objArr55[0]).intern()};
                        java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj17 == null) {
                            java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 40, 1921 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.text.TextUtils.indexOf("", "", 0, 0));
                            byte b13 = (byte) (-$$a[14]);
                            byte b14 = (byte) (b13 - 1);
                            java.lang.Object[] objArr57 = new java.lang.Object[1];
                            b(b13, b14, b14, objArr57);
                            obj17 = cls15.getMethod((java.lang.String) objArr57[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj17);
                        }
                        java.lang.String lowerCase = ((java.lang.String) ((java.lang.reflect.Method) obj17).invoke(null, objArr56)).toLowerCase();
                        java.lang.Object[] objArr58 = new java.lang.Object[1];
                        a(332 - android.view.MotionEvent.axisFromString(""), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 53504), 4 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr58);
                        int i42 = lowerCase.contains(((java.lang.String) objArr58[0]).intern()) ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE : i;
                        if (i42 != i) {
                            java.lang.Object[] objArr59 = {new int[]{i}, new int[]{i42}, null, null, new int[1]};
                            java.lang.Object[] objArr60 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((r1 * 495) - 1170187086) + (((~(69933143 | i34)) | 67244050) * 495))};
                            java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj18 == null) {
                                java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.green(0), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 2713, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                java.lang.Object[] objArr61 = new java.lang.Object[1];
                                b((byte) (-$$a[14]), r4[16], 653, objArr61);
                                obj18 = cls16.getMethod((java.lang.String) objArr61[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj18);
                            }
                            ((int[]) objArr59[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj18).invoke(null, objArr60)).intValue();
                            return objArr59;
                        }
                        java.lang.Object[] objArr62 = new java.lang.Object[1];
                        a((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, (char) (1908 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), 17 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr62);
                        java.lang.String intern13 = ((java.lang.String) objArr62[0]).intern();
                        java.lang.Object[] objArr63 = new java.lang.Object[1];
                        a(338 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 6 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr63);
                        java.lang.Object[] objArr64 = {intern13, ((java.lang.String) objArr63[0]).intern()};
                        java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                        if (obj19 == null) {
                            java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 39, android.view.KeyEvent.normalizeMetaState(0) + 2213, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                            byte b15 = (byte) (-$$a[14]);
                            byte b16 = (byte) (b15 - 1);
                            java.lang.Object[] objArr65 = new java.lang.Object[1];
                            b(b15, b16, b16, objArr65);
                            obj19 = cls17.getMethod((java.lang.String) objArr65[0], java.lang.String.class, java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj19);
                        }
                        long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, objArr64)).longValue();
                        long j16 = ~longValue7;
                        long j17 = ~(943839075 | j9);
                        long j18 = ~(longValue7 | (-943839076));
                        long j19 = (((((408 * longValue7) - 767341167975L) + (((~(j16 | 943839075)) | j17) * (-814))) + ((((~(j16 | j10)) | j18) | j17) * 407)) + (((j18 | (~(j9 | (-943839076)))) | (~(longValue7 | j9))) * 407)) - 1679213677;
                        if (((((int) j19) & ((((~((-1847809647) | i34)) | 136380484) * (-108)) + 1254378113 + (((~((-410583237) | i)) | (-2122012399) | (~(410583236 | i34))) * 54) + (((-2122012399) | i) * 54))) | (((int) (j19 >> 32)) & ((((((~(1564494970 | i)) | (-1565875707)) | r7) * (-470)) - 84948264) + (((~((-1291865179) | i34)) | (~((-1380737) | i))) * 470)))) != 0) {
                            i9 = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                            str = "";
                        } else {
                            java.lang.Object[] objArr66 = new java.lang.Object[1];
                            a((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 343, (char) android.view.KeyEvent.keyCodeFromString(""), 12 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr66);
                            java.lang.String intern14 = ((java.lang.String) objArr66[0]).intern();
                            java.lang.Object[] objArr67 = new java.lang.Object[1];
                            a(355 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.graphics.Color.blue(0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 9, objArr67);
                            java.lang.Object[] objArr68 = {intern14, ((java.lang.String) objArr67[0]).intern()};
                            java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                            if (obj20 == null) {
                                java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.text.TextUtils.getTrimmedLength(""), 2213 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) android.view.View.resolveSize(0, 0));
                                byte b17 = (byte) (-$$a[14]);
                                byte b18 = (byte) (b17 - 1);
                                java.lang.Object[] objArr69 = new java.lang.Object[1];
                                b(b17, b18, b18, objArr69);
                                obj20 = cls18.getMethod((java.lang.String) objArr69[0], java.lang.String.class, java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj20);
                            }
                            long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, objArr68)).longValue();
                            long j20 = ~longValue8;
                            long j21 = (-835112844) | j20;
                            long j22 = j20 | j10;
                            str = "";
                            long j23 = (((((193 * longValue8) + 161176778699L) + ((j10 | (~(longValue8 | (-835112844)))) * (-192))) + (((~j21) | (~j22)) * (-384))) + ((((~(j21 | j9)) | (~(j22 | 835112843))) | (~((longValue8 | 835112843) | j9))) * 192)) - 1570487445;
                            i9 = ((((int) (j23 >> 32)) & ((((((-709993813) | i34) * 1444) + (-1153123274)) + ((((~((-1212319361) | i)) | 1073873536) | (~((-1645421525) | i))) * (-1444))) + 1514424040)) | (((int) j23) & (((((~(2094116400 | i)) | 763624485) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + (-716340919)) + (((~(2094116400 | i34)) | 16928773) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE : i;
                        }
                        if (i9 != i) {
                            valueOf = (writeReplace + 37) % 128;
                            java.lang.Object[] objArr70 = {new int[]{i}, new int[]{i9}, null, null, new int[1]};
                            int i43 = ~(1557489967 | i34);
                            java.lang.Object[] objArr71 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((1083533581 | i43) * (-970)) + 635238399 + ((i43 | 473956386) * 970))};
                            java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj21 == null) {
                                java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2713 - android.graphics.Color.red(0), (char) (android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                                java.lang.Object[] objArr72 = new java.lang.Object[1];
                                b((byte) (-$$a[14]), r4[16], 653, objArr72);
                                obj21 = cls19.getMethod((java.lang.String) objArr72[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj21);
                            }
                            ((int[]) objArr70[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr71)).intValue();
                            return objArr70;
                        }
                        java.lang.String str8 = str;
                        java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1102036426);
                        if (obj22 == null) {
                            java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 44, 2763 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                            byte b19 = (byte) (-$$a[14]);
                            byte b20 = (byte) (b19 - 1);
                            java.lang.Object[] objArr73 = new java.lang.Object[1];
                            b(b19, b20, b20, objArr73);
                            obj22 = cls20.getMethod((java.lang.String) objArr73[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1102036426, obj22);
                        }
                        long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj22).invoke(null, null)).longValue();
                        long j24 = ~((-1752822055) | longValue9);
                        long j25 = 1752822054 | (~longValue9);
                        long j26 = (1435 * longValue9) + 1255020591380L + ((1752822054 | longValue9) * (-1434)) + (((~(j10 | longValue9)) | j24 | (~(j25 | j9))) * 717) + (((~(j25 | j10)) | j24 | (~(longValue9 | j9))) * 717) + 1877858818;
                        int i44 = ~(2091852191 | i);
                        if (((((int) (j26 >> 32)) & (((((~(i34 | 1268252585)) | 168973825) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) - 356542710) + (((~(i34 | 1259560865)) | 177665545) * (-440)) + ((1268252585 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))) | (((int) j26) & ((((1342775561 | i44) * (-196)) - 1036352927) + ((i44 | 749076630) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE)))) == 1) {
                            java.lang.Object[] objArr74 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                            java.lang.Object[] objArr75 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((((~(i | 1609526639)) | 441319458) * (-756)) - 645487059) + ((i34 | 1609526639) * 756))};
                            java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj23 == null) {
                                java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength(str8) + 50, 2713 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.os.Process.myPid() >> 22));
                                java.lang.Object[] objArr76 = new java.lang.Object[1];
                                b((byte) (-$$a[14]), r4[16], 653, objArr76);
                                obj23 = cls21.getMethod((java.lang.String) objArr76[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj23);
                            }
                            ((int[]) objArr74[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr75)).intValue();
                            return objArr74;
                        }
                        java.lang.Object[] objArr77 = {1};
                        java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                        if (obj24 == null) {
                            str2 = str8;
                            java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 26, 2363 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                            byte b21 = (byte) (-$$a[14]);
                            byte b22 = (byte) (b21 - 1);
                            java.lang.Object[] objArr78 = new java.lang.Object[1];
                            b(b21, b22, b22, objArr78);
                            obj24 = cls22.getMethod((java.lang.String) objArr78[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj24);
                        } else {
                            str2 = str8;
                        }
                        long j27 = ~((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr77)).longValue();
                        long j28 = (-710964081) | j27;
                        long j29 = ((r4 * (-344)) - 244571643520L) + (((~j28) | (~(j9 | (-710964081)))) * 345) + (((~(j27 | 710964080)) | (~(j10 | (-710964081)))) * 345) + ((~(j28 | j9)) * 345) + 696946119;
                        int i45 = (int) (j29 >> 32);
                        int i46 = ~(i34 | 2055438859);
                        int i47 = ((((int) j29) & ((((1342276097 | i46) * (-970)) - 1082647493) + ((i46 | 713162762) * 970))) | (((((((~(i34 | (-538552139))) | 1573642) | (~((-1438800054) | i))) * 717) + (-113388171)) + (((~((-538552139) | i)) | ((~(i34 | (-1438800054))) | 1573642)) * 717)) & i45)) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE : i;
                        if (i47 != i) {
                            valueOf = (writeReplace + 11) % 128;
                            java.lang.Object[] objArr79 = {new int[]{i}, new int[]{i47}, null, null, new int[1]};
                            java.lang.Object[] objArr80 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~(i34 | 1512945352)) | (-2049947338) | (~((-898761) | i))) * 717) + 494953504 + (((~(i | 1512945352)) | (~(i34 | (-898761))) | (-2049947338)) * 717))};
                            java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj25 == null) {
                                java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                java.lang.Object[] objArr81 = new java.lang.Object[1];
                                b((byte) (-$$a[14]), r2[16], 653, objArr81);
                                obj25 = cls23.getMethod((java.lang.String) objArr81[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj25);
                            }
                            ((int[]) objArr79[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj25).invoke(null, objArr80)).intValue();
                            return objArr79;
                        }
                        java.lang.Object[] objArr82 = new java.lang.Object[1];
                        a((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 310, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), 22 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr82);
                        java.lang.Object[] objArr83 = {((java.lang.String) objArr82[0]).intern()};
                        java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj26 == null) {
                            java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter(str2, 0) + 40, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1920, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                            byte b23 = (byte) (-$$a[14]);
                            byte b24 = (byte) (b23 - 1);
                            java.lang.Object[] objArr84 = new java.lang.Object[1];
                            b(b23, b24, b24, objArr84);
                            obj26 = cls24.getMethod((java.lang.String) objArr84[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj26);
                        }
                        java.lang.Object invoke2 = ((java.lang.reflect.Method) obj26).invoke(null, objArr83);
                        if (invoke2 != null) {
                            java.lang.Object[] objArr85 = {invoke2, 42};
                            java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj27 == null) {
                                java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 28, 2594 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                byte b25 = (byte) (-$$a[14]);
                                byte b26 = (byte) (b25 - 1);
                                java.lang.Object[] objArr86 = new java.lang.Object[1];
                                b(b25, b26, b26, objArr86);
                                obj27 = cls25.getMethod((java.lang.String) objArr86[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj27);
                            }
                            long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr85)).longValue();
                            long j30 = ~longValue10;
                            long j31 = (((-97) * longValue10) - 37471219400L) + (((~(j30 | (-749424388))) | (~(j30 | j10))) * 98) + (((~(j10 | 749424387)) | j30 | (~(j9 | (-749424388)))) * (-49)) + (((~(j30 | j9)) | (~(longValue10 | (-749424388)))) * 49) + 2006524912;
                            if (((((int) (j31 >> 32)) & ((((i34 | 1610285053) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 1988922870) + (((~(i34 | 1607650556)) | 1442495405) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))) | (((int) j31) & (((((~(i34 | 804778855)) | 632447554) * (-591)) - 205810198) + ((804778855 | i) * 591)))) == 1986687685) {
                                valueOf = (writeReplace + 51) % 128;
                                i10 = i;
                                j = j9;
                                java.lang.Object[] objArr87 = new java.lang.Object[1];
                                a(446 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 46853), 15 - android.view.MotionEvent.axisFromString(str2), objArr87);
                                java.lang.Object[] objArr88 = {((java.lang.String) objArr87[0]).intern()};
                                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj == null) {
                                    java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1921, (char) android.graphics.Color.green(0));
                                    byte b27 = (byte) (-$$a[14]);
                                    byte b28 = (byte) (b27 - 1);
                                    java.lang.Object[] objArr89 = new java.lang.Object[1];
                                    b(b27, b28, b28, objArr89);
                                    obj = cls26.getMethod((java.lang.String) objArr89[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj);
                                }
                                invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr88);
                                if (invoke != null) {
                                    str4 = str2;
                                    i13 = i10;
                                    i14 = 0;
                                } else {
                                    java.lang.Object[] objArr90 = {invoke, 42};
                                    java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                    if (obj28 == null) {
                                        java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2594 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1));
                                        byte b29 = (byte) (-$$a[14]);
                                        byte b30 = (byte) (b29 - 1);
                                        java.lang.Object[] objArr91 = new java.lang.Object[1];
                                        b(b29, b30, b30, objArr91);
                                        obj28 = cls27.getMethod((java.lang.String) objArr91[0], java.lang.String.class, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj28);
                                    }
                                    long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj28).invoke(null, objArr90)).longValue();
                                    long j32 = ~longValue11;
                                    long j33 = (-67768593) | j32;
                                    str4 = str2;
                                    long j34 = (868 * longValue11) + 58823137856L + (((~(j10 | (-67768593))) | (~(j32 | j10))) * (-867)) + (((~j33) | (~((-67768593) | j)) | (~(j32 | j))) * (-1734)) + (((~(longValue11 | (-67768593) | j)) | (~(j33 | j10)) | (~(j32 | 67768592 | j))) * 867) + 1189331932;
                                    i13 = i;
                                    i14 = (((int) (j34 >> 32)) & ((((~((-2017418652) | i13)) | 1479170059) * 336) + 501358106 + (((~((-580192241) | i13)) | 41943648) * (-168)) + (((~(i34 | (-580192241))) | (-2017418652)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))) | (((int) j34) & ((((~(i34 | 116342053)) | 1477477066) * (-160)) + 1596010869 + (((~(i34 | 1553568463)) | 116342053) * 160)));
                                }
                                if (i14 != 1986687685 && i14 != -1514516938) {
                                    java.lang.Object[] objArr92 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1161, (char) (31888 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), android.view.View.MeasureSpec.getMode(0) + 14, objArr92);
                                    java.lang.String intern15 = ((java.lang.String) objArr92[0]).intern();
                                    java.lang.String str9 = str4;
                                    java.lang.Object[] objArr93 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1175, (char) android.widget.ExpandableListView.getPackedPositionType(0L), android.text.TextUtils.indexOf(str9, str9, 0) + 26, objArr93);
                                    java.lang.String intern16 = ((java.lang.String) objArr93[0]).intern();
                                    java.lang.Object[] objArr94 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1200, (char) (24974 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), 17 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr94);
                                    java.lang.String intern17 = ((java.lang.String) objArr94[0]).intern();
                                    java.lang.Object[] objArr95 = new java.lang.Object[1];
                                    a(1218 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) android.text.TextUtils.indexOf(str9, str9, 0, 0), android.widget.ExpandableListView.getPackedPositionType(0L) + 17, objArr95);
                                    java.lang.String intern18 = ((java.lang.String) objArr95[0]).intern();
                                    java.lang.Object[] objArr96 = new java.lang.Object[1];
                                    a(1236 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15, objArr96);
                                    java.lang.String intern19 = ((java.lang.String) objArr96[0]).intern();
                                    java.lang.Object[] objArr97 = new java.lang.Object[1];
                                    a(1249 - android.view.MotionEvent.axisFromString(str9), (char) (40195 - android.text.TextUtils.getOffsetBefore(str9, 0)), 36 - android.view.MotionEvent.axisFromString(str9), objArr97);
                                    java.lang.String intern20 = ((java.lang.String) objArr97[0]).intern();
                                    java.lang.Object[] objArr98 = new java.lang.Object[1];
                                    a(1287 - android.text.TextUtils.getOffsetBefore(str9, 0), (char) android.text.TextUtils.getOffsetAfter(str9, 0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12, objArr98);
                                    java.lang.String intern21 = ((java.lang.String) objArr98[0]).intern();
                                    java.lang.Object[] objArr99 = new java.lang.Object[1];
                                    a(android.text.TextUtils.getTrimmedLength(str9) + 1299, (char) (48425 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), 14 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr99);
                                    java.lang.String intern22 = ((java.lang.String) objArr99[0]).intern();
                                    java.lang.Object[] objArr100 = new java.lang.Object[1];
                                    a(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 1312, (char) android.view.KeyEvent.getDeadChar(0, 0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, objArr100);
                                    java.lang.String intern23 = ((java.lang.String) objArr100[0]).intern();
                                    java.lang.Object[] objArr101 = new java.lang.Object[1];
                                    a(android.view.View.combineMeasuredStates(0, 0) + 1334, (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 45307), 31 - android.text.TextUtils.getOffsetBefore(str9, 0), objArr101);
                                    java.lang.String intern24 = ((java.lang.String) objArr101[0]).intern();
                                    java.lang.Object[] objArr102 = new java.lang.Object[1];
                                    a((android.view.KeyEvent.getMaxKeyCode() >> 16) + 1365, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 55665), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11, objArr102);
                                    java.lang.String intern25 = ((java.lang.String) objArr102[0]).intern();
                                    java.lang.Object[] objArr103 = new java.lang.Object[1];
                                    a(1377 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43799), 11 - android.os.Process.getGidForName(str9), objArr103);
                                    java.lang.String intern26 = ((java.lang.String) objArr103[0]).intern();
                                    java.lang.Object[] objArr104 = new java.lang.Object[1];
                                    a(android.view.MotionEvent.axisFromString(str9) + 1390, (char) (android.os.Process.myPid() >> 22), android.text.TextUtils.getOffsetAfter(str9, 0) + 12, objArr104);
                                    java.lang.String intern27 = ((java.lang.String) objArr104[0]).intern();
                                    java.lang.Object[] objArr105 = new java.lang.Object[1];
                                    a(1401 - android.text.TextUtils.getTrimmedLength(str9), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12, objArr105);
                                    java.lang.String intern28 = ((java.lang.String) objArr105[0]).intern();
                                    java.lang.Object[] objArr106 = new java.lang.Object[1];
                                    a(android.view.KeyEvent.normalizeMetaState(0) + 1413, (char) android.graphics.Color.blue(0), 12 - android.view.View.getDefaultSize(0, 0), objArr106);
                                    java.lang.String intern29 = ((java.lang.String) objArr106[0]).intern();
                                    java.lang.Object[] objArr107 = new java.lang.Object[1];
                                    a(android.text.TextUtils.indexOf(str9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1426, (char) android.text.TextUtils.indexOf(str9, str9, 0, 0), 14 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr107);
                                    java.lang.String intern30 = ((java.lang.String) objArr107[0]).intern();
                                    java.lang.Object[] objArr108 = new java.lang.Object[1];
                                    a(android.widget.ExpandableListView.getPackedPositionChild(0L) + com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_WIDTH, (char) (20684 - android.view.Gravity.getAbsoluteGravity(0, 0)), (android.os.Process.myPid() >> 22) + 12, objArr108);
                                    java.lang.String intern31 = ((java.lang.String) objArr108[0]).intern();
                                    java.lang.Object[] objArr109 = new java.lang.Object[1];
                                    a((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1451, (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 21000), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 24, objArr109);
                                    java.lang.String intern32 = ((java.lang.String) objArr109[0]).intern();
                                    java.lang.Object[] objArr110 = new java.lang.Object[1];
                                    a(1475 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) android.view.View.combineMeasuredStates(0, 0), android.view.MotionEvent.axisFromString(str9) + 29, objArr110);
                                    java.lang.String[] strArr9 = {intern15, intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, intern29, intern30, intern31, intern32, ((java.lang.String) objArr110[0]).intern()};
                                    i18 = 0;
                                    while (i18 < 19) {
                                        java.lang.String str10 = strArr9[i18];
                                        java.lang.Object[] objArr111 = {str10};
                                        java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                        if (obj29 == null) {
                                            java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 35, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3160, (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 33099));
                                            byte b31 = (byte) (-$$a[14]);
                                            byte b32 = (byte) (b31 - 1);
                                            java.lang.Object[] objArr112 = new java.lang.Object[1];
                                            b(b31, b32, b32, objArr112);
                                            obj29 = cls28.getMethod((java.lang.String) objArr112[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj29);
                                        }
                                        long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj29).invoke(null, objArr111)).longValue();
                                        long j35 = ~((~longValue12) | j);
                                        java.lang.String[] strArr10 = strArr9;
                                        int i48 = i18;
                                        long j36 = ((((((-574) * longValue12) - 241707314268L) + (((~(j10 | (-421092883))) | j35) * 1150)) + (((~(j10 | longValue12)) | j35) * (-575))) + (((~((-421092883) | j)) | (~(j10 | 421092882))) * 575)) - 1758760990;
                                        if (((((int) (j36 >> 32)) & ((((65536 | i13) * 988) - 1025533950) + (((~(i34 | (-1476303440))) | 94931530) * (-1976)) + (((~(1381437445 | i13)) | 65536 | (~(i34 | (-1381437446)))) * 988))) | (((int) j36) & ((((~(i34 | (-331782))) * 130) - 591207093) + (((~((-331782) | i13)) | 92275008) * 130)))) == 0) {
                                            java.lang.Object[] objArr113 = new java.lang.Object[1];
                                            a(1425 - android.text.TextUtils.getOffsetBefore(str9, 0), (char) android.view.View.resolveSizeAndState(0, 0, 0), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 13, objArr113);
                                            if (str10.equals(((java.lang.String) objArr113[0]).intern())) {
                                                java.lang.Object[] objArr114 = {str10};
                                                java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                if (obj30 == null) {
                                                    java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 36, android.text.TextUtils.indexOf(str9, str9, 0) + 3161, (char) (33099 - android.view.KeyEvent.keyCodeFromString(str9)));
                                                    byte b33 = $$a[14];
                                                    java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                    b((byte) (b33 + 1), (byte) (-b33), androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, objArr115);
                                                    obj30 = cls29.getMethod((java.lang.String) objArr115[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj30);
                                                }
                                                long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj30).invoke(null, objArr114)).longValue();
                                                long j37 = ~longValue13;
                                                str4 = str9;
                                                long j38 = (((-675) * longValue13) - 670198591939L) + (((-989953607) | j | j37) * (-676)) + (((~(j10 | (-989953607))) | (~((-989953607) | j37))) * 676) + (((~(longValue13 | (-989953607) | j)) | (~(989953606 | j37)) | (~(j37 | j10))) * 676) + 1985388510;
                                                if (((((int) (j38 >> 32)) & ((((~(i34 | 863749963)) | 1149247488) * 98) + 1264069592 + (((~(i34 | 1993990921)) | 863749963 | (~((-1993990922) | i13))) * (-49)) + (((~(863749963 | i13)) | 844743433) * 49))) | (((int) j38) & (((~((-1416818205) | i13)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 1452024733 + (((~(i34 | (-1416818205))) | (-1433923486)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING)))) != 0) {
                                                    writeReplace = (valueOf + 95) % 128;
                                                }
                                            } else {
                                                str4 = str9;
                                            }
                                            i18 = i48 + 1;
                                            strArr9 = strArr10;
                                            str9 = str4;
                                        } else {
                                            str4 = str9;
                                        }
                                        i19 = i48;
                                    }
                                    str4 = str9;
                                    i19 = -1;
                                    if (i19 >= 0 && (i20 = i13 ^ (i19 + 130)) != i13) {
                                        java.lang.Object[] objArr116 = {new int[]{i13}, new int[]{i20}, null, null, new int[1]};
                                        java.lang.Object[] objArr117 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~(i34 | 140024467)) | (-2046614272)) * 529) + 321706580 + (((~(i13 | 140024467)) | (-1910821631)) * 529))};
                                        obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj2 == null) {
                                            java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.KeyEvent.normalizeMetaState(0), android.view.View.combineMeasuredStates(0, 0) + 2713, (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
                                            java.lang.Object[] objArr118 = new java.lang.Object[1];
                                            b((byte) (-$$a[14]), r3[16], 653, objArr118);
                                            obj2 = cls30.getMethod((java.lang.String) objArr118[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                                        }
                                        ((int[]) objArr116[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr117)).intValue();
                                        return objArr116;
                                    }
                                }
                                java.lang.Object[] objArr119 = new java.lang.Object[1];
                                a(1503 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (33312 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 13, objArr119);
                                java.lang.String intern33 = ((java.lang.String) objArr119[0]).intern();
                                java.lang.Object[] objArr120 = new java.lang.Object[1];
                                a((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1516, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 5, objArr120);
                                java.lang.String[] strArr11 = {intern33, ((java.lang.String) objArr120[0]).intern()};
                                java.lang.Object[] objArr121 = new java.lang.Object[1];
                                a(1521 - android.view.View.MeasureSpec.getSize(0), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 14 - android.view.MotionEvent.axisFromString(str4), objArr121);
                                java.lang.String intern34 = ((java.lang.String) objArr121[0]).intern();
                                java.lang.Object[] objArr122 = new java.lang.Object[1];
                                a(1536 - android.text.TextUtils.getTrimmedLength(str4), (char) android.graphics.Color.blue(0), 19 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr122);
                                java.lang.String intern35 = ((java.lang.String) objArr122[0]).intern();
                                java.lang.Object[] objArr123 = new java.lang.Object[1];
                                a(1555 - android.view.View.getDefaultSize(0, 0), (char) (65059 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.SI, objArr123);
                                java.lang.String[] strArr12 = {intern34, intern35, ((java.lang.String) objArr123[0]).intern()};
                                java.lang.String str11 = str4;
                                java.lang.Object[] objArr124 = new java.lang.Object[1];
                                a(1569 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.indexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 57357), 20 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr124);
                                java.lang.String intern36 = ((java.lang.String) objArr124[0]).intern();
                                java.lang.Object[] objArr125 = new java.lang.Object[1];
                                a(1638 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.KeyEvent.getDeadChar(0, 0), 9 - android.view.MotionEvent.axisFromString(str11), objArr125);
                                java.lang.String[] strArr13 = {intern36, ((java.lang.String) objArr125[0]).intern()};
                                java.lang.Object[] objArr126 = new java.lang.Object[1];
                                a((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1599, (char) (52146 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 11, objArr126);
                                c2 = 0;
                                java.lang.String intern37 = ((java.lang.String) objArr126[0]).intern();
                                java.lang.Object[] objArr127 = new java.lang.Object[1];
                                a((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 336, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), 6 - android.view.View.resolveSizeAndState(0, 0, 0), objArr127);
                                java.lang.String[] strArr14 = {intern37, ((java.lang.String) objArr127[0]).intern()};
                                java.lang.Object[] objArr128 = new java.lang.Object[1];
                                a(android.text.TextUtils.lastIndexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1612, (char) android.graphics.Color.argb(0, 0, 0, 0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27, objArr128);
                                java.lang.String intern38 = ((java.lang.String) objArr128[0]).intern();
                                java.lang.Object[] objArr129 = new java.lang.Object[1];
                                a(android.text.TextUtils.getCapsMode(str11, 0, 0) + 1590, (char) android.text.TextUtils.indexOf(str11, str11), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '&', objArr129);
                                java.lang.String[][] strArr15 = {strArr11, strArr12, strArr13, strArr14, new java.lang.String[]{intern38, ((java.lang.String) objArr129[0]).intern()}};
                                int i49 = -1;
                                i15 = 0;
                                loop4: while (true) {
                                    if (i15 < 5) {
                                        i16 = i13;
                                        break;
                                    }
                                    java.lang.String[] strArr16 = strArr15[i15];
                                    java.lang.String str12 = strArr16[c2];
                                    java.lang.String[] strArr17 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr16, 1, strArr16.length);
                                    int length = strArr17.length;
                                    int i50 = 0;
                                    while (i50 < length) {
                                        java.lang.Object[] objArr130 = {str12, strArr17[i50]};
                                        java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                        if (obj31 == null) {
                                            java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 39, android.view.Gravity.getAbsoluteGravity(0, 0) + 2213, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                            byte b34 = (byte) (-$$a[14]);
                                            byte b35 = (byte) (b34 - 1);
                                            strArr2 = strArr17;
                                            strArr3 = strArr15;
                                            java.lang.Object[] objArr131 = new java.lang.Object[1];
                                            b(b34, b35, b35, objArr131);
                                            obj31 = cls31.getMethod((java.lang.String) objArr131[0], java.lang.String.class, java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj31);
                                        } else {
                                            strArr2 = strArr17;
                                            strArr3 = strArr15;
                                        }
                                        long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj31).invoke(null, objArr130)).longValue();
                                        int i51 = length;
                                        java.lang.String str13 = str12;
                                        long j39 = ((((((-520) * longValue14) + 107857572966L) + (((~(j10 | longValue14)) | 206623703) * (-1042))) + ((longValue14 | j) * 521)) + (((~(longValue14 | (j10 | 206623703))) | ((~((~longValue14) | (-206623704))) | (~((-206623704) | j)))) * 521)) - 941998305;
                                        if (((((int) (j39 >> 32)) & ((((~(1233355350 | i13)) | 1624385534) * (-318)) + 1230773338 + (((~(1624385534 | i13)) | (~(i34 | (-1082262103)))) * 318) + (((~(i34 | (-151093249))) | (~((-1082262103) | i13))) * 318))) | (((int) j39) & ((((~(i34 | (-1313457666))) | 104891904 | (~(1332334505 | i13))) * 717) + 1314482858 + (((~((-1313457666) | i13)) | (~(i34 | 1332334505)) | 104891904) * 717)))) != 0) {
                                            i16 = i13 ^ (i49 + 171);
                                            break loop4;
                                        }
                                        i50++;
                                        valueOf = (writeReplace + 19) % 128;
                                        i49++;
                                        strArr17 = strArr2;
                                        strArr15 = strArr3;
                                        str12 = str13;
                                        length = i51;
                                    }
                                    i15++;
                                    c2 = 0;
                                }
                                if (i16 == i13) {
                                    java.lang.Object[] objArr132 = {new int[]{i13}, new int[]{i16}, null, null, new int[1]};
                                    java.lang.Object[] objArr133 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~((-201326613) | i13)) | (~(1849519485 | i13))) * 69) + 546406174 + (((~(i13 | 1845521524)) | (~((-205324574) | i13)) | 3997961) * (-69)) + 1780299232)};
                                    java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj32 == null) {
                                        java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.graphics.ImageFormat.getBitsPerPixel(0), 2713 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.os.Process.myTid() >> 22));
                                        java.lang.Object[] objArr134 = new java.lang.Object[1];
                                        b((byte) (-$$a[14]), r3[16], 653, objArr134);
                                        obj32 = cls32.getMethod((java.lang.String) objArr134[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj32);
                                    }
                                    ((int[]) objArr132[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr133)).intValue();
                                    return objArr132;
                                }
                                try {
                                    java.lang.Object[] objArr135 = new java.lang.Object[1];
                                    a(1638 - android.text.TextUtils.indexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.Gravity.getAbsoluteGravity(0, 0), 14 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr135);
                                    java.lang.String intern39 = ((java.lang.String) objArr135[0]).intern();
                                    java.lang.Object[] objArr136 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1652, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 8 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr136);
                                    try {
                                        java.lang.Object[] objArr137 = {intern39, ((java.lang.String) objArr136[0]).intern()};
                                        java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                        if (obj33 == null) {
                                            java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.text.TextUtils.indexOf(str11, str11), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2212, (char) ((-1) - android.text.TextUtils.lastIndexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                            byte b36 = (byte) (-$$a[14]);
                                            byte b37 = (byte) (b36 - 1);
                                            java.lang.Object[] objArr138 = new java.lang.Object[1];
                                            b(b36, b37, b37, objArr138);
                                            obj33 = cls33.getMethod((java.lang.String) objArr138[0], java.lang.String.class, java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj33);
                                        }
                                        long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj33).invoke(null, objArr137)).longValue();
                                        long j40 = ~longValue15;
                                        long j41 = ~(25076023 | j40 | j);
                                        long j42 = ((((((-475) * longValue15) + 11961262971L) + (((~(longValue15 | (-25076024))) | j41) * (-476))) + (j41 * 952)) + ((~((j40 | j10) | 25076023)) * 476)) - 760450625;
                                        int i52 = ~((-1999283840) | i13);
                                        int i53 = ~(547758101 | i13);
                                        i17 = ((((int) (j42 >> 32)) & (((((553648212 | i52) * (-280)) + (-752248934)) + ((i52 | (~(562057428 | i13))) * 140)) + ((((~((-1445635628) | i13)) | (~(i34 | (-553648213)))) | (~(i34 | 2007693055))) * 140))) | ((((((1984984511 | i53) * (-220)) + (-2008413221)) + ((i53 | 1448105386) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) - 1574489978) & ((int) j42))) != 0 ? i13 ^ 150 : i13;
                                    } catch (java.lang.Throwable th2) {
                                        java.lang.Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                } catch (java.lang.Exception unused2) {
                                    i17 = i13 ^ 151;
                                }
                                if (i17 != i13) {
                                    java.lang.Object[] objArr139 = {new int[]{i13}, new int[]{i17}, null, null, new int[1]};
                                    java.lang.Object[] objArr140 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((((~(i34 | (-749490898))) | 539770897) | r1) * (-713)) - 586378006) + ((~((-1091635201) | i13)) * 1426) + ((~(i34 | (-1301355201))) * 713))};
                                    java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj34 == null) {
                                        java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2713, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                        java.lang.Object[] objArr141 = new java.lang.Object[1];
                                        b((byte) (-$$a[14]), r3[16], 653, objArr141);
                                        obj34 = cls34.getMethod((java.lang.String) objArr141[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj34);
                                    }
                                    ((int[]) objArr139[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr140)).intValue();
                                    return objArr139;
                                }
                                int red = android.graphics.Color.red(0);
                                char c3 = (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                int indexOf = android.text.TextUtils.indexOf(str11, str11);
                                java.lang.Object[] objArr142 = new java.lang.Object[1];
                                a(red + 1660, c3, indexOf + 47, objArr142);
                                java.lang.Object[] objArr143 = {((java.lang.String) objArr142[0]).intern()};
                                java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                if (obj35 == null) {
                                    java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 3161 - android.view.View.resolveSize(0, 0), (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 33099));
                                    byte b38 = $$a[14];
                                    java.lang.Object[] objArr144 = new java.lang.Object[1];
                                    b((byte) (b38 + 1), (byte) (-b38), androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, objArr144);
                                    obj35 = cls35.getMethod((java.lang.String) objArr144[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj35);
                                }
                                long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj35).invoke(null, objArr143)).longValue();
                                long j43 = ~longValue16;
                                long j44 = j43 | j10;
                                long j45 = (((-112) * longValue16) - 96100346832L) + (((~j44) | 858038811) * 226) + (((~(longValue16 | (-858038812))) | (~((-858038812) | j)) | (~(858038811 | j44))) * (-113)) + ((~(j43 | j)) * 113) + 137396092;
                                int i54 = (((((int) (j45 >> 32)) & (((((~(i34 | (-8391435))) * 52) - 126854998) + (((~(i34 | (-9707275))) | ((~(i34 | (-1446933686))) | 1315840)) * (-52))) + (((~(i34 | 9707274)) | (-1455325120)) * 52))) | (((int) j45) & ((((((~(i34 | 337791509)) | (-2112806848)) * (-108)) - 625690887) + ((((~(1775017919 | i)) | 2581) | (~(i34 | (-1775017920)))) * 54)) + ((i | 2581) * 54)))) * 263) ^ i;
                                if (i54 == i) {
                                    java.lang.Object[] objArr145 = {new int[]{i}, new int[]{i}, null, null, new int[1]};
                                    int i55 = ~(74671264 | i);
                                    java.lang.Object[] objArr146 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf((((1907977297 | i55) * (-658)) - 114264687) + ((i55 | 1904740433) * 658))};
                                    java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj36 == null) {
                                        java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 50, 2713 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                        java.lang.Object[] objArr147 = new java.lang.Object[1];
                                        b((byte) (-$$a[14]), r3[16], 653, objArr147);
                                        obj36 = cls36.getMethod((java.lang.String) objArr147[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj36);
                                    }
                                    ((int[]) objArr145[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr146)).intValue();
                                    return objArr145;
                                }
                                valueOf = (writeReplace + 11) % 128;
                                java.lang.Object[] objArr148 = {new int[]{i}, new int[]{i54}, null, null, new int[1]};
                                int i56 = ~(i34 | (-527259005));
                                java.lang.Object[] objArr149 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf(((((1083181057 | i56) | (~(527259004 | i))) * (-338)) - 1201144093) + ((i56 | (~(i | 1610440061))) * 338))};
                                java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj37 == null) {
                                    java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 50, android.view.View.MeasureSpec.getSize(0) + 2713, (char) android.view.View.getDefaultSize(0, 0));
                                    java.lang.Object[] objArr150 = new java.lang.Object[1];
                                    b((byte) (-$$a[14]), r3[16], 653, objArr150);
                                    obj37 = cls37.getMethod((java.lang.String) objArr150[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj37);
                                }
                                ((int[]) objArr148[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr149)).intValue();
                                return objArr148;
                            }
                        }
                        java.lang.Object[] objArr151 = new java.lang.Object[1];
                        a(310 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) android.text.TextUtils.getCapsMode(str2, 0, 0), android.view.KeyEvent.getDeadChar(0, 0) + 23, objArr151);
                        java.lang.String intern40 = ((java.lang.String) objArr151[0]).intern();
                        java.lang.Object[] objArr152 = new java.lang.Object[1];
                        a(365 - android.text.TextUtils.getTrimmedLength(str2), (char) (22427 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), 10 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr152);
                        java.lang.String intern41 = ((java.lang.String) objArr152[0]).intern();
                        java.lang.Object[] objArr153 = new java.lang.Object[1];
                        a(375 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), android.view.View.resolveSizeAndState(0, 0, 0) + 7, objArr153);
                        java.lang.String intern42 = ((java.lang.String) objArr153[0]).intern();
                        java.lang.Object[] objArr154 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 382, (char) (13373 - android.text.TextUtils.indexOf(str2, str2, 0, 0)), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 9, objArr154);
                        java.lang.String[] strArr18 = {intern40, intern41, intern42, ((java.lang.String) objArr154[0]).intern()};
                        java.lang.Object[] objArr155 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 390, (char) (64406 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 17 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr155);
                        java.lang.String intern43 = ((java.lang.String) objArr155[0]).intern();
                        java.lang.Object[] objArr156 = new java.lang.Object[1];
                        a(407 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), android.graphics.Color.red(0) + 7, objArr156);
                        java.lang.String intern44 = ((java.lang.String) objArr156[0]).intern();
                        java.lang.Object[] objArr157 = new java.lang.Object[1];
                        a(414 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 7, objArr157);
                        java.lang.String intern45 = ((java.lang.String) objArr157[0]).intern();
                        java.lang.Object[] objArr158 = new java.lang.Object[1];
                        a(421 - (android.os.Process.myTid() >> 22), (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), android.view.MotionEvent.axisFromString(str2) + 12, objArr158);
                        java.lang.String intern46 = ((java.lang.String) objArr158[0]).intern();
                        java.lang.Object[] objArr159 = new java.lang.Object[1];
                        a(android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 433, (char) (47289 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 13 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr159);
                        java.lang.String[] strArr19 = {intern43, intern44, intern45, intern46, ((java.lang.String) objArr159[0]).intern()};
                        java.lang.Object[] objArr160 = new java.lang.Object[1];
                        a(android.view.View.combineMeasuredStates(0, 0) + 446, (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 46853), 16 - android.text.TextUtils.indexOf(str2, str2, 0, 0), objArr160);
                        java.lang.String intern47 = ((java.lang.String) objArr160[0]).intern();
                        java.lang.Object[] objArr161 = new java.lang.Object[1];
                        a(android.view.MotionEvent.axisFromString(str2) + 463, (char) android.view.KeyEvent.getDeadChar(0, 0), 3 - android.text.TextUtils.getOffsetAfter(str2, 0), objArr161);
                        java.lang.String intern48 = ((java.lang.String) objArr161[0]).intern();
                        java.lang.Object[] objArr162 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getTouchSlop() >> 8) + 473, (char) (android.view.KeyEvent.normalizeMetaState(0) + 5755), 22 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr162);
                        java.lang.String intern49 = ((java.lang.String) objArr162[0]).intern();
                        java.lang.Object[] objArr163 = new java.lang.Object[1];
                        a(android.text.TextUtils.getOffsetBefore(str2, 0) + 495, (char) android.text.TextUtils.indexOf(str2, str2), 25 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr163);
                        java.lang.String intern50 = ((java.lang.String) objArr163[0]).intern();
                        java.lang.Object[] objArr164 = new java.lang.Object[1];
                        a(android.text.TextUtils.getOffsetBefore(str2, 0) + my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL, (char) android.view.View.MeasureSpec.getMode(0), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 28, objArr164);
                        j = j9;
                        java.lang.String[] strArr20 = {intern47, intern48, intern, intern49, intern50, ((java.lang.String) objArr164[0]).intern()};
                        java.lang.Object[] objArr165 = new java.lang.Object[1];
                        a(596 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.text.TextUtils.indexOf(str2, str2, 0), android.view.View.MeasureSpec.getMode(0) + 11, objArr165);
                        java.lang.String intern51 = ((java.lang.String) objArr165[0]).intern();
                        java.lang.Object[] objArr166 = new java.lang.Object[1];
                        a(android.widget.ExpandableListView.getPackedPositionChild(0L) + 560, (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 29373), android.view.View.MeasureSpec.getSize(0) + 8, objArr166);
                        java.lang.String intern52 = ((java.lang.String) objArr166[0]).intern();
                        java.lang.Object[] objArr167 = new java.lang.Object[1];
                        a(567 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6, objArr167);
                        java.lang.String intern53 = ((java.lang.String) objArr167[0]).intern();
                        java.lang.Object[] objArr168 = new java.lang.Object[1];
                        a(574 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) android.view.KeyEvent.keyCodeFromString(str2), 7 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr168);
                        java.lang.String[] strArr21 = {intern51, intern52, intern53, ((java.lang.String) objArr168[0]).intern()};
                        java.lang.Object[] objArr169 = new java.lang.Object[1];
                        a(android.graphics.Color.blue(0) + 579, (char) android.view.View.getDefaultSize(0, 0), 17 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr169);
                        java.lang.String intern54 = ((java.lang.String) objArr169[0]).intern();
                        java.lang.Object[] objArr170 = new java.lang.Object[1];
                        a((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 414, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 7, objArr170);
                        java.lang.String intern55 = ((java.lang.String) objArr170[0]).intern();
                        java.lang.Object[] objArr171 = new java.lang.Object[1];
                        a(382 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.text.TextUtils.getOffsetAfter(str2, 0) + 13373), android.view.View.combineMeasuredStates(0, 0) + 8, objArr171);
                        java.lang.String[] strArr22 = {intern54, intern55, ((java.lang.String) objArr171[0]).intern()};
                        java.lang.Object[] objArr172 = new java.lang.Object[1];
                        a(596 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 8291), 14 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr172);
                        java.lang.String intern56 = ((java.lang.String) objArr172[0]).intern();
                        java.lang.Object[] objArr173 = new java.lang.Object[1];
                        a(609 - (android.os.Process.myTid() >> 22), (char) ((-1) - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1, objArr173);
                        java.lang.String[] strArr23 = {intern56, ((java.lang.String) objArr173[0]).intern()};
                        java.lang.Object[] objArr174 = new java.lang.Object[1];
                        a(((android.os.Process.getThreadPriority(0) + 20) >> 6) + androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, (char) (20702 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 9 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr174);
                        java.lang.String intern57 = ((java.lang.String) objArr174[0]).intern();
                        java.lang.Object[] objArr175 = new java.lang.Object[1];
                        a(android.view.View.resolveSize(0, 0) + 619, (char) (20182 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), 1 - android.view.View.resolveSize(0, 0), objArr175);
                        java.lang.String[] strArr24 = {intern57, ((java.lang.String) objArr175[0]).intern()};
                        java.lang.Object[] objArr176 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 620, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), 16 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr176);
                        java.lang.String intern58 = ((java.lang.String) objArr176[0]).intern();
                        java.lang.Object[] objArr177 = new java.lang.Object[1];
                        a(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 414, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4, objArr177);
                        java.lang.String intern59 = ((java.lang.String) objArr177[0]).intern();
                        java.lang.Object[] objArr178 = new java.lang.Object[1];
                        a(407 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) ((-1) - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 7, objArr178);
                        java.lang.String intern60 = ((java.lang.String) objArr178[0]).intern();
                        java.lang.Object[] objArr179 = new java.lang.Object[1];
                        a(636 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) android.text.TextUtils.indexOf(str2, str2, 0), 7 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr179);
                        java.lang.String intern61 = ((java.lang.String) objArr179[0]).intern();
                        java.lang.Object[] objArr180 = new java.lang.Object[1];
                        a(421 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 11 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr180);
                        java.lang.String intern62 = ((java.lang.String) objArr180[0]).intern();
                        java.lang.Object[] objArr181 = new java.lang.Object[1];
                        a(android.view.View.resolveSizeAndState(0, 0, 0) + 432, (char) (47289 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14, objArr181);
                        java.lang.String[] strArr25 = {intern58, intern59, intern60, intern61, intern62, ((java.lang.String) objArr181[0]).intern()};
                        java.lang.Object[] objArr182 = new java.lang.Object[1];
                        a(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 645, (char) ((android.os.Process.myTid() >> 22) + 64228), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19, objArr182);
                        java.lang.String intern63 = ((java.lang.String) objArr182[0]).intern();
                        java.lang.Object[] objArr183 = new java.lang.Object[1];
                        a(664 - android.text.TextUtils.indexOf(str2, str2, 0, 0), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 19 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr183);
                        java.lang.String intern64 = ((java.lang.String) objArr183[0]).intern();
                        java.lang.Object[] objArr184 = new java.lang.Object[1];
                        a((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 683, (char) (43710 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), 31 - android.graphics.Color.green(0), objArr184);
                        java.lang.String intern65 = ((java.lang.String) objArr184[0]).intern();
                        java.lang.Object[] objArr185 = new java.lang.Object[1];
                        a(713 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (android.os.Process.myPid() >> 22), 26 - android.view.View.MeasureSpec.getSize(0), objArr185);
                        java.lang.String intern66 = ((java.lang.String) objArr185[0]).intern();
                        java.lang.Object[] objArr186 = new java.lang.Object[1];
                        a(740 - android.text.TextUtils.getTrimmedLength(str2), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.text.TextUtils.indexOf(str2, str2, 0) + 23, objArr186);
                        java.lang.String intern67 = ((java.lang.String) objArr186[0]).intern();
                        java.lang.Object[] objArr187 = new java.lang.Object[1];
                        a(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 715, (char) (android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), 33 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr187);
                        java.lang.String[] strArr26 = {intern63, intern64, intern65, intern66, intern67, ((java.lang.String) objArr187[0]).intern(), intern};
                        java.lang.Object[] objArr188 = new java.lang.Object[1];
                        a(android.graphics.Color.argb(0, 0, 0, 0) + 796, (char) (46526 - android.view.KeyEvent.getDeadChar(0, 0)), android.text.TextUtils.getOffsetBefore(str2, 0) + 13, objArr188);
                        java.lang.String intern68 = ((java.lang.String) objArr188[0]).intern();
                        java.lang.Object[] objArr189 = new java.lang.Object[1];
                        a((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 374, (char) android.text.TextUtils.getOffsetAfter(str2, 0), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 7, objArr189);
                        java.lang.String[] strArr27 = {intern68, ((java.lang.String) objArr189[0]).intern()};
                        java.lang.Object[] objArr190 = new java.lang.Object[1];
                        a(android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 810, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 30 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr190);
                        java.lang.String intern69 = ((java.lang.String) objArr190[0]).intern();
                        java.lang.Object[] objArr191 = new java.lang.Object[1];
                        a(839 - android.graphics.Color.argb(0, 0, 0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10, objArr191);
                        java.lang.String[] strArr28 = {intern69, ((java.lang.String) objArr191[0]).intern()};
                        java.lang.Object[] objArr192 = new java.lang.Object[1];
                        a((android.os.Process.myTid() >> 22) + 850, (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 5824), 19 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr192);
                        java.lang.String intern70 = ((java.lang.String) objArr192[0]).intern();
                        java.lang.Object[] objArr193 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 869, (char) (9421 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), 6 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr193);
                        java.lang.String[] strArr29 = {intern70, ((java.lang.String) objArr193[0]).intern()};
                        java.lang.Object[] objArr194 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 873, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 19 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr194);
                        java.lang.String[] strArr30 = {((java.lang.String) objArr194[0]).intern()};
                        java.lang.Object[] objArr195 = new java.lang.Object[1];
                        a(android.text.TextUtils.getTrimmedLength(str2) + 893, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 15454), 17 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr195);
                        java.lang.String[] strArr31 = {((java.lang.String) objArr195[0]).intern()};
                        java.lang.Object[] objArr196 = new java.lang.Object[1];
                        a(909 - android.graphics.Color.red(0), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 62526), 19 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr196);
                        java.lang.String[] strArr32 = {((java.lang.String) objArr196[0]).intern()};
                        java.lang.Object[] objArr197 = new java.lang.Object[1];
                        a(android.view.KeyEvent.keyCodeFromString(str2) + com.google.zxing.pdf417.PDF417Common.MAX_CODEWORDS_IN_BARCODE, (char) (android.graphics.Color.blue(0) + 24666), android.graphics.Color.red(0) + 19, objArr197);
                        java.lang.String[] strArr33 = {((java.lang.String) objArr197[0]).intern()};
                        java.lang.Object[] objArr198 = new java.lang.Object[1];
                        a(948 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (46567 - android.view.KeyEvent.getDeadChar(0, 0)), 23 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr198);
                        java.lang.String[] strArr34 = {((java.lang.String) objArr198[0]).intern()};
                        java.lang.Object[] objArr199 = new java.lang.Object[1];
                        a(970 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (7090 - android.text.TextUtils.getOffsetAfter(str2, 0)), android.text.TextUtils.getTrimmedLength(str2) + 21, objArr199);
                        java.lang.String[] strArr35 = {((java.lang.String) objArr199[0]).intern()};
                        java.lang.Object[] objArr200 = new java.lang.Object[1];
                        a(991 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (32719 - android.view.View.getDefaultSize(0, 0)), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.EM, objArr200);
                        java.lang.String[] strArr36 = {((java.lang.String) objArr200[0]).intern(), intern};
                        java.lang.Object[] objArr201 = new java.lang.Object[1];
                        a((android.os.Process.myTid() >> 22) + 1015, (char) (47917 - android.graphics.Color.green(0)), 28 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr201);
                        java.lang.String[] strArr37 = {((java.lang.String) objArr201[0]).intern(), intern};
                        java.lang.Object[] objArr202 = new java.lang.Object[1];
                        a(1042 - android.view.MotionEvent.axisFromString(str2), (char) ((-1) - android.view.MotionEvent.axisFromString(str2)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 27, objArr202);
                        java.lang.String[] strArr38 = {((java.lang.String) objArr202[0]).intern(), intern};
                        java.lang.Object[] objArr203 = new java.lang.Object[1];
                        a(1070 - android.view.View.MeasureSpec.getSize(0), (char) (android.text.TextUtils.getTrimmedLength(str2) + 9200), android.view.View.combineMeasuredStates(0, 0) + 31, objArr203);
                        java.lang.String[] strArr39 = {((java.lang.String) objArr203[0]).intern(), intern};
                        java.lang.Object[] objArr204 = new java.lang.Object[1];
                        a(1102 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 48846), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 27, objArr204);
                        java.lang.String[] strArr40 = {((java.lang.String) objArr204[0]).intern(), intern};
                        java.lang.Object[] objArr205 = new java.lang.Object[1];
                        a(1128 - android.view.View.combineMeasuredStates(0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 32 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr205);
                        java.lang.String[][] strArr41 = {strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, new java.lang.String[]{((java.lang.String) objArr205[0]).intern(), intern}};
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        int i57 = i;
                        int i58 = 0;
                        int i59 = 0;
                        while (i58 < 24) {
                            java.lang.String[] strArr42 = strArr41[i58];
                            java.lang.Object[] objArr206 = {strArr42[0]};
                            java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj38 == null) {
                                java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1922, (char) android.view.View.MeasureSpec.getMode(0));
                                byte b39 = (byte) (-$$a[14]);
                                byte b40 = (byte) (b39 - 1);
                                java.lang.Object[] objArr207 = new java.lang.Object[1];
                                b(b39, b40, b40, objArr207);
                                obj38 = cls38.getMethod((java.lang.String) objArr207[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj38);
                            }
                            java.lang.String str14 = (java.lang.String) ((java.lang.reflect.Method) obj38).invoke(null, objArr206);
                            java.lang.String[] strArr43 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr42, 1, strArr42.length);
                            if (str14 == null || str14.length() == 0) {
                                strArr = strArr41;
                                i11 = i57;
                            } else {
                                if (strArr42.length != 1) {
                                    java.lang.Object[] objArr208 = {str14, strArr43};
                                    java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                    if (obj39 == null) {
                                        java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 44, 2880 - android.text.TextUtils.getTrimmedLength(str2), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                                        byte b41 = (byte) (-$$a[14]);
                                        byte b42 = (byte) (b41 - 1);
                                        java.lang.Object[] objArr209 = new java.lang.Object[1];
                                        b(b41, b42, b42, objArr209);
                                        obj39 = cls39.getMethod((java.lang.String) objArr209[0], java.lang.String.class, java.lang.String[].class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj39);
                                    }
                                    long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) obj39).invoke(null, objArr208)).longValue();
                                    long j46 = 814623224 | longValue17;
                                    strArr = strArr41;
                                    arrayList = arrayList2;
                                    i11 = i57;
                                    str3 = str2;
                                    long j47 = (-1214088554) + (((-279) * longValue17) - 114861874725L) + ((longValue17 | j) * 140) + (((~j46) | (~(j10 | longValue17))) * (-280)) + (((~((~longValue17) | (-814623225))) | (~(j10 | (-814623225))) | (~(j46 | j))) * 140);
                                    int i60 = ~(i34 | (-1327430984));
                                    i12 = i;
                                    if (((((int) j47) & (((((270532616 | i60) | (~(1327430983 | i12))) * (-338)) - 191515419) + ((i60 | (~(1597963599 | i12))) * 338))) | (((int) (j47 >> 32)) & ((((~(i34 | 219467058)) | (~((-218156323) | i12))) * (-831)) + 1420956090 + ((~(1874849791 | i12)) * (-1662)) + (((~(i34 | (-1656693470))) | (~(1656693469 | i12)) | (~((-219467059) | i12))) * 831)))) == 0) {
                                        arrayList2 = arrayList;
                                        str2 = str3;
                                    }
                                } else {
                                    i12 = i;
                                    strArr = strArr41;
                                    arrayList = arrayList2;
                                    str3 = str2;
                                }
                                i59++;
                                i57 = i12 ^ (i58 + 10);
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(str14);
                                str2 = str3;
                                java.lang.Object[] objArr210 = new java.lang.Object[1];
                                a(1159 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (65110 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr210);
                                sb.append(((java.lang.String) objArr210[0]).intern());
                                sb.append(str14);
                                arrayList2 = arrayList;
                                arrayList2.add(sb.toString());
                                i58++;
                                strArr41 = strArr;
                            }
                            i57 = i11;
                            i58++;
                            strArr41 = strArr;
                        }
                        i10 = i;
                        int i61 = i57;
                        if (i59 > 2) {
                            writeReplace = (valueOf + 91) % 128;
                            objArr = new java.lang.Object[]{new int[]{i10}, new int[]{i61}, arrayList2, null, new int[1]};
                            java.lang.Object[] objArr211 = {num2, num2, java.lang.Integer.valueOf(((((~((-1599558957) | i10)) | 1169247561) * 398) - 301726051) + (((~(i34 | (-1599558957))) | 1169247561) * 398))};
                            java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj40 == null) {
                                java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2713 - android.text.TextUtils.indexOf(str2, str2, 0, 0), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1));
                                java.lang.Object[] objArr212 = new java.lang.Object[1];
                                b((byte) (-$$a[14]), r4[16], 653, objArr212);
                                obj40 = cls40.getMethod((java.lang.String) objArr212[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj40);
                            }
                            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj40).invoke(null, objArr211)).intValue();
                            c = 0;
                            ((int[]) objArr[4])[0] = intValue;
                        } else {
                            objArr = new java.lang.Object[]{new int[]{i10}, new int[]{i10}, null, null, new int[1]};
                            java.lang.Object[] objArr213 = {num2, num2, java.lang.Integer.valueOf(((28905809 | i10) * 614) + 263706699 + (((~(i34 | (-1030962785))) | 19992640 | (~(i34 | 1019883313))) * (-1228)) + (((~(i34 | (-1010970145))) | (~(i34 | 1039875953))) * 614))};
                            java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj41 == null) {
                                java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.resolveSize(0, 0), 2713 - android.text.TextUtils.indexOf(str2, str2, 0), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1));
                                java.lang.Object[] objArr214 = new java.lang.Object[1];
                                b((byte) (-$$a[14]), r4[16], 653, objArr214);
                                obj41 = cls41.getMethod((java.lang.String) objArr214[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj41);
                            }
                            int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj41).invoke(null, objArr213)).intValue();
                            c = 0;
                            ((int[]) objArr[4])[0] = intValue2;
                        }
                        int i62 = ((int[]) objArr[1])[c];
                        if (i62 != i10) {
                            int[] iArr = new int[1];
                            int[] iArr2 = new int[1];
                            java.util.List list = (java.util.List) objArr[2];
                            iArr[c] = i10;
                            iArr2[c] = i62;
                            java.lang.Object[] objArr215 = {iArr, iArr2, list, null, new int[1]};
                            int i63 = ~(2040524159 | i10);
                            java.lang.Object[] objArr216 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~(i34 | (-1503494523))) | 10321938 | i63) * (-252)) + 357007177 + ((i63 | (~(i34 | (-1493172585)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE))};
                            java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj42 == null) {
                                java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 50, android.graphics.Color.rgb(0, 0, 0) + 16779929, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                java.lang.Object[] objArr217 = new java.lang.Object[1];
                                b((byte) (-$$a[14]), r3[16], 653, objArr217);
                                obj42 = cls42.getMethod((java.lang.String) objArr217[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj42);
                            }
                            ((int[]) objArr215[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj42).invoke(null, objArr216)).intValue();
                            return objArr215;
                        }
                        java.lang.Object[] objArr872 = new java.lang.Object[1];
                        a(446 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 46853), 15 - android.view.MotionEvent.axisFromString(str2), objArr872);
                        java.lang.Object[] objArr882 = {((java.lang.String) objArr872[0]).intern()};
                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj == null) {
                        }
                        invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr882);
                        if (invoke != null) {
                        }
                        if (i14 != 1986687685) {
                            java.lang.Object[] objArr922 = new java.lang.Object[1];
                            a((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1161, (char) (31888 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), android.view.View.MeasureSpec.getMode(0) + 14, objArr922);
                            java.lang.String intern152 = ((java.lang.String) objArr922[0]).intern();
                            java.lang.String str92 = str4;
                            java.lang.Object[] objArr932 = new java.lang.Object[1];
                            a((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1175, (char) android.widget.ExpandableListView.getPackedPositionType(0L), android.text.TextUtils.indexOf(str92, str92, 0) + 26, objArr932);
                            java.lang.String intern162 = ((java.lang.String) objArr932[0]).intern();
                            java.lang.Object[] objArr942 = new java.lang.Object[1];
                            a((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1200, (char) (24974 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), 17 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr942);
                            java.lang.String intern172 = ((java.lang.String) objArr942[0]).intern();
                            java.lang.Object[] objArr952 = new java.lang.Object[1];
                            a(1218 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) android.text.TextUtils.indexOf(str92, str92, 0, 0), android.widget.ExpandableListView.getPackedPositionType(0L) + 17, objArr952);
                            java.lang.String intern182 = ((java.lang.String) objArr952[0]).intern();
                            java.lang.Object[] objArr962 = new java.lang.Object[1];
                            a(1236 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15, objArr962);
                            java.lang.String intern192 = ((java.lang.String) objArr962[0]).intern();
                            java.lang.Object[] objArr972 = new java.lang.Object[1];
                            a(1249 - android.view.MotionEvent.axisFromString(str92), (char) (40195 - android.text.TextUtils.getOffsetBefore(str92, 0)), 36 - android.view.MotionEvent.axisFromString(str92), objArr972);
                            java.lang.String intern202 = ((java.lang.String) objArr972[0]).intern();
                            java.lang.Object[] objArr982 = new java.lang.Object[1];
                            a(1287 - android.text.TextUtils.getOffsetBefore(str92, 0), (char) android.text.TextUtils.getOffsetAfter(str92, 0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12, objArr982);
                            java.lang.String intern212 = ((java.lang.String) objArr982[0]).intern();
                            java.lang.Object[] objArr992 = new java.lang.Object[1];
                            a(android.text.TextUtils.getTrimmedLength(str92) + 1299, (char) (48425 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), 14 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr992);
                            java.lang.String intern222 = ((java.lang.String) objArr992[0]).intern();
                            java.lang.Object[] objArr1002 = new java.lang.Object[1];
                            a(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 1312, (char) android.view.KeyEvent.getDeadChar(0, 0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, objArr1002);
                            java.lang.String intern232 = ((java.lang.String) objArr1002[0]).intern();
                            java.lang.Object[] objArr1012 = new java.lang.Object[1];
                            a(android.view.View.combineMeasuredStates(0, 0) + 1334, (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 45307), 31 - android.text.TextUtils.getOffsetBefore(str92, 0), objArr1012);
                            java.lang.String intern242 = ((java.lang.String) objArr1012[0]).intern();
                            java.lang.Object[] objArr1022 = new java.lang.Object[1];
                            a((android.view.KeyEvent.getMaxKeyCode() >> 16) + 1365, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 55665), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11, objArr1022);
                            java.lang.String intern252 = ((java.lang.String) objArr1022[0]).intern();
                            java.lang.Object[] objArr1032 = new java.lang.Object[1];
                            a(1377 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43799), 11 - android.os.Process.getGidForName(str92), objArr1032);
                            java.lang.String intern262 = ((java.lang.String) objArr1032[0]).intern();
                            java.lang.Object[] objArr1042 = new java.lang.Object[1];
                            a(android.view.MotionEvent.axisFromString(str92) + 1390, (char) (android.os.Process.myPid() >> 22), android.text.TextUtils.getOffsetAfter(str92, 0) + 12, objArr1042);
                            java.lang.String intern272 = ((java.lang.String) objArr1042[0]).intern();
                            java.lang.Object[] objArr1052 = new java.lang.Object[1];
                            a(1401 - android.text.TextUtils.getTrimmedLength(str92), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12, objArr1052);
                            java.lang.String intern282 = ((java.lang.String) objArr1052[0]).intern();
                            java.lang.Object[] objArr1062 = new java.lang.Object[1];
                            a(android.view.KeyEvent.normalizeMetaState(0) + 1413, (char) android.graphics.Color.blue(0), 12 - android.view.View.getDefaultSize(0, 0), objArr1062);
                            java.lang.String intern292 = ((java.lang.String) objArr1062[0]).intern();
                            java.lang.Object[] objArr1072 = new java.lang.Object[1];
                            a(android.text.TextUtils.indexOf(str92, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1426, (char) android.text.TextUtils.indexOf(str92, str92, 0, 0), 14 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr1072);
                            java.lang.String intern302 = ((java.lang.String) objArr1072[0]).intern();
                            java.lang.Object[] objArr1082 = new java.lang.Object[1];
                            a(android.widget.ExpandableListView.getPackedPositionChild(0L) + com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_WIDTH, (char) (20684 - android.view.Gravity.getAbsoluteGravity(0, 0)), (android.os.Process.myPid() >> 22) + 12, objArr1082);
                            java.lang.String intern312 = ((java.lang.String) objArr1082[0]).intern();
                            java.lang.Object[] objArr1092 = new java.lang.Object[1];
                            a((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1451, (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 21000), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 24, objArr1092);
                            java.lang.String intern322 = ((java.lang.String) objArr1092[0]).intern();
                            java.lang.Object[] objArr1102 = new java.lang.Object[1];
                            a(1475 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) android.view.View.combineMeasuredStates(0, 0), android.view.MotionEvent.axisFromString(str92) + 29, objArr1102);
                            java.lang.String[] strArr92 = {intern152, intern162, intern172, intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, intern292, intern302, intern312, intern322, ((java.lang.String) objArr1102[0]).intern()};
                            i18 = 0;
                            while (i18 < 19) {
                            }
                            str4 = str92;
                            i19 = -1;
                            if (i19 >= 0) {
                                java.lang.Object[] objArr1162 = {new int[]{i13}, new int[]{i20}, null, null, new int[1]};
                                java.lang.Object[] objArr1172 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~(i34 | 140024467)) | (-2046614272)) * 529) + 321706580 + (((~(i13 | 140024467)) | (-1910821631)) * 529))};
                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj2 == null) {
                                }
                                ((int[]) objArr1162[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr1172)).intValue();
                                return objArr1162;
                            }
                        }
                        java.lang.Object[] objArr1192 = new java.lang.Object[1];
                        a(1503 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (33312 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 13, objArr1192);
                        java.lang.String intern332 = ((java.lang.String) objArr1192[0]).intern();
                        java.lang.Object[] objArr1202 = new java.lang.Object[1];
                        a((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1516, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 5, objArr1202);
                        java.lang.String[] strArr112 = {intern332, ((java.lang.String) objArr1202[0]).intern()};
                        java.lang.Object[] objArr1212 = new java.lang.Object[1];
                        a(1521 - android.view.View.MeasureSpec.getSize(0), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 14 - android.view.MotionEvent.axisFromString(str4), objArr1212);
                        java.lang.String intern342 = ((java.lang.String) objArr1212[0]).intern();
                        java.lang.Object[] objArr1222 = new java.lang.Object[1];
                        a(1536 - android.text.TextUtils.getTrimmedLength(str4), (char) android.graphics.Color.blue(0), 19 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr1222);
                        java.lang.String intern352 = ((java.lang.String) objArr1222[0]).intern();
                        java.lang.Object[] objArr1232 = new java.lang.Object[1];
                        a(1555 - android.view.View.getDefaultSize(0, 0), (char) (65059 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.SI, objArr1232);
                        java.lang.String[] strArr122 = {intern342, intern352, ((java.lang.String) objArr1232[0]).intern()};
                        java.lang.String str112 = str4;
                        java.lang.Object[] objArr1242 = new java.lang.Object[1];
                        a(1569 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.indexOf(str112, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 57357), 20 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr1242);
                        java.lang.String intern362 = ((java.lang.String) objArr1242[0]).intern();
                        java.lang.Object[] objArr1252 = new java.lang.Object[1];
                        a(1638 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.KeyEvent.getDeadChar(0, 0), 9 - android.view.MotionEvent.axisFromString(str112), objArr1252);
                        java.lang.String[] strArr132 = {intern362, ((java.lang.String) objArr1252[0]).intern()};
                        java.lang.Object[] objArr1262 = new java.lang.Object[1];
                        a((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1599, (char) (52146 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 11, objArr1262);
                        c2 = 0;
                        java.lang.String intern372 = ((java.lang.String) objArr1262[0]).intern();
                        java.lang.Object[] objArr1272 = new java.lang.Object[1];
                        a((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 336, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), 6 - android.view.View.resolveSizeAndState(0, 0, 0), objArr1272);
                        java.lang.String[] strArr142 = {intern372, ((java.lang.String) objArr1272[0]).intern()};
                        java.lang.Object[] objArr1282 = new java.lang.Object[1];
                        a(android.text.TextUtils.lastIndexOf(str112, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1612, (char) android.graphics.Color.argb(0, 0, 0, 0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27, objArr1282);
                        java.lang.String intern382 = ((java.lang.String) objArr1282[0]).intern();
                        java.lang.Object[] objArr1292 = new java.lang.Object[1];
                        a(android.text.TextUtils.getCapsMode(str112, 0, 0) + 1590, (char) android.text.TextUtils.indexOf(str112, str112), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '&', objArr1292);
                        java.lang.String[][] strArr152 = {strArr112, strArr122, strArr132, strArr142, new java.lang.String[]{intern382, ((java.lang.String) objArr1292[0]).intern()}};
                        int i492 = -1;
                        i15 = 0;
                        loop4: while (true) {
                            if (i15 < 5) {
                            }
                            i15++;
                            c2 = 0;
                        }
                        if (i16 == i13) {
                        }
                    }
                }
                i8 = i;
                if (i8 == i) {
                }
            }
        }
        i7 = i;
        if (i7 == i) {
        }
    }

    static void init$0() {
        $$a = new byte[]{64, -23, -58, -30, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -15, 10};
        $$b = 85;
    }
}
