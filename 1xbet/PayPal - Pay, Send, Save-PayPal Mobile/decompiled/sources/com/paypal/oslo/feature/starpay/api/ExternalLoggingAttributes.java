package com.paypal.oslo.feature.starpay.api;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/starpay/api/ExternalLoggingAttributes;", "", "", "domain", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "additionalAttributes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/feature/starpay/api/ExternalLoggingAttributes;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDomain", "getProductName", "Ljava/util/Map;", "getAdditionalAttributes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ExternalLoggingAttributes {
    public static final int $stable = 8;
    private final java.util.Map<java.lang.String, java.lang.String> additionalAttributes;
    private final java.lang.String domain;
    private final java.lang.String productName;

    public ExternalLoggingAttributes(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.domain = str;
        this.productName = str2;
        this.additionalAttributes = map;
    }

    public final java.lang.String getDomain() {
        return this.domain;
    }

    public final java.lang.String getProductName() {
        return this.productName;
    }

    public /* synthetic */ ExternalLoggingAttributes(java.lang.String str, java.lang.String str2, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.util.Map<java.lang.String, java.lang.String> getAdditionalAttributes() {
        return this.additionalAttributes;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.domain;
        java.lang.String str2 = this.productName;
        java.util.Map<java.lang.String, java.lang.String> map = this.additionalAttributes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExternalLoggingAttributes(domain=");
        sb.append(str);
        sb.append(", productName=");
        sb.append(str2);
        sb.append(", additionalAttributes=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.domain.hashCode() * 31) + this.productName.hashCode()) * 31) + this.additionalAttributes.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.starpay.api.ExternalLoggingAttributes)) {
            return false;
        }
        com.paypal.oslo.feature.starpay.api.ExternalLoggingAttributes externalLoggingAttributes = (com.paypal.oslo.feature.starpay.api.ExternalLoggingAttributes) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.domain, externalLoggingAttributes.domain) && kotlin.jvm.internal.Intrinsics.areEqual(this.productName, externalLoggingAttributes.productName) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalAttributes, externalLoggingAttributes.additionalAttributes);
    }

    public final com.paypal.oslo.feature.starpay.api.ExternalLoggingAttributes copy(java.lang.String domain, java.lang.String productName, java.util.Map<java.lang.String, java.lang.String> additionalAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalAttributes, "");
        return new com.paypal.oslo.feature.starpay.api.ExternalLoggingAttributes(domain, productName, additionalAttributes);
    }

    public final java.util.Map<java.lang.String, java.lang.String> component3() {
        return this.additionalAttributes;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getProductName() {
        return this.productName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDomain() {
        return this.domain;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.starpay.api.ExternalLoggingAttributes copy$default(com.paypal.oslo.feature.starpay.api.ExternalLoggingAttributes externalLoggingAttributes, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = externalLoggingAttributes.domain;
        }
        if ((i & 2) != 0) {
            str2 = externalLoggingAttributes.productName;
        }
        if ((i & 4) != 0) {
            map = externalLoggingAttributes.additionalAttributes;
        }
        return externalLoggingAttributes.copy(str, str2, map);
    }
}
