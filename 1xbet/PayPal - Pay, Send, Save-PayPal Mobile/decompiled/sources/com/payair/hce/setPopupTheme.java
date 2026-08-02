package com.payair.hce;

/* loaded from: classes4.dex */
public final class setPopupTheme extends com.payair.hce.setEms {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int DigitizedCardProfile;
    private static int valueOf;
    private static final char[] values;
    private static char[] writeReplace;
    private final byte[] AlternateContactlessPaymentDataJson;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2 = 4 - (b * 3);
        byte[] bArr = $$a;
        ?? r8 = (s * 2) + 107;
        int i3 = b2 * 3;
        byte[] bArr2 = new byte[1 - i3];
        int i4 = -1;
        if (bArr == null) {
            byte b3 = r8;
            i = i2;
            i2 += b3;
            i++;
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == 0 - i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            b3 = bArr[i];
            i2 += b3;
            i++;
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == 0 - i3) {
            }
        } else {
            i = i2;
            i2 = r8;
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == 0 - i3) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        valueOf = 1;
        valueOf();
        values = new char[]{com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        valueOf = (DigitizedCardProfile + 11) % 128;
    }

    public setPopupTheme(byte[] bArr) {
        this.AlternateContactlessPaymentDataJson = com.payair.hce.getClientVersion.values(bArr);
    }

    private java.lang.String values() {
        int i = 0;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{0, 1, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, 1}, null, true, objArr);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(((java.lang.String) objArr[0]).intern());
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            new com.payair.hce.setMaxLines(byteArrayOutputStream).DigitizedCardProfile(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            while (i != byteArray.length) {
                int i2 = DigitizedCardProfile + 85;
                valueOf = i2 % 128;
                if (i2 % 2 == 0) {
                    char[] cArr = values;
                    stringBuffer.append(cArr[(byteArray[i] + 2) & 64]);
                    stringBuffer.append(cArr[byteArray[i] & 100]);
                    i += 33;
                } else {
                    char[] cArr2 = values;
                    stringBuffer.append(cArr2[(byteArray[i] >>> 4) & 15]);
                    stringBuffer.append(cArr2[byteArray[i] & com.google.common.base.Ascii.SI]);
                    i++;
                }
                DigitizedCardProfile = (valueOf + 83) % 128;
            }
            return stringBuffer.toString();
        } catch (java.io.IOException unused) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(new int[]{1, 33, 0, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001", true, objArr2);
            throw new com.payair.hce.setLines(((java.lang.String) objArr2[0]).intern());
        }
    }

    public final java.lang.String toString() {
        DigitizedCardProfile = (valueOf + 75) % 128;
        java.lang.String values2 = values();
        int i = DigitizedCardProfile + 63;
        valueOf = i % 128;
        if (i % 2 != 0) {
            return values2;
        }
        throw new java.lang.ArithmeticException();
    }

    private byte[] SdkCoreAlternateContactlessPaymentDataImpl() {
        int i = valueOf + 31;
        DigitizedCardProfile = i % 128;
        byte[] bArr = this.AlternateContactlessPaymentDataJson;
        if (i % 2 == 0) {
            return com.payair.hce.getClientVersion.values(bArr);
        }
        com.payair.hce.getClientVersion.values(bArr);
        throw null;
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        DigitizedCardProfile = (valueOf + 113) % 128;
        return false;
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() {
        int i = valueOf + 57;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            int length = this.AlternateContactlessPaymentDataJson.length;
            return (1 - ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length)}, -1174070258, 1174070259, length)).intValue()) >>> this.AlternateContactlessPaymentDataJson.length;
        }
        int length2 = this.AlternateContactlessPaymentDataJson.length;
        return ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length2)}, -1174070258, 1174070259, length2)).intValue() + 1 + this.AlternateContactlessPaymentDataJson.length;
    }

    @Override // com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        int i = valueOf + 53;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            setmaxlines.AlternateContactlessPaymentDataJson(35, SdkCoreAlternateContactlessPaymentDataImpl());
        } else {
            setmaxlines.AlternateContactlessPaymentDataJson(28, SdkCoreAlternateContactlessPaymentDataImpl());
        }
        int i2 = valueOf + 83;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.payair.hce.setEms
    final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        if (setems instanceof com.payair.hce.setPopupTheme) {
            return com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(this.AlternateContactlessPaymentDataJson, ((com.payair.hce.setPopupTheme) setems).AlternateContactlessPaymentDataJson);
        }
        int i = valueOf;
        DigitizedCardProfile = (i + 57) % 128;
        DigitizedCardProfile = (i + 79) % 128;
        return false;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setPopupTheme setpopuptheme = (com.payair.hce.setPopupTheme) objArr[0];
        DigitizedCardProfile = (valueOf + 69) % 128;
        int AlternateContactlessPaymentDataJson = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(setpopuptheme.AlternateContactlessPaymentDataJson);
        int i = valueOf + 59;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            return java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson);
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        java.lang.String str2 = str;
        int i = ($11 + 53) % 128;
        $10 = i;
        byte[] bArr = str2;
        if (str2 != null) {
            int i2 = i + 87;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr3 = writeReplace;
        if (cArr3 != null) {
            $10 = ($11 + 125) % 128;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[i3] = java.lang.Integer.valueOf(cArr3[i8]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(i3) + 30, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2807, (char) (android.view.MotionEvent.axisFromString("") + 1));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((byte) 0, (byte) 0, (short) 1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr4[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i8++;
                    i3 = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        char[] cArr5 = new char[i5];
        char c = 0;
        java.lang.System.arraycopy(cArr3, i4, cArr5, 0, i5);
        if (bArr2 != null) {
            int i9 = $11 + 5;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr2 = new char[i5];
                getaccounttype.writeReplace = 0;
            } else {
                cArr2 = new char[i5];
                getaccounttype.writeReplace = 0;
                c = 0;
            }
            while (getaccounttype.writeReplace < i5) {
                $10 = ($11 + 73) % 128;
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr5[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43, 2835 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((byte) 0, (byte) 0, (short) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr2[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr5[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2880, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b((byte) 0, (byte) 0, (short) 2, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr2[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr2[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.KeyEvent.normalizeMetaState(0), 212 - android.view.View.combineMeasuredStates(0, 0), (char) android.graphics.Color.red(0))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr5 = cArr2;
        }
        if (i7 > 0) {
            $10 = ($11 + 9) % 128;
            char[] cArr6 = new char[i5];
            java.lang.System.arraycopy(cArr5, 0, cArr6, 0, i5);
            int i12 = i5 - i7;
            java.lang.System.arraycopy(cArr6, 0, cArr5, i12, i7);
            java.lang.System.arraycopy(cArr6, i7, cArr5, 0, i12);
        }
        if (z) {
            int i13 = $10 + 51;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                cArr = new char[i5];
                getaccounttype.writeReplace = 1;
            } else {
                cArr = new char[i5];
                getaccounttype.writeReplace = 0;
            }
            while (getaccounttype.writeReplace < i5) {
                cArr[getaccounttype.writeReplace] = cArr5[(i5 - getaccounttype.writeReplace) - 1];
                getaccounttype.writeReplace++;
            }
            cArr5 = cArr;
        }
        if (i6 > 0) {
            int i14 = 0;
            while (true) {
                getaccounttype.writeReplace = i14;
                if (getaccounttype.writeReplace >= i5) {
                    break;
                }
                cArr5[getaccounttype.writeReplace] = (char) (cArr5[getaccounttype.writeReplace] - iArr[2]);
                i14 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static void valueOf() {
        writeReplace = new char[]{16681, 16893, 16804, 16805, 16803, 16829, 16813, 16813, 16800, 16795, 16895, 16781, 16804, 16805, 16808, 16807, 16807, 16806, 16807, 16780, 16775, 16830, 16830, 16828, 16805, 16780, 16776, 16808, 16809, 16830, 16805, 16802, 16831, 16805};
    }

    static void init$0() {
        $$a = new byte[]{6, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -80, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION};
        $$b = 48;
    }

    @Override // com.payair.hce.setGravity
    public final int hashCode() {
        return ((java.lang.Integer) values(new java.lang.Object[]{this}, -2099826821, 2099826821, java.lang.System.identityHashCode(this))).intValue();
    }
}
