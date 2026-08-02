package com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b$\bÆ\u0002\u0018\u00002\u00020\u0001:\"\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "RevolvingCreditAccount", "RevolvingCreditStatement", "Summary", "MinimumPaymentDue", "AvoidInterestMinimumPayment", "PreviousBalance", "NewBalance", "TotalPurchases", "TotalPaymentCredits", "TotalInterestFinanceChargesAndFees", lib.android.paypal.com.magnessdk.c.b.i, "Amount", "DisplayLogo", com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_REWARDS, "Cashback", "OfferConstruct", "PromotionalActivity", "InterestAccrued", "OriginalTransactionAmount", "RemainingBalance", "OfferConstruct1", "RewardsSummary", "TotalLifetimeRewardsAmount", "RedeemedAmount", "YearToDateSpentAmount", "PriorBalanceAmount", "ResidualBalanceAmount", "NetEarnedAmount", "RewardTier", "RewardsEarned", "Adjustment", "RewardsEarned1", "TotalAdjustments"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetRevolvingCreditStatementDetailsQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Data> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"revolvingCreditAccount", "revolvingCreditStatement"});
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RevolvingCreditAccount revolvingCreditAccount = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RevolvingCreditStatement revolvingCreditStatement = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    revolvingCreditAccount = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RevolvingCreditAccount) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RevolvingCreditAccount.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    revolvingCreditStatement = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RevolvingCreditStatement) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RevolvingCreditStatement.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Data(revolvingCreditAccount, revolvingCreditStatement);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("revolvingCreditAccount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RevolvingCreditAccount.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getRevolvingCreditAccount());
            writer.name("revolvingCreditStatement");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RevolvingCreditStatement.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getRevolvingCreditStatement());
        }
    }

    private GetRevolvingCreditStatementDetailsQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$RevolvingCreditAccount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RevolvingCreditAccount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RevolvingCreditAccount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RevolvingCreditAccount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RevolvingCreditAccount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RevolvingCreditAccount> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RevolvingCreditAccount INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RevolvingCreditAccount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("creditAccountId");
        public static final int $stable = 8;

        private RevolvingCreditAccount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RevolvingCreditAccount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RevolvingCreditAccount(obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "creditAccountId");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RevolvingCreditAccount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("creditAccountId");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCreditAccountId());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$RevolvingCreditStatement;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RevolvingCreditStatement;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RevolvingCreditStatement;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RevolvingCreditStatement;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RevolvingCreditStatement implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RevolvingCreditStatement> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RevolvingCreditStatement INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RevolvingCreditStatement();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", org.bouncycastle.i18n.ErrorBundle.SUMMARY_ENTRY, "activities", "promotionalActivities", "rewardsSummary"});
        public static final int $stable = 8;

        private RevolvingCreditStatement() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RevolvingCreditStatement fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Summary summary = null;
            java.util.List list = null;
            java.util.List list2 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsSummary rewardsSummary = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    summary = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Summary) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Summary.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Activity.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    list2 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.PromotionalActivity.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 4) {
                        break;
                    }
                    rewardsSummary = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsSummary) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RewardsSummary.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RevolvingCreditStatement(obj, summary, list, list2, rewardsSummary);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "id");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RevolvingCreditStatement value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name(org.bouncycastle.i18n.ErrorBundle.SUMMARY_ENTRY);
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Summary.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getSummary());
            writer.name("activities");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Activity.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getActivities());
            writer.name("promotionalActivities");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.PromotionalActivity.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getPromotionalActivities());
            writer.name("rewardsSummary");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RewardsSummary.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getRewardsSummary());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$Summary;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Summary;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Summary;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Summary;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Summary implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Summary> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Summary INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Summary();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME, "closingTime", "minimumPaymentDue", "avoidInterestMinimumPayment", "paymentDueTime", "previousBalance", "newBalance", "totalPurchases", "totalPaymentCredits", "totalInterestFinanceChargesAndFees", "apr"});
        public static final int $stable = 8;

        private Summary() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        
            if (r12 == null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
        
            if (r13 == null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        
            if (r14 == null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Summary(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00d8, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "totalInterestFinanceChargesAndFees");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00e2, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00e3, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "totalPaymentCredits");
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00ed, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00ee, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "totalPurchases");
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00f8, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00f9, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "newBalance");
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0103, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0104, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "previousBalance");
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x010e, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x010f, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "paymentDueTime");
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0119, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x011a, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "minimumPaymentDue");
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0124, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0125, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x012f, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
        
            if (r4 == null) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
        
            if (r7 == null) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
        
            if (r9 == null) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
        
            if (r10 == null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
        
            if (r11 == null) goto L33;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Summary fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            java.lang.Object obj3 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.MinimumPaymentDue minimumPaymentDue = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.AvoidInterestMinimumPayment avoidInterestMinimumPayment = null;
            java.lang.Object obj4 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.PreviousBalance previousBalance = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.NewBalance newBalance = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalPurchases totalPurchases = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalPaymentCredits totalPaymentCredits = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalInterestFinanceChargesAndFees totalInterestFinanceChargesAndFees = null;
            java.lang.Object obj5 = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        obj3 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        minimumPaymentDue = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.MinimumPaymentDue) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.MinimumPaymentDue.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        avoidInterestMinimumPayment = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.AvoidInterestMinimumPayment) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.AvoidInterestMinimumPayment.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        obj4 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        previousBalance = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.PreviousBalance) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.PreviousBalance.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        newBalance = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.NewBalance) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.NewBalance.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        totalPurchases = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalPurchases) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.TotalPurchases.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        totalPaymentCredits = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalPaymentCredits) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.TotalPaymentCredits.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        totalInterestFinanceChargesAndFees = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalInterestFinanceChargesAndFees) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.TotalInterestFinanceChargesAndFees.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        obj5 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Summary value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME);
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getStartTime());
            writer.name("closingTime");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getClosingTime());
            writer.name("minimumPaymentDue");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.MinimumPaymentDue.INSTANCE, true).toJson(writer, customScalarAdapters, value.getMinimumPaymentDue());
            writer.name("avoidInterestMinimumPayment");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.AvoidInterestMinimumPayment.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getAvoidInterestMinimumPayment());
            writer.name("paymentDueTime");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getPaymentDueTime());
            writer.name("previousBalance");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.PreviousBalance.INSTANCE, true).toJson(writer, customScalarAdapters, value.getPreviousBalance());
            writer.name("newBalance");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.NewBalance.INSTANCE, true).toJson(writer, customScalarAdapters, value.getNewBalance());
            writer.name("totalPurchases");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.TotalPurchases.INSTANCE, true).toJson(writer, customScalarAdapters, value.getTotalPurchases());
            writer.name("totalPaymentCredits");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.TotalPaymentCredits.INSTANCE, true).toJson(writer, customScalarAdapters, value.getTotalPaymentCredits());
            writer.name("totalInterestFinanceChargesAndFees");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.TotalInterestFinanceChargesAndFees.INSTANCE, true).toJson(writer, customScalarAdapters, value.getTotalInterestFinanceChargesAndFees());
            writer.name("apr");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getApr());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$MinimumPaymentDue;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$MinimumPaymentDue;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$MinimumPaymentDue;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$MinimumPaymentDue;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MinimumPaymentDue implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.MinimumPaymentDue> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.MinimumPaymentDue INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.MinimumPaymentDue();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private MinimumPaymentDue() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.MinimumPaymentDue fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.MinimumPaymentDue(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.MinimumPaymentDue value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$AvoidInterestMinimumPayment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$AvoidInterestMinimumPayment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$AvoidInterestMinimumPayment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$AvoidInterestMinimumPayment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AvoidInterestMinimumPayment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.AvoidInterestMinimumPayment> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.AvoidInterestMinimumPayment INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.AvoidInterestMinimumPayment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private AvoidInterestMinimumPayment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.AvoidInterestMinimumPayment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.AvoidInterestMinimumPayment(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.AvoidInterestMinimumPayment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$PreviousBalance;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$PreviousBalance;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$PreviousBalance;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$PreviousBalance;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PreviousBalance implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.PreviousBalance> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.PreviousBalance INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.PreviousBalance();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private PreviousBalance() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.PreviousBalance fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.PreviousBalance(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.PreviousBalance value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$NewBalance;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$NewBalance;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$NewBalance;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$NewBalance;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NewBalance implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.NewBalance> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.NewBalance INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.NewBalance();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private NewBalance() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.NewBalance fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.NewBalance(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.NewBalance value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$TotalPurchases;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$TotalPurchases;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$TotalPurchases;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$TotalPurchases;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TotalPurchases implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalPurchases> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.TotalPurchases INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.TotalPurchases();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private TotalPurchases() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalPurchases fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalPurchases(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalPurchases value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$TotalPaymentCredits;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$TotalPaymentCredits;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$TotalPaymentCredits;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$TotalPaymentCredits;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TotalPaymentCredits implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalPaymentCredits> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.TotalPaymentCredits INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.TotalPaymentCredits();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private TotalPaymentCredits() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalPaymentCredits fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalPaymentCredits(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalPaymentCredits value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$TotalInterestFinanceChargesAndFees;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$TotalInterestFinanceChargesAndFees;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$TotalInterestFinanceChargesAndFees;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$TotalInterestFinanceChargesAndFees;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TotalInterestFinanceChargesAndFees implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalInterestFinanceChargesAndFees> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.TotalInterestFinanceChargesAndFees INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.TotalInterestFinanceChargesAndFees();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private TotalInterestFinanceChargesAndFees() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalInterestFinanceChargesAndFees fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalInterestFinanceChargesAndFees(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalInterestFinanceChargesAndFees value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$Activity;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Activity;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Activity;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Activity;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Activity implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Activity> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Activity INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Activity();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "type", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "amount", "transactionTime", "transactionReferenceNumber", "settled", "businessName", "displayLogo", "rewards", "offerConstruct"});
        public static final int $stable = 8;

        private Activity() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x00cb, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "transactionTime");
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x00d5, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x00d6, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "amount");
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x00e0, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00e1, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "type");
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00eb, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
        
            if (r5 == null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
        
            if (r7 == null) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
        
            if (r8 == null) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
        
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Activity(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Activity fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingActivityType revolvingCreditServicingActivityType = null;
            java.lang.String str = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Amount amount = null;
            java.lang.Object obj2 = null;
            java.lang.Object obj3 = null;
            java.lang.Boolean bool = null;
            java.lang.String str2 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.DisplayLogo displayLogo = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Rewards rewards = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.OfferConstruct offerConstruct = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        revolvingCreditServicingActivityType = com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditServicingActivityType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        amount = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Amount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Amount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        obj2 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        obj3 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        displayLogo = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.DisplayLogo) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.DisplayLogo.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        rewards = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Rewards) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Rewards.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        offerConstruct = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.OfferConstruct) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.OfferConstruct.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Activity value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditServicingActivityType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getDescription());
            writer.name("amount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Amount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getAmount());
            writer.name("transactionTime");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getTransactionTime());
            writer.name("transactionReferenceNumber");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getTransactionReferenceNumber());
            writer.name("settled");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getSettled());
            writer.name("businessName");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getBusinessName());
            writer.name("displayLogo");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.DisplayLogo.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getDisplayLogo());
            writer.name("rewards");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Rewards.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getRewards());
            writer.name("offerConstruct");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.OfferConstruct.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getOfferConstruct());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$Amount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Amount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Amount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Amount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Amount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Amount> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Amount INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Amount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Amount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Amount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Amount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Amount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$DisplayLogo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$DisplayLogo;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$DisplayLogo;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$DisplayLogo;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DisplayLogo implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.DisplayLogo> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.DisplayLogo INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.DisplayLogo();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private DisplayLogo() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.DisplayLogo fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragmentImpl_ResponseAdapter.RevolvingCreditImageFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.DisplayLogo(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.DisplayLogo value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragmentImpl_ResponseAdapter.RevolvingCreditImageFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditImageFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$Rewards;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Rewards;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Rewards;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Rewards;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Rewards implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Rewards> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Rewards INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Rewards();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("cashback");
        public static final int $stable = 8;

        private Rewards() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Rewards fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Cashback cashback = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                cashback = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Cashback) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Cashback.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Rewards(cashback);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Rewards value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("cashback");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Cashback.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getCashback());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$Cashback;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Cashback;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Cashback;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Cashback;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Cashback implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Cashback> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Cashback INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Cashback();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("percent");
        public static final int $stable = 8;

        private Cashback() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Cashback fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Cashback(obj);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Cashback value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("percent");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getPercent());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$OfferConstruct;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$OfferConstruct;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$OfferConstruct;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$OfferConstruct;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OfferConstruct implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.OfferConstruct> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.OfferConstruct INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.OfferConstruct();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "types"});
        public static final int $stable = 8;

        private OfferConstruct() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.OfferConstruct fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.CreditOfferConstructType_ResponseAdapter.INSTANCE)).fromJson(reader, customScalarAdapters);
                }
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.OfferConstruct(obj, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "id");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.OfferConstruct value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("types");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.CreditOfferConstructType_ResponseAdapter.INSTANCE)).toJson(writer, customScalarAdapters, value.getTypes());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$PromotionalActivity;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$PromotionalActivity;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$PromotionalActivity;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$PromotionalActivity;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PromotionalActivity implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.PromotionalActivity> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.PromotionalActivity INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.PromotionalActivity();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"businessName", "expirationTime", "interestAccrued", "originalTransactionAmount", "remainingBalance", "offerConstruct", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "time"});
        public static final int $stable = 8;

        private PromotionalActivity() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x00ab, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        
            if (r9 == null) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.PromotionalActivity(r2, r3, r4, r5, r6, r7, r8, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x00a1, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "time");
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.PromotionalActivity fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.Object obj = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.InterestAccrued interestAccrued = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.OriginalTransactionAmount originalTransactionAmount = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RemainingBalance remainingBalance = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.OfferConstruct1 offerConstruct1 = null;
            java.lang.String str2 = null;
            java.lang.Object obj2 = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        interestAccrued = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.InterestAccrued) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.InterestAccrued.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        originalTransactionAmount = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.OriginalTransactionAmount) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.OriginalTransactionAmount.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        remainingBalance = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RemainingBalance) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RemainingBalance.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        offerConstruct1 = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.OfferConstruct1) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.OfferConstruct1.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        obj2 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.PromotionalActivity value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("businessName");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getBusinessName());
            writer.name("expirationTime");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getExpirationTime());
            writer.name("interestAccrued");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.InterestAccrued.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getInterestAccrued());
            writer.name("originalTransactionAmount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.OriginalTransactionAmount.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getOriginalTransactionAmount());
            writer.name("remainingBalance");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RemainingBalance.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getRemainingBalance());
            writer.name("offerConstruct");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.OfferConstruct1.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getOfferConstruct());
            writer.name(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getDescription());
            writer.name("time");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getTime());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$InterestAccrued;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$InterestAccrued;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$InterestAccrued;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$InterestAccrued;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InterestAccrued implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.InterestAccrued> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.InterestAccrued INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.InterestAccrued();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private InterestAccrued() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.InterestAccrued fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.InterestAccrued(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.InterestAccrued value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$OriginalTransactionAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$OriginalTransactionAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$OriginalTransactionAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$OriginalTransactionAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OriginalTransactionAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.OriginalTransactionAmount> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.OriginalTransactionAmount INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.OriginalTransactionAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OriginalTransactionAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.OriginalTransactionAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.OriginalTransactionAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.OriginalTransactionAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$RemainingBalance;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RemainingBalance;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RemainingBalance;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RemainingBalance;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RemainingBalance implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RemainingBalance> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RemainingBalance INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RemainingBalance();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private RemainingBalance() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RemainingBalance fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RemainingBalance(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RemainingBalance value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$OfferConstruct1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$OfferConstruct1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$OfferConstruct1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$OfferConstruct1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OfferConstruct1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.OfferConstruct1> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.OfferConstruct1 INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.OfferConstruct1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "types"});
        public static final int $stable = 8;

        private OfferConstruct1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.OfferConstruct1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.CreditOfferConstructType_ResponseAdapter.INSTANCE)).fromJson(reader, customScalarAdapters);
                }
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.OfferConstruct1(obj, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "id");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.OfferConstruct1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("types");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.CreditOfferConstructType_ResponseAdapter.INSTANCE)).toJson(writer, customScalarAdapters, value.getTypes());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$RewardsSummary;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RewardsSummary;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RewardsSummary;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RewardsSummary;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RewardsSummary implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsSummary> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RewardsSummary INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RewardsSummary();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"totalLifetimeRewardsAmount", "redeemedAmount", "yearToDateSpentAmount", "priorBalanceAmount", "residualBalanceAmount", "netEarnedAmount", "rewardTiers", "adjustments", "totalAdjustments"});
        public static final int $stable = 8;

        private RewardsSummary() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
        
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsSummary(r2, r3, r4, r5, r6, r7, r8, r9, r10);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsSummary fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalLifetimeRewardsAmount totalLifetimeRewardsAmount = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RedeemedAmount redeemedAmount = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.YearToDateSpentAmount yearToDateSpentAmount = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.PriorBalanceAmount priorBalanceAmount = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.ResidualBalanceAmount residualBalanceAmount = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.NetEarnedAmount netEarnedAmount = null;
            java.util.List list = null;
            java.util.List list2 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalAdjustments totalAdjustments = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        totalLifetimeRewardsAmount = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalLifetimeRewardsAmount) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.TotalLifetimeRewardsAmount.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        redeemedAmount = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RedeemedAmount) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RedeemedAmount.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        yearToDateSpentAmount = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.YearToDateSpentAmount) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.YearToDateSpentAmount.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        priorBalanceAmount = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.PriorBalanceAmount) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.PriorBalanceAmount.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        residualBalanceAmount = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.ResidualBalanceAmount) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.ResidualBalanceAmount.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        netEarnedAmount = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.NetEarnedAmount) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.NetEarnedAmount.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RewardTier.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        list2 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Adjustment.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        totalAdjustments = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalAdjustments) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.TotalAdjustments.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsSummary value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("totalLifetimeRewardsAmount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.TotalLifetimeRewardsAmount.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getTotalLifetimeRewardsAmount());
            writer.name("redeemedAmount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RedeemedAmount.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getRedeemedAmount());
            writer.name("yearToDateSpentAmount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.YearToDateSpentAmount.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getYearToDateSpentAmount());
            writer.name("priorBalanceAmount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.PriorBalanceAmount.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getPriorBalanceAmount());
            writer.name("residualBalanceAmount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.ResidualBalanceAmount.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getResidualBalanceAmount());
            writer.name("netEarnedAmount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.NetEarnedAmount.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getNetEarnedAmount());
            writer.name("rewardTiers");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RewardTier.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getRewardTiers());
            writer.name("adjustments");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Adjustment.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getAdjustments());
            writer.name("totalAdjustments");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.TotalAdjustments.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getTotalAdjustments());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$TotalLifetimeRewardsAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$TotalLifetimeRewardsAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$TotalLifetimeRewardsAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$TotalLifetimeRewardsAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TotalLifetimeRewardsAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalLifetimeRewardsAmount> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.TotalLifetimeRewardsAmount INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.TotalLifetimeRewardsAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private TotalLifetimeRewardsAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalLifetimeRewardsAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalLifetimeRewardsAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalLifetimeRewardsAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$RedeemedAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RedeemedAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RedeemedAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RedeemedAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RedeemedAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RedeemedAmount> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RedeemedAmount INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RedeemedAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private RedeemedAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RedeemedAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RedeemedAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RedeemedAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$YearToDateSpentAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$YearToDateSpentAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$YearToDateSpentAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$YearToDateSpentAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class YearToDateSpentAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.YearToDateSpentAmount> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.YearToDateSpentAmount INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.YearToDateSpentAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private YearToDateSpentAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.YearToDateSpentAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.YearToDateSpentAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.YearToDateSpentAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$PriorBalanceAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$PriorBalanceAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$PriorBalanceAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$PriorBalanceAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PriorBalanceAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.PriorBalanceAmount> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.PriorBalanceAmount INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.PriorBalanceAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private PriorBalanceAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.PriorBalanceAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.PriorBalanceAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.PriorBalanceAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$ResidualBalanceAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$ResidualBalanceAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$ResidualBalanceAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$ResidualBalanceAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ResidualBalanceAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.ResidualBalanceAmount> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.ResidualBalanceAmount INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.ResidualBalanceAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private ResidualBalanceAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.ResidualBalanceAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.ResidualBalanceAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.ResidualBalanceAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$NetEarnedAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$NetEarnedAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$NetEarnedAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$NetEarnedAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NetEarnedAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.NetEarnedAmount> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.NetEarnedAmount INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.NetEarnedAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private NetEarnedAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.NetEarnedAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.NetEarnedAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.NetEarnedAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$RewardTier;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RewardTier;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RewardTier;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RewardTier;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RewardTier implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardTier> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RewardTier INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RewardTier();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"percentage", "rewardsEarned"});
        public static final int $stable = 8;

        private RewardTier() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardTier fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsEarned rewardsEarned = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    rewardsEarned = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsEarned) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RewardsEarned.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardTier(obj, rewardsEarned);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardTier value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("percentage");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getPercentage());
            writer.name("rewardsEarned");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RewardsEarned.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getRewardsEarned());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$RewardsEarned;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RewardsEarned;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RewardsEarned;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RewardsEarned;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RewardsEarned implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsEarned> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RewardsEarned INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RewardsEarned();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private RewardsEarned() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsEarned fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsEarned(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsEarned value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$Adjustment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Adjustment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Adjustment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$Adjustment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Adjustment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Adjustment> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Adjustment INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.Adjustment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"percentage", "category", "rewardsEarned"});
        public static final int $stable = 8;

        private Adjustment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Adjustment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAdjustmentCategory revolvingCreditAdjustmentCategory = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsEarned1 rewardsEarned1 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    revolvingCreditAdjustmentCategory = (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAdjustmentCategory) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditAdjustmentCategory_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    rewardsEarned1 = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsEarned1) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RewardsEarned1.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Adjustment(obj, revolvingCreditAdjustmentCategory, rewardsEarned1);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.Adjustment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("percentage");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getPercentage());
            writer.name("category");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditAdjustmentCategory_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getCategory());
            writer.name("rewardsEarned");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RewardsEarned1.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getRewardsEarned());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$RewardsEarned1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RewardsEarned1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RewardsEarned1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$RewardsEarned1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RewardsEarned1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsEarned1> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RewardsEarned1 INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.RewardsEarned1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private RewardsEarned1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsEarned1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsEarned1(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.RewardsEarned1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/adapter/GetRevolvingCreditStatementDetailsQuery_ResponseAdapter$TotalAdjustments;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$TotalAdjustments;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$TotalAdjustments;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/GetRevolvingCreditStatementDetailsQuery$TotalAdjustments;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TotalAdjustments implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalAdjustments> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.TotalAdjustments INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.GetRevolvingCreditStatementDetailsQuery_ResponseAdapter.TotalAdjustments();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private TotalAdjustments() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalAdjustments fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalAdjustments(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditStatementDetailsQuery.TotalAdjustments value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditMoneyFragmentImpl_ResponseAdapter.RevolvingCreditMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditMoneyFragment());
        }
    }
}
