package com.payair.hce;

/* loaded from: classes4.dex */
public enum onDeviceNotSecure {
    ;

    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long DigitizedCardProfile;
    private static int valueOf;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3 = 113 - i;
        int i4 = s + 4;
        byte[] bArr = $$a;
        int i5 = b * 2;
        byte[] bArr2 = new byte[1 - i5];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            int i8 = i4;
            int i9 = i4 + (-i6);
            i2 = i7;
            int i10 = i8;
            i3 = i9;
            i4 = i10;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == 0 - i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i4 + 1;
            i6 = bArr[i11];
            int i12 = i3;
            i8 = i11;
            i4 = i12;
            int i92 = i4 + (-i6);
            i2 = i7;
            int i102 = i8;
            i3 = i92;
            i4 = i102;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == 0 - i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == 0 - i5) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        valueOf = 1;
        AlternateContactlessPaymentDataJson();
        valueOf = (writeReplace + 91) % 128;
    }

    public static com.payair.hce.onDeviceNotSecure valueOf(java.lang.String str) {
        valueOf = (writeReplace + 65) % 128;
        com.payair.hce.onDeviceNotSecure ondevicenotsecure = (com.payair.hce.onDeviceNotSecure) java.lang.Enum.valueOf(com.payair.hce.onDeviceNotSecure.class, str);
        writeReplace = (valueOf + 17) % 128;
        return ondevicenotsecure;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static com.payair.hce.onDeviceNotSecure[] valuesCustom() {
        valueOf = (writeReplace + 13) % 128;
        com.payair.hce.onDeviceNotSecure[] ondevicenotsecureArr = (com.payair.hce.onDeviceNotSecure[]) values().clone();
        writeReplace = (valueOf + 27) % 128;
        return ondevicenotsecureArr;
    }

    public static java.lang.String DigitizedCardProfile(java.lang.Iterable<?> iterable, java.lang.CharSequence charSequence) {
        java.lang.Object obj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (iterable != null) {
            writeReplace = (valueOf + 113) % 128;
            boolean z = true;
            for (java.lang.Object obj2 : iterable) {
                if (!z) {
                    int i = writeReplace + 101;
                    valueOf = i % 128;
                    if (i % 2 == 0) {
                        sb.append(charSequence);
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        a("쓓", android.text.TextUtils.indexOf((java.lang.CharSequence) "", 'o', 0) * 7382, objArr);
                        obj = objArr[0];
                    } else {
                        sb.append(charSequence);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        a("쓓", 21928 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr2);
                        obj = objArr2[0];
                    }
                    sb.append(((java.lang.String) obj).intern());
                }
                if (obj2 != null) {
                    valueOf = (writeReplace + 105) % 128;
                    sb.append(obj2.toString());
                }
                z = false;
            }
            valueOf = (writeReplace + 111) % 128;
        } else {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a("쒝Ϋ䫅鄘", 50989 - (android.os.Process.myPid() >> 22), objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
        }
        return sb.toString();
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i2 = $10 + 73;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < cArr2.length) {
            $10 = ($11 + 57) % 128;
            int i3 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 31, android.view.View.MeasureSpec.getMode(0) + 1890, (char) (3600 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) -1, 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (DigitizedCardProfile ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 1443 - android.graphics.Color.blue(0), (char) (29682 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((short) -1, 1, (byte) 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr3 = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < cArr2.length) {
            cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 64, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1444, (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 29682));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b((short) -1, 1, (byte) 0, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        int i4 = $10 + 99;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    static void AlternateContactlessPaymentDataJson() {
        DigitizedCardProfile = 5895828265017520763L;
    }

    static void init$0() {
        $$a = new byte[]{59, 86, -115, -69};
        $$b = 84;
    }
}
