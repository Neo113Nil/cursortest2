package com.paypal.oslo.feature.userprofile.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/adapter/AddPartyBillingAddressMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.OPERATION_NAME, "Address"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddPartyBillingAddressMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.userprofile.graphql.adapter.AddPartyBillingAddressMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.adapter.AddPartyBillingAddressMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/adapter/AddPartyBillingAddressMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyBillingAddressMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyBillingAddressMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyBillingAddressMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.Data> {
        public static final com.paypal.oslo.feature.userprofile.graphql.adapter.AddPartyBillingAddressMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.adapter.AddPartyBillingAddressMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("addPartyBillingAddress");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.AddPartyBillingAddress addPartyBillingAddress = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                addPartyBillingAddress = (com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.AddPartyBillingAddress) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.userprofile.graphql.adapter.AddPartyBillingAddressMutation_ResponseAdapter.AddPartyBillingAddress.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (addPartyBillingAddress != null) {
                return new com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.Data(addPartyBillingAddress);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "addPartyBillingAddress");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("addPartyBillingAddress");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.userprofile.graphql.adapter.AddPartyBillingAddressMutation_ResponseAdapter.AddPartyBillingAddress.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getAddPartyBillingAddress());
        }
    }

    private AddPartyBillingAddressMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/adapter/AddPartyBillingAddressMutation_ResponseAdapter$AddPartyBillingAddress;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyBillingAddressMutation$AddPartyBillingAddress;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyBillingAddressMutation$AddPartyBillingAddress;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyBillingAddressMutation$AddPartyBillingAddress;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AddPartyBillingAddress implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.AddPartyBillingAddress> {
        public static final com.paypal.oslo.feature.userprofile.graphql.adapter.AddPartyBillingAddressMutation_ResponseAdapter.AddPartyBillingAddress INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.adapter.AddPartyBillingAddressMutation_ResponseAdapter.AddPartyBillingAddress();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("address");
        public static final int $stable = 8;

        private AddPartyBillingAddress() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.AddPartyBillingAddress fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.Address address = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                address = (com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.Address) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.userprofile.graphql.adapter.AddPartyBillingAddressMutation_ResponseAdapter.Address.INSTANCE, true).fromJson(reader, customScalarAdapters);
            }
            if (address != null) {
                return new com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.AddPartyBillingAddress(address);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "address");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.AddPartyBillingAddress value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("address");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.userprofile.graphql.adapter.AddPartyBillingAddressMutation_ResponseAdapter.Address.INSTANCE, true).toJson(writer, customScalarAdapters, value.getAddress());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/adapter/AddPartyBillingAddressMutation_ResponseAdapter$Address;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyBillingAddressMutation$Address;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyBillingAddressMutation$Address;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/userprofile/graphql/AddPartyBillingAddressMutation$Address;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Address implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.Address> {
        public static final com.paypal.oslo.feature.userprofile.graphql.adapter.AddPartyBillingAddressMutation_ResponseAdapter.Address INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.adapter.AddPartyBillingAddressMutation_ResponseAdapter.Address();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Address() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.Address fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFields fromJson = com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFieldsImpl_ResponseAdapter.BillingAddressFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.Address(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.userprofile.graphql.AddPartyBillingAddressMutation.Address value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.userprofile.graphql.fragment.BillingAddressFieldsImpl_ResponseAdapter.BillingAddressFields.INSTANCE.toJson(writer, customScalarAdapters, value.getBillingAddressFields());
        }
    }
}
