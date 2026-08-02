package com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/password/domain/PasswordCollectedItem;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ComponentId;", "componentId", "", "password", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-fHLlpbY", "()Ljava/lang/String;", "component1", "component2", "copy-OUoJPtg", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/password/domain/PasswordCollectedItem;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getComponentId-fHLlpbY", "getPassword"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PasswordCollectedItem implements com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem {
    public static final int $stable = 0;
    private final java.lang.String componentId;
    private final java.lang.String password;

    private PasswordCollectedItem(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.componentId = str;
        this.password = str2;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem
    /* renamed from: getComponentId-fHLlpbY */
    public final java.lang.String mo16606getComponentIdfHLlpbY() {
        return this.componentId;
    }

    public final java.lang.String getPassword() {
        return this.password;
    }

    public final java.lang.String toString() {
        java.lang.String m16613toStringimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16613toStringimpl(this.componentId);
        java.lang.String str = this.password;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasswordCollectedItem(componentId=");
        sb.append(m16613toStringimpl);
        sb.append(", password=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16612hashCodeimpl(this.componentId) * 31) + this.password.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.PasswordCollectedItem)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.PasswordCollectedItem passwordCollectedItem = (com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.PasswordCollectedItem) other;
        return com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16611equalsimpl0(this.componentId, passwordCollectedItem.componentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.password, passwordCollectedItem.password);
    }

    /* renamed from: copy-OUoJPtg, reason: not valid java name */
    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.PasswordCollectedItem m16750copyOUoJPtg(java.lang.String componentId, java.lang.String password) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "");
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.PasswordCollectedItem(componentId, password, null);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPassword() {
        return this.password;
    }

    /* renamed from: component1-fHLlpbY, reason: not valid java name and from getter */
    public final java.lang.String getComponentId() {
        return this.componentId;
    }

    /* renamed from: copy-OUoJPtg$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.PasswordCollectedItem m16748copyOUoJPtg$default(com.paypal.oslo.feature.oneonboarding.inventory.steps.password.domain.PasswordCollectedItem passwordCollectedItem, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = passwordCollectedItem.componentId;
        }
        if ((i & 2) != 0) {
            str2 = passwordCollectedItem.password;
        }
        return passwordCollectedItem.m16750copyOUoJPtg(str, str2);
    }

    public /* synthetic */ PasswordCollectedItem(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }
}
