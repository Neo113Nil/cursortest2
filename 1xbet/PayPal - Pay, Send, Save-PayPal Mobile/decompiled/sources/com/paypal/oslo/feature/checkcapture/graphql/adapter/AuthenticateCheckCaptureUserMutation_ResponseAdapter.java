package com.paypal.oslo.feature.checkcapture.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/graphql/adapter/AuthenticateCheckCaptureUserMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.OPERATION_NAME, "Customer"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AuthenticateCheckCaptureUserMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.checkcapture.graphql.adapter.AuthenticateCheckCaptureUserMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.checkcapture.graphql.adapter.AuthenticateCheckCaptureUserMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/graphql/adapter/AuthenticateCheckCaptureUserMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Data> {
        public static final com.paypal.oslo.feature.checkcapture.graphql.adapter.AuthenticateCheckCaptureUserMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.checkcapture.graphql.adapter.AuthenticateCheckCaptureUserMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("authenticateCheckCaptureUser");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser authenticateCheckCaptureUser = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                authenticateCheckCaptureUser = (com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.checkcapture.graphql.adapter.AuthenticateCheckCaptureUserMutation_ResponseAdapter.AuthenticateCheckCaptureUser.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Data(authenticateCheckCaptureUser);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("authenticateCheckCaptureUser");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.checkcapture.graphql.adapter.AuthenticateCheckCaptureUserMutation_ResponseAdapter.AuthenticateCheckCaptureUser.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getAuthenticateCheckCaptureUser());
        }
    }

    private AuthenticateCheckCaptureUserMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/graphql/adapter/AuthenticateCheckCaptureUserMutation_ResponseAdapter$AuthenticateCheckCaptureUser;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$AuthenticateCheckCaptureUser;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$AuthenticateCheckCaptureUser;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$AuthenticateCheckCaptureUser;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AuthenticateCheckCaptureUser implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser> {
        public static final com.paypal.oslo.feature.checkcapture.graphql.adapter.AuthenticateCheckCaptureUserMutation_ResponseAdapter.AuthenticateCheckCaptureUser INSTANCE = new com.paypal.oslo.feature.checkcapture.graphql.adapter.AuthenticateCheckCaptureUserMutation_ResponseAdapter.AuthenticateCheckCaptureUser();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"customer", "sessionId", "ssoToken"});
        public static final int $stable = 8;

        private AuthenticateCheckCaptureUser() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Customer customer = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    customer = (com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Customer) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.checkcapture.graphql.adapter.AuthenticateCheckCaptureUserMutation_ResponseAdapter.Customer.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (customer == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "customer");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "sessionId");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser(customer, str, str2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "ssoToken");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.AuthenticateCheckCaptureUser value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("customer");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.checkcapture.graphql.adapter.AuthenticateCheckCaptureUserMutation_ResponseAdapter.Customer.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getCustomer());
            writer.name("sessionId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getSessionId());
            writer.name("ssoToken");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getSsoToken());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/graphql/adapter/AuthenticateCheckCaptureUserMutation_ResponseAdapter$Customer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$Customer;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$Customer;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/checkcapture/graphql/AuthenticateCheckCaptureUserMutation$Customer;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Customer implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Customer> {
        public static final com.paypal.oslo.feature.checkcapture.graphql.adapter.AuthenticateCheckCaptureUserMutation_ResponseAdapter.Customer INSTANCE = new com.paypal.oslo.feature.checkcapture.graphql.adapter.AuthenticateCheckCaptureUserMutation_ResponseAdapter.Customer();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "status"});
        public static final int $stable = 8;

        private Customer() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Customer fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.CheckCaptureCustomerStatus checkCaptureCustomerStatus = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    checkCaptureCustomerStatus = com.paypal.oslo.api.graphql.schema.type.adapter.CheckCaptureCustomerStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (checkCaptureCustomerStatus != null) {
                return new com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Customer(str, checkCaptureCustomerStatus);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "status");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.checkcapture.graphql.AuthenticateCheckCaptureUserMutation.Customer value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.CheckCaptureCustomerStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
        }
    }
}
