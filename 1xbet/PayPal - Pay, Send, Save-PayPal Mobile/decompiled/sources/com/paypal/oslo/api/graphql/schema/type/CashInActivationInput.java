package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CashInActivationInput;", "", "", "partnerId", "retailerId", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/GeoCoordinatesInput;", "geoCoordinates", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/CashInActivationInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPartnerId", "getRetailerId", "Lcom/apollographql/apollo/api/Optional;", "getGeoCoordinates"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CashInActivationInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.GeoCoordinatesInput> geoCoordinates;
    private final java.lang.String partnerId;
    private final java.lang.String retailerId;

    public CashInActivationInput(java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.GeoCoordinatesInput> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.partnerId = str;
        this.retailerId = str2;
        this.geoCoordinates = optional;
    }

    public final java.lang.String getPartnerId() {
        return this.partnerId;
    }

    public final java.lang.String getRetailerId() {
        return this.retailerId;
    }

    public /* synthetic */ CashInActivationInput(java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.GeoCoordinatesInput> getGeoCoordinates() {
        return this.geoCoordinates;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.partnerId;
        java.lang.String str2 = this.retailerId;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.GeoCoordinatesInput> optional = this.geoCoordinates;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CashInActivationInput(partnerId=");
        sb.append(str);
        sb.append(", retailerId=");
        sb.append(str2);
        sb.append(", geoCoordinates=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.partnerId.hashCode() * 31) + this.retailerId.hashCode()) * 31) + this.geoCoordinates.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CashInActivationInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CashInActivationInput cashInActivationInput = (com.paypal.oslo.api.graphql.schema.type.CashInActivationInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.partnerId, cashInActivationInput.partnerId) && kotlin.jvm.internal.Intrinsics.areEqual(this.retailerId, cashInActivationInput.retailerId) && kotlin.jvm.internal.Intrinsics.areEqual(this.geoCoordinates, cashInActivationInput.geoCoordinates);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CashInActivationInput copy(java.lang.String partnerId, java.lang.String retailerId, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.GeoCoordinatesInput> geoCoordinates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retailerId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(geoCoordinates, "");
        return new com.paypal.oslo.api.graphql.schema.type.CashInActivationInput(partnerId, retailerId, geoCoordinates);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.GeoCoordinatesInput> component3() {
        return this.geoCoordinates;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRetailerId() {
        return this.retailerId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPartnerId() {
        return this.partnerId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CashInActivationInput copy$default(com.paypal.oslo.api.graphql.schema.type.CashInActivationInput cashInActivationInput, java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cashInActivationInput.partnerId;
        }
        if ((i & 2) != 0) {
            str2 = cashInActivationInput.retailerId;
        }
        if ((i & 4) != 0) {
            optional = cashInActivationInput.geoCoordinates;
        }
        return cashInActivationInput.copy(str, str2, optional);
    }
}
