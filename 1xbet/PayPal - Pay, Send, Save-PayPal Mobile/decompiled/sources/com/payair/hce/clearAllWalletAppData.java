package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DigitizedCardProfile' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class clearAllWalletAppData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.clearAllWalletAppData AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.clearAllWalletAppData DigitizedCardProfile;
    public static final com.payair.hce.clearAllWalletAppData IccPrivateKeyCrtComponentsJson;
    public static final com.payair.hce.clearAllWalletAppData RecordsJson;
    public static final com.payair.hce.clearAllWalletAppData SdkCoreAlternateContactlessPaymentDataImpl;
    public static final com.payair.hce.clearAllWalletAppData SdkCoreBusinessLogicModuleImpl;
    private static long SdkCoreCardRiskManagementDataImpl;
    private static int getAdditionalCheckTable;
    public static final com.payair.hce.clearAllWalletAppData getAid;
    private static char getApplicationLifeCycleData;
    private static long getCardLayoutDescription;
    private static int getCardholderValidators;
    public static final com.payair.hce.clearAllWalletAppData getCiacDecline;
    public static final com.payair.hce.clearAllWalletAppData getCvmResetTimeout;
    public static final com.payair.hce.clearAllWalletAppData getCvrMaskAnd;
    private static final /* synthetic */ com.payair.hce.clearAllWalletAppData[] getDualTapResetTimeout;
    public static final com.payair.hce.clearAllWalletAppData getGpoResponse;
    public static final com.payair.hce.clearAllWalletAppData getPaymentFci;
    public static final com.payair.hce.clearAllWalletAppData getProfileVersion;
    private static int getSecurityWord;
    public static final com.payair.hce.clearAllWalletAppData valueOf;
    public static final com.payair.hce.clearAllWalletAppData values;
    public static final com.payair.hce.clearAllWalletAppData writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = s + 102;
        int i5 = 1 - (b * 2);
        int i6 = 3 - (i * 2);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            i3 = 0;
            int i9 = i6 + (-i7);
            i2 = i3;
            int i10 = i8;
            i4 = i9;
            i6 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i6 + 1;
            i7 = bArr[i11];
            int i12 = i4;
            i8 = i11;
            i6 = i12;
            int i92 = i6 + (-i7);
            i2 = i3;
            int i102 = i8;
            i4 = i92;
            i6 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    private clearAllWalletAppData(java.lang.String str, int i) {
    }

    public static com.payair.hce.clearAllWalletAppData valueOf(java.lang.String str) {
        int i = getAdditionalCheckTable + 115;
        getCardholderValidators = i % 128;
        com.payair.hce.clearAllWalletAppData clearallwalletappdata = (com.payair.hce.clearAllWalletAppData) java.lang.Enum.valueOf(com.payair.hce.clearAllWalletAppData.class, str);
        if (i % 2 != 0) {
            return clearallwalletappdata;
        }
        throw null;
    }

    public static com.payair.hce.clearAllWalletAppData[] values() {
        getCardholderValidators = (getAdditionalCheckTable + 51) % 128;
        com.payair.hce.clearAllWalletAppData[] clearallwalletappdataArr = (com.payair.hce.clearAllWalletAppData[]) getDualTapResetTimeout.clone();
        getCardholderValidators = (getAdditionalCheckTable + 45) % 128;
        return clearallwalletappdataArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAdditionalCheckTable = 0;
        getCardholderValidators = 1;
        DigitizedCardProfile();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((char) ((-1) - android.view.MotionEvent.axisFromString("")), "\u0000\u0000\u0000\u0000", "\uebb4䢔\\⡩쎢毡撂\ue0c8Ⴛ퀐᳠婛ꤨ\ue52b㽁鰹荗픒莺㙈", "춹坬휃ٌ", android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr);
        com.payair.hce.clearAllWalletAppData clearallwalletappdata = new com.payair.hce.clearAllWalletAppData(((java.lang.String) objArr[0]).intern(), 0);
        DigitizedCardProfile = clearallwalletappdata;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 996), "\u0000\u0000\u0000\u0000", "㷰䓵\ueeb9저萻屠\ud91e飊調\ue07c얀揤\uebb1ᾣ㡌䠤ᯄ䒍뾣丽꠱㗺룾륺\ue308し랍㑊", "閰ፓ\ue3d3꤃", android.graphics.Color.red(0), objArr2);
        com.payair.hce.clearAllWalletAppData clearallwalletappdata2 = new com.payair.hce.clearAllWalletAppData(((java.lang.String) objArr2[0]).intern(), 1);
        AlternateContactlessPaymentDataJson = clearallwalletappdata2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a((char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), "\u0000\u0000\u0000\u0000", "츰釛\ufafe\uf4c3鄰⓫먦Ჳ穈ᷘ࣌ꆩ냷ᵃዅ첇\u1ff0\ue105鮋ᕪࣼ", "\uf84cྟ\uecf8邸", (-133193736) - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr3);
        com.payair.hce.clearAllWalletAppData clearallwalletappdata3 = new com.payair.hce.clearAllWalletAppData(((java.lang.String) objArr3[0]).intern(), 2);
        valueOf = clearallwalletappdata3;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        b("뾛泐뿙佘똥奄倐쁇픔⤁漮ꪽ橯\udcd0쐕㗢ﾯ瞱뫄胃ᒔ\ue96a⾼欅꧅鱑", android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, objArr4);
        com.payair.hce.clearAllWalletAppData clearallwalletappdata4 = new com.payair.hce.clearAllWalletAppData(((java.lang.String) objArr4[0]).intern(), 3);
        values = clearallwalletappdata4;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        b("ᝏ萂ᜍ螲廷㊔鮆\u0bd1緀쇓Ꞔ愫슻㐂\u0cffﹴ坻齣爮䭕뱀ư\ue75cꂖĖ璈䲏㷵韠\udfd8놶謳ﲱ䈣", android.graphics.Color.blue(0), objArr5);
        com.payair.hce.clearAllWalletAppData clearallwalletappdata5 = new com.payair.hce.clearAllWalletAppData(((java.lang.String) objArr5[0]).intern(), 4);
        writeReplace = clearallwalletappdata5;
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        b("깣晾긡㛂벋菤䧡\ud9b6쓬⎯ᚴ덌算홾붏Ⱃ\uee57紟썞餲լ\ue3cc嘬狱렺雴﷿", (-1) - android.os.Process.getGidForName(""), objArr6);
        com.payair.hce.clearAllWalletAppData clearallwalletappdata6 = new com.payair.hce.clearAllWalletAppData(((java.lang.String) objArr6[0]).intern(), 5);
        getProfileVersion = clearallwalletappdata6;
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        b("쩴杚쨹\ue7d1붫勫羔\uefcbꃬ⊟잧蔬ᾋ흏沍᩼詁簰ቍ꽝慰\ue2f1蜶䒆\udc28韗⳧\ud9fd", android.widget.ExpandableListView.getPackedPositionType(0L), objArr7);
        com.payair.hce.clearAllWalletAppData clearallwalletappdata7 = new com.payair.hce.clearAllWalletAppData(((java.lang.String) objArr7[0]).intern(), 6);
        SdkCoreAlternateContactlessPaymentDataImpl = clearallwalletappdata7;
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        a((char) (62838 - android.text.TextUtils.getOffsetBefore("", 0)), "\u0000\u0000\u0000\u0000", "\uf6e0\ue0c8\udcd4뼪ꉴ퍐昋츒䰚\ue1b4軀욮ᑧ癝㧜\uf597\udf08\u20fd蕉䢰ꍸ苴똦ꉛ⪰ﴊ樖⎒᫇\uf877\ud867ϯ", "\u2e7e\uf576癀哵", android.graphics.Color.green(0), objArr8);
        com.payair.hce.clearAllWalletAppData clearallwalletappdata8 = new com.payair.hce.clearAllWalletAppData(((java.lang.String) objArr8[0]).intern(), 7);
        RecordsJson = clearallwalletappdata8;
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        b("ἇႧὊ밉쩖ळ譊ᬕ疟啢鱿燲쫸ꂲ㝕\ueea2弲்䦕它됃锌\udcee끐॑\ue02f眸\u2d28龢", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr9);
        com.payair.hce.clearAllWalletAppData clearallwalletappdata9 = new com.payair.hce.clearAllWalletAppData(((java.lang.String) objArr9[0]).intern(), 8);
        getAid = clearallwalletappdata9;
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        b("ʐ\uf503˝坮⿲\ue254몋⫔栈냆眘䀳흯䔂\udc28\udf76䊴\uee73ꋳ橉ꦔ炲㞂膈ᓏ։鱚ᳮ舾껒", 1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr10);
        com.payair.hce.clearAllWalletAppData clearallwalletappdata10 = new com.payair.hce.clearAllWalletAppData(((java.lang.String) objArr10[0]).intern(), 9);
        IccPrivateKeyCrtComponentsJson = clearallwalletappdata10;
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        a((char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", "눚⨟ꍵ型쳄⡮ٮ\udf48\uf807耯䜔嵳ₛ㡌\uf0e3罞涹\udcbd츒\ue424ɀ\uead4ల䌒㔚闑檼뢅嵀\udc0a黄耢鯏曈", "洺⁵⌉翺", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, objArr11);
        com.payair.hce.clearAllWalletAppData clearallwalletappdata11 = new com.payair.hce.clearAllWalletAppData(((java.lang.String) objArr11[0]).intern(), 10);
        getGpoResponse = clearallwalletappdata11;
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        b("欱檙歼\uf40a끨䄰꓿㒠Ʃ⽜푼幇뻎\uda98罌섂⬕燩Ɨ琽쀵\uef28铦鿼絮騛㼴ʟ\ueb98ㅃ숇", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr12);
        com.payair.hce.clearAllWalletAppData clearallwalletappdata12 = new com.payair.hce.clearAllWalletAppData(((java.lang.String) objArr12[0]).intern(), 11);
        SdkCoreBusinessLogicModuleImpl = clearallwalletappdata12;
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        b("츤ﰎ칧ኧ⛻ꞝ膁ᇙ꒼맅㋓笩ᯁ䰈駰\ue472踄\ue76f\ue72d兌攰禿牋몂\ud87b಄\ud993⟤亊\ua7df", android.text.TextUtils.indexOf("", "", 0, 0), objArr13);
        com.payair.hce.clearAllWalletAppData clearallwalletappdata13 = new com.payair.hce.clearAllWalletAppData(((java.lang.String) objArr13[0]).intern(), 12);
        getPaymentFci = clearallwalletappdata13;
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        b("⊑忯⋒\uebd1蔚廫ᇯ膷䠉ᨤ쮥\ueb47\uf774\uefe9悆琜抱䒎ṛ섢覅\uda5e謽⫬㓎꽭⃯랏ꈸе\udddcŌ쥮駅䪅橪瑟溞", android.text.TextUtils.getOffsetAfter("", 0), objArr14);
        com.payair.hce.clearAllWalletAppData clearallwalletappdata14 = new com.payair.hce.clearAllWalletAppData(((java.lang.String) objArr14[0]).intern(), 13);
        getCvrMaskAnd = clearallwalletappdata14;
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        b("\ue4bc诳\ue4ff텺儆摀淗ﶏ踤츸\uf10e靿ㅙ㯵娭ࠤ꒜邒⓰봚侨โ놖囔\uf2e3筱ᩄ쮷搕퀩\ue777", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr15);
        com.payair.hce.clearAllWalletAppData clearallwalletappdata15 = new com.payair.hce.clearAllWalletAppData(((java.lang.String) objArr15[0]).intern(), 14);
        getCiacDecline = clearallwalletappdata15;
        java.lang.Object[] objArr16 = new java.lang.Object[1];
        b("\u19ac㙾᧹챤\uec84祇⯕뮇猳玭\uec12", (android.os.Process.getThreadPriority(0) + 20) >> 6, objArr16);
        com.payair.hce.clearAllWalletAppData clearallwalletappdata16 = new com.payair.hce.clearAllWalletAppData(((java.lang.String) objArr16[0]).intern(), 15);
        getCvmResetTimeout = clearallwalletappdata16;
        getDualTapResetTimeout = new com.payair.hce.clearAllWalletAppData[]{clearallwalletappdata, clearallwalletappdata2, clearallwalletappdata3, clearallwalletappdata4, clearallwalletappdata5, clearallwalletappdata6, clearallwalletappdata7, clearallwalletappdata8, clearallwalletappdata9, clearallwalletappdata10, clearallwalletappdata11, clearallwalletappdata12, clearallwalletappdata13, clearallwalletappdata14, clearallwalletappdata15, clearallwalletappdata16};
        getAdditionalCheckTable = (getCardholderValidators + 99) % 128;
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $10 = ($11 + 51) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(SdkCoreCardRiskManagementDataImpl ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            $10 = ($11 + 19) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i2 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(SdkCoreCardRiskManagementDataImpl)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.getCapsMode("", 0, 0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1921, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c((byte) 0, 0, (short) 15, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 27, 430 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31610));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c((byte) 0, 0, (byte) $$b, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(writeReplace2, 4, writeReplace2.length - 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char c2;
        int i2 = $11 + 9;
        $10 = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str3 != null) {
            cArr = str3.toCharArray();
            $11 = ($10 + 41) % 128;
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        char[] charArray = str2 != 0 ? str2.toCharArray() : str2;
        if (str != null) {
            $11 = ($10 + 43) % 128;
            cArr2 = str.toCharArray();
        } else {
            cArr2 = str;
        }
        char[] cArr4 = cArr2;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = cArr3.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        byte b = 0;
        java.lang.System.arraycopy(cArr3, 0, cArr5, 0, length);
        java.lang.System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = charArray.length;
        char[] cArr7 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            $11 = ($10 + 45) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 71, android.view.View.resolveSizeAndState(b, b, b) + 1179, (char) android.text.TextUtils.getTrimmedLength(""));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c(b, b, b, objArr3);
                    java.lang.String str4 = (java.lang.String) objArr3[b];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                    clsArr[b] = java.lang.Object.class;
                    obj2 = cls.getMethod(str4, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 31, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3443, (char) (android.graphics.drawable.Drawable.resolveOpacity(b, b) + 3831));
                    java.lang.Class<?>[] clsArr2 = new java.lang.Class[1];
                    clsArr2[b] = java.lang.Object.class;
                    obj3 = cls2.getMethod("g", clsArr2);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                char c3 = cArr5[getwalletdata.writeReplace % 4];
                java.lang.Object[] objArr5 = new java.lang.Object[3];
                objArr5[2] = java.lang.Integer.valueOf(cArr6[intValue]);
                objArr5[1] = java.lang.Integer.valueOf(c3 * 32718);
                objArr5[b] = getwalletdata;
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", b) + 26, (android.util.TypedValue.complexToFloat(b) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(b) == 0.0f ? 0 : -1)) + 1864, (char) (41776 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    c(b, b, (short) 3, objArr6);
                    java.lang.String str5 = (java.lang.String) objArr6[b];
                    java.lang.Class<?>[] clsArr3 = new java.lang.Class[3];
                    clsArr3[b] = java.lang.Object.class;
                    clsArr3[1] = java.lang.Integer.TYPE;
                    clsArr3[2] = java.lang.Integer.TYPE;
                    obj4 = cls3.getMethod(str5, clsArr3);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                char c4 = cArr5[intValue2];
                java.lang.Object[] objArr7 = new java.lang.Object[2];
                objArr7[1] = java.lang.Integer.valueOf(cArr6[intValue]);
                objArr7[b] = java.lang.Integer.valueOf(c4 * 32718);
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3133, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    c(b, b, (byte) $$a.length, objArr8);
                    java.lang.String str6 = (java.lang.String) objArr8[b];
                    c2 = 2;
                    java.lang.Class<?>[] clsArr4 = new java.lang.Class[2];
                    clsArr4[b] = java.lang.Integer.TYPE;
                    clsArr4[1] = java.lang.Integer.TYPE;
                    obj5 = cls4.getMethod(str6, clsArr4);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                } else {
                    c2 = 2;
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((int) (getSecurityWord ^ 1263759066225628708L)) ^ ((cArr5[intValue2] ^ charArray[getwalletdata.writeReplace]) ^ (getCardLayoutDescription ^ 1263759066225628708L))) ^ ((char) (getApplicationLifeCycleData ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                obj = null;
                b = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    static void DigitizedCardProfile() {
        getCardLayoutDescription = 1263759066225628708L;
        getSecurityWord = -804334044;
        getApplicationLifeCycleData = (char) 34112;
        SdkCoreCardRiskManagementDataImpl = -2297795776915722633L;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.RS, 5, -83, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE};
        $$b = 17;
    }
}
