package com.paypal.oslo.feature.oneonboarding.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/adapter/OnboardMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.OPERATION_NAME, "StatusDetail", "Authentication", "Step"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OnboardMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/adapter/OnboardMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Data> {
        public static final com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("onboard");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Onboard onboard = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                onboard = (com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Onboard) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_ResponseAdapter.Onboard.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (onboard != null) {
                return new com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Data(onboard);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "onboard");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("onboard");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_ResponseAdapter.Onboard.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getOnboard());
        }
    }

    private OnboardMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/adapter/OnboardMutation_ResponseAdapter$Onboard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Onboard;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Onboard;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Onboard;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Onboard implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Onboard> {
        public static final com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_ResponseAdapter.Onboard INSTANCE = new com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_ResponseAdapter.Onboard();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"status", "statusDetails", "authentication", "steps"});
        public static final int $stable = 8;

        private Onboard() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Onboard fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.OnboardStatus onboardStatus = null;
            java.util.List list = null;
            com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication authentication = null;
            java.util.List list2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    onboardStatus = com.paypal.oslo.api.graphql.schema.type.adapter.OnboardStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_ResponseAdapter.StatusDetail.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    authentication = (com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_ResponseAdapter.Authentication.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    list2 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_ResponseAdapter.Step.INSTANCE, true))).fromJson(reader, customScalarAdapters);
                }
            }
            if (onboardStatus != null) {
                return new com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Onboard(onboardStatus, list, authentication, list2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "status");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Onboard value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.OnboardStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("statusDetails");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_ResponseAdapter.StatusDetail.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getStatusDetails());
            writer.name("authentication");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_ResponseAdapter.Authentication.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getAuthentication());
            writer.name("steps");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_ResponseAdapter.Step.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getSteps());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/adapter/OnboardMutation_ResponseAdapter$StatusDetail;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$StatusDetail;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$StatusDetail;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$StatusDetail;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StatusDetail implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.StatusDetail> {
        public static final com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_ResponseAdapter.StatusDetail INSTANCE = new com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_ResponseAdapter.StatusDetail();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE);
        public static final int $stable = 8;

        private StatusDetail() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.StatusDetail fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.StatusDetail(str);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.StatusDetail value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getIssue());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/adapter/OnboardMutation_ResponseAdapter$Authentication;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Authentication;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Authentication;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Authentication;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Authentication implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication> {
        public static final com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_ResponseAdapter.Authentication INSTANCE = new com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_ResponseAdapter.Authentication();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Authentication() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragment fromJson = com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragmentImpl_ResponseAdapter.AuthenticationTokenFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Authentication value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.api.graphql.shared.fragment.AuthenticationTokenFragmentImpl_ResponseAdapter.AuthenticationTokenFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getAuthenticationTokenFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/adapter/OnboardMutation_ResponseAdapter$Step;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Step;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Step;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/oneonboarding/graphql/OnboardMutation$Step;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Step implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Step> {
        public static final com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_ResponseAdapter.Step INSTANCE = new com.paypal.oslo.feature.oneonboarding.graphql.adapter.OnboardMutation_ResponseAdapter.Step();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Step() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Step fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.PhoneStepComponentFragment phoneStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.PasswordStepComponentFragment passwordStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsStepComponentFragment termsStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.CryptoTermsStepComponentFragment cryptoTermsStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPW9StepComponentFragment cIPW9StepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPTaxInfoStepComponentFragment cIPTaxInfoStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragment personalInfoStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.AccountSubmissionStepComponentFragment accountSubmissionStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.SignUpWithGoogleStepComponentFragment signUpWithGoogleStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.SubmissionStepComponentFragment submissionStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.SavingsCIPW9StepComponentFragment savingsCIPW9StepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPPersonalInfoStepComponentFragment cIPPersonalInfoStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsSheetViewStepComponentFragment termsSheetViewStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.ModuleLauncherStepComponentFragment moduleLauncherStepComponentFragment;
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.DocUploadStepComponentFragment docUploadStepComponentFragment;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.TerminalStepComponentFragment terminalStepComponentFragment = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OnboardPhoneStepComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                phoneStepComponentFragment = com.paypal.oslo.feature.oneonboarding.graphql.fragment.PhoneStepComponentFragmentImpl_ResponseAdapter.PhoneStepComponentFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                phoneStepComponentFragment = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OnboardPasswordStepComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                passwordStepComponentFragment = com.paypal.oslo.feature.oneonboarding.graphql.fragment.PasswordStepComponentFragmentImpl_ResponseAdapter.PasswordStepComponentFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                passwordStepComponentFragment = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OnboardTermsStepComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                termsStepComponentFragment = com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsStepComponentFragmentImpl_ResponseAdapter.TermsStepComponentFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                termsStepComponentFragment = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OnboardCryptoTermsStepComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                cryptoTermsStepComponentFragment = com.paypal.oslo.feature.oneonboarding.graphql.fragment.CryptoTermsStepComponentFragmentImpl_ResponseAdapter.CryptoTermsStepComponentFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                cryptoTermsStepComponentFragment = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OnboardCIPW9StepComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                cIPW9StepComponentFragment = com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPW9StepComponentFragmentImpl_ResponseAdapter.CIPW9StepComponentFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                cIPW9StepComponentFragment = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OnboardCIPTaxInfoStepComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                cIPTaxInfoStepComponentFragment = com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPTaxInfoStepComponentFragmentImpl_ResponseAdapter.CIPTaxInfoStepComponentFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                cIPTaxInfoStepComponentFragment = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OnboardPersonalInfoStepComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                personalInfoStepComponentFragment = com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragmentImpl_ResponseAdapter.PersonalInfoStepComponentFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                personalInfoStepComponentFragment = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OnboardAccountCreationSubmissionStepComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                accountSubmissionStepComponentFragment = com.paypal.oslo.feature.oneonboarding.graphql.fragment.AccountSubmissionStepComponentFragmentImpl_ResponseAdapter.AccountSubmissionStepComponentFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                accountSubmissionStepComponentFragment = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OnboardSignUpWithGoogleStepComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                signUpWithGoogleStepComponentFragment = com.paypal.oslo.feature.oneonboarding.graphql.fragment.SignUpWithGoogleStepComponentFragmentImpl_ResponseAdapter.SignUpWithGoogleStepComponentFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                signUpWithGoogleStepComponentFragment = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OnboardSubmissionStepComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                submissionStepComponentFragment = com.paypal.oslo.feature.oneonboarding.graphql.fragment.SubmissionStepComponentFragmentImpl_ResponseAdapter.SubmissionStepComponentFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                submissionStepComponentFragment = null;
            }
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.SubmissionStepComponentFragment submissionStepComponentFragment2 = submissionStepComponentFragment;
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OnboardSavingsCIPW9StepComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                savingsCIPW9StepComponentFragment = com.paypal.oslo.feature.oneonboarding.graphql.fragment.SavingsCIPW9StepComponentFragmentImpl_ResponseAdapter.SavingsCIPW9StepComponentFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                savingsCIPW9StepComponentFragment = null;
            }
            com.paypal.oslo.feature.oneonboarding.graphql.fragment.SavingsCIPW9StepComponentFragment savingsCIPW9StepComponentFragment2 = savingsCIPW9StepComponentFragment;
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OnboardCIPPersonalInfoStepComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                cIPPersonalInfoStepComponentFragment = com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPPersonalInfoStepComponentFragmentImpl_ResponseAdapter.CIPPersonalInfoStepComponentFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                cIPPersonalInfoStepComponentFragment = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OnboardTermsSheetViewStepComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                termsSheetViewStepComponentFragment = com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsSheetViewStepComponentFragmentImpl_ResponseAdapter.TermsSheetViewStepComponentFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                termsSheetViewStepComponentFragment = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OnboardModuleLauncherStepComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                moduleLauncherStepComponentFragment = com.paypal.oslo.feature.oneonboarding.graphql.fragment.ModuleLauncherStepComponentFragmentImpl_ResponseAdapter.ModuleLauncherStepComponentFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                moduleLauncherStepComponentFragment = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OnboardDocUploadStepComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                docUploadStepComponentFragment = com.paypal.oslo.feature.oneonboarding.graphql.fragment.DocUploadStepComponentFragmentImpl_ResponseAdapter.DocUploadStepComponentFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                docUploadStepComponentFragment = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("OnboardTerminalStepComponent"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                terminalStepComponentFragment = com.paypal.oslo.feature.oneonboarding.graphql.fragment.TerminalStepComponentFragmentImpl_ResponseAdapter.TerminalStepComponentFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Step(str, phoneStepComponentFragment, passwordStepComponentFragment, termsStepComponentFragment, cryptoTermsStepComponentFragment, cIPW9StepComponentFragment, cIPTaxInfoStepComponentFragment, personalInfoStepComponentFragment, accountSubmissionStepComponentFragment, signUpWithGoogleStepComponentFragment, submissionStepComponentFragment2, savingsCIPW9StepComponentFragment2, cIPPersonalInfoStepComponentFragment, termsSheetViewStepComponentFragment, moduleLauncherStepComponentFragment, docUploadStepComponentFragment, terminalStepComponentFragment);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.oneonboarding.graphql.OnboardMutation.Step value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getPhoneStepComponentFragment() != null) {
                com.paypal.oslo.feature.oneonboarding.graphql.fragment.PhoneStepComponentFragmentImpl_ResponseAdapter.PhoneStepComponentFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getPhoneStepComponentFragment());
            }
            if (value.getPasswordStepComponentFragment() != null) {
                com.paypal.oslo.feature.oneonboarding.graphql.fragment.PasswordStepComponentFragmentImpl_ResponseAdapter.PasswordStepComponentFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getPasswordStepComponentFragment());
            }
            if (value.getTermsStepComponentFragment() != null) {
                com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsStepComponentFragmentImpl_ResponseAdapter.TermsStepComponentFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getTermsStepComponentFragment());
            }
            if (value.getCryptoTermsStepComponentFragment() != null) {
                com.paypal.oslo.feature.oneonboarding.graphql.fragment.CryptoTermsStepComponentFragmentImpl_ResponseAdapter.CryptoTermsStepComponentFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getCryptoTermsStepComponentFragment());
            }
            if (value.getCIPW9StepComponentFragment() != null) {
                com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPW9StepComponentFragmentImpl_ResponseAdapter.CIPW9StepComponentFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getCIPW9StepComponentFragment());
            }
            if (value.getCIPTaxInfoStepComponentFragment() != null) {
                com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPTaxInfoStepComponentFragmentImpl_ResponseAdapter.CIPTaxInfoStepComponentFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getCIPTaxInfoStepComponentFragment());
            }
            if (value.getPersonalInfoStepComponentFragment() != null) {
                com.paypal.oslo.feature.oneonboarding.graphql.fragment.PersonalInfoStepComponentFragmentImpl_ResponseAdapter.PersonalInfoStepComponentFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getPersonalInfoStepComponentFragment());
            }
            if (value.getAccountSubmissionStepComponentFragment() != null) {
                com.paypal.oslo.feature.oneonboarding.graphql.fragment.AccountSubmissionStepComponentFragmentImpl_ResponseAdapter.AccountSubmissionStepComponentFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getAccountSubmissionStepComponentFragment());
            }
            if (value.getSignUpWithGoogleStepComponentFragment() != null) {
                com.paypal.oslo.feature.oneonboarding.graphql.fragment.SignUpWithGoogleStepComponentFragmentImpl_ResponseAdapter.SignUpWithGoogleStepComponentFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getSignUpWithGoogleStepComponentFragment());
            }
            if (value.getSubmissionStepComponentFragment() != null) {
                com.paypal.oslo.feature.oneonboarding.graphql.fragment.SubmissionStepComponentFragmentImpl_ResponseAdapter.SubmissionStepComponentFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getSubmissionStepComponentFragment());
            }
            if (value.getSavingsCIPW9StepComponentFragment() != null) {
                com.paypal.oslo.feature.oneonboarding.graphql.fragment.SavingsCIPW9StepComponentFragmentImpl_ResponseAdapter.SavingsCIPW9StepComponentFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getSavingsCIPW9StepComponentFragment());
            }
            if (value.getCIPPersonalInfoStepComponentFragment() != null) {
                com.paypal.oslo.feature.oneonboarding.graphql.fragment.CIPPersonalInfoStepComponentFragmentImpl_ResponseAdapter.CIPPersonalInfoStepComponentFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getCIPPersonalInfoStepComponentFragment());
            }
            if (value.getTermsSheetViewStepComponentFragment() != null) {
                com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsSheetViewStepComponentFragmentImpl_ResponseAdapter.TermsSheetViewStepComponentFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getTermsSheetViewStepComponentFragment());
            }
            if (value.getModuleLauncherStepComponentFragment() != null) {
                com.paypal.oslo.feature.oneonboarding.graphql.fragment.ModuleLauncherStepComponentFragmentImpl_ResponseAdapter.ModuleLauncherStepComponentFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getModuleLauncherStepComponentFragment());
            }
            if (value.getDocUploadStepComponentFragment() != null) {
                com.paypal.oslo.feature.oneonboarding.graphql.fragment.DocUploadStepComponentFragmentImpl_ResponseAdapter.DocUploadStepComponentFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getDocUploadStepComponentFragment());
            }
            if (value.getTerminalStepComponentFragment() != null) {
                com.paypal.oslo.feature.oneonboarding.graphql.fragment.TerminalStepComponentFragmentImpl_ResponseAdapter.TerminalStepComponentFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getTerminalStepComponentFragment());
            }
        }
    }
}
