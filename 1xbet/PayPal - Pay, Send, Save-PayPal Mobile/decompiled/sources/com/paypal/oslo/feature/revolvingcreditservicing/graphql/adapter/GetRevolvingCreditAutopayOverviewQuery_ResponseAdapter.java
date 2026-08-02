package com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\bÆ\u0002\u0018\u00002\u00020\u0001:\u001c\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "RevolvingCreditAccount", "Billing", "CreditLines", "CreditLine", "RevolvingCreditPaymentConstraint", "OnRevolvingCreditAutopayPaymentConstraints", "PaymentAmountOption", "Amount", "MinimumCustomAmount", "RevolvingCreditAutopay", "OnRevolvingCreditAutopayEnrolled", "CustomAmount", "FundingInstrument", "OnRevolvingCreditPaymentFundingInstrumentBalance", "Art", "Amount1", "OnRevolvingCreditPaymentFundingInstrumentBank", "OnRevolvingCreditPaymentFundingInstrumentCard", "OnRevolvingCreditAutopayUnenrolled", "RevolvingCreditServicingContent", "Payments", "RevolvingCreditEligiblePaymentFundingInstrument", "OnRevolvingCreditPaymentFundingInstrumentBalance1", "Art1", "Amount2", "OnRevolvingCreditPaymentFundingInstrumentBank1", "OnRevolvingCreditPaymentFundingInstrumentCard1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Data> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"revolvingCreditAccount", "revolvingCreditPaymentConstraints", "revolvingCreditAutopay", "revolvingCreditServicingContent", "revolvingCreditEligiblePaymentFundingInstruments"});
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditAccount revolvingCreditAccount = null;
            java.util.List list = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditAutopay revolvingCreditAutopay = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditServicingContent revolvingCreditServicingContent = null;
            java.util.List list2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    revolvingCreditAccount = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditAccount) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.RevolvingCreditAccount.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.RevolvingCreditPaymentConstraint.INSTANCE, true))).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    revolvingCreditAutopay = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditAutopay) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.RevolvingCreditAutopay.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    revolvingCreditServicingContent = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditServicingContent) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.RevolvingCreditServicingContent.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 4) {
                    list2 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.RevolvingCreditEligiblePaymentFundingInstrument.INSTANCE, true))).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Data(revolvingCreditAccount, list, revolvingCreditAutopay, revolvingCreditServicingContent, list2);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("revolvingCreditAccount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.RevolvingCreditAccount.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getRevolvingCreditAccount());
            writer.name("revolvingCreditPaymentConstraints");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.RevolvingCreditPaymentConstraint.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getRevolvingCreditPaymentConstraints());
            writer.name("revolvingCreditAutopay");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.RevolvingCreditAutopay.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getRevolvingCreditAutopay());
            writer.name("revolvingCreditServicingContent");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.RevolvingCreditServicingContent.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getRevolvingCreditServicingContent());
            writer.name("revolvingCreditEligiblePaymentFundingInstruments");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.RevolvingCreditEligiblePaymentFundingInstrument.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getRevolvingCreditEligiblePaymentFundingInstruments());
        }
    }

    private GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$RevolvingCreditAccount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$RevolvingCreditAccount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$RevolvingCreditAccount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$RevolvingCreditAccount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RevolvingCreditAccount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditAccount> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.RevolvingCreditAccount INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.RevolvingCreditAccount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"creditAccountId", "billing"});
        public static final int $stable = 8;

        private RevolvingCreditAccount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditAccount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Billing billing = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    billing = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Billing) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Billing.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditAccount(obj, billing);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "creditAccountId");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditAccount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("creditAccountId");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCreditAccountId());
            writer.name("billing");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Billing.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getBilling());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$Billing;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Billing;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Billing;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Billing;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Billing implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Billing> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Billing INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Billing();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"nextPaymentDueTime", "creditLines"});
        public static final int $stable = 8;

        private Billing() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Billing fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.CreditLines creditLines = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    creditLines = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.CreditLines) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.CreditLines.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Billing(obj, creditLines);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Billing value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("nextPaymentDueTime");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getNextPaymentDueTime());
            writer.name("creditLines");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.CreditLines.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getCreditLines());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$CreditLines;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$CreditLines;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$CreditLines;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$CreditLines;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CreditLines implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.CreditLines> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.CreditLines INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.CreditLines();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("creditLine");
        public static final int $stable = 8;

        private CreditLines() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.CreditLines fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.CreditLine creditLine = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                creditLine = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.CreditLine) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.CreditLine.INSTANCE, true)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.CreditLines(creditLine);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.CreditLines value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("creditLine");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.CreditLine.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getCreditLine());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$CreditLine;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$CreditLine;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$CreditLine;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$CreditLine;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CreditLine implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.CreditLine> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.CreditLine INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.CreditLine();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private CreditLine() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.CreditLine fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.CreditLine(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.CreditLine value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$RevolvingCreditPaymentConstraint;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$RevolvingCreditPaymentConstraint;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$RevolvingCreditPaymentConstraint;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$RevolvingCreditPaymentConstraint;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RevolvingCreditPaymentConstraint implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditPaymentConstraint> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.RevolvingCreditPaymentConstraint INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.RevolvingCreditPaymentConstraint();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private RevolvingCreditPaymentConstraint() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditPaymentConstraint fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditAutopayPaymentConstraints onRevolvingCreditAutopayPaymentConstraints = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("RevolvingCreditAutopayPaymentConstraints"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onRevolvingCreditAutopayPaymentConstraints = com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditAutopayPaymentConstraints.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditPaymentConstraint(str, onRevolvingCreditAutopayPaymentConstraints);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditPaymentConstraint value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnRevolvingCreditAutopayPaymentConstraints() != null) {
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditAutopayPaymentConstraints.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRevolvingCreditAutopayPaymentConstraints());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$OnRevolvingCreditAutopayPaymentConstraints;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditAutopayPaymentConstraints;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditAutopayPaymentConstraints;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditAutopayPaymentConstraints;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnRevolvingCreditAutopayPaymentConstraints implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditAutopayPaymentConstraints> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditAutopayPaymentConstraints INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditAutopayPaymentConstraints();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"paymentAmountOptions", "minimumCustomAmount"});
        public static final int $stable = 8;

        private OnRevolvingCreditAutopayPaymentConstraints() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditAutopayPaymentConstraints fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.MinimumCustomAmount minimumCustomAmount = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.PaymentAmountOption.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    minimumCustomAmount = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.MinimumCustomAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.MinimumCustomAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (list == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "paymentAmountOptions");
                throw new kotlin.KotlinNothingValueException();
            }
            if (minimumCustomAmount != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditAutopayPaymentConstraints(list, minimumCustomAmount);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "minimumCustomAmount");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditAutopayPaymentConstraints value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("paymentAmountOptions");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.PaymentAmountOption.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getPaymentAmountOptions());
            writer.name("minimumCustomAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.MinimumCustomAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getMinimumCustomAmount());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$PaymentAmountOption;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$PaymentAmountOption;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$PaymentAmountOption;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$PaymentAmountOption;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaymentAmountOption implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.PaymentAmountOption> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.PaymentAmountOption INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.PaymentAmountOption();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"type", "amount"});
        public static final int $stable = 8;

        private PaymentAmountOption() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.PaymentAmountOption fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType revolvingCreditAutopayPaymentAmountOptionType = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount amount = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    revolvingCreditAutopayPaymentAmountOptionType = com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditAutopayPaymentAmountOptionType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    amount = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Amount.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (revolvingCreditAutopayPaymentAmountOptionType != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.PaymentAmountOption(revolvingCreditAutopayPaymentAmountOptionType, amount);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "type");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.PaymentAmountOption value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditAutopayPaymentAmountOptionType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("amount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Amount.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getAmount());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$Amount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Amount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Amount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Amount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Amount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Amount INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Amount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Amount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$MinimumCustomAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$MinimumCustomAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$MinimumCustomAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$MinimumCustomAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MinimumCustomAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.MinimumCustomAmount> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.MinimumCustomAmount INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.MinimumCustomAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private MinimumCustomAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.MinimumCustomAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.MinimumCustomAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.MinimumCustomAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$RevolvingCreditAutopay;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$RevolvingCreditAutopay;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$RevolvingCreditAutopay;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$RevolvingCreditAutopay;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RevolvingCreditAutopay implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditAutopay> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.RevolvingCreditAutopay INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.RevolvingCreditAutopay();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private RevolvingCreditAutopay() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditAutopay fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditAutopayEnrolled onRevolvingCreditAutopayEnrolled;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditAutopayUnenrolled onRevolvingCreditAutopayUnenrolled = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("RevolvingCreditAutopayEnrolled"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onRevolvingCreditAutopayEnrolled = com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditAutopayEnrolled.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onRevolvingCreditAutopayEnrolled = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("RevolvingCreditAutopayUnenrolled"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onRevolvingCreditAutopayUnenrolled = com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditAutopayUnenrolled.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditAutopay(str, onRevolvingCreditAutopayEnrolled, onRevolvingCreditAutopayUnenrolled);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditAutopay value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnRevolvingCreditAutopayEnrolled() != null) {
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditAutopayEnrolled.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRevolvingCreditAutopayEnrolled());
            }
            if (value.getOnRevolvingCreditAutopayUnenrolled() != null) {
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditAutopayUnenrolled.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRevolvingCreditAutopayUnenrolled());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$OnRevolvingCreditAutopayEnrolled;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditAutopayEnrolled;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditAutopayEnrolled;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditAutopayEnrolled;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnRevolvingCreditAutopayEnrolled implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditAutopayEnrolled> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditAutopayEnrolled INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditAutopayEnrolled();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"effectiveDueTime", "paymentAmountOptionType", "customAmount", "effectiveInCurrentBillingCycle", "fundingInstruments"});
        public static final int $stable = 8;

        private OnRevolvingCreditAutopayEnrolled() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditAutopayEnrolled fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.Object obj = null;
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayPaymentAmountOptionType revolvingCreditAutopayPaymentAmountOptionType = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.CustomAmount customAmount = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    revolvingCreditAutopayPaymentAmountOptionType = com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditAutopayPaymentAmountOptionType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    customAmount = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.CustomAmount) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.CustomAmount.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 4) {
                        break;
                    }
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.FundingInstrument.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (revolvingCreditAutopayPaymentAmountOptionType == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "paymentAmountOptionType");
                throw new kotlin.KotlinNothingValueException();
            }
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (list != null) {
                    return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditAutopayEnrolled(obj, revolvingCreditAutopayPaymentAmountOptionType, customAmount, booleanValue, list);
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, "fundingInstruments");
                throw new kotlin.KotlinNothingValueException();
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "effectiveInCurrentBillingCycle");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditAutopayEnrolled value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("effectiveDueTime");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getEffectiveDueTime());
            writer.name("paymentAmountOptionType");
            com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditAutopayPaymentAmountOptionType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getPaymentAmountOptionType());
            writer.name("customAmount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.CustomAmount.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getCustomAmount());
            writer.name("effectiveInCurrentBillingCycle");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getEffectiveInCurrentBillingCycle()));
            writer.name("fundingInstruments");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.FundingInstrument.INSTANCE, true)).toJson(writer, customScalarAdapters, (java.util.List) value.getFundingInstruments());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$CustomAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$CustomAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$CustomAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$CustomAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CustomAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.CustomAmount> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.CustomAmount INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.CustomAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private CustomAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.CustomAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.CustomAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.CustomAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$FundingInstrument;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$FundingInstrument;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$FundingInstrument;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$FundingInstrument;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FundingInstrument implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.FundingInstrument> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.FundingInstrument INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.FundingInstrument();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private FundingInstrument() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.FundingInstrument fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance onRevolvingCreditPaymentFundingInstrumentBalance;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank onRevolvingCreditPaymentFundingInstrumentBank;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard onRevolvingCreditPaymentFundingInstrumentCard = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("RevolvingCreditPaymentFundingInstrumentBalance"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onRevolvingCreditPaymentFundingInstrumentBalance = com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentBalance.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onRevolvingCreditPaymentFundingInstrumentBalance = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("RevolvingCreditPaymentFundingInstrumentBank"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onRevolvingCreditPaymentFundingInstrumentBank = com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentBank.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onRevolvingCreditPaymentFundingInstrumentBank = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("RevolvingCreditPaymentFundingInstrumentCard"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onRevolvingCreditPaymentFundingInstrumentCard = com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentCard.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.FundingInstrument(str, onRevolvingCreditPaymentFundingInstrumentBalance, onRevolvingCreditPaymentFundingInstrumentBank, onRevolvingCreditPaymentFundingInstrumentCard);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.FundingInstrument value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnRevolvingCreditPaymentFundingInstrumentBalance() != null) {
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentBalance.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRevolvingCreditPaymentFundingInstrumentBalance());
            }
            if (value.getOnRevolvingCreditPaymentFundingInstrumentBank() != null) {
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentBank.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRevolvingCreditPaymentFundingInstrumentBank());
            }
            if (value.getOnRevolvingCreditPaymentFundingInstrumentCard() != null) {
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentCard.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRevolvingCreditPaymentFundingInstrumentCard());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$OnRevolvingCreditPaymentFundingInstrumentBalance;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBalance;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBalance;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBalance;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnRevolvingCreditPaymentFundingInstrumentBalance implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentBalance INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentBalance();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "art", "amount"});
        public static final int $stable = 8;

        private OnRevolvingCreditPaymentFundingInstrumentBalance() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Art art = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount1 amount1 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    art = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Art) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Art.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    amount1 = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount1) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Amount1.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance(str, art, amount1);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "id");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("art");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Art.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getArt());
            writer.name("amount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Amount1.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getAmount());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$Art;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Art;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Art;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Art;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Art implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Art> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Art INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Art();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Art() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Art fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragmentImpl_ResponseAdapter.RevolvingCreditImageFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Art(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Art value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragmentImpl_ResponseAdapter.RevolvingCreditImageFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditImageFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$Amount1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Amount1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Amount1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Amount1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Amount1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount1> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Amount1 INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Amount1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Amount1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount1(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$OnRevolvingCreditPaymentFundingInstrumentBank;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBank;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBank;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBank;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnRevolvingCreditPaymentFundingInstrumentBank implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentBank INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentBank();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnRevolvingCreditPaymentFundingInstrumentBank() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentBankFields fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentBankFieldsImpl_ResponseAdapter.FundingInstrumentBankFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentBankFieldsImpl_ResponseAdapter.FundingInstrumentBankFields.INSTANCE.toJson(writer, customScalarAdapters, value.getFundingInstrumentBankFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$OnRevolvingCreditPaymentFundingInstrumentCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentCard;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentCard;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentCard;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnRevolvingCreditPaymentFundingInstrumentCard implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentCard INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentCard();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnRevolvingCreditPaymentFundingInstrumentCard() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentCardFields fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentCardFieldsImpl_ResponseAdapter.FundingInstrumentCardFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentCardFieldsImpl_ResponseAdapter.FundingInstrumentCardFields.INSTANCE.toJson(writer, customScalarAdapters, value.getFundingInstrumentCardFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$OnRevolvingCreditAutopayUnenrolled;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditAutopayUnenrolled;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditAutopayUnenrolled;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditAutopayUnenrolled;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnRevolvingCreditAutopayUnenrolled implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditAutopayUnenrolled> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditAutopayUnenrolled INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditAutopayUnenrolled();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("enrollmentEligible");
        public static final int $stable = 8;

        private OnRevolvingCreditAutopayUnenrolled() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditAutopayUnenrolled fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
            }
            if (bool != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditAutopayUnenrolled(bool.booleanValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "enrollmentEligible");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditAutopayUnenrolled value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("enrollmentEligible");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getEnrollmentEligible()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$RevolvingCreditServicingContent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$RevolvingCreditServicingContent;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$RevolvingCreditServicingContent;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$RevolvingCreditServicingContent;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RevolvingCreditServicingContent implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditServicingContent> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.RevolvingCreditServicingContent INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.RevolvingCreditServicingContent();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("payments");
        public static final int $stable = 8;

        private RevolvingCreditServicingContent() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditServicingContent fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Payments payments = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                payments = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Payments) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Payments.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditServicingContent(payments);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditServicingContent value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("payments");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Payments.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getPayments());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$Payments;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Payments;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Payments;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Payments;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Payments implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Payments> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Payments INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Payments();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("autopayTermsUrl");
        public static final int $stable = 8;

        private Payments() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Payments fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Payments(obj);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Payments value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("autopayTermsUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getAutopayTermsUrl());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$RevolvingCreditEligiblePaymentFundingInstrument;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$RevolvingCreditEligiblePaymentFundingInstrument;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$RevolvingCreditEligiblePaymentFundingInstrument;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$RevolvingCreditEligiblePaymentFundingInstrument;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RevolvingCreditEligiblePaymentFundingInstrument implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.RevolvingCreditEligiblePaymentFundingInstrument INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.RevolvingCreditEligiblePaymentFundingInstrument();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private RevolvingCreditEligiblePaymentFundingInstrument() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance1 onRevolvingCreditPaymentFundingInstrumentBalance1;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank1 onRevolvingCreditPaymentFundingInstrumentBank1;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard1 onRevolvingCreditPaymentFundingInstrumentCard1 = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("RevolvingCreditPaymentFundingInstrumentBalance"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onRevolvingCreditPaymentFundingInstrumentBalance1 = com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentBalance1.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onRevolvingCreditPaymentFundingInstrumentBalance1 = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("RevolvingCreditPaymentFundingInstrumentBank"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onRevolvingCreditPaymentFundingInstrumentBank1 = com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentBank1.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onRevolvingCreditPaymentFundingInstrumentBank1 = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("RevolvingCreditPaymentFundingInstrumentCard"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onRevolvingCreditPaymentFundingInstrumentCard1 = com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentCard1.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument(str, onRevolvingCreditPaymentFundingInstrumentBalance1, onRevolvingCreditPaymentFundingInstrumentBank1, onRevolvingCreditPaymentFundingInstrumentCard1);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.RevolvingCreditEligiblePaymentFundingInstrument value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnRevolvingCreditPaymentFundingInstrumentBalance() != null) {
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentBalance1.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRevolvingCreditPaymentFundingInstrumentBalance());
            }
            if (value.getOnRevolvingCreditPaymentFundingInstrumentBank() != null) {
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentBank1.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRevolvingCreditPaymentFundingInstrumentBank());
            }
            if (value.getOnRevolvingCreditPaymentFundingInstrumentCard() != null) {
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentCard1.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRevolvingCreditPaymentFundingInstrumentCard());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$OnRevolvingCreditPaymentFundingInstrumentBalance1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBalance1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBalance1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBalance1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnRevolvingCreditPaymentFundingInstrumentBalance1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance1> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentBalance1 INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentBalance1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "art", "amount"});
        public static final int $stable = 8;

        private OnRevolvingCreditPaymentFundingInstrumentBalance1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Art1 art1 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount2 amount2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    art1 = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Art1) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Art1.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    amount2 = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount2) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Amount2.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance1(str, art1, amount2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "id");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBalance1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("art");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Art1.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getArt());
            writer.name("amount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Amount2.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getAmount());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$Art1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Art1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Art1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Art1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Art1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Art1> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Art1 INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Art1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"url", "assetName"});
        public static final int $stable = 8;

        private Art1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Art1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Art1(obj, str);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Art1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("url");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getUrl());
            writer.name("assetName");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getAssetName());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$Amount2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Amount2;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Amount2;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$Amount2;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Amount2 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount2> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Amount2 INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.Amount2();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Amount2() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount2 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount2(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Amount2 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$OnRevolvingCreditPaymentFundingInstrumentBank1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBank1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBank1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentBank1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnRevolvingCreditPaymentFundingInstrumentBank1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank1> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentBank1 INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentBank1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnRevolvingCreditPaymentFundingInstrumentBank1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentBankFields fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentBankFieldsImpl_ResponseAdapter.FundingInstrumentBankFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank1(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentBank1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentBankFieldsImpl_ResponseAdapter.FundingInstrumentBankFields.INSTANCE.toJson(writer, customScalarAdapters, value.getFundingInstrumentBankFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter$OnRevolvingCreditPaymentFundingInstrumentCard1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentCard1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentCard1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditAutopayOverviewQuery$OnRevolvingCreditPaymentFundingInstrumentCard1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnRevolvingCreditPaymentFundingInstrumentCard1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard1> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentCard1 INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditAutopayOverviewQuery_ResponseAdapter.OnRevolvingCreditPaymentFundingInstrumentCard1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnRevolvingCreditPaymentFundingInstrumentCard1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentCardFields fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentCardFieldsImpl_ResponseAdapter.FundingInstrumentCardFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard1(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.OnRevolvingCreditPaymentFundingInstrumentCard1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.FundingInstrumentCardFieldsImpl_ResponseAdapter.FundingInstrumentCardFields.INSTANCE.toJson(writer, customScalarAdapters, value.getFundingInstrumentCardFields());
        }
    }
}
