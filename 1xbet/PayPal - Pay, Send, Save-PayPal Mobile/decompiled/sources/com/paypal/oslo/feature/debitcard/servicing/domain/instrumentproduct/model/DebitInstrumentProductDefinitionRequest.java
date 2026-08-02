package com.paypal.oslo.feature.debitcard.servicing.domain.instrumentproduct.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/instrumentproduct/model/DebitInstrumentProductDefinitionRequest;", "", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "countryCode", "", "includeCardArtImages", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Z)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component2", "()Ljava/lang/String;", "component3", "()Z", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/debitcard/servicing/domain/instrumentproduct/model/DebitInstrumentProductDefinitionRequest;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "Ljava/lang/String;", "getCountryCode", "Z", "getIncludeCardArtImages"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DebitInstrumentProductDefinitionRequest {
    public static final int $stable = 0;
    private final java.lang.String countryCode;
    private final boolean includeCardArtImages;
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

    public DebitInstrumentProductDefinitionRequest(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.productName = debitCardProductName;
        this.countryCode = str;
        this.includeCardArtImages = z;
    }

    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final boolean getIncludeCardArtImages() {
        return this.includeCardArtImages;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
        java.lang.String str = this.countryCode;
        boolean z = this.includeCardArtImages;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentProductDefinitionRequest(productName=");
        sb.append(debitCardProductName);
        sb.append(", countryCode=");
        sb.append(str);
        sb.append(", includeCardArtImages=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.productName.hashCode() * 31) + this.countryCode.hashCode()) * 31) + java.lang.Boolean.hashCode(this.includeCardArtImages);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.domain.instrumentproduct.model.DebitInstrumentProductDefinitionRequest)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.servicing.domain.instrumentproduct.model.DebitInstrumentProductDefinitionRequest debitInstrumentProductDefinitionRequest = (com.paypal.oslo.feature.debitcard.servicing.domain.instrumentproduct.model.DebitInstrumentProductDefinitionRequest) other;
        return this.productName == debitInstrumentProductDefinitionRequest.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, debitInstrumentProductDefinitionRequest.countryCode) && this.includeCardArtImages == debitInstrumentProductDefinitionRequest.includeCardArtImages;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.instrumentproduct.model.DebitInstrumentProductDefinitionRequest copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, java.lang.String countryCode, boolean includeCardArtImages) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.instrumentproduct.model.DebitInstrumentProductDefinitionRequest(productName, countryCode, includeCardArtImages);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIncludeCardArtImages() {
        return this.includeCardArtImages;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.instrumentproduct.model.DebitInstrumentProductDefinitionRequest copy$default(com.paypal.oslo.feature.debitcard.servicing.domain.instrumentproduct.model.DebitInstrumentProductDefinitionRequest debitInstrumentProductDefinitionRequest, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitCardProductName = debitInstrumentProductDefinitionRequest.productName;
        }
        if ((i & 2) != 0) {
            str = debitInstrumentProductDefinitionRequest.countryCode;
        }
        if ((i & 4) != 0) {
            z = debitInstrumentProductDefinitionRequest.includeCardArtImages;
        }
        return debitInstrumentProductDefinitionRequest.copy(debitCardProductName, str, z);
    }
}
