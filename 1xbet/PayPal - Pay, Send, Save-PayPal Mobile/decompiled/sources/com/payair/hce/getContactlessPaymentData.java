package com.payair.hce;

/* loaded from: classes4.dex */
public class getContactlessPaymentData implements com.payair.hce.stopSelfResultHook, java.io.Serializable {
    public long[] values = new long[256];

    public int hashCode() {
        return java.util.Arrays.hashCode(this.values) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE;
    }

    public boolean equals(java.lang.Object obj) {
        return obj != null && getClass() == obj.getClass() && java.util.Arrays.equals(this.values, ((com.payair.hce.getContactlessPaymentData) obj).values);
    }

    @Override // com.payair.hce.stopSelfResultHook
    public void values(com.payair.hce.getStartCommandIntent getstartcommandintent) {
        this.values = (long[]) getstartcommandintent.DigitizedCardProfile(long[].class);
    }
}
