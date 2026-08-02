package com.paypal.oslo.feature.userprofile.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/adapter/UpdatePartyPhoneMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.userprofile.graphql.UpdatePartyPhoneMutation.OPERATION_NAME, "Party"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpdatePartyPhoneMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.userprofile.graphql.adapter.UpdatePartyPhoneMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.adapter.UpdatePartyPhoneMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/adapter/UpdatePartyPhoneMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyPhoneMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyPhoneMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyPhoneMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.userprofile.graphql.UpdatePartyPhoneMutation.Data> {
        public static final com.paypal.oslo.feature.userprofile.graphql.adapter.UpdatePartyPhoneMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.adapter.UpdatePartyPhoneMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("updatePartyPhone");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.userprofile.graphql.UpdatePartyPhoneMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.userprofile.graphql.UpdatePartyPhoneMutation.UpdatePartyPhone updatePartyPhone = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                updatePartyPhone = (com.paypal.oslo.feature.userprofile.graphql.UpdatePartyPhoneMutation.UpdatePartyPhone) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.userprofile.graphql.adapter.UpdatePartyPhoneMutation_ResponseAdapter.UpdatePartyPhone.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (updatePartyPhone != null) {
                return new com.paypal.oslo.feature.userprofile.graphql.UpdatePartyPhoneMutation.Data(updatePartyPhone);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "updatePartyPhone");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.userprofile.graphql.UpdatePartyPhoneMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("updatePartyPhone");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.userprofile.graphql.adapter.UpdatePartyPhoneMutation_ResponseAdapter.UpdatePartyPhone.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getUpdatePartyPhone());
        }
    }

    private UpdatePartyPhoneMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/adapter/UpdatePartyPhoneMutation_ResponseAdapter$UpdatePartyPhone;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyPhoneMutation$UpdatePartyPhone;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyPhoneMutation$UpdatePartyPhone;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyPhoneMutation$UpdatePartyPhone;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UpdatePartyPhone implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.userprofile.graphql.UpdatePartyPhoneMutation.UpdatePartyPhone> {
        public static final com.paypal.oslo.feature.userprofile.graphql.adapter.UpdatePartyPhoneMutation_ResponseAdapter.UpdatePartyPhone INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.adapter.UpdatePartyPhoneMutation_ResponseAdapter.UpdatePartyPhone();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("party");
        public static final int $stable = 8;

        private UpdatePartyPhone() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.userprofile.graphql.UpdatePartyPhoneMutation.UpdatePartyPhone fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.userprofile.graphql.UpdatePartyPhoneMutation.Party party = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                party = (com.paypal.oslo.feature.userprofile.graphql.UpdatePartyPhoneMutation.Party) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.userprofile.graphql.adapter.UpdatePartyPhoneMutation_ResponseAdapter.Party.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (party != null) {
                return new com.paypal.oslo.feature.userprofile.graphql.UpdatePartyPhoneMutation.UpdatePartyPhone(party);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "party");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.userprofile.graphql.UpdatePartyPhoneMutation.UpdatePartyPhone value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("party");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.userprofile.graphql.adapter.UpdatePartyPhoneMutation_ResponseAdapter.Party.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getParty());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/adapter/UpdatePartyPhoneMutation_ResponseAdapter$Party;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyPhoneMutation$Party;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyPhoneMutation$Party;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/userprofile/graphql/UpdatePartyPhoneMutation$Party;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Party implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.userprofile.graphql.UpdatePartyPhoneMutation.Party> {
        public static final com.paypal.oslo.feature.userprofile.graphql.adapter.UpdatePartyPhoneMutation_ResponseAdapter.Party INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.adapter.UpdatePartyPhoneMutation_ResponseAdapter.Party();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("id");
        public static final int $stable = 8;

        private Party() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.userprofile.graphql.UpdatePartyPhoneMutation.Party fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = (java.lang.String) customScalarAdapters.responseAdapterFor(com.paypal.oslo.api.graphql.schema.type.PartyContactInfoID.INSTANCE.getType()).fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new com.paypal.oslo.feature.userprofile.graphql.UpdatePartyPhoneMutation.Party(str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "id");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.userprofile.graphql.UpdatePartyPhoneMutation.Party value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            customScalarAdapters.responseAdapterFor(com.paypal.oslo.api.graphql.schema.type.PartyContactInfoID.INSTANCE.getType()).toJson(writer, customScalarAdapters, value.getId());
        }
    }
}
