package com.payair.hce;

/* loaded from: classes4.dex */
final class setViewTranslationCallback {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int valueOf;
    private static char values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = b + 102;
        int i3 = b2 * 2;
        int i4 = s + 4;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        if (bArr == null) {
            int i6 = i2;
            i2 = i5;
            i = 0;
            i2 += i6;
            i4++;
            bArr2[i] = (byte) i2;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i6 = bArr[i4];
            i2 += i6;
            i4++;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        } else {
            i = 0;
            i4++;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cc, code lost:
    
        if (r12.equals(((java.lang.String) r3[0]).intern()) != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean values(java.lang.String str, java.lang.String str2, boolean z) {
        int i = AlternateContactlessPaymentDataJson + 43;
        writeReplace = i % 128;
        char c = 2;
        java.lang.String str3 = null;
        if (i % 2 == 0) {
            switch (str2.hashCode()) {
                case 71419:
                    if (str2.equals("HEX")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 84303:
                    c = 1;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a("ẻ魈舮餸", "ᡬ㍴珃", "浠렷썬餀", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1824012141, (char) (195 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), objArr);
                    break;
                case 2090926:
                    if (str2.equals("DATE")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 40276826:
                    if (str2.equals("PHONE_NUMBER")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 66081660:
                    if (str2.equals("EMAIL")) {
                        writeReplace = (AlternateContactlessPaymentDataJson + 117) % 128;
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 335168371:
                    if (str2.equals("PERSON_NUMBER")) {
                        int i2 = writeReplace + 115;
                        AlternateContactlessPaymentDataJson = i2 % 128;
                        if (i2 % 2 != 0) {
                            c = '\t';
                            break;
                        } else {
                            c = 23;
                            break;
                        }
                    }
                    c = 65535;
                    break;
                case 767858225:
                    if (str2.equals("HTTPLESS_URL")) {
                        writeReplace = (AlternateContactlessPaymentDataJson + 111) % 128;
                        break;
                    }
                    c = 65535;
                    break;
                case 969349366:
                    if (str2.equals("CAPITAL_LETTERS")) {
                        writeReplace = (AlternateContactlessPaymentDataJson + 125) % 128;
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1069590712:
                    if (str2.equals("VERSION")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1173269487:
                    if (str2.equals("ALPHANUMERIC")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1756752181:
                    if (str2.equals("PERSON_NAME")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    str3 = "^[a-zåäöA-ZÅÄÖ]+(([',. -][a-zåäöA-ZÅÄÖ ])?[a-zåäöA-ZÅÄÖ]*)*$";
                    break;
                case 1:
                    str3 = "^((((https?|ftps?|gopher|telnet|nntp)://)|(mailto:|news:))(%[0-9A-Fa-f]{2}|[-()_.!~*';/?:@&=+$%,A-Za-z0-9])+)([).!';/?:,][[:blank:]])?$";
                    break;
                case 2:
                    str3 = "^([-_.A-Za-z0-9])+[.]([-_A-Za-z0-9])+/.*$";
                    break;
                case 3:
                    str3 = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
                    break;
                case 4:
                    str3 = "^(?:(?:(?:0?[13578]|1[02])(\\/|-|\\.)31)\\1|(?:(?:0?[1,3-9]|1[0-2])(\\/|-|\\.)(?:29|30)\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:0?2(\\/|-|\\.)29\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:(?:0?[1-9])|(?:1[0-2]))(\\/|-|\\.)(?:0?[1-9]|1\\d|2[0-8])\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
                    break;
                case 5:
                    str3 = "^[A-ZÅÄÖ]+$";
                    break;
                case 6:
                    str3 = "^[0-9]+([.][0-9]*)*$";
                    break;
                case 7:
                    str3 = "^[a-zåäöA-ZÅÄÖ0-9]*$";
                    break;
                case '\b':
                    str3 = "^(\\(?\\+?[0-9]*\\)?)?[0-9_\\- \\(\\)]*$";
                    break;
                case '\t':
                    str3 = "^[0-9a-zA-z]+([-+][0-9a-zA-Z]*)*$";
                    break;
                case '\n':
                    str3 = "^[0-9a-fA-F]+$";
                    break;
            }
            if (str == null || str3 == null) {
                return false;
            }
            return java.util.regex.Pattern.compile(str3).matcher(str).matches();
        }
        str2.hashCode();
        throw null;
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char c2;
        if (str3 != null) {
            $11 = ($10 + 1) % 128;
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        if (str2 != null) {
            cArr2 = str2.toCharArray();
            $10 = ($11 + 117) % 128;
        } else {
            cArr2 = str2;
        }
        char[] cArr4 = cArr2;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = cArr3.length;
        char[] cArr5 = new char[length];
        int length2 = charArray.length;
        char[] cArr6 = new char[length2];
        java.lang.System.arraycopy(cArr3, 0, cArr5, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr4.length;
        char[] cArr7 = new char[length3];
        getwalletdata.writeReplace = 0;
        $10 = ($11 + 59) % 128;
        while (getwalletdata.writeReplace < length3) {
            $11 = ($10 + 115) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 1179 - android.view.View.MeasureSpec.getMode(0), (char) android.view.View.getDefaultSize(0, 0));
                    byte b = (byte) ($$b - 3);
                    byte b2 = (byte) (b - 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b2, (byte) (b2 + 1), objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.text.TextUtils.indexOf("", ""), 3442 - android.os.Process.getGidForName(""), (char) (3832 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr5[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 26, android.widget.ExpandableListView.getPackedPositionChild(0L) + 1865, (char) (41775 - android.text.TextUtils.indexOf("", "", 0)));
                    byte b3 = (byte) $$b;
                    byte b4 = (byte) (b3 - 4);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(b3, b4, (byte) (b4 + 1), objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 28, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3133, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                    byte length4 = (byte) $$a.length;
                    byte b5 = (byte) (length4 - 5);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(length4, b5, (byte) (b5 + 1), objArr8);
                    c2 = 2;
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                } else {
                    c2 = 2;
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((cArr5[intValue2] ^ cArr4[getwalletdata.writeReplace]) ^ (DigitizedCardProfile ^ 1263759066225628708L)) ^ ((int) (valueOf ^ 1263759066225628708L))) ^ ((char) (values ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                $11 = ($10 + 91) % 128;
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        if (r6.equals("TOKEN_UNIQUE_REFERENCE_MAX_LENGTH") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008d, code lost:
    
        if (r6.equals("TRANSPORT_KEY_MAX_LENGTH") != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean AlternateContactlessPaymentDataJson(java.lang.String str, java.lang.String str2, boolean z) {
        int i;
        int i2;
        AlternateContactlessPaymentDataJson = (writeReplace + 111) % 128;
        int i3 = 64;
        switch (str2.hashCode()) {
            case -46466710:
                if (str2.equals("RGK_MAX_LENGTH")) {
                    i3 = 2000;
                    break;
                }
                i3 = 0;
                break;
            case 205441079:
                break;
            case 603897035:
                if (str2.equals("MOBILE_KEY_SET_ID_MAX_LENGTH")) {
                    i = writeReplace + 117;
                    AlternateContactlessPaymentDataJson = i % 128;
                    break;
                }
                i3 = 0;
                break;
            case 936411978:
                if (str2.equals("DEVICE_FINGERPRINT_LENGTH")) {
                    i2 = AlternateContactlessPaymentDataJson + 19;
                    writeReplace = i2 % 128;
                    break;
                }
                i3 = 0;
                break;
            case 1125070988:
                if (str2.equals("DEVICE_NAME_MAX_LENGTH")) {
                    int i4 = writeReplace;
                    AlternateContactlessPaymentDataJson = (i4 + 65) % 128;
                    i = i4 + 79;
                    AlternateContactlessPaymentDataJson = i % 128;
                    break;
                }
                i3 = 0;
                break;
            case 1356481053:
                break;
            case 1534547281:
                if (str2.equals("MAC_KEY_MAX_LENGTH")) {
                    i = writeReplace + 99;
                    AlternateContactlessPaymentDataJson = i % 128;
                    break;
                }
                i3 = 0;
                break;
            case 1914291122:
                if (str2.equals("PAYMENT_APP_INSTANCE_ID_MAX_LENGTH")) {
                    i3 = 48;
                    break;
                }
                i3 = 0;
                break;
            case 2075013160:
                if (str2.equals("DATA_ENCRYPTION_KEY_MAX_LENGTH")) {
                    i2 = AlternateContactlessPaymentDataJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    writeReplace = i2 % 128;
                    break;
                }
                i3 = 0;
                break;
            case 2108372980:
                if (str2.equals("REMOTE_MANAGEMENT_URL_MAX_LENGTH")) {
                    writeReplace = (AlternateContactlessPaymentDataJson + 97) % 128;
                    i3 = 128;
                    break;
                }
                i3 = 0;
                break;
            default:
                i3 = 0;
                break;
        }
        if (str == null) {
            AlternateContactlessPaymentDataJson = (writeReplace + 71) % 128;
            return false;
        }
        boolean equals = str2.equals("DEVICE_FINGERPRINT_LENGTH");
        int length = str.length();
        if (!equals) {
            return length <= i3;
        }
        if (i3 != length) {
            return false;
        }
        int i5 = writeReplace + 25;
        AlternateContactlessPaymentDataJson = i5 % 128;
        return i5 % 2 != 0;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        AlternateContactlessPaymentDataJson = 1;
        DigitizedCardProfile = -8597015437030012769L;
        valueOf = -804334044;
        values = (char) 54820;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.ESC, -102, com.google.common.base.Ascii.SI, 46};
        $$b = 3;
    }
}
