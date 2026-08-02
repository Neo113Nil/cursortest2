package com.payair.hce;

/* loaded from: classes10.dex */
public final class isRestricted implements com.payair.hce.setSelectedGroup {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int valueOf = 1;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[2];
        int i = valueOf;
        int i2 = i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i3 = (((i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i2) << 1) - ((i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i2));
        AlternateContactlessPaymentDataJson = i3 % 128;
        try {
            return java.lang.Byte.valueOf(i3 % 2 != 0 ? com.payair.hce.setVerticalScrollbarThumbDrawable.valueOf(obj.toString())[1] : com.payair.hce.setVerticalScrollbarThumbDrawable.valueOf(obj.toString())[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        return values(new java.lang.Object[]{this, setongroupexpandlistener, obj, type, cls}, 1055429215, -1055429215, java.lang.System.identityHashCode(this));
    }
}
