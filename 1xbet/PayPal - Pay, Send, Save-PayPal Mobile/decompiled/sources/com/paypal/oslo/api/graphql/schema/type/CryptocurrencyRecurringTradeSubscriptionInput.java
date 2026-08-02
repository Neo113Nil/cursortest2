package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyRecurringTradeSubscriptionInput;", "", "", "subscriptionId", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyRecurringSubscriptionFrequency;", "frequency", "Lcom/apollographql/apollo/api/Optional;", "startDateTime", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyRecurringSubscriptionFrequency;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyRecurringSubscriptionFrequency;", "component3", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyRecurringSubscriptionFrequency;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyRecurringTradeSubscriptionInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSubscriptionId", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyRecurringSubscriptionFrequency;", "getFrequency", "Lcom/apollographql/apollo/api/Optional;", "getStartDateTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CryptocurrencyRecurringTradeSubscriptionInput {
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringSubscriptionFrequency frequency;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> startDateTime;
    private final java.lang.String subscriptionId;

    public CryptocurrencyRecurringTradeSubscriptionInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringSubscriptionFrequency cryptocurrencyRecurringSubscriptionFrequency, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyRecurringSubscriptionFrequency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.subscriptionId = str;
        this.frequency = cryptocurrencyRecurringSubscriptionFrequency;
        this.startDateTime = optional;
    }

    public final java.lang.String getSubscriptionId() {
        return this.subscriptionId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringSubscriptionFrequency getFrequency() {
        return this.frequency;
    }

    public /* synthetic */ CryptocurrencyRecurringTradeSubscriptionInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringSubscriptionFrequency cryptocurrencyRecurringSubscriptionFrequency, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cryptocurrencyRecurringSubscriptionFrequency, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getStartDateTime() {
        return this.startDateTime;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.subscriptionId;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringSubscriptionFrequency cryptocurrencyRecurringSubscriptionFrequency = this.frequency;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.startDateTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptocurrencyRecurringTradeSubscriptionInput(subscriptionId=");
        sb.append(str);
        sb.append(", frequency=");
        sb.append(cryptocurrencyRecurringSubscriptionFrequency);
        sb.append(", startDateTime=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.subscriptionId.hashCode() * 31) + this.frequency.hashCode()) * 31) + this.startDateTime.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringTradeSubscriptionInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringTradeSubscriptionInput cryptocurrencyRecurringTradeSubscriptionInput = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringTradeSubscriptionInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.subscriptionId, cryptocurrencyRecurringTradeSubscriptionInput.subscriptionId) && this.frequency == cryptocurrencyRecurringTradeSubscriptionInput.frequency && kotlin.jvm.internal.Intrinsics.areEqual(this.startDateTime, cryptocurrencyRecurringTradeSubscriptionInput.startDateTime);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringTradeSubscriptionInput copy(java.lang.String subscriptionId, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringSubscriptionFrequency frequency, com.apollographql.apollo.api.Optional<? extends java.lang.Object> startDateTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDateTime, "");
        return new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringTradeSubscriptionInput(subscriptionId, frequency, startDateTime);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component3() {
        return this.startDateTime;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringSubscriptionFrequency getFrequency() {
        return this.frequency;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSubscriptionId() {
        return this.subscriptionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringTradeSubscriptionInput copy$default(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringTradeSubscriptionInput cryptocurrencyRecurringTradeSubscriptionInput, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRecurringSubscriptionFrequency cryptocurrencyRecurringSubscriptionFrequency, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cryptocurrencyRecurringTradeSubscriptionInput.subscriptionId;
        }
        if ((i & 2) != 0) {
            cryptocurrencyRecurringSubscriptionFrequency = cryptocurrencyRecurringTradeSubscriptionInput.frequency;
        }
        if ((i & 4) != 0) {
            optional = cryptocurrencyRecurringTradeSubscriptionInput.startDateTime;
        }
        return cryptocurrencyRecurringTradeSubscriptionInput.copy(str, cryptocurrencyRecurringSubscriptionFrequency, optional);
    }
}
