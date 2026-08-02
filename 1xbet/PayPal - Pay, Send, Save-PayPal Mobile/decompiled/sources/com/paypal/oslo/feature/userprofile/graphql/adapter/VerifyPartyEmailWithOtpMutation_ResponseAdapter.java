package com.paypal.oslo.feature.userprofile.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/adapter/VerifyPartyEmailWithOtpMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.OPERATION_NAME, "Email"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VerifyPartyEmailWithOtpMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.userprofile.graphql.adapter.VerifyPartyEmailWithOtpMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.adapter.VerifyPartyEmailWithOtpMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/adapter/VerifyPartyEmailWithOtpMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/userprofile/graphql/VerifyPartyEmailWithOtpMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/userprofile/graphql/VerifyPartyEmailWithOtpMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/userprofile/graphql/VerifyPartyEmailWithOtpMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.Data> {
        public static final com.paypal.oslo.feature.userprofile.graphql.adapter.VerifyPartyEmailWithOtpMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.adapter.VerifyPartyEmailWithOtpMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("verifyPartyEmailWithOtp");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.VerifyPartyEmailWithOtp verifyPartyEmailWithOtp = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                verifyPartyEmailWithOtp = (com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.VerifyPartyEmailWithOtp) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.userprofile.graphql.adapter.VerifyPartyEmailWithOtpMutation_ResponseAdapter.VerifyPartyEmailWithOtp.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (verifyPartyEmailWithOtp != null) {
                return new com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.Data(verifyPartyEmailWithOtp);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "verifyPartyEmailWithOtp");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("verifyPartyEmailWithOtp");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.userprofile.graphql.adapter.VerifyPartyEmailWithOtpMutation_ResponseAdapter.VerifyPartyEmailWithOtp.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getVerifyPartyEmailWithOtp());
        }
    }

    private VerifyPartyEmailWithOtpMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/adapter/VerifyPartyEmailWithOtpMutation_ResponseAdapter$VerifyPartyEmailWithOtp;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/userprofile/graphql/VerifyPartyEmailWithOtpMutation$VerifyPartyEmailWithOtp;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/userprofile/graphql/VerifyPartyEmailWithOtpMutation$VerifyPartyEmailWithOtp;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/userprofile/graphql/VerifyPartyEmailWithOtpMutation$VerifyPartyEmailWithOtp;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class VerifyPartyEmailWithOtp implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.VerifyPartyEmailWithOtp> {
        public static final com.paypal.oslo.feature.userprofile.graphql.adapter.VerifyPartyEmailWithOtpMutation_ResponseAdapter.VerifyPartyEmailWithOtp INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.adapter.VerifyPartyEmailWithOtpMutation_ResponseAdapter.VerifyPartyEmailWithOtp();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("email");
        public static final int $stable = 8;

        private VerifyPartyEmailWithOtp() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.VerifyPartyEmailWithOtp fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.Email email = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                email = (com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.Email) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.userprofile.graphql.adapter.VerifyPartyEmailWithOtpMutation_ResponseAdapter.Email.INSTANCE, true).fromJson(reader, customScalarAdapters);
            }
            if (email != null) {
                return new com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.VerifyPartyEmailWithOtp(email);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "email");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.VerifyPartyEmailWithOtp value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("email");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.userprofile.graphql.adapter.VerifyPartyEmailWithOtpMutation_ResponseAdapter.Email.INSTANCE, true).toJson(writer, customScalarAdapters, value.getEmail());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/graphql/adapter/VerifyPartyEmailWithOtpMutation_ResponseAdapter$Email;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/userprofile/graphql/VerifyPartyEmailWithOtpMutation$Email;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/userprofile/graphql/VerifyPartyEmailWithOtpMutation$Email;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/userprofile/graphql/VerifyPartyEmailWithOtpMutation$Email;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Email implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.Email> {
        public static final com.paypal.oslo.feature.userprofile.graphql.adapter.VerifyPartyEmailWithOtpMutation_ResponseAdapter.Email INSTANCE = new com.paypal.oslo.feature.userprofile.graphql.adapter.VerifyPartyEmailWithOtpMutation_ResponseAdapter.Email();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Email() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.Email fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.userprofile.graphql.fragment.EmailFragment fromJson = com.paypal.oslo.feature.userprofile.graphql.fragment.EmailFragmentImpl_ResponseAdapter.EmailFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.Email(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.userprofile.graphql.VerifyPartyEmailWithOtpMutation.Email value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.userprofile.graphql.fragment.EmailFragmentImpl_ResponseAdapter.EmailFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getEmailFragment());
        }
    }
}
