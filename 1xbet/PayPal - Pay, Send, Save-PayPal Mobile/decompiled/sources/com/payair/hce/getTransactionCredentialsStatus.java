package com.payair.hce;

/* loaded from: classes10.dex */
public final class getTransactionCredentialsStatus {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int getAid;
    private static long valueOf;
    private static int writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "additionalCheckTable")
    private java.lang.String AlternateContactlessPaymentDataJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "crmCountryCode")
    private java.lang.String values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        int i2 = 106 - s;
        int i3 = 3 - (s2 * 3);
        byte[] bArr = $$a;
        int i4 = b * 2;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        if (bArr == null) {
            int i6 = i5;
            i = 0;
            i2 += -i6;
            i3++;
            bArr2[i] = (byte) i2;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i++;
            i2 += -i6;
            i3++;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        } else {
            i = 0;
            i3++;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return DigitizedCardProfile(objArr);
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        int i = IccPrivateKeyCrtComponentsJson + 71;
        int i2 = i % 128;
        getAid = i2;
        if (i % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.AlternateContactlessPaymentDataJson;
        int i3 = i2 + 55;
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        getAid = (IccPrivateKeyCrtComponentsJson + 117) % 128;
        this.AlternateContactlessPaymentDataJson = str.toUpperCase();
        IccPrivateKeyCrtComponentsJson = (getAid + 49) % 128;
    }

    public final java.lang.String values() {
        int i = IccPrivateKeyCrtComponentsJson + 23;
        int i2 = i % 128;
        getAid = i2;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.values;
        int i3 = i2 + 87;
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.getTransactionCredentialsStatus gettransactioncredentialsstatus = (com.payair.hce.getTransactionCredentialsStatus) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getAid + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            gettransactioncredentialsstatus.values = str.toUpperCase();
            getAid = (IccPrivateKeyCrtComponentsJson + 89) % 128;
            return null;
        }
        gettransactioncredentialsstatus.values = str.toUpperCase();
        throw null;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("槥踹鸣뎆", "뒃\uf34b佱䍺颕腫ᐮᪧ\ue535䂲왉\ue7c9⠇⎎礜䗻鳌薅抆獘ᦹ믣ⶈ㰁럐\uea8c㴍䴼㨣籑䃔銲㆕䎚麕\ue4c1댷뛬ꬽ\ud96d童⻨啗䡯憐", "㼶\udbf0샘䏞", android.view.Gravity.getAbsoluteGravity(0, 0) - 656674753, (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 57024), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(this.AlternateContactlessPaymentDataJson);
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("槥踹鸣뎆", "侊ၞ銱ᖴฮ陠퉓ᬮꅵࢴ♉\ue918館魑㽠춻ꍹ", "䉷쒊횿\uf540", (-1077638591) - lastIndexOf, (char) (16598 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(this.values);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a("槥踹鸣뎆", "宥", "\ue27c闡߭衆", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 308944414, (char) (17927 - android.graphics.Color.argb(0, 0, 0, 0)), objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        java.lang.String obj = sb.toString();
        int i = getAid + 67;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char c2;
        if (str3 != null) {
            int i2 = $10 + 35;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        char[] charArray = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            int i3 = $11 + 53;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
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
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 71, android.text.TextUtils.indexOf("", "") + 1179, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1));
                    byte length4 = (byte) $$a.length;
                    byte b = (byte) (length4 - 4);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(length4, b, b, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 30, 3443 - android.graphics.Color.argb(0, 0, 0, 0), (char) (3831 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr5[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 26, 1864 - android.view.View.resolveSize(0, 0), (char) (41774 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b((short) 1, (short) 0, (byte) 0, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.view.View.resolveSizeAndState(0, 0, 0), 3133 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) android.graphics.Color.green(0));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b((short) 0, (short) 0, (byte) 0, objArr8);
                    c2 = 2;
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                } else {
                    c2 = 2;
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((int) (writeReplace ^ 1263759066225628708L)) ^ ((cArr5[intValue2] ^ charArray[getwalletdata.writeReplace]) ^ (valueOf ^ 1263759066225628708L))) ^ ((char) (DigitizedCardProfile ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                $10 = ($11 + 33) % 128;
                cArr5 = cArr5;
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

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAid = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        valueOf = -6769094891886100543L;
        writeReplace = -804334044;
        DigitizedCardProfile = (char) 54820;
    }

    static void init$0() {
        $$a = new byte[]{73, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -116, -114};
        $$b = 154;
    }

    public final void values(java.lang.String str) {
        valueOf(new java.lang.Object[]{this, str}, -728987859, 728987859, java.lang.System.identityHashCode(this));
    }
}
