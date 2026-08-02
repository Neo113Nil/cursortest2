package com.paypal.oslo.feature.bnplacquisition.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/EvaluateBnplProductOffersMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OPERATION_NAME, "OnEvaluateBNPLProductOffersSuccess", "EligibleProductOfferEvaluation", "OnEvaluateBNPLProductOffersDecline"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EvaluateBnplProductOffersMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/EvaluateBnplProductOffersMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.Data> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("evaluateBnplProductOffers");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers evaluateBnplProductOffers = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                evaluateBnplProductOffers = (com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_ResponseAdapter.EvaluateBnplProductOffers.INSTANCE, true)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.Data(evaluateBnplProductOffers);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("evaluateBnplProductOffers");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_ResponseAdapter.EvaluateBnplProductOffers.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getEvaluateBnplProductOffers());
        }
    }

    private EvaluateBnplProductOffersMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/EvaluateBnplProductOffersMutation_ResponseAdapter$EvaluateBnplProductOffers;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$EvaluateBnplProductOffers;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$EvaluateBnplProductOffers;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$EvaluateBnplProductOffers;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EvaluateBnplProductOffers implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_ResponseAdapter.EvaluateBnplProductOffers INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_ResponseAdapter.EvaluateBnplProductOffers();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private EvaluateBnplProductOffers() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersSuccess onEvaluateBNPLProductOffersSuccess;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersDecline onEvaluateBNPLProductOffersDecline = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("EvaluateBNPLProductOffersSuccess"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onEvaluateBNPLProductOffersSuccess = com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_ResponseAdapter.OnEvaluateBNPLProductOffersSuccess.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onEvaluateBNPLProductOffersSuccess = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("EvaluateBNPLProductOffersDecline"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onEvaluateBNPLProductOffersDecline = com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_ResponseAdapter.OnEvaluateBNPLProductOffersDecline.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers(str, onEvaluateBNPLProductOffersSuccess, onEvaluateBNPLProductOffersDecline);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EvaluateBnplProductOffers value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnEvaluateBNPLProductOffersSuccess() != null) {
                com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_ResponseAdapter.OnEvaluateBNPLProductOffersSuccess.INSTANCE.toJson(writer, customScalarAdapters, value.getOnEvaluateBNPLProductOffersSuccess());
            }
            if (value.getOnEvaluateBNPLProductOffersDecline() != null) {
                com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_ResponseAdapter.OnEvaluateBNPLProductOffersDecline.INSTANCE.toJson(writer, customScalarAdapters, value.getOnEvaluateBNPLProductOffersDecline());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/EvaluateBnplProductOffersMutation_ResponseAdapter$OnEvaluateBNPLProductOffersSuccess;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$OnEvaluateBNPLProductOffersSuccess;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$OnEvaluateBNPLProductOffersSuccess;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$OnEvaluateBNPLProductOffersSuccess;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnEvaluateBNPLProductOffersSuccess implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersSuccess> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_ResponseAdapter.OnEvaluateBNPLProductOffersSuccess INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_ResponseAdapter.OnEvaluateBNPLProductOffersSuccess();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("eligibleProductOfferEvaluations");
        public static final int $stable = 8;

        private OnEvaluateBNPLProductOffersSuccess() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersSuccess fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_ResponseAdapter.EligibleProductOfferEvaluation.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            if (list != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersSuccess(list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "eligibleProductOfferEvaluations");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersSuccess value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("eligibleProductOfferEvaluations");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_ResponseAdapter.EligibleProductOfferEvaluation.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getEligibleProductOfferEvaluations());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/EvaluateBnplProductOffersMutation_ResponseAdapter$EligibleProductOfferEvaluation;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$EligibleProductOfferEvaluation;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$EligibleProductOfferEvaluation;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$EligibleProductOfferEvaluation;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EligibleProductOfferEvaluation implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EligibleProductOfferEvaluation> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_ResponseAdapter.EligibleProductOfferEvaluation INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_ResponseAdapter.EligibleProductOfferEvaluation();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"creditProductIdentifier", "id"});
        public static final int $stable = 8;

        private EligibleProductOfferEvaluation() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EligibleProductOfferEvaluation fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    bNPLCreditProductIdentifier = com.paypal.oslo.api.graphql.schema.type.adapter.BNPLCreditProductIdentifier_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (bNPLCreditProductIdentifier == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "creditProductIdentifier");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EligibleProductOfferEvaluation(bNPLCreditProductIdentifier, obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "id");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.EligibleProductOfferEvaluation value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("creditProductIdentifier");
            com.paypal.oslo.api.graphql.schema.type.adapter.BNPLCreditProductIdentifier_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getCreditProductIdentifier());
            writer.name("id");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getId());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/EvaluateBnplProductOffersMutation_ResponseAdapter$OnEvaluateBNPLProductOffersDecline;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$OnEvaluateBNPLProductOffersDecline;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$OnEvaluateBNPLProductOffersDecline;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProductOffersMutation$OnEvaluateBNPLProductOffersDecline;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnEvaluateBNPLProductOffersDecline implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersDecline> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_ResponseAdapter.OnEvaluateBNPLProductOffersDecline INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProductOffersMutation_ResponseAdapter.OnEvaluateBNPLProductOffersDecline();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("reason");
        public static final int $stable = 8;

        private OnEvaluateBNPLProductOffersDecline() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersDecline fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionProductOffersEligibilityDeclineReason bNPLAcquisitionProductOffersEligibilityDeclineReason = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                bNPLAcquisitionProductOffersEligibilityDeclineReason = com.paypal.oslo.api.graphql.schema.type.adapter.BNPLAcquisitionProductOffersEligibilityDeclineReason_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (bNPLAcquisitionProductOffersEligibilityDeclineReason != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersDecline(bNPLAcquisitionProductOffersEligibilityDeclineReason);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "reason");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProductOffersMutation.OnEvaluateBNPLProductOffersDecline value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("reason");
            com.paypal.oslo.api.graphql.schema.type.adapter.BNPLAcquisitionProductOffersEligibilityDeclineReason_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getReason());
        }
    }
}
