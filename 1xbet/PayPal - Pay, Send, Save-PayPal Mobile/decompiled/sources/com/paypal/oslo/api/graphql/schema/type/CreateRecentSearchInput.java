package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ>\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CreateRecentSearchInput;", "", "Lcom/apollographql/apollo/api/Optional;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;", "networkType", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;)Lcom/paypal/oslo/api/graphql/schema/type/CreateRecentSearchInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getContactId", "getValue", "Lcom/paypal/oslo/api/graphql/schema/type/ContactNetworkType;", "getNetworkType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreateRecentSearchInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Object> contactId;
    private final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType networkType;
    private final com.apollographql.apollo.api.Optional<java.lang.String> value;

    public CreateRecentSearchInput(com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2, com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactNetworkType, "");
        this.contactId = optional;
        this.value = optional2;
        this.networkType = contactNetworkType;
    }

    public /* synthetic */ CreateRecentSearchInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, contactNetworkType);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getContactId() {
        return this.contactId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getValue() {
        return this.value;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType getNetworkType() {
        return this.networkType;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.contactId;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.value;
        com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType = this.networkType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateRecentSearchInput(contactId=");
        sb.append(optional);
        sb.append(", value=");
        sb.append(optional2);
        sb.append(", networkType=");
        sb.append(contactNetworkType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.contactId.hashCode() * 31) + this.value.hashCode()) * 31) + this.networkType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CreateRecentSearchInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CreateRecentSearchInput createRecentSearchInput = (com.paypal.oslo.api.graphql.schema.type.CreateRecentSearchInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.contactId, createRecentSearchInput.contactId) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, createRecentSearchInput.value) && this.networkType == createRecentSearchInput.networkType;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreateRecentSearchInput copy(com.apollographql.apollo.api.Optional<? extends java.lang.Object> contactId, com.apollographql.apollo.api.Optional<java.lang.String> value, com.paypal.oslo.api.graphql.schema.type.ContactNetworkType networkType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkType, "");
        return new com.paypal.oslo.api.graphql.schema.type.CreateRecentSearchInput(contactId, value, networkType);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ContactNetworkType getNetworkType() {
        return this.networkType;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.value;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component1() {
        return this.contactId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CreateRecentSearchInput copy$default(com.paypal.oslo.api.graphql.schema.type.CreateRecentSearchInput createRecentSearchInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = createRecentSearchInput.contactId;
        }
        if ((i & 2) != 0) {
            optional2 = createRecentSearchInput.value;
        }
        if ((i & 4) != 0) {
            contactNetworkType = createRecentSearchInput.networkType;
        }
        return createRecentSearchInput.copy(optional, optional2, contactNetworkType);
    }
}
