package com.paypal.oslo.feature.merchantbanking.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/graphql/adapter/ProvisionVirtualBankAccountMutation_ResponseAdapter;", "", "<init>", "()V", "Data", "ProvisionVirtualBankAccount", "VirtualBankAccount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProvisionVirtualBankAccountMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.merchantbanking.graphql.adapter.ProvisionVirtualBankAccountMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.merchantbanking.graphql.adapter.ProvisionVirtualBankAccountMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/graphql/adapter/ProvisionVirtualBankAccountMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.Data> {
        public static final com.paypal.oslo.feature.merchantbanking.graphql.adapter.ProvisionVirtualBankAccountMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.merchantbanking.graphql.adapter.ProvisionVirtualBankAccountMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("provisionVirtualBankAccount");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount provisionVirtualBankAccount = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                provisionVirtualBankAccount = (com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.merchantbanking.graphql.adapter.ProvisionVirtualBankAccountMutation_ResponseAdapter.ProvisionVirtualBankAccount.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (provisionVirtualBankAccount != null) {
                return new com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.Data(provisionVirtualBankAccount);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "provisionVirtualBankAccount");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("provisionVirtualBankAccount");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.merchantbanking.graphql.adapter.ProvisionVirtualBankAccountMutation_ResponseAdapter.ProvisionVirtualBankAccount.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getProvisionVirtualBankAccount());
        }
    }

    private ProvisionVirtualBankAccountMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/graphql/adapter/ProvisionVirtualBankAccountMutation_ResponseAdapter$ProvisionVirtualBankAccount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$ProvisionVirtualBankAccount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$ProvisionVirtualBankAccount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$ProvisionVirtualBankAccount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ProvisionVirtualBankAccount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount> {
        public static final com.paypal.oslo.feature.merchantbanking.graphql.adapter.ProvisionVirtualBankAccountMutation_ResponseAdapter.ProvisionVirtualBankAccount INSTANCE = new com.paypal.oslo.feature.merchantbanking.graphql.adapter.ProvisionVirtualBankAccountMutation_ResponseAdapter.ProvisionVirtualBankAccount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"status", "reason", "virtualBankAccount"});
        public static final int $stable = 8;

        private ProvisionVirtualBankAccount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus virtualBankAccountProvisioningStatus = null;
            com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason virtualBankAccountProvisioningOutcomeReason = null;
            com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount virtualBankAccount = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    virtualBankAccountProvisioningStatus = com.paypal.oslo.api.graphql.schema.type.adapter.VirtualBankAccountProvisioningStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    virtualBankAccountProvisioningOutcomeReason = (com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.VirtualBankAccountProvisioningOutcomeReason_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    virtualBankAccount = (com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.merchantbanking.graphql.adapter.ProvisionVirtualBankAccountMutation_ResponseAdapter.VirtualBankAccount.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (virtualBankAccountProvisioningStatus != null) {
                return new com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount(virtualBankAccountProvisioningStatus, virtualBankAccountProvisioningOutcomeReason, virtualBankAccount);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "status");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.VirtualBankAccountProvisioningStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("reason");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.VirtualBankAccountProvisioningOutcomeReason_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getReason());
            writer.name("virtualBankAccount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.merchantbanking.graphql.adapter.ProvisionVirtualBankAccountMutation_ResponseAdapter.VirtualBankAccount.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getVirtualBankAccount());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/graphql/adapter/ProvisionVirtualBankAccountMutation_ResponseAdapter$VirtualBankAccount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$VirtualBankAccount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$VirtualBankAccount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$VirtualBankAccount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class VirtualBankAccount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount> {
        public static final com.paypal.oslo.feature.merchantbanking.graphql.adapter.ProvisionVirtualBankAccountMutation_ResponseAdapter.VirtualBankAccount INSTANCE = new com.paypal.oslo.feature.merchantbanking.graphql.adapter.ProvisionVirtualBankAccountMutation_ResponseAdapter.VirtualBankAccount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"bankAccountNumber", "routingNumber"});
        public static final int $stable = 8;

        private VirtualBankAccount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount(str, str2);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("bankAccountNumber");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getBankAccountNumber());
            writer.name("routingNumber");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getRoutingNumber());
        }
    }
}
