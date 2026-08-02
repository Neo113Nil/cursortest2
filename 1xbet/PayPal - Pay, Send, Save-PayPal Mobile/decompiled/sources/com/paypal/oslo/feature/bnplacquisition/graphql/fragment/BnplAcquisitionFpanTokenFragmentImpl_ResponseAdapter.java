package com.paypal.oslo.feature.bnplacquisition.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionFpanTokenFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "BnplAcquisitionFpanTokenFragment", "ProvisionedExternalWalletToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BnplAcquisitionFpanTokenFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionFpanTokenFragmentImpl_ResponseAdapter$BnplAcquisitionFpanTokenFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionFpanTokenFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionFpanTokenFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionFpanTokenFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BnplAcquisitionFpanTokenFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragmentImpl_ResponseAdapter.BnplAcquisitionFpanTokenFragment INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragmentImpl_ResponseAdapter.BnplAcquisitionFpanTokenFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"cardNetwork", "provisionedExternalWalletTokens", "serviceProvider"});
        public static final int $stable = 8;

        private BnplAcquisitionFpanTokenFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.IssuanceCardNetwork issuanceCardNetwork = null;
            com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider issuanceNetworkTokenServiceProvider = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    issuanceCardNetwork = com.paypal.oslo.api.graphql.schema.type.adapter.IssuanceCardNetwork_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragmentImpl_ResponseAdapter.ProvisionedExternalWalletToken.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    issuanceNetworkTokenServiceProvider = com.paypal.oslo.api.graphql.schema.type.adapter.IssuanceNetworkTokenServiceProvider_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (issuanceCardNetwork == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "cardNetwork");
                throw new kotlin.KotlinNothingValueException();
            }
            if (issuanceNetworkTokenServiceProvider != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment(issuanceCardNetwork, list, issuanceNetworkTokenServiceProvider);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "serviceProvider");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("cardNetwork");
            com.paypal.oslo.api.graphql.schema.type.adapter.IssuanceCardNetwork_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getCardNetwork());
            writer.name("provisionedExternalWalletTokens");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragmentImpl_ResponseAdapter.ProvisionedExternalWalletToken.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getProvisionedExternalWalletTokens());
            writer.name("serviceProvider");
            com.paypal.oslo.api.graphql.schema.type.adapter.IssuanceNetworkTokenServiceProvider_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getServiceProvider());
        }
    }

    private BnplAcquisitionFpanTokenFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionFpanTokenFragmentImpl_ResponseAdapter$ProvisionedExternalWalletToken;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionFpanTokenFragment$ProvisionedExternalWalletToken;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionFpanTokenFragment$ProvisionedExternalWalletToken;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/fragment/BnplAcquisitionFpanTokenFragment$ProvisionedExternalWalletToken;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ProvisionedExternalWalletToken implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment.ProvisionedExternalWalletToken> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragmentImpl_ResponseAdapter.ProvisionedExternalWalletToken INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragmentImpl_ResponseAdapter.ProvisionedExternalWalletToken();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"deviceType", "referenceId", "walletType"});
        public static final int $stable = 8;

        private ProvisionedExternalWalletToken() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment.ProvisionedExternalWalletToken fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType creditExternalWalletDeviceType = null;
            com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType creditExternalWalletType = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    creditExternalWalletDeviceType = com.paypal.oslo.api.graphql.schema.type.adapter.CreditExternalWalletDeviceType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    creditExternalWalletType = com.paypal.oslo.api.graphql.schema.type.adapter.CreditExternalWalletType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (creditExternalWalletDeviceType == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "deviceType");
                throw new kotlin.KotlinNothingValueException();
            }
            if (creditExternalWalletType != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment.ProvisionedExternalWalletToken(creditExternalWalletDeviceType, obj, creditExternalWalletType);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "walletType");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment.ProvisionedExternalWalletToken value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("deviceType");
            com.paypal.oslo.api.graphql.schema.type.adapter.CreditExternalWalletDeviceType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getDeviceType());
            writer.name("referenceId");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getReferenceId());
            writer.name("walletType");
            com.paypal.oslo.api.graphql.schema.type.adapter.CreditExternalWalletType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getWalletType());
        }
    }
}
