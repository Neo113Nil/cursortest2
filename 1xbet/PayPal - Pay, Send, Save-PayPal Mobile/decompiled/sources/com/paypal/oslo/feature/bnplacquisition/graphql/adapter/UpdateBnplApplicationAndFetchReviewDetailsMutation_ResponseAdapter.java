package com.paypal.oslo.feature.bnplacquisition.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter;", "", "<init>", "()V", "Data", "UpdateBnplApplication", "OnUpdateBNPLApplicationSuccess", "Application", "SelectedOffer", "DueTodayAmount", "PeriodicPaymentAmount", "TotalAmount", "TotalInterest", "Document", "SelectedPaymentFundingInstrument", "OnBankAccount", "OnCard", "OnUpdateBNPLApplicationDecline"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Data> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("updateBnplApplication");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication updateBnplApplication = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                updateBnplApplication = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.UpdateBnplApplication.INSTANCE, true)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Data(updateBnplApplication);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("updateBnplApplication");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.UpdateBnplApplication.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getUpdateBnplApplication());
        }
    }

    private UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter$UpdateBnplApplication;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$UpdateBnplApplication;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$UpdateBnplApplication;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$UpdateBnplApplication;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UpdateBnplApplication implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.UpdateBnplApplication INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.UpdateBnplApplication();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private UpdateBnplApplication() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationSuccess onUpdateBNPLApplicationSuccess;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationDecline onUpdateBNPLApplicationDecline = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("UpdateBNPLApplicationSuccess"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onUpdateBNPLApplicationSuccess = com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.OnUpdateBNPLApplicationSuccess.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onUpdateBNPLApplicationSuccess = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("UpdateBNPLApplicationDecline"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onUpdateBNPLApplicationDecline = com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.OnUpdateBNPLApplicationDecline.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication(str, onUpdateBNPLApplicationSuccess, onUpdateBNPLApplicationDecline);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.UpdateBnplApplication value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnUpdateBNPLApplicationSuccess() != null) {
                com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.OnUpdateBNPLApplicationSuccess.INSTANCE.toJson(writer, customScalarAdapters, value.getOnUpdateBNPLApplicationSuccess());
            }
            if (value.getOnUpdateBNPLApplicationDecline() != null) {
                com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.OnUpdateBNPLApplicationDecline.INSTANCE.toJson(writer, customScalarAdapters, value.getOnUpdateBNPLApplicationDecline());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter$OnUpdateBNPLApplicationSuccess;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnUpdateBNPLApplicationSuccess;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnUpdateBNPLApplicationSuccess;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnUpdateBNPLApplicationSuccess;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnUpdateBNPLApplicationSuccess implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationSuccess> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.OnUpdateBNPLApplicationSuccess INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.OnUpdateBNPLApplicationSuccess();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("application");
        public static final int $stable = 8;

        private OnUpdateBNPLApplicationSuccess() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationSuccess fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application application = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                application = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.Application.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (application != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationSuccess(application);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "application");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationSuccess value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("application");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.Application.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getApplication());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter$Application;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Application;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Application;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Application;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Application implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.Application INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.Application();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"creditProductIdentifier", "selectedOffer", "documents", "selectedPaymentFundingInstrument"});
        public static final int $stable = 8;

        private Application() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier = null;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer selectedOffer = null;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument selectedPaymentFundingInstrument = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    bNPLCreditProductIdentifier = (com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BNPLCreditProductIdentifier_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    selectedOffer = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.SelectedOffer.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.Document.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    selectedPaymentFundingInstrument = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.SelectedPaymentFundingInstrument.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (list != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application(bNPLCreditProductIdentifier, selectedOffer, list, selectedPaymentFundingInstrument);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "documents");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Application value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("creditProductIdentifier");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BNPLCreditProductIdentifier_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getCreditProductIdentifier());
            writer.name("selectedOffer");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.SelectedOffer.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getSelectedOffer());
            writer.name("documents");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.Document.INSTANCE, true)).toJson(writer, customScalarAdapters, (java.util.List) value.getDocuments());
            writer.name("selectedPaymentFundingInstrument");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.SelectedPaymentFundingInstrument.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getSelectedPaymentFundingInstrument());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter$SelectedOffer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$SelectedOffer;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$SelectedOffer;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$SelectedOffer;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SelectedOffer implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.SelectedOffer INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.SelectedOffer();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"installmentCount", "apr", "nominalInterestRate", "dueTodayAmount", "periodicPaymentAmount", "totalAmount", "totalInterest"});
        public static final int $stable = 8;

        private SelectedOffer() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer(r2, r3, r4, r5, r6, r7, r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x008d, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "totalAmount");
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0097, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0098, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "dueTodayAmount");
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00a2, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "installmentCount");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00ad, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (r0 == null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
        
            r2 = r0.intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
        
            if (r5 == null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (r7 == null) goto L18;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.DueTodayAmount dueTodayAmount = null;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount periodicPaymentAmount = null;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalAmount totalAmount = null;
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest totalInterest = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        dueTodayAmount = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.DueTodayAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.DueTodayAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        periodicPaymentAmount = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.PeriodicPaymentAmount.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        totalAmount = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.TotalAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        totalInterest = (com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.TotalInterest.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedOffer value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("installmentCount");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getInstallmentCount()));
            writer.name("apr");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getApr());
            writer.name("nominalInterestRate");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getNominalInterestRate());
            writer.name("dueTodayAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.DueTodayAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getDueTodayAmount());
            writer.name("periodicPaymentAmount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.PeriodicPaymentAmount.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getPeriodicPaymentAmount());
            writer.name("totalAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.TotalAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getTotalAmount());
            writer.name("totalInterest");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.TotalInterest.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getTotalInterest());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter$DueTodayAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$DueTodayAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$DueTodayAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$DueTodayAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DueTodayAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.DueTodayAmount> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.DueTodayAmount INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.DueTodayAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private DueTodayAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.DueTodayAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.DueTodayAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.DueTodayAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter$PeriodicPaymentAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$PeriodicPaymentAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$PeriodicPaymentAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$PeriodicPaymentAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PeriodicPaymentAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.PeriodicPaymentAmount INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.PeriodicPaymentAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private PeriodicPaymentAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.PeriodicPaymentAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter$TotalAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$TotalAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$TotalAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$TotalAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TotalAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalAmount> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.TotalAmount INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.TotalAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private TotalAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter$TotalInterest;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$TotalInterest;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$TotalInterest;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$TotalInterest;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TotalInterest implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.TotalInterest INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.TotalInterest();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private TotalInterest() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.TotalInterest value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter$Document;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Document;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Document;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$Document;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Document implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Document> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.Document INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.Document();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Document() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Document fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragmentImpl_ResponseAdapter.BnplAcquisitionDocumentFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Document(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.Document value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionDocumentFragmentImpl_ResponseAdapter.BnplAcquisitionDocumentFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionDocumentFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter$SelectedPaymentFundingInstrument;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$SelectedPaymentFundingInstrument;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$SelectedPaymentFundingInstrument;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$SelectedPaymentFundingInstrument;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SelectedPaymentFundingInstrument implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.SelectedPaymentFundingInstrument INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.SelectedPaymentFundingInstrument();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private SelectedPaymentFundingInstrument() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnBankAccount onBankAccount;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnCard onCard = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("BankAccount"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onBankAccount = com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.OnBankAccount.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onBankAccount = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onCard = com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.OnCard.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument(str, onBankAccount, onCard);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.SelectedPaymentFundingInstrument value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnBankAccount() != null) {
                com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.OnBankAccount.INSTANCE.toJson(writer, customScalarAdapters, value.getOnBankAccount());
            }
            if (value.getOnCard() != null) {
                com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.OnCard.INSTANCE.toJson(writer, customScalarAdapters, value.getOnCard());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter$OnBankAccount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnBankAccount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnBankAccount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnBankAccount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnBankAccount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnBankAccount> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.OnBankAccount INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.OnBankAccount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnBankAccount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnBankAccount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragmentImpl_ResponseAdapter.BnplAcquisitionBankFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnBankAccount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnBankAccount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionBankFragmentImpl_ResponseAdapter.BnplAcquisitionBankFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionBankFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter$OnCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnCard;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnCard;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnCard;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnCard implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnCard> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.OnCard INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.OnCard();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnCard() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnCard fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragmentImpl_ResponseAdapter.BnplAcquisitionCardFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnCard(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnCard value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardFragmentImpl_ResponseAdapter.BnplAcquisitionCardFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionCardFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter$OnUpdateBNPLApplicationDecline;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnUpdateBNPLApplicationDecline;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnUpdateBNPLApplicationDecline;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/UpdateBnplApplicationAndFetchReviewDetailsMutation$OnUpdateBNPLApplicationDecline;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnUpdateBNPLApplicationDecline implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationDecline> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.OnUpdateBNPLApplicationDecline INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.UpdateBnplApplicationAndFetchReviewDetailsMutation_ResponseAdapter.OnUpdateBNPLApplicationDecline();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("reason");
        public static final int $stable = 8;

        private OnUpdateBNPLApplicationDecline() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationDecline fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionApplicationDeclineReason bNPLAcquisitionApplicationDeclineReason = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                bNPLAcquisitionApplicationDeclineReason = com.paypal.oslo.api.graphql.schema.type.adapter.BNPLAcquisitionApplicationDeclineReason_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (bNPLAcquisitionApplicationDeclineReason != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationDecline(bNPLAcquisitionApplicationDeclineReason);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "reason");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.UpdateBnplApplicationAndFetchReviewDetailsMutation.OnUpdateBNPLApplicationDecline value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("reason");
            com.paypal.oslo.api.graphql.schema.type.adapter.BNPLAcquisitionApplicationDeclineReason_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getReason());
        }
    }
}
