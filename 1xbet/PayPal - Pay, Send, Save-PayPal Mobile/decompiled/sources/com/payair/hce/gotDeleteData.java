package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'values' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class gotDeleteData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.gotDeleteData AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.gotDeleteData DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static long RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char getAid;
    private static int getProfileVersion;
    public static final com.payair.hce.gotDeleteData valueOf;
    public static final com.payair.hce.gotDeleteData values;
    private static final /* synthetic */ com.payair.hce.gotDeleteData[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2 = (s2 * 3) + 4;
        byte[] bArr = $$a;
        int i3 = b + 102;
        int i4 = s * 2;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i3;
            i = 0;
            i3 = i4;
            i3 += i5;
            i2++;
            bArr2[i] = (byte) i3;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i5 = bArr[i2];
            i3 += i5;
            i2++;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        }
    }

    private gotDeleteData(java.lang.String str, int i) {
    }

    public static com.payair.hce.gotDeleteData valueOf(java.lang.String str) {
        int i = IccPrivateKeyCrtComponentsJson + 77;
        getProfileVersion = i % 128;
        com.payair.hce.gotDeleteData gotdeletedata = (com.payair.hce.gotDeleteData) java.lang.Enum.valueOf(com.payair.hce.gotDeleteData.class, str);
        if (i % 2 != 0) {
            throw null;
        }
        int i2 = getProfileVersion + 91;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 != 0) {
            return gotdeletedata;
        }
        throw null;
    }

    public static com.payair.hce.gotDeleteData[] values() {
        int i = getProfileVersion + 43;
        IccPrivateKeyCrtComponentsJson = i % 128;
        com.payair.hce.gotDeleteData[] gotdeletedataArr = writeReplace;
        if (i % 2 != 0) {
            return (com.payair.hce.gotDeleteData[]) gotdeletedataArr.clone();
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        DigitizedCardProfile();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((char) (android.os.Process.getGidForName("") + 1), "\u0000\u0000\u0000\u0000", "䣍⣭埧謃\uea0bᨅ뵠", "聊띤馬\ud88d", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1397267329, objArr);
        com.payair.hce.gotDeleteData gotdeletedata = new com.payair.hce.gotDeleteData(((java.lang.String) objArr[0]).intern(), 0);
        values = gotdeletedata;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), "\u0000\u0000\u0000\u0000", "ᤈ絪￠㫼埈ꖫ\uedad켵䰵谽鴠氏", "\ue4b0\u0c29庺ﮟ", android.view.ViewConfiguration.getTouchSlop() >> 8, objArr2);
        com.payair.hce.gotDeleteData gotdeletedata2 = new com.payair.hce.gotDeleteData(((java.lang.String) objArr2[0]).intern(), 1);
        valueOf = gotdeletedata2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a((char) (android.view.KeyEvent.normalizeMetaState(0) + 24468), "\u0000\u0000\u0000\u0000", "観뉩瞉ᐶ\u192f놔⟜玠Æ\ue5c7\ueea8풛㏩켻", "킞桧鐀㥟", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr3);
        com.payair.hce.gotDeleteData gotdeletedata3 = new com.payair.hce.gotDeleteData(((java.lang.String) objArr3[0]).intern(), 2);
        AlternateContactlessPaymentDataJson = gotdeletedata3;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a((char) android.view.View.resolveSizeAndState(0, 0, 0), "\u0000\u0000\u0000\u0000", "嬟ቧ젷ꕂ壼譄嵣䕄洋", "ኗ뮞ホ⟀", (-608461294) - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr4);
        com.payair.hce.gotDeleteData gotdeletedata4 = new com.payair.hce.gotDeleteData(((java.lang.String) objArr4[0]).intern(), 3);
        DigitizedCardProfile = gotdeletedata4;
        writeReplace = new com.payair.hce.gotDeleteData[]{gotdeletedata, gotdeletedata2, gotdeletedata3, gotdeletedata4};
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 25) % 128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.Object obj = null;
        if (str3 != null) {
            int i2 = $11 + 115;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr2 = cArr;
        char[] charArray = str2 != 0 ? str2.toCharArray() : str2;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = cArr2.length;
        char[] cArr3 = new char[length];
        int length2 = charArray2.length;
        char[] cArr4 = new char[length2];
        byte b = 0;
        java.lang.System.arraycopy(cArr2, 0, cArr3, 0, length);
        java.lang.System.arraycopy(charArray2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = charArray.length;
        char[] cArr5 = new char[length3];
        getwalletdata.writeReplace = 0;
        $10 = ($11 + 93) % 128;
        while (getwalletdata.writeReplace < length3) {
            $11 = ($10 + 125) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(70 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, b, b), android.text.TextUtils.getOffsetBefore("", b) + 1179, (char) android.view.View.resolveSize(b, b));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b, b, objArr3);
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
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 18, 3443 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3830));
                    java.lang.Class<?>[] clsArr2 = new java.lang.Class[1];
                    clsArr2[b] = java.lang.Object.class;
                    obj3 = cls2.getMethod("g", clsArr2);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                char c2 = cArr3[getwalletdata.writeReplace % 4];
                java.lang.Object[] objArr5 = new java.lang.Object[3];
                objArr5[2] = java.lang.Integer.valueOf(cArr4[intValue]);
                objArr5[1] = java.lang.Integer.valueOf(c2 * 32718);
                objArr5[b] = getwalletdata;
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1863, (char) ((android.os.Process.myPid() >> 22) + 41775));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b((short) 0, (byte) 3, (short) 0, objArr6);
                    obj4 = cls3.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27, 3133 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) android.text.TextUtils.getCapsMode("", 0, 0));
                    byte length4 = (byte) $$a.length;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b((short) 0, length4, (byte) (length4 - 4), objArr8);
                    obj5 = cls4.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr3[intValue2] = getwalletdata.values;
                char[] cArr6 = cArr3;
                cArr5[getwalletdata.writeReplace] = (char) ((((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ 1263759066225628708L)) ^ ((cArr3[intValue2] ^ charArray[getwalletdata.writeReplace]) ^ (RecordsJson ^ 1263759066225628708L))) ^ ((char) (getAid ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                int i3 = $10 + 3;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 / 2;
                }
                cArr3 = cArr6;
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
        objArr[0] = new java.lang.String(cArr5);
    }

    static void DigitizedCardProfile() {
        RecordsJson = 1263759066225628708L;
        SdkCoreAlternateContactlessPaymentDataImpl = -804334044;
        getAid = (char) 2212;
    }

    static void init$0() {
        $$a = new byte[]{65, -108, -120, -80};
        $$b = 57;
    }
}
