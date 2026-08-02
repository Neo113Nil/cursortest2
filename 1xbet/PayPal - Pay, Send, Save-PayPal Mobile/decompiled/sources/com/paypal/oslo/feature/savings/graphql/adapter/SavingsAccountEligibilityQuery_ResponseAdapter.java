package com.paypal.oslo.feature.savings.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/adapter/SavingsAccountEligibilityQuery_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OPERATION_NAME, "SavingsProductSubscription", "IneligibilityReason", "OnboardingProperties", "Policy", "CashPlusProductSubscription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsAccountEligibilityQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/adapter/SavingsAccountEligibilityQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Data> {
        public static final com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("savingsAccountEligibility");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsAccountEligibility savingsAccountEligibility = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                savingsAccountEligibility = (com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsAccountEligibility) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.SavingsAccountEligibility.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (savingsAccountEligibility != null) {
                return new com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Data(savingsAccountEligibility);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "savingsAccountEligibility");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("savingsAccountEligibility");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.SavingsAccountEligibility.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getSavingsAccountEligibility());
        }
    }

    private SavingsAccountEligibilityQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/adapter/SavingsAccountEligibilityQuery_ResponseAdapter$SavingsAccountEligibility;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$SavingsAccountEligibility;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$SavingsAccountEligibility;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$SavingsAccountEligibility;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SavingsAccountEligibility implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsAccountEligibility> {
        public static final com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.SavingsAccountEligibility INSTANCE = new com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.SavingsAccountEligibility();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"savingsProductSubscription", "cashPlusProductSubscription"});
        public static final int $stable = 8;

        private SavingsAccountEligibility() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsAccountEligibility fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsProductSubscription savingsProductSubscription = null;
            com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.CashPlusProductSubscription cashPlusProductSubscription = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    savingsProductSubscription = (com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsProductSubscription) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.SavingsProductSubscription.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    cashPlusProductSubscription = (com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.CashPlusProductSubscription) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.CashPlusProductSubscription.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                }
            }
            if (savingsProductSubscription == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "savingsProductSubscription");
                throw new kotlin.KotlinNothingValueException();
            }
            if (cashPlusProductSubscription != null) {
                return new com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsAccountEligibility(savingsProductSubscription, cashPlusProductSubscription);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "cashPlusProductSubscription");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsAccountEligibility value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("savingsProductSubscription");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.SavingsProductSubscription.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getSavingsProductSubscription());
            writer.name("cashPlusProductSubscription");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.CashPlusProductSubscription.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getCashPlusProductSubscription());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/adapter/SavingsAccountEligibilityQuery_ResponseAdapter$SavingsProductSubscription;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$SavingsProductSubscription;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$SavingsProductSubscription;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$SavingsProductSubscription;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SavingsProductSubscription implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsProductSubscription> {
        public static final com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.SavingsProductSubscription INSTANCE = new com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.SavingsProductSubscription();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "status", "ineligibilityReason", "onboardingProperties"});
        public static final int $stable = 8;

        private SavingsProductSubscription() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsProductSubscription fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.SavingsProductSubscriptionStatus savingsProductSubscriptionStatus = null;
            com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason ineligibilityReason = null;
            com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties onboardingProperties = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    savingsProductSubscriptionStatus = com.paypal.oslo.api.graphql.schema.type.adapter.SavingsProductSubscriptionStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    ineligibilityReason = (com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.IneligibilityReason.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    onboardingProperties = (com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.OnboardingProperties.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (savingsProductSubscriptionStatus != null) {
                return new com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsProductSubscription(str, savingsProductSubscriptionStatus, ineligibilityReason, onboardingProperties);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "status");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsProductSubscription value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.SavingsProductSubscriptionStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("ineligibilityReason");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.IneligibilityReason.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getIneligibilityReason());
            writer.name("onboardingProperties");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.OnboardingProperties.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getOnboardingProperties());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/adapter/SavingsAccountEligibilityQuery_ResponseAdapter$IneligibilityReason;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$IneligibilityReason;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$IneligibilityReason;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$IneligibilityReason;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class IneligibilityReason implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason> {
        public static final com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.IneligibilityReason INSTANCE = new com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.IneligibilityReason();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"reasonCode", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION});
        public static final int $stable = 8;

        private IneligibilityReason() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode savingsIneligibilityReasonCode = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    savingsIneligibilityReasonCode = com.paypal.oslo.api.graphql.schema.type.adapter.SavingsIneligibilityReasonCode_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (savingsIneligibilityReasonCode != null) {
                return new com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason(savingsIneligibilityReasonCode, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "reasonCode");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("reasonCode");
            com.paypal.oslo.api.graphql.schema.type.adapter.SavingsIneligibilityReasonCode_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getReasonCode());
            writer.name(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getDescription());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/adapter/SavingsAccountEligibilityQuery_ResponseAdapter$OnboardingProperties;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$OnboardingProperties;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$OnboardingProperties;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$OnboardingProperties;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnboardingProperties implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties> {
        public static final com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.OnboardingProperties INSTANCE = new com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.OnboardingProperties();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"showDocUpload", "policies"});
        public static final int $stable = 8;

        private OnboardingProperties() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.Policy.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                }
            }
            if (bool != null) {
                return new com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties(bool.booleanValue(), list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "showDocUpload");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("showDocUpload");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getShowDocUpload()));
            writer.name("policies");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.Policy.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getPolicies());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/adapter/SavingsAccountEligibilityQuery_ResponseAdapter$Policy;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$Policy;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$Policy;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$Policy;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Policy implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Policy> {
        public static final com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.Policy INSTANCE = new com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.Policy();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "name"});
        public static final int $stable = 8;

        private Policy() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Policy fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.SavingsSubscriptionPolicyName savingsSubscriptionPolicyName = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    savingsSubscriptionPolicyName = com.paypal.oslo.api.graphql.schema.type.adapter.SavingsSubscriptionPolicyName_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (savingsSubscriptionPolicyName != null) {
                return new com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Policy(str, savingsSubscriptionPolicyName);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Policy value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("name");
            com.paypal.oslo.api.graphql.schema.type.adapter.SavingsSubscriptionPolicyName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/adapter/SavingsAccountEligibilityQuery_ResponseAdapter$CashPlusProductSubscription;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$CashPlusProductSubscription;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$CashPlusProductSubscription;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$CashPlusProductSubscription;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CashPlusProductSubscription implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.CashPlusProductSubscription> {
        public static final com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.CashPlusProductSubscription INSTANCE = new com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.CashPlusProductSubscription();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "status"});
        public static final int $stable = 8;

        private CashPlusProductSubscription() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.CashPlusProductSubscription fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.CashPlusProductSubscriptionStatus cashPlusProductSubscriptionStatus = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    cashPlusProductSubscriptionStatus = com.paypal.oslo.api.graphql.schema.type.adapter.CashPlusProductSubscriptionStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (cashPlusProductSubscriptionStatus != null) {
                return new com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.CashPlusProductSubscription(str, cashPlusProductSubscriptionStatus);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "status");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.CashPlusProductSubscription value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.CashPlusProductSubscriptionStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
        }
    }
}
