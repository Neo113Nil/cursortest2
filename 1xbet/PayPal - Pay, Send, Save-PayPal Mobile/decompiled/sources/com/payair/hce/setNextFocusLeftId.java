package com.payair.hce;

/* loaded from: classes4.dex */
public final class setNextFocusLeftId {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static char[] RecordsJson;
    private static int getProfileVersion;
    private final com.payair.hce.checkPermission AlternateContactlessPaymentDataJson;
    private android.content.Context DigitizedCardProfile;
    private android.database.sqlite.SQLiteDatabase valueOf;
    private com.payair.hce.getDetailedMessage values;
    private com.payair.hce.ResponseCompleteTokenizeDto writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:4:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2 = 3 - (b2 * 4);
        int i3 = (b * 2) + 107;
        int i4 = s * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        if (bArr == null) {
            int i5 = i2;
            int i6 = 0;
            i3 += i5;
            i = i6;
            int i7 = i2;
            int i8 = i3;
            bArr2[i] = (byte) i8;
            int i9 = i7 + 1;
            if (i == 0 - i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2 = i9;
            i3 = bArr[i9];
            i6 = i + 1;
            i5 = i8;
            i3 += i5;
            i = i6;
            int i72 = i2;
            int i82 = i3;
            bArr2[i] = (byte) i82;
            int i92 = i72 + 1;
            if (i == 0 - i4) {
            }
        } else {
            i = 0;
            int i722 = i2;
            int i822 = i3;
            bArr2[i] = (byte) i822;
            int i922 = i722 + 1;
            if (i == 0 - i4) {
            }
        }
    }

