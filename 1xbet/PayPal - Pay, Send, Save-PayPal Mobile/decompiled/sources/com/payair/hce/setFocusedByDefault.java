package com.payair.hce;

/* loaded from: classes4.dex */
final class setFocusedByDefault {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int DigitizedCardProfile = 1;
    private static java.util.ArrayList<java.lang.String> writeReplace;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = (~(i4 | (~i2))) | (~(i4 | i3));
        int i6 = (i * (-495)) + (i2 * (-495)) + (i5 * 992) + (((~(i | (~i3) | i2)) | i5) * (-496)) + ((i2 | i3) * 496);
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? values(objArr) : AlternateContactlessPaymentDataJson(objArr) : DigitizedCardProfile(objArr) : valueOf(objArr);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 77;
        int i3 = ((i ^ 77) | i2) << 1;
        int i4 = -((i | 77) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        DigitizedCardProfile = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (writeReplace == null) {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            writeReplace = arrayList;
            arrayList.add("key1");
            writeReplace.add("key2");
            int i6 = DigitizedCardProfile;
            AlternateContactlessPaymentDataJson = ((((i6 ^ 39) | (i6 & 39)) << 1) - ((i6 & (-40)) | ((~i6) & 39))) % 128;
        }
        int i7 = AlternateContactlessPaymentDataJson;
        int i8 = (i7 | 117) << 1;
        int i9 = -(i7 ^ 117);
        DigitizedCardProfile = ((i8 ^ i9) + ((i9 & i8) << 1)) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 109) % 128;
        writeReplace(new java.lang.Object[0], -950500550, 950500550, (int) java.lang.System.currentTimeMillis());
        java.util.Iterator<java.lang.String> it = writeReplace.iterator();
        DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 115) % 128;
        while (it.hasNext()) {
            int i = AlternateContactlessPaymentDataJson;
            DigitizedCardProfile = ((-2) - (~((i & 78) + (i | 78)))) % 128;
            java.lang.String next = it.next();
            if (!next.equals(str)) {
                int i2 = DigitizedCardProfile;
                AlternateContactlessPaymentDataJson = (((i2 | 121) << 1) - (i2 ^ 121)) % 128;
                if (!next.equals("key".concat(java.lang.String.valueOf(str)))) {
                    int i3 = DigitizedCardProfile & 111;
                    AlternateContactlessPaymentDataJson = ((i3 - (~(-(-((r1 ^ 111) | i3))))) - 1) % 128;
                }
            }
            int i4 = DigitizedCardProfile;
            int i5 = (i4 ^ 93) + ((i4 & 93) << 1);
            AlternateContactlessPaymentDataJson = i5 % 128;
            if (i5 % 2 == 0) {
                return java.lang.Boolean.FALSE;
            }
            throw new java.lang.ArithmeticException();
        }
        int i6 = DigitizedCardProfile;
        int i7 = (((i6 | 46) << 1) - (i6 ^ 46)) - 1;
        AlternateContactlessPaymentDataJson = i7 % 128;
        if (i7 % 2 == 0) {
            return java.lang.Boolean.TRUE;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i ^ 105) + ((i & 105) << 1);
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            writeReplace(new java.lang.Object[0], -950500550, 950500550, (int) java.lang.System.currentTimeMillis());
            java.util.ArrayList<java.lang.String> arrayList = writeReplace;
            if (arrayList == null || arrayList.size() <= 0) {
                int i3 = DigitizedCardProfile;
                int i4 = i3 ^ 15;
                int i5 = ((i3 & 15) | i4) << 1;
                int i6 = -i4;
                int i7 = (i5 & i6) + (i5 | i6);
                AlternateContactlessPaymentDataJson = i7 % 128;
                if (i7 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            int i8 = AlternateContactlessPaymentDataJson;
            int i9 = i8 ^ 79;
            int i10 = ((i8 & 79) | i9) << 1;
            int i11 = -i9;
            DigitizedCardProfile = (((i10 | i11) << 1) - (i10 ^ i11)) % 128;
            java.util.ArrayList<java.lang.String> arrayList2 = writeReplace;
            int i12 = ~arrayList2.size();
            java.lang.String str = arrayList2.get((((r0 | i12) << 1) - (~(-i12))) - 1);
            int i13 = DigitizedCardProfile;
            int i14 = i13 & 115;
            int i15 = i13 | 115;
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            AlternateContactlessPaymentDataJson = i16 % 128;
            if (i16 % 2 == 0) {
                return str;
            }
            throw new java.lang.ArithmeticException();
        }
        writeReplace(new java.lang.Object[0], -950500550, 950500550, (int) java.lang.System.currentTimeMillis());
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = i ^ 17;
        int i3 = -(-((i & 17) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        AlternateContactlessPaymentDataJson = i4 % 128;
        int i5 = i4 % 2;
        java.lang.Object[] objArr2 = new java.lang.Object[0];
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (i5 != 0) {
            str.equals((java.lang.String) writeReplace(objArr2, 2007837142, -2007837141, (int) currentTimeMillis));
            throw null;
        }
        if (!str.equals((java.lang.String) writeReplace(objArr2, 2007837142, -2007837141, (int) currentTimeMillis))) {
            int i6 = AlternateContactlessPaymentDataJson;
            DigitizedCardProfile = ((((i6 | 68) << 1) - (i6 ^ 68)) - 1) % 128;
            return java.lang.Boolean.TRUE;
        }
        int i7 = DigitizedCardProfile;
        int i8 = i7 ^ 1;
        int i9 = ((((i7 & 1) | i8) << 1) - (~(-i8))) - 1;
        AlternateContactlessPaymentDataJson = i9 % 128;
        if (i9 % 2 == 0) {
            return java.lang.Boolean.FALSE;
        }
        throw null;
    }

    static boolean AlternateContactlessPaymentDataJson(java.lang.String str) {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{str}, -866633695, 866633697, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    static java.lang.String writeReplace() {
        return (java.lang.String) writeReplace(new java.lang.Object[0], 2007837142, -2007837141, (int) java.lang.System.currentTimeMillis());
    }

    static boolean DigitizedCardProfile(java.lang.String str) {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{str}, -285504386, 285504389, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    private static void values() {
        writeReplace(new java.lang.Object[0], -950500550, 950500550, (int) java.lang.System.currentTimeMillis());
    }
}
