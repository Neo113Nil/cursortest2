package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJF\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\fR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementIncentivesInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/SuggestedMerchantsInput;", "suggestedMerchants", "", "limit", "", "cursor", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementIncentivesInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getSuggestedMerchants", "getLimit", "getCursor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ConsumerAgreementIncentivesInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> cursor;
    private final com.apollographql.apollo.api.Optional<java.lang.Integer> limit;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsInput> suggestedMerchants;

    public ConsumerAgreementIncentivesInput(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsInput> optional, com.apollographql.apollo.api.Optional<java.lang.Integer> optional2, com.apollographql.apollo.api.Optional<java.lang.String> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.suggestedMerchants = optional;
        this.limit = optional2;
        this.cursor = optional3;
    }

    public /* synthetic */ ConsumerAgreementIncentivesInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsInput> getSuggestedMerchants() {
        return this.suggestedMerchants;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> getLimit() {
        return this.limit;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getCursor() {
        return this.cursor;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsInput> optional = this.suggestedMerchants;
        com.apollographql.apollo.api.Optional<java.lang.Integer> optional2 = this.limit;
        com.apollographql.apollo.api.Optional<java.lang.String> optional3 = this.cursor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConsumerAgreementIncentivesInput(suggestedMerchants=");
        sb.append(optional);
        sb.append(", limit=");
        sb.append(optional2);
        sb.append(", cursor=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.suggestedMerchants.hashCode() * 31) + this.limit.hashCode()) * 31) + this.cursor.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementIncentivesInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementIncentivesInput consumerAgreementIncentivesInput = (com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementIncentivesInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.suggestedMerchants, consumerAgreementIncentivesInput.suggestedMerchants) && kotlin.jvm.internal.Intrinsics.areEqual(this.limit, consumerAgreementIncentivesInput.limit) && kotlin.jvm.internal.Intrinsics.areEqual(this.cursor, consumerAgreementIncentivesInput.cursor);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementIncentivesInput copy(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsInput> suggestedMerchants, com.apollographql.apollo.api.Optional<java.lang.Integer> limit, com.apollographql.apollo.api.Optional<java.lang.String> cursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suggestedMerchants, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(limit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "");
        return new com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementIncentivesInput(suggestedMerchants, limit, cursor);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.cursor;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> component2() {
        return this.limit;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsInput> component1() {
        return this.suggestedMerchants;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementIncentivesInput copy$default(com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementIncentivesInput consumerAgreementIncentivesInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = consumerAgreementIncentivesInput.suggestedMerchants;
        }
        if ((i & 2) != 0) {
            optional2 = consumerAgreementIncentivesInput.limit;
        }
        if ((i & 4) != 0) {
            optional3 = consumerAgreementIncentivesInput.cursor;
        }
        return consumerAgreementIncentivesInput.copy(optional, optional2, optional3);
    }

    public ConsumerAgreementIncentivesInput() {
        this(null, null, null, 7, null);
    }
}
