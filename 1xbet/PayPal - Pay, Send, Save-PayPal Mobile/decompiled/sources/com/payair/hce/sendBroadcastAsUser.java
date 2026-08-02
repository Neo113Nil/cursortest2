package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AlternateContactlessPaymentDataJson' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class sendBroadcastAsUser {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.sendBroadcastAsUser AlternateContactlessPaymentDataJson;
    private static int[] DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static final /* synthetic */ com.payair.hce.sendBroadcastAsUser[] valueOf;
    private static com.payair.hce.sendBroadcastAsUser writeReplace;
    private final java.lang.String values;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        ?? r7 = 66 - (b * 3);
        byte[] bArr = $$a;
        int i3 = (s2 * 4) + 1;
        int i4 = s + 4;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            byte b2 = r7;
            i = 0;
            int i5 = i4;
            int i6 = i5;
            i2 = i4 + b2;
            i4 = i6;
            int i7 = i4 + 1;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            b2 = bArr[i7];
            int i8 = i2;
            i5 = i7;
            i4 = i8;
            int i62 = i5;
            i2 = i4 + b2;
            i4 = i62;
            int i72 = i4 + 1;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i3) {
            }
        } else {
            i = 0;
            i2 = r7;
            int i722 = i4 + 1;
            bArr2[i] = (byte) i2;
            i++;
            if (i == i3) {
            }
        }
    }

    public static com.payair.hce.sendBroadcastAsUser valueOf(java.lang.String str) {
        RecordsJson = (IccPrivateKeyCrtComponentsJson + 103) % 128;
        com.payair.hce.sendBroadcastAsUser sendbroadcastasuser = (com.payair.hce.sendBroadcastAsUser) java.lang.Enum.valueOf(com.payair.hce.sendBroadcastAsUser.class, str);
        int i = IccPrivateKeyCrtComponentsJson + 33;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            return sendbroadcastasuser;
        }
        throw null;
    }

    public static com.payair.hce.sendBroadcastAsUser[] values() {
        IccPrivateKeyCrtComponentsJson = (RecordsJson + 23) % 128;
        com.payair.hce.sendBroadcastAsUser[] sendbroadcastasuserArr = (com.payair.hce.sendBroadcastAsUser[]) valueOf.clone();
        RecordsJson = (IccPrivateKeyCrtComponentsJson + 117) % 128;
        return sendbroadcastasuserArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        RecordsJson = 1;
        AlternateContactlessPaymentDataJson();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{-1274961507, 1384336571, 2078026333, -869185485}, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 8, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{-417702297, 1513910699, -1088107350, -1785119103}, 7 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
        com.payair.hce.sendBroadcastAsUser sendbroadcastasuser = new com.payair.hce.sendBroadcastAsUser(intern, 0, ((java.lang.String) objArr2[0]).intern());
        AlternateContactlessPaymentDataJson = sendbroadcastasuser;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(new int[]{1203731465, -990621958, -2037120060, 251706655, 1838027724, 586672026}, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12, objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(new int[]{1689393784, -1345849960, 1118421591, 226805620, 476868927, -672617026, 14922516, 397665430}, 13 - android.view.View.getDefaultSize(0, 0), objArr4);
        com.payair.hce.sendBroadcastAsUser sendbroadcastasuser2 = new com.payair.hce.sendBroadcastAsUser(intern2, 1, ((java.lang.String) objArr4[0]).intern());
        writeReplace = sendbroadcastasuser2;
        valueOf = new com.payair.hce.sendBroadcastAsUser[]{sendbroadcastasuser, sendbroadcastasuser2};
        int i = IccPrivateKeyCrtComponentsJson + 107;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private sendBroadcastAsUser(java.lang.String str, int i, java.lang.String str2) {
        this.values = str2;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        int i = RecordsJson;
        int i2 = i + 55;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.values;
        int i3 = i + 27;
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int[] iArr2;
        int i2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = DigitizedCardProfile;
        int i3 = 1;
        char c = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i4 = 0;
            while (i4 < length) {
                $11 = ($10 + 77) % 128;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[c] = java.lang.Integer.valueOf(iArr3[i4]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.os.Process.myTid() >> 22), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29, (char) android.view.KeyEvent.keyCodeFromString(""))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr4[i4] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i4++;
                    c = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = DigitizedCardProfile;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i5 = 0;
            while (i5 < length3) {
                java.lang.Object[] objArr3 = new java.lang.Object[i3];
                objArr3[0] = java.lang.Integer.valueOf(iArr6[i5]);
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    iArr2 = iArr6;
                    i2 = length3;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 26, 28 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.view.Gravity.getAbsoluteGravity(0, 0))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    iArr2 = iArr6;
                    i2 = length3;
                }
                iArr7[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i5++;
                iArr6 = iArr2;
                length3 = i2;
                i3 = 1;
            }
            iArr6 = iArr7;
        }
        char c2 = 0;
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length2);
        istransitsupported.valueOf = 0;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[c2] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            int i6 = 0;
            for (int i7 = 16; i6 < i7; i7 = 16) {
                int i8 = $11 + 95;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    istransitsupported.DigitizedCardProfile ^= iArr5[i6];
                    java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31, 5087 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.text.TextUtils.getOffsetBefore("", 0))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue;
                    i6 += 44;
                } else {
                    istransitsupported.DigitizedCardProfile ^= iArr5[i6];
                    java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.graphics.Color.alpha(0), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 5089, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue2;
                    i6++;
                }
            }
            int i9 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i9;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i10 = istransitsupported.DigitizedCardProfile;
            int i11 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr5);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr6 = {istransitsupported, istransitsupported};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj5 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 48, android.view.View.MeasureSpec.getSize(0) + 2923, (char) (3037 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)));
                byte b = $$a[3];
                byte b2 = (byte) (b - 1);
                byte b3 = b;
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(b2, b3, b3, objArr7);
                obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
            $11 = ($10 + 27) % 128;
            c2 = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    static void AlternateContactlessPaymentDataJson() {
        DigitizedCardProfile = new int[]{-1780185597, 2039204851, -1496358476, 2064037110, -1904875112, -965726197, 1561640561, -984652364, 610117943, -2140278153, 2048342664, -1961752571, -150747645, -1982461823, 207022396, 1654874084, 1106791257, -1769133720};
    }

    static void init$0() {
        $$a = new byte[]{125, 17, -56, 0};
        $$b = 185;
    }
}
