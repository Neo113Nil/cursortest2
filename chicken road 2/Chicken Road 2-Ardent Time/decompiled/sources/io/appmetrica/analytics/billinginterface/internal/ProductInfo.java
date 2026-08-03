package io.appmetrica.analytics.billinginterface.internal;

/* loaded from: classes.dex */
public class ProductInfo {
    public final boolean autoRenewing;
    public final int introductoryPriceCycles;
    public final long introductoryPriceMicros;
    public final io.appmetrica.analytics.billinginterface.internal.Period introductoryPricePeriod;
    public final java.lang.String priceCurrency;
    public final long priceMicros;
    public final java.lang.String purchaseOriginalJson;
    public final long purchaseTime;
    public final java.lang.String purchaseToken;
    public final int quantity;
    public final java.lang.String signature;
    public final java.lang.String sku;
    public final io.appmetrica.analytics.billinginterface.internal.Period subscriptionPeriod;
    public final io.appmetrica.analytics.billinginterface.internal.ProductType type;

    public ProductInfo(io.appmetrica.analytics.billinginterface.internal.ProductType productType, java.lang.String str, int i2, long j2, java.lang.String str2, long j3, io.appmetrica.analytics.billinginterface.internal.Period period, int i3, io.appmetrica.analytics.billinginterface.internal.Period period2, java.lang.String str3, java.lang.String str4, long j4, boolean z2, java.lang.String str5) {
        this.type = productType;
        this.sku = str;
        this.quantity = i2;
        this.priceMicros = j2;
        this.priceCurrency = str2;
        this.introductoryPriceMicros = j3;
        this.introductoryPricePeriod = period;
        this.introductoryPriceCycles = i3;
        this.subscriptionPeriod = period2;
        this.signature = str3;
        this.purchaseToken = str4;
        this.purchaseTime = j4;
        this.autoRenewing = z2;
        this.purchaseOriginalJson = str5;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        io.appmetrica.analytics.billinginterface.internal.ProductInfo productInfo = (io.appmetrica.analytics.billinginterface.internal.ProductInfo) obj;
        if (this.quantity != productInfo.quantity || this.priceMicros != productInfo.priceMicros || this.introductoryPriceMicros != productInfo.introductoryPriceMicros || this.introductoryPriceCycles != productInfo.introductoryPriceCycles || this.purchaseTime != productInfo.purchaseTime || this.autoRenewing != productInfo.autoRenewing || this.type != productInfo.type || !this.sku.equals(productInfo.sku) || !this.priceCurrency.equals(productInfo.priceCurrency)) {
            return false;
        }
        io.appmetrica.analytics.billinginterface.internal.Period period = this.introductoryPricePeriod;
        if (period == null ? productInfo.introductoryPricePeriod != null : !period.equals(productInfo.introductoryPricePeriod)) {
            return false;
        }
        io.appmetrica.analytics.billinginterface.internal.Period period2 = this.subscriptionPeriod;
        if (period2 == null ? productInfo.subscriptionPeriod != null : !period2.equals(productInfo.subscriptionPeriod)) {
            return false;
        }
        if (this.signature.equals(productInfo.signature) && this.purchaseToken.equals(productInfo.purchaseToken)) {
            return this.purchaseOriginalJson.equals(productInfo.purchaseOriginalJson);
        }
        return false;
    }

    public int hashCode() {
        int e2 = (B1.a.e(this.sku, this.type.hashCode() * 31, 31) + this.quantity) * 31;
        long j2 = this.priceMicros;
        int e3 = B1.a.e(this.priceCurrency, (e2 + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31);
        long j3 = this.introductoryPriceMicros;
        int i2 = (e3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        io.appmetrica.analytics.billinginterface.internal.Period period = this.introductoryPricePeriod;
        int hashCode = (((i2 + (period != null ? period.hashCode() : 0)) * 31) + this.introductoryPriceCycles) * 31;
        io.appmetrica.analytics.billinginterface.internal.Period period2 = this.subscriptionPeriod;
        int e4 = B1.a.e(this.purchaseToken, B1.a.e(this.signature, (hashCode + (period2 != null ? period2.hashCode() : 0)) * 31, 31), 31);
        long j4 = this.purchaseTime;
        return this.purchaseOriginalJson.hashCode() + ((((e4 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.autoRenewing ? 1 : 0)) * 31);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProductInfo{type=");
        sb.append(this.type);
        sb.append(", sku='");
        sb.append(this.sku);
        sb.append("', quantity=");
        sb.append(this.quantity);
        sb.append(", priceMicros=");
        sb.append(this.priceMicros);
        sb.append(", priceCurrency='");
        sb.append(this.priceCurrency);
        sb.append("', introductoryPriceMicros=");
        sb.append(this.introductoryPriceMicros);
        sb.append(", introductoryPricePeriod=");
        sb.append(this.introductoryPricePeriod);
        sb.append(", introductoryPriceCycles=");
        sb.append(this.introductoryPriceCycles);
        sb.append(", subscriptionPeriod=");
        sb.append(this.subscriptionPeriod);
        sb.append(", signature='");
        sb.append(this.signature);
        sb.append("', purchaseToken='");
        sb.append(this.purchaseToken);
        sb.append("', purchaseTime=");
        sb.append(this.purchaseTime);
        sb.append(", autoRenewing=");
        sb.append(this.autoRenewing);
        sb.append(", purchaseOriginalJson='");
        return B1.a.j(sb, this.purchaseOriginalJson, "'}");
    }
}
