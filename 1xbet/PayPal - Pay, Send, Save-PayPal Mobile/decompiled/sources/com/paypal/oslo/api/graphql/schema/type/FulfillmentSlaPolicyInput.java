package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/FulfillmentSlaPolicyInput;", "", "", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "adjacency", "requestType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/FulfillmentSlaPolicyInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCountry", "getAdjacency", "getRequestType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FulfillmentSlaPolicyInput {
    private final java.lang.String adjacency;
    private final java.lang.String country;
    private final java.lang.String requestType;

    public FulfillmentSlaPolicyInput(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.country = str;
        this.adjacency = str2;
        this.requestType = str3;
    }

    public final java.lang.String getCountry() {
        return this.country;
    }

    public final java.lang.String getAdjacency() {
        return this.adjacency;
    }

    public final java.lang.String getRequestType() {
        return this.requestType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.country;
        java.lang.String str2 = this.adjacency;
        java.lang.String str3 = this.requestType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FulfillmentSlaPolicyInput(country=");
        sb.append(str);
        sb.append(", adjacency=");
        sb.append(str2);
        sb.append(", requestType=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.country.hashCode() * 31) + this.adjacency.hashCode()) * 31) + this.requestType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.FulfillmentSlaPolicyInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.FulfillmentSlaPolicyInput fulfillmentSlaPolicyInput = (com.paypal.oslo.api.graphql.schema.type.FulfillmentSlaPolicyInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.country, fulfillmentSlaPolicyInput.country) && kotlin.jvm.internal.Intrinsics.areEqual(this.adjacency, fulfillmentSlaPolicyInput.adjacency) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestType, fulfillmentSlaPolicyInput.requestType);
    }

    public final com.paypal.oslo.api.graphql.schema.type.FulfillmentSlaPolicyInput copy(java.lang.String country, java.lang.String adjacency, java.lang.String requestType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adjacency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestType, "");
        return new com.paypal.oslo.api.graphql.schema.type.FulfillmentSlaPolicyInput(country, adjacency, requestType);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getRequestType() {
        return this.requestType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAdjacency() {
        return this.adjacency;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCountry() {
        return this.country;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.FulfillmentSlaPolicyInput copy$default(com.paypal.oslo.api.graphql.schema.type.FulfillmentSlaPolicyInput fulfillmentSlaPolicyInput, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = fulfillmentSlaPolicyInput.country;
        }
        if ((i & 2) != 0) {
            str2 = fulfillmentSlaPolicyInput.adjacency;
        }
        if ((i & 4) != 0) {
            str3 = fulfillmentSlaPolicyInput.requestType;
        }
        return fulfillmentSlaPolicyInput.copy(str, str2, str3);
    }
}
