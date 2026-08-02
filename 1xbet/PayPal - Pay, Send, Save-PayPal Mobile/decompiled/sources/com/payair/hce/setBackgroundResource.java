package com.payair.hce;

/* loaded from: classes4.dex */
public class setBackgroundResource extends com.payair.hce.communication.JsonRequest {
    private static int DigitizedCardProfile = 1;
    private static int values;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "signatures")
    private java.util.List<java.lang.String> valueOf;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return valueOf(objArr);
    }

    public setBackgroundResource(java.util.List<java.lang.String> list) {
        valueOf(new java.lang.Object[]{this, list}, 1560602447, -1560602447, java.lang.System.identityHashCode(this));
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setBackgroundResource setbackgroundresource = (com.payair.hce.setBackgroundResource) objArr[0];
        java.util.List<java.lang.String> list = (java.util.List) objArr[1];
        int i = DigitizedCardProfile + 75;
        values = i % 128;
        if (i % 2 == 0) {
            setbackgroundresource.valueOf = list;
            return null;
        }
        setbackgroundresource.valueOf = list;
        throw null;
    }

    private void valueOf(java.util.List<java.lang.String> list) {
        valueOf(new java.lang.Object[]{this, list}, 1560602447, -1560602447, java.lang.System.identityHashCode(this));
    }
}
