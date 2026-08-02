package com.payair.hce;

/* loaded from: classes4.dex */
public final class access100 extends com.payair.hce.access202 {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char valueOf;
    private static int values;
    private static long writeReplace;
    private com.payair.hce.onTaskStatusCompleted DigitizedCardProfile;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9, types: [int] */
    private static void a(byte b, short s, int i, java.lang.Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = (b * 2) + 4;
        int i3 = 65 - (s * 4);
        int i4 = i * 4;
        byte[] bArr2 = new byte[35 - i4];
        int i5 = -1;
        ?? r6 = i3;
        if (bArr == null) {
            i2++;
            r6 = (i2 + i3) - 2;
        }
        while (true) {
            byte b2 = r6;
            int i6 = i2;
            i5++;
            bArr2[i5] = b2;
            if (i5 == 34 - i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i2 = i6 + 1;
                r6 = (b2 + bArr[i6]) - 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = 3 - (i * 2);
        int i5 = i2 * 3;
        byte[] bArr = $$d;
        int i6 = s + 102;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i4;
            int i9 = i7;
            int i10 = 0;
            i6 = (-i6) + i9;
            i4 = i8;
            i3 = i10;
            int i11 = i4 + 1;
            bArr2[i3] = (byte) i6;
            i10 = i3 + 1;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = bArr[i11];
            i9 = i6;
            i6 = i12;
            i8 = i11;
            i6 = (-i6) + i9;
            i4 = i8;
            i3 = i10;
            int i112 = i4 + 1;
            bArr2[i3] = (byte) i6;
            i10 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            int i1122 = i4 + 1;
            bArr2[i3] = (byte) i6;
            i10 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    @Override // com.payair.hce.access202
    public final com.payair.hce.activateCardForToken writeReplace() {
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 67) % 128;
        com.payair.hce.activateCardForToken activatecardfortoken = com.payair.hce.activateCardForToken.valueOf;
        int i = RecordsJson + 125;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            return activatecardfortoken;
        }
        throw null;
    }

    public final com.payair.hce.onTaskStatusCompleted valueOf() {
        int i = RecordsJson + 77;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            return this.DigitizedCardProfile;
        }
        throw null;
    }

