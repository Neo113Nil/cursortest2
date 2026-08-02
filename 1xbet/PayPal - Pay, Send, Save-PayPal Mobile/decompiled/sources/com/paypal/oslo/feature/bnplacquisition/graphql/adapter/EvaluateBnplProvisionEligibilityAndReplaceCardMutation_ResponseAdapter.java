package com.paypal.oslo.feature.bnplacquisition.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OPERATION_NAME, "OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess", "ApprovedLoanAmount", "FundingPrimaryAccountNumberToken", com.paypal.oslo.feature.bnplacquisition.ui.common.components.VirtualCardTestTag.VIRTUAL_CARD, "CardHolder", "InstallmentSummary", "OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.Data> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("evaluateBnplProvisionEligibilityAndReplaceCard");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard evaluateBnplProvisionEligibilityAndReplaceCard = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                evaluateBnplProvisionEligibilityAndReplaceCard = (com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.EvaluateBnplProvisionEligibilityAndReplaceCard.INSTANCE, true)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.Data(evaluateBnplProvisionEligibilityAndReplaceCard);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("evaluateBnplProvisionEligibilityAndReplaceCard");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.EvaluateBnplProvisionEligibilityAndReplaceCard.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getEvaluateBnplProvisionEligibilityAndReplaceCard());
        }
    }

    private EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter$EvaluateBnplProvisionEligibilityAndReplaceCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$EvaluateBnplProvisionEligibilityAndReplaceCard;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$EvaluateBnplProvisionEligibilityAndReplaceCard;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$EvaluateBnplProvisionEligibilityAndReplaceCard;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EvaluateBnplProvisionEligibilityAndReplaceCard implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.EvaluateBnplProvisionEligibilityAndReplaceCard INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.EvaluateBnplProvisionEligibilityAndReplaceCard();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private EvaluateBnplProvisionEligibilityAndReplaceCard() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("EvaluateBNPLProvisionEligibilityAndReplaceCardSuccess"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess = com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("EvaluateBNPLProvisionEligibilityAndReplaceCardDecline"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline = com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard(str, onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess, onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess() != null) {
                com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.INSTANCE.toJson(writer, customScalarAdapters, value.getOnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess());
            }
            if (value.getOnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline() != null) {
                com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline.INSTANCE.toJson(writer, customScalarAdapters, value.getOnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter$OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"creditProductIdentifier", "approvedLoanAmount", "fundingPrimaryAccountNumberToken", "virtualCard", "cardHolder", "installmentSummary", "primaryDeviceTokenRelinked"});
        public static final int $stable = 8;

        private OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        
            if (r0 == null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        
            return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess(r2, r3, r4, r5, r6, r7, r0.booleanValue());
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0097, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "primaryDeviceTokenRelinked");
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00a1, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00a2, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "installmentSummary");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00ac, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "cardHolder");
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00b7, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b8, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "virtualCard");
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00c2, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00c3, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "approvedLoanAmount");
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00cd, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00ce, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "creditProductIdentifier");
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00d8, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (r2 == null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
        
            if (r3 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
        
            if (r5 == null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        
            if (r6 == null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r7 == null) goto L22;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier = null;
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount approvedLoanAmount = null;
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken fundingPrimaryAccountNumberToken = null;
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.VirtualCard virtualCard = null;
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.CardHolder cardHolder = null;
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.InstallmentSummary installmentSummary = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        bNPLCreditProductIdentifier = com.paypal.oslo.api.graphql.schema.type.adapter.BNPLCreditProductIdentifier_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        approvedLoanAmount = (com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.ApprovedLoanAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        fundingPrimaryAccountNumberToken = (com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.FundingPrimaryAccountNumberToken.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        virtualCard = (com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.VirtualCard) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.VirtualCard.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        cardHolder = (com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.CardHolder) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.CardHolder.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        installmentSummary = (com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.InstallmentSummary) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.InstallmentSummary.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("creditProductIdentifier");
            com.paypal.oslo.api.graphql.schema.type.adapter.BNPLCreditProductIdentifier_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getCreditProductIdentifier());
            writer.name("approvedLoanAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.ApprovedLoanAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getApprovedLoanAmount());
            writer.name("fundingPrimaryAccountNumberToken");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.FundingPrimaryAccountNumberToken.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getFundingPrimaryAccountNumberToken());
            writer.name("virtualCard");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.VirtualCard.INSTANCE, true).toJson(writer, customScalarAdapters, value.getVirtualCard());
            writer.name("cardHolder");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.CardHolder.INSTANCE, true).toJson(writer, customScalarAdapters, value.getCardHolder());
            writer.name("installmentSummary");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.InstallmentSummary.INSTANCE, true).toJson(writer, customScalarAdapters, value.getInstallmentSummary());
            writer.name("primaryDeviceTokenRelinked");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getPrimaryDeviceTokenRelinked()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter$ApprovedLoanAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$ApprovedLoanAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$ApprovedLoanAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$ApprovedLoanAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ApprovedLoanAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.ApprovedLoanAmount INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.ApprovedLoanAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private ApprovedLoanAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.ApprovedLoanAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter$FundingPrimaryAccountNumberToken;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$FundingPrimaryAccountNumberToken;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$FundingPrimaryAccountNumberToken;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$FundingPrimaryAccountNumberToken;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FundingPrimaryAccountNumberToken implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.FundingPrimaryAccountNumberToken INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.FundingPrimaryAccountNumberToken();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private FundingPrimaryAccountNumberToken() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragmentImpl_ResponseAdapter.BnplAcquisitionFpanTokenFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragmentImpl_ResponseAdapter.BnplAcquisitionFpanTokenFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionFpanTokenFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter$VirtualCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$VirtualCard;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$VirtualCard;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$VirtualCard;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class VirtualCard implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.VirtualCard> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.VirtualCard INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.VirtualCard();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private VirtualCard() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.VirtualCard fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragmentImpl_ResponseAdapter.BnplAcquisitionVirtualCardFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.VirtualCard(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.VirtualCard value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragmentImpl_ResponseAdapter.BnplAcquisitionVirtualCardFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionVirtualCardFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter$CardHolder;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$CardHolder;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$CardHolder;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$CardHolder;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CardHolder implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.CardHolder> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.CardHolder INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.CardHolder();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private CardHolder() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.CardHolder fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragmentImpl_ResponseAdapter.BnplAcquisitionCardHolderFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.CardHolder(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.CardHolder value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragmentImpl_ResponseAdapter.BnplAcquisitionCardHolderFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionCardHolderFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter$InstallmentSummary;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$InstallmentSummary;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$InstallmentSummary;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$InstallmentSummary;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InstallmentSummary implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.InstallmentSummary> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.InstallmentSummary INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.InstallmentSummary();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private InstallmentSummary() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.InstallmentSummary fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragmentImpl_ResponseAdapter.BnplAcquisitionInstallmentSummaryFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.InstallmentSummary(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.InstallmentSummary value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragmentImpl_ResponseAdapter.BnplAcquisitionInstallmentSummaryFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionInstallmentSummaryFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter$OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.EvaluateBnplProvisionEligibilityAndReplaceCardMutation_ResponseAdapter.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("reason");
        public static final int $stable = 8;

        private OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.BNPLTokenProvisionEligibilityDeclineReason bNPLTokenProvisionEligibilityDeclineReason = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                bNPLTokenProvisionEligibilityDeclineReason = com.paypal.oslo.api.graphql.schema.type.adapter.BNPLTokenProvisionEligibilityDeclineReason_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (bNPLTokenProvisionEligibilityDeclineReason != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline(bNPLTokenProvisionEligibilityDeclineReason);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "reason");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("reason");
            com.paypal.oslo.api.graphql.schema.type.adapter.BNPLTokenProvisionEligibilityDeclineReason_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getReason());
        }
    }
}