    public setNextFocusLeftId() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{0, 16, 0, 8}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000", false, objArr);
        this.AlternateContactlessPaymentDataJson = com.payair.hce.checkPermission.DigitizedCardProfile(((java.lang.String) objArr[0]).intern());
    }

    public final void t_(android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.content.Context context, com.payair.hce.getDetailedMessage getdetailedmessage, com.payair.hce.ResponseCompleteTokenizeDto responseCompleteTokenizeDto) {
        int i = (getProfileVersion + 61) % 128;
        IccPrivateKeyCrtComponentsJson = i;
        this.valueOf = sQLiteDatabase;
        this.DigitizedCardProfile = context;
        this.values = getdetailedmessage;
        this.writeReplace = responseCompleteTokenizeDto;
        int i2 = i + 43;
        getProfileVersion = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void AlternateContactlessPaymentDataJson(int i) {
        com.payair.hce.setAccessibilityTraversalBefore setaccessibilitytraversalbefore = new com.payair.hce.setAccessibilityTraversalBefore(this.writeReplace);
        if (i == 2 || i == 65541) {
            IccPrivateKeyCrtComponentsJson = (getProfileVersion + 25) % 128;
            setaccessibilitytraversalbefore.AlternateContactlessPaymentDataJson(com.payair.hce.getBaseContext.valueOf).x_(this.valueOf, this.DigitizedCardProfile, this.values);
            u_(setaccessibilitytraversalbefore, this.valueOf);
            return;
        }
        if (i != 3) {
            int i2 = getProfileVersion;
            int i3 = i2 + 117;
            int i4 = i3 % 128;
            IccPrivateKeyCrtComponentsJson = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (i != 65542) {
                if (i != 2 && i != 65541 && i != 3 && i != 65542 && i < 65792) {
                    getProfileVersion = (i4 + 115) % 128;
                    setaccessibilitytraversalbefore.AlternateContactlessPaymentDataJson(com.payair.hce.getBaseContext.values).x_(this.valueOf, this.DigitizedCardProfile, this.values);
                    setaccessibilitytraversalbefore.AlternateContactlessPaymentDataJson(com.payair.hce.getBaseContext.AlternateContactlessPaymentDataJson).x_(this.valueOf, this.DigitizedCardProfile, this.values);
                    setaccessibilitytraversalbefore.AlternateContactlessPaymentDataJson(com.payair.hce.getBaseContext.getAid).x_(this.valueOf, this.DigitizedCardProfile, this.values);
                    int i5 = IccPrivateKeyCrtComponentsJson + 53;
                    getProfileVersion = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    return;
                }
                if (i >= 65792 && i < 66048) {
                    getProfileVersion = (i4 + 125) % 128;
                } else if (i < 66048 || i >= 66304) {
                    if (i >= 66304 && i < 131072) {
                        setaccessibilitytraversalbefore.AlternateContactlessPaymentDataJson(com.payair.hce.getBaseContext.AlternateContactlessPaymentDataJson).x_(this.valueOf, this.DigitizedCardProfile, this.values);
                        setaccessibilitytraversalbefore.AlternateContactlessPaymentDataJson(com.payair.hce.getBaseContext.getAid).x_(this.valueOf, this.DigitizedCardProfile, this.values);
                        return;
                    }
                    if (i >= 131072 && i < 131328) {
                        setaccessibilitytraversalbefore.AlternateContactlessPaymentDataJson(com.payair.hce.getBaseContext.getAid).x_(this.valueOf, this.DigitizedCardProfile, this.values);
                        return;
                    }
                    if ((i < 131584 || i >= 131840) && i != 131840) {
                        return;
                    }
                    int i6 = i2 + 99;
                    IccPrivateKeyCrtComponentsJson = i6 % 128;
                    if (i6 % 2 != 0) {
                        setaccessibilitytraversalbefore.AlternateContactlessPaymentDataJson(com.payair.hce.getBaseContext.RecordsJson).x_(this.valueOf, this.DigitizedCardProfile, this.values);
                        return;
                    } else {
                        setaccessibilitytraversalbefore.AlternateContactlessPaymentDataJson(com.payair.hce.getBaseContext.RecordsJson).x_(this.valueOf, this.DigitizedCardProfile, this.values);
                        return;
                    }
                }
                setaccessibilitytraversalbefore.AlternateContactlessPaymentDataJson(com.payair.hce.getBaseContext.DigitizedCardProfile).x_(this.valueOf, this.DigitizedCardProfile, this.values);
                setaccessibilitytraversalbefore.AlternateContactlessPaymentDataJson(com.payair.hce.getBaseContext.AlternateContactlessPaymentDataJson).x_(this.valueOf, this.DigitizedCardProfile, this.values);
                setaccessibilitytraversalbefore.AlternateContactlessPaymentDataJson(com.payair.hce.getBaseContext.getAid).x_(this.valueOf, this.DigitizedCardProfile, this.values);
                return;
            }
        }
        u_(setaccessibilitytraversalbefore, this.valueOf);
    }

    private void u_(com.payair.hce.setAccessibilityTraversalBefore setaccessibilitytraversalbefore, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 75) % 128;
        setaccessibilitytraversalbefore.AlternateContactlessPaymentDataJson(com.payair.hce.getBaseContext.writeReplace).x_(sQLiteDatabase, this.DigitizedCardProfile, this.values);
        setaccessibilitytraversalbefore.AlternateContactlessPaymentDataJson(com.payair.hce.getBaseContext.values).x_(sQLiteDatabase, this.DigitizedCardProfile, this.values);
        setaccessibilitytraversalbefore.AlternateContactlessPaymentDataJson(com.payair.hce.getBaseContext.AlternateContactlessPaymentDataJson).x_(sQLiteDatabase, this.DigitizedCardProfile, this.values);
        setaccessibilitytraversalbefore.AlternateContactlessPaymentDataJson(com.payair.hce.getBaseContext.getAid).x_(sQLiteDatabase, this.DigitizedCardProfile, this.values);
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 81) % 128;
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        int length;
        char[] cArr;
        char[] cArr2;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            $11 = ($10 + 53) % 128;
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        char c = 0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = 3;
        int i6 = iArr[3];
        char[] cArr3 = RecordsJson;
        if (cArr3 != null) {
            int i7 = $10 + 83;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr3.length;
                cArr = new char[length];
            } else {
                length = cArr3.length;
                cArr = new char[length];
            }
            int i8 = 0;
            while (i8 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[c] = java.lang.Integer.valueOf(cArr3[i8]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 29, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2807, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                        byte b = (byte) ($$b & i5);
                        byte b2 = (byte) (b - 1);
                        cArr2 = cArr3;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b, b2, b2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    } else {
                        cArr2 = cArr3;
                    }
                    cArr[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i8++;
                    cArr3 = cArr2;
                    c = 0;
                    i5 = 3;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr;
        }
        char[] cArr4 = new char[i3];
        java.lang.System.arraycopy(cArr3, i2, cArr4, 0, i3);
        if (bArr2 != null) {
            $10 = ($11 + 27) % 128;
            char[] cArr5 = new char[i3];
            getaccounttype.writeReplace = 0;
            char c2 = 0;
            while (getaccounttype.writeReplace < i3) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    $11 = ($10 + 107) % 128;
                    int i9 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.MotionEvent.axisFromString(""), 2837 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((byte) 0, (short) 0, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr5[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43, android.view.KeyEvent.getDeadChar(0, 0) + 2880, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b((byte) 2, (short) 0, (byte) 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr5[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c2 = cArr5[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, (char) android.view.KeyEvent.getDeadChar(0, 0))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i3];
            i = 0;
            java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i3);
            int i11 = i3 - i6;
            java.lang.System.arraycopy(cArr6, 0, cArr4, i11, i6);
            java.lang.System.arraycopy(cArr6, i6, cArr4, 0, i11);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i3];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i3) {
                    break;
                }
                $11 = ($10 + 13) % 128;
                cArr7[getaccounttype.writeReplace] = cArr4[(i3 - getaccounttype.writeReplace) - 1];
                i = getaccounttype.writeReplace + 1;
            }
            cArr4 = cArr7;
        }
        if (i4 > 0) {
            int i12 = $10 + 11;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                getaccounttype.writeReplace = 1;
            } else {
                getaccounttype.writeReplace = 0;
            }
            while (getaccounttype.writeReplace < i3) {
                cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                getaccounttype.writeReplace++;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        getProfileVersion = 1;
        RecordsJson = new char[]{16862, 16884, 16796, 16773, 16770, 16775, 16780, 16778, 16778, 16780, 16772, 16772, 16783, 16783, 16772, 16770, 16887, 16800, 16802, 16800, 16830, 16810, 16812, 16805, 16802, 16807, 16812, 16810, 16780, 16781, 16802, 16830, 16800, 16776, 16782, 16808, 16802, 16776, 16773, 16803, 16805, 16889, 16800, 16802, 16800, 16828, 16805, 16787, 16787, 16806, 16830, 16802, 16807, 16784, 16791, 16802, 16804, 16807, 16807, 16806, 16804, 16786, 16789, 16807, 16793, 16794, 16805, 16787, 16787, 16800, 16802, 16800, 16805, 16812, 16804, 16830, 16809, 16807, 16813, 16884, 16776, 16800, 16830, 16802, 16781, 16780, 16810, 16812, 16807, 16802, 16805, 16812, 16893, 16802, 16830, 16800, 16776, 16889, 16784, 16807, 16785, 16785, 16805, 16830, 16815, 16786, 16805, 16803, 16809, 16802, 16810, 16812, 16805, 16802, 16807, 16812, 16810, 16780, 16830, 16661, 16667, 16660, 16668, 16670, 16663, 16660, 16665, 16670, 16668, 16766, 16767, 16660, 16656, 16658, 16762, 16747, 16642, 16665, 16646, 16642, 16665, 16644, 16644, 16663, 16661, 16667, 16660, 16761, 16763, 16656, 16761, 16747, 16642, 16665, 16644, 16669, 16687, 16641, 16644, 16717, 16590, 16665, 16664, 16694, 16696, 16691, 16590, 16689, 16696, 16694, 16590, 16693, 16591, 16689, 16702, 16702, 16695, 16689, 16591, 16700, 16702, 16691, 16700, 16645, 16660, 16588, 16890, 16803, 16810, 16808, 16800, 16807, 16801, 16803, 16784, 16813, 16827, 16809, 16784, 16805, 16814, 16887, 16774, 16830, 16828, 16800, 16779, 16778, 16808, 16810, 16805, 16711, 16576, 16689, 16692, 16584, 16581, 16692, 16693, 16688, 16590, 16576, 16690, 16695, 16582, 16584, 16590, 16699, 16695, 16586, 16694, 16691, 16584, 16585, 16586, 16691, 16689, 16659, 16656, 16585, 16581, 16583, 16687, 16667, 16590, 16576, 16690};
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.CAN, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -20, -99};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE;
    }
}