    private static void c(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char c2;
        if (str3 != null) {
            $10 = ($11 + 39) % 128;
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr2 = cArr;
        char[] charArray = str2 != null ? str2.toCharArray() : str2;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length);
        java.lang.System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        char c3 = 2;
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr5 = new char[length3];
        getwalletdata.writeReplace = 0;
        $10 = ($11 + 101) % 128;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 71, 1179 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) android.text.TextUtils.getTrimmedLength(""));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((short) 0, 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.US, 3443 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (3831 - android.text.TextUtils.getOffsetAfter("", 0)))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                char c4 = cArr3[getwalletdata.writeReplace % 4];
                java.lang.Object[] objArr5 = new java.lang.Object[3];
                objArr5[c3] = java.lang.Integer.valueOf(cArr4[intValue]);
                objArr5[1] = java.lang.Integer.valueOf(c4 * 32718);
                objArr5[0] = getwalletdata;
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 26, 1864 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.graphics.Color.blue(0) + 41775));
                    byte b = (byte) ($$e & 7);
                    byte b2 = (byte) (b - 3);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    d(b, b2, b2, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3085, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    byte length4 = (byte) $$d.length;
                    byte b3 = (byte) (length4 - 4);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    d(length4, b3, b3, objArr8);
                    c2 = 2;
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                } else {
                    c2 = 2;
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr3[intValue2] = getwalletdata.values;
                cArr5[getwalletdata.writeReplace] = (char) ((((charArray2[getwalletdata.writeReplace] ^ cArr3[intValue2]) ^ (writeReplace ^ 1263759066225628708L)) ^ ((int) (values ^ 1263759066225628708L))) ^ ((char) (valueOf ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                c3 = c2;
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

    /* JADX WARN: Removed duplicated region for block: B:41:0x01d9 A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:11:0x003e, B:13:0x0055, B:14:0x008e, B:32:0x00c9, B:34:0x00e6, B:35:0x0123, B:39:0x01c6, B:41:0x01d9, B:43:0x0212, B:48:0x013b, B:50:0x0159, B:51:0x01a1), top: B:10:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        char[] cArr;
        java.lang.Object obj;
        java.lang.String str2 = str;
        int i2 = $10 + 33;
        $11 = i2 % 128;
        byte[] bArr = str2;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = AlternateContactlessPaymentDataJson;
        long j = 0;
        if (cArr2 != null) {
            $11 = ($10 + 73) % 128;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i4];
                    objArr2[0] = java.lang.Integer.valueOf(cArr2[i8]);
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 2808, (char) android.graphics.Color.argb(0, 0, 0, 0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d((short) 7, 0, 0, objArr3);
                        obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj2);
                    }
                    cArr3[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr2)).charValue();
                    i8++;
                    i4 = 1;
                    j = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i5];
        java.lang.System.arraycopy(cArr2, i3, cArr4, 0, i5);
        if (bArr2 != null) {
            char[] cArr5 = new char[i5];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i5) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i9 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 44, android.text.TextUtils.getTrimmedLength("") + 2836, (char) android.view.View.getDefaultSize(0, 0));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d((short) 5, 0, 0, objArr5);
                        obj3 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr5[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).charValue();
                } else {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj4 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.view.MotionEvent.axisFromString(""), android.widget.ExpandableListView.getPackedPositionType(0L) + 2880, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        d((byte) ($$e & 13), 0, 0, objArr7);
                        obj4 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj4);
                    }
                    cArr5[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).charValue();
                    int i11 = $11 + 29;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 5 / 3;
                        c = cArr5[getaccounttype.writeReplace];
                        java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                        if (obj != null) {
                            obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.text.TextUtils.getCapsMode("", 0, 0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 211, (char) android.text.TextUtils.getCapsMode("", 0, 0))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj);
                        }
                        ((java.lang.reflect.Method) obj).invoke(null, objArr8);
                    }
                }
                c = cArr5[getaccounttype.writeReplace];
                java.lang.Object[] objArr82 = {getaccounttype, getaccounttype};
                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj != null) {
                }
                ((java.lang.reflect.Method) obj).invoke(null, objArr82);
            }
            cArr4 = cArr5;
        }
        if (i7 > 0) {
            char[] cArr6 = new char[i5];
            java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i5);
            int i13 = i5 - i7;
            java.lang.System.arraycopy(cArr6, 0, cArr4, i13, i7);
            java.lang.System.arraycopy(cArr6, i7, cArr4, 0, i13);
        }
        if (z) {
            int i14 = $11 + 11;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                cArr = new char[i5];
                i = 1;
                getaccounttype.writeReplace = 1;
            } else {
                i = 1;
                cArr = new char[i5];
                getaccounttype.writeReplace = 0;
            }
            while (getaccounttype.writeReplace < i5) {
                cArr[getaccounttype.writeReplace] = cArr4[(i5 - getaccounttype.writeReplace) - i];
                getaccounttype.writeReplace += i;
                i = 1;
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i5) {
                cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                getaccounttype.writeReplace++;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        RecordsJson = 1;
        AlternateContactlessPaymentDataJson = new char[]{16891, 16811, 16805, 16805, 16802, 16797, 16798, 16802, 16810, 16802, 16829, 16803, 16800, 16824, 16797, 16777, 16805, 16826, 16800, 16773, 16797, 16792, 16892, 16894, 16865, 16781, 16776, 16892, 16894, 16782, 16815, 16803, 16805, 16806, 16808, 16802, 16806, 16808, 16786, 16756, 16737, 16744, 16723, 16736, 16642, 16668, 16664, 16671, 16641, 16755, 16747, 16738, 16749, 16737, 16666, 16671, 16647, 16756, 16726, 16742, 16642, 16668, 16664, 16671, 16641, 16755, 16747, 16741, 16736, 16893, 16800, 16805, 16813, 16794, 16892, 16780, 16808, 16802, 16830, 16805, 16807, 16793, 16881, 16779, 16774, 16889, 16774, 16808, 16802, 16830, 16805, 16807, 16793, 16881, 16776, 16883, 16881, 16794, 16775, 16782, 16883, 16719, 16717, 16715, 16708, 16712, 16718, 16813, 16812, 16717, 16710, 16709, 16712, 16717, 16709, 16805, 16796, 16829, 16710, 16709, 16712, 16710, 16734, 16893, 16808, 16802, 16812, 16790, 16812, 16809, 16808, 16810, 16808, 16791, 16793, 16809, 16809, 16810, 16808, 16805, 16893, 16808, 16802, 16812, 16790, 16812, 16809, 16808, 16810, 16808, 16791, 16793, 16809, 16807, 16830, 16659, 16659, 16656, 16663, 16657, 16667, 16645, 16667, 16660, 16663, 16665, 16663, 16644, 16887, 16800, 16806, 16804, 16809, 16804, 16826, 16829, 16805, 16802, 16798, 16722, 16748, 16748, 16816, 16713, 16749, 16725, 16749, 16740, 16746, 16747, 16739, 16708, 16817, 16725, 16748, 16740, 16710, 16801, 16709, 16748, 16740, 16747, 16720, 16720, 16723, 16727, 16751, 16749, 16706, 16708, 16727, 16748, 16742, 16745, 16738, 16798, 16748, 16747, 16722, 16727, 16724, 16728, 16726, 16726, 16720, 16734, 16810, 16641, 16671, 16669, 16662, 16666, 16640, 16767, 16766, 16671, 16664, 16663, 16666, 16671, 16663, 16759, 16761, 16664, 16763, 16742, 16648, 16670, 16668, 16641, 16668, 16658, 16661, 16669, 16887, 16805, 16807, 16807, 16808, 16808, 16802, 16804, 16812, 16808, 16809, 16809, 16800, 16829, 16805, 16794, 16794, 16802, 16804, 16890, 16800, 16824, 16797, 16774, 16810, 16805, 16829, 16799, 16781, 16776, 16892, 16890, 16880, 16794, 16805, 16829, 16800, 16809, 16809, 16808, 16812, 16804, 16802, 16809, 16811, 16805, 16805, 16777, 16798, 16802, 16810, 16802, 16829};
        writeReplace = 1263759066225628708L;
        values = -804334044;
        valueOf = (char) 16468;
    }

    static void init$1() {
        $$d = new byte[]{70, 56, kotlin.io.encoding.Base64.padSymbol, 63};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{com.visa.cbp.getEncExpo.IResultReceiver, -50, -127, 91, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
        $$b = 63;
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v20 */
    public static java.lang.Object[] valueOf(android.content.Context context, int i, int i2) {
        int i3 = 0;
        try {
            if (context == null) {
                java.lang.Object[] objArr = {new int[]{i}, new int[]{i}, null, new int[1]};
                int i4 = ~i;
                int i5 = ~(620278785 | i4);
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(i4 | 384650199)) | 537965568) * (-1188)) - 1614563218) + (((~(i | (-384650200))) | 537965568 | i5) * 594) + (((~(i4 | (-384650200))) | 302336982 | i5) * 594))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 51, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2712, (char) (android.os.Process.myPid() >> 22));
                    byte b = (byte) ($$a[14] - 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(b, b, b, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                return objArr;
            }
            try {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b(new int[]{0, 38, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", false, objArr4);
                java.lang.Object[] objArr5 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName(((java.lang.String) objArr4[0]).intern()), 2);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b(new int[]{38, 31, 102, 0}, "\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001", true, objArr6);
                try {
                    java.lang.Object[] objArr7 = {((java.lang.String) objArr6[0]).intern()};
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(new int[]{0, 38, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", false, objArr8);
                    objArr5[0] = java.lang.Class.forName(((java.lang.String) objArr8[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr7);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b(new int[]{69, 31, 0, 0}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", true, objArr9);
                    try {
                        java.lang.Object[] objArr10 = {((java.lang.String) objArr9[0]).intern()};
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        b(new int[]{0, 38, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", false, objArr11);
                        objArr5[1] = java.lang.Class.forName(((java.lang.String) objArr11[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr10);
                        try {
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            b(new int[]{100, 23, 26, 0}, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000", false, objArr12);
                            java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr12[0]).intern());
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 17, 0, 0}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001", false, objArr13);
                            java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr13[0]).intern(), null).invoke(context, null);
                            try {
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                b(new int[]{100, 23, 26, 0}, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000", false, objArr14);
                                java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr14[0]).intern());
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                b(new int[]{140, 14, 0, 0}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000", false, objArr15);
                                try {
                                    java.lang.Object[] objArr16 = {cls3.getMethod(((java.lang.String) objArr15[0]).intern(), null).invoke(context, null), 64};
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    c("誡暇錁❐ꜵӘ뢵ᚾ\uee0bɿ쯅䢏ᦿ\u0014吃\uf13e﨎픤\udb9a\uea34∘멮떂䃣떩懑ၼ뺐ᒧ\u0a3d낮\uea3d瞕", "鞧端済毸", android.graphics.Color.green(0) + 142274455, "\u0000\u0000\u0000\u0000", (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr17);
                                    java.lang.Class<?> cls4 = java.lang.Class.forName(((java.lang.String) objArr17[0]).intern());
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    b(new int[]{154, 14, 115, 3}, "\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000", false, objArr18);
                                    java.lang.Object invoke2 = cls4.getMethod(((java.lang.String) objArr18[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr16);
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    c("\ue56b\uea2f敎繧䠽불塟\u139eᅧ鴡꼘ꏱ聒ꫲ肷\udbe6앂녣脙搡ᗹ뽁幍\u1c38\ued79ጇ䮡္ῳ\uf28f", "忸祕쎵\ue4c9", android.view.MotionEvent.axisFromString("") + 1, "\u0000\u0000\u0000\u0000", (char) (51650 - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr19);
                                    java.lang.Class<?> cls5 = java.lang.Class.forName(((java.lang.String) objArr19[0]).intern());
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 10, 0, 0}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, objArr20);
                                    java.lang.Object[] objArr21 = (java.lang.Object[]) cls5.getField(((java.lang.String) objArr20[0]).intern()).get(invoke2);
                                    int length = objArr21.length;
                                    int i6 = 0;
                                    while (i6 < length) {
                                        java.lang.Object obj2 = objArr21[i6];
                                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                                        c("\uddad턯㏊\udca7뼖", "ᱨ쪨\uf3eb\uee83", (-339040228) - ((android.os.Process.getThreadPriority(i3) + 20) >> 6), "\u0000\u0000\u0000\u0000", (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 33779), objArr22);
                                        try {
                                            java.lang.Object[] objArr23 = {((java.lang.String) objArr22[i3]).intern()};
                                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                                            b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, 37, 55, i3}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", i3, objArr24);
                                            java.lang.Class<?> cls6 = java.lang.Class.forName(((java.lang.String) objArr24[i3]).intern());
                                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                                            b(new int[]{215, 11, 50, 7}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", false, objArr25);
                                            java.lang.Object invoke3 = cls6.getMethod(((java.lang.String) objArr25[0]).intern(), java.lang.String.class).invoke(null, objArr23);
                                            try {
                                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                b(new int[]{226, 28, 104, 0}, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", false, objArr26);
                                                java.lang.Class<?> cls7 = java.lang.Class.forName(((java.lang.String) objArr26[0]).intern());
                                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                c("匾켯ꔹ콜唳闙\uf0b7䰰\ue6a4ᡩ䜆", "\u0004\uf8c6Ф\ue7ab", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 620283393, "\u0000\u0000\u0000\u0000", (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr27);
                                                try {
                                                    java.lang.Object[] objArr28 = {new java.io.ByteArrayInputStream((byte[]) cls7.getMethod(((java.lang.String) objArr27[0]).intern(), null).invoke(obj2, null))};
                                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                    b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, 37, 55, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", false, objArr29);
                                                    java.lang.Class<?> cls8 = java.lang.Class.forName(((java.lang.String) objArr29[0]).intern());
                                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                    b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 19, 0, 5}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001", true, objArr30);
                                                    java.lang.Object invoke4 = cls8.getMethod(((java.lang.String) objArr30[0]).intern(), java.io.InputStream.class).invoke(invoke3, objArr28);
                                                    int length2 = objArr5.length;
                                                    for (int i7 = 0; i7 < 2; i7++) {
                                                        java.lang.Object obj3 = objArr5[i7];
                                                        try {
                                                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                            b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 34, 0, 24}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001", false, objArr31);
                                                            java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr31[0]).intern());
                                                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                            c("ॖ琡䳂龭\udaae鐜ǭ谏ज헢拑鰜穁\ue753㞎쇬ㇾ꒐ꇍ콵\uf367၊壕", "恓ꦿᏓ榱", (-743850144) - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) ((-1) - android.view.MotionEvent.axisFromString("")), objArr32);
                                                            if (obj3.equals(cls9.getMethod(((java.lang.String) objArr32[0]).intern(), null).invoke(invoke4, null))) {
                                                                java.lang.Object[] objArr33 = {new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                                                                int i8 = ~i;
                                                                try {
                                                                    java.lang.Object[] objArr34 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((-39738464) | i) * 140) - 528648328) + (((~((-39738464) | i8)) | 38034456) * (-280)) + (((~(i8 | 1044667448)) | (-1046371456) | (~((-38034457) | i))) * 140))};
                                                                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj4 == null) {
                                                                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 50, android.graphics.Color.argb(0, 0, 0, 0) + 2713, (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                                                        byte b2 = (byte) ($$a[14] - 1);
                                                                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                                        a(b2, b2, b2, objArr35);
                                                                        obj4 = cls10.getMethod((java.lang.String) objArr35[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                                                                    }
                                                                    ((int[]) objArr33[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr34)).intValue();
                                                                    return objArr33;
                                                                } catch (java.lang.Throwable th) {
                                                                    java.lang.Throwable cause = th.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (java.lang.Throwable th2) {
                                                            java.lang.Throwable cause2 = th2.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th2;
                                                        }
                                                    }
                                                    i6++;
                                                    i3 = 0;
                                                } catch (java.lang.Throwable th3) {
                                                    java.lang.Throwable cause3 = th3.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th3;
                                                }
                                            } catch (java.lang.Throwable th4) {
                                                java.lang.Throwable cause4 = th4.getCause();
                                                if (cause4 != null) {
                                                    throw cause4;
                                                }
                                                throw th4;
                                            }
                                        } catch (java.lang.Throwable th5) {
                                            java.lang.Throwable cause5 = th5.getCause();
                                            if (cause5 != null) {
                                                throw cause5;
                                            }
                                            throw th5;
                                        }
                                    }
                                } catch (java.lang.Throwable th6) {
                                    java.lang.Throwable cause6 = th6.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th6;
                                }
                            } catch (java.lang.Throwable th7) {
                                java.lang.Throwable cause7 = th7.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th7;
                            }
                        } catch (java.lang.Throwable th8) {
                            java.lang.Throwable cause8 = th8.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th8;
                        }
                    } catch (java.lang.Throwable th9) {
                        java.lang.Throwable cause9 = th9.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th9;
                    }
                } catch (java.lang.Throwable th10) {
                    java.lang.Throwable cause10 = th10.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th10;
                }
            } catch (java.lang.Throwable unused) {
            }
            java.lang.Object[] objArr36 = {new int[]{i}, new int[]{i}, null, new int[1]};
            int i9 = ~i;
            java.lang.Object[] objArr37 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((((~(i9 | (-858289096))) | (~(i | (-146639890)))) | (~(i9 | 146639889))) * 959) - 1509031976) + (((~(i | (-858289096))) | (~(i9 | (-146639890))) | (~(146639889 | i))) * 959))};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj5 == null) {
                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 50, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2713, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                byte b3 = (byte) ($$a[14] - 1);
                java.lang.Object[] objArr38 = new java.lang.Object[1];
                a(b3, b3, b3, objArr38);
                obj5 = cls11.getMethod((java.lang.String) objArr38[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
            }
            ((int[]) objArr36[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr37)).intValue();
            return objArr36;
        } catch (java.lang.Throwable th11) {
            java.lang.Throwable cause11 = th11.getCause();
            if (cause11 != null) {
                throw cause11;
            }
            throw th11;
        }
    }
}
