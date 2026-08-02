package com.paypal.oslo.feature.savings.graphql;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000e;<=>?@ABCDEFG:B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010(JH\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00052\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u00172\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b2\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b4\u0010#R\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010%R\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b7\u0010%R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010("}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountFeaturesInput;", "savingsAccountFeaturesInput", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountsInput;", "savingsAccountsInput", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxesInput;", "moneyboxesInput", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRoutePreferencesInput;", "smartRoutePreferencesInput", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountFeaturesInput;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/SmartRoutePreferencesInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountFeaturesInput;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/SmartRoutePreferencesInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountFeaturesInput;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/SmartRoutePreferencesInput;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountFeaturesInput;", "getSavingsAccountFeaturesInput", "Lcom/apollographql/apollo/api/Optional;", "getSavingsAccountsInput", "getMoneyboxesInput", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRoutePreferencesInput;", "getSmartRoutePreferencesInput", "Companion", "Data", "SavingsAccountFeatures", "SavingsAccount", "TotalBalance", "TotalNonGoalBalance", "TotalGoalsBalance", "Moneybox", "Moneyboxes", "Item", "SavingsInterest", "MonthToDateInterest", "LifetimeInterest", com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GetSavingsHubDataQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Data> {
    public static final java.lang.String OPERATION_ID = "2975c919beca15277cbb0c61dba8f904659a5b75bfbd1ebf7c452448c36da9d5";
    public static final java.lang.String OPERATION_NAME = "GetSavingsHubData";
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyboxesInput> moneyboxesInput;
    private final com.paypal.oslo.api.graphql.schema.type.SavingsAccountFeaturesInput savingsAccountFeaturesInput;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SavingsAccountsInput> savingsAccountsInput;
    private final com.paypal.oslo.api.graphql.schema.type.SmartRoutePreferencesInput smartRoutePreferencesInput;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Companion INSTANCE = new com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Companion(null);
    public static final int $stable = 8;

    public GetSavingsHubDataQuery(com.paypal.oslo.api.graphql.schema.type.SavingsAccountFeaturesInput savingsAccountFeaturesInput, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SavingsAccountsInput> optional, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyboxesInput> optional2, com.paypal.oslo.api.graphql.schema.type.SmartRoutePreferencesInput smartRoutePreferencesInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccountFeaturesInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRoutePreferencesInput, "");
        this.savingsAccountFeaturesInput = savingsAccountFeaturesInput;
        this.savingsAccountsInput = optional;
        this.moneyboxesInput = optional2;
        this.smartRoutePreferencesInput = smartRoutePreferencesInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SavingsAccountFeaturesInput getSavingsAccountFeaturesInput() {
        return this.savingsAccountFeaturesInput;
    }

    public /* synthetic */ GetSavingsHubDataQuery(com.paypal.oslo.api.graphql.schema.type.SavingsAccountFeaturesInput savingsAccountFeaturesInput, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.paypal.oslo.api.graphql.schema.type.SmartRoutePreferencesInput smartRoutePreferencesInput, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(savingsAccountFeaturesInput, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, smartRoutePreferencesInput);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SavingsAccountsInput> getSavingsAccountsInput() {
        return this.savingsAccountsInput;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyboxesInput> getMoneyboxesInput() {
        return this.moneyboxesInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SmartRoutePreferencesInput getSmartRoutePreferencesInput() {
        return this.smartRoutePreferencesInput;
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
        com.paypal.oslo.feature.savings.graphql.adapter.GetSavingsHubDataQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.GetSavingsHubDataQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.savings.graphql.selections.GetSavingsHubDataQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JN\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0010R$\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0014R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SavingsAccountFeatures;", "savingsAccountFeatures", "", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SavingsAccount;", "savingsAccounts", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Moneyboxes;", "moneyboxes", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SavingsInterest;", "savingsInterest", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SmartRoutePreferences;", "smartRoutePreferences", "<init>", "(Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SavingsAccountFeatures;Ljava/util/List;Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Moneyboxes;Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SavingsInterest;Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SmartRoutePreferences;)V", "component1", "()Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SavingsAccountFeatures;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Moneyboxes;", "component4", "()Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SavingsInterest;", "component5", "()Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SmartRoutePreferences;", "copy", "(Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SavingsAccountFeatures;Ljava/util/List;Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Moneyboxes;Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SavingsInterest;Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SmartRoutePreferences;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SavingsAccountFeatures;", "getSavingsAccountFeatures", "Ljava/util/List;", "getSavingsAccounts", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Moneyboxes;", "getMoneyboxes", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SavingsInterest;", "getSavingsInterest", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SmartRoutePreferences;", "getSmartRoutePreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneyboxes moneyboxes;
        private final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccountFeatures savingsAccountFeatures;
        private final java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccount> savingsAccounts;
        private final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsInterest savingsInterest;
        private final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SmartRoutePreferences smartRoutePreferences;

        public Data(com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccountFeatures savingsAccountFeatures, java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccount> list, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneyboxes moneyboxes, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsInterest savingsInterest, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SmartRoutePreferences smartRoutePreferences) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccountFeatures, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsInterest, "");
            this.savingsAccountFeatures = savingsAccountFeatures;
            this.savingsAccounts = list;
            this.moneyboxes = moneyboxes;
            this.savingsInterest = savingsInterest;
            this.smartRoutePreferences = smartRoutePreferences;
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccountFeatures getSavingsAccountFeatures() {
            return this.savingsAccountFeatures;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccount> getSavingsAccounts() {
            return this.savingsAccounts;
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneyboxes getMoneyboxes() {
            return this.moneyboxes;
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsInterest getSavingsInterest() {
            return this.savingsInterest;
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SmartRoutePreferences getSmartRoutePreferences() {
            return this.smartRoutePreferences;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccountFeatures savingsAccountFeatures = this.savingsAccountFeatures;
            java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccount> list = this.savingsAccounts;
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneyboxes moneyboxes = this.moneyboxes;
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsInterest savingsInterest = this.savingsInterest;
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SmartRoutePreferences smartRoutePreferences = this.smartRoutePreferences;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(savingsAccountFeatures=");
            sb.append(savingsAccountFeatures);
            sb.append(", savingsAccounts=");
            sb.append(list);
            sb.append(", moneyboxes=");
            sb.append(moneyboxes);
            sb.append(", savingsInterest=");
            sb.append(savingsInterest);
            sb.append(", smartRoutePreferences=");
            sb.append(smartRoutePreferences);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.savingsAccountFeatures.hashCode();
            java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccount> list = this.savingsAccounts;
            int hashCode2 = list == null ? 0 : list.hashCode();
            int hashCode3 = this.moneyboxes.hashCode();
            int hashCode4 = this.savingsInterest.hashCode();
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SmartRoutePreferences smartRoutePreferences = this.smartRoutePreferences;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (smartRoutePreferences != null ? smartRoutePreferences.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Data)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Data data = (com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Data) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.savingsAccountFeatures, data.savingsAccountFeatures) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsAccounts, data.savingsAccounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyboxes, data.moneyboxes) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsInterest, data.savingsInterest) && kotlin.jvm.internal.Intrinsics.areEqual(this.smartRoutePreferences, data.smartRoutePreferences);
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Data copy(com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccountFeatures savingsAccountFeatures, java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccount> savingsAccounts, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneyboxes moneyboxes, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsInterest savingsInterest, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SmartRoutePreferences smartRoutePreferences) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccountFeatures, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsInterest, "");
            return new com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Data(savingsAccountFeatures, savingsAccounts, moneyboxes, savingsInterest, smartRoutePreferences);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SmartRoutePreferences getSmartRoutePreferences() {
            return this.smartRoutePreferences;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsInterest getSavingsInterest() {
            return this.savingsInterest;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneyboxes getMoneyboxes() {
            return this.moneyboxes;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccount> component2() {
            return this.savingsAccounts;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccountFeatures getSavingsAccountFeatures() {
            return this.savingsAccountFeatures;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Data copy$default(com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Data data, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccountFeatures savingsAccountFeatures, java.util.List list, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneyboxes moneyboxes, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsInterest savingsInterest, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SmartRoutePreferences smartRoutePreferences, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                savingsAccountFeatures = data.savingsAccountFeatures;
            }
            if ((i & 2) != 0) {
                list = data.savingsAccounts;
            }
            java.util.List list2 = list;
            if ((i & 4) != 0) {
                moneyboxes = data.moneyboxes;
            }
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneyboxes moneyboxes2 = moneyboxes;
            if ((i & 8) != 0) {
                savingsInterest = data.savingsInterest;
            }
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsInterest savingsInterest2 = savingsInterest;
            if ((i & 16) != 0) {
                smartRoutePreferences = data.smartRoutePreferences;
            }
            return data.copy(savingsAccountFeatures, list2, moneyboxes2, savingsInterest2, smartRoutePreferences);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J$\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0017\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SavingsAccountFeatures;", "", "annualPercentageYield", "countryCode", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SavingsAccountFeatures;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getAnnualPercentageYield", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SavingsAccountFeatures {
        public static final int $stable = 8;
        private final java.lang.Object annualPercentageYield;
        private final java.lang.Object countryCode;

        public SavingsAccountFeatures(java.lang.Object obj, java.lang.Object obj2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
            this.annualPercentageYield = obj;
            this.countryCode = obj2;
        }

        public final java.lang.Object getAnnualPercentageYield() {
            return this.annualPercentageYield;
        }

        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.annualPercentageYield;
            java.lang.Object obj2 = this.countryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsAccountFeatures(annualPercentageYield=");
            sb.append(obj);
            sb.append(", countryCode=");
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.annualPercentageYield.hashCode() * 31) + this.countryCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccountFeatures)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccountFeatures savingsAccountFeatures = (com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccountFeatures) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.annualPercentageYield, savingsAccountFeatures.annualPercentageYield) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, savingsAccountFeatures.countryCode);
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccountFeatures copy(java.lang.Object annualPercentageYield, java.lang.Object countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annualPercentageYield, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccountFeatures(annualPercentageYield, countryCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getAnnualPercentageYield() {
            return this.annualPercentageYield;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccountFeatures copy$default(com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccountFeatures savingsAccountFeatures, java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                obj = savingsAccountFeatures.annualPercentageYield;
            }
            if ((i & 2) != 0) {
                obj2 = savingsAccountFeatures.countryCode;
            }
            return savingsAccountFeatures.copy(obj, obj2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jr\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b3\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b4\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b<\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SavingsAccount;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;", "accountStatus", "", "electronic1099OptIn", "backupWithholdingEnabled", "moneyboxId", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$TotalBalance;", "totalBalance", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$TotalNonGoalBalance;", "totalNonGoalBalance", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$TotalGoalsBalance;", "totalGoalsBalance", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Moneybox;", "moneybox", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;ZZLjava/lang/String;Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$TotalBalance;Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$TotalNonGoalBalance;Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$TotalGoalsBalance;Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Moneybox;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;", "component3", "()Z", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$TotalBalance;", "component7", "()Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$TotalNonGoalBalance;", "component8", "()Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$TotalGoalsBalance;", "component9", "()Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Moneybox;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;ZZLjava/lang/String;Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$TotalBalance;Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$TotalNonGoalBalance;Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$TotalGoalsBalance;Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Moneybox;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SavingsAccount;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;", "getAccountStatus", "Z", "getElectronic1099OptIn", "getBackupWithholdingEnabled", "getMoneyboxId", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$TotalBalance;", "getTotalBalance", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$TotalNonGoalBalance;", "getTotalNonGoalBalance", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$TotalGoalsBalance;", "getTotalGoalsBalance", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Moneybox;", "getMoneybox"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SavingsAccount {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus accountStatus;
        private final boolean backupWithholdingEnabled;
        private final boolean electronic1099OptIn;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneybox moneybox;
        private final java.lang.String moneyboxId;
        private final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalBalance totalBalance;
        private final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalGoalsBalance totalGoalsBalance;
        private final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalNonGoalBalance totalNonGoalBalance;

        public SavingsAccount(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus savingsAccountStatus, boolean z, boolean z2, java.lang.String str2, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalBalance totalBalance, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalNonGoalBalance totalNonGoalBalance, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalGoalsBalance totalGoalsBalance, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneybox moneybox) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccountStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.accountStatus = savingsAccountStatus;
            this.electronic1099OptIn = z;
            this.backupWithholdingEnabled = z2;
            this.moneyboxId = str2;
            this.totalBalance = totalBalance;
            this.totalNonGoalBalance = totalNonGoalBalance;
            this.totalGoalsBalance = totalGoalsBalance;
            this.moneybox = moneybox;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus getAccountStatus() {
            return this.accountStatus;
        }

        public final boolean getElectronic1099OptIn() {
            return this.electronic1099OptIn;
        }

        public final boolean getBackupWithholdingEnabled() {
            return this.backupWithholdingEnabled;
        }

        public final java.lang.String getMoneyboxId() {
            return this.moneyboxId;
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalBalance getTotalBalance() {
            return this.totalBalance;
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalNonGoalBalance getTotalNonGoalBalance() {
            return this.totalNonGoalBalance;
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalGoalsBalance getTotalGoalsBalance() {
            return this.totalGoalsBalance;
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneybox getMoneybox() {
            return this.moneybox;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus savingsAccountStatus = this.accountStatus;
            boolean z = this.electronic1099OptIn;
            boolean z2 = this.backupWithholdingEnabled;
            java.lang.String str2 = this.moneyboxId;
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalBalance totalBalance = this.totalBalance;
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalNonGoalBalance totalNonGoalBalance = this.totalNonGoalBalance;
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalGoalsBalance totalGoalsBalance = this.totalGoalsBalance;
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneybox moneybox = this.moneybox;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsAccount(id=");
            sb.append(str);
            sb.append(", accountStatus=");
            sb.append(savingsAccountStatus);
            sb.append(", electronic1099OptIn=");
            sb.append(z);
            sb.append(", backupWithholdingEnabled=");
            sb.append(z2);
            sb.append(", moneyboxId=");
            sb.append(str2);
            sb.append(", totalBalance=");
            sb.append(totalBalance);
            sb.append(", totalNonGoalBalance=");
            sb.append(totalNonGoalBalance);
            sb.append(", totalGoalsBalance=");
            sb.append(totalGoalsBalance);
            sb.append(", moneybox=");
            sb.append(moneybox);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.accountStatus.hashCode();
            int hashCode3 = java.lang.Boolean.hashCode(this.electronic1099OptIn);
            int hashCode4 = java.lang.Boolean.hashCode(this.backupWithholdingEnabled);
            int hashCode5 = this.moneyboxId.hashCode();
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalBalance totalBalance = this.totalBalance;
            int hashCode6 = totalBalance == null ? 0 : totalBalance.hashCode();
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalNonGoalBalance totalNonGoalBalance = this.totalNonGoalBalance;
            int hashCode7 = totalNonGoalBalance == null ? 0 : totalNonGoalBalance.hashCode();
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalGoalsBalance totalGoalsBalance = this.totalGoalsBalance;
            int hashCode8 = totalGoalsBalance == null ? 0 : totalGoalsBalance.hashCode();
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneybox moneybox = this.moneybox;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (moneybox != null ? moneybox.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccount)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccount savingsAccount = (com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, savingsAccount.id) && this.accountStatus == savingsAccount.accountStatus && this.electronic1099OptIn == savingsAccount.electronic1099OptIn && this.backupWithholdingEnabled == savingsAccount.backupWithholdingEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyboxId, savingsAccount.moneyboxId) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalBalance, savingsAccount.totalBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalNonGoalBalance, savingsAccount.totalNonGoalBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalGoalsBalance, savingsAccount.totalGoalsBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneybox, savingsAccount.moneybox);
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccount copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus accountStatus, boolean electronic1099OptIn, boolean backupWithholdingEnabled, java.lang.String moneyboxId, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalBalance totalBalance, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalNonGoalBalance totalNonGoalBalance, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalGoalsBalance totalGoalsBalance, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneybox moneybox) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxId, "");
            return new com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccount(id, accountStatus, electronic1099OptIn, backupWithholdingEnabled, moneyboxId, totalBalance, totalNonGoalBalance, totalGoalsBalance, moneybox);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneybox getMoneybox() {
            return this.moneybox;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalGoalsBalance getTotalGoalsBalance() {
            return this.totalGoalsBalance;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalNonGoalBalance getTotalNonGoalBalance() {
            return this.totalNonGoalBalance;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalBalance getTotalBalance() {
            return this.totalBalance;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getMoneyboxId() {
            return this.moneyboxId;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getBackupWithholdingEnabled() {
            return this.backupWithholdingEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getElectronic1099OptIn() {
            return this.electronic1099OptIn;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus getAccountStatus() {
            return this.accountStatus;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$TotalBalance;", "", "", "__typename", "Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyFragment;", "savingsMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyFragment;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$TotalBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyFragment;", "getSavingsMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalBalance {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment savingsMoneyFragment;

        public TotalBalance(java.lang.String str, com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment savingsMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsMoneyFragment, "");
            this.__typename = str;
            this.savingsMoneyFragment = savingsMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment getSavingsMoneyFragment() {
            return this.savingsMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment savingsMoneyFragment = this.savingsMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalBalance(__typename=");
            sb.append(str);
            sb.append(", savingsMoneyFragment=");
            sb.append(savingsMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.savingsMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalBalance)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalBalance totalBalance = (com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalBalance.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsMoneyFragment, totalBalance.savingsMoneyFragment);
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalBalance copy(java.lang.String __typename, com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment savingsMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsMoneyFragment, "");
            return new com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalBalance(__typename, savingsMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment getSavingsMoneyFragment() {
            return this.savingsMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalBalance copy$default(com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalBalance totalBalance, java.lang.String str, com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment savingsMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = totalBalance.__typename;
            }
            if ((i & 2) != 0) {
                savingsMoneyFragment = totalBalance.savingsMoneyFragment;
            }
            return totalBalance.copy(str, savingsMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$TotalNonGoalBalance;", "", "", "__typename", "Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyFragment;", "savingsMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyFragment;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$TotalNonGoalBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyFragment;", "getSavingsMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalNonGoalBalance {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment savingsMoneyFragment;

        public TotalNonGoalBalance(java.lang.String str, com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment savingsMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsMoneyFragment, "");
            this.__typename = str;
            this.savingsMoneyFragment = savingsMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment getSavingsMoneyFragment() {
            return this.savingsMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment savingsMoneyFragment = this.savingsMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalNonGoalBalance(__typename=");
            sb.append(str);
            sb.append(", savingsMoneyFragment=");
            sb.append(savingsMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.savingsMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalNonGoalBalance)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalNonGoalBalance totalNonGoalBalance = (com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalNonGoalBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalNonGoalBalance.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsMoneyFragment, totalNonGoalBalance.savingsMoneyFragment);
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalNonGoalBalance copy(java.lang.String __typename, com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment savingsMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsMoneyFragment, "");
            return new com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalNonGoalBalance(__typename, savingsMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment getSavingsMoneyFragment() {
            return this.savingsMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalNonGoalBalance copy$default(com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalNonGoalBalance totalNonGoalBalance, java.lang.String str, com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment savingsMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = totalNonGoalBalance.__typename;
            }
            if ((i & 2) != 0) {
                savingsMoneyFragment = totalNonGoalBalance.savingsMoneyFragment;
            }
            return totalNonGoalBalance.copy(str, savingsMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$TotalGoalsBalance;", "", "", "__typename", "Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyFragment;", "savingsMoneyFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyFragment;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$TotalGoalsBalance;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyFragment;", "getSavingsMoneyFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalGoalsBalance {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment savingsMoneyFragment;

        public TotalGoalsBalance(java.lang.String str, com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment savingsMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsMoneyFragment, "");
            this.__typename = str;
            this.savingsMoneyFragment = savingsMoneyFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment getSavingsMoneyFragment() {
            return this.savingsMoneyFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment savingsMoneyFragment = this.savingsMoneyFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalGoalsBalance(__typename=");
            sb.append(str);
            sb.append(", savingsMoneyFragment=");
            sb.append(savingsMoneyFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.savingsMoneyFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalGoalsBalance)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalGoalsBalance totalGoalsBalance = (com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalGoalsBalance) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, totalGoalsBalance.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsMoneyFragment, totalGoalsBalance.savingsMoneyFragment);
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalGoalsBalance copy(java.lang.String __typename, com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment savingsMoneyFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsMoneyFragment, "");
            return new com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalGoalsBalance(__typename, savingsMoneyFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment getSavingsMoneyFragment() {
            return this.savingsMoneyFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalGoalsBalance copy$default(com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalGoalsBalance totalGoalsBalance, java.lang.String str, com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment savingsMoneyFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = totalGoalsBalance.__typename;
            }
            if ((i & 2) != 0) {
                savingsMoneyFragment = totalGoalsBalance.savingsMoneyFragment;
            }
            return totalGoalsBalance.copy(str, savingsMoneyFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Moneybox;", "", "", "__typename", "Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment;", "savingsMoneyBoxFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Moneybox;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment;", "getSavingsMoneyBoxFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Moneybox {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment savingsMoneyBoxFragment;

        public Moneybox(java.lang.String str, com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment savingsMoneyBoxFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsMoneyBoxFragment, "");
            this.__typename = str;
            this.savingsMoneyBoxFragment = savingsMoneyBoxFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment getSavingsMoneyBoxFragment() {
            return this.savingsMoneyBoxFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment savingsMoneyBoxFragment = this.savingsMoneyBoxFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Moneybox(__typename=");
            sb.append(str);
            sb.append(", savingsMoneyBoxFragment=");
            sb.append(savingsMoneyBoxFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.savingsMoneyBoxFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneybox)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneybox moneybox = (com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneybox) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, moneybox.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsMoneyBoxFragment, moneybox.savingsMoneyBoxFragment);
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneybox copy(java.lang.String __typename, com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment savingsMoneyBoxFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsMoneyBoxFragment, "");
            return new com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneybox(__typename, savingsMoneyBoxFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment getSavingsMoneyBoxFragment() {
            return this.savingsMoneyBoxFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneybox copy$default(com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneybox moneybox, java.lang.String str, com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment savingsMoneyBoxFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = moneybox.__typename;
            }
            if ((i & 2) != 0) {
                savingsMoneyBoxFragment = moneybox.savingsMoneyBoxFragment;
            }
            return moneybox.copy(str, savingsMoneyBoxFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Moneyboxes;", "", "", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Item;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Moneyboxes;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Moneyboxes {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Item> items;

        public Moneyboxes(java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Item> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.items = list;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Item> getItems() {
            return this.items;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Item> list = this.items;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Moneyboxes(items=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.items.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneyboxes) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneyboxes) other).items);
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneyboxes copy(java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Item> items) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
            return new com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneyboxes(items);
        }

        public final java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Item> component1() {
            return this.items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneyboxes copy$default(com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneyboxes moneyboxes, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = moneyboxes.items;
            }
            return moneyboxes.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Item;", "", "", "__typename", "Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment;", "savingsMoneyBoxFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment;", "getSavingsMoneyBoxFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment savingsMoneyBoxFragment;

        public Item(java.lang.String str, com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment savingsMoneyBoxFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsMoneyBoxFragment, "");
            this.__typename = str;
            this.savingsMoneyBoxFragment = savingsMoneyBoxFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment getSavingsMoneyBoxFragment() {
            return this.savingsMoneyBoxFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment savingsMoneyBoxFragment = this.savingsMoneyBoxFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(__typename=");
            sb.append(str);
            sb.append(", savingsMoneyBoxFragment=");
            sb.append(savingsMoneyBoxFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.savingsMoneyBoxFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Item)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Item item = (com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, item.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsMoneyBoxFragment, item.savingsMoneyBoxFragment);
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Item copy(java.lang.String __typename, com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment savingsMoneyBoxFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsMoneyBoxFragment, "");
            return new com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Item(__typename, savingsMoneyBoxFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment getSavingsMoneyBoxFragment() {
            return this.savingsMoneyBoxFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Item copy$default(com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Item item, java.lang.String str, com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment savingsMoneyBoxFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.__typename;
            }
            if ((i & 2) != 0) {
                savingsMoneyBoxFragment = item.savingsMoneyBoxFragment;
            }
            return item.copy(str, savingsMoneyBoxFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SavingsInterest;", "", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$MonthToDateInterest;", "monthToDateInterest", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$LifetimeInterest;", "lifetimeInterest", "<init>", "(Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$MonthToDateInterest;Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$LifetimeInterest;)V", "component1", "()Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$MonthToDateInterest;", "component2", "()Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$LifetimeInterest;", "copy", "(Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$MonthToDateInterest;Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$LifetimeInterest;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SavingsInterest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$MonthToDateInterest;", "getMonthToDateInterest", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$LifetimeInterest;", "getLifetimeInterest"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SavingsInterest {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.LifetimeInterest lifetimeInterest;
        private final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.MonthToDateInterest monthToDateInterest;

        public SavingsInterest(com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.MonthToDateInterest monthToDateInterest, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.LifetimeInterest lifetimeInterest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthToDateInterest, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifetimeInterest, "");
            this.monthToDateInterest = monthToDateInterest;
            this.lifetimeInterest = lifetimeInterest;
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.MonthToDateInterest getMonthToDateInterest() {
            return this.monthToDateInterest;
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.LifetimeInterest getLifetimeInterest() {
            return this.lifetimeInterest;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.MonthToDateInterest monthToDateInterest = this.monthToDateInterest;
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.LifetimeInterest lifetimeInterest = this.lifetimeInterest;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsInterest(monthToDateInterest=");
            sb.append(monthToDateInterest);
            sb.append(", lifetimeInterest=");
            sb.append(lifetimeInterest);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.monthToDateInterest.hashCode() * 31) + this.lifetimeInterest.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsInterest)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsInterest savingsInterest = (com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsInterest) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.monthToDateInterest, savingsInterest.monthToDateInterest) && kotlin.jvm.internal.Intrinsics.areEqual(this.lifetimeInterest, savingsInterest.lifetimeInterest);
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsInterest copy(com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.MonthToDateInterest monthToDateInterest, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.LifetimeInterest lifetimeInterest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthToDateInterest, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifetimeInterest, "");
            return new com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsInterest(monthToDateInterest, lifetimeInterest);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.LifetimeInterest getLifetimeInterest() {
            return this.lifetimeInterest;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.MonthToDateInterest getMonthToDateInterest() {
            return this.monthToDateInterest;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsInterest copy$default(com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsInterest savingsInterest, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.MonthToDateInterest monthToDateInterest, com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.LifetimeInterest lifetimeInterest, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                monthToDateInterest = savingsInterest.monthToDateInterest;
            }
            if ((i & 2) != 0) {
                lifetimeInterest = savingsInterest.lifetimeInterest;
            }
            return savingsInterest.copy(monthToDateInterest, lifetimeInterest);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$MonthToDateInterest;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$MonthToDateInterest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Ljava/lang/Object;", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MonthToDateInterest {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public MonthToDateInterest(java.lang.String str, java.lang.Object obj) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MonthToDateInterest(value=");
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
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.MonthToDateInterest)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.MonthToDateInterest monthToDateInterest = (com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.MonthToDateInterest) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, monthToDateInterest.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, monthToDateInterest.currencyCode);
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.MonthToDateInterest copy(java.lang.String value, java.lang.Object currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.MonthToDateInterest(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.MonthToDateInterest copy$default(com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.MonthToDateInterest monthToDateInterest, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = monthToDateInterest.value;
            }
            if ((i & 2) != 0) {
                obj = monthToDateInterest.currencyCode;
            }
            return monthToDateInterest.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$LifetimeInterest;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$LifetimeInterest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Ljava/lang/Object;", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LifetimeInterest {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public LifetimeInterest(java.lang.String str, java.lang.Object obj) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LifetimeInterest(value=");
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
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.LifetimeInterest)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.LifetimeInterest lifetimeInterest = (com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.LifetimeInterest) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, lifetimeInterest.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, lifetimeInterest.currencyCode);
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.LifetimeInterest copy(java.lang.String value, java.lang.Object currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.LifetimeInterest(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.LifetimeInterest copy$default(com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.LifetimeInterest lifetimeInterest, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = lifetimeInterest.value;
            }
            if ((i & 2) != 0) {
                obj = lifetimeInterest.currencyCode;
            }
            return lifetimeInterest.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SmartRoutePreferences;", "", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;", "status", "", "version", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$SmartRoutePreferences;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/SmartRouteStatus;", "getStatus", "Ljava/lang/String;", "getVersion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SmartRoutePreferences {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus status;
        private final java.lang.String version;

        public SmartRoutePreferences(com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus smartRouteStatus, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.status = smartRouteStatus;
            this.version = str;
        }

        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus getStatus() {
            return this.status;
        }

        public final java.lang.String getVersion() {
            return this.version;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus smartRouteStatus = this.status;
            java.lang.String str = this.version;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SmartRoutePreferences(status=");
            sb.append(smartRouteStatus);
            sb.append(", version=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.status.hashCode() * 31) + this.version.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SmartRoutePreferences)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SmartRoutePreferences smartRoutePreferences = (com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SmartRoutePreferences) other;
            return this.status == smartRoutePreferences.status && kotlin.jvm.internal.Intrinsics.areEqual(this.version, smartRoutePreferences.version);
        }

        public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SmartRoutePreferences copy(com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus status, java.lang.String version) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
            return new com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SmartRoutePreferences(status, version);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getVersion() {
            return this.version;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SmartRoutePreferences copy$default(com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SmartRoutePreferences smartRoutePreferences, com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus smartRouteStatus, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                smartRouteStatus = smartRoutePreferences.status;
            }
            if ((i & 2) != 0) {
                str = smartRoutePreferences.version;
            }
            return smartRoutePreferences.copy(smartRouteStatus, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetSavingsHubData($savingsAccountFeaturesInput: SavingsAccountFeaturesInput!, $savingsAccountsInput: SavingsAccountsInput, $moneyboxesInput: MoneyboxesInput, $smartRoutePreferencesInput: SmartRoutePreferencesInput!) { savingsAccountFeatures(input: $savingsAccountFeaturesInput) { annualPercentageYield countryCode } savingsAccounts(input: $savingsAccountsInput) { id accountStatus electronic1099OptIn backupWithholdingEnabled moneyboxId totalBalance { __typename ...SavingsMoneyFragment } totalNonGoalBalance { __typename ...SavingsMoneyFragment } totalGoalsBalance { __typename ...SavingsMoneyFragment } moneybox { __typename ...SavingsMoneyBoxFragment } } moneyboxes(input: $moneyboxesInput) { items { __typename ...SavingsMoneyBoxFragment } } savingsInterest { monthToDateInterest { value currencyCode } lifetimeInterest { value currencyCode } } smartRoutePreferences(input: $smartRoutePreferencesInput) { status version } }  fragment SavingsMoneyFragment on Money { currencyCode value }  fragment SavingsMoneyBoxFragment on Moneybox { id name description type targetAmount { __typename ...SavingsMoneyFragment } currentBalance { __typename ...SavingsMoneyFragment } pendingAmount { __typename ...SavingsMoneyFragment } category status transferSettings { id startDate nextReloadDate recurrence financialInstrumentId financialInstrumentName lastFourChars reloadAmount { value currencyCode } status type } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.SavingsAccountFeaturesInput savingsAccountFeaturesInput = this.savingsAccountFeaturesInput;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SavingsAccountsInput> optional = this.savingsAccountsInput;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyboxesInput> optional2 = this.moneyboxesInput;
        com.paypal.oslo.api.graphql.schema.type.SmartRoutePreferencesInput smartRoutePreferencesInput = this.smartRoutePreferencesInput;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetSavingsHubDataQuery(savingsAccountFeaturesInput=");
        sb.append(savingsAccountFeaturesInput);
        sb.append(", savingsAccountsInput=");
        sb.append(optional);
        sb.append(", moneyboxesInput=");
        sb.append(optional2);
        sb.append(", smartRoutePreferencesInput=");
        sb.append(smartRoutePreferencesInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.savingsAccountFeaturesInput.hashCode() * 31) + this.savingsAccountsInput.hashCode()) * 31) + this.moneyboxesInput.hashCode()) * 31) + this.smartRoutePreferencesInput.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery)) {
            return false;
        }
        com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery getSavingsHubDataQuery = (com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.savingsAccountFeaturesInput, getSavingsHubDataQuery.savingsAccountFeaturesInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsAccountsInput, getSavingsHubDataQuery.savingsAccountsInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyboxesInput, getSavingsHubDataQuery.moneyboxesInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.smartRoutePreferencesInput, getSavingsHubDataQuery.smartRoutePreferencesInput);
    }

    public final com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery copy(com.paypal.oslo.api.graphql.schema.type.SavingsAccountFeaturesInput savingsAccountFeaturesInput, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SavingsAccountsInput> savingsAccountsInput, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyboxesInput> moneyboxesInput, com.paypal.oslo.api.graphql.schema.type.SmartRoutePreferencesInput smartRoutePreferencesInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccountFeaturesInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccountsInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxesInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRoutePreferencesInput, "");
        return new com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery(savingsAccountFeaturesInput, savingsAccountsInput, moneyboxesInput, smartRoutePreferencesInput);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.SmartRoutePreferencesInput getSmartRoutePreferencesInput() {
        return this.smartRoutePreferencesInput;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyboxesInput> component3() {
        return this.moneyboxesInput;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.SavingsAccountsInput> component2() {
        return this.savingsAccountsInput;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.SavingsAccountFeaturesInput getSavingsAccountFeaturesInput() {
        return this.savingsAccountFeaturesInput;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery copy$default(com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery getSavingsHubDataQuery, com.paypal.oslo.api.graphql.schema.type.SavingsAccountFeaturesInput savingsAccountFeaturesInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.paypal.oslo.api.graphql.schema.type.SmartRoutePreferencesInput smartRoutePreferencesInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            savingsAccountFeaturesInput = getSavingsHubDataQuery.savingsAccountFeaturesInput;
        }
        if ((i & 2) != 0) {
            optional = getSavingsHubDataQuery.savingsAccountsInput;
        }
        if ((i & 4) != 0) {
            optional2 = getSavingsHubDataQuery.moneyboxesInput;
        }
        if ((i & 8) != 0) {
            smartRoutePreferencesInput = getSavingsHubDataQuery.smartRoutePreferencesInput;
        }
        return getSavingsHubDataQuery.copy(savingsAccountFeaturesInput, optional, optional2, smartRoutePreferencesInput);
    }
}
