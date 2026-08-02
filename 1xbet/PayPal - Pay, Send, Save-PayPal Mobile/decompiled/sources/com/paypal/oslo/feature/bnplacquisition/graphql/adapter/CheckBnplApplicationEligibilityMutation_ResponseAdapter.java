package com.paypal.oslo.feature.bnplacquisition.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/CheckBnplApplicationEligibilityMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.OPERATION_NAME, "OnBNPLAcquisitionCheckApplicationEligibilitySuccess", "ProductOfferEvaluations", "Eligible", "Offer", "DueTodayAmount", "EstimatedInstallment", "TotalPayment", "PeriodicPaymentAmount", "TotalAmount", "TotalInterest", "OnBNPLAcquisitionCheckApplicationEligibilityDecline"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckBnplApplicationEligibilityMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/CheckBnplApplicationEligibilityMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.Data> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("checkBnplApplicationEligibility");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.CheckBnplApplicationEligibility checkBnplApplicationEligibility = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                checkBnplApplicationEligibility = (com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.CheckBnplApplicationEligibility) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.CheckBnplApplicationEligibility.INSTANCE, true)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.Data(checkBnplApplicationEligibility);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("checkBnplApplicationEligibility");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.CheckBnplApplicationEligibility.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getCheckBnplApplicationEligibility());
        }
    }

    private CheckBnplApplicationEligibilityMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/CheckBnplApplicationEligibilityMutation_ResponseAdapter$CheckBnplApplicationEligibility;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$CheckBnplApplicationEligibility;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$CheckBnplApplicationEligibility;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$CheckBnplApplicationEligibility;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CheckBnplApplicationEligibility implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.CheckBnplApplicationEligibility> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.CheckBnplApplicationEligibility INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.CheckBnplApplicationEligibility();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private CheckBnplApplicationEligibility() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.CheckBnplApplicationEligibility fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.OnBNPLAcquisitionCheckApplicationEligibilitySuccess onBNPLAcquisitionCheckApplicationEligibilitySuccess;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.OnBNPLAcquisitionCheckApplicationEligibilityDecline onBNPLAcquisitionCheckApplicationEligibilityDecline = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("BNPLAcquisitionCheckApplicationEligibilitySuccess"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onBNPLAcquisitionCheckApplicationEligibilitySuccess = com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.OnBNPLAcquisitionCheckApplicationEligibilitySuccess.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onBNPLAcquisitionCheckApplicationEligibilitySuccess = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("BNPLAcquisitionCheckApplicationEligibilityDecline"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onBNPLAcquisitionCheckApplicationEligibilityDecline = com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.OnBNPLAcquisitionCheckApplicationEligibilityDecline.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.CheckBnplApplicationEligibility(str, onBNPLAcquisitionCheckApplicationEligibilitySuccess, onBNPLAcquisitionCheckApplicationEligibilityDecline);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.CheckBnplApplicationEligibility value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnBNPLAcquisitionCheckApplicationEligibilitySuccess() != null) {
                com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.OnBNPLAcquisitionCheckApplicationEligibilitySuccess.INSTANCE.toJson(writer, customScalarAdapters, value.getOnBNPLAcquisitionCheckApplicationEligibilitySuccess());
            }
            if (value.getOnBNPLAcquisitionCheckApplicationEligibilityDecline() != null) {
                com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.OnBNPLAcquisitionCheckApplicationEligibilityDecline.INSTANCE.toJson(writer, customScalarAdapters, value.getOnBNPLAcquisitionCheckApplicationEligibilityDecline());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/CheckBnplApplicationEligibilityMutation_ResponseAdapter$OnBNPLAcquisitionCheckApplicationEligibilitySuccess;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$OnBNPLAcquisitionCheckApplicationEligibilitySuccess;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$OnBNPLAcquisitionCheckApplicationEligibilitySuccess;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$OnBNPLAcquisitionCheckApplicationEligibilitySuccess;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnBNPLAcquisitionCheckApplicationEligibilitySuccess implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.OnBNPLAcquisitionCheckApplicationEligibilitySuccess> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.OnBNPLAcquisitionCheckApplicationEligibilitySuccess INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.OnBNPLAcquisitionCheckApplicationEligibilitySuccess();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"evaluationTypes", "productOfferEvaluations"});
        public static final int $stable = 8;

        private OnBNPLAcquisitionCheckApplicationEligibilitySuccess() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.OnBNPLAcquisitionCheckApplicationEligibilitySuccess fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.ProductOfferEvaluations productOfferEvaluations = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.BNPLAcquisitionApplicationEligibilityEvaluationType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    productOfferEvaluations = (com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.ProductOfferEvaluations) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.ProductOfferEvaluations.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (list != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.OnBNPLAcquisitionCheckApplicationEligibilitySuccess(list, productOfferEvaluations);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "evaluationTypes");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.OnBNPLAcquisitionCheckApplicationEligibilitySuccess value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("evaluationTypes");
            com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.BNPLAcquisitionApplicationEligibilityEvaluationType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, (java.util.List) value.getEvaluationTypes());
            writer.name("productOfferEvaluations");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.ProductOfferEvaluations.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getProductOfferEvaluations());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/CheckBnplApplicationEligibilityMutation_ResponseAdapter$ProductOfferEvaluations;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$ProductOfferEvaluations;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$ProductOfferEvaluations;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$ProductOfferEvaluations;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ProductOfferEvaluations implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.ProductOfferEvaluations> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.ProductOfferEvaluations INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.ProductOfferEvaluations();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("eligible");
        public static final int $stable = 8;

        private ProductOfferEvaluations() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.ProductOfferEvaluations fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.Eligible.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            if (list != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.ProductOfferEvaluations(list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "eligible");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.ProductOfferEvaluations value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("eligible");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.Eligible.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getEligible());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/CheckBnplApplicationEligibilityMutation_ResponseAdapter$Eligible;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$Eligible;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$Eligible;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$Eligible;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Eligible implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.Eligible> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.Eligible INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.Eligible();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"creditProductIdentifier", "id", "offers"});
        public static final int $stable = 8;

        private Eligible() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.Eligible fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier = null;
            java.lang.Object obj = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    bNPLCreditProductIdentifier = com.paypal.oslo.api.graphql.schema.type.adapter.BNPLCreditProductIdentifier_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.Offer.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                }
            }
            if (bNPLCreditProductIdentifier == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "creditProductIdentifier");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.Eligible(bNPLCreditProductIdentifier, obj, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "id");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.Eligible value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("creditProductIdentifier");
            com.paypal.oslo.api.graphql.schema.type.adapter.BNPLCreditProductIdentifier_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getCreditProductIdentifier());
            writer.name("id");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("offers");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.Offer.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getOffers());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/CheckBnplApplicationEligibilityMutation_ResponseAdapter$Offer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$Offer;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$Offer;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$Offer;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Offer implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.Offer> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.Offer INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.Offer();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "apr", "dueTodayAmount", "estimatedInstallments", "highlights", "installmentCount", "nominalInterestRate", "periodicPaymentAmount", "preselected", "totalAmount", "totalInterest"});
        public static final int $stable = 8;

        private Offer() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
        
            r1 = r3.intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        
            if (r9 == null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        
            r12 = r9.booleanValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            if (r13 == null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        
            return new com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.Offer(r4, r5, r6, r7, r8, r1, r10, r11, r12, r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00d7, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "totalAmount");
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00e1, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00e2, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "preselected");
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00ec, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00ed, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "installmentCount");
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00f7, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00f8, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "highlights");
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0102, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0103, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "estimatedInstallments");
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x010d, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x010e, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "dueTodayAmount");
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0118, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0119, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0123, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
        
            if (r4 == null) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
        
            if (r6 == null) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
        
            if (r7 == null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        
            if (r8 == null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
        
            if (r3 == null) goto L31;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.Offer fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.DueTodayAmount dueTodayAmount = null;
            java.util.List list = null;
            java.util.List list2 = null;
            java.lang.Boolean bool = null;
            java.lang.Object obj3 = null;
            com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.PeriodicPaymentAmount periodicPaymentAmount = null;
            com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.TotalAmount totalAmount = null;
            com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.TotalInterest totalInterest = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        dueTodayAmount = (com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.DueTodayAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.DueTodayAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.EstimatedInstallment.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        list2 = com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.BNPLAcquisitionOfferHighlight_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        obj3 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        periodicPaymentAmount = (com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.PeriodicPaymentAmount) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.PeriodicPaymentAmount.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        totalAmount = (com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.TotalAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.TotalAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        totalInterest = (com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.TotalInterest) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.TotalInterest.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.Offer value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("apr");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getApr());
            writer.name("dueTodayAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.DueTodayAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getDueTodayAmount());
            writer.name("estimatedInstallments");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.EstimatedInstallment.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getEstimatedInstallments());
            writer.name("highlights");
            com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.BNPLAcquisitionOfferHighlight_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, (java.util.List) value.getHighlights());
            writer.name("installmentCount");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getInstallmentCount()));
            writer.name("nominalInterestRate");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getNominalInterestRate());
            writer.name("periodicPaymentAmount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.PeriodicPaymentAmount.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getPeriodicPaymentAmount());
            writer.name("preselected");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getPreselected()));
            writer.name("totalAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.TotalAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getTotalAmount());
            writer.name("totalInterest");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.TotalInterest.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getTotalInterest());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/CheckBnplApplicationEligibilityMutation_ResponseAdapter$DueTodayAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$DueTodayAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$DueTodayAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$DueTodayAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DueTodayAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.DueTodayAmount> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.DueTodayAmount INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.DueTodayAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private DueTodayAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.DueTodayAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.DueTodayAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.DueTodayAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/CheckBnplApplicationEligibilityMutation_ResponseAdapter$EstimatedInstallment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$EstimatedInstallment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$EstimatedInstallment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$EstimatedInstallment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EstimatedInstallment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.EstimatedInstallment> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.EstimatedInstallment INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.EstimatedInstallment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"totalPayment", "paymentDate"});
        public static final int $stable = 8;

        private EstimatedInstallment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.EstimatedInstallment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.TotalPayment totalPayment = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    totalPayment = (com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.TotalPayment) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.TotalPayment.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (totalPayment == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "totalPayment");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.EstimatedInstallment(totalPayment, obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "paymentDate");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.EstimatedInstallment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("totalPayment");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.TotalPayment.INSTANCE, true).toJson(writer, customScalarAdapters, value.getTotalPayment());
            writer.name("paymentDate");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getPaymentDate());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/CheckBnplApplicationEligibilityMutation_ResponseAdapter$TotalPayment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$TotalPayment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$TotalPayment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$TotalPayment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TotalPayment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.TotalPayment> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.TotalPayment INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.TotalPayment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private TotalPayment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.TotalPayment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.TotalPayment(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.TotalPayment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/CheckBnplApplicationEligibilityMutation_ResponseAdapter$PeriodicPaymentAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$PeriodicPaymentAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$PeriodicPaymentAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$PeriodicPaymentAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PeriodicPaymentAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.PeriodicPaymentAmount> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.PeriodicPaymentAmount INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.PeriodicPaymentAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private PeriodicPaymentAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.PeriodicPaymentAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.PeriodicPaymentAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.PeriodicPaymentAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/CheckBnplApplicationEligibilityMutation_ResponseAdapter$TotalAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$TotalAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$TotalAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$TotalAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TotalAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.TotalAmount> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.TotalAmount INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.TotalAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private TotalAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.TotalAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.TotalAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.TotalAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/CheckBnplApplicationEligibilityMutation_ResponseAdapter$TotalInterest;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$TotalInterest;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$TotalInterest;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$TotalInterest;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TotalInterest implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.TotalInterest> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.TotalInterest INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.TotalInterest();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private TotalInterest() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.TotalInterest fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.TotalInterest(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.TotalInterest value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/CheckBnplApplicationEligibilityMutation_ResponseAdapter$OnBNPLAcquisitionCheckApplicationEligibilityDecline;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$OnBNPLAcquisitionCheckApplicationEligibilityDecline;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$OnBNPLAcquisitionCheckApplicationEligibilityDecline;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/CheckBnplApplicationEligibilityMutation$OnBNPLAcquisitionCheckApplicationEligibilityDecline;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnBNPLAcquisitionCheckApplicationEligibilityDecline implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.OnBNPLAcquisitionCheckApplicationEligibilityDecline> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.OnBNPLAcquisitionCheckApplicationEligibilityDecline INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.CheckBnplApplicationEligibilityMutation_ResponseAdapter.OnBNPLAcquisitionCheckApplicationEligibilityDecline();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("reason");
        public static final int $stable = 8;

        private OnBNPLAcquisitionCheckApplicationEligibilityDecline() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.OnBNPLAcquisitionCheckApplicationEligibilityDecline fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationEligibilityDeclineReason bNPLAcquisitionApplicationEligibilityDeclineReason = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                bNPLAcquisitionApplicationEligibilityDeclineReason = com.paypal.oslo.api.graphql.schema.type.adapter.BNPLAcquisitionApplicationEligibilityDeclineReason_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (bNPLAcquisitionApplicationEligibilityDeclineReason != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.OnBNPLAcquisitionCheckApplicationEligibilityDecline(bNPLAcquisitionApplicationEligibilityDeclineReason);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "reason");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.CheckBnplApplicationEligibilityMutation.OnBNPLAcquisitionCheckApplicationEligibilityDecline value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("reason");
            com.paypal.oslo.api.graphql.schema.type.adapter.BNPLAcquisitionApplicationEligibilityDeclineReason_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getReason());
        }
    }
}
