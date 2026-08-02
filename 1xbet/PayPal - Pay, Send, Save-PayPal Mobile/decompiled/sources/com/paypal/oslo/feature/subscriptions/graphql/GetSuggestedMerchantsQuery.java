package com.paypal.oslo.feature.subscriptions.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007*+,-./)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementIncentivesInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementIncentivesInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementIncentivesInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementIncentivesInput;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementIncentivesInput;", "getInput", "Companion", "Data", "ConsumerAgreementIncentives", "Page", "Item", "OnConsumerAgreementMerchant", com.paypal.oslo.feature.home.domain.model.SectionTypes.MERCHANT}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GetSuggestedMerchantsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "e0f0899ed56ccc2a3d26bb25ffd77f3cc416ecadb81ffae79c81a9262240c90e";
    public static final java.lang.String OPERATION_NAME = "GetSuggestedMerchants";
    private final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementIncentivesInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Companion(null);
    public static final int $stable = 8;

    public GetSuggestedMerchantsQuery(com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementIncentivesInput consumerAgreementIncentivesInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementIncentivesInput, "");
        this.input = consumerAgreementIncentivesInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementIncentivesInput getInput() {
        return this.input;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String id() {
        return OPERATION_ID;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String document() {
        return INSTANCE.getOPERATION_DOCUMENT();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        com.paypal.oslo.feature.subscriptions.graphql.adapter.GetSuggestedMerchantsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.subscriptions.graphql.adapter.GetSuggestedMerchantsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.subscriptions.graphql.selections.GetSuggestedMerchantsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$ConsumerAgreementIncentives;", "consumerAgreementIncentives", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$ConsumerAgreementIncentives;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$ConsumerAgreementIncentives;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$ConsumerAgreementIncentives;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$ConsumerAgreementIncentives;", "getConsumerAgreementIncentives"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.ConsumerAgreementIncentives consumerAgreementIncentives;

        public Data(com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.ConsumerAgreementIncentives consumerAgreementIncentives) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementIncentives, "");
            this.consumerAgreementIncentives = consumerAgreementIncentives;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.ConsumerAgreementIncentives getConsumerAgreementIncentives() {
            return this.consumerAgreementIncentives;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.ConsumerAgreementIncentives consumerAgreementIncentives = this.consumerAgreementIncentives;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(consumerAgreementIncentives=");
            sb.append(consumerAgreementIncentives);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.consumerAgreementIncentives.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.consumerAgreementIncentives, ((com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Data) other).consumerAgreementIncentives);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Data copy(com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.ConsumerAgreementIncentives consumerAgreementIncentives) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementIncentives, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Data(consumerAgreementIncentives);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.ConsumerAgreementIncentives getConsumerAgreementIncentives() {
            return this.consumerAgreementIncentives;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Data copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Data data, com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.ConsumerAgreementIncentives consumerAgreementIncentives, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                consumerAgreementIncentives = data.consumerAgreementIncentives;
            }
            return data.copy(consumerAgreementIncentives);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$ConsumerAgreementIncentives;", "", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Page;", "page", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Page;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Page;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Page;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$ConsumerAgreementIncentives;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Page;", "getPage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConsumerAgreementIncentives {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Page page;

        public ConsumerAgreementIncentives(com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Page page) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            this.page = page;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Page getPage() {
            return this.page;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Page page = this.page;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConsumerAgreementIncentives(page=");
            sb.append(page);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.page.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.ConsumerAgreementIncentives) && kotlin.jvm.internal.Intrinsics.areEqual(this.page, ((com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.ConsumerAgreementIncentives) other).page);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.ConsumerAgreementIncentives copy(com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Page page) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.ConsumerAgreementIncentives(page);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Page getPage() {
            return this.page;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.ConsumerAgreementIncentives copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.ConsumerAgreementIncentives consumerAgreementIncentives, com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Page page, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                page = consumerAgreementIncentives.page;
            }
            return consumerAgreementIncentives.copy(page);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Page;", "", "", "cursor", "", "hasNextPage", "", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Item;", "items", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;ZLjava/util/List;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Page;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCursor", "Z", "getHasNextPage", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Page {
        public static final int $stable = 8;
        private final java.lang.String cursor;
        private final boolean hasNextPage;
        private final java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Item> items;

        public Page(java.lang.String str, boolean z, java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.cursor = str;
            this.hasNextPage = z;
            this.items = list;
        }

        public final java.lang.String getCursor() {
            return this.cursor;
        }

        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cursor;
            boolean z = this.hasNextPage;
            java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Page(cursor=");
            sb.append(str);
            sb.append(", hasNextPage=");
            sb.append(z);
            sb.append(", items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.cursor;
            return ((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Boolean.hashCode(this.hasNextPage)) * 31) + this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Page)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Page page = (com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Page) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cursor, page.cursor) && this.hasNextPage == page.hasNextPage && kotlin.jvm.internal.Intrinsics.areEqual(this.items, page.items);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Page copy(java.lang.String cursor, boolean hasNextPage, java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Page(cursor, hasNextPage, items);
        }

        public final java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Item> component3() {
            return this.items;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCursor() {
            return this.cursor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Page copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Page page, java.lang.String str, boolean z, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = page.cursor;
            }
            if ((i & 2) != 0) {
                z = page.hasNextPage;
            }
            if ((i & 4) != 0) {
                list = page.items;
            }
            return page.copy(str, z, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Item;", "", "", "__typename", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$OnConsumerAgreementMerchant;", "onConsumerAgreementMerchant", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$OnConsumerAgreementMerchant;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$OnConsumerAgreementMerchant;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$OnConsumerAgreementMerchant;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$OnConsumerAgreementMerchant;", "getOnConsumerAgreementMerchant"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.OnConsumerAgreementMerchant onConsumerAgreementMerchant;

        public Item(java.lang.String str, com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.OnConsumerAgreementMerchant onConsumerAgreementMerchant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onConsumerAgreementMerchant = onConsumerAgreementMerchant;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.OnConsumerAgreementMerchant getOnConsumerAgreementMerchant() {
            return this.onConsumerAgreementMerchant;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.OnConsumerAgreementMerchant onConsumerAgreementMerchant = this.onConsumerAgreementMerchant;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(__typename=");
            sb.append(str);
            sb.append(", onConsumerAgreementMerchant=");
            sb.append(onConsumerAgreementMerchant);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.OnConsumerAgreementMerchant onConsumerAgreementMerchant = this.onConsumerAgreementMerchant;
            return (hashCode * 31) + (onConsumerAgreementMerchant == null ? 0 : onConsumerAgreementMerchant.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Item item = (com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, item.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onConsumerAgreementMerchant, item.onConsumerAgreementMerchant);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Item copy(java.lang.String __typename, com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.OnConsumerAgreementMerchant onConsumerAgreementMerchant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Item(__typename, onConsumerAgreementMerchant);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.OnConsumerAgreementMerchant getOnConsumerAgreementMerchant() {
            return this.onConsumerAgreementMerchant;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Item copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Item item, java.lang.String str, com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.OnConsumerAgreementMerchant onConsumerAgreementMerchant, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.__typename;
            }
            if ((i & 2) != 0) {
                onConsumerAgreementMerchant = item.onConsumerAgreementMerchant;
            }
            return item.copy(str, onConsumerAgreementMerchant);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$OnConsumerAgreementMerchant;", "", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Merchant;", "merchant", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Merchant;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Merchant;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Merchant;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$OnConsumerAgreementMerchant;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Merchant;", "getMerchant"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnConsumerAgreementMerchant {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Merchant merchant;

        public OnConsumerAgreementMerchant(com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Merchant merchant) {
            this.merchant = merchant;
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Merchant getMerchant() {
            return this.merchant;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Merchant merchant = this.merchant;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnConsumerAgreementMerchant(merchant=");
            sb.append(merchant);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Merchant merchant = this.merchant;
            if (merchant == null) {
                return 0;
            }
            return merchant.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.OnConsumerAgreementMerchant) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchant, ((com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.OnConsumerAgreementMerchant) other).merchant);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.OnConsumerAgreementMerchant copy(com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Merchant merchant) {
            return new com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.OnConsumerAgreementMerchant(merchant);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Merchant getMerchant() {
            return this.merchant;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.OnConsumerAgreementMerchant copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.OnConsumerAgreementMerchant onConsumerAgreementMerchant, com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Merchant merchant, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                merchant = onConsumerAgreementMerchant.merchant;
            }
            return onConsumerAgreementMerchant.copy(merchant);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ<\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Merchant;", "", "", "id", "name", "logoUrl", "websiteUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Merchant;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "Ljava/lang/Object;", "getLogoUrl", "getWebsiteUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Merchant {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final java.lang.Object logoUrl;
        private final java.lang.String name;
        private final java.lang.Object websiteUrl;

        public Merchant(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.Object obj2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.name = str2;
            this.logoUrl = obj;
            this.websiteUrl = obj2;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.Object getLogoUrl() {
            return this.logoUrl;
        }

        public final java.lang.Object getWebsiteUrl() {
            return this.websiteUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.Object obj = this.logoUrl;
            java.lang.Object obj2 = this.websiteUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Merchant(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", logoUrl=");
            sb.append(obj);
            sb.append(", websiteUrl=");
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.name.hashCode();
            java.lang.Object obj = this.logoUrl;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.websiteUrl;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (obj2 != null ? obj2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Merchant)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Merchant merchant = (com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Merchant) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, merchant.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, merchant.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, merchant.logoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.websiteUrl, merchant.websiteUrl);
        }

        public final com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Merchant copy(java.lang.String id, java.lang.String name2, java.lang.Object logoUrl, java.lang.Object websiteUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Merchant(id, name2, logoUrl, websiteUrl);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getWebsiteUrl() {
            return this.websiteUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getLogoUrl() {
            return this.logoUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Merchant copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Merchant merchant, java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                str = merchant.id;
            }
            if ((i & 2) != 0) {
                str2 = merchant.name;
            }
            if ((i & 4) != 0) {
                obj = merchant.logoUrl;
            }
            if ((i & 8) != 0) {
                obj2 = merchant.websiteUrl;
            }
            return merchant.copy(str, str2, obj, obj2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetSuggestedMerchants($input: ConsumerAgreementIncentivesInput!) { consumerAgreementIncentives(input: $input) { page { cursor hasNextPage items { __typename ... on ConsumerAgreementMerchant { merchant { id name logoUrl websiteUrl } } } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementIncentivesInput consumerAgreementIncentivesInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetSuggestedMerchantsQuery(input=");
        sb.append(consumerAgreementIncentivesInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.input.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery) other).input);
    }

    public final com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery copy(com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementIncentivesInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementIncentivesInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery copy$default(com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery getSuggestedMerchantsQuery, com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementIncentivesInput consumerAgreementIncentivesInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            consumerAgreementIncentivesInput = getSuggestedMerchantsQuery.input;
        }
        return getSuggestedMerchantsQuery.copy(consumerAgreementIncentivesInput);
    }
}
