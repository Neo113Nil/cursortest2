package com.paypal.oslo.feature.contacts.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/contacts/graphql/adapter/DeleteContactsRecentSearchesMutation_ResponseAdapter;", "", "<init>", "()V", "Data", "DeleteRecentSearches"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeleteContactsRecentSearchesMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.contacts.graphql.adapter.DeleteContactsRecentSearchesMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.contacts.graphql.adapter.DeleteContactsRecentSearchesMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/contacts/graphql/adapter/DeleteContactsRecentSearchesMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/contacts/graphql/DeleteContactsRecentSearchesMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/contacts/graphql/DeleteContactsRecentSearchesMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/contacts/graphql/DeleteContactsRecentSearchesMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.contacts.graphql.DeleteContactsRecentSearchesMutation.Data> {
        public static final com.paypal.oslo.feature.contacts.graphql.adapter.DeleteContactsRecentSearchesMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.contacts.graphql.adapter.DeleteContactsRecentSearchesMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("deleteRecentSearches");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.contacts.graphql.DeleteContactsRecentSearchesMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.contacts.graphql.DeleteContactsRecentSearchesMutation.DeleteRecentSearches deleteRecentSearches = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                deleteRecentSearches = (com.paypal.oslo.feature.contacts.graphql.DeleteContactsRecentSearchesMutation.DeleteRecentSearches) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.contacts.graphql.adapter.DeleteContactsRecentSearchesMutation_ResponseAdapter.DeleteRecentSearches.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (deleteRecentSearches != null) {
                return new com.paypal.oslo.feature.contacts.graphql.DeleteContactsRecentSearchesMutation.Data(deleteRecentSearches);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "deleteRecentSearches");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.contacts.graphql.DeleteContactsRecentSearchesMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("deleteRecentSearches");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.contacts.graphql.adapter.DeleteContactsRecentSearchesMutation_ResponseAdapter.DeleteRecentSearches.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getDeleteRecentSearches());
        }
    }

    private DeleteContactsRecentSearchesMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/contacts/graphql/adapter/DeleteContactsRecentSearchesMutation_ResponseAdapter$DeleteRecentSearches;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/contacts/graphql/DeleteContactsRecentSearchesMutation$DeleteRecentSearches;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/contacts/graphql/DeleteContactsRecentSearchesMutation$DeleteRecentSearches;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/contacts/graphql/DeleteContactsRecentSearchesMutation$DeleteRecentSearches;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DeleteRecentSearches implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.contacts.graphql.DeleteContactsRecentSearchesMutation.DeleteRecentSearches> {
        public static final com.paypal.oslo.feature.contacts.graphql.adapter.DeleteContactsRecentSearchesMutation_ResponseAdapter.DeleteRecentSearches INSTANCE = new com.paypal.oslo.feature.contacts.graphql.adapter.DeleteContactsRecentSearchesMutation_ResponseAdapter.DeleteRecentSearches();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("networkType");
        public static final int $stable = 8;

        private DeleteRecentSearches() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.contacts.graphql.DeleteContactsRecentSearchesMutation.DeleteRecentSearches fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                contactNetworkType = com.paypal.oslo.api.graphql.schema.type.adapter.ContactNetworkType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (contactNetworkType != null) {
                return new com.paypal.oslo.feature.contacts.graphql.DeleteContactsRecentSearchesMutation.DeleteRecentSearches(contactNetworkType);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "networkType");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.contacts.graphql.DeleteContactsRecentSearchesMutation.DeleteRecentSearches value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("networkType");
            com.paypal.oslo.api.graphql.schema.type.adapter.ContactNetworkType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getNetworkType());
        }
    }
}
