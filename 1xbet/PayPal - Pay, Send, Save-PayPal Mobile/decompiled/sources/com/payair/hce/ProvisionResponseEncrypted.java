package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'valueOf' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes10.dex */
public final class ProvisionResponseEncrypted {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static com.payair.hce.ProvisionResponseEncrypted AlternateContactlessPaymentDataJson;
    private static com.payair.hce.ProvisionResponseEncrypted DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static long RecordsJson;
    private static final /* synthetic */ com.payair.hce.ProvisionResponseEncrypted[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static int getPaymentFci;
    private static char getProfileVersion;
    private static com.payair.hce.ProvisionResponseEncrypted valueOf;
    public static final com.payair.hce.ProvisionResponseEncrypted values;
    private static com.payair.hce.ProvisionResponseEncrypted writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        int i3 = s + 102;
        byte[] bArr = $$a;
        int i4 = b * 4;
        int i5 = i + 4;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i6;
            int i8 = i5;
            i2 = 0;
            int i9 = i8;
            i3 = i5 + (-i7);
            i5 = i9;
            bArr2[i2] = (byte) i3;
            int i10 = i5 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i10];
            int i11 = i3;
            i8 = i10;
            i5 = i11;
            int i92 = i8;
            i3 = i5 + (-i7);
            i5 = i92;
            bArr2[i2] = (byte) i3;
            int i102 = i5 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            int i1022 = i5 + 1;
            if (i2 == i6) {
            }
        }
    }

    private ProvisionResponseEncrypted(java.lang.String str, int i) {
    }

    public static com.payair.hce.ProvisionResponseEncrypted valueOf(java.lang.String str) {
        int i = getAid + 73;
        getPaymentFci = i % 128;
        com.payair.hce.ProvisionResponseEncrypted provisionResponseEncrypted = (com.payair.hce.ProvisionResponseEncrypted) java.lang.Enum.valueOf(com.payair.hce.ProvisionResponseEncrypted.class, str);
        if (i % 2 == 0) {
            throw null;
        }
        int i2 = getAid + 75;
        getPaymentFci = i2 % 128;
        if (i2 % 2 != 0) {
            return provisionResponseEncrypted;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.ProvisionResponseEncrypted[] values() {
        int i = getPaymentFci + 75;
        getAid = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.ProvisionResponseEncrypted[] provisionResponseEncryptedArr = (com.payair.hce.ProvisionResponseEncrypted[]) SdkCoreAlternateContactlessPaymentDataImpl.clone();
        getAid = (getPaymentFci + 61) % 128;
        return provisionResponseEncryptedArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAid = 0;
        getPaymentFci = 1;
        AlternateContactlessPaymentDataJson();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((char) (53044 - android.graphics.Color.red(0)), "\u001b堡ퟧ쭺", "ᛚ묮떥솜巾孟", "焢㟫㒋ᛏ", android.text.TextUtils.getCapsMode("", 0, 0), objArr);
        valueOf = new com.payair.hce.ProvisionResponseEncrypted(((java.lang.String) objArr[0]).intern(), 0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((char) (android.text.TextUtils.getTrimmedLength("") + 47993), "\u001b堡ퟧ쭺", "䇩ѝ냄軂\uf59b", "镰蛐礄⪻", 75944085 - android.view.KeyEvent.keyCodeFromString(""), objArr2);
        writeReplace = new com.payair.hce.ProvisionResponseEncrypted(((java.lang.String) objArr2[0]).intern(), 1);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a((char) android.text.TextUtils.indexOf("", "", 0, 0), "\u001b堡ퟧ쭺", "쮍ᆨ톟抆뒼啴\uedf6溷㖣撬", "⑲馋幤蔦", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr3);
        AlternateContactlessPaymentDataJson = new com.payair.hce.ProvisionResponseEncrypted(((java.lang.String) objArr3[0]).intern(), 2);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a((char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), "\u001b堡ퟧ쭺", "ꂠ잇ꊑ쎙퍱啢蘠", "棠쌐\uebaaｺ", (-1430056857) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr4);
        DigitizedCardProfile = new com.payair.hce.ProvisionResponseEncrypted(((java.lang.String) objArr4[0]).intern(), 3);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a((char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), "\u001b堡ퟧ쭺", "벷茒큭曱踔騨梕", "햦\ue234\ue180脵", (-2132658987) - android.graphics.Color.red(0), objArr5);
        com.payair.hce.ProvisionResponseEncrypted provisionResponseEncrypted = new com.payair.hce.ProvisionResponseEncrypted(((java.lang.String) objArr5[0]).intern(), 4);
        values = provisionResponseEncrypted;
        SdkCoreAlternateContactlessPaymentDataImpl = new com.payair.hce.ProvisionResponseEncrypted[]{valueOf, writeReplace, AlternateContactlessPaymentDataJson, DigitizedCardProfile, provisionResponseEncrypted};
        int i = getPaymentFci + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getAid = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char c2;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        java.lang.Object obj = null;
        if (str2 != 0) {
            int i2 = $11 + 67;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr3 = cArr;
        if (str != null) {
            $11 = ($10 + 33) % 128;
            cArr2 = str.toCharArray();
        } else {
            cArr2 = str;
        }
        char[] cArr4 = cArr2;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        java.lang.System.arraycopy(charArray, 0, cArr5, 0, length);
        java.lang.System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr7 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - android.graphics.Color.argb(0, 0, 0, 0), android.view.KeyEvent.normalizeMetaState(0) + 1179, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, -1, (short) 0, objArr3);
                    obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 30, 3443 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (3832 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr5[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 1864 - android.text.TextUtils.indexOf("", ""), (char) ((android.os.Process.myPid() >> 22) + 41775));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b((byte) 0, -1, (short) 3, objArr6);
                    obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 29, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3134, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b((byte) 0, -1, (byte) $$a.length, objArr8);
                    java.lang.String str4 = (java.lang.String) objArr8[0];
                    c2 = 2;
                    obj5 = cls3.getMethod(str4, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                } else {
                    c2 = 2;
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((int) (IccPrivateKeyCrtComponentsJson ^ 1263759066225628708L)) ^ ((cArr5[intValue2] ^ cArr3[getwalletdata.writeReplace]) ^ (RecordsJson ^ 1263759066225628708L))) ^ ((char) (getProfileVersion ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                $10 = ($11 + 109) % 128;
                cArr5 = cArr5;
                obj = null;
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

    static void AlternateContactlessPaymentDataJson() {
        RecordsJson = -2669770588239702465L;
        IccPrivateKeyCrtComponentsJson = -804334044;
        getProfileVersion = (char) 54820;
    }

    static void init$0() {
        $$a = new byte[]{88, -59, 41, 44};
        $$b = 19;
    }
}
