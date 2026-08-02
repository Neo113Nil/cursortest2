package com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingNativeActionFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingNativeActionType;", "nativeActionType", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingNativeBehavior;", "behavior", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingNativeActionType;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingNativeBehavior;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingNativeActionType;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingNativeBehavior;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingNativeActionType;Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingNativeBehavior;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingNativeActionFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingNativeActionType;", "getNativeActionType", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingNativeBehavior;", "getBehavior"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RevolvingCreditServicingNativeActionFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 0;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNativeBehavior behavior;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNativeActionType nativeActionType;

    public RevolvingCreditServicingNativeActionFragment(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNativeActionType revolvingCreditServicingNativeActionType, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNativeBehavior revolvingCreditServicingNativeBehavior) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingNativeActionType, "");
        this.nativeActionType = revolvingCreditServicingNativeActionType;
        this.behavior = revolvingCreditServicingNativeBehavior;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNativeActionType getNativeActionType() {
        return this.nativeActionType;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNativeBehavior getBehavior() {
        return this.behavior;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNativeActionType revolvingCreditServicingNativeActionType = this.nativeActionType;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNativeBehavior revolvingCreditServicingNativeBehavior = this.behavior;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditServicingNativeActionFragment(nativeActionType=");
        sb.append(revolvingCreditServicingNativeActionType);
        sb.append(", behavior=");
        sb.append(revolvingCreditServicingNativeBehavior);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.nativeActionType.hashCode();
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNativeBehavior revolvingCreditServicingNativeBehavior = this.behavior;
        return (hashCode * 31) + (revolvingCreditServicingNativeBehavior == null ? 0 : revolvingCreditServicingNativeBehavior.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNativeActionFragment)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNativeActionFragment revolvingCreditServicingNativeActionFragment = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNativeActionFragment) other;
        return this.nativeActionType == revolvingCreditServicingNativeActionFragment.nativeActionType && this.behavior == revolvingCreditServicingNativeActionFragment.behavior;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNativeActionFragment copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNativeActionType nativeActionType, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNativeBehavior behavior) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeActionType, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNativeActionFragment(nativeActionType, behavior);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNativeBehavior getBehavior() {
        return this.behavior;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNativeActionType getNativeActionType() {
        return this.nativeActionType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNativeActionFragment copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingNativeActionFragment revolvingCreditServicingNativeActionFragment, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNativeActionType revolvingCreditServicingNativeActionType, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingNativeBehavior revolvingCreditServicingNativeBehavior, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            revolvingCreditServicingNativeActionType = revolvingCreditServicingNativeActionFragment.nativeActionType;
        }
        if ((i & 2) != 0) {
            revolvingCreditServicingNativeBehavior = revolvingCreditServicingNativeActionFragment.behavior;
        }
        return revolvingCreditServicingNativeActionFragment.copy(revolvingCreditServicingNativeActionType, revolvingCreditServicingNativeBehavior);
    }
}
