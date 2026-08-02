package com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameCollectedItem;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ComponentId;", "componentId", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameVariant;", "variant", "Lcom/paypal/oslo/core/i18n/domain/model/PersonName;", "name", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameVariant;Lcom/paypal/oslo/core/i18n/domain/model/PersonName;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-fHLlpbY", "()Ljava/lang/String;", "component1", "component2", "()Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameVariant;", "component3", "()Lcom/paypal/oslo/core/i18n/domain/model/PersonName;", "copy--h87A4M", "(Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameVariant;Lcom/paypal/oslo/core/i18n/domain/model/PersonName;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameCollectedItem;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getComponentId-fHLlpbY", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameVariant;", "getVariant", "Lcom/paypal/oslo/core/i18n/domain/model/PersonName;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class NameCollectedItem implements com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem {
    public static final int $stable = 8;
    private final java.lang.String componentId;
    private final com.paypal.oslo.core.i18n.domain.model.PersonName name;
    private final com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameVariant variant;

    private NameCollectedItem(java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameVariant nameVariant, com.paypal.oslo.core.i18n.domain.model.PersonName personName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameVariant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personName, "");
        this.componentId = str;
        this.variant = nameVariant;
        this.name = personName;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem
    /* renamed from: getComponentId-fHLlpbY */
    public final java.lang.String getGetHighSpeedVideoSizes() {
        return this.componentId;
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameVariant getVariant() {
        return this.variant;
    }

    public final com.paypal.oslo.core.i18n.domain.model.PersonName getName() {
        return this.name;
    }

    public final java.lang.String toString() {
        java.lang.String m16613toStringimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16613toStringimpl(this.componentId);
        com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameVariant nameVariant = this.variant;
        com.paypal.oslo.core.i18n.domain.model.PersonName personName = this.name;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NameCollectedItem(componentId=");
        sb.append(m16613toStringimpl);
        sb.append(", variant=");
        sb.append(nameVariant);
        sb.append(", name=");
        sb.append(personName);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16612hashCodeimpl(this.componentId) * 31) + this.variant.hashCode()) * 31) + this.name.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem nameCollectedItem = (com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem) other;
        return com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16611equalsimpl0(this.componentId, nameCollectedItem.componentId) && this.variant == nameCollectedItem.variant && kotlin.jvm.internal.Intrinsics.areEqual(this.name, nameCollectedItem.name);
    }

    /* renamed from: copy--h87A4M, reason: not valid java name */
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem m17040copyh87A4M(java.lang.String componentId, com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameVariant variant, com.paypal.oslo.core.i18n.domain.model.PersonName name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem(componentId, variant, name2, null);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.PersonName getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameVariant getVariant() {
        return this.variant;
    }

    /* renamed from: component1-fHLlpbY, reason: not valid java name and from getter */
    public final java.lang.String getComponentId() {
        return this.componentId;
    }

    /* renamed from: copy--h87A4M$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem m17038copyh87A4M$default(com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem nameCollectedItem, java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameVariant nameVariant, com.paypal.oslo.core.i18n.domain.model.PersonName personName, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = nameCollectedItem.componentId;
        }
        if ((i & 2) != 0) {
            nameVariant = nameCollectedItem.variant;
        }
        if ((i & 4) != 0) {
            personName = nameCollectedItem.name;
        }
        return nameCollectedItem.m17040copyh87A4M(str, nameVariant, personName);
    }

    public /* synthetic */ NameCollectedItem(java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameVariant nameVariant, com.paypal.oslo.core.i18n.domain.model.PersonName personName, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, nameVariant, personName);
    }
}
