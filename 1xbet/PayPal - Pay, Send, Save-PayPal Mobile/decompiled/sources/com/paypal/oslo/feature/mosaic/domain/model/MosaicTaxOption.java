package com.paypal.oslo.feature.mosaic.domain.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicTaxOption;", "", "", "helperText", "Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdNumberType;", "type", "Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdMoreInfoContentVariant;", "showMoreInfoContentVariant", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdNumberType;Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdMoreInfoContentVariant;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdNumberType;", "component3", "()Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdMoreInfoContentVariant;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdNumberType;Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdMoreInfoContentVariant;)Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicTaxOption;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getHelperText", "Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdNumberType;", "getType", "Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdMoreInfoContentVariant;", "getShowMoreInfoContentVariant"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MosaicTaxOption {
    public static final int $stable = 0;
    private final java.lang.String helperText;
    private final com.paypal.oslo.feature.mosaic.domain.model.TaxIdMoreInfoContentVariant showMoreInfoContentVariant;
    private final com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType type;

    public MosaicTaxOption(java.lang.String str, com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType taxIdNumberType, com.paypal.oslo.feature.mosaic.domain.model.TaxIdMoreInfoContentVariant taxIdMoreInfoContentVariant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxIdNumberType, "");
        this.helperText = str;
        this.type = taxIdNumberType;
        this.showMoreInfoContentVariant = taxIdMoreInfoContentVariant;
    }

    public final java.lang.String getHelperText() {
        return this.helperText;
    }

    public final com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType getType() {
        return this.type;
    }

    public final com.paypal.oslo.feature.mosaic.domain.model.TaxIdMoreInfoContentVariant getShowMoreInfoContentVariant() {
        return this.showMoreInfoContentVariant;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.helperText;
        com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType taxIdNumberType = this.type;
        com.paypal.oslo.feature.mosaic.domain.model.TaxIdMoreInfoContentVariant taxIdMoreInfoContentVariant = this.showMoreInfoContentVariant;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MosaicTaxOption(helperText=");
        sb.append(str);
        sb.append(", type=");
        sb.append(taxIdNumberType);
        sb.append(", showMoreInfoContentVariant=");
        sb.append(taxIdMoreInfoContentVariant);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.helperText;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.type.hashCode();
        com.paypal.oslo.feature.mosaic.domain.model.TaxIdMoreInfoContentVariant taxIdMoreInfoContentVariant = this.showMoreInfoContentVariant;
        return (((hashCode * 31) + hashCode2) * 31) + (taxIdMoreInfoContentVariant != null ? taxIdMoreInfoContentVariant.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.mosaic.domain.model.MosaicTaxOption)) {
            return false;
        }
        com.paypal.oslo.feature.mosaic.domain.model.MosaicTaxOption mosaicTaxOption = (com.paypal.oslo.feature.mosaic.domain.model.MosaicTaxOption) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.helperText, mosaicTaxOption.helperText) && this.type == mosaicTaxOption.type && this.showMoreInfoContentVariant == mosaicTaxOption.showMoreInfoContentVariant;
    }

    public final com.paypal.oslo.feature.mosaic.domain.model.MosaicTaxOption copy(java.lang.String helperText, com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType type, com.paypal.oslo.feature.mosaic.domain.model.TaxIdMoreInfoContentVariant showMoreInfoContentVariant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.mosaic.domain.model.MosaicTaxOption(helperText, type, showMoreInfoContentVariant);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.mosaic.domain.model.TaxIdMoreInfoContentVariant getShowMoreInfoContentVariant() {
        return this.showMoreInfoContentVariant;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getHelperText() {
        return this.helperText;
    }

    public static /* synthetic */ com.paypal.oslo.feature.mosaic.domain.model.MosaicTaxOption copy$default(com.paypal.oslo.feature.mosaic.domain.model.MosaicTaxOption mosaicTaxOption, java.lang.String str, com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType taxIdNumberType, com.paypal.oslo.feature.mosaic.domain.model.TaxIdMoreInfoContentVariant taxIdMoreInfoContentVariant, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = mosaicTaxOption.helperText;
        }
        if ((i & 2) != 0) {
            taxIdNumberType = mosaicTaxOption.type;
        }
        if ((i & 4) != 0) {
            taxIdMoreInfoContentVariant = mosaicTaxOption.showMoreInfoContentVariant;
        }
        return mosaicTaxOption.copy(str, taxIdNumberType, taxIdMoreInfoContentVariant);
    }
}
