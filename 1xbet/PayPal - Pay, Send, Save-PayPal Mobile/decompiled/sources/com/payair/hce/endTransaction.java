package com.payair.hce;

/* loaded from: classes4.dex */
public final class endTransaction implements com.payair.hce.internalInitInvalidationTracker {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static long valueOf;
    private static int values;
    private static char writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = s * 4;
        int i4 = (i * 2) + 4;
        int i5 = 106 - s2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i3];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i4++;
            i5 += i6;
            bArr2[i2] = (byte) i5;
            if (i2 == 0 - i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i4];
            i4++;
            i5 += i6;
            bArr2[i2] = (byte) i5;
            if (i2 == 0 - i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == 0 - i3) {
            }
        }
    }

    @Override // com.payair.hce.internalInitInvalidationTracker
    public final int writeReplace(byte[] bArr, int i) {
        int i2 = DigitizedCardProfile;
        int i3 = i2 + 59;
        AlternateContactlessPaymentDataJson = i3 % 128;
        byte length = (byte) (i3 % 2 != 0 ? bArr.length + i : bArr.length - i);
        AlternateContactlessPaymentDataJson = (i2 + 105) % 128;
        while (i < bArr.length) {
            bArr[i] = length;
            i++;
        }
        return length;
    }

    @Override // com.payair.hce.internalInitInvalidationTracker
    public final int values(byte[] bArr) throws com.payair.hce.getSuspendingTransactionId {
        boolean z;
        boolean z2;
        int i = bArr[bArr.length - 1] & 255;
        byte b = (byte) i;
        boolean z3 = i > bArr.length;
        if (i == 0) {
            AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 35) % 128;
            z = true;
        } else {
            z = false;
        }
        boolean z4 = z3 | z;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = DigitizedCardProfile;
            int i4 = (i3 + 107) % 128;
            AlternateContactlessPaymentDataJson = i4;
            boolean z5 = bArr.length - i2 <= i;
            if (bArr[i2] != b) {
                int i5 = i3 + 111;
                AlternateContactlessPaymentDataJson = i5 % 128;
                if (i5 % 2 == 0) {
                    z2 = true;
                    z4 |= z2 & z5;
                }
            } else {
                DigitizedCardProfile = (i4 + 79) % 128;
            }
            z2 = false;
            z4 |= z2 & z5;
        }
        if (!z4) {
            return i;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("黽ʴ⒫娊", "⼓쵃뤹鰺ᝳㆥ蒦\uf615빕괕㸝꧈깴ᡨﭠ줝᭔煮쩩", "늘뙳荩㚓", 1773564850 - android.graphics.Color.green(0), (char) (android.view.View.resolveSize(0, 0) + 37763), objArr);
        throw new com.payair.hce.getSuspendingTransactionId(((java.lang.String) objArr[0]).intern());
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char c2;
        $10 = ($11 + 45) % 128;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        if (str2 != null) {
            $10 = ($11 + 105) % 128;
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr3 = cArr;
        java.lang.Object obj = null;
        if (str != null) {
            int i2 = $11 + 15;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
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
        short s = 0;
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
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(s) + 72, 1179 - android.text.TextUtils.indexOf("", ""), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, s)));
                    byte length4 = (byte) $$a.length;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(s, length4, (byte) (length4 - 4), objArr3);
                    java.lang.String str4 = (java.lang.String) objArr3[s];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                    clsArr[s] = java.lang.Object.class;
                    obj2 = cls.getMethod(str4, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.text.TextUtils.getOffsetAfter("", s), 3444 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (android.view.View.combineMeasuredStates(s, s) + 3831));
                    java.lang.Class<?>[] clsArr2 = new java.lang.Class[1];
                    clsArr2[s] = java.lang.Object.class;
                    obj3 = cls2.getMethod("g", clsArr2);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                char c3 = cArr5[getwalletdata.writeReplace % 4];
                java.lang.Object[] objArr5 = new java.lang.Object[3];
                objArr5[2] = java.lang.Integer.valueOf(cArr6[intValue]);
                objArr5[1] = java.lang.Integer.valueOf(c3 * 32718);
                objArr5[s] = getwalletdata;
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(s) + 26, android.widget.ExpandableListView.getPackedPositionType(0L) + 1864, (char) (android.graphics.ImageFormat.getBitsPerPixel(s) + 41776));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(s, (short) 1, s, objArr6);
                    java.lang.String str5 = (java.lang.String) objArr6[s];
                    java.lang.Class<?>[] clsArr3 = new java.lang.Class[3];
                    clsArr3[s] = java.lang.Object.class;
                    clsArr3[1] = java.lang.Integer.TYPE;
                    clsArr3[2] = java.lang.Integer.TYPE;
                    obj4 = cls3.getMethod(str5, clsArr3);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                char c4 = cArr5[intValue2];
                java.lang.Object[] objArr7 = new java.lang.Object[2];
                objArr7[1] = java.lang.Integer.valueOf(cArr6[intValue]);
                objArr7[s] = java.lang.Integer.valueOf(c4 * 32718);
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 3133 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((-1) - android.os.Process.getGidForName("")));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(s, s, s, objArr8);
                    java.lang.String str6 = (java.lang.String) objArr8[s];
                    c2 = 2;
                    java.lang.Class<?>[] clsArr4 = new java.lang.Class[2];
                    clsArr4[s] = java.lang.Integer.TYPE;
                    clsArr4[1] = java.lang.Integer.TYPE;
                    obj5 = cls4.getMethod(str6, clsArr4);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                } else {
                    c2 = 2;
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((int) (values ^ 1263759066225628708L)) ^ ((cArr5[intValue2] ^ cArr3[getwalletdata.writeReplace]) ^ (valueOf ^ 1263759066225628708L))) ^ ((char) (writeReplace ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                obj = null;
                s = 0;
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
        AlternateContactlessPaymentDataJson = 0;
        DigitizedCardProfile = 1;
        valueOf = 5441441847777577177L;
        values = -804334044;
        writeReplace = (char) 54820;
    }

    static void init$0() {
        $$a = new byte[]{84, 108, com.google.common.base.Ascii.CAN, -19};
        $$b = 26;
    }
}
