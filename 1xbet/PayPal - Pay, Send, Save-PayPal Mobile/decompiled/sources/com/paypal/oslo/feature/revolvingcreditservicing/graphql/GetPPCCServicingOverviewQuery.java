package com.paypal.oslo.feature.revolvingcreditservicing.graphql;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u001056789:;<=>?@ABC4B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u001e\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u0005HÆ\u0003¢\u0006\u0004\b%\u0010$JD\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u0005HÆ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u0010\"R\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010$R(\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b3\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "creditProductIdentifier", "Lcom/apollographql/apollo/api/Optional;", "", "creditAccountId", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditExternalWalletTokenInput;", "externalWalletTokens", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "getCreditProductIdentifier", "Lcom/apollographql/apollo/api/Optional;", "getCreditAccountId", "getExternalWalletTokens", "Companion", "Data", "RevolvingCreditAccount", "RevolvingCreditActivities", "RevolvingCreditAutopay", "RevolvingCreditPayment", "RevolvingCreditInstrument", "RevolvingCreditPushProvisioning", "RevolvingCreditServicingContent", "Legal", "Payments", "RevolvingCreditCustomerProfile", "RevolvingCreditHistoricalPromotionalActivities", "RevolvingCreditNotificationPreference", "RevolvingCreditServicingPrioritizedAccountActionComponent", "RevolvingCreditServicingUnenrolledAccountFeatureComponent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GetPPCCServicingOverviewQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Data> {
    public static final java.lang.String OPERATION_ID = "f51ba2c81e3c48eb9efde5365f35cbe859671e9f1c69ca5cbc244a46e994a325";
    public static final java.lang.String OPERATION_NAME = "GetPPCCServicingOverview";
    private final com.apollographql.apollo.api.Optional<java.lang.Object> creditAccountId;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier;
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditExternalWalletTokenInput>> externalWalletTokens;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public GetPPCCServicingOverviewQuery(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditExternalWalletTokenInput>> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.creditProductIdentifier = revolvingCreditProductIdentifier;
        this.creditAccountId = optional;
        this.externalWalletTokens = optional2;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public /* synthetic */ GetPPCCServicingOverviewQuery(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(revolvingCreditProductIdentifier, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getCreditAccountId() {
        return this.creditAccountId;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditExternalWalletTokenInput>> getExternalWalletTokens() {
        return this.externalWalletTokens;
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
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetPPCCServicingOverviewQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetPPCCServicingOverviewQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.revolvingcreditservicing.graphql.selections.GetPPCCServicingOverviewQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\b\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010$J\u0012\u0010+\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b/\u0010$J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b0\u0010$J¾\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\b2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010<\u001a\u00020;HÖ\u0001¢\u0006\u0004\b<\u0010=R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bC\u0010\"R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010$R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bF\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\bH\u0010'R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bJ\u0010)R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bK\u0010$R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010L\u001a\u0004\bM\u0010,R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010N\u001a\u0004\bO\u0010.R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010D\u001a\u0004\bP\u0010$R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010D\u001a\u0004\bQ\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditAccount;", "revolvingCreditAccount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditActivities;", "revolvingCreditActivities", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditAutopay;", "revolvingCreditAutopay", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditPayment;", "revolvingCreditPayments", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditInstrument;", "revolvingCreditInstruments", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditPushProvisioning;", "revolvingCreditPushProvisioning", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditServicingContent;", "revolvingCreditServicingContent", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditCustomerProfile;", "revolvingCreditCustomerProfiles", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditHistoricalPromotionalActivities;", com.paypal.oslo.feature.revolvingcreditservicing.data.network.fields.AccountSummaryFields.PROMOS, "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditNotificationPreference;", com.paypal.oslo.feature.revolvingcreditservicing.data.network.fields.AccountSummaryFields.NOTIFICATION_PREFERENCE, "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditServicingPrioritizedAccountActionComponent;", "revolvingCreditServicingPrioritizedAccountActionComponents", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditServicingUnenrolledAccountFeatureComponent;", com.paypal.oslo.feature.revolvingcreditservicing.data.network.fields.AccountSummaryFields.UNENROLLED_ACCOUNT_FEATURES, "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditAccount;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditActivities;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditAutopay;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditPushProvisioning;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditServicingContent;Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditHistoricalPromotionalActivities;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditNotificationPreference;Ljava/util/List;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditAccount;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditActivities;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditAutopay;", "component4", "()Ljava/util/List;", "component5", "component6", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditPushProvisioning;", "component7", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditServicingContent;", "component8", "component9", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditHistoricalPromotionalActivities;", "component10", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditNotificationPreference;", "component11", "component12", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditAccount;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditActivities;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditAutopay;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditPushProvisioning;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditServicingContent;Ljava/util/List;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditHistoricalPromotionalActivities;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditNotificationPreference;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditAccount;", "getRevolvingCreditAccount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditActivities;", "getRevolvingCreditActivities", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditAutopay;", "getRevolvingCreditAutopay", "Ljava/util/List;", "getRevolvingCreditPayments", "getRevolvingCreditInstruments", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditPushProvisioning;", "getRevolvingCreditPushProvisioning", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditServicingContent;", "getRevolvingCreditServicingContent", "getRevolvingCreditCustomerProfiles", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditHistoricalPromotionalActivities;", "getRevolvingCreditHistoricalPromotionalActivities", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditNotificationPreference;", "getRevolvingCreditNotificationPreference", "getRevolvingCreditServicingPrioritizedAccountActionComponents", "getRevolvingCreditServicingUnenrolledAccountFeatureComponents"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditActivities revolvingCreditActivities;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditCustomerProfile> revolvingCreditCustomerProfiles;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditHistoricalPromotionalActivities revolvingCreditHistoricalPromotionalActivities;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditInstrument> revolvingCreditInstruments;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditNotificationPreference revolvingCreditNotificationPreference;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPayment> revolvingCreditPayments;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPushProvisioning revolvingCreditPushProvisioning;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingPrioritizedAccountActionComponent> revolvingCreditServicingPrioritizedAccountActionComponents;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent> revolvingCreditServicingUnenrolledAccountFeatureComponents;

        public Data(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditActivities revolvingCreditActivities, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPayment> list, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditInstrument> list2, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPushProvisioning revolvingCreditPushProvisioning, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditCustomerProfile> list3, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditHistoricalPromotionalActivities revolvingCreditHistoricalPromotionalActivities, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditNotificationPreference revolvingCreditNotificationPreference, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingPrioritizedAccountActionComponent> list4, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent> list5) {
            this.revolvingCreditAccount = revolvingCreditAccount;
            this.revolvingCreditActivities = revolvingCreditActivities;
            this.revolvingCreditAutopay = revolvingCreditAutopay;
            this.revolvingCreditPayments = list;
            this.revolvingCreditInstruments = list2;
            this.revolvingCreditPushProvisioning = revolvingCreditPushProvisioning;
            this.revolvingCreditServicingContent = revolvingCreditServicingContent;
            this.revolvingCreditCustomerProfiles = list3;
            this.revolvingCreditHistoricalPromotionalActivities = revolvingCreditHistoricalPromotionalActivities;
            this.revolvingCreditNotificationPreference = revolvingCreditNotificationPreference;
            this.revolvingCreditServicingPrioritizedAccountActionComponents = list4;
            this.revolvingCreditServicingUnenrolledAccountFeatureComponents = list5;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAccount getRevolvingCreditAccount() {
            return this.revolvingCreditAccount;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditActivities getRevolvingCreditActivities() {
            return this.revolvingCreditActivities;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAutopay getRevolvingCreditAutopay() {
            return this.revolvingCreditAutopay;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPayment> getRevolvingCreditPayments() {
            return this.revolvingCreditPayments;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditInstrument> getRevolvingCreditInstruments() {
            return this.revolvingCreditInstruments;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPushProvisioning getRevolvingCreditPushProvisioning() {
            return this.revolvingCreditPushProvisioning;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingContent getRevolvingCreditServicingContent() {
            return this.revolvingCreditServicingContent;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditCustomerProfile> getRevolvingCreditCustomerProfiles() {
            return this.revolvingCreditCustomerProfiles;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditHistoricalPromotionalActivities getRevolvingCreditHistoricalPromotionalActivities() {
            return this.revolvingCreditHistoricalPromotionalActivities;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditNotificationPreference getRevolvingCreditNotificationPreference() {
            return this.revolvingCreditNotificationPreference;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingPrioritizedAccountActionComponent> getRevolvingCreditServicingPrioritizedAccountActionComponents() {
            return this.revolvingCreditServicingPrioritizedAccountActionComponents;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent> getRevolvingCreditServicingUnenrolledAccountFeatureComponents() {
            return this.revolvingCreditServicingUnenrolledAccountFeatureComponents;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount = this.revolvingCreditAccount;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditActivities revolvingCreditActivities = this.revolvingCreditActivities;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay = this.revolvingCreditAutopay;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPayment> list = this.revolvingCreditPayments;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditInstrument> list2 = this.revolvingCreditInstruments;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPushProvisioning revolvingCreditPushProvisioning = this.revolvingCreditPushProvisioning;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent = this.revolvingCreditServicingContent;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditCustomerProfile> list3 = this.revolvingCreditCustomerProfiles;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditHistoricalPromotionalActivities revolvingCreditHistoricalPromotionalActivities = this.revolvingCreditHistoricalPromotionalActivities;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditNotificationPreference revolvingCreditNotificationPreference = this.revolvingCreditNotificationPreference;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingPrioritizedAccountActionComponent> list4 = this.revolvingCreditServicingPrioritizedAccountActionComponents;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent> list5 = this.revolvingCreditServicingUnenrolledAccountFeatureComponents;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(revolvingCreditAccount=");
            sb.append(revolvingCreditAccount);
            sb.append(", revolvingCreditActivities=");
            sb.append(revolvingCreditActivities);
            sb.append(", revolvingCreditAutopay=");
            sb.append(revolvingCreditAutopay);
            sb.append(", revolvingCreditPayments=");
            sb.append(list);
            sb.append(", revolvingCreditInstruments=");
            sb.append(list2);
            sb.append(", revolvingCreditPushProvisioning=");
            sb.append(revolvingCreditPushProvisioning);
            sb.append(", revolvingCreditServicingContent=");
            sb.append(revolvingCreditServicingContent);
            sb.append(", revolvingCreditCustomerProfiles=");
            sb.append(list3);
            sb.append(", revolvingCreditHistoricalPromotionalActivities=");
            sb.append(revolvingCreditHistoricalPromotionalActivities);
            sb.append(", revolvingCreditNotificationPreference=");
            sb.append(revolvingCreditNotificationPreference);
            sb.append(", revolvingCreditServicingPrioritizedAccountActionComponents=");
            sb.append(list4);
            sb.append(", revolvingCreditServicingUnenrolledAccountFeatureComponents=");
            sb.append(list5);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount = this.revolvingCreditAccount;
            int hashCode = revolvingCreditAccount == null ? 0 : revolvingCreditAccount.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditActivities revolvingCreditActivities = this.revolvingCreditActivities;
            int hashCode2 = revolvingCreditActivities == null ? 0 : revolvingCreditActivities.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay = this.revolvingCreditAutopay;
            int hashCode3 = revolvingCreditAutopay == null ? 0 : revolvingCreditAutopay.hashCode();
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPayment> list = this.revolvingCreditPayments;
            int hashCode4 = list == null ? 0 : list.hashCode();
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditInstrument> list2 = this.revolvingCreditInstruments;
            int hashCode5 = list2 == null ? 0 : list2.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPushProvisioning revolvingCreditPushProvisioning = this.revolvingCreditPushProvisioning;
            int hashCode6 = revolvingCreditPushProvisioning == null ? 0 : revolvingCreditPushProvisioning.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent = this.revolvingCreditServicingContent;
            int hashCode7 = revolvingCreditServicingContent == null ? 0 : revolvingCreditServicingContent.hashCode();
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditCustomerProfile> list3 = this.revolvingCreditCustomerProfiles;
            int hashCode8 = list3 == null ? 0 : list3.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditHistoricalPromotionalActivities revolvingCreditHistoricalPromotionalActivities = this.revolvingCreditHistoricalPromotionalActivities;
            int hashCode9 = revolvingCreditHistoricalPromotionalActivities == null ? 0 : revolvingCreditHistoricalPromotionalActivities.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditNotificationPreference revolvingCreditNotificationPreference = this.revolvingCreditNotificationPreference;
            int hashCode10 = revolvingCreditNotificationPreference == null ? 0 : revolvingCreditNotificationPreference.hashCode();
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingPrioritizedAccountActionComponent> list4 = this.revolvingCreditServicingPrioritizedAccountActionComponents;
            int hashCode11 = list4 == null ? 0 : list4.hashCode();
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent> list5 = this.revolvingCreditServicingUnenrolledAccountFeatureComponents;
            return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (list5 != null ? list5.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Data)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Data data = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Data) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditAccount, data.revolvingCreditAccount) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditActivities, data.revolvingCreditActivities) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditAutopay, data.revolvingCreditAutopay) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditPayments, data.revolvingCreditPayments) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditInstruments, data.revolvingCreditInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditPushProvisioning, data.revolvingCreditPushProvisioning) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditServicingContent, data.revolvingCreditServicingContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditCustomerProfiles, data.revolvingCreditCustomerProfiles) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditHistoricalPromotionalActivities, data.revolvingCreditHistoricalPromotionalActivities) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditNotificationPreference, data.revolvingCreditNotificationPreference) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditServicingPrioritizedAccountActionComponents, data.revolvingCreditServicingPrioritizedAccountActionComponents) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditServicingUnenrolledAccountFeatureComponents, data.revolvingCreditServicingUnenrolledAccountFeatureComponents);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Data copy(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditActivities revolvingCreditActivities, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPayment> revolvingCreditPayments, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditInstrument> revolvingCreditInstruments, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPushProvisioning revolvingCreditPushProvisioning, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditCustomerProfile> revolvingCreditCustomerProfiles, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditHistoricalPromotionalActivities revolvingCreditHistoricalPromotionalActivities, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditNotificationPreference revolvingCreditNotificationPreference, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingPrioritizedAccountActionComponent> revolvingCreditServicingPrioritizedAccountActionComponents, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent> revolvingCreditServicingUnenrolledAccountFeatureComponents) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Data(revolvingCreditAccount, revolvingCreditActivities, revolvingCreditAutopay, revolvingCreditPayments, revolvingCreditInstruments, revolvingCreditPushProvisioning, revolvingCreditServicingContent, revolvingCreditCustomerProfiles, revolvingCreditHistoricalPromotionalActivities, revolvingCreditNotificationPreference, revolvingCreditServicingPrioritizedAccountActionComponents, revolvingCreditServicingUnenrolledAccountFeatureComponents);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditHistoricalPromotionalActivities getRevolvingCreditHistoricalPromotionalActivities() {
            return this.revolvingCreditHistoricalPromotionalActivities;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditCustomerProfile> component8() {
            return this.revolvingCreditCustomerProfiles;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingContent getRevolvingCreditServicingContent() {
            return this.revolvingCreditServicingContent;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPushProvisioning getRevolvingCreditPushProvisioning() {
            return this.revolvingCreditPushProvisioning;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditInstrument> component5() {
            return this.revolvingCreditInstruments;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPayment> component4() {
            return this.revolvingCreditPayments;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAutopay getRevolvingCreditAutopay() {
            return this.revolvingCreditAutopay;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditActivities getRevolvingCreditActivities() {
            return this.revolvingCreditActivities;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent> component12() {
            return this.revolvingCreditServicingUnenrolledAccountFeatureComponents;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingPrioritizedAccountActionComponent> component11() {
            return this.revolvingCreditServicingPrioritizedAccountActionComponents;
        }

        /* renamed from: component10, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditNotificationPreference getRevolvingCreditNotificationPreference() {
            return this.revolvingCreditNotificationPreference;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAccount getRevolvingCreditAccount() {
            return this.revolvingCreditAccount;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditAccount;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAccountFragment;", "revolvingCreditAccountFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAccountFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAccountFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAccountFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAccountFragment;", "getRevolvingCreditAccountFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCreditAccount {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment;

        public RevolvingCreditAccount(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditAccountFragment, "");
            this.__typename = str;
            this.revolvingCreditAccountFragment = revolvingCreditAccountFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment getRevolvingCreditAccountFragment() {
            return this.revolvingCreditAccountFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment = this.revolvingCreditAccountFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditAccount(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditAccountFragment=");
            sb.append(revolvingCreditAccountFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditAccountFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAccount)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, revolvingCreditAccount.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditAccountFragment, revolvingCreditAccount.revolvingCreditAccountFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAccount copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditAccountFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAccount(__typename, revolvingCreditAccountFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment getRevolvingCreditAccountFragment() {
            return this.revolvingCreditAccountFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAccount copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAccount revolvingCreditAccount, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAccountFragment revolvingCreditAccountFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = revolvingCreditAccount.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditAccountFragment = revolvingCreditAccount.revolvingCreditAccountFragment;
            }
            return revolvingCreditAccount.copy(str, revolvingCreditAccountFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditActivities;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment;", "revolvingCreditActivitiesFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditActivities;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditActivitiesFragment;", "getRevolvingCreditActivitiesFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCreditActivities {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment revolvingCreditActivitiesFragment;

        public RevolvingCreditActivities(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment revolvingCreditActivitiesFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditActivitiesFragment, "");
            this.__typename = str;
            this.revolvingCreditActivitiesFragment = revolvingCreditActivitiesFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment getRevolvingCreditActivitiesFragment() {
            return this.revolvingCreditActivitiesFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment revolvingCreditActivitiesFragment = this.revolvingCreditActivitiesFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditActivities(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditActivitiesFragment=");
            sb.append(revolvingCreditActivitiesFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditActivitiesFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditActivities)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditActivities revolvingCreditActivities = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditActivities) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, revolvingCreditActivities.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditActivitiesFragment, revolvingCreditActivities.revolvingCreditActivitiesFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditActivities copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment revolvingCreditActivitiesFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditActivitiesFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditActivities(__typename, revolvingCreditActivitiesFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment getRevolvingCreditActivitiesFragment() {
            return this.revolvingCreditActivitiesFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditActivities copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditActivities revolvingCreditActivities, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditActivitiesFragment revolvingCreditActivitiesFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = revolvingCreditActivities.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditActivitiesFragment = revolvingCreditActivities.revolvingCreditActivitiesFragment;
            }
            return revolvingCreditActivities.copy(str, revolvingCreditActivitiesFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditAutopay;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAutopayFragment;", "revolvingCreditAutopayFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAutopayFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAutopayFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAutopayFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditAutopay;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditAutopayFragment;", "getRevolvingCreditAutopayFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCreditAutopay {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment revolvingCreditAutopayFragment;

        public RevolvingCreditAutopay(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment revolvingCreditAutopayFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditAutopayFragment, "");
            this.__typename = str;
            this.revolvingCreditAutopayFragment = revolvingCreditAutopayFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment getRevolvingCreditAutopayFragment() {
            return this.revolvingCreditAutopayFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment revolvingCreditAutopayFragment = this.revolvingCreditAutopayFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditAutopay(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditAutopayFragment=");
            sb.append(revolvingCreditAutopayFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditAutopayFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAutopay)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAutopay) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, revolvingCreditAutopay.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditAutopayFragment, revolvingCreditAutopay.revolvingCreditAutopayFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAutopay copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment revolvingCreditAutopayFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditAutopayFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAutopay(__typename, revolvingCreditAutopayFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment getRevolvingCreditAutopayFragment() {
            return this.revolvingCreditAutopayFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAutopay copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditAutopayFragment revolvingCreditAutopayFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = revolvingCreditAutopay.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditAutopayFragment = revolvingCreditAutopay.revolvingCreditAutopayFragment;
            }
            return revolvingCreditAutopay.copy(str, revolvingCreditAutopayFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditPayment;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentsFragment;", "revolvingCreditPaymentsFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentsFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentsFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentsFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditPayment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentsFragment;", "getRevolvingCreditPaymentsFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCreditPayment {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentsFragment revolvingCreditPaymentsFragment;

        public RevolvingCreditPayment(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentsFragment revolvingCreditPaymentsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPaymentsFragment, "");
            this.__typename = str;
            this.revolvingCreditPaymentsFragment = revolvingCreditPaymentsFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentsFragment getRevolvingCreditPaymentsFragment() {
            return this.revolvingCreditPaymentsFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentsFragment revolvingCreditPaymentsFragment = this.revolvingCreditPaymentsFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditPayment(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditPaymentsFragment=");
            sb.append(revolvingCreditPaymentsFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditPaymentsFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPayment)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPayment revolvingCreditPayment = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPayment) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, revolvingCreditPayment.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditPaymentsFragment, revolvingCreditPayment.revolvingCreditPaymentsFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPayment copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentsFragment revolvingCreditPaymentsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPaymentsFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPayment(__typename, revolvingCreditPaymentsFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentsFragment getRevolvingCreditPaymentsFragment() {
            return this.revolvingCreditPaymentsFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPayment copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPayment revolvingCreditPayment, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentsFragment revolvingCreditPaymentsFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = revolvingCreditPayment.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditPaymentsFragment = revolvingCreditPayment.revolvingCreditPaymentsFragment;
            }
            return revolvingCreditPayment.copy(str, revolvingCreditPaymentsFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditInstrument;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditInstrumentsFragment;", "revolvingCreditInstrumentsFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditInstrumentsFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditInstrumentsFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditInstrumentsFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditInstrumentsFragment;", "getRevolvingCreditInstrumentsFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCreditInstrument {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment revolvingCreditInstrumentsFragment;

        public RevolvingCreditInstrument(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment revolvingCreditInstrumentsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditInstrumentsFragment, "");
            this.__typename = str;
            this.revolvingCreditInstrumentsFragment = revolvingCreditInstrumentsFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment getRevolvingCreditInstrumentsFragment() {
            return this.revolvingCreditInstrumentsFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment revolvingCreditInstrumentsFragment = this.revolvingCreditInstrumentsFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditInstrument(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditInstrumentsFragment=");
            sb.append(revolvingCreditInstrumentsFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditInstrumentsFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditInstrument revolvingCreditInstrument = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, revolvingCreditInstrument.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditInstrumentsFragment, revolvingCreditInstrument.revolvingCreditInstrumentsFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditInstrument copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment revolvingCreditInstrumentsFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditInstrumentsFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditInstrument(__typename, revolvingCreditInstrumentsFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment getRevolvingCreditInstrumentsFragment() {
            return this.revolvingCreditInstrumentsFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditInstrument copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditInstrument revolvingCreditInstrument, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditInstrumentsFragment revolvingCreditInstrumentsFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = revolvingCreditInstrument.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditInstrumentsFragment = revolvingCreditInstrument.revolvingCreditInstrumentsFragment;
            }
            return revolvingCreditInstrument.copy(str, revolvingCreditInstrumentsFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditPushProvisioning;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment;", "starPayWalletProvisioningFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditPushProvisioning;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment;", "getStarPayWalletProvisioningFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCreditPushProvisioning {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment starPayWalletProvisioningFragment;

        public RevolvingCreditPushProvisioning(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment starPayWalletProvisioningFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(starPayWalletProvisioningFragment, "");
            this.__typename = str;
            this.starPayWalletProvisioningFragment = starPayWalletProvisioningFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment getStarPayWalletProvisioningFragment() {
            return this.starPayWalletProvisioningFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment starPayWalletProvisioningFragment = this.starPayWalletProvisioningFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditPushProvisioning(__typename=");
            sb.append(str);
            sb.append(", starPayWalletProvisioningFragment=");
            sb.append(starPayWalletProvisioningFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.starPayWalletProvisioningFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPushProvisioning)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPushProvisioning revolvingCreditPushProvisioning = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPushProvisioning) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, revolvingCreditPushProvisioning.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.starPayWalletProvisioningFragment, revolvingCreditPushProvisioning.starPayWalletProvisioningFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPushProvisioning copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment starPayWalletProvisioningFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(starPayWalletProvisioningFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPushProvisioning(__typename, starPayWalletProvisioningFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment getStarPayWalletProvisioningFragment() {
            return this.starPayWalletProvisioningFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPushProvisioning copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditPushProvisioning revolvingCreditPushProvisioning, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment starPayWalletProvisioningFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = revolvingCreditPushProvisioning.__typename;
            }
            if ((i & 2) != 0) {
                starPayWalletProvisioningFragment = revolvingCreditPushProvisioning.starPayWalletProvisioningFragment;
            }
            return revolvingCreditPushProvisioning.copy(str, starPayWalletProvisioningFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditServicingContent;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$Legal;", "legal", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$Payments;", "payments", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment;", "revolvingCreditServicingContentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$Legal;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$Payments;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$Legal;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$Payments;", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$Legal;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$Payments;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditServicingContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$Legal;", "getLegal", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$Payments;", "getPayments", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingContentFragment;", "getRevolvingCreditServicingContentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCreditServicingContent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Legal legal;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Payments payments;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment revolvingCreditServicingContentFragment;

        public RevolvingCreditServicingContent(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Legal legal, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Payments payments, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment revolvingCreditServicingContentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingContentFragment, "");
            this.__typename = str;
            this.legal = legal;
            this.payments = payments;
            this.revolvingCreditServicingContentFragment = revolvingCreditServicingContentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Legal getLegal() {
            return this.legal;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Payments getPayments() {
            return this.payments;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment getRevolvingCreditServicingContentFragment() {
            return this.revolvingCreditServicingContentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Legal legal = this.legal;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Payments payments = this.payments;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment revolvingCreditServicingContentFragment = this.revolvingCreditServicingContentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditServicingContent(__typename=");
            sb.append(str);
            sb.append(", legal=");
            sb.append(legal);
            sb.append(", payments=");
            sb.append(payments);
            sb.append(", revolvingCreditServicingContentFragment=");
            sb.append(revolvingCreditServicingContentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Legal legal = this.legal;
            int hashCode2 = legal == null ? 0 : legal.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Payments payments = this.payments;
            return (((((hashCode * 31) + hashCode2) * 31) + (payments != null ? payments.hashCode() : 0)) * 31) + this.revolvingCreditServicingContentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingContent)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingContent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, revolvingCreditServicingContent.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.legal, revolvingCreditServicingContent.legal) && kotlin.jvm.internal.Intrinsics.areEqual(this.payments, revolvingCreditServicingContent.payments) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditServicingContentFragment, revolvingCreditServicingContent.revolvingCreditServicingContentFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingContent copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Legal legal, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Payments payments, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment revolvingCreditServicingContentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingContentFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingContent(__typename, legal, payments, revolvingCreditServicingContentFragment);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment getRevolvingCreditServicingContentFragment() {
            return this.revolvingCreditServicingContentFragment;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Payments getPayments() {
            return this.payments;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Legal getLegal() {
            return this.legal;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingContent copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Legal legal, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Payments payments, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingContentFragment revolvingCreditServicingContentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = revolvingCreditServicingContent.__typename;
            }
            if ((i & 2) != 0) {
                legal = revolvingCreditServicingContent.legal;
            }
            if ((i & 4) != 0) {
                payments = revolvingCreditServicingContent.payments;
            }
            if ((i & 8) != 0) {
                revolvingCreditServicingContentFragment = revolvingCreditServicingContent.revolvingCreditServicingContentFragment;
            }
            return revolvingCreditServicingContent.copy(str, legal, payments, revolvingCreditServicingContentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J(\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0017\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$Legal;", "", "eSignConsentUrl", "privacyStatementUrl", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$Legal;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getESignConsentUrl", "getPrivacyStatementUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Legal {
        public static final int $stable = 8;
        private final java.lang.Object eSignConsentUrl;
        private final java.lang.Object privacyStatementUrl;

        public Legal(java.lang.Object obj, java.lang.Object obj2) {
            this.eSignConsentUrl = obj;
            this.privacyStatementUrl = obj2;
        }

        public final java.lang.Object getESignConsentUrl() {
            return this.eSignConsentUrl;
        }

        public final java.lang.Object getPrivacyStatementUrl() {
            return this.privacyStatementUrl;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.eSignConsentUrl;
            java.lang.Object obj2 = this.privacyStatementUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Legal(eSignConsentUrl=");
            sb.append(obj);
            sb.append(", privacyStatementUrl=");
            sb.append(obj2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.eSignConsentUrl;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.privacyStatementUrl;
            return (hashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Legal)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Legal legal = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Legal) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.eSignConsentUrl, legal.eSignConsentUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.privacyStatementUrl, legal.privacyStatementUrl);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Legal copy(java.lang.Object eSignConsentUrl, java.lang.Object privacyStatementUrl) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Legal(eSignConsentUrl, privacyStatementUrl);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getPrivacyStatementUrl() {
            return this.privacyStatementUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getESignConsentUrl() {
            return this.eSignConsentUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Legal copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Legal legal, java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3) {
            if ((i & 1) != 0) {
                obj = legal.eSignConsentUrl;
            }
            if ((i & 2) != 0) {
                obj2 = legal.privacyStatementUrl;
            }
            return legal.copy(obj, obj2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\nJL\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001d\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001f\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b \u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$Payments;", "", "autopayTermsUrl", "oneTimePaymentTermsUrl", "paymentSecurityEntrypointUrl", "avoidInterestOnNextStatementGuideUrl", "noInterestPromotionCurrentAccruedInterestExplanationUrl", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$Payments;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getAutopayTermsUrl", "getOneTimePaymentTermsUrl", "getPaymentSecurityEntrypointUrl", "getAvoidInterestOnNextStatementGuideUrl", "getNoInterestPromotionCurrentAccruedInterestExplanationUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Payments {
        public static final int $stable = 8;
        private final java.lang.Object autopayTermsUrl;
        private final java.lang.Object avoidInterestOnNextStatementGuideUrl;
        private final java.lang.Object noInterestPromotionCurrentAccruedInterestExplanationUrl;
        private final java.lang.Object oneTimePaymentTermsUrl;
        private final java.lang.Object paymentSecurityEntrypointUrl;

        public Payments(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
            this.autopayTermsUrl = obj;
            this.oneTimePaymentTermsUrl = obj2;
            this.paymentSecurityEntrypointUrl = obj3;
            this.avoidInterestOnNextStatementGuideUrl = obj4;
            this.noInterestPromotionCurrentAccruedInterestExplanationUrl = obj5;
        }

        public final java.lang.Object getAutopayTermsUrl() {
            return this.autopayTermsUrl;
        }

        public final java.lang.Object getOneTimePaymentTermsUrl() {
            return this.oneTimePaymentTermsUrl;
        }

        public final java.lang.Object getPaymentSecurityEntrypointUrl() {
            return this.paymentSecurityEntrypointUrl;
        }

        public final java.lang.Object getAvoidInterestOnNextStatementGuideUrl() {
            return this.avoidInterestOnNextStatementGuideUrl;
        }

        public final java.lang.Object getNoInterestPromotionCurrentAccruedInterestExplanationUrl() {
            return this.noInterestPromotionCurrentAccruedInterestExplanationUrl;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.autopayTermsUrl;
            java.lang.Object obj2 = this.oneTimePaymentTermsUrl;
            java.lang.Object obj3 = this.paymentSecurityEntrypointUrl;
            java.lang.Object obj4 = this.avoidInterestOnNextStatementGuideUrl;
            java.lang.Object obj5 = this.noInterestPromotionCurrentAccruedInterestExplanationUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Payments(autopayTermsUrl=");
            sb.append(obj);
            sb.append(", oneTimePaymentTermsUrl=");
            sb.append(obj2);
            sb.append(", paymentSecurityEntrypointUrl=");
            sb.append(obj3);
            sb.append(", avoidInterestOnNextStatementGuideUrl=");
            sb.append(obj4);
            sb.append(", noInterestPromotionCurrentAccruedInterestExplanationUrl=");
            sb.append(obj5);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.autopayTermsUrl;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.oneTimePaymentTermsUrl;
            int hashCode2 = obj2 == null ? 0 : obj2.hashCode();
            java.lang.Object obj3 = this.paymentSecurityEntrypointUrl;
            int hashCode3 = obj3 == null ? 0 : obj3.hashCode();
            java.lang.Object obj4 = this.avoidInterestOnNextStatementGuideUrl;
            int hashCode4 = obj4 == null ? 0 : obj4.hashCode();
            java.lang.Object obj5 = this.noInterestPromotionCurrentAccruedInterestExplanationUrl;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (obj5 != null ? obj5.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Payments)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Payments payments = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Payments) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.autopayTermsUrl, payments.autopayTermsUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.oneTimePaymentTermsUrl, payments.oneTimePaymentTermsUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentSecurityEntrypointUrl, payments.paymentSecurityEntrypointUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.avoidInterestOnNextStatementGuideUrl, payments.avoidInterestOnNextStatementGuideUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.noInterestPromotionCurrentAccruedInterestExplanationUrl, payments.noInterestPromotionCurrentAccruedInterestExplanationUrl);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Payments copy(java.lang.Object autopayTermsUrl, java.lang.Object oneTimePaymentTermsUrl, java.lang.Object paymentSecurityEntrypointUrl, java.lang.Object avoidInterestOnNextStatementGuideUrl, java.lang.Object noInterestPromotionCurrentAccruedInterestExplanationUrl) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Payments(autopayTermsUrl, oneTimePaymentTermsUrl, paymentSecurityEntrypointUrl, avoidInterestOnNextStatementGuideUrl, noInterestPromotionCurrentAccruedInterestExplanationUrl);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Object getNoInterestPromotionCurrentAccruedInterestExplanationUrl() {
            return this.noInterestPromotionCurrentAccruedInterestExplanationUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getAvoidInterestOnNextStatementGuideUrl() {
            return this.avoidInterestOnNextStatementGuideUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getPaymentSecurityEntrypointUrl() {
            return this.paymentSecurityEntrypointUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getOneTimePaymentTermsUrl() {
            return this.oneTimePaymentTermsUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getAutopayTermsUrl() {
            return this.autopayTermsUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Payments copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Payments payments, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, int i, java.lang.Object obj6) {
            if ((i & 1) != 0) {
                obj = payments.autopayTermsUrl;
            }
            if ((i & 2) != 0) {
                obj2 = payments.oneTimePaymentTermsUrl;
            }
            java.lang.Object obj7 = obj2;
            if ((i & 4) != 0) {
                obj3 = payments.paymentSecurityEntrypointUrl;
            }
            java.lang.Object obj8 = obj3;
            if ((i & 8) != 0) {
                obj4 = payments.avoidInterestOnNextStatementGuideUrl;
            }
            java.lang.Object obj9 = obj4;
            if ((i & 16) != 0) {
                obj5 = payments.noInterestPromotionCurrentAccruedInterestExplanationUrl;
            }
            return payments.copy(obj, obj7, obj8, obj9, obj5);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditCustomerProfile;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerProfileFragment;", "revolvingCreditCustomerProfileFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerProfileFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerProfileFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerProfileFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditCustomerProfile;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditCustomerProfileFragment;", "getRevolvingCreditCustomerProfileFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCreditCustomerProfile {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment revolvingCreditCustomerProfileFragment;

        public RevolvingCreditCustomerProfile(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment revolvingCreditCustomerProfileFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditCustomerProfileFragment, "");
            this.__typename = str;
            this.revolvingCreditCustomerProfileFragment = revolvingCreditCustomerProfileFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment getRevolvingCreditCustomerProfileFragment() {
            return this.revolvingCreditCustomerProfileFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment revolvingCreditCustomerProfileFragment = this.revolvingCreditCustomerProfileFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditCustomerProfile(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditCustomerProfileFragment=");
            sb.append(revolvingCreditCustomerProfileFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditCustomerProfileFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditCustomerProfile)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditCustomerProfile revolvingCreditCustomerProfile = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditCustomerProfile) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, revolvingCreditCustomerProfile.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditCustomerProfileFragment, revolvingCreditCustomerProfile.revolvingCreditCustomerProfileFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditCustomerProfile copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment revolvingCreditCustomerProfileFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditCustomerProfileFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditCustomerProfile(__typename, revolvingCreditCustomerProfileFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment getRevolvingCreditCustomerProfileFragment() {
            return this.revolvingCreditCustomerProfileFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditCustomerProfile copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditCustomerProfile revolvingCreditCustomerProfile, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditCustomerProfileFragment revolvingCreditCustomerProfileFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = revolvingCreditCustomerProfile.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditCustomerProfileFragment = revolvingCreditCustomerProfile.revolvingCreditCustomerProfileFragment;
            }
            return revolvingCreditCustomerProfile.copy(str, revolvingCreditCustomerProfileFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditHistoricalPromotionalActivities;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment;", "revolvingCreditHistoricalPromotionalActivitiesFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditHistoricalPromotionalActivities;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditHistoricalPromotionalActivitiesFragment;", "getRevolvingCreditHistoricalPromotionalActivitiesFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCreditHistoricalPromotionalActivities {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment revolvingCreditHistoricalPromotionalActivitiesFragment;

        public RevolvingCreditHistoricalPromotionalActivities(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment revolvingCreditHistoricalPromotionalActivitiesFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditHistoricalPromotionalActivitiesFragment, "");
            this.__typename = str;
            this.revolvingCreditHistoricalPromotionalActivitiesFragment = revolvingCreditHistoricalPromotionalActivitiesFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment getRevolvingCreditHistoricalPromotionalActivitiesFragment() {
            return this.revolvingCreditHistoricalPromotionalActivitiesFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment revolvingCreditHistoricalPromotionalActivitiesFragment = this.revolvingCreditHistoricalPromotionalActivitiesFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditHistoricalPromotionalActivities(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditHistoricalPromotionalActivitiesFragment=");
            sb.append(revolvingCreditHistoricalPromotionalActivitiesFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditHistoricalPromotionalActivitiesFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditHistoricalPromotionalActivities)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditHistoricalPromotionalActivities revolvingCreditHistoricalPromotionalActivities = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditHistoricalPromotionalActivities) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, revolvingCreditHistoricalPromotionalActivities.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditHistoricalPromotionalActivitiesFragment, revolvingCreditHistoricalPromotionalActivities.revolvingCreditHistoricalPromotionalActivitiesFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditHistoricalPromotionalActivities copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment revolvingCreditHistoricalPromotionalActivitiesFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditHistoricalPromotionalActivitiesFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditHistoricalPromotionalActivities(__typename, revolvingCreditHistoricalPromotionalActivitiesFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment getRevolvingCreditHistoricalPromotionalActivitiesFragment() {
            return this.revolvingCreditHistoricalPromotionalActivitiesFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditHistoricalPromotionalActivities copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditHistoricalPromotionalActivities revolvingCreditHistoricalPromotionalActivities, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditHistoricalPromotionalActivitiesFragment revolvingCreditHistoricalPromotionalActivitiesFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = revolvingCreditHistoricalPromotionalActivities.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditHistoricalPromotionalActivitiesFragment = revolvingCreditHistoricalPromotionalActivities.revolvingCreditHistoricalPromotionalActivitiesFragment;
            }
            return revolvingCreditHistoricalPromotionalActivities.copy(str, revolvingCreditHistoricalPromotionalActivitiesFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditNotificationPreference;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditNotificationPreferencesFragment;", "revolvingCreditNotificationPreferencesFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditNotificationPreferencesFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditNotificationPreferencesFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditNotificationPreferencesFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditNotificationPreference;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditNotificationPreferencesFragment;", "getRevolvingCreditNotificationPreferencesFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCreditNotificationPreference {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment revolvingCreditNotificationPreferencesFragment;

        public RevolvingCreditNotificationPreference(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment revolvingCreditNotificationPreferencesFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditNotificationPreferencesFragment, "");
            this.__typename = str;
            this.revolvingCreditNotificationPreferencesFragment = revolvingCreditNotificationPreferencesFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment getRevolvingCreditNotificationPreferencesFragment() {
            return this.revolvingCreditNotificationPreferencesFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment revolvingCreditNotificationPreferencesFragment = this.revolvingCreditNotificationPreferencesFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditNotificationPreference(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditNotificationPreferencesFragment=");
            sb.append(revolvingCreditNotificationPreferencesFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditNotificationPreferencesFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditNotificationPreference)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditNotificationPreference revolvingCreditNotificationPreference = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditNotificationPreference) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, revolvingCreditNotificationPreference.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditNotificationPreferencesFragment, revolvingCreditNotificationPreference.revolvingCreditNotificationPreferencesFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditNotificationPreference copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment revolvingCreditNotificationPreferencesFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditNotificationPreferencesFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditNotificationPreference(__typename, revolvingCreditNotificationPreferencesFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment getRevolvingCreditNotificationPreferencesFragment() {
            return this.revolvingCreditNotificationPreferencesFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditNotificationPreference copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditNotificationPreference revolvingCreditNotificationPreference, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment revolvingCreditNotificationPreferencesFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = revolvingCreditNotificationPreference.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditNotificationPreferencesFragment = revolvingCreditNotificationPreference.revolvingCreditNotificationPreferencesFragment;
            }
            return revolvingCreditNotificationPreference.copy(str, revolvingCreditNotificationPreferencesFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditServicingPrioritizedAccountActionComponent;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingPrioritizedAccountActionFragment;", "revolvingCreditServicingPrioritizedAccountActionFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingPrioritizedAccountActionFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingPrioritizedAccountActionFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingPrioritizedAccountActionFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditServicingPrioritizedAccountActionComponent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingPrioritizedAccountActionFragment;", "getRevolvingCreditServicingPrioritizedAccountActionFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCreditServicingPrioritizedAccountActionComponent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingPrioritizedAccountActionFragment revolvingCreditServicingPrioritizedAccountActionFragment;

        public RevolvingCreditServicingPrioritizedAccountActionComponent(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingPrioritizedAccountActionFragment revolvingCreditServicingPrioritizedAccountActionFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingPrioritizedAccountActionFragment, "");
            this.__typename = str;
            this.revolvingCreditServicingPrioritizedAccountActionFragment = revolvingCreditServicingPrioritizedAccountActionFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingPrioritizedAccountActionFragment getRevolvingCreditServicingPrioritizedAccountActionFragment() {
            return this.revolvingCreditServicingPrioritizedAccountActionFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingPrioritizedAccountActionFragment revolvingCreditServicingPrioritizedAccountActionFragment = this.revolvingCreditServicingPrioritizedAccountActionFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditServicingPrioritizedAccountActionComponent(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditServicingPrioritizedAccountActionFragment=");
            sb.append(revolvingCreditServicingPrioritizedAccountActionFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditServicingPrioritizedAccountActionFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingPrioritizedAccountActionComponent)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingPrioritizedAccountActionComponent revolvingCreditServicingPrioritizedAccountActionComponent = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingPrioritizedAccountActionComponent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, revolvingCreditServicingPrioritizedAccountActionComponent.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditServicingPrioritizedAccountActionFragment, revolvingCreditServicingPrioritizedAccountActionComponent.revolvingCreditServicingPrioritizedAccountActionFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingPrioritizedAccountActionComponent copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingPrioritizedAccountActionFragment revolvingCreditServicingPrioritizedAccountActionFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingPrioritizedAccountActionFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingPrioritizedAccountActionComponent(__typename, revolvingCreditServicingPrioritizedAccountActionFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingPrioritizedAccountActionFragment getRevolvingCreditServicingPrioritizedAccountActionFragment() {
            return this.revolvingCreditServicingPrioritizedAccountActionFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingPrioritizedAccountActionComponent copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingPrioritizedAccountActionComponent revolvingCreditServicingPrioritizedAccountActionComponent, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingPrioritizedAccountActionFragment revolvingCreditServicingPrioritizedAccountActionFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = revolvingCreditServicingPrioritizedAccountActionComponent.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditServicingPrioritizedAccountActionFragment = revolvingCreditServicingPrioritizedAccountActionComponent.revolvingCreditServicingPrioritizedAccountActionFragment;
            }
            return revolvingCreditServicingPrioritizedAccountActionComponent.copy(str, revolvingCreditServicingPrioritizedAccountActionFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditServicingUnenrolledAccountFeatureComponent;", "", "", "__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingUnenrolledAccountFeatureComponentFragment;", "revolvingCreditServicingUnenrolledAccountFeatureComponentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingUnenrolledAccountFeatureComponentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingUnenrolledAccountFeatureComponentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingUnenrolledAccountFeatureComponentFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$RevolvingCreditServicingUnenrolledAccountFeatureComponent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingUnenrolledAccountFeatureComponentFragment;", "getRevolvingCreditServicingUnenrolledAccountFeatureComponentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RevolvingCreditServicingUnenrolledAccountFeatureComponent {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingUnenrolledAccountFeatureComponentFragment revolvingCreditServicingUnenrolledAccountFeatureComponentFragment;

        public RevolvingCreditServicingUnenrolledAccountFeatureComponent(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingUnenrolledAccountFeatureComponentFragment revolvingCreditServicingUnenrolledAccountFeatureComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingUnenrolledAccountFeatureComponentFragment, "");
            this.__typename = str;
            this.revolvingCreditServicingUnenrolledAccountFeatureComponentFragment = revolvingCreditServicingUnenrolledAccountFeatureComponentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingUnenrolledAccountFeatureComponentFragment getRevolvingCreditServicingUnenrolledAccountFeatureComponentFragment() {
            return this.revolvingCreditServicingUnenrolledAccountFeatureComponentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingUnenrolledAccountFeatureComponentFragment revolvingCreditServicingUnenrolledAccountFeatureComponentFragment = this.revolvingCreditServicingUnenrolledAccountFeatureComponentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditServicingUnenrolledAccountFeatureComponent(__typename=");
            sb.append(str);
            sb.append(", revolvingCreditServicingUnenrolledAccountFeatureComponentFragment=");
            sb.append(revolvingCreditServicingUnenrolledAccountFeatureComponentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.__typename.hashCode() * 31) + this.revolvingCreditServicingUnenrolledAccountFeatureComponentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent revolvingCreditServicingUnenrolledAccountFeatureComponent = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, revolvingCreditServicingUnenrolledAccountFeatureComponent.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.revolvingCreditServicingUnenrolledAccountFeatureComponentFragment, revolvingCreditServicingUnenrolledAccountFeatureComponent.revolvingCreditServicingUnenrolledAccountFeatureComponentFragment);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent copy(java.lang.String __typename, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingUnenrolledAccountFeatureComponentFragment revolvingCreditServicingUnenrolledAccountFeatureComponentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingUnenrolledAccountFeatureComponentFragment, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent(__typename, revolvingCreditServicingUnenrolledAccountFeatureComponentFragment);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingUnenrolledAccountFeatureComponentFragment getRevolvingCreditServicingUnenrolledAccountFeatureComponentFragment() {
            return this.revolvingCreditServicingUnenrolledAccountFeatureComponentFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.RevolvingCreditServicingUnenrolledAccountFeatureComponent revolvingCreditServicingUnenrolledAccountFeatureComponent, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingUnenrolledAccountFeatureComponentFragment revolvingCreditServicingUnenrolledAccountFeatureComponentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = revolvingCreditServicingUnenrolledAccountFeatureComponent.__typename;
            }
            if ((i & 2) != 0) {
                revolvingCreditServicingUnenrolledAccountFeatureComponentFragment = revolvingCreditServicingUnenrolledAccountFeatureComponent.revolvingCreditServicingUnenrolledAccountFeatureComponentFragment;
            }
            return revolvingCreditServicingUnenrolledAccountFeatureComponent.copy(str, revolvingCreditServicingUnenrolledAccountFeatureComponentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetPPCCServicingOverviewQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetPPCCServicingOverview($creditProductIdentifier: RevolvingCreditProductIdentifier!, $creditAccountId: CreditAccountID, $externalWalletTokens: [RevolvingCreditExternalWalletTokenInput!]) { revolvingCreditAccount(input: { creditProductIdentifier: $creditProductIdentifier creditAccountId: $creditAccountId } ) { __typename ...RevolvingCreditAccountFragment } revolvingCreditActivities(input: { creditProductIdentifier: $creditProductIdentifier creditAccountId: $creditAccountId } ) { __typename ...RevolvingCreditActivitiesFragment } revolvingCreditAutopay(input: { creditProductIdentifier: $creditProductIdentifier creditAccountId: $creditAccountId } ) { __typename ...RevolvingCreditAutopayFragment } revolvingCreditPayments(input: { creditProductIdentifier: $creditProductIdentifier creditAccountId: $creditAccountId filterOptions: { statuses: [PENDING,PROCESSED] }  sortOptions: { order: DESC field: PAYMENT_DATE }  } ) { __typename ...RevolvingCreditPaymentsFragment } revolvingCreditInstruments(input: { creditProductIdentifier: $creditProductIdentifier creditAccountId: $creditAccountId filterOptions: { statuses: [ACTIVE,FROZEN,BLOCKED] types: [PHYSICAL] }  } ) { __typename ...RevolvingCreditInstrumentsFragment } revolvingCreditPushProvisioning(input: { creditProductIdentifier: $creditProductIdentifier creditAccountId: $creditAccountId externalWalletTokens: $externalWalletTokens } ) { __typename ...StarPayWalletProvisioningFragment } revolvingCreditServicingContent(input: { creditProductIdentifier: $creditProductIdentifier } ) { __typename ...RevolvingCreditServicingContentFragment legal { eSignConsentUrl privacyStatementUrl } payments { autopayTermsUrl oneTimePaymentTermsUrl paymentSecurityEntrypointUrl avoidInterestOnNextStatementGuideUrl noInterestPromotionCurrentAccruedInterestExplanationUrl } } revolvingCreditCustomerProfiles(input: { creditProductIdentifier: $creditProductIdentifier creditAccountId: $creditAccountId filterOptions: { roles: [PRIMARY,SUPPLEMENTARY] }  } ) { __typename ...RevolvingCreditCustomerProfileFragment } revolvingCreditHistoricalPromotionalActivities(input: { creditProductIdentifier: $creditProductIdentifier creditAccountId: $creditAccountId } ) { __typename ...RevolvingCreditHistoricalPromotionalActivitiesFragment } revolvingCreditNotificationPreference(input: { creditProductIdentifier: $creditProductIdentifier creditAccountId: $creditAccountId notificationPreferenceId: STATEMENT_DELIVERY_CHANNELS } ) { __typename ...RevolvingCreditNotificationPreferencesFragment } revolvingCreditServicingPrioritizedAccountActionComponents(input: { creditProductIdentifier: $creditProductIdentifier creditAccountId: $creditAccountId flowContext: { channel: MOBILE_APP }  } ) { __typename ...RevolvingCreditServicingPrioritizedAccountActionFragment } revolvingCreditServicingUnenrolledAccountFeatureComponents(input: { creditProductIdentifier: $creditProductIdentifier creditAccountId: $creditAccountId flowContext: { channel: MOBILE_APP }  } ) { __typename ...RevolvingCreditServicingUnenrolledAccountFeatureComponentFragment } }  fragment RevolvingCreditMoneyFragment on Money { currencyCode value }  fragment RevolvingCreditBillingFragment on RevolvingCreditAccount { billing { creditLines { creditLine { __typename ...RevolvingCreditMoneyFragment } temporaryCreditLine { __typename ...RevolvingCreditMoneyFragment } } currentBalance { __typename ...RevolvingCreditMoneyFragment } statementBalance { __typename ...RevolvingCreditMoneyFragment } remainingStatementBalance { __typename ...RevolvingCreditMoneyFragment } minimumPaymentDue { __typename ...RevolvingCreditMoneyFragment } minimumPaymentToAvoidInterest { __typename ...RevolvingCreditMoneyFragment } maxRepayableAmount { __typename ...RevolvingCreditMoneyFragment } openToBuy { __typename ...RevolvingCreditMoneyFragment } pastDueAmount { __typename ...RevolvingCreditMoneyFragment } nextPaymentDueTime paymentStatus } }  fragment RevolvingCreditImageFragment on CreditImage { url assetName }  fragment RevolvingCreditServicingProductFragment on RevolvingCreditServicingProduct { tier cardNetwork cardDisplayName tokenServiceProvider cardDisplayLogo { __typename ...RevolvingCreditImageFragment } locale currencyCode capabilities { card creditLine payment } valuePropositions }  fragment RevolvingCreditAccountFragment on RevolvingCreditAccount { __typename creditAccountId ...RevolvingCreditBillingFragment allowedFeatures apr { apr aprType } cashAdvanceApr { apr aprType } tags { name } product { __typename ...RevolvingCreditServicingProductFragment } persistentDebt { stage stagePeriod } }  fragment RevolvingCreditActivitiesFragment on RevolvingCreditActivities { page { items { id type description amount { __typename ...RevolvingCreditMoneyFragment } transactionTime transactionReferenceNumber settled businessName displayLogo { __typename ...RevolvingCreditImageFragment } rewards { cashback { percent } } offerConstruct { id types } } offset limit hasNextPage hasPreviousPage } }  fragment RevolvingCreditPaymentFundingInstrumentsFragment on RevolvingCreditPaymentFundingInstrument { __typename ... on RevolvingCreditPaymentFundingInstrumentBalance { id art { __typename ...RevolvingCreditImageFragment } amount { __typename ...RevolvingCreditMoneyFragment } } ... on RevolvingCreditPaymentFundingInstrumentBank { id type bankLastNChars: lastNChars name art { __typename ...RevolvingCreditImageFragment } } ... on RevolvingCreditPaymentFundingInstrumentCard { id cardLastNChars: lastNChars name art { __typename ...RevolvingCreditImageFragment } productClass } }  fragment RevolvingCreditAutopayFragment on RevolvingCreditAutopay { __typename ... on RevolvingCreditAutopayEnrolled { paymentAmountOptionType effectiveDueTime effectiveInCurrentBillingCycle fundingInstruments { __typename ...RevolvingCreditPaymentFundingInstrumentsFragment } customAmount { __typename ...RevolvingCreditMoneyFragment } } ... on RevolvingCreditAutopayUnenrolled { enrollmentEligible } }  fragment RevolvingCreditPaymentsFragment on RevolvingCreditPayment { id amount { __typename ...RevolvingCreditMoneyFragment } cancelable channel createTime fundingInstruments { __typename ...RevolvingCreditPaymentFundingInstrumentsFragment } paymentTime status type }  fragment RevolvingCreditInstrumentsFragment on RevolvingCreditInstrument { id type allowedFeatures status card { activationStatus } lastNChars }  fragment StarPayWalletProvisioningFragment on RevolvingCreditPushProvisioning { primaryDeviceEligibility { __typename ... on RevolvingCreditPushProvisioningEligible { eligibleReason: reason } ... on RevolvingCreditPushProvisioningIneligible { ineligibleReason: reason provisionedTokens { id fundingPrimaryAccountNumberReferenceId fundingPrimaryAccountNumberLastDigits state issuerName isCompanionToken isDefaultToken } } } component { isHidden personalizationTrackingId } }  fragment RevolvingCreditPhoneFragment on Phone { countryCode extensionNumber nationalNumber }  fragment RevolvingCreditCustomerServiceFragment on RevolvingCreditServicingCustomerServiceContent { mailingAddress { addressLine1 addressLine2 addressLine3 adminArea1 adminArea2 adminArea3 countryCode postalCode } operationHours payableTo phoneNumber { __typename ...RevolvingCreditPhoneFragment } }  fragment RevolvingCreditServicingContentFragment on RevolvingCreditServicingContent { card { activationPhoneNumber { __typename ...RevolvingCreditPhoneFragment } cardHolderTermsUrl lostStolenPhoneNumber { __typename ...RevolvingCreditPhoneFragment } benefitsUrl } customerService { __typename ...RevolvingCreditCustomerServiceFragment } }  fragment RevolvingCreditCustomerProfileFragment on RevolvingCreditCustomerProfile { id role email name { givenName surname prefix middleName suffix } addresses { address { addressLine1 addressLine2 addressLine3 adminArea1 adminArea2 adminArea3 postalCode countryCode } type } phoneNumbers { phone { __typename ...RevolvingCreditPhoneFragment } type } income { amount { value currencyCode } requiredAction } }  fragment RevolvingCreditHistoricalPromotionalActivitiesFragment on RevolvingCreditHistoricalPromotionalActivities { page { offset limit items { status time remainingBalance { __typename ...RevolvingCreditMoneyFragment } businessName expirationTime interestAccrued { value currencyCode } originalTransactionAmount { value currencyCode } offerConstruct { types id } } hasPreviousPage hasNextPage } }  fragment RevolvingCreditNotificationPreferencesFragment on RevolvingCreditNotificationPreference { id channels attributes { name amount { __typename ...RevolvingCreditMoneyFragment } } }  fragment RevolvingCreditServicingNativeActionFragment on RevolvingCreditServicingNativeAction { nativeActionType: type behavior }  fragment RevolvingCreditServicingMobileDeepLinkFragment on MobileDeepLinkInfo { url title parameters { value name } }  fragment RevolvingCreditServicingNavigationActionFragment on RevolvingCreditServicingNavigationAction { navigationType: type mobileDeepLink { __typename ...RevolvingCreditServicingMobileDeepLinkFragment } }  fragment RevolvingCreditServicingPrioritizedAccountActionFragment on RevolvingCreditServicingPrioritizedAccountActionComponent { id title description icon { __typename ...RevolvingCreditImageFragment } personalizationTrackingId dismissible action { __typename ... on RevolvingCreditServicingNativeAction { __typename ...RevolvingCreditServicingNativeActionFragment } ... on RevolvingCreditServicingNavigationAction { __typename ...RevolvingCreditServicingNavigationActionFragment } } }  fragment RevolvingCreditServicingUnenrolledAccountFeatureComponentFragment on RevolvingCreditServicingUnenrolledAccountFeatureComponent { id personalizationTrackingId title description icon { __typename ...RevolvingCreditImageFragment } action { __typename ... on RevolvingCreditServicingNativeAction { __typename ...RevolvingCreditServicingNativeActionFragment } ... on RevolvingCreditServicingNavigationAction { __typename ...RevolvingCreditServicingNavigationActionFragment } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier = this.creditProductIdentifier;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.creditAccountId;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditExternalWalletTokenInput>> optional2 = this.externalWalletTokens;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetPPCCServicingOverviewQuery(creditProductIdentifier=");
        sb.append(revolvingCreditProductIdentifier);
        sb.append(", creditAccountId=");
        sb.append(optional);
        sb.append(", externalWalletTokens=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.creditProductIdentifier.hashCode() * 31) + this.creditAccountId.hashCode()) * 31) + this.externalWalletTokens.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery getPPCCServicingOverviewQuery = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery) other;
        return this.creditProductIdentifier == getPPCCServicingOverviewQuery.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, getPPCCServicingOverviewQuery.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalWalletTokens, getPPCCServicingOverviewQuery.externalWalletTokens);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier, com.apollographql.apollo.api.Optional<? extends java.lang.Object> creditAccountId, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditExternalWalletTokenInput>> externalWalletTokens) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalWalletTokens, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery(creditProductIdentifier, creditAccountId, externalWalletTokens);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditExternalWalletTokenInput>> component3() {
        return this.externalWalletTokens;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component2() {
        return this.creditAccountId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery getPPCCServicingOverviewQuery, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            revolvingCreditProductIdentifier = getPPCCServicingOverviewQuery.creditProductIdentifier;
        }
        if ((i & 2) != 0) {
            optional = getPPCCServicingOverviewQuery.creditAccountId;
        }
        if ((i & 4) != 0) {
            optional2 = getPPCCServicingOverviewQuery.externalWalletTokens;
        }
        return getPPCCServicingOverviewQuery.copy(revolvingCreditProductIdentifier, optional, optional2);
    }
}
