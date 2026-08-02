package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageTaxIdentificationNumberInputComponentInput;", "", "", "componentId", "Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageTaxIdentificationNumberInput;", "taxIdentificationNumber", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageTaxIdentificationNumberInput;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageTaxIdentificationNumberInput;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageTaxIdentificationNumberInput;)Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageTaxIdentificationNumberInputComponentInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getComponentId", "Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageTaxIdentificationNumberInput;", "getTaxIdentificationNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MosaicPageTaxIdentificationNumberInputComponentInput {
    private final java.lang.String componentId;
    private final com.paypal.oslo.api.graphql.schema.type.MosaicPageTaxIdentificationNumberInput taxIdentificationNumber;

    public MosaicPageTaxIdentificationNumberInputComponentInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MosaicPageTaxIdentificationNumberInput mosaicPageTaxIdentificationNumberInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicPageTaxIdentificationNumberInput, "");
        this.componentId = str;
        this.taxIdentificationNumber = mosaicPageTaxIdentificationNumberInput;
    }

    public final java.lang.String getComponentId() {
        return this.componentId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MosaicPageTaxIdentificationNumberInput getTaxIdentificationNumber() {
        return this.taxIdentificationNumber;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.componentId;
        com.paypal.oslo.api.graphql.schema.type.MosaicPageTaxIdentificationNumberInput mosaicPageTaxIdentificationNumberInput = this.taxIdentificationNumber;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MosaicPageTaxIdentificationNumberInputComponentInput(componentId=");
        sb.append(str);
        sb.append(", taxIdentificationNumber=");
        sb.append(mosaicPageTaxIdentificationNumberInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.componentId.hashCode() * 31) + this.taxIdentificationNumber.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.MosaicPageTaxIdentificationNumberInputComponentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.MosaicPageTaxIdentificationNumberInputComponentInput mosaicPageTaxIdentificationNumberInputComponentInput = (com.paypal.oslo.api.graphql.schema.type.MosaicPageTaxIdentificationNumberInputComponentInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.componentId, mosaicPageTaxIdentificationNumberInputComponentInput.componentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxIdentificationNumber, mosaicPageTaxIdentificationNumberInputComponentInput.taxIdentificationNumber);
    }

    public final com.paypal.oslo.api.graphql.schema.type.MosaicPageTaxIdentificationNumberInputComponentInput copy(java.lang.String componentId, com.paypal.oslo.api.graphql.schema.type.MosaicPageTaxIdentificationNumberInput taxIdentificationNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxIdentificationNumber, "");
        return new com.paypal.oslo.api.graphql.schema.type.MosaicPageTaxIdentificationNumberInputComponentInput(componentId, taxIdentificationNumber);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.MosaicPageTaxIdentificationNumberInput getTaxIdentificationNumber() {
        return this.taxIdentificationNumber;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getComponentId() {
        return this.componentId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.MosaicPageTaxIdentificationNumberInputComponentInput copy$default(com.paypal.oslo.api.graphql.schema.type.MosaicPageTaxIdentificationNumberInputComponentInput mosaicPageTaxIdentificationNumberInputComponentInput, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MosaicPageTaxIdentificationNumberInput mosaicPageTaxIdentificationNumberInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = mosaicPageTaxIdentificationNumberInputComponentInput.componentId;
        }
        if ((i & 2) != 0) {
            mosaicPageTaxIdentificationNumberInput = mosaicPageTaxIdentificationNumberInputComponentInput.taxIdentificationNumber;
        }
        return mosaicPageTaxIdentificationNumberInputComponentInput.copy(str, mosaicPageTaxIdentificationNumberInput);
    }
}
