package com.paypal.oslo.feature.packagetracking.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/adapter/DeauthorizePackageTrackingForAllProvidersMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.OPERATION_NAME, "Deauthorization"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeauthorizePackageTrackingForAllProvidersMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.packagetracking.graphql.adapter.DeauthorizePackageTrackingForAllProvidersMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.adapter.DeauthorizePackageTrackingForAllProvidersMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/adapter/DeauthorizePackageTrackingForAllProvidersMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Data> {
        public static final com.paypal.oslo.feature.packagetracking.graphql.adapter.DeauthorizePackageTrackingForAllProvidersMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.adapter.DeauthorizePackageTrackingForAllProvidersMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("deauthorizePackageTrackingForAllProviders");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders deauthorizePackageTrackingForAllProviders = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                deauthorizePackageTrackingForAllProviders = (com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.DeauthorizePackageTrackingForAllProvidersMutation_ResponseAdapter.DeauthorizePackageTrackingForAllProviders.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Data(deauthorizePackageTrackingForAllProviders);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("deauthorizePackageTrackingForAllProviders");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.DeauthorizePackageTrackingForAllProvidersMutation_ResponseAdapter.DeauthorizePackageTrackingForAllProviders.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getDeauthorizePackageTrackingForAllProviders());
        }
    }

    private DeauthorizePackageTrackingForAllProvidersMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/adapter/DeauthorizePackageTrackingForAllProvidersMutation_ResponseAdapter$DeauthorizePackageTrackingForAllProviders;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$DeauthorizePackageTrackingForAllProviders;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$DeauthorizePackageTrackingForAllProviders;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$DeauthorizePackageTrackingForAllProviders;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DeauthorizePackageTrackingForAllProviders implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders> {
        public static final com.paypal.oslo.feature.packagetracking.graphql.adapter.DeauthorizePackageTrackingForAllProvidersMutation_ResponseAdapter.DeauthorizePackageTrackingForAllProviders INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.adapter.DeauthorizePackageTrackingForAllProvidersMutation_ResponseAdapter.DeauthorizePackageTrackingForAllProviders();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("deauthorizations");
        public static final int $stable = 8;

        private DeauthorizePackageTrackingForAllProviders() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.DeauthorizePackageTrackingForAllProvidersMutation_ResponseAdapter.Deauthorization.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders(list);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.DeauthorizePackageTrackingForAllProviders value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("deauthorizations");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.packagetracking.graphql.adapter.DeauthorizePackageTrackingForAllProvidersMutation_ResponseAdapter.Deauthorization.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getDeauthorizations());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/graphql/adapter/DeauthorizePackageTrackingForAllProvidersMutation_ResponseAdapter$Deauthorization;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$Deauthorization;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$Deauthorization;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/packagetracking/graphql/DeauthorizePackageTrackingForAllProvidersMutation$Deauthorization;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Deauthorization implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization> {
        public static final com.paypal.oslo.feature.packagetracking.graphql.adapter.DeauthorizePackageTrackingForAllProvidersMutation_ResponseAdapter.Deauthorization INSTANCE = new com.paypal.oslo.feature.packagetracking.graphql.adapter.DeauthorizePackageTrackingForAllProvidersMutation_ResponseAdapter.Deauthorization();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"dataDeleted", "deauthorized", "emailProvider"});
        public static final int $stable = 8;

        private Deauthorization() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.Boolean bool2 = null;
            com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    bool = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    bool2 = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    packageTrackingIdentityProvider = (com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.PackageTrackingIdentityProvider_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization(bool, bool2, packageTrackingIdentityProvider);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.packagetracking.graphql.DeauthorizePackageTrackingForAllProvidersMutation.Deauthorization value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("dataDeleted");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getDataDeleted());
            writer.name("deauthorized");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getDeauthorized());
            writer.name("emailProvider");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.PackageTrackingIdentityProvider_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getEmailProvider());
        }
    }
}
