package com.paypal.oslo.feature.oneonboarding.inventory.views.w9terms.domain;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/w9terms/domain/W9TermsCollectedItem;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ComponentId;", "componentId", "", "accepted", "<init>", "(Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-fHLlpbY", "()Ljava/lang/String;", "component1", "component2", "()Z", "copy-OUoJPtg", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/w9terms/domain/W9TermsCollectedItem;", "copy", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getComponentId-fHLlpbY", "Z", "getAccepted"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class W9TermsCollectedItem implements com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem {
    public static final int $stable = 0;
    private final boolean accepted;
    private final java.lang.String componentId;

    private W9TermsCollectedItem(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.componentId = str;
        this.accepted = z;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem
    /* renamed from: getComponentId-fHLlpbY */
    public final java.lang.String getGetHighSpeedVideoSizes() {
        return this.componentId;
    }

    public final boolean getAccepted() {
        return this.accepted;
    }

    public final java.lang.String toString() {
        java.lang.String m16613toStringimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16613toStringimpl(this.componentId);
        boolean z = this.accepted;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("W9TermsCollectedItem(componentId=");
        sb.append(m16613toStringimpl);
        sb.append(", accepted=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16612hashCodeimpl(this.componentId) * 31) + java.lang.Boolean.hashCode(this.accepted);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.w9terms.domain.W9TermsCollectedItem)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.w9terms.domain.W9TermsCollectedItem w9TermsCollectedItem = (com.paypal.oslo.feature.oneonboarding.inventory.views.w9terms.domain.W9TermsCollectedItem) other;
        return com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16611equalsimpl0(this.componentId, w9TermsCollectedItem.componentId) && this.accepted == w9TermsCollectedItem.accepted;
    }

    /* renamed from: copy-OUoJPtg, reason: not valid java name */
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.w9terms.domain.W9TermsCollectedItem m17113copyOUoJPtg(java.lang.String componentId, boolean accepted) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.w9terms.domain.W9TermsCollectedItem(componentId, accepted, null);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAccepted() {
        return this.accepted;
    }

    /* renamed from: component1-fHLlpbY, reason: not valid java name and from getter */
    public final java.lang.String getComponentId() {
        return this.componentId;
    }

    /* renamed from: copy-OUoJPtg$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.w9terms.domain.W9TermsCollectedItem m17111copyOUoJPtg$default(com.paypal.oslo.feature.oneonboarding.inventory.views.w9terms.domain.W9TermsCollectedItem w9TermsCollectedItem, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = w9TermsCollectedItem.componentId;
        }
        if ((i & 2) != 0) {
            z = w9TermsCollectedItem.accepted;
        }
        return w9TermsCollectedItem.m17113copyOUoJPtg(str, z);
    }

    public /* synthetic */ W9TermsCollectedItem(java.lang.String str, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z);
    }
}
