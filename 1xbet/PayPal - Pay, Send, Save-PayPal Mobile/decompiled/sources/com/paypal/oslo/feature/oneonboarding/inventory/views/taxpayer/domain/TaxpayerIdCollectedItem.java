package com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\"\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdCollectedItem;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ComponentId;", "componentId", "", "taxId", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdType;", "type", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdVariant;", "variant", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdType;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdVariant;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-fHLlpbY", "()Ljava/lang/String;", "component1", "component2", "component3", "()Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdType;", "component4", "()Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdVariant;", "copy-svVtR6Q", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdType;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdVariant;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdCollectedItem;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getComponentId-fHLlpbY", "getTaxId", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdType;", "getType", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdVariant;", "getVariant"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TaxpayerIdCollectedItem implements com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem {
    public static final int $stable = 0;
    private final java.lang.String componentId;
    private final java.lang.String taxId;
    private final com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType type;
    private final com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdVariant variant;

    private TaxpayerIdCollectedItem(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType taxpayerIdType, com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdVariant taxpayerIdVariant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxpayerIdType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxpayerIdVariant, "");
        this.componentId = str;
        this.taxId = str2;
        this.type = taxpayerIdType;
        this.variant = taxpayerIdVariant;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem
    /* renamed from: getComponentId-fHLlpbY */
    public final java.lang.String getGetHighSpeedVideoSizes() {
        return this.componentId;
    }

    public final java.lang.String getTaxId() {
        return this.taxId;
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType getType() {
        return this.type;
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdVariant getVariant() {
        return this.variant;
    }

    public final java.lang.String toString() {
        java.lang.String m16613toStringimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16613toStringimpl(this.componentId);
        java.lang.String str = this.taxId;
        com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType taxpayerIdType = this.type;
        com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdVariant taxpayerIdVariant = this.variant;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TaxpayerIdCollectedItem(componentId=");
        sb.append(m16613toStringimpl);
        sb.append(", taxId=");
        sb.append(str);
        sb.append(", type=");
        sb.append(taxpayerIdType);
        sb.append(", variant=");
        sb.append(taxpayerIdVariant);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16612hashCodeimpl(this.componentId) * 31) + this.taxId.hashCode()) * 31) + this.type.hashCode()) * 31) + this.variant.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdCollectedItem)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdCollectedItem taxpayerIdCollectedItem = (com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdCollectedItem) other;
        return com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16611equalsimpl0(this.componentId, taxpayerIdCollectedItem.componentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxId, taxpayerIdCollectedItem.taxId) && this.type == taxpayerIdCollectedItem.type && this.variant == taxpayerIdCollectedItem.variant;
    }

    /* renamed from: copy-svVtR6Q, reason: not valid java name */
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdCollectedItem m17096copysvVtR6Q(java.lang.String componentId, java.lang.String taxId, com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType type, com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdVariant variant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdCollectedItem(componentId, taxId, type, variant, null);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdVariant getVariant() {
        return this.variant;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTaxId() {
        return this.taxId;
    }

    /* renamed from: component1-fHLlpbY, reason: not valid java name and from getter */
    public final java.lang.String getComponentId() {
        return this.componentId;
    }

    /* renamed from: copy-svVtR6Q$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdCollectedItem m17094copysvVtR6Q$default(com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdCollectedItem taxpayerIdCollectedItem, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType taxpayerIdType, com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdVariant taxpayerIdVariant, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = taxpayerIdCollectedItem.componentId;
        }
        if ((i & 2) != 0) {
            str2 = taxpayerIdCollectedItem.taxId;
        }
        if ((i & 4) != 0) {
            taxpayerIdType = taxpayerIdCollectedItem.type;
        }
        if ((i & 8) != 0) {
            taxpayerIdVariant = taxpayerIdCollectedItem.variant;
        }
        return taxpayerIdCollectedItem.m17096copysvVtR6Q(str, str2, taxpayerIdType, taxpayerIdVariant);
    }

    public /* synthetic */ TaxpayerIdCollectedItem(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType taxpayerIdType, com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdVariant taxpayerIdVariant, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, taxpayerIdType, taxpayerIdVariant);
    }
}
