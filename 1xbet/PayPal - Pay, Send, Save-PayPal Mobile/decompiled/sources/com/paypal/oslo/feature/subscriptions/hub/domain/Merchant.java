package com.paypal.oslo.feature.subscriptions.hub.domain;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/domain/Merchant;", "", "", "id", "merchantName", "merchantLogoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/hub/domain/Merchant;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getMerchantName", "getMerchantLogoUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Merchant {
    public static final int $stable = 0;
    private final java.lang.String id;
    private final java.lang.String merchantLogoUrl;
    private final java.lang.String merchantName;

    public Merchant(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.merchantName = str2;
        this.merchantLogoUrl = str3;
    }

    public /* synthetic */ Merchant(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    public final java.lang.String getMerchantLogoUrl() {
        return this.merchantLogoUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.merchantName;
        java.lang.String str3 = this.merchantLogoUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Merchant(id=");
        sb.append(str);
        sb.append(", merchantName=");
        sb.append(str2);
        sb.append(", merchantLogoUrl=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.merchantName.hashCode();
        java.lang.String str = this.merchantLogoUrl;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.hub.domain.Merchant)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant = (com.paypal.oslo.feature.subscriptions.hub.domain.Merchant) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, merchant.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, merchant.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantLogoUrl, merchant.merchantLogoUrl);
    }

    public final com.paypal.oslo.feature.subscriptions.hub.domain.Merchant copy(java.lang.String id, java.lang.String merchantName, java.lang.String merchantLogoUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
        return new com.paypal.oslo.feature.subscriptions.hub.domain.Merchant(id, merchantName, merchantLogoUrl);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMerchantLogoUrl() {
        return this.merchantLogoUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.hub.domain.Merchant copy$default(com.paypal.oslo.feature.subscriptions.hub.domain.Merchant merchant, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = merchant.id;
        }
        if ((i & 2) != 0) {
            str2 = merchant.merchantName;
        }
        if ((i & 4) != 0) {
            str3 = merchant.merchantLogoUrl;
        }
        return merchant.copy(str, str2, str3);
    }
}
