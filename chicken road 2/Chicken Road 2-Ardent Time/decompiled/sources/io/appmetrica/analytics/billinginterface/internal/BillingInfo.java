package io.appmetrica.analytics.billinginterface.internal;

/* loaded from: classes.dex */
public class BillingInfo {
    public final java.lang.String productId;
    public final long purchaseTime;
    public final java.lang.String purchaseToken;
    public long sendTime;
    public final io.appmetrica.analytics.billinginterface.internal.ProductType type;

    public BillingInfo(io.appmetrica.analytics.billinginterface.internal.ProductType productType, java.lang.String str, java.lang.String str2, long j2, long j3) {
        this.type = productType;
        this.productId = str;
        this.purchaseToken = str2;
        this.purchaseTime = j2;
        this.sendTime = j3;
    }

    public java.lang.String toString() {
        return "BillingInfo{type=" + this.type + "productId='" + this.productId + "'purchaseToken='" + this.purchaseToken + "'purchaseTime=" + this.purchaseTime + "sendTime=" + this.sendTime + "}";
    }
}
