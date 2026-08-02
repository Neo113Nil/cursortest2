package com.paypal.oslo.feature.bnplservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingProductFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "creditProductIdentifier", "", "name", "", "timeZone", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Object;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingProductFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/lang/String;", "getName", "Ljava/lang/Object;", "getTimeZone"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BnplServicingProductFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier;
    private final java.lang.String name;
    private final java.lang.Object timeZone;

    public BnplServicingProductFragment(com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier, java.lang.String str, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLCreditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.creditProductIdentifier = bNPLCreditProductIdentifier;
        this.name = str;
        this.timeZone = obj;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.Object getTimeZone() {
        return this.timeZone;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier = this.creditProductIdentifier;
        java.lang.String str = this.name;
        java.lang.Object obj = this.timeZone;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplServicingProductFragment(creditProductIdentifier=");
        sb.append(bNPLCreditProductIdentifier);
        sb.append(", name=");
        sb.append(str);
        sb.append(", timeZone=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.creditProductIdentifier.hashCode() * 31) + this.name.hashCode()) * 31) + this.timeZone.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragment)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragment bnplServicingProductFragment = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragment) other;
        return this.creditProductIdentifier == bnplServicingProductFragment.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.name, bnplServicingProductFragment.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.timeZone, bnplServicingProductFragment.timeZone);
    }

    public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragment copy(com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier creditProductIdentifier, java.lang.String name2, java.lang.Object timeZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragment(creditProductIdentifier, name2, timeZone);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getTimeZone() {
        return this.timeZone;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragment copy$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragment bnplServicingProductFragment, com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            bNPLCreditProductIdentifier = bnplServicingProductFragment.creditProductIdentifier;
        }
        if ((i & 2) != 0) {
            str = bnplServicingProductFragment.name;
        }
        if ((i & 4) != 0) {
            obj = bnplServicingProductFragment.timeZone;
        }
        return bnplServicingProductFragment.copy(bNPLCreditProductIdentifier, str, obj);
    }
}
