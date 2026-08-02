package com.paypal.oslo.feature.debitcard.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentPinFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinStatus;", "status", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinProfileName;", "profileName", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinOrigin;", "origin", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinStatus;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinProfileName;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinOrigin;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinStatus;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinProfileName;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinOrigin;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinStatus;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinProfileName;Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinOrigin;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentPinFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinStatus;", "getStatus", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinProfileName;", "getProfileName", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinOrigin;", "getOrigin"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitInstrumentPinFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 0;
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinOrigin origin;
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinProfileName profileName;
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinStatus status;

    public DebitInstrumentPinFragment(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinStatus debitInstrumentPinStatus, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinProfileName debitInstrumentPinProfileName, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinOrigin debitInstrumentPinOrigin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentPinStatus, "");
        this.status = debitInstrumentPinStatus;
        this.profileName = debitInstrumentPinProfileName;
        this.origin = debitInstrumentPinOrigin;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinStatus getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinProfileName getProfileName() {
        return this.profileName;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinOrigin getOrigin() {
        return this.origin;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinStatus debitInstrumentPinStatus = this.status;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinProfileName debitInstrumentPinProfileName = this.profileName;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinOrigin debitInstrumentPinOrigin = this.origin;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentPinFragment(status=");
        sb.append(debitInstrumentPinStatus);
        sb.append(", profileName=");
        sb.append(debitInstrumentPinProfileName);
        sb.append(", origin=");
        sb.append(debitInstrumentPinOrigin);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode();
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinProfileName debitInstrumentPinProfileName = this.profileName;
        int hashCode2 = debitInstrumentPinProfileName == null ? 0 : debitInstrumentPinProfileName.hashCode();
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinOrigin debitInstrumentPinOrigin = this.origin;
        return (((hashCode * 31) + hashCode2) * 31) + (debitInstrumentPinOrigin != null ? debitInstrumentPinOrigin.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPinFragment)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPinFragment debitInstrumentPinFragment = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPinFragment) other;
        return this.status == debitInstrumentPinFragment.status && this.profileName == debitInstrumentPinFragment.profileName && this.origin == debitInstrumentPinFragment.origin;
    }

    public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPinFragment copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinStatus status, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinProfileName profileName, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinOrigin origin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPinFragment(status, profileName, origin);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinOrigin getOrigin() {
        return this.origin;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinProfileName getProfileName() {
        return this.profileName;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinStatus getStatus() {
        return this.status;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPinFragment copy$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPinFragment debitInstrumentPinFragment, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinStatus debitInstrumentPinStatus, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinProfileName debitInstrumentPinProfileName, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinOrigin debitInstrumentPinOrigin, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitInstrumentPinStatus = debitInstrumentPinFragment.status;
        }
        if ((i & 2) != 0) {
            debitInstrumentPinProfileName = debitInstrumentPinFragment.profileName;
        }
        if ((i & 4) != 0) {
            debitInstrumentPinOrigin = debitInstrumentPinFragment.origin;
        }
        return debitInstrumentPinFragment.copy(debitInstrumentPinStatus, debitInstrumentPinProfileName, debitInstrumentPinOrigin);
    }
}
