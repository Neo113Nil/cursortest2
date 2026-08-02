package com.payair.hce;

@kotlin.jvm.JvmInline
/* loaded from: classes10.dex */
public final class setStackFromBottom {
    private static int values = 1;
    private static int writeReplace;
    private final java.lang.String valueOf;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ~i;
        int i6 = ~i2;
        int i7 = i5 | i6;
        int i8 = i6 | i4;
        switch ((i * 193) + (i2 * 193) + ((i4 | (~(i5 | i2))) * (-192)) + (((~i8) | (~i7)) * (-384)) + (((~(i | i8)) | (~(i3 | i7)) | (~(i2 | i | i3))) * 192)) {
            case 1:
                com.payair.hce.setStackFromBottom setstackfrombottom = (com.payair.hce.setStackFromBottom) objArr[0];
                int i9 = writeReplace;
                int i10 = i9 & 45;
                int i11 = (i9 ^ 45) | i10;
                int i12 = ((i10 ^ i11) + ((i11 & i10) << 1)) % 128;
                values = i12;
                java.lang.String str = setstackfrombottom.valueOf;
                writeReplace = (((i12 & (-4)) | ((~i12) & 3)) + ((i12 & 3) << 1)) % 128;
                return str;
            case 2:
                java.lang.String str2 = (java.lang.String) objArr[0];
                int i13 = writeReplace & 103;
                values = (((((r7 ^ 103) | i13) << 1) - (~(-((r7 | 103) & (~i13))))) - 1) % 128;
                int hashCode = str2.hashCode();
                int i14 = writeReplace;
                values = (((i14 | 39) << 1) - (i14 ^ 39)) % 128;
                return java.lang.Integer.valueOf(hashCode);
            case 3:
                return AlternateContactlessPaymentDataJson(objArr);
            case 4:
                return DigitizedCardProfile(objArr);
            case 5:
                return writeReplace(objArr);
            case 6:
                return values(objArr);
            case 7:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 8:
                return getProfileVersion(objArr);
            default:
                return valueOf(objArr);
        }
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.String str2 = (java.lang.String) objArr[1];
        int i = values;
        int i2 = (i & 41) + (i | 41);
        writeReplace = i2 % 128;
        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(str, str2);
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = writeReplace;
        values = (((i3 | 87) << 1) - (i3 ^ 87)) % 128;
        return java.lang.Boolean.valueOf(areEqual);
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        int i = values;
        writeReplace = (((i | 85) << 1) - (i ^ 85)) % 128;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VisaCertificateTypeDao(name=");
        sb.append(str);
        sb.append(")");
        java.lang.String obj = sb.toString();
        int i2 = writeReplace;
        int i3 = i2 & 13;
        int i4 = ((((i2 ^ 13) | i3) << 1) - (~(-((i2 | 13) & (~i3))))) - 1;
        values = i4 % 128;
        if (i4 % 2 != 0) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        int i = writeReplace;
        values = (((i | 59) << 1) - (i ^ 59)) % 128;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int i2 = writeReplace + 125;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setStackFromBottom setstackfrombottom = (com.payair.hce.setStackFromBottom) objArr[0];
        int i = writeReplace + 120;
        int i2 = (~i) + (i << 1);
        values = i2 % 128;
        java.lang.Object[] objArr2 = {setstackfrombottom.valueOf};
        int i3 = i2 % 2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (i3 != 0) {
            return (java.lang.String) DigitizedCardProfile(objArr2, 1037769567, -1037769560, (int) currentTimeMillis);
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.Object obj = objArr[1];
        int i = values;
        int i2 = (i & (-22)) | ((~i) & 21);
        int i3 = -(-((i & 21) << 1));
        writeReplace = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
        if (!(obj instanceof com.payair.hce.setStackFromBottom)) {
            writeReplace = (i + 51) % 128;
            return bool;
        }
        com.payair.hce.setStackFromBottom setstackfrombottom = (com.payair.hce.setStackFromBottom) obj;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(str, (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{setstackfrombottom}, 2122047568, -2122047567, java.lang.System.identityHashCode(setstackfrombottom)))) {
            int i4 = writeReplace;
            values = ((i4 & 47) + (i4 | 47)) % 128;
            values = ((i4 ^ 99) + ((i4 & 99) << 1)) % 128;
            return bool;
        }
        int i5 = writeReplace;
        int i6 = (((i5 ^ 15) | (i5 & 15)) << 1) - ((i5 & (-16)) | ((~i5) & 15));
        values = i6 % 128;
        if (i6 % 2 != 0) {
            return java.lang.Boolean.TRUE;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setStackFromBottom setstackfrombottom = (com.payair.hce.setStackFromBottom) objArr[0];
        java.lang.Object obj = objArr[1];
        int i = writeReplace;
        int i2 = i & 93;
        int i3 = (i | 93) & (~i2);
        int i4 = i2 << 1;
        values = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        boolean booleanValue = ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{setstackfrombottom.valueOf, obj}, 440983483, -440983479, (int) java.lang.System.currentTimeMillis())).booleanValue();
        int i5 = writeReplace;
        int i6 = ((i5 ^ 3) | (i5 & 3)) << 1;
        int i7 = -((i5 & (-4)) | ((~i5) & 3));
        int i8 = (i6 & i7) + (i7 | i6);
        values = i8 % 128;
        if (i8 % 2 != 0) {
            return java.lang.Boolean.valueOf(booleanValue);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setStackFromBottom setstackfrombottom = (com.payair.hce.setStackFromBottom) objArr[0];
        int i = writeReplace;
        values = ((((i | 46) << 1) - (i ^ 46)) - 1) % 128;
        int intValue = ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{setstackfrombottom.valueOf}, 2145283880, -2145283878, (int) java.lang.System.currentTimeMillis())).intValue();
        int i2 = values;
        int i3 = i2 & 17;
        int i4 = (i2 | 17) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        writeReplace = i6 % 128;
        if (i6 % 2 == 0) {
            return java.lang.Integer.valueOf(intValue);
        }
        throw null;
    }

    public static final boolean writeReplace(java.lang.String str, java.lang.String str2) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{str, str2}, 24397604, -24397596, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    private /* synthetic */ java.lang.String writeReplace() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 2122047568, -2122047567, java.lang.System.identityHashCode(this));
    }

    public static java.lang.String values(java.lang.String str) {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{str}, -863787250, 863787256, (int) java.lang.System.currentTimeMillis());
    }

    public final boolean equals(java.lang.Object obj) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, obj}, -1682552335, 1682552338, java.lang.System.identityHashCode(this))).booleanValue();
    }

    private static boolean valueOf(java.lang.String str, java.lang.Object obj) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{str, obj}, 440983483, -440983479, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    public final int hashCode() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, 1667341037, -1667341037, java.lang.System.identityHashCode(this))).intValue();
    }

    public static int DigitizedCardProfile(java.lang.String str) {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{str}, 2145283880, -2145283878, (int) java.lang.System.currentTimeMillis())).intValue();
    }

    public final java.lang.String toString() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 96145376, -96145371, java.lang.System.identityHashCode(this));
    }

    public static java.lang.String valueOf(java.lang.String str) {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{str}, 1037769567, -1037769560, (int) java.lang.System.currentTimeMillis());
    }
}
