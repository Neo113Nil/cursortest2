package com.paypal.oslo.feature.balance.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0015*+,-./0123456789:;<=)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/DepositOptionsInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DepositOptionsInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DepositOptionsInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DepositOptionsInput;)Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DepositOptionsInput;", "getInput", "Companion", "Data", "DepositOptions", "Option", "Plan", "FundingSource", "Instrument", "OnBankAccount", "BankAccountStatus", "BankAccountIssuer", "BankAccountInstitutionImage", "OnCard", "CardStatus", "CardIssuer", "CardArt", "PrimaryImage", "CardInstitutionImage", "PaymentDelivery", "Limit", "Amount", "OnMoney"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetDepositOptionsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "3985410b07ac6a7c983a93e5a766b04189f4a6dacd6e587de60cfd6253887e57";
    public static final java.lang.String OPERATION_NAME = "GetDepositOptions";
    private final com.paypal.oslo.api.graphql.schema.type.DepositOptionsInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Companion INSTANCE = new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Companion(null);
    public static final int $stable = 8;

    public GetDepositOptionsQuery(com.paypal.oslo.api.graphql.schema.type.DepositOptionsInput depositOptionsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositOptionsInput, "");
        this.input = depositOptionsInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DepositOptionsInput getInput() {
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
        return "GetDepositOptions";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        com.paypal.oslo.feature.balance.graphql.adapter.GetDepositOptionsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.balance.graphql.adapter.GetDepositOptionsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.balance.graphql.selections.GetDepositOptionsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$DepositOptions;", "depositOptions", "<init>", "(Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$DepositOptions;)V", "component1", "()Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$DepositOptions;", "copy", "(Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$DepositOptions;)Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$DepositOptions;", "getDepositOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.DepositOptions depositOptions;

        public Data(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.DepositOptions depositOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositOptions, "");
            this.depositOptions = depositOptions;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.DepositOptions getDepositOptions() {
            return this.depositOptions;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.DepositOptions depositOptions = this.depositOptions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(depositOptions=");
            sb.append(depositOptions);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.depositOptions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.depositOptions, ((com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Data) other).depositOptions);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Data copy(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.DepositOptions depositOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositOptions, "");
            return new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Data(depositOptions);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.DepositOptions getDepositOptions() {
            return this.depositOptions;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Data copy$default(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Data data, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.DepositOptions depositOptions, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                depositOptions = data.depositOptions;
            }
            return data.copy(depositOptions);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$DepositOptions;", "", "", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Option;", "options", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$DepositOptions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DepositOptions {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Option> options;

        public DepositOptions(java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Option> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.options = list;
        }

        public final java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Option> getOptions() {
            return this.options;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Option> list = this.options;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DepositOptions(options=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.options.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.DepositOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.options, ((com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.DepositOptions) other).options);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.DepositOptions copy(java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Option> options) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
            return new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.DepositOptions(options);
        }

        public final java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Option> component1() {
            return this.options;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.DepositOptions copy$default(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.DepositOptions depositOptions, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = depositOptions.options;
            }
            return depositOptions.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012JH\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b$\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Option;", "", "", "id", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Plan;", "plan", "", "Lcom/paypal/oslo/api/graphql/schema/type/TransferTag;", "tags", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Limit;", "limits", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Plan;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Plan;", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Plan;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Option;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Plan;", "getPlan", "Ljava/util/List;", "getTags", "getLimits"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Option {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Limit> limits;
        private final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Plan plan;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferTag> tags;

        /* JADX WARN: Multi-variable type inference failed */
        public Option(java.lang.String str, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Plan plan, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.TransferTag> list, java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Limit> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plan, "");
            this.id = str;
            this.plan = plan;
            this.tags = list;
            this.limits = list2;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Plan getPlan() {
            return this.plan;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferTag> getTags() {
            return this.tags;
        }

        public final java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Limit> getLimits() {
            return this.limits;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Plan plan = this.plan;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferTag> list = this.tags;
            java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Limit> list2 = this.limits;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Option(id=");
            sb.append(str);
            sb.append(", plan=");
            sb.append(plan);
            sb.append(", tags=");
            sb.append(list);
            sb.append(", limits=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.plan.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferTag> list = this.tags;
            int hashCode3 = list == null ? 0 : list.hashCode();
            java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Limit> list2 = this.limits;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list2 != null ? list2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Option)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Option option = (com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Option) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, option.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.plan, option.plan) && kotlin.jvm.internal.Intrinsics.areEqual(this.tags, option.tags) && kotlin.jvm.internal.Intrinsics.areEqual(this.limits, option.limits);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Option copy(java.lang.String id, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Plan plan, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.TransferTag> tags, java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Limit> limits) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plan, "");
            return new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Option(id, plan, tags, limits);
        }

        public final java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Limit> component4() {
            return this.limits;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferTag> component3() {
            return this.tags;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Plan getPlan() {
            return this.plan;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Option copy$default(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Option option, java.lang.String str, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Plan plan, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = option.id;
            }
            if ((i & 2) != 0) {
                plan = option.plan;
            }
            if ((i & 4) != 0) {
                list = option.tags;
            }
            if ((i & 8) != 0) {
                list2 = option.limits;
            }
            return option.copy(str, plan, list, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u0003\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Plan;", "", "", "isDefault", "", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$FundingSource;", "fundingSources", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$PaymentDelivery;", "paymentDelivery", "<init>", "(ZLjava/util/List;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$PaymentDelivery;)V", "component1", "()Z", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$PaymentDelivery;", "copy", "(ZLjava/util/List;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$PaymentDelivery;)Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Plan;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Ljava/util/List;", "getFundingSources", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$PaymentDelivery;", "getPaymentDelivery"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Plan {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.FundingSource> fundingSources;
        private final boolean isDefault;
        private final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PaymentDelivery paymentDelivery;

        public Plan(boolean z, java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.FundingSource> list, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PaymentDelivery paymentDelivery) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentDelivery, "");
            this.isDefault = z;
            this.fundingSources = list;
            this.paymentDelivery = paymentDelivery;
        }

        public final boolean isDefault() {
            return this.isDefault;
        }

        public final java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.FundingSource> getFundingSources() {
            return this.fundingSources;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PaymentDelivery getPaymentDelivery() {
            return this.paymentDelivery;
        }

        public final java.lang.String toString() {
            boolean z = this.isDefault;
            java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.FundingSource> list = this.fundingSources;
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PaymentDelivery paymentDelivery = this.paymentDelivery;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Plan(isDefault=");
            sb.append(z);
            sb.append(", fundingSources=");
            sb.append(list);
            sb.append(", paymentDelivery=");
            sb.append(paymentDelivery);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((java.lang.Boolean.hashCode(this.isDefault) * 31) + this.fundingSources.hashCode()) * 31) + this.paymentDelivery.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Plan)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Plan plan = (com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Plan) other;
            return this.isDefault == plan.isDefault && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSources, plan.fundingSources) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentDelivery, plan.paymentDelivery);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Plan copy(boolean isDefault, java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.FundingSource> fundingSources, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PaymentDelivery paymentDelivery) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSources, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentDelivery, "");
            return new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Plan(isDefault, fundingSources, paymentDelivery);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PaymentDelivery getPaymentDelivery() {
            return this.paymentDelivery;
        }

        public final java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.FundingSource> component2() {
            return this.fundingSources;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsDefault() {
            return this.isDefault;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Plan copy$default(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Plan plan, boolean z, java.util.List list, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PaymentDelivery paymentDelivery, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = plan.isDefault;
            }
            if ((i & 2) != 0) {
                list = plan.fundingSources;
            }
            if ((i & 4) != 0) {
                paymentDelivery = plan.paymentDelivery;
            }
            return plan.copy(z, list, paymentDelivery);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$FundingSource;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanFundingSourceType;", "type", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Instrument;", "instrument", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanFundingSourceType;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Instrument;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanFundingSourceType;", "component2", "()Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Instrument;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanFundingSourceType;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Instrument;)Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$FundingSource;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanFundingSourceType;", "getType", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Instrument;", "getInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundingSource {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Instrument instrument;
        private final com.paypal.oslo.api.graphql.schema.type.PaymentPlanFundingSourceType type;

        public FundingSource(com.paypal.oslo.api.graphql.schema.type.PaymentPlanFundingSourceType paymentPlanFundingSourceType, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Instrument instrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentPlanFundingSourceType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrument, "");
            this.type = paymentPlanFundingSourceType;
            this.instrument = instrument;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentPlanFundingSourceType getType() {
            return this.type;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Instrument getInstrument() {
            return this.instrument;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.PaymentPlanFundingSourceType paymentPlanFundingSourceType = this.type;
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Instrument instrument = this.instrument;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingSource(type=");
            sb.append(paymentPlanFundingSourceType);
            sb.append(", instrument=");
            sb.append(instrument);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.type.hashCode() * 31) + this.instrument.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.FundingSource)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.FundingSource fundingSource = (com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.FundingSource) other;
            return this.type == fundingSource.type && kotlin.jvm.internal.Intrinsics.areEqual(this.instrument, fundingSource.instrument);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.FundingSource copy(com.paypal.oslo.api.graphql.schema.type.PaymentPlanFundingSourceType type, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Instrument instrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrument, "");
            return new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.FundingSource(type, instrument);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Instrument getInstrument() {
            return this.instrument;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PaymentPlanFundingSourceType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.FundingSource copy$default(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.FundingSource fundingSource, com.paypal.oslo.api.graphql.schema.type.PaymentPlanFundingSourceType paymentPlanFundingSourceType, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Instrument instrument, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentPlanFundingSourceType = fundingSource.type;
            }
            if ((i & 2) != 0) {
                instrument = fundingSource.instrument;
            }
            return fundingSource.copy(paymentPlanFundingSourceType, instrument);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Instrument;", "", "", "__typename", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$OnBankAccount;", "onBankAccount", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$OnCard;", "onCard", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$OnBankAccount;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$OnCard;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$OnBankAccount;", "component3", "()Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$OnCard;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$OnBankAccount;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$OnCard;)Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Instrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$OnBankAccount;", "getOnBankAccount", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$OnCard;", "getOnCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Instrument {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnBankAccount onBankAccount;
        private final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnCard onCard;

        public Instrument(java.lang.String str, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnBankAccount onBankAccount, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnCard onCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onBankAccount = onBankAccount;
            this.onCard = onCard;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnBankAccount getOnBankAccount() {
            return this.onBankAccount;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnCard getOnCard() {
            return this.onCard;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnBankAccount onBankAccount = this.onBankAccount;
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnCard onCard = this.onCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Instrument(__typename=");
            sb.append(str);
            sb.append(", onBankAccount=");
            sb.append(onBankAccount);
            sb.append(", onCard=");
            sb.append(onCard);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnBankAccount onBankAccount = this.onBankAccount;
            int hashCode2 = onBankAccount == null ? 0 : onBankAccount.hashCode();
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnCard onCard = this.onCard;
            return (((hashCode * 31) + hashCode2) * 31) + (onCard != null ? onCard.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Instrument)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Instrument instrument = (com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Instrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, instrument.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBankAccount, instrument.onBankAccount) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCard, instrument.onCard);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Instrument copy(java.lang.String __typename, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnBankAccount onBankAccount, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnCard onCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Instrument(__typename, onBankAccount, onCard);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnCard getOnCard() {
            return this.onCard;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnBankAccount getOnBankAccount() {
            return this.onBankAccount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Instrument copy$default(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Instrument instrument, java.lang.String str, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnBankAccount onBankAccount, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnCard onCard, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = instrument.__typename;
            }
            if ((i & 2) != 0) {
                onBankAccount = instrument.onBankAccount;
            }
            if ((i & 4) != 0) {
                onCard = instrument.onCard;
            }
            return instrument.copy(str, onBankAccount, onCard);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJb\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u001aR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$OnBankAccount;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "type", "lastNChars", "nickname", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$BankAccountStatus;", "bankAccountStatus", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$BankAccountIssuer;", "bankAccountIssuer", "", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$BankAccountInstitutionImage;", "bankAccountInstitutionImages", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$BankAccountStatus;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$BankAccountIssuer;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$BankAccountStatus;", "component6", "()Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$BankAccountIssuer;", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$BankAccountStatus;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$BankAccountIssuer;Ljava/util/List;)Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$OnBankAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "getType", "getLastNChars", "getNickname", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$BankAccountStatus;", "getBankAccountStatus", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$BankAccountIssuer;", "getBankAccountIssuer", "Ljava/util/List;", "getBankAccountInstitutionImages"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBankAccount {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage> bankAccountInstitutionImages;
        private final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountIssuer bankAccountIssuer;
        private final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountStatus bankAccountStatus;
        private final java.lang.String id;
        private final java.lang.String lastNChars;
        private final java.lang.String nickname;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountType type;

        public OnBankAccount(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountStatus bankAccountStatus, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountIssuer bankAccountIssuer, java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountIssuer, "");
            this.id = str;
            this.type = bankAccountType;
            this.lastNChars = str2;
            this.nickname = str3;
            this.bankAccountStatus = bankAccountStatus;
            this.bankAccountIssuer = bankAccountIssuer;
            this.bankAccountInstitutionImages = list;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final java.lang.String getNickname() {
            return this.nickname;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountStatus getBankAccountStatus() {
            return this.bankAccountStatus;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountIssuer getBankAccountIssuer() {
            return this.bankAccountIssuer;
        }

        public final java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage> getBankAccountInstitutionImages() {
            return this.bankAccountInstitutionImages;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType = this.type;
            java.lang.String str2 = this.lastNChars;
            java.lang.String str3 = this.nickname;
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountStatus bankAccountStatus = this.bankAccountStatus;
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountIssuer bankAccountIssuer = this.bankAccountIssuer;
            java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage> list = this.bankAccountInstitutionImages;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBankAccount(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(bankAccountType);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", nickname=");
            sb.append(str3);
            sb.append(", bankAccountStatus=");
            sb.append(bankAccountStatus);
            sb.append(", bankAccountIssuer=");
            sb.append(bankAccountIssuer);
            sb.append(", bankAccountInstitutionImages=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.type.hashCode();
            int hashCode3 = this.lastNChars.hashCode();
            java.lang.String str = this.nickname;
            int hashCode4 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountStatus bankAccountStatus = this.bankAccountStatus;
            int hashCode5 = bankAccountStatus == null ? 0 : bankAccountStatus.hashCode();
            int hashCode6 = this.bankAccountIssuer.hashCode();
            java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage> list = this.bankAccountInstitutionImages;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnBankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnBankAccount onBankAccount = (com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnBankAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onBankAccount.id) && this.type == onBankAccount.type && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, onBankAccount.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.nickname, onBankAccount.nickname) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountStatus, onBankAccount.bankAccountStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountIssuer, onBankAccount.bankAccountIssuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountInstitutionImages, onBankAccount.bankAccountInstitutionImages);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnBankAccount copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.BankAccountType type, java.lang.String lastNChars, java.lang.String nickname, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountStatus bankAccountStatus, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountIssuer bankAccountIssuer, java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage> bankAccountInstitutionImages) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountIssuer, "");
            return new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnBankAccount(id, type, lastNChars, nickname, bankAccountStatus, bankAccountIssuer, bankAccountInstitutionImages);
        }

        public final java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage> component7() {
            return this.bankAccountInstitutionImages;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountIssuer getBankAccountIssuer() {
            return this.bankAccountIssuer;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountStatus getBankAccountStatus() {
            return this.bankAccountStatus;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getNickname() {
            return this.nickname;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnBankAccount copy$default(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnBankAccount onBankAccount, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountStatus bankAccountStatus, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountIssuer bankAccountIssuer, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBankAccount.id;
            }
            if ((i & 2) != 0) {
                bankAccountType = onBankAccount.type;
            }
            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType2 = bankAccountType;
            if ((i & 4) != 0) {
                str2 = onBankAccount.lastNChars;
            }
            java.lang.String str4 = str2;
            if ((i & 8) != 0) {
                str3 = onBankAccount.nickname;
            }
            java.lang.String str5 = str3;
            if ((i & 16) != 0) {
                bankAccountStatus = onBankAccount.bankAccountStatus;
            }
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountStatus bankAccountStatus2 = bankAccountStatus;
            if ((i & 32) != 0) {
                bankAccountIssuer = onBankAccount.bankAccountIssuer;
            }
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountIssuer bankAccountIssuer2 = bankAccountIssuer;
            if ((i & 64) != 0) {
                list = onBankAccount.bankAccountInstitutionImages;
            }
            return onBankAccount.copy(str, bankAccountType2, str4, str5, bankAccountStatus2, bankAccountIssuer2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$BankAccountStatus;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountStatus;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountStatus;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BankAccountStatus;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountStatus;)Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$BankAccountStatus;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountStatus;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BankAccountStatus {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.BankAccountStatus value;

        public BankAccountStatus(com.paypal.oslo.api.graphql.schema.type.BankAccountStatus bankAccountStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountStatus, "");
            this.value = bankAccountStatus;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BankAccountStatus getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BankAccountStatus bankAccountStatus = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BankAccountStatus(value=");
            sb.append(bankAccountStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountStatus) && this.value == ((com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountStatus) other).value;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountStatus copy(com.paypal.oslo.api.graphql.schema.type.BankAccountStatus value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountStatus(value);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BankAccountStatus getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountStatus copy$default(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountStatus bankAccountStatus, com.paypal.oslo.api.graphql.schema.type.BankAccountStatus bankAccountStatus2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bankAccountStatus2 = bankAccountStatus.value;
            }
            return bankAccountStatus.copy(bankAccountStatus2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$BankAccountIssuer;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$BankAccountIssuer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BankAccountIssuer {
        public static final int $stable = 0;
        private final java.lang.String name;

        public BankAccountIssuer(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BankAccountIssuer(name=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountIssuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountIssuer) other).name);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountIssuer copy(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountIssuer(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountIssuer copy$default(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountIssuer bankAccountIssuer, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = bankAccountIssuer.name;
            }
            return bankAccountIssuer.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$BankAccountInstitutionImage;", "", "url", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$BankAccountInstitutionImage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BankAccountInstitutionImage {
        public static final int $stable = 8;
        private final java.lang.Object url;

        public BankAccountInstitutionImage(java.lang.Object obj) {
            this.url = obj;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BankAccountInstitutionImage(url=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.url;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage) other).url);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage copy(java.lang.Object url) {
            return new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage copy$default(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage bankAccountInstitutionImage, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = bankAccountInstitutionImage.url;
            }
            return bankAccountInstitutionImage.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$J|\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b<\u0010\"R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\b>\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$OnCard;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "brand", "lastNChars", "nickName", "Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "productClass", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardStatus;", "cardStatus", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardIssuer;", "cardIssuer", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardArt;", "cardArt", "", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardInstitutionImage;", "cardInstitutionImages", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardStatus;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardIssuer;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardArt;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "component3", "component4", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "component6", "()Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardStatus;", "component7", "()Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardIssuer;", "component8", "()Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardArt;", "component9", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardStatus;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardIssuer;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardArt;Ljava/util/List;)Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$OnCard;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/CardBrand;", "getBrand", "getLastNChars", "getNickName", "Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "getProductClass", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardStatus;", "getCardStatus", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardIssuer;", "getCardIssuer", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardArt;", "getCardArt", "Ljava/util/List;", "getCardInstitutionImages"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCard {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.CardBrand brand;
        private final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardArt cardArt;
        private final java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardInstitutionImage> cardInstitutionImages;
        private final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardIssuer cardIssuer;
        private final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardStatus cardStatus;
        private final java.lang.String id;
        private final java.lang.String lastNChars;
        private final java.lang.String nickName;
        private final com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass;

        public OnCard(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand, java.lang.String str2, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardStatus cardStatus, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardIssuer cardIssuer, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardArt cardArt, java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardInstitutionImage> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardBrand, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.brand = cardBrand;
            this.lastNChars = str2;
            this.nickName = str3;
            this.productClass = cardProductClass;
            this.cardStatus = cardStatus;
            this.cardIssuer = cardIssuer;
            this.cardArt = cardArt;
            this.cardInstitutionImages = list;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardBrand getBrand() {
            return this.brand;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final java.lang.String getNickName() {
            return this.nickName;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardProductClass getProductClass() {
            return this.productClass;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardStatus getCardStatus() {
            return this.cardStatus;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardIssuer getCardIssuer() {
            return this.cardIssuer;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardArt getCardArt() {
            return this.cardArt;
        }

        public final java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardInstitutionImage> getCardInstitutionImages() {
            return this.cardInstitutionImages;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand = this.brand;
            java.lang.String str2 = this.lastNChars;
            java.lang.String str3 = this.nickName;
            com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass = this.productClass;
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardStatus cardStatus = this.cardStatus;
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardIssuer cardIssuer = this.cardIssuer;
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardArt cardArt = this.cardArt;
            java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardInstitutionImage> list = this.cardInstitutionImages;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCard(id=");
            sb.append(str);
            sb.append(", brand=");
            sb.append(cardBrand);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", nickName=");
            sb.append(str3);
            sb.append(", productClass=");
            sb.append(cardProductClass);
            sb.append(", cardStatus=");
            sb.append(cardStatus);
            sb.append(", cardIssuer=");
            sb.append(cardIssuer);
            sb.append(", cardArt=");
            sb.append(cardArt);
            sb.append(", cardInstitutionImages=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.brand.hashCode();
            int hashCode3 = this.lastNChars.hashCode();
            java.lang.String str = this.nickName;
            int hashCode4 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass = this.productClass;
            int hashCode5 = cardProductClass == null ? 0 : cardProductClass.hashCode();
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardStatus cardStatus = this.cardStatus;
            int hashCode6 = cardStatus == null ? 0 : cardStatus.hashCode();
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardIssuer cardIssuer = this.cardIssuer;
            int hashCode7 = cardIssuer == null ? 0 : cardIssuer.hashCode();
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardArt cardArt = this.cardArt;
            int hashCode8 = cardArt == null ? 0 : cardArt.hashCode();
            java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardInstitutionImage> list = this.cardInstitutionImages;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnCard)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnCard onCard = (com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnCard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, onCard.id) && this.brand == onCard.brand && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, onCard.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.nickName, onCard.nickName) && this.productClass == onCard.productClass && kotlin.jvm.internal.Intrinsics.areEqual(this.cardStatus, onCard.cardStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardIssuer, onCard.cardIssuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardArt, onCard.cardArt) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardInstitutionImages, onCard.cardInstitutionImages);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnCard copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.CardBrand brand, java.lang.String lastNChars, java.lang.String nickName, com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardStatus cardStatus, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardIssuer cardIssuer, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardArt cardArt, java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardInstitutionImage> cardInstitutionImages) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(brand, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            return new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnCard(id, brand, lastNChars, nickName, productClass, cardStatus, cardIssuer, cardArt, cardInstitutionImages);
        }

        public final java.util.List<com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardInstitutionImage> component9() {
            return this.cardInstitutionImages;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardArt getCardArt() {
            return this.cardArt;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardIssuer getCardIssuer() {
            return this.cardIssuer;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardStatus getCardStatus() {
            return this.cardStatus;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardProductClass getProductClass() {
            return this.productClass;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getNickName() {
            return this.nickName;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardBrand getBrand() {
            return this.brand;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardStatus;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;)Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardStatus;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/CardStatus;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardStatus {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.CardStatus value;

        public CardStatus(com.paypal.oslo.api.graphql.schema.type.CardStatus cardStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardStatus, "");
            this.value = cardStatus;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardStatus getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.CardStatus cardStatus = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardStatus(value=");
            sb.append(cardStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardStatus) && this.value == ((com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardStatus) other).value;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardStatus copy(com.paypal.oslo.api.graphql.schema.type.CardStatus value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardStatus(value);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CardStatus getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardStatus copy$default(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardStatus cardStatus, com.paypal.oslo.api.graphql.schema.type.CardStatus cardStatus2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardStatus2 = cardStatus.value;
            }
            return cardStatus.copy(cardStatus2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardIssuer;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardIssuer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardIssuer {
        public static final int $stable = 0;
        private final java.lang.String name;

        public CardIssuer(java.lang.String str) {
            this.name = str;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardIssuer(name=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.name;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardIssuer) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardIssuer) other).name);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardIssuer copy(java.lang.String name2) {
            return new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardIssuer(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardIssuer copy$default(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardIssuer cardIssuer, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cardIssuer.name;
            }
            return cardIssuer.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardArt;", "", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$PrimaryImage;", "primaryImage", "<init>", "(Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$PrimaryImage;)V", "component1", "()Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$PrimaryImage;", "copy", "(Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$PrimaryImage;)Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardArt;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$PrimaryImage;", "getPrimaryImage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardArt {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PrimaryImage primaryImage;

        public CardArt(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PrimaryImage primaryImage) {
            this.primaryImage = primaryImage;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PrimaryImage getPrimaryImage() {
            return this.primaryImage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PrimaryImage primaryImage = this.primaryImage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardArt(primaryImage=");
            sb.append(primaryImage);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PrimaryImage primaryImage = this.primaryImage;
            if (primaryImage == null) {
                return 0;
            }
            return primaryImage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardArt) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryImage, ((com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardArt) other).primaryImage);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardArt copy(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PrimaryImage primaryImage) {
            return new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardArt(primaryImage);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PrimaryImage getPrimaryImage() {
            return this.primaryImage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardArt copy$default(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardArt cardArt, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PrimaryImage primaryImage, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                primaryImage = cardArt.primaryImage;
            }
            return cardArt.copy(primaryImage);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ(\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$PrimaryImage;", "", "baseCdnLinkPath", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$PrimaryImage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getBaseCdnLinkPath", "Ljava/lang/String;", "getMimeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrimaryImage {
        public static final int $stable = 8;
        private final java.lang.Object baseCdnLinkPath;
        private final java.lang.String mimeType;

        public PrimaryImage(java.lang.Object obj, java.lang.String str) {
            this.baseCdnLinkPath = obj;
            this.mimeType = str;
        }

        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.baseCdnLinkPath;
            java.lang.String str = this.mimeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrimaryImage(baseCdnLinkPath=");
            sb.append(obj);
            sb.append(", mimeType=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.baseCdnLinkPath;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.String str = this.mimeType;
            return (hashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PrimaryImage)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PrimaryImage primaryImage = (com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PrimaryImage) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.baseCdnLinkPath, primaryImage.baseCdnLinkPath) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, primaryImage.mimeType);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PrimaryImage copy(java.lang.Object baseCdnLinkPath, java.lang.String mimeType) {
            return new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PrimaryImage(baseCdnLinkPath, mimeType);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getBaseCdnLinkPath() {
            return this.baseCdnLinkPath;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PrimaryImage copy$default(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PrimaryImage primaryImage, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = primaryImage.baseCdnLinkPath;
            }
            if ((i & 2) != 0) {
                str = primaryImage.mimeType;
            }
            return primaryImage.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardInstitutionImage;", "", "url", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$CardInstitutionImage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardInstitutionImage {
        public static final int $stable = 8;
        private final java.lang.Object url;

        public CardInstitutionImage(java.lang.Object obj) {
            this.url = obj;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardInstitutionImage(url=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.url;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardInstitutionImage) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardInstitutionImage) other).url);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardInstitutionImage copy(java.lang.Object url) {
            return new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardInstitutionImage(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardInstitutionImage copy$default(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.CardInstitutionImage cardInstitutionImage, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = cardInstitutionImage.url;
            }
            return cardInstitutionImage.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$PaymentDelivery;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanTransferSpeed;", "speed", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanTransferSpeed;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanTransferSpeed;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanTransferSpeed;)Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$PaymentDelivery;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentPlanTransferSpeed;", "getSpeed"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentDelivery {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed speed;

        public PaymentDelivery(com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed paymentPlanTransferSpeed) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentPlanTransferSpeed, "");
            this.speed = paymentPlanTransferSpeed;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed getSpeed() {
            return this.speed;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed paymentPlanTransferSpeed = this.speed;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentDelivery(speed=");
            sb.append(paymentPlanTransferSpeed);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.speed.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PaymentDelivery) && this.speed == ((com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PaymentDelivery) other).speed;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PaymentDelivery copy(com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed speed) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(speed, "");
            return new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PaymentDelivery(speed);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed getSpeed() {
            return this.speed;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PaymentDelivery copy$default(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.PaymentDelivery paymentDelivery, com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed paymentPlanTransferSpeed, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentPlanTransferSpeed = paymentDelivery.speed;
            }
            return paymentDelivery.copy(paymentPlanTransferSpeed);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Limit;", "", "Lcom/paypal/oslo/api/graphql/schema/type/TransferLimitType;", "limitType", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Amount;", "amount", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/TransferLimitType;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Amount;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/TransferLimitType;", "component2", "()Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Amount;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/TransferLimitType;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Amount;)Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Limit;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/TransferLimitType;", "getLimitType", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Amount;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Limit {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Amount amount;
        private final com.paypal.oslo.api.graphql.schema.type.TransferLimitType limitType;

        public Limit(com.paypal.oslo.api.graphql.schema.type.TransferLimitType transferLimitType, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Amount amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferLimitType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            this.limitType = transferLimitType;
            this.amount = amount;
        }

        public final com.paypal.oslo.api.graphql.schema.type.TransferLimitType getLimitType() {
            return this.limitType;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Amount getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.TransferLimitType transferLimitType = this.limitType;
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Amount amount = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Limit(limitType=");
            sb.append(transferLimitType);
            sb.append(", amount=");
            sb.append(amount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.limitType.hashCode() * 31) + this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Limit)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Limit limit = (com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Limit) other;
            return this.limitType == limit.limitType && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, limit.amount);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Limit copy(com.paypal.oslo.api.graphql.schema.type.TransferLimitType limitType, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Amount amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(limitType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Limit(limitType, amount);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Amount getAmount() {
            return this.amount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.TransferLimitType getLimitType() {
            return this.limitType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Limit copy$default(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Limit limit, com.paypal.oslo.api.graphql.schema.type.TransferLimitType transferLimitType, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Amount amount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                transferLimitType = limit.limitType;
            }
            if ((i & 2) != 0) {
                amount = limit.amount;
            }
            return limit.copy(transferLimitType, amount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Amount;", "", "", "__typename", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$OnMoney;", "onMoney", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$OnMoney;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$OnMoney;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$OnMoney;)Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$OnMoney;", "getOnMoney"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnMoney onMoney;

        public Amount(java.lang.String str, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnMoney onMoney) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onMoney = onMoney;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnMoney getOnMoney() {
            return this.onMoney;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnMoney onMoney = this.onMoney;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(__typename=");
            sb.append(str);
            sb.append(", onMoney=");
            sb.append(onMoney);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnMoney onMoney = this.onMoney;
            return (hashCode * 31) + (onMoney == null ? 0 : onMoney.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Amount amount = (com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onMoney, amount.onMoney);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Amount copy(java.lang.String __typename, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnMoney onMoney) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Amount(__typename, onMoney);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnMoney getOnMoney() {
            return this.onMoney;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Amount copy$default(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.Amount amount, java.lang.String str, com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnMoney onMoney, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amount.__typename;
            }
            if ((i & 2) != 0) {
                onMoney = amount.onMoney;
            }
            return amount.copy(str, onMoney);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$OnMoney;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$OnMoney;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Ljava/lang/Object;", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnMoney {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public OnMoney(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.value = str;
            this.currencyCode = obj;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.Object obj = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnMoney(value=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.value.hashCode() * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnMoney)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnMoney onMoney = (com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnMoney) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, onMoney.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, onMoney.currencyCode);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnMoney copy(java.lang.String value, java.lang.Object currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnMoney(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnMoney copy$default(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery.OnMoney onMoney, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = onMoney.value;
            }
            if ((i & 2) != 0) {
                obj = onMoney.currencyCode;
            }
            return onMoney.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetDepositOptionsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetDepositOptions($input: DepositOptionsInput!) { depositOptions(input: $input) { options { id plan { isDefault fundingSources { type instrument { __typename ... on BankAccount { id type lastNChars nickname bankAccountStatus: status { value } bankAccountIssuer: issuer { name } bankAccountInstitutionImages: institutionImages { url } } ... on Card { id brand lastNChars nickName productClass cardStatus: status { value } cardIssuer: issuer { name } cardArt { primaryImage { baseCdnLinkPath mimeType } } cardInstitutionImages: institutionImages { url } } } } paymentDelivery { speed } } tags limits { limitType amount { __typename ... on Money { value currencyCode } } } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DepositOptionsInput depositOptionsInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetDepositOptionsQuery(input=");
        sb.append(depositOptionsInput);
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
        return (other instanceof com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery) other).input);
    }

    public final com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery copy(com.paypal.oslo.api.graphql.schema.type.DepositOptionsInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DepositOptionsInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery copy$default(com.paypal.oslo.feature.balance.graphql.GetDepositOptionsQuery getDepositOptionsQuery, com.paypal.oslo.api.graphql.schema.type.DepositOptionsInput depositOptionsInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            depositOptionsInput = getDepositOptionsQuery.input;
        }
        return getDepositOptionsQuery.copy(depositOptionsInput);
    }
}
