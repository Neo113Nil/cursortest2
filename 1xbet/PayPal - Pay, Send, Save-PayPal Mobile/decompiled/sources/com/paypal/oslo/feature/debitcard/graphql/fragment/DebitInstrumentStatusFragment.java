package com.paypal.oslo.feature.debitcard.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentStatusFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;", "lifecycleState", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentDisplayState;", "displayState", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentStatusChangeReason;", "statusChangeReasons", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentDisplayState;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentDisplayState;", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentDisplayState;Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentStatusFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentLifecycleState;", "getLifecycleState", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentDisplayState;", "getDisplayState", "Ljava/util/List;", "getStatusChangeReasons"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitInstrumentStatusFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState displayState;
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState lifecycleState;
    private final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason> statusChangeReasons;

    /* JADX WARN: Multi-variable type inference failed */
    public DebitInstrumentStatusFragment(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState debitInstrumentDisplayState, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason> list) {
        this.lifecycleState = debitInstrumentLifecycleState;
        this.displayState = debitInstrumentDisplayState;
        this.statusChangeReasons = list;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState getLifecycleState() {
        return this.lifecycleState;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState getDisplayState() {
        return this.displayState;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason> getStatusChangeReasons() {
        return this.statusChangeReasons;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState = this.lifecycleState;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState debitInstrumentDisplayState = this.displayState;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason> list = this.statusChangeReasons;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentStatusFragment(lifecycleState=");
        sb.append(debitInstrumentLifecycleState);
        sb.append(", displayState=");
        sb.append(debitInstrumentDisplayState);
        sb.append(", statusChangeReasons=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState = this.lifecycleState;
        int hashCode = debitInstrumentLifecycleState == null ? 0 : debitInstrumentLifecycleState.hashCode();
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState debitInstrumentDisplayState = this.displayState;
        int hashCode2 = debitInstrumentDisplayState == null ? 0 : debitInstrumentDisplayState.hashCode();
        java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason> list = this.statusChangeReasons;
        return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentStatusFragment)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentStatusFragment debitInstrumentStatusFragment = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentStatusFragment) other;
        return this.lifecycleState == debitInstrumentStatusFragment.lifecycleState && this.displayState == debitInstrumentStatusFragment.displayState && kotlin.jvm.internal.Intrinsics.areEqual(this.statusChangeReasons, debitInstrumentStatusFragment.statusChangeReasons);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentStatusFragment copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState lifecycleState, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState displayState, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason> statusChangeReasons) {
        return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentStatusFragment(lifecycleState, displayState, statusChangeReasons);
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentStatusChangeReason> component3() {
        return this.statusChangeReasons;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState getDisplayState() {
        return this.displayState;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState getLifecycleState() {
        return this.lifecycleState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentStatusFragment copy$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentStatusFragment debitInstrumentStatusFragment, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentLifecycleState debitInstrumentLifecycleState, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState debitInstrumentDisplayState, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitInstrumentLifecycleState = debitInstrumentStatusFragment.lifecycleState;
        }
        if ((i & 2) != 0) {
            debitInstrumentDisplayState = debitInstrumentStatusFragment.displayState;
        }
        if ((i & 4) != 0) {
            list = debitInstrumentStatusFragment.statusChangeReasons;
        }
        return debitInstrumentStatusFragment.copy(debitInstrumentLifecycleState, debitInstrumentDisplayState, list);
    }
}
