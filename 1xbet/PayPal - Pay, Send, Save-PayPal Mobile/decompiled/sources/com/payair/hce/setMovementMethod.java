package com.payair.hce;

/* loaded from: classes4.dex */
public final class setMovementMethod implements com.payair.hce.setSelectedGroup {
    private static int DigitizedCardProfile = 0;
    private static int writeReplace = 1;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~(i3 | i2);
        return ((((i * (-109)) + (i2 * 111)) + ((i4 | i5) * (-220))) + ((i5 | (~(i | i2))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) + (((~(i | (~i2))) | (~(i2 | i4))) * 110) != 1 ? AlternateContactlessPaymentDataJson(objArr) : DigitizedCardProfile(objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0067, code lost:
    
        if (r11 == java.lang.Object.class) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0095, code lost:
    
        r6 = com.payair.hce.setMovementMethod.DigitizedCardProfile;
        r8 = r6 & 87;
        r6 = (r6 | 87) & (~r8);
        r8 = -(-(r8 << 1));
        com.payair.hce.setMovementMethod.writeReplace = ((r6 ^ r8) + ((r6 & r8) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        com.payair.hce.setMovementMethod.writeReplace = (com.payair.hce.setMovementMethod.DigitizedCardProfile + 43) % 128;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r11 == java.lang.Object.class) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        java.lang.reflect.Type type;
        java.lang.reflect.Type type2;
        java.util.Map map;
        java.util.HashMap hashMap;
        com.payair.hce.setOnGroupExpandListener setongroupexpandlistener = (com.payair.hce.setOnGroupExpandListener) objArr[1];
        java.lang.Object obj = objArr[2];
        java.lang.reflect.Type type3 = (java.lang.reflect.Type) objArr[3];
        int i = DigitizedCardProfile;
        int i2 = i & 15;
        int i3 = (i2 - (~(-(-((i ^ 15) | i2))))) - 1;
        writeReplace = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (type3 == null || !(type3 instanceof java.lang.reflect.ParameterizedType)) {
            java.lang.Object writeReplace2 = setongroupexpandlistener.writeReplace((java.util.Map) obj, (java.util.HashMap) AlternateContactlessPaymentDataJson(new java.lang.Object[0], -2067913378, 2067913378, (int) java.lang.System.currentTimeMillis()), null, null);
            writeReplace = (DigitizedCardProfile + 53) % 128;
            return writeReplace2;
        }
        int i4 = ((i ^ 94) + ((i & 94) << 1)) - 1;
        writeReplace = i4 % 128;
        if (i4 % 2 == 0) {
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type3;
            type = parameterizedType.getActualTypeArguments()[0];
            type2 = parameterizedType.getActualTypeArguments()[1];
            map = (java.util.Map) obj;
            hashMap = (java.util.HashMap) AlternateContactlessPaymentDataJson(new java.lang.Object[0], -2067913378, 2067913378, (int) java.lang.System.currentTimeMillis());
        } else {
            java.lang.reflect.ParameterizedType parameterizedType2 = (java.lang.reflect.ParameterizedType) type3;
            type = parameterizedType2.getActualTypeArguments()[0];
            type2 = parameterizedType2.getActualTypeArguments()[1];
            map = (java.util.Map) obj;
            hashMap = (java.util.HashMap) AlternateContactlessPaymentDataJson(new java.lang.Object[0], -2067913378, 2067913378, (int) java.lang.System.currentTimeMillis());
        }
        if (type2 == java.lang.Object.class) {
            int i5 = DigitizedCardProfile;
            int i6 = i5 + 92;
            writeReplace = ((~i6) + (i6 << 1)) % 128;
            writeReplace = ((i5 & 99) + (i5 | 99)) % 128;
            type2 = null;
        } else {
            int i7 = writeReplace;
            int i8 = i7 | 83;
            int i9 = i8 << 1;
            int i10 = -((~(i7 & 83)) & i8);
            DigitizedCardProfile = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
        }
        java.lang.Object writeReplace3 = setongroupexpandlistener.writeReplace(map, hashMap, type, type2);
        int i11 = DigitizedCardProfile;
        int i12 = i11 & 115;
        int i13 = i11 | 115;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        writeReplace = i14 % 128;
        if (i14 % 2 != 0) {
            return writeReplace3;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        int i = writeReplace;
        int i2 = ((i & 28) + (i | 28)) - 1;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 == 0) {
            return hashMap;
        }
        throw null;
    }

    private static java.util.HashMap<java.lang.Object, java.lang.Object> AlternateContactlessPaymentDataJson() {
        return (java.util.HashMap) AlternateContactlessPaymentDataJson(new java.lang.Object[0], -2067913378, 2067913378, (int) java.lang.System.currentTimeMillis());
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        return AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, setongroupexpandlistener, obj, type, cls}, 1718638966, -1718638965, java.lang.System.identityHashCode(this));
    }
}
