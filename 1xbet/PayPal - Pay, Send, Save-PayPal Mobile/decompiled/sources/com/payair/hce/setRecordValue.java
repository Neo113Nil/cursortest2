package com.payair.hce;

/* loaded from: classes4.dex */
public final class setRecordValue implements com.payair.hce.onIdentify {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static char[] DigitizedCardProfile;
    private static int valueOf;
    private byte[] values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = 111 - (s2 * 2);
        int i3 = (s * 2) + 4;
        int i4 = s3 * 3;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i2 += i6;
            i3++;
            i = i7;
            bArr2[i] = (byte) i2;
            i7 = i + 1;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i2 += i6;
            i3++;
            i = i7;
            bArr2[i] = (byte) i2;
            i7 = i + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i7 = i + 1;
            if (i == i5) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        AlternateContactlessPaymentDataJson = 1;
        valueOf();
        com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 36});
        int i = valueOf + 57;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public setRecordValue(byte[] bArr) throws com.payair.hce.updateSukFileName {
        java.lang.String obj;
        this.values = bArr;
        if (bArr == null || !(bArr.length == 2 || bArr.length == 3)) {
            if (bArr != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("");
                sb.append(com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(bArr));
                obj = sb.toString();
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("");
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(new int[]{0, 4, 77, 1}, "\u0001\u0000\u0000\u0001", true, objArr);
                sb2.append(((java.lang.String) objArr[0]).intern());
                obj = sb2.toString();
            }
            com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate = com.payair.hce.requestTaskStatusUpdate.getCrmCountryCode;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(new int[]{4, 46, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, 0}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001", true, objArr2);
            throw new com.payair.hce.updateSukFileName(requesttaskstatusupdate, ((java.lang.String) objArr2[0]).intern().concat(java.lang.String.valueOf(obj)));
        }
    }

    public final com.payair.hce.onRequestSessionFailed DigitizedCardProfile() {
        AlternateContactlessPaymentDataJson = (valueOf + 125) % 128;
        int i = 1;
        int AlternateContactlessPaymentDataJson2 = (int) com.payair.hce.onSignUser.AlternateContactlessPaymentDataJson(new byte[]{this.values[0]});
        int AlternateContactlessPaymentDataJson3 = (int) com.payair.hce.onSignUser.AlternateContactlessPaymentDataJson(new byte[]{this.values[1]});
        byte[] bArr = this.values;
        if (bArr.length == 3) {
            valueOf = (AlternateContactlessPaymentDataJson + 75) % 128;
            i = (int) com.payair.hce.onSignUser.AlternateContactlessPaymentDataJson(new byte[]{bArr[2]});
        }
        com.payair.hce.onRequestSessionFailed onrequestsessionfailed = new com.payair.hce.onRequestSessionFailed(AlternateContactlessPaymentDataJson2, AlternateContactlessPaymentDataJson3, i);
        valueOf = (AlternateContactlessPaymentDataJson + 117) % 128;
        return onrequestsessionfailed;
    }

    @Override // com.payair.hce.onIdentify
    public final void values() {
        int i = AlternateContactlessPaymentDataJson + 99;
        valueOf = i % 128;
        if (i % 2 == 0) {
            com.payair.hce.onAuthenticationFailed.writeReplace(this.values);
        } else {
            com.payair.hce.onAuthenticationFailed.writeReplace(this.values);
            throw null;
        }
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            int i2 = $11 + 17;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = DigitizedCardProfile;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i5];
                    objArr2[i3] = java.lang.Integer.valueOf(cArr[i9]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.graphics.Color.blue(i3), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2807, (char) android.text.TextUtils.getTrimmedLength(""));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((short) 0, (short) 1, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr2[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i9++;
                    i3 = 0;
                    i5 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        java.lang.System.arraycopy(cArr, i4, cArr3, 0, i6);
        if (bArr2 != null) {
            char[] cArr4 = new char[i6];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i6) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 2836 - android.view.View.resolveSize(0, 0), (char) android.text.TextUtils.getOffsetBefore("", 0));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((short) 0, (short) 2, (short) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr4[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    $11 = ($10 + 69) % 128;
                } else {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.os.Process.getGidForName(""), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2880, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b((short) 0, (short) 0, (short) 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr4[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.graphics.Color.red(0), android.graphics.Color.red(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            i = 0;
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i12 = i6 - i8;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i12, i8);
            java.lang.System.arraycopy(cArr5, i8, cArr3, 0, i12);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i6];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i6) {
                    break;
                }
                cArr6[getaccounttype.writeReplace] = cArr3[(i6 - getaccounttype.writeReplace) - 1];
                i = getaccounttype.writeReplace + 1;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            $11 = ($10 + 5) % 128;
            int i13 = 0;
            while (true) {
                getaccounttype.writeReplace = i13;
                if (getaccounttype.writeReplace >= i6) {
                    break;
                }
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                i13 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void init$0() {
        $$a = new byte[]{70, -35, 111, 66};
        $$b = 179;
    }

    static void valueOf() {
        DigitizedCardProfile = new char[]{16787, 16756, 16759, 16755, 16828, 16703, 16607, 16608, 16608, 16616, 16584, 16584, 16610, 16608, 16613, 16608, 16634, 16635, 16578, 16690, 16603, 16600, 16577, 16696, 16581, 16609, 16582, 16584, 16638, 16608, 16600, 16696, 16581, 16636, 16638, 16636, 16608, 16611, 16639, 16638, 16630, 16620, 16696, 16584, 16612, 16608, 16612, 16609, 16632, 16593};
    }
}
