package com.paypal.oslo.feature.userprofile.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/adapter/InitiatePartyPhoneConfirmationMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.userprofile.graphql.InitiatePartyPhoneConfirmationMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InitiatePartyPhoneConfirmationMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.userprofile.graphql.adapter.InitiatePartyPhoneConfirmationMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.adapter.InitiatePartyPhoneConfirmationMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/adapter/InitiatePartyPhoneConfirmationMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/userprofile/graphql/InitiatePartyPhoneConfirmationMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/userprofile/graphql/InitiatePartyPhoneConfirmationMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/userprofile/graphql/InitiatePartyPhoneConfirmationMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.userprofile.graphql.InitiatePartyPhoneConfirmationMutation.Data> {
        public static final com.paypal.oslo.feature.userprofile.graphql.adapter.InitiatePartyPhoneConfirmationMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.adapter.InitiatePartyPhoneConfirmationMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("initiatePartyPhoneConfirmation");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.userprofile.graphql.InitiatePartyPhoneConfirmationMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.userprofile.graphql.InitiatePartyPhoneConfirmationMutation.InitiatePartyPhoneConfirmation initiatePartyPhoneConfirmation = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                initiatePartyPhoneConfirmation = (com.paypal.oslo.feature.userprofile.graphql.InitiatePartyPhoneConfirmationMutation.InitiatePartyPhoneConfirmation) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.userprofile.graphql.adapter.InitiatePartyPhoneConfirmationMutation_ResponseAdapter.InitiatePartyPhoneConfirmation.INSTANCE, true).fromJson(reader, customScalarAdapters);
            }
            if (initiatePartyPhoneConfirmation != null) {
                return new com.paypal.oslo.feature.userprofile.graphql.InitiatePartyPhoneConfirmationMutation.Data(initiatePartyPhoneConfirmation);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "initiatePartyPhoneConfirmation");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.userprofile.graphql.InitiatePartyPhoneConfirmationMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("initiatePartyPhoneConfirmation");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.userprofile.graphql.adapter.InitiatePartyPhoneConfirmationMutation_ResponseAdapter.InitiatePartyPhoneConfirmation.INSTANCE, true).toJson(writer, customScalarAdapters, value.getInitiatePartyPhoneConfirmation());
        }
    }

    private InitiatePartyPhoneConfirmationMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/adapter/InitiatePartyPhoneConfirmationMutation_ResponseAdapter$InitiatePartyPhoneConfirmation;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/userprofile/graphql/InitiatePartyPhoneConfirmationMutation$InitiatePartyPhoneConfirmation;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/userprofile/graphql/InitiatePartyPhoneConfirmationMutation$InitiatePartyPhoneConfirmation;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/userprofile/graphql/InitiatePartyPhoneConfirmationMutation$InitiatePartyPhoneConfirmation;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InitiatePartyPhoneConfirmation implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.userprofile.graphql.InitiatePartyPhoneConfirmationMutation.InitiatePartyPhoneConfirmation> {
        public static final com.paypal.oslo.feature.userprofile.graphql.adapter.InitiatePartyPhoneConfirmationMutation_ResponseAdapter.InitiatePartyPhoneConfirmation INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.adapter.InitiatePartyPhoneConfirmationMutation_ResponseAdapter.InitiatePartyPhoneConfirmation();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private InitiatePartyPhoneConfirmation() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.userprofile.graphql.InitiatePartyPhoneConfirmationMutation.InitiatePartyPhoneConfirmation fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.userprofile.graphql.fragment.InitiatePartyPhoneConfirmationResultFragment fromJson = com.paypal.oslo.feature.userprofile.graphql.fragment.InitiatePartyPhoneConfirmationResultFragmentImpl_ResponseAdapter.InitiatePartyPhoneConfirmationResultFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.userprofile.graphql.InitiatePartyPhoneConfirmationMutation.InitiatePartyPhoneConfirmation(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.userprofile.graphql.InitiatePartyPhoneConfirmationMutation.InitiatePartyPhoneConfirmation value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.userprofile.graphql.fragment.InitiatePartyPhoneConfirmationResultFragmentImpl_ResponseAdapter.InitiatePartyPhoneConfirmationResultFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getInitiatePartyPhoneConfirmationResultFragment());
        }
    }
}
