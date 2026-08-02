package com.paypal.oslo.feature.searchandintelligence.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\t*+,-./01)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/AgenticCommerceItemVariantsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/AgenticCommerceItemVariantsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/AgenticCommerceItemVariantsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/AgenticCommerceItemVariantsInput;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/AgenticCommerceItemVariantsInput;", "getInput", "Companion", "Data", "AgenticCommerceItemVariant", "CommerceItem", "CurrentPrice", "ListPrice", "Store", "Details", androidx.constraintlayout.motion.widget.ViewTransition.CUSTOM_ATTRIBUTE}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GetCommerceItemVariantsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "ae560ca1928df3b499ca2ec308c15a6adf5d19b02f6852bc8df9813d0543d26f";
    public static final java.lang.String OPERATION_NAME = "GetCommerceItemVariants";
    private final com.paypal.oslo.api.graphql.schema.type.AgenticCommerceItemVariantsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Companion INSTANCE = new com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Companion(null);
    public static final int $stable = 8;

    public GetCommerceItemVariantsQuery(com.paypal.oslo.api.graphql.schema.type.AgenticCommerceItemVariantsInput agenticCommerceItemVariantsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agenticCommerceItemVariantsInput, "");
        this.input = agenticCommerceItemVariantsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AgenticCommerceItemVariantsInput getInput() {
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
        com.paypal.oslo.feature.searchandintelligence.graphql.adapter.GetCommerceItemVariantsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.searchandintelligence.graphql.adapter.GetCommerceItemVariantsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.searchandintelligence.graphql.selections.GetCommerceItemVariantsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$AgenticCommerceItemVariant;", "agenticCommerceItemVariants", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getAgenticCommerceItemVariants"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.AgenticCommerceItemVariant> agenticCommerceItemVariants;

        public Data(java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.AgenticCommerceItemVariant> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.agenticCommerceItemVariants = list;
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.AgenticCommerceItemVariant> getAgenticCommerceItemVariants() {
            return this.agenticCommerceItemVariants;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.AgenticCommerceItemVariant> list = this.agenticCommerceItemVariants;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(agenticCommerceItemVariants=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.agenticCommerceItemVariants.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.agenticCommerceItemVariants, ((com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Data) other).agenticCommerceItemVariants);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Data copy(java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.AgenticCommerceItemVariant> agenticCommerceItemVariants) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agenticCommerceItemVariants, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Data(agenticCommerceItemVariants);
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.AgenticCommerceItemVariant> component1() {
            return this.agenticCommerceItemVariants;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Data copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Data data, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = data.agenticCommerceItemVariants;
            }
            return data.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$AgenticCommerceItemVariant;", "", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$CommerceItem;", "commerceItem", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$Details;", "details", "", "promotionalMessage", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$CommerceItem;Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$Details;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$CommerceItem;", "component2", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$Details;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$CommerceItem;Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$Details;Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$AgenticCommerceItemVariant;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$CommerceItem;", "getCommerceItem", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$Details;", "getDetails", "Ljava/lang/String;", "getPromotionalMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AgenticCommerceItemVariant {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CommerceItem commerceItem;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Details details;
        private final java.lang.String promotionalMessage;

        public AgenticCommerceItemVariant(com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CommerceItem commerceItem, com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Details details, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commerceItem, "");
            this.commerceItem = commerceItem;
            this.details = details;
            this.promotionalMessage = str;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CommerceItem getCommerceItem() {
            return this.commerceItem;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Details getDetails() {
            return this.details;
        }

        public final java.lang.String getPromotionalMessage() {
            return this.promotionalMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CommerceItem commerceItem = this.commerceItem;
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Details details = this.details;
            java.lang.String str = this.promotionalMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AgenticCommerceItemVariant(commerceItem=");
            sb.append(commerceItem);
            sb.append(", details=");
            sb.append(details);
            sb.append(", promotionalMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.commerceItem.hashCode();
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Details details = this.details;
            int hashCode2 = details == null ? 0 : details.hashCode();
            java.lang.String str = this.promotionalMessage;
            return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.AgenticCommerceItemVariant)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.AgenticCommerceItemVariant agenticCommerceItemVariant = (com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.AgenticCommerceItemVariant) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.commerceItem, agenticCommerceItemVariant.commerceItem) && kotlin.jvm.internal.Intrinsics.areEqual(this.details, agenticCommerceItemVariant.details) && kotlin.jvm.internal.Intrinsics.areEqual(this.promotionalMessage, agenticCommerceItemVariant.promotionalMessage);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.AgenticCommerceItemVariant copy(com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CommerceItem commerceItem, com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Details details, java.lang.String promotionalMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commerceItem, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.AgenticCommerceItemVariant(commerceItem, details, promotionalMessage);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPromotionalMessage() {
            return this.promotionalMessage;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Details getDetails() {
            return this.details;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CommerceItem getCommerceItem() {
            return this.commerceItem;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.AgenticCommerceItemVariant copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.AgenticCommerceItemVariant agenticCommerceItemVariant, com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CommerceItem commerceItem, com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Details details, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                commerceItem = agenticCommerceItemVariant.commerceItem;
            }
            if ((i & 2) != 0) {
                details = agenticCommerceItemVariant.details;
            }
            if ((i & 4) != 0) {
                str = agenticCommerceItemVariant.promotionalMessage;
            }
            return agenticCommerceItemVariant.copy(commerceItem, details, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u008c\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u0019R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b6\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$CommerceItem;", "", "", "id", "name", "brand", "info", "primaryImageUrl", "", "secondaryImageUrls", "canonicalUrl", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$CurrentPrice;", "currentPrice", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$ListPrice;", "listPrice", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$Store;", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$CurrentPrice;Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$ListPrice;Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$Store;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Object;", "component6", "()Ljava/util/List;", "component7", "component8", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$CurrentPrice;", "component9", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$ListPrice;", "component10", "()Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$Store;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$CurrentPrice;Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$ListPrice;Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$Store;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$CommerceItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getBrand", "getInfo", "Ljava/lang/Object;", "getPrimaryImageUrl", "Ljava/util/List;", "getSecondaryImageUrls", "getCanonicalUrl", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$CurrentPrice;", "getCurrentPrice", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$ListPrice;", "getListPrice", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$Store;", "getStore"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CommerceItem {
        public static final int $stable = 8;
        private final java.lang.String brand;
        private final java.lang.Object canonicalUrl;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CurrentPrice currentPrice;
        private final java.lang.String id;
        private final java.lang.String info;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.ListPrice listPrice;
        private final java.lang.String name;
        private final java.lang.Object primaryImageUrl;
        private final java.util.List<java.lang.Object> secondaryImageUrls;
        private final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Store store;

        public CommerceItem(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Object obj, java.util.List<? extends java.lang.Object> list, java.lang.Object obj2, com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CurrentPrice currentPrice, com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.ListPrice listPrice, com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Store store) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
            this.name = str2;
            this.brand = str3;
            this.info = str4;
            this.primaryImageUrl = obj;
            this.secondaryImageUrls = list;
            this.canonicalUrl = obj2;
            this.currentPrice = currentPrice;
            this.listPrice = listPrice;
            this.store = store;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getBrand() {
            return this.brand;
        }

        public final java.lang.String getInfo() {
            return this.info;
        }

        public final java.lang.Object getPrimaryImageUrl() {
            return this.primaryImageUrl;
        }

        public final java.util.List<java.lang.Object> getSecondaryImageUrls() {
            return this.secondaryImageUrls;
        }

        public final java.lang.Object getCanonicalUrl() {
            return this.canonicalUrl;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CurrentPrice getCurrentPrice() {
            return this.currentPrice;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.ListPrice getListPrice() {
            return this.listPrice;
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Store getStore() {
            return this.store;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.String str3 = this.brand;
            java.lang.String str4 = this.info;
            java.lang.Object obj = this.primaryImageUrl;
            java.util.List<java.lang.Object> list = this.secondaryImageUrls;
            java.lang.Object obj2 = this.canonicalUrl;
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CurrentPrice currentPrice = this.currentPrice;
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.ListPrice listPrice = this.listPrice;
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Store store = this.store;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CommerceItem(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", brand=");
            sb.append(str3);
            sb.append(", info=");
            sb.append(str4);
            sb.append(", primaryImageUrl=");
            sb.append(obj);
            sb.append(", secondaryImageUrls=");
            sb.append(list);
            sb.append(", canonicalUrl=");
            sb.append(obj2);
            sb.append(", currentPrice=");
            sb.append(currentPrice);
            sb.append(", listPrice=");
            sb.append(listPrice);
            sb.append(", store=");
            sb.append(store);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.String str = this.name;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.brand;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.info;
            int hashCode4 = str3 == null ? 0 : str3.hashCode();
            java.lang.Object obj = this.primaryImageUrl;
            int hashCode5 = obj == null ? 0 : obj.hashCode();
            java.util.List<java.lang.Object> list = this.secondaryImageUrls;
            int hashCode6 = list == null ? 0 : list.hashCode();
            java.lang.Object obj2 = this.canonicalUrl;
            int hashCode7 = obj2 == null ? 0 : obj2.hashCode();
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CurrentPrice currentPrice = this.currentPrice;
            int hashCode8 = currentPrice == null ? 0 : currentPrice.hashCode();
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.ListPrice listPrice = this.listPrice;
            int hashCode9 = listPrice == null ? 0 : listPrice.hashCode();
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Store store = this.store;
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (store != null ? store.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CommerceItem)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CommerceItem commerceItem = (com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CommerceItem) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, commerceItem.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, commerceItem.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.brand, commerceItem.brand) && kotlin.jvm.internal.Intrinsics.areEqual(this.info, commerceItem.info) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryImageUrl, commerceItem.primaryImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryImageUrls, commerceItem.secondaryImageUrls) && kotlin.jvm.internal.Intrinsics.areEqual(this.canonicalUrl, commerceItem.canonicalUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentPrice, commerceItem.currentPrice) && kotlin.jvm.internal.Intrinsics.areEqual(this.listPrice, commerceItem.listPrice) && kotlin.jvm.internal.Intrinsics.areEqual(this.store, commerceItem.store);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CommerceItem copy(java.lang.String id, java.lang.String name2, java.lang.String brand, java.lang.String info, java.lang.Object primaryImageUrl, java.util.List<? extends java.lang.Object> secondaryImageUrls, java.lang.Object canonicalUrl, com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CurrentPrice currentPrice, com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.ListPrice listPrice, com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Store store) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CommerceItem(id, name2, brand, info, primaryImageUrl, secondaryImageUrls, canonicalUrl, currentPrice, listPrice, store);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.ListPrice getListPrice() {
            return this.listPrice;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CurrentPrice getCurrentPrice() {
            return this.currentPrice;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Object getCanonicalUrl() {
            return this.canonicalUrl;
        }

        public final java.util.List<java.lang.Object> component6() {
            return this.secondaryImageUrls;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getPrimaryImageUrl() {
            return this.primaryImageUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getInfo() {
            return this.info;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getBrand() {
            return this.brand;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Store getStore() {
            return this.store;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$CurrentPrice;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$CurrentPrice;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CurrentPrice {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public CurrentPrice(java.lang.Object obj, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currencyCode = obj;
            this.value = str;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrentPrice(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CurrentPrice)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CurrentPrice currentPrice = (com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CurrentPrice) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, currentPrice.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, currentPrice.value);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CurrentPrice copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CurrentPrice(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CurrentPrice copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CurrentPrice currentPrice, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = currentPrice.currencyCode;
            }
            if ((i & 2) != 0) {
                str = currentPrice.value;
            }
            return currentPrice.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$ListPrice;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$ListPrice;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ListPrice {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public ListPrice(java.lang.Object obj, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currencyCode = obj;
            this.value = str;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ListPrice(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.ListPrice)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.ListPrice listPrice = (com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.ListPrice) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, listPrice.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, listPrice.value);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.ListPrice copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.ListPrice(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.ListPrice copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.ListPrice listPrice, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = listPrice.currencyCode;
            }
            if ((i & 2) != 0) {
                str = listPrice.value;
            }
            return listPrice.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$Store;", "", "", "id", "name", "logoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$Store;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "Ljava/lang/Object;", "getLogoUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Store {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final java.lang.Object logoUrl;
        private final java.lang.String name;

        public Store(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.name = str2;
            this.logoUrl = obj;
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

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            java.lang.Object obj = this.logoUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Store(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", logoUrl=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.name.hashCode();
            java.lang.Object obj = this.logoUrl;
            return (((hashCode * 31) + hashCode2) * 31) + (obj == null ? 0 : obj.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Store)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Store store = (com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Store) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, store.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, store.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, store.logoUrl);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Store copy(java.lang.String id, java.lang.String name2, java.lang.Object logoUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Store(id, name2, logoUrl);
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

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Store copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Store store, java.lang.String str, java.lang.String str2, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = store.id;
            }
            if ((i & 2) != 0) {
                str2 = store.name;
            }
            if ((i & 4) != 0) {
                obj = store.logoUrl;
            }
            return store.copy(str, str2, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JF\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$Details;", "", "", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "flavor", io.ktor.http.ContentDisposition.Parameters.Size, "", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$CustomAttribute;", "customAttributes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$Details;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getColor", "getFlavor", "getSize", "Ljava/util/List;", "getCustomAttributes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Details {
        public static final int $stable = 8;
        private final java.lang.String color;
        private final java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CustomAttribute> customAttributes;
        private final java.lang.String flavor;
        private final java.lang.String size;

        public Details(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CustomAttribute> list) {
            this.color = str;
            this.flavor = str2;
            this.size = str3;
            this.customAttributes = list;
        }

        public final java.lang.String getColor() {
            return this.color;
        }

        public final java.lang.String getFlavor() {
            return this.flavor;
        }

        public final java.lang.String getSize() {
            return this.size;
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CustomAttribute> getCustomAttributes() {
            return this.customAttributes;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.color;
            java.lang.String str2 = this.flavor;
            java.lang.String str3 = this.size;
            java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CustomAttribute> list = this.customAttributes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Details(color=");
            sb.append(str);
            sb.append(", flavor=");
            sb.append(str2);
            sb.append(", size=");
            sb.append(str3);
            sb.append(", customAttributes=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.color;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.flavor;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.size;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CustomAttribute> list = this.customAttributes;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Details)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Details details = (com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Details) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.color, details.color) && kotlin.jvm.internal.Intrinsics.areEqual(this.flavor, details.flavor) && kotlin.jvm.internal.Intrinsics.areEqual(this.size, details.size) && kotlin.jvm.internal.Intrinsics.areEqual(this.customAttributes, details.customAttributes);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Details copy(java.lang.String color, java.lang.String flavor, java.lang.String size, java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CustomAttribute> customAttributes) {
            return new com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Details(color, flavor, size, customAttributes);
        }

        public final java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CustomAttribute> component4() {
            return this.customAttributes;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSize() {
            return this.size;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFlavor() {
            return this.flavor;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getColor() {
            return this.color;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Details copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Details details, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = details.color;
            }
            if ((i & 2) != 0) {
                str2 = details.flavor;
            }
            if ((i & 4) != 0) {
                str3 = details.size;
            }
            if ((i & 8) != 0) {
                list = details.customAttributes;
            }
            return details.copy(str, str2, str3, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$CustomAttribute;", "", "", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$CustomAttribute;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CustomAttribute {
        public static final int $stable = 0;
        private final java.lang.String name;
        private final java.lang.String value;

        public CustomAttribute(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.name = str;
            this.value = str2;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.String str2 = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomAttribute(name=");
            sb.append(str);
            sb.append(", value=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.name.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CustomAttribute)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CustomAttribute customAttribute = (com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CustomAttribute) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, customAttribute.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, customAttribute.value);
        }

        public final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CustomAttribute copy(java.lang.String name2, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CustomAttribute(name2, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CustomAttribute copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.CustomAttribute customAttribute, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = customAttribute.name;
            }
            if ((i & 2) != 0) {
                str2 = customAttribute.value;
            }
            return customAttribute.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetCommerceItemVariants($input: AgenticCommerceItemVariantsInput!) { agenticCommerceItemVariants(input: $input) { commerceItem { id name brand info primaryImageUrl secondaryImageUrls canonicalUrl currentPrice { currencyCode value } listPrice { currencyCode value } store { id name logoUrl } } details { color flavor size customAttributes { name value } } promotionalMessage } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.AgenticCommerceItemVariantsInput agenticCommerceItemVariantsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetCommerceItemVariantsQuery(input=");
        sb.append(agenticCommerceItemVariantsInput);
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
        return (other instanceof com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery) other).input);
    }

    public final com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery copy(com.paypal.oslo.api.graphql.schema.type.AgenticCommerceItemVariantsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AgenticCommerceItemVariantsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery copy$default(com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery getCommerceItemVariantsQuery, com.paypal.oslo.api.graphql.schema.type.AgenticCommerceItemVariantsInput agenticCommerceItemVariantsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            agenticCommerceItemVariantsInput = getCommerceItemVariantsQuery.input;
        }
        return getCommerceItemVariantsQuery.copy(agenticCommerceItemVariantsInput);
    }
}
