package com.payair.hce;

/* loaded from: classes4.dex */
final class setDrawingCacheQuality {
    private static int valueOf = 0;
    private static int values = 1;
    private com.payair.hce.accessperformEnroll AlternateContactlessPaymentDataJson;
    private final android.content.SharedPreferences DigitizedCardProfile;
    private boolean writeReplace = false;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = (i * 592) + (i2 * (-590)) + ((~(i4 | i2)) * (-1182)) + (((~(i | i2)) | (~(i4 | i5 | (~i3)))) * (-591)) + ((i3 | i4 | i5) * 591);
        if (i6 != 1) {
            return i6 != 2 ? i6 != 3 ? DigitizedCardProfile(objArr) : values(objArr) : valueOf(objArr);
        }
        com.payair.hce.setDrawingCacheQuality setdrawingcachequality = (com.payair.hce.setDrawingCacheQuality) objArr[0];
        int i7 = valueOf;
        int i8 = (i7 & 106) + (i7 | 106);
        values = ((~i8) + (i8 << 1)) % 128;
        boolean z = setdrawingcachequality.writeReplace;
        int i9 = i7 ^ 91;
        int i10 = (i7 & 91) << 1;
        values = ((i9 & i10) + (i10 | i9)) % 128;
        return java.lang.Boolean.valueOf(z);
    }

    setDrawingCacheQuality(android.content.Context context) {
        this.DigitizedCardProfile = context.getSharedPreferences("SharedCvmPlugin", 0);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setDrawingCacheQuality setdrawingcachequality = (com.payair.hce.setDrawingCacheQuality) objArr[0];
        int i = valueOf;
        int i2 = i & 119;
        int i3 = -(-((i ^ 119) | i2));
        values = ((i2 ^ i3) + ((i2 & i3) << 1)) % 128;
        setdrawingcachequality.writeReplace = false;
        com.payair.hce.accessperformEnroll accessperformenroll = setdrawingcachequality.AlternateContactlessPaymentDataJson;
        int i4 = ((i ^ 18) + ((i & 18) << 1)) - 1;
        values = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setDrawingCacheQuality setdrawingcachequality = (com.payair.hce.setDrawingCacheQuality) objArr[0];
        int i = valueOf;
        int i2 = i | 59;
        int i3 = i2 << 1;
        int i4 = -((~(i & 59)) & i2);
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        values = i5 % 128;
        java.lang.Object[] objArr2 = {"LastAuthTime", setdrawingcachequality.DigitizedCardProfile};
        int i6 = i5 % 2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (i6 != 0) {
            return java.lang.Long.valueOf(((java.lang.Long) com.payair.hce.setLeft.values(objArr2, -925749527, 925749527, (int) currentTimeMillis)).longValue());
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setDrawingCacheQuality setdrawingcachequality = (com.payair.hce.setDrawingCacheQuality) objArr[0];
        long longValue = ((java.lang.Number) objArr[1]).longValue();
        int i = valueOf;
        int i2 = i ^ 75;
        int i3 = ((i & 75) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        values = i5 % 128;
        if (i5 % 2 != 0) {
            com.payair.hce.setLeft.values(new java.lang.Object[]{"LastAuthTime", java.lang.Long.valueOf(longValue), setdrawingcachequality.DigitizedCardProfile}, 177851831, -177851815, (int) java.lang.System.currentTimeMillis());
            int i6 = values;
            int i7 = (i6 | 21) << 1;
            int i8 = -((i6 & (-22)) | ((~i6) & 21));
            int i9 = (i7 & i8) + (i8 | i7);
            valueOf = i9 % 128;
            if (i9 % 2 == 0) {
                return null;
            }
            throw null;
        }
        com.payair.hce.setLeft.values(new java.lang.Object[]{"LastAuthTime", java.lang.Long.valueOf(longValue), setdrawingcachequality.DigitizedCardProfile}, 177851831, -177851815, (int) java.lang.System.currentTimeMillis());
        throw null;
    }

    final void AlternateContactlessPaymentDataJson(long j) {
        DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Long.valueOf(j)}, -1379219444, 1379219444, java.lang.System.identityHashCode(this));
    }

    final long valueOf() {
        return ((java.lang.Long) DigitizedCardProfile(new java.lang.Object[]{this}, -1002511576, 1002511578, java.lang.System.identityHashCode(this))).longValue();
    }

    final boolean writeReplace() {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, 397604687, -397604686, java.lang.System.identityHashCode(this))).booleanValue();
    }

    final void AlternateContactlessPaymentDataJson() {
        DigitizedCardProfile(new java.lang.Object[]{this}, 773653097, -773653094, java.lang.System.identityHashCode(this));
    }
}
