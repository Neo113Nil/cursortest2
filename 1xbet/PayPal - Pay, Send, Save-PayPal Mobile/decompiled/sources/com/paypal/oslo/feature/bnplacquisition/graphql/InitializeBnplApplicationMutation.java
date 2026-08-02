package com.paypal.oslo.feature.bnplacquisition.graphql;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b!\b\u0086\b\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u001789:;<=>?@ABCDEFGHIJKLM7B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010\"JB\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b/\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b1\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b4\u0010\"R\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b5\u0010\"R\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b6\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/InitializeBNPLApplicationInput;", "input", "", "includeAnnualIncome", "includeNationalIdentification", "includePaymentFundingInstruments", "includeSelectedPaymentFundingInstrument", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/InitializeBNPLApplicationInput;ZZZZ)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/InitializeBNPLApplicationInput;", "component2", "()Z", "component3", "component4", "component5", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/InitializeBNPLApplicationInput;ZZZZ)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/InitializeBNPLApplicationInput;", "getInput", "Z", "getIncludeAnnualIncome", "getIncludeNationalIdentification", "getIncludePaymentFundingInstruments", "getIncludeSelectedPaymentFundingInstrument", "Companion", "Data", com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OPERATION_NAME, "OnInitializeBNPLApplicationSuccess", "Application", "Document", "LoanAmount", "UserProfile", "Name", "Address", "AnnualIncome", "Amount", "BillingAddress", "DateOfBirth", "NationalIdentification", "Phone", "PaymentFundingInstrument", "OnBankAccount", "OnCard", "SelectedPaymentFundingInstrument", "OnBankAccount1", "OnCard1", "OnInitializeBNPLApplicationDecline"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InitializeBnplApplicationMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Data> {
    public static final java.lang.String OPERATION_ID = "151c541a193e7f1f4684b44b2f91108ddbe02867d26a537473c5cd86cf8e73c5";
    public static final java.lang.String OPERATION_NAME = "InitializeBnplApplication";
    private final boolean includeAnnualIncome;
    private final boolean includeNationalIdentification;
    private final boolean includePaymentFundingInstruments;
    private final boolean includeSelectedPaymentFundingInstrument;
    private final com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Companion INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Companion(null);
    public static final int $stable = 8;

    public InitializeBnplApplicationMutation(com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationInput initializeBNPLApplicationInput, boolean z, boolean z2, boolean z3, boolean z4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeBNPLApplicationInput, "");
        this.input = initializeBNPLApplicationInput;
        this.includeAnnualIncome = z;
        this.includeNationalIdentification = z2;
        this.includePaymentFundingInstruments = z3;
        this.includeSelectedPaymentFundingInstrument = z4;
    }

    public final com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationInput getInput() {
        return this.input;
    }

    public final boolean getIncludeAnnualIncome() {
        return this.includeAnnualIncome;
    }

    public final boolean getIncludeNationalIdentification() {
        return this.includeNationalIdentification;
    }

    public final boolean getIncludePaymentFundingInstruments() {
        return this.includePaymentFundingInstruments;
    }

    public final boolean getIncludeSelectedPaymentFundingInstrument() {
        return this.includeSelectedPaymentFundingInstrument;
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
        com.paypal.oslo.feature.bnplacquisition.graphql.adapter.InitializeBnplApplicationMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.InitializeBnplApplicationMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.bnplacquisition.graphql.selections.InitializeBnplApplicationMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$InitializeBnplApplication;", "initializeBnplApplication", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$InitializeBnplApplication;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$InitializeBnplApplication;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$InitializeBnplApplication;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$InitializeBnplApplication;", "getInitializeBnplApplication"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.InitializeBnplApplication initializeBnplApplication;

        public Data(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.InitializeBnplApplication initializeBnplApplication) {
            this.initializeBnplApplication = initializeBnplApplication;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.InitializeBnplApplication getInitializeBnplApplication() {
            return this.initializeBnplApplication;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.InitializeBnplApplication initializeBnplApplication = this.initializeBnplApplication;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(initializeBnplApplication=");
            sb.append(initializeBnplApplication);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.InitializeBnplApplication initializeBnplApplication = this.initializeBnplApplication;
            if (initializeBnplApplication == null) {
                return 0;
            }
            return initializeBnplApplication.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.initializeBnplApplication, ((com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Data) other).initializeBnplApplication);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Data copy(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.InitializeBnplApplication initializeBnplApplication) {
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Data(initializeBnplApplication);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.InitializeBnplApplication getInitializeBnplApplication() {
            return this.initializeBnplApplication;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Data copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Data data, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.InitializeBnplApplication initializeBnplApplication, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                initializeBnplApplication = data.initializeBnplApplication;
            }
            return data.copy(initializeBnplApplication);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$InitializeBnplApplication;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnInitializeBNPLApplicationSuccess;", "onInitializeBNPLApplicationSuccess", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnInitializeBNPLApplicationDecline;", "onInitializeBNPLApplicationDecline", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnInitializeBNPLApplicationSuccess;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnInitializeBNPLApplicationDecline;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnInitializeBNPLApplicationSuccess;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnInitializeBNPLApplicationDecline;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnInitializeBNPLApplicationSuccess;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnInitializeBNPLApplicationDecline;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$InitializeBnplApplication;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnInitializeBNPLApplicationSuccess;", "getOnInitializeBNPLApplicationSuccess", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnInitializeBNPLApplicationDecline;", "getOnInitializeBNPLApplicationDecline"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InitializeBnplApplication {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationDecline onInitializeBNPLApplicationDecline;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationSuccess onInitializeBNPLApplicationSuccess;

        public InitializeBnplApplication(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationSuccess onInitializeBNPLApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationDecline onInitializeBNPLApplicationDecline) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onInitializeBNPLApplicationSuccess = onInitializeBNPLApplicationSuccess;
            this.onInitializeBNPLApplicationDecline = onInitializeBNPLApplicationDecline;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationSuccess getOnInitializeBNPLApplicationSuccess() {
            return this.onInitializeBNPLApplicationSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationDecline getOnInitializeBNPLApplicationDecline() {
            return this.onInitializeBNPLApplicationDecline;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationSuccess onInitializeBNPLApplicationSuccess = this.onInitializeBNPLApplicationSuccess;
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationDecline onInitializeBNPLApplicationDecline = this.onInitializeBNPLApplicationDecline;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InitializeBnplApplication(__typename=");
            sb.append(str);
            sb.append(", onInitializeBNPLApplicationSuccess=");
            sb.append(onInitializeBNPLApplicationSuccess);
            sb.append(", onInitializeBNPLApplicationDecline=");
            sb.append(onInitializeBNPLApplicationDecline);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationSuccess onInitializeBNPLApplicationSuccess = this.onInitializeBNPLApplicationSuccess;
            int hashCode2 = onInitializeBNPLApplicationSuccess == null ? 0 : onInitializeBNPLApplicationSuccess.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationDecline onInitializeBNPLApplicationDecline = this.onInitializeBNPLApplicationDecline;
            return (((hashCode * 31) + hashCode2) * 31) + (onInitializeBNPLApplicationDecline != null ? onInitializeBNPLApplicationDecline.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.InitializeBnplApplication)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.InitializeBnplApplication initializeBnplApplication = (com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.InitializeBnplApplication) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, initializeBnplApplication.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onInitializeBNPLApplicationSuccess, initializeBnplApplication.onInitializeBNPLApplicationSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.onInitializeBNPLApplicationDecline, initializeBnplApplication.onInitializeBNPLApplicationDecline);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.InitializeBnplApplication copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationSuccess onInitializeBNPLApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationDecline onInitializeBNPLApplicationDecline) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.InitializeBnplApplication(__typename, onInitializeBNPLApplicationSuccess, onInitializeBNPLApplicationDecline);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationDecline getOnInitializeBNPLApplicationDecline() {
            return this.onInitializeBNPLApplicationDecline;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationSuccess getOnInitializeBNPLApplicationSuccess() {
            return this.onInitializeBNPLApplicationSuccess;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.InitializeBnplApplication copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.InitializeBnplApplication initializeBnplApplication, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationSuccess onInitializeBNPLApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationDecline onInitializeBNPLApplicationDecline, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initializeBnplApplication.__typename;
            }
            if ((i & 2) != 0) {
                onInitializeBNPLApplicationSuccess = initializeBnplApplication.onInitializeBNPLApplicationSuccess;
            }
            if ((i & 4) != 0) {
                onInitializeBNPLApplicationDecline = initializeBnplApplication.onInitializeBNPLApplicationDecline;
            }
            return initializeBnplApplication.copy(str, onInitializeBNPLApplicationSuccess, onInitializeBNPLApplicationDecline);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnInitializeBNPLApplicationSuccess;", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Application;", "application", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Application;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Application;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Application;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnInitializeBNPLApplicationSuccess;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Application;", "getApplication"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnInitializeBNPLApplicationSuccess {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Application application;

        public OnInitializeBNPLApplicationSuccess(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Application application) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
            this.application = application;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Application getApplication() {
            return this.application;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Application application = this.application;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnInitializeBNPLApplicationSuccess(application=");
            sb.append(application);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.application.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.application, ((com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationSuccess) other).application);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationSuccess copy(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Application application) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationSuccess(application);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Application getApplication() {
            return this.application;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationSuccess onInitializeBNPLApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Application application, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                application = onInitializeBNPLApplicationSuccess.application;
            }
            return onInitializeBNPLApplicationSuccess.copy(application);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ^\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010'\u001a\u0004\b(\u0010\u0011R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0017R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b/\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Application;", "", "creditAccountId", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Document;", "documents", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$LoanAmount;", "loanAmount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$UserProfile;", "userProfile", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$PaymentFundingInstrument;", "paymentFundingInstruments", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$SelectedPaymentFundingInstrument;", "selectedPaymentFundingInstrument", "<init>", "(Ljava/lang/Object;Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$LoanAmount;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$UserProfile;Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$SelectedPaymentFundingInstrument;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$LoanAmount;", "component4", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$UserProfile;", "component5", "component6", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$SelectedPaymentFundingInstrument;", "copy", "(Ljava/lang/Object;Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$LoanAmount;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$UserProfile;Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$SelectedPaymentFundingInstrument;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Application;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getCreditAccountId", "Ljava/util/List;", "getDocuments", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$LoanAmount;", "getLoanAmount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$UserProfile;", "getUserProfile", "getPaymentFundingInstruments", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$SelectedPaymentFundingInstrument;", "getSelectedPaymentFundingInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Application {
        public static final int $stable = 8;
        private final java.lang.Object creditAccountId;
        private final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Document> documents;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.LoanAmount loanAmount;
        private final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.PaymentFundingInstrument> paymentFundingInstruments;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.SelectedPaymentFundingInstrument selectedPaymentFundingInstrument;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.UserProfile userProfile;

        public Application(java.lang.Object obj, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Document> list, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.LoanAmount loanAmount, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.UserProfile userProfile, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.PaymentFundingInstrument> list2, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.SelectedPaymentFundingInstrument selectedPaymentFundingInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loanAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfile, "");
            this.creditAccountId = obj;
            this.documents = list;
            this.loanAmount = loanAmount;
            this.userProfile = userProfile;
            this.paymentFundingInstruments = list2;
            this.selectedPaymentFundingInstrument = selectedPaymentFundingInstrument;
        }

        public final java.lang.Object getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Document> getDocuments() {
            return this.documents;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.LoanAmount getLoanAmount() {
            return this.loanAmount;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.UserProfile getUserProfile() {
            return this.userProfile;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.PaymentFundingInstrument> getPaymentFundingInstruments() {
            return this.paymentFundingInstruments;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.SelectedPaymentFundingInstrument getSelectedPaymentFundingInstrument() {
            return this.selectedPaymentFundingInstrument;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.creditAccountId;
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Document> list = this.documents;
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.LoanAmount loanAmount = this.loanAmount;
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.UserProfile userProfile = this.userProfile;
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.PaymentFundingInstrument> list2 = this.paymentFundingInstruments;
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.SelectedPaymentFundingInstrument selectedPaymentFundingInstrument = this.selectedPaymentFundingInstrument;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Application(creditAccountId=");
            sb.append(obj);
            sb.append(", documents=");
            sb.append(list);
            sb.append(", loanAmount=");
            sb.append(loanAmount);
            sb.append(", userProfile=");
            sb.append(userProfile);
            sb.append(", paymentFundingInstruments=");
            sb.append(list2);
            sb.append(", selectedPaymentFundingInstrument=");
            sb.append(selectedPaymentFundingInstrument);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.creditAccountId;
            int hashCode = obj == null ? 0 : obj.hashCode();
            int hashCode2 = this.documents.hashCode();
            int hashCode3 = this.loanAmount.hashCode();
            int hashCode4 = this.userProfile.hashCode();
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.PaymentFundingInstrument> list = this.paymentFundingInstruments;
            int hashCode5 = list == null ? 0 : list.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.SelectedPaymentFundingInstrument selectedPaymentFundingInstrument = this.selectedPaymentFundingInstrument;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (selectedPaymentFundingInstrument != null ? selectedPaymentFundingInstrument.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Application)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Application application = (com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Application) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, application.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.documents, application.documents) && kotlin.jvm.internal.Intrinsics.areEqual(this.loanAmount, application.loanAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.userProfile, application.userProfile) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentFundingInstruments, application.paymentFundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedPaymentFundingInstrument, application.selectedPaymentFundingInstrument);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Application copy(java.lang.Object creditAccountId, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Document> documents, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.LoanAmount loanAmount, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.UserProfile userProfile, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.PaymentFundingInstrument> paymentFundingInstruments, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.SelectedPaymentFundingInstrument selectedPaymentFundingInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documents, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loanAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfile, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Application(creditAccountId, documents, loanAmount, userProfile, paymentFundingInstruments, selectedPaymentFundingInstrument);
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.SelectedPaymentFundingInstrument getSelectedPaymentFundingInstrument() {
            return this.selectedPaymentFundingInstrument;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.PaymentFundingInstrument> component5() {
            return this.paymentFundingInstruments;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.UserProfile getUserProfile() {
            return this.userProfile;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.LoanAmount getLoanAmount() {
            return this.loanAmount;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Document> component2() {
            return this.documents;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Application copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Application application, java.lang.Object obj, java.util.List list, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.LoanAmount loanAmount, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.UserProfile userProfile, java.util.List list2, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.SelectedPaymentFundingInstrument selectedPaymentFundingInstrument, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = application.creditAccountId;
            }
            if ((i & 2) != 0) {
                list = application.documents;
            }
            java.util.List list3 = list;
            if ((i & 4) != 0) {
                loanAmount = application.loanAmount;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.LoanAmount loanAmount2 = loanAmount;
            if ((i & 8) != 0) {
                userProfile = application.userProfile;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.UserProfile userProfile2 = userProfile;
            if ((i & 16) != 0) {
                list2 = application.paymentFundingInstruments;
            }
            java.util.List list4 = list2;
            if ((i & 32) != 0) {
                selectedPaymentFundingInstrument = application.selectedPaymentFundingInstrument;
            }
            return application.copy(obj, list3, loanAmount2, userProfile2, list4, selectedPaymentFundingInstrument);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Document;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;", "bnplAcquisitionDocumentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Document;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionDocumentFragment;", "getBnplAcquisitionDocumentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Document {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment bnplAcquisitionDocumentFragment;

        public Document(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment bnplAcquisitionDocumentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionDocumentFragment, "");
            this.__typename = str;
            this.bnplAcquisitionDocumentFragment = bnplAcquisitionDocumentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment getBnplAcquisitionDocumentFragment() {
            return this.bnplAcquisitionDocumentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment bnplAcquisitionDocumentFragment = this.bnplAcquisitionDocumentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Document(__typename=");
            sb.append(str);
            sb.append(", bnplAcquisitionDocumentFragment=");
            sb.append(bnplAcquisitionDocumentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplAcquisitionDocumentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Document)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Document document = (com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Document) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, document.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionDocumentFragment, document.bnplAcquisitionDocumentFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Document copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment bnplAcquisitionDocumentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionDocumentFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Document(__typename, bnplAcquisitionDocumentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment getBnplAcquisitionDocumentFragment() {
            return this.bnplAcquisitionDocumentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Document copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Document document, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment bnplAcquisitionDocumentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = document.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionDocumentFragment = document.bnplAcquisitionDocumentFragment;
            }
            return document.copy(str, bnplAcquisitionDocumentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$LoanAmount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "bnplAcquisitionMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$LoanAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "getBnplAcquisitionMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoanAmount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment;

        public LoanAmount(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionMoneyFragment, "");
            this.__typename = str;
            this.bnplAcquisitionMoneyFragment = bnplAcquisitionMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getBnplAcquisitionMoneyFragment() {
            return this.bnplAcquisitionMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment = this.bnplAcquisitionMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoanAmount(__typename=");
            sb.append(str);
            sb.append(", bnplAcquisitionMoneyFragment=");
            sb.append(bnplAcquisitionMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplAcquisitionMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.LoanAmount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.LoanAmount loanAmount = (com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.LoanAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, loanAmount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionMoneyFragment, loanAmount.bnplAcquisitionMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.LoanAmount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.LoanAmount(__typename, bnplAcquisitionMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getBnplAcquisitionMoneyFragment() {
            return this.bnplAcquisitionMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.LoanAmount copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.LoanAmount loanAmount, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loanAmount.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionMoneyFragment = loanAmount.bnplAcquisitionMoneyFragment;
            }
            return loanAmount.copy(str, bnplAcquisitionMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jf\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b8\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$UserProfile;", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Name;", "name", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Address;", "addresses", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$AnnualIncome;", "annualIncome", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$BillingAddress;", "billingAddress", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$DateOfBirth;", "dateOfBirth", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$NationalIdentification;", "nationalIdentification", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Phone;", "phone", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Name;Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$AnnualIncome;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$BillingAddress;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$DateOfBirth;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$NationalIdentification;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Phone;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Name;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$AnnualIncome;", "component4", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$BillingAddress;", "component5", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$DateOfBirth;", "component6", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$NationalIdentification;", "component7", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Phone;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Name;Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$AnnualIncome;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$BillingAddress;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$DateOfBirth;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$NationalIdentification;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Phone;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$UserProfile;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Name;", "getName", "Ljava/util/List;", "getAddresses", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$AnnualIncome;", "getAnnualIncome", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$BillingAddress;", "getBillingAddress", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$DateOfBirth;", "getDateOfBirth", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$NationalIdentification;", "getNationalIdentification", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Phone;", "getPhone"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserProfile {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Address> addresses;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.AnnualIncome annualIncome;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.BillingAddress billingAddress;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.DateOfBirth dateOfBirth;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Name name;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.NationalIdentification nationalIdentification;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Phone phone;

        public UserProfile(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Name name2, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Address> list, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.AnnualIncome annualIncome, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.BillingAddress billingAddress, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.DateOfBirth dateOfBirth, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.NationalIdentification nationalIdentification, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Phone phone) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.name = name2;
            this.addresses = list;
            this.annualIncome = annualIncome;
            this.billingAddress = billingAddress;
            this.dateOfBirth = dateOfBirth;
            this.nationalIdentification = nationalIdentification;
            this.phone = phone;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Name getName() {
            return this.name;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Address> getAddresses() {
            return this.addresses;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.AnnualIncome getAnnualIncome() {
            return this.annualIncome;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.BillingAddress getBillingAddress() {
            return this.billingAddress;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.DateOfBirth getDateOfBirth() {
            return this.dateOfBirth;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.NationalIdentification getNationalIdentification() {
            return this.nationalIdentification;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Phone getPhone() {
            return this.phone;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Name name2 = this.name;
            java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Address> list = this.addresses;
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.AnnualIncome annualIncome = this.annualIncome;
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.BillingAddress billingAddress = this.billingAddress;
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.DateOfBirth dateOfBirth = this.dateOfBirth;
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.NationalIdentification nationalIdentification = this.nationalIdentification;
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Phone phone = this.phone;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UserProfile(name=");
            sb.append(name2);
            sb.append(", addresses=");
            sb.append(list);
            sb.append(", annualIncome=");
            sb.append(annualIncome);
            sb.append(", billingAddress=");
            sb.append(billingAddress);
            sb.append(", dateOfBirth=");
            sb.append(dateOfBirth);
            sb.append(", nationalIdentification=");
            sb.append(nationalIdentification);
            sb.append(", phone=");
            sb.append(phone);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            int hashCode2 = this.addresses.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.AnnualIncome annualIncome = this.annualIncome;
            int hashCode3 = annualIncome == null ? 0 : annualIncome.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.BillingAddress billingAddress = this.billingAddress;
            int hashCode4 = billingAddress == null ? 0 : billingAddress.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.DateOfBirth dateOfBirth = this.dateOfBirth;
            int hashCode5 = dateOfBirth == null ? 0 : dateOfBirth.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.NationalIdentification nationalIdentification = this.nationalIdentification;
            int hashCode6 = nationalIdentification == null ? 0 : nationalIdentification.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Phone phone = this.phone;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (phone != null ? phone.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.UserProfile)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.UserProfile userProfile = (com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.UserProfile) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, userProfile.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.addresses, userProfile.addresses) && kotlin.jvm.internal.Intrinsics.areEqual(this.annualIncome, userProfile.annualIncome) && kotlin.jvm.internal.Intrinsics.areEqual(this.billingAddress, userProfile.billingAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateOfBirth, userProfile.dateOfBirth) && kotlin.jvm.internal.Intrinsics.areEqual(this.nationalIdentification, userProfile.nationalIdentification) && kotlin.jvm.internal.Intrinsics.areEqual(this.phone, userProfile.phone);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.UserProfile copy(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Name name2, java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Address> addresses, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.AnnualIncome annualIncome, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.BillingAddress billingAddress, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.DateOfBirth dateOfBirth, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.NationalIdentification nationalIdentification, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Phone phone) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addresses, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.UserProfile(name2, addresses, annualIncome, billingAddress, dateOfBirth, nationalIdentification, phone);
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Phone getPhone() {
            return this.phone;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.NationalIdentification getNationalIdentification() {
            return this.nationalIdentification;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.DateOfBirth getDateOfBirth() {
            return this.dateOfBirth;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.BillingAddress getBillingAddress() {
            return this.billingAddress;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.AnnualIncome getAnnualIncome() {
            return this.annualIncome;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Address> component2() {
            return this.addresses;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Name getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.UserProfile copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.UserProfile userProfile, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Name name2, java.util.List list, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.AnnualIncome annualIncome, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.BillingAddress billingAddress, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.DateOfBirth dateOfBirth, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.NationalIdentification nationalIdentification, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Phone phone, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                name2 = userProfile.name;
            }
            if ((i & 2) != 0) {
                list = userProfile.addresses;
            }
            java.util.List list2 = list;
            if ((i & 4) != 0) {
                annualIncome = userProfile.annualIncome;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.AnnualIncome annualIncome2 = annualIncome;
            if ((i & 8) != 0) {
                billingAddress = userProfile.billingAddress;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.BillingAddress billingAddress2 = billingAddress;
            if ((i & 16) != 0) {
                dateOfBirth = userProfile.dateOfBirth;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.DateOfBirth dateOfBirth2 = dateOfBirth;
            if ((i & 32) != 0) {
                nationalIdentification = userProfile.nationalIdentification;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.NationalIdentification nationalIdentification2 = nationalIdentification;
            if ((i & 64) != 0) {
                phone = userProfile.phone;
            }
            return userProfile.copy(name2, list2, annualIncome2, billingAddress2, dateOfBirth2, nationalIdentification2, phone);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Name;", "", "", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "fullName", "surname", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Name;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getGivenName", "getFullName", "getSurname"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Name {
        public static final int $stable = 0;
        private final java.lang.String fullName;
        private final java.lang.String givenName;
        private final java.lang.String surname;

        public Name(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.givenName = str;
            this.fullName = str2;
            this.surname = str3;
        }

        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public final java.lang.String getFullName() {
            return this.fullName;
        }

        public final java.lang.String getSurname() {
            return this.surname;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.givenName;
            java.lang.String str2 = this.fullName;
            java.lang.String str3 = this.surname;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Name(givenName=");
            sb.append(str);
            sb.append(", fullName=");
            sb.append(str2);
            sb.append(", surname=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.givenName;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.fullName;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.surname;
            return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Name)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Name name2 = (com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Name) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, name2.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, name2.fullName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, name2.surname);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Name copy(java.lang.String givenName, java.lang.String fullName, java.lang.String surname) {
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Name(givenName, fullName, surname);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSurname() {
            return this.surname;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFullName() {
            return this.fullName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Name copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Name name2, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = name2.givenName;
            }
            if ((i & 2) != 0) {
                str2 = name2.fullName;
            }
            if ((i & 4) != 0) {
                str3 = name2.surname;
            }
            return name2.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Address;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionAddressFragment;", "bnplAcquisitionAddressFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionAddressFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionAddressFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionAddressFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Address;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionAddressFragment;", "getBnplAcquisitionAddressFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Address {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment bnplAcquisitionAddressFragment;

        public Address(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment bnplAcquisitionAddressFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionAddressFragment, "");
            this.__typename = str;
            this.bnplAcquisitionAddressFragment = bnplAcquisitionAddressFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment getBnplAcquisitionAddressFragment() {
            return this.bnplAcquisitionAddressFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment bnplAcquisitionAddressFragment = this.bnplAcquisitionAddressFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Address(__typename=");
            sb.append(str);
            sb.append(", bnplAcquisitionAddressFragment=");
            sb.append(bnplAcquisitionAddressFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplAcquisitionAddressFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Address)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Address address = (com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Address) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, address.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionAddressFragment, address.bnplAcquisitionAddressFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Address copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment bnplAcquisitionAddressFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionAddressFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Address(__typename, bnplAcquisitionAddressFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment getBnplAcquisitionAddressFragment() {
            return this.bnplAcquisitionAddressFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Address copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Address address, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment bnplAcquisitionAddressFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = address.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionAddressFragment = address.bnplAcquisitionAddressFragment;
            }
            return address.copy(str, bnplAcquisitionAddressFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$AnnualIncome;", "", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Amount;", "amount", "", "isRequired", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Amount;Z)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Amount;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Amount;Z)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$AnnualIncome;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Amount;", "getAmount", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AnnualIncome {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Amount amount;
        private final boolean isRequired;

        public AnnualIncome(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Amount amount, boolean z) {
            this.amount = amount;
            this.isRequired = z;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Amount getAmount() {
            return this.amount;
        }

        public final boolean isRequired() {
            return this.isRequired;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Amount amount = this.amount;
            boolean z = this.isRequired;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AnnualIncome(amount=");
            sb.append(amount);
            sb.append(", isRequired=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Amount amount = this.amount;
            return ((amount == null ? 0 : amount.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isRequired);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.AnnualIncome)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.AnnualIncome annualIncome = (com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.AnnualIncome) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, annualIncome.amount) && this.isRequired == annualIncome.isRequired;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.AnnualIncome copy(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Amount amount, boolean isRequired) {
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.AnnualIncome(amount, isRequired);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Amount getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.AnnualIncome copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.AnnualIncome annualIncome, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Amount amount, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                amount = annualIncome.amount;
            }
            if ((i & 2) != 0) {
                z = annualIncome.isRequired;
            }
            return annualIncome.copy(amount, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Amount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "bnplAcquisitionMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Amount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionMoneyFragment;", "getBnplAcquisitionMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Amount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment;

        public Amount(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionMoneyFragment, "");
            this.__typename = str;
            this.bnplAcquisitionMoneyFragment = bnplAcquisitionMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getBnplAcquisitionMoneyFragment() {
            return this.bnplAcquisitionMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment = this.bnplAcquisitionMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Amount(__typename=");
            sb.append(str);
            sb.append(", bnplAcquisitionMoneyFragment=");
            sb.append(bnplAcquisitionMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplAcquisitionMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Amount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Amount amount = (com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Amount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, amount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionMoneyFragment, amount.bnplAcquisitionMoneyFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Amount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionMoneyFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Amount(__typename, bnplAcquisitionMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment getBnplAcquisitionMoneyFragment() {
            return this.bnplAcquisitionMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Amount copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Amount amount, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment bnplAcquisitionMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = amount.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionMoneyFragment = amount.bnplAcquisitionMoneyFragment;
            }
            return amount.copy(str, bnplAcquisitionMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$BillingAddress;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionAddressFragment;", "bnplAcquisitionAddressFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionAddressFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionAddressFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionAddressFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$BillingAddress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionAddressFragment;", "getBnplAcquisitionAddressFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BillingAddress {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment bnplAcquisitionAddressFragment;

        public BillingAddress(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment bnplAcquisitionAddressFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionAddressFragment, "");
            this.__typename = str;
            this.bnplAcquisitionAddressFragment = bnplAcquisitionAddressFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment getBnplAcquisitionAddressFragment() {
            return this.bnplAcquisitionAddressFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment bnplAcquisitionAddressFragment = this.bnplAcquisitionAddressFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BillingAddress(__typename=");
            sb.append(str);
            sb.append(", bnplAcquisitionAddressFragment=");
            sb.append(bnplAcquisitionAddressFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplAcquisitionAddressFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.BillingAddress)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.BillingAddress billingAddress = (com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.BillingAddress) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, billingAddress.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionAddressFragment, billingAddress.bnplAcquisitionAddressFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.BillingAddress copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment bnplAcquisitionAddressFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionAddressFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.BillingAddress(__typename, bnplAcquisitionAddressFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment getBnplAcquisitionAddressFragment() {
            return this.bnplAcquisitionAddressFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.BillingAddress copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.BillingAddress billingAddress, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionAddressFragment bnplAcquisitionAddressFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = billingAddress.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionAddressFragment = billingAddress.bnplAcquisitionAddressFragment;
            }
            return billingAddress.copy(str, bnplAcquisitionAddressFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0004\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$DateOfBirth;", "", "birthDate", "", "isRequired", "<init>", "(Ljava/lang/Object;Z)V", "component1", "()Ljava/lang/Object;", "component2", "()Z", "copy", "(Ljava/lang/Object;Z)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$DateOfBirth;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getBirthDate", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DateOfBirth {
        public static final int $stable = 8;
        private final java.lang.Object birthDate;
        private final boolean isRequired;

        public DateOfBirth(java.lang.Object obj, boolean z) {
            this.birthDate = obj;
            this.isRequired = z;
        }

        public final java.lang.Object getBirthDate() {
            return this.birthDate;
        }

        public final boolean isRequired() {
            return this.isRequired;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.birthDate;
            boolean z = this.isRequired;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DateOfBirth(birthDate=");
            sb.append(obj);
            sb.append(", isRequired=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.birthDate;
            return ((obj == null ? 0 : obj.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isRequired);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.DateOfBirth)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.DateOfBirth dateOfBirth = (com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.DateOfBirth) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.birthDate, dateOfBirth.birthDate) && this.isRequired == dateOfBirth.isRequired;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.DateOfBirth copy(java.lang.Object birthDate, boolean isRequired) {
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.DateOfBirth(birthDate, isRequired);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getBirthDate() {
            return this.birthDate;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.DateOfBirth copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.DateOfBirth dateOfBirth, java.lang.Object obj, boolean z, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = dateOfBirth.birthDate;
            }
            if ((i & 2) != 0) {
                z = dateOfBirth.isRequired;
            }
            return dateOfBirth.copy(obj, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$NationalIdentification;", "", "", "valueShortMasked", "", "isRequired", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$NationalIdentification;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValueShortMasked", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NationalIdentification {
        public static final int $stable = 0;
        private final boolean isRequired;
        private final java.lang.String valueShortMasked;

        public NationalIdentification(java.lang.String str, boolean z) {
            this.valueShortMasked = str;
            this.isRequired = z;
        }

        public final java.lang.String getValueShortMasked() {
            return this.valueShortMasked;
        }

        public final boolean isRequired() {
            return this.isRequired;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.valueShortMasked;
            boolean z = this.isRequired;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NationalIdentification(valueShortMasked=");
            sb.append(str);
            sb.append(", isRequired=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.valueShortMasked;
            return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isRequired);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.NationalIdentification)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.NationalIdentification nationalIdentification = (com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.NationalIdentification) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.valueShortMasked, nationalIdentification.valueShortMasked) && this.isRequired == nationalIdentification.isRequired;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.NationalIdentification copy(java.lang.String valueShortMasked, boolean isRequired) {
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.NationalIdentification(valueShortMasked, isRequired);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValueShortMasked() {
            return this.valueShortMasked;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.NationalIdentification copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.NationalIdentification nationalIdentification, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = nationalIdentification.valueShortMasked;
            }
            if ((i & 2) != 0) {
                z = nationalIdentification.isRequired;
            }
            return nationalIdentification.copy(str, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Phone;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionPhoneType;", "type", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionPhoneType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionPhoneType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionPhoneType;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Phone;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionPhoneType;", "getType", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Phone {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionPhoneType type;
        private final java.lang.String value;

        public Phone(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionPhoneType bNPLAcquisitionPhoneType, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLAcquisitionPhoneType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.type = bNPLAcquisitionPhoneType;
            this.value = str;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionPhoneType getType() {
            return this.type;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionPhoneType bNPLAcquisitionPhoneType = this.type;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Phone(type=");
            sb.append(bNPLAcquisitionPhoneType);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.type.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Phone)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Phone phone = (com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Phone) other;
            return this.type == phone.type && kotlin.jvm.internal.Intrinsics.areEqual(this.value, phone.value);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Phone copy(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionPhoneType type, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Phone(type, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionPhoneType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Phone copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.Phone phone, com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionPhoneType bNPLAcquisitionPhoneType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bNPLAcquisitionPhoneType = phone.type;
            }
            if ((i & 2) != 0) {
                str = phone.value;
            }
            return phone.copy(bNPLAcquisitionPhoneType, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$PaymentFundingInstrument;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnBankAccount;", "onBankAccount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnCard;", "onCard", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnBankAccount;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnCard;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnBankAccount;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnCard;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnBankAccount;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnCard;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$PaymentFundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnBankAccount;", "getOnBankAccount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnCard;", "getOnCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentFundingInstrument {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount onBankAccount;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard onCard;

        public PaymentFundingInstrument(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount onBankAccount, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard onCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onBankAccount = onBankAccount;
            this.onCard = onCard;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount getOnBankAccount() {
            return this.onBankAccount;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard getOnCard() {
            return this.onCard;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount onBankAccount = this.onBankAccount;
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard onCard = this.onCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentFundingInstrument(__typename=");
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
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount onBankAccount = this.onBankAccount;
            int hashCode2 = onBankAccount == null ? 0 : onBankAccount.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard onCard = this.onCard;
            return (((hashCode * 31) + hashCode2) * 31) + (onCard != null ? onCard.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.PaymentFundingInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.PaymentFundingInstrument paymentFundingInstrument = (com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.PaymentFundingInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, paymentFundingInstrument.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBankAccount, paymentFundingInstrument.onBankAccount) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCard, paymentFundingInstrument.onCard);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.PaymentFundingInstrument copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount onBankAccount, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard onCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.PaymentFundingInstrument(__typename, onBankAccount, onCard);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard getOnCard() {
            return this.onCard;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount getOnBankAccount() {
            return this.onBankAccount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.PaymentFundingInstrument copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.PaymentFundingInstrument paymentFundingInstrument, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount onBankAccount, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard onCard, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = paymentFundingInstrument.__typename;
            }
            if ((i & 2) != 0) {
                onBankAccount = paymentFundingInstrument.onBankAccount;
            }
            if ((i & 4) != 0) {
                onCard = paymentFundingInstrument.onCard;
            }
            return paymentFundingInstrument.copy(str, onBankAccount, onCard);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnBankAccount;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;", "bnplAcquisitionBankFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnBankAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;", "getBnplAcquisitionBankFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBankAccount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment;

        public OnBankAccount(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionBankFragment, "");
            this.__typename = str;
            this.bnplAcquisitionBankFragment = bnplAcquisitionBankFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment getBnplAcquisitionBankFragment() {
            return this.bnplAcquisitionBankFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment = this.bnplAcquisitionBankFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBankAccount(__typename=");
            sb.append(str);
            sb.append(", bnplAcquisitionBankFragment=");
            sb.append(bnplAcquisitionBankFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplAcquisitionBankFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount onBankAccount = (com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBankAccount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionBankFragment, onBankAccount.bnplAcquisitionBankFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionBankFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount(__typename, bnplAcquisitionBankFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment getBnplAcquisitionBankFragment() {
            return this.bnplAcquisitionBankFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount onBankAccount, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBankAccount.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionBankFragment = onBankAccount.bnplAcquisitionBankFragment;
            }
            return onBankAccount.copy(str, bnplAcquisitionBankFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnCard;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;", "bnplAcquisitionCardFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnCard;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;", "getBnplAcquisitionCardFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCard {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment;

        public OnCard(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionCardFragment, "");
            this.__typename = str;
            this.bnplAcquisitionCardFragment = bnplAcquisitionCardFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment getBnplAcquisitionCardFragment() {
            return this.bnplAcquisitionCardFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment = this.bnplAcquisitionCardFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCard(__typename=");
            sb.append(str);
            sb.append(", bnplAcquisitionCardFragment=");
            sb.append(bnplAcquisitionCardFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplAcquisitionCardFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard onCard = (com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onCard.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionCardFragment, onCard.bnplAcquisitionCardFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionCardFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard(__typename, bnplAcquisitionCardFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment getBnplAcquisitionCardFragment() {
            return this.bnplAcquisitionCardFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard onCard, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCard.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionCardFragment = onCard.bnplAcquisitionCardFragment;
            }
            return onCard.copy(str, bnplAcquisitionCardFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$SelectedPaymentFundingInstrument;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnBankAccount1;", "onBankAccount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnCard1;", "onCard", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnBankAccount1;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnCard1;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnBankAccount1;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnCard1;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnBankAccount1;Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnCard1;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$SelectedPaymentFundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnBankAccount1;", "getOnBankAccount", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnCard1;", "getOnCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SelectedPaymentFundingInstrument {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount1 onBankAccount;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard1 onCard;

        public SelectedPaymentFundingInstrument(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount1 onBankAccount1, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard1 onCard1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onBankAccount = onBankAccount1;
            this.onCard = onCard1;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount1 getOnBankAccount() {
            return this.onBankAccount;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard1 getOnCard() {
            return this.onCard;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount1 onBankAccount1 = this.onBankAccount;
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard1 onCard1 = this.onCard;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectedPaymentFundingInstrument(__typename=");
            sb.append(str);
            sb.append(", onBankAccount=");
            sb.append(onBankAccount1);
            sb.append(", onCard=");
            sb.append(onCard1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount1 onBankAccount1 = this.onBankAccount;
            int hashCode2 = onBankAccount1 == null ? 0 : onBankAccount1.hashCode();
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard1 onCard1 = this.onCard;
            return (((hashCode * 31) + hashCode2) * 31) + (onCard1 != null ? onCard1.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.SelectedPaymentFundingInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.SelectedPaymentFundingInstrument selectedPaymentFundingInstrument = (com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.SelectedPaymentFundingInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, selectedPaymentFundingInstrument.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBankAccount, selectedPaymentFundingInstrument.onBankAccount) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCard, selectedPaymentFundingInstrument.onCard);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.SelectedPaymentFundingInstrument copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount1 onBankAccount, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard1 onCard) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.SelectedPaymentFundingInstrument(__typename, onBankAccount, onCard);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard1 getOnCard() {
            return this.onCard;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount1 getOnBankAccount() {
            return this.onBankAccount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.SelectedPaymentFundingInstrument copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.SelectedPaymentFundingInstrument selectedPaymentFundingInstrument, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount1 onBankAccount1, com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard1 onCard1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = selectedPaymentFundingInstrument.__typename;
            }
            if ((i & 2) != 0) {
                onBankAccount1 = selectedPaymentFundingInstrument.onBankAccount;
            }
            if ((i & 4) != 0) {
                onCard1 = selectedPaymentFundingInstrument.onCard;
            }
            return selectedPaymentFundingInstrument.copy(str, onBankAccount1, onCard1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnBankAccount1;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;", "bnplAcquisitionBankFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnBankAccount1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionBankFragment;", "getBnplAcquisitionBankFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBankAccount1 {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment;

        public OnBankAccount1(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionBankFragment, "");
            this.__typename = str;
            this.bnplAcquisitionBankFragment = bnplAcquisitionBankFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment getBnplAcquisitionBankFragment() {
            return this.bnplAcquisitionBankFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment = this.bnplAcquisitionBankFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBankAccount1(__typename=");
            sb.append(str);
            sb.append(", bnplAcquisitionBankFragment=");
            sb.append(bnplAcquisitionBankFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplAcquisitionBankFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount1)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount1 onBankAccount1 = (com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onBankAccount1.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionBankFragment, onBankAccount1.bnplAcquisitionBankFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount1 copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionBankFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount1(__typename, bnplAcquisitionBankFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment getBnplAcquisitionBankFragment() {
            return this.bnplAcquisitionBankFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount1 copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnBankAccount1 onBankAccount1, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment bnplAcquisitionBankFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBankAccount1.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionBankFragment = onBankAccount1.bnplAcquisitionBankFragment;
            }
            return onBankAccount1.copy(str, bnplAcquisitionBankFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnCard1;", "", "", "__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;", "bnplAcquisitionCardFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnCard1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionCardFragment;", "getBnplAcquisitionCardFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCard1 {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment;

        public OnCard1(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionCardFragment, "");
            this.__typename = str;
            this.bnplAcquisitionCardFragment = bnplAcquisitionCardFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment getBnplAcquisitionCardFragment() {
            return this.bnplAcquisitionCardFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment = this.bnplAcquisitionCardFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnCard1(__typename=");
            sb.append(str);
            sb.append(", bnplAcquisitionCardFragment=");
            sb.append(bnplAcquisitionCardFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.bnplAcquisitionCardFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard1)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard1 onCard1 = (com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, onCard1.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.bnplAcquisitionCardFragment, onCard1.bnplAcquisitionCardFragment);
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard1 copy(java.lang.String __typename, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionCardFragment, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard1(__typename, bnplAcquisitionCardFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment getBnplAcquisitionCardFragment() {
            return this.bnplAcquisitionCardFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard1 copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnCard1 onCard1, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment bnplAcquisitionCardFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onCard1.__typename;
            }
            if ((i & 2) != 0) {
                bnplAcquisitionCardFragment = onCard1.bnplAcquisitionCardFragment;
            }
            return onCard1.copy(str, bnplAcquisitionCardFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnInitializeBNPLApplicationDecline;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;", "reason", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$OnInitializeBNPLApplicationDecline;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLAcquisitionApplicationDeclineReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnInitializeBNPLApplicationDecline {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason reason;

        public OnInitializeBNPLApplicationDecline(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLAcquisitionApplicationDeclineReason, "");
            this.reason = bNPLAcquisitionApplicationDeclineReason;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnInitializeBNPLApplicationDecline(reason=");
            sb.append(bNPLAcquisitionApplicationDeclineReason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationDecline) && this.reason == ((com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationDecline) other).reason;
        }

        public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationDecline copy(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationDecline(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationDecline copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation.OnInitializeBNPLApplicationDecline onInitializeBNPLApplicationDecline, com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bNPLAcquisitionApplicationDeclineReason = onInitializeBNPLApplicationDecline.reason;
            }
            return onInitializeBNPLApplicationDecline.copy(bNPLAcquisitionApplicationDeclineReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/InitializeBnplApplicationMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation InitializeBnplApplication($input: InitializeBNPLApplicationInput!, $includeAnnualIncome: Boolean!, $includeNationalIdentification: Boolean!, $includePaymentFundingInstruments: Boolean!, $includeSelectedPaymentFundingInstrument: Boolean!) { initializeBnplApplication(input: $input) { __typename ... on InitializeBNPLApplicationSuccess { application { creditAccountId documents { __typename ...BnplAcquisitionDocumentFragment } loanAmount { __typename ...BnplAcquisitionMoneyFragment } userProfile { name { givenName fullName surname } addresses { __typename ...BnplAcquisitionAddressFragment } annualIncome @include(if: $includeAnnualIncome) { amount { __typename ...BnplAcquisitionMoneyFragment } isRequired } billingAddress { __typename ...BnplAcquisitionAddressFragment } dateOfBirth { birthDate isRequired } nationalIdentification @include(if: $includeNationalIdentification) { valueShortMasked isRequired } phone { type value } } paymentFundingInstruments @include(if: $includePaymentFundingInstruments) { __typename ... on BankAccount { __typename ...BnplAcquisitionBankFragment } ... on Card { __typename ...BnplAcquisitionCardFragment } } selectedPaymentFundingInstrument @include(if: $includeSelectedPaymentFundingInstrument) { __typename ... on BankAccount { __typename ...BnplAcquisitionBankFragment } ... on Card { __typename ...BnplAcquisitionCardFragment } } } } ... on InitializeBNPLApplicationDecline { reason } } }  fragment BnplAcquisitionDocumentFragment on BNPLAcquisitionDocument { downloadLink { fileName relativePath staticUrl type } viewLink { fileName relativePath staticUrl type } type html }  fragment BnplAcquisitionMoneyFragment on Money { currencyCode value }  fragment BnplAcquisitionAddressFragment on AddressPortable { addressLine1 addressLine2 adminArea1 adminArea2 postalCode countryCode }  fragment BnplAcquisitionBankFragment on BankAccount { id type lastNChars bankIssuer: issuer { name } institutionImages { url } }  fragment BnplAcquisitionCardFragment on Card { id cardIssuer: issuer { name } lastNChars cardArt { primaryImage { baseCdnLinkPath } } productClass }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationInput initializeBNPLApplicationInput = this.input;
        boolean z = this.includeAnnualIncome;
        boolean z2 = this.includeNationalIdentification;
        boolean z3 = this.includePaymentFundingInstruments;
        boolean z4 = this.includeSelectedPaymentFundingInstrument;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InitializeBnplApplicationMutation(input=");
        sb.append(initializeBNPLApplicationInput);
        sb.append(", includeAnnualIncome=");
        sb.append(z);
        sb.append(", includeNationalIdentification=");
        sb.append(z2);
        sb.append(", includePaymentFundingInstruments=");
        sb.append(z3);
        sb.append(", includeSelectedPaymentFundingInstrument=");
        sb.append(z4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.input.hashCode() * 31) + java.lang.Boolean.hashCode(this.includeAnnualIncome)) * 31) + java.lang.Boolean.hashCode(this.includeNationalIdentification)) * 31) + java.lang.Boolean.hashCode(this.includePaymentFundingInstruments)) * 31) + java.lang.Boolean.hashCode(this.includeSelectedPaymentFundingInstrument);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation initializeBnplApplicationMutation = (com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.input, initializeBnplApplicationMutation.input) && this.includeAnnualIncome == initializeBnplApplicationMutation.includeAnnualIncome && this.includeNationalIdentification == initializeBnplApplicationMutation.includeNationalIdentification && this.includePaymentFundingInstruments == initializeBnplApplicationMutation.includePaymentFundingInstruments && this.includeSelectedPaymentFundingInstrument == initializeBnplApplicationMutation.includeSelectedPaymentFundingInstrument;
    }

    public final com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation copy(com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationInput input, boolean includeAnnualIncome, boolean includeNationalIdentification, boolean includePaymentFundingInstruments, boolean includeSelectedPaymentFundingInstrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation(input, includeAnnualIncome, includeNationalIdentification, includePaymentFundingInstruments, includeSelectedPaymentFundingInstrument);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIncludeSelectedPaymentFundingInstrument() {
        return this.includeSelectedPaymentFundingInstrument;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIncludePaymentFundingInstruments() {
        return this.includePaymentFundingInstruments;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIncludeNationalIdentification() {
        return this.includeNationalIdentification;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIncludeAnnualIncome() {
        return this.includeAnnualIncome;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation copy$default(com.paypal.oslo.feature.bnplacquisition.graphql.InitializeBnplApplicationMutation initializeBnplApplicationMutation, com.paypal.oslo.api.graphql.schema.type.InitializeBNPLApplicationInput initializeBNPLApplicationInput, boolean z, boolean z2, boolean z3, boolean z4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            initializeBNPLApplicationInput = initializeBnplApplicationMutation.input;
        }
        if ((i & 2) != 0) {
            z = initializeBnplApplicationMutation.includeAnnualIncome;
        }
        boolean z5 = z;
        if ((i & 4) != 0) {
            z2 = initializeBnplApplicationMutation.includeNationalIdentification;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            z3 = initializeBnplApplicationMutation.includePaymentFundingInstruments;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            z4 = initializeBnplApplicationMutation.includeSelectedPaymentFundingInstrument;
        }
        return initializeBnplApplicationMutation.copy(initializeBNPLApplicationInput, z5, z6, z7, z4);
    }
}
