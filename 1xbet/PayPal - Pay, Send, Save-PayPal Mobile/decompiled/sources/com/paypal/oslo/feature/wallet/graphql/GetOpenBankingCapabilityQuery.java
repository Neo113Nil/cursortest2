package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/OpenBankingCapabilityInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/OpenBankingCapabilityInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/OpenBankingCapabilityInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/OpenBankingCapabilityInput;)Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/OpenBankingCapabilityInput;", "getInput", "Companion", "Data", "OpenBankingCapability", "Institution"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class GetOpenBankingCapabilityQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Data> {
    public static final java.lang.String OPERATION_ID = "095a8fe8adf967d6395061f86482039bc269869ed56f3ace49ae9e98e8321f34";
    public static final java.lang.String OPERATION_NAME = "GetOpenBankingCapability";
    private final com.paypal.oslo.api.graphql.schema.type.OpenBankingCapabilityInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Companion(null);
    public static final int $stable = 8;

    public GetOpenBankingCapabilityQuery(com.paypal.oslo.api.graphql.schema.type.OpenBankingCapabilityInput openBankingCapabilityInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openBankingCapabilityInput, "");
        this.input = openBankingCapabilityInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.OpenBankingCapabilityInput getInput() {
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
        com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingCapabilityQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.GetOpenBankingCapabilityQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.GetOpenBankingCapabilityQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$OpenBankingCapability;", "openBankingCapability", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$OpenBankingCapability;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$OpenBankingCapability;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$OpenBankingCapability;)Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$OpenBankingCapability;", "getOpenBankingCapability"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.OpenBankingCapability openBankingCapability;

        public Data(com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.OpenBankingCapability openBankingCapability) {
            this.openBankingCapability = openBankingCapability;
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.OpenBankingCapability getOpenBankingCapability() {
            return this.openBankingCapability;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.OpenBankingCapability openBankingCapability = this.openBankingCapability;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(openBankingCapability=");
            sb.append(openBankingCapability);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.OpenBankingCapability openBankingCapability = this.openBankingCapability;
            if (openBankingCapability == null) {
                return 0;
            }
            return openBankingCapability.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.openBankingCapability, ((com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Data) other).openBankingCapability);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Data copy(com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.OpenBankingCapability openBankingCapability) {
            return new com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Data(openBankingCapability);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.OpenBankingCapability getOpenBankingCapability() {
            return this.openBankingCapability;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Data copy$default(com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Data data, com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.OpenBankingCapability openBankingCapability, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                openBankingCapability = data.openBankingCapability;
            }
            return data.copy(openBankingCapability);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJr\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b/\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b2\u0010\u001aR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$OpenBankingCapability;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;", "aggregatorName", "", "bankName", "externalBankId", "Lcom/paypal/oslo/api/graphql/schema/type/BankIntegrationType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, "internalInstitutionId", "inlineLogoUrl", "primaryLogoUrl", "", "Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$Institution;", "institutions", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankIntegrationType;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/BankIntegrationType;", "component5", "component6", "()Ljava/lang/Object;", "component7", "component8", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankIntegrationType;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$OpenBankingCapability;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;", "getAggregatorName", "Ljava/lang/String;", "getBankName", "getExternalBankId", "Lcom/paypal/oslo/api/graphql/schema/type/BankIntegrationType;", "getIntegrationType", "getInternalInstitutionId", "Ljava/lang/Object;", "getInlineLogoUrl", "getPrimaryLogoUrl", "Ljava/util/List;", "getInstitutions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenBankingCapability {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.BankAggregatorName aggregatorName;
        private final java.lang.String bankName;
        private final java.lang.String externalBankId;
        private final java.lang.Object inlineLogoUrl;
        private final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Institution> institutions;
        private final com.paypal.oslo.api.graphql.schema.type.BankIntegrationType integrationType;
        private final java.lang.String internalInstitutionId;
        private final java.lang.Object primaryLogoUrl;

        public OpenBankingCapability(com.paypal.oslo.api.graphql.schema.type.BankAggregatorName bankAggregatorName, java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.BankIntegrationType bankIntegrationType, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Institution> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.aggregatorName = bankAggregatorName;
            this.bankName = str;
            this.externalBankId = str2;
            this.integrationType = bankIntegrationType;
            this.internalInstitutionId = str3;
            this.inlineLogoUrl = obj;
            this.primaryLogoUrl = obj2;
            this.institutions = list;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAggregatorName getAggregatorName() {
            return this.aggregatorName;
        }

        public final java.lang.String getBankName() {
            return this.bankName;
        }

        public final java.lang.String getExternalBankId() {
            return this.externalBankId;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankIntegrationType getIntegrationType() {
            return this.integrationType;
        }

        public final java.lang.String getInternalInstitutionId() {
            return this.internalInstitutionId;
        }

        public final java.lang.Object getInlineLogoUrl() {
            return this.inlineLogoUrl;
        }

        public final java.lang.Object getPrimaryLogoUrl() {
            return this.primaryLogoUrl;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Institution> getInstitutions() {
            return this.institutions;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BankAggregatorName bankAggregatorName = this.aggregatorName;
            java.lang.String str = this.bankName;
            java.lang.String str2 = this.externalBankId;
            com.paypal.oslo.api.graphql.schema.type.BankIntegrationType bankIntegrationType = this.integrationType;
            java.lang.String str3 = this.internalInstitutionId;
            java.lang.Object obj = this.inlineLogoUrl;
            java.lang.Object obj2 = this.primaryLogoUrl;
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Institution> list = this.institutions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenBankingCapability(aggregatorName=");
            sb.append(bankAggregatorName);
            sb.append(", bankName=");
            sb.append(str);
            sb.append(", externalBankId=");
            sb.append(str2);
            sb.append(", integrationType=");
            sb.append(bankIntegrationType);
            sb.append(", internalInstitutionId=");
            sb.append(str3);
            sb.append(", inlineLogoUrl=");
            sb.append(obj);
            sb.append(", primaryLogoUrl=");
            sb.append(obj2);
            sb.append(", institutions=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.BankAggregatorName bankAggregatorName = this.aggregatorName;
            int hashCode = bankAggregatorName == null ? 0 : bankAggregatorName.hashCode();
            int hashCode2 = this.bankName.hashCode();
            java.lang.String str = this.externalBankId;
            int hashCode3 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.api.graphql.schema.type.BankIntegrationType bankIntegrationType = this.integrationType;
            int hashCode4 = bankIntegrationType == null ? 0 : bankIntegrationType.hashCode();
            java.lang.String str2 = this.internalInstitutionId;
            int hashCode5 = str2 == null ? 0 : str2.hashCode();
            java.lang.Object obj = this.inlineLogoUrl;
            int hashCode6 = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.primaryLogoUrl;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.institutions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.OpenBankingCapability)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.OpenBankingCapability openBankingCapability = (com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.OpenBankingCapability) other;
            return this.aggregatorName == openBankingCapability.aggregatorName && kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, openBankingCapability.bankName) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalBankId, openBankingCapability.externalBankId) && this.integrationType == openBankingCapability.integrationType && kotlin.jvm.internal.Intrinsics.areEqual(this.internalInstitutionId, openBankingCapability.internalInstitutionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.inlineLogoUrl, openBankingCapability.inlineLogoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryLogoUrl, openBankingCapability.primaryLogoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.institutions, openBankingCapability.institutions);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.OpenBankingCapability copy(com.paypal.oslo.api.graphql.schema.type.BankAggregatorName aggregatorName, java.lang.String bankName, java.lang.String externalBankId, com.paypal.oslo.api.graphql.schema.type.BankIntegrationType integrationType, java.lang.String internalInstitutionId, java.lang.Object inlineLogoUrl, java.lang.Object primaryLogoUrl, java.util.List<com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Institution> institutions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(institutions, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.OpenBankingCapability(aggregatorName, bankName, externalBankId, integrationType, internalInstitutionId, inlineLogoUrl, primaryLogoUrl, institutions);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Institution> component8() {
            return this.institutions;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Object getPrimaryLogoUrl() {
            return this.primaryLogoUrl;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Object getInlineLogoUrl() {
            return this.inlineLogoUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getInternalInstitutionId() {
            return this.internalInstitutionId;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankIntegrationType getIntegrationType() {
            return this.integrationType;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getExternalBankId() {
            return this.externalBankId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getBankName() {
            return this.bankName;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAggregatorName getAggregatorName() {
            return this.aggregatorName;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0082\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b2\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b3\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b8\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$Institution;", "", "", "bankName", "externalBankId", "inlineLogoUrl", "primaryLogoUrl", "Lcom/paypal/oslo/api/graphql/schema/type/BankIntegrationType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, "internalInstitutionId", "institutionUrl", "", "rank", "Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;", "aggregatorName", "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/BankIntegrationType;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "component4", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/BankIntegrationType;", "component6", "component7", "component8", "()Ljava/lang/Integer;", "component9", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/BankIntegrationType;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;Ljava/lang/Object;)Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$Institution;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBankName", "getExternalBankId", "Ljava/lang/Object;", "getInlineLogoUrl", "getPrimaryLogoUrl", "Lcom/paypal/oslo/api/graphql/schema/type/BankIntegrationType;", "getIntegrationType", "getInternalInstitutionId", "getInstitutionUrl", "Ljava/lang/Integer;", "getRank", "Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;", "getAggregatorName", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Institution {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.BankAggregatorName aggregatorName;
        private final java.lang.String bankName;
        private final java.lang.Object countryCode;
        private final java.lang.String externalBankId;
        private final java.lang.Object inlineLogoUrl;
        private final java.lang.Object institutionUrl;
        private final com.paypal.oslo.api.graphql.schema.type.BankIntegrationType integrationType;
        private final java.lang.String internalInstitutionId;
        private final java.lang.Object primaryLogoUrl;
        private final java.lang.Integer rank;

        public Institution(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.Object obj2, com.paypal.oslo.api.graphql.schema.type.BankIntegrationType bankIntegrationType, java.lang.String str3, java.lang.Object obj3, java.lang.Integer num, com.paypal.oslo.api.graphql.schema.type.BankAggregatorName bankAggregatorName, java.lang.Object obj4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj4, "");
            this.bankName = str;
            this.externalBankId = str2;
            this.inlineLogoUrl = obj;
            this.primaryLogoUrl = obj2;
            this.integrationType = bankIntegrationType;
            this.internalInstitutionId = str3;
            this.institutionUrl = obj3;
            this.rank = num;
            this.aggregatorName = bankAggregatorName;
            this.countryCode = obj4;
        }

        public final java.lang.String getBankName() {
            return this.bankName;
        }

        public final java.lang.String getExternalBankId() {
            return this.externalBankId;
        }

        public final java.lang.Object getInlineLogoUrl() {
            return this.inlineLogoUrl;
        }

        public final java.lang.Object getPrimaryLogoUrl() {
            return this.primaryLogoUrl;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankIntegrationType getIntegrationType() {
            return this.integrationType;
        }

        public final java.lang.String getInternalInstitutionId() {
            return this.internalInstitutionId;
        }

        public final java.lang.Object getInstitutionUrl() {
            return this.institutionUrl;
        }

        public final java.lang.Integer getRank() {
            return this.rank;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAggregatorName getAggregatorName() {
            return this.aggregatorName;
        }

        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.bankName;
            java.lang.String str2 = this.externalBankId;
            java.lang.Object obj = this.inlineLogoUrl;
            java.lang.Object obj2 = this.primaryLogoUrl;
            com.paypal.oslo.api.graphql.schema.type.BankIntegrationType bankIntegrationType = this.integrationType;
            java.lang.String str3 = this.internalInstitutionId;
            java.lang.Object obj3 = this.institutionUrl;
            java.lang.Integer num = this.rank;
            com.paypal.oslo.api.graphql.schema.type.BankAggregatorName bankAggregatorName = this.aggregatorName;
            java.lang.Object obj4 = this.countryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Institution(bankName=");
            sb.append(str);
            sb.append(", externalBankId=");
            sb.append(str2);
            sb.append(", inlineLogoUrl=");
            sb.append(obj);
            sb.append(", primaryLogoUrl=");
            sb.append(obj2);
            sb.append(", integrationType=");
            sb.append(bankIntegrationType);
            sb.append(", internalInstitutionId=");
            sb.append(str3);
            sb.append(", institutionUrl=");
            sb.append(obj3);
            sb.append(", rank=");
            sb.append(num);
            sb.append(", aggregatorName=");
            sb.append(bankAggregatorName);
            sb.append(", countryCode=");
            sb.append(obj4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.bankName.hashCode();
            int hashCode2 = this.externalBankId.hashCode();
            java.lang.Object obj = this.inlineLogoUrl;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.primaryLogoUrl;
            int hashCode4 = obj2 == null ? 0 : obj2.hashCode();
            com.paypal.oslo.api.graphql.schema.type.BankIntegrationType bankIntegrationType = this.integrationType;
            int hashCode5 = bankIntegrationType == null ? 0 : bankIntegrationType.hashCode();
            java.lang.String str = this.internalInstitutionId;
            int hashCode6 = str == null ? 0 : str.hashCode();
            java.lang.Object obj3 = this.institutionUrl;
            int hashCode7 = obj3 == null ? 0 : obj3.hashCode();
            java.lang.Integer num = this.rank;
            int hashCode8 = num == null ? 0 : num.hashCode();
            com.paypal.oslo.api.graphql.schema.type.BankAggregatorName bankAggregatorName = this.aggregatorName;
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (bankAggregatorName != null ? bankAggregatorName.hashCode() : 0)) * 31) + this.countryCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Institution)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Institution institution = (com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Institution) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.bankName, institution.bankName) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalBankId, institution.externalBankId) && kotlin.jvm.internal.Intrinsics.areEqual(this.inlineLogoUrl, institution.inlineLogoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryLogoUrl, institution.primaryLogoUrl) && this.integrationType == institution.integrationType && kotlin.jvm.internal.Intrinsics.areEqual(this.internalInstitutionId, institution.internalInstitutionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.institutionUrl, institution.institutionUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.rank, institution.rank) && this.aggregatorName == institution.aggregatorName && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, institution.countryCode);
        }

        public final com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Institution copy(java.lang.String bankName, java.lang.String externalBankId, java.lang.Object inlineLogoUrl, java.lang.Object primaryLogoUrl, com.paypal.oslo.api.graphql.schema.type.BankIntegrationType integrationType, java.lang.String internalInstitutionId, java.lang.Object institutionUrl, java.lang.Integer rank, com.paypal.oslo.api.graphql.schema.type.BankAggregatorName aggregatorName, java.lang.Object countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Institution(bankName, externalBankId, inlineLogoUrl, primaryLogoUrl, integrationType, internalInstitutionId, institutionUrl, rank, aggregatorName, countryCode);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAggregatorName getAggregatorName() {
            return this.aggregatorName;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Integer getRank() {
            return this.rank;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.Object getInstitutionUrl() {
            return this.institutionUrl;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getInternalInstitutionId() {
            return this.internalInstitutionId;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankIntegrationType getIntegrationType() {
            return this.integrationType;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getPrimaryLogoUrl() {
            return this.primaryLogoUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getInlineLogoUrl() {
            return this.inlineLogoUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getExternalBankId() {
            return this.externalBankId;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBankName() {
            return this.bankName;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetOpenBankingCapability($input: OpenBankingCapabilityInput!) { openBankingCapability(input: $input) { aggregatorName bankName externalBankId integrationType internalInstitutionId inlineLogoUrl primaryLogoUrl institutions { bankName externalBankId inlineLogoUrl primaryLogoUrl integrationType internalInstitutionId institutionUrl rank aggregatorName countryCode } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.OpenBankingCapabilityInput openBankingCapabilityInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetOpenBankingCapabilityQuery(input=");
        sb.append(openBankingCapabilityInput);
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
        return (other instanceof com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery) other).input);
    }

    public final com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery copy(com.paypal.oslo.api.graphql.schema.type.OpenBankingCapabilityInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.OpenBankingCapabilityInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery copy$default(com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery getOpenBankingCapabilityQuery, com.paypal.oslo.api.graphql.schema.type.OpenBankingCapabilityInput openBankingCapabilityInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            openBankingCapabilityInput = getOpenBankingCapabilityQuery.input;
        }
        return getOpenBankingCapabilityQuery.copy(openBankingCapabilityInput);
    }
}
