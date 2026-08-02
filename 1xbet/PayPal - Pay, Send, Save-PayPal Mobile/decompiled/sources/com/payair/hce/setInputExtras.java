package com.payair.hce;

/* loaded from: classes4.dex */
public final class setInputExtras extends com.payair.hce.setHighlightColor {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int DigitizedCardProfile;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 3 - (b2 * 3);
        int i4 = 111 - (b * 2);
        int i5 = (i * 4) + 1;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i4 = i5;
            i4 += i6;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i6 = bArr[i3];
            i4 += i6;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
            }
        }
    }

    setInputExtras(boolean z, int i, byte[] bArr) {
        super(z, i, bArr);
    }

    @Override // com.payair.hce.setHighlightColor, com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        int i;
        SdkCoreAlternateContactlessPaymentDataImpl = (DigitizedCardProfile + 31) % 128;
        if (this.AlternateContactlessPaymentDataJson) {
            int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 1;
            DigitizedCardProfile = i2 % 128;
            i = i2 % 2 != 0 ? 2 : 96;
        } else {
            i = 64;
        }
        setmaxlines.DigitizedCardProfile(i, this.values, this.valueOf);
        int i3 = SdkCoreAlternateContactlessPaymentDataImpl + 107;
        DigitizedCardProfile = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final java.lang.String toString() {
        java.lang.Object obj;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{0, 1, 0, 0}, "\u0001", false, objArr);
        stringBuffer.append(((java.lang.String) objArr[0]).intern());
        if (writeReplace()) {
            int i = DigitizedCardProfile + 37;
            SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
            if (i % 2 == 0) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(new int[]{1, 12, 0, 3}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001", false, objArr2);
                obj = objArr2[0];
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(new int[]{1, 12, 0, 3}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001", true, objArr3);
                obj = objArr3[0];
            }
            stringBuffer.append(((java.lang.String) obj).intern());
        }
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(new int[]{13, 12, 0, 0}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001", true, objArr4);
        stringBuffer.append(((java.lang.String) objArr4[0]).intern());
        stringBuffer.append(java.lang.Integer.toString(values()));
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(new int[]{25, 1, 45, 1}, "\u0000", false, objArr5);
        stringBuffer.append(((java.lang.String) objArr5[0]).intern());
        if (this.valueOf != null) {
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(new int[]{26, 2, 16, 2}, "\u0000\u0001", false, objArr6);
            stringBuffer.append(((java.lang.String) objArr6[0]).intern());
            stringBuffer.append(com.payair.hce.isPlayStorePossiblyUpdating.writeReplace(this.valueOf));
        } else {
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            a(new int[]{28, 6, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0000", false, objArr7);
            stringBuffer.append(((java.lang.String) objArr7[0]).intern());
            SdkCoreAlternateContactlessPaymentDataImpl = (DigitizedCardProfile + 87) % 128;
        }
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        a(new int[]{34, 1, 0, 1}, "\u0000", true, objArr8);
        stringBuffer.append(((java.lang.String) objArr8[0]).intern());
        return stringBuffer.toString();
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        char[] cArr;
        int length;
        char[] cArr2;
        int i2;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            $10 = ($11 + 81) % 128;
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
            int i8 = $10 + 5;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[i3] = java.lang.Integer.valueOf(cArr3[i2]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(i3) + 29, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i3) + 2808, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(0, (byte) 1, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i2++;
                    i3 = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        char[] cArr4 = new char[i5];
        java.lang.System.arraycopy(cArr3, i4, cArr4, 0, i5);
        if (bArr2 != null) {
            int i9 = $10 + 59;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr = new char[i5];
                getaccounttype.writeReplace = 1;
            } else {
                cArr = new char[i5];
                getaccounttype.writeReplace = 0;
            }
            char c = 0;
            while (getaccounttype.writeReplace < i5) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 45, 2836 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(0, (byte) 2, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2880, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b(0, (byte) 0, (byte) 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 212 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            int i12 = $11 + 13;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                char[] cArr5 = new char[i5];
                i = 0;
                java.lang.System.arraycopy(cArr4, 0, cArr5, 1, i5);
                java.lang.System.arraycopy(cArr5, 1, cArr4, i5 * i7, i7);
                java.lang.System.arraycopy(cArr5, i7, cArr4, 1, i5 + i7);
            } else {
                i = 0;
                char[] cArr6 = new char[i5];
                java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i5);
                int i13 = i5 - i7;
                java.lang.System.arraycopy(cArr6, 0, cArr4, i13, i7);
                java.lang.System.arraycopy(cArr6, i7, cArr4, 0, i13);
            }
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i5];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i5) {
                    break;
                }
                int i14 = $11 + 69;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    cArr7[getaccounttype.writeReplace] = cArr4[(i5 << getaccounttype.writeReplace) >> 1];
                    i = getaccounttype.writeReplace;
                } else {
                    cArr7[getaccounttype.writeReplace] = cArr4[(i5 - getaccounttype.writeReplace) - 1];
                    i = getaccounttype.writeReplace + 1;
                }
            }
            cArr4 = cArr7;
        }
        if (i6 > 0) {
            $10 = ($11 + 3) % 128;
            int i15 = 0;
            while (true) {
                getaccounttype.writeReplace = i15;
                if (getaccounttype.writeReplace >= i5) {
                    break;
                }
                int i16 = $10 + 21;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] >>> iArr[4]);
                    i15 = getaccounttype.writeReplace - 1;
                } else {
                    cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                    i15 = getaccounttype.writeReplace + 1;
                }
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        writeReplace = new char[]{16867, 16873, 16768, 16775, 16895, 16892, 16778, 16770, 16773, 16770, 16797, 16797, 16797, 16862, 16889, 16768, 16770, 16768, 16772, 16780, 16776, 16772, 16768, 16798, 16774, 16779, 16854, 16895, 16862, 16879, 16774, 16831, 16830, 16802, 16862};
    }

    static void init$0() {
        $$a = new byte[]{92, -126, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -5};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
    }
}
