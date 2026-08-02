package com.paypal.oslo.feature.p2p.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b+\bÆ\u0002\u0018\u00002\u00020\u0001:)\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter;", "", "<init>", "()V", "Data", com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OPERATION_NAME, "PaymentTransferAttempt", "TransferAmount", "Note", "Media", "RecommendedContact", "Name", "OnPersonName", "OnBusinessName", "Receiver", "Name1", "OnPersonName1", "OnBusinessName1", "SupportedTransferType", "FundingOptions", "AllowedOption", "FundingSource", "Amount", "Instrument", "OnBankAccount", "OnBalance", "OnCard", "BackupFundingSource", "Instrument1", "OnBankAccount1", "OnBalance1", "OnCard1", "AmountsBreakdown", "Sender", "AmountSent", "TotalFee", "FeeBreakdown", "InstrumentFees", "CrossBorderFees", "TotalAmountSent", "Receiver1", "AmountReceived", "Contingency", "PaymentDisclosure", "PrePaymentDisclosure"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Data> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("startPaymentTransferAttemptForSubflow");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.StartPaymentTransferAttemptForSubflow startPaymentTransferAttemptForSubflow = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                startPaymentTransferAttemptForSubflow = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.StartPaymentTransferAttemptForSubflow) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.StartPaymentTransferAttemptForSubflow.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (startPaymentTransferAttemptForSubflow != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Data(startPaymentTransferAttemptForSubflow);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "startPaymentTransferAttemptForSubflow");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("startPaymentTransferAttemptForSubflow");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.StartPaymentTransferAttemptForSubflow.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getStartPaymentTransferAttemptForSubflow());
        }
    }

    private StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$StartPaymentTransferAttemptForSubflow;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$StartPaymentTransferAttemptForSubflow;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$StartPaymentTransferAttemptForSubflow;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$StartPaymentTransferAttemptForSubflow;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StartPaymentTransferAttemptForSubflow implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.StartPaymentTransferAttemptForSubflow> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.StartPaymentTransferAttemptForSubflow INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.StartPaymentTransferAttemptForSubflow();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("paymentTransferAttempt");
        public static final int $stable = 8;

        private StartPaymentTransferAttemptForSubflow() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.StartPaymentTransferAttemptForSubflow fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PaymentTransferAttempt paymentTransferAttempt = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                paymentTransferAttempt = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PaymentTransferAttempt) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.PaymentTransferAttempt.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (paymentTransferAttempt != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.StartPaymentTransferAttemptForSubflow(paymentTransferAttempt);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "paymentTransferAttempt");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.StartPaymentTransferAttemptForSubflow value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("paymentTransferAttempt");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.PaymentTransferAttempt.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getPaymentTransferAttempt());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$PaymentTransferAttempt;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$PaymentTransferAttempt;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$PaymentTransferAttempt;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$PaymentTransferAttempt;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaymentTransferAttempt implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PaymentTransferAttempt> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.PaymentTransferAttempt INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.PaymentTransferAttempt();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "transferAmount", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SUPPORTED_INTENTS, "selectedIntent", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.NOTE, "recommendedContacts", "receiver", "supportedTransferTypes", "selectedTransferType", "fundingOptions"});
        public static final int $stable = 8;

        private PaymentTransferAttempt() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x00f0, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "supportedTransferTypes");
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x00fa, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x00fb, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SUPPORTED_INTENTS);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0105, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0106, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r17, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0110, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
        
            if (r4 == null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
        
            if (r6 == null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
        
            if (r11 == null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
        
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PaymentTransferAttempt(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PaymentTransferAttempt fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.TransferAmount transferAmount = null;
            java.util.List list = null;
            com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent paymentTransferIntent = null;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Note note = null;
            java.util.List list2 = null;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Receiver receiver = null;
            java.util.List list3 = null;
            com.paypal.oslo.api.graphql.schema.type.PaymentTransferType paymentTransferType = null;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.FundingOptions fundingOptions = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        transferAmount = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.TransferAmount) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.TransferAmount.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        list = com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.PaymentTransferIntent_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        paymentTransferIntent = (com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.PaymentTransferIntent_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        note = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Note) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Note.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        list2 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.RecommendedContact.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        receiver = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Receiver) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Receiver.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        list3 = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.SupportedTransferType.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        paymentTransferType = (com.paypal.oslo.api.graphql.schema.type.PaymentTransferType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.PaymentTransferType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        fundingOptions = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.FundingOptions) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.FundingOptions.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PaymentTransferAttempt value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("transferAmount");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.TransferAmount.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getTransferAmount());
            writer.name(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SUPPORTED_INTENTS);
            com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.PaymentTransferIntent_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, (java.util.List) value.getSupportedIntents());
            writer.name("selectedIntent");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.PaymentTransferIntent_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getSelectedIntent());
            writer.name(com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.NOTE);
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Note.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getNote());
            writer.name("recommendedContacts");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.RecommendedContact.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getRecommendedContacts());
            writer.name("receiver");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Receiver.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getReceiver());
            writer.name("supportedTransferTypes");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.SupportedTransferType.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getSupportedTransferTypes());
            writer.name("selectedTransferType");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.PaymentTransferType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getSelectedTransferType());
            writer.name("fundingOptions");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.FundingOptions.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getFundingOptions());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$TransferAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$TransferAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$TransferAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$TransferAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TransferAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.TransferAmount> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.TransferAmount INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.TransferAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE});
        public static final int $stable = 8;

        private TransferAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.TransferAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.TransferAmount(obj, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.TransferAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$Note;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Note;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Note;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Note;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Note implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Note> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Note INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Note();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"memo", io.ktor.http.LinkHeader.Parameters.Media});
        public static final int $stable = 8;

        private Note() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Note fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Media media = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    media = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Media) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Media.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Note(str, media);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Note value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("memo");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getMemo());
            writer.name(io.ktor.http.LinkHeader.Parameters.Media);
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Media.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getMedia());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$Media;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Media;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Media;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Media;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Media implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Media> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Media INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Media();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "provider", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "referenceUrl"});
        public static final int $stable = 8;

        private Media() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Media fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.MediaProvider mediaProvider = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    mediaProvider = com.paypal.oslo.api.graphql.schema.type.adapter.MediaProvider_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    obj2 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (mediaProvider == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "provider");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj2 != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Media(str, mediaProvider, obj, obj2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "referenceUrl");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Media value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("provider");
            com.paypal.oslo.api.graphql.schema.type.adapter.MediaProvider_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getProvider());
            writer.name(org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE);
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getContentType());
            writer.name("referenceUrl");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getReferenceUrl());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$RecommendedContact;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$RecommendedContact;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$RecommendedContact;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$RecommendedContact;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RecommendedContact implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.RecommendedContact> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.RecommendedContact INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.RecommendedContact();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "accountId", "name", "type", "profilePhotoUrl", "status", "favorite", com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper.ERROR_MSG_BLOCKED});
        public static final int $stable = 8;

        private RecommendedContact() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            if (r1 == null) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.RecommendedContact(r2, r3, r4, r5, r6, r7, r8, r1.booleanValue());
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x008d, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper.ERROR_MSG_BLOCKED);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0097, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0098, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "favorite");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00a2, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00a3, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "status");
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00ad, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00ae, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "type");
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00b8, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00b9, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00c3, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        
            if (r2 == null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
        
            if (r5 == null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
        
            if (r7 == null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        
            if (r0 == null) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            r8 = r0.booleanValue();
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.RecommendedContact fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.Boolean bool2 = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Name name2 = null;
            com.paypal.oslo.api.graphql.schema.type.PeerType peerType = null;
            java.lang.Object obj = null;
            com.paypal.oslo.api.graphql.schema.type.PeerStatus peerStatus = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (java.lang.String) com.apollographql.apollo.api.Adapters.m9938nullable(customScalarAdapters.responseAdapterFor(com.paypal.oslo.api.graphql.schema.type.AccountID.INSTANCE.getType())).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        name2 = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Name) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Name.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        peerType = com.paypal.oslo.api.graphql.schema.type.adapter.PeerType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        peerStatus = com.paypal.oslo.api.graphql.schema.type.adapter.PeerStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool2 = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.RecommendedContact value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("accountId");
            com.apollographql.apollo.api.Adapters.m9938nullable(customScalarAdapters.responseAdapterFor(com.paypal.oslo.api.graphql.schema.type.AccountID.INSTANCE.getType())).toJson(writer, customScalarAdapters, value.getAccountId());
            writer.name("name");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Name.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getName());
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.PeerType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("profilePhotoUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getProfilePhotoUrl());
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.PeerStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("favorite");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getFavorite()));
            writer.name(com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper.ERROR_MSG_BLOCKED);
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getBlocked()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$Name;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Name;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Name;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Name;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Name implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Name> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Name INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Name();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Name() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Name fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnPersonName onPersonName;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBusinessName onBusinessName = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PersonName"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPersonName = com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnPersonName.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onPersonName = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("BusinessName"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onBusinessName = com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBusinessName.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Name(str, onPersonName, onBusinessName);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Name value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnPersonName() != null) {
                com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnPersonName.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPersonName());
            }
            if (value.getOnBusinessName() != null) {
                com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBusinessName.INSTANCE.toJson(writer, customScalarAdapters, value.getOnBusinessName());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$OnPersonName;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnPersonName;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnPersonName;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnPersonName;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPersonName implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnPersonName> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnPersonName INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnPersonName();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"prefix", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "suffix", "fullName"});
        public static final int $stable = 8;

        private OnPersonName() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnPersonName fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            java.lang.String str6 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    str4 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 4) {
                    str5 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 5) {
                    str6 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnPersonName(str, str2, str3, str4, str5, str6);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnPersonName value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("prefix");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPrefix());
            writer.name(com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getGivenName());
            writer.name("surname");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getSurname());
            writer.name(com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getMiddleName());
            writer.name("suffix");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getSuffix());
            writer.name("fullName");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getFullName());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$OnBusinessName;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnBusinessName;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnBusinessName;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnBusinessName;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnBusinessName implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBusinessName> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBusinessName INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBusinessName();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"businessName", "orthography"});
        public static final int $stable = 8;

        private OnBusinessName() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBusinessName fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.Orthography orthography = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    orthography = (com.paypal.oslo.api.graphql.schema.type.Orthography) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.Orthography_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBusinessName(str, orthography);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "businessName");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBusinessName value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("businessName");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getBusinessName());
            writer.name("orthography");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.Orthography_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getOrthography());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$Receiver;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Receiver;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Receiver;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Receiver;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Receiver implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Receiver> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Receiver INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Receiver();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"accountId", "id", "type", "name", "profilePhotoUrl"});
        public static final int $stable = 8;

        private Receiver() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Receiver fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.Object obj = null;
            com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType paymentReceiverType = null;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Name1 name1 = null;
            java.lang.Object obj2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = (java.lang.String) com.apollographql.apollo.api.Adapters.m9938nullable(customScalarAdapters.responseAdapterFor(com.paypal.oslo.api.graphql.schema.type.AccountID.INSTANCE.getType())).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    paymentReceiverType = com.paypal.oslo.api.graphql.schema.type.adapter.PaymentReceiverType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    name1 = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Name1) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Name1.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 4) {
                        break;
                    }
                    obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (paymentReceiverType != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Receiver(str, obj, paymentReceiverType, name1, obj2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "type");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Receiver value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("accountId");
            com.apollographql.apollo.api.Adapters.m9938nullable(customScalarAdapters.responseAdapterFor(com.paypal.oslo.api.graphql.schema.type.AccountID.INSTANCE.getType())).toJson(writer, customScalarAdapters, value.getAccountId());
            writer.name("id");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.PaymentReceiverType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("name");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Name1.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getName());
            writer.name("profilePhotoUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getProfilePhotoUrl());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$Name1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Name1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Name1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Name1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Name1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Name1> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Name1 INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Name1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Name1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Name1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnPersonName1 onPersonName1;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBusinessName1 onBusinessName1 = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PersonName"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPersonName1 = com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnPersonName1.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onPersonName1 = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("BusinessName"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onBusinessName1 = com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBusinessName1.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Name1(str, onPersonName1, onBusinessName1);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Name1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnPersonName() != null) {
                com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnPersonName1.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPersonName());
            }
            if (value.getOnBusinessName() != null) {
                com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBusinessName1.INSTANCE.toJson(writer, customScalarAdapters, value.getOnBusinessName());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$OnPersonName1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnPersonName1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnPersonName1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnPersonName1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPersonName1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnPersonName1> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnPersonName1 INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnPersonName1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"prefix", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "suffix", "fullName"});
        public static final int $stable = 8;

        private OnPersonName1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnPersonName1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            java.lang.String str6 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    str4 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 4) {
                    str5 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 5) {
                    str6 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnPersonName1(str, str2, str3, str4, str5, str6);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnPersonName1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("prefix");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPrefix());
            writer.name(com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getGivenName());
            writer.name("surname");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getSurname());
            writer.name(com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getMiddleName());
            writer.name("suffix");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getSuffix());
            writer.name("fullName");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getFullName());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$OnBusinessName1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnBusinessName1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnBusinessName1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnBusinessName1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnBusinessName1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBusinessName1> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBusinessName1 INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBusinessName1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"businessName", "orthography"});
        public static final int $stable = 8;

        private OnBusinessName1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBusinessName1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.Orthography orthography = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    orthography = (com.paypal.oslo.api.graphql.schema.type.Orthography) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.Orthography_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBusinessName1(str, orthography);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "businessName");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBusinessName1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("businessName");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getBusinessName());
            writer.name("orthography");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.Orthography_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getOrthography());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$SupportedTransferType;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$SupportedTransferType;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$SupportedTransferType;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$SupportedTransferType;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SupportedTransferType implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.SupportedTransferType> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.SupportedTransferType INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.SupportedTransferType();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"type", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT});
        public static final int $stable = 8;

        private SupportedTransferType() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.SupportedTransferType fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.PaymentTransferType paymentTransferType = null;
            java.lang.Boolean bool = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    paymentTransferType = com.paypal.oslo.api.graphql.schema.type.adapter.PaymentTransferType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (paymentTransferType == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "type");
                throw new kotlin.KotlinNothingValueException();
            }
            if (bool != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.SupportedTransferType(paymentTransferType, bool.booleanValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.SupportedTransferType value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.PaymentTransferType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT);
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getDefault()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$FundingOptions;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$FundingOptions;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$FundingOptions;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$FundingOptions;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FundingOptions implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.FundingOptions> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.FundingOptions INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.FundingOptions();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"allowedOptions", "prePaymentDisclosures", "__typename"});
        public static final int $stable = 8;

        private FundingOptions() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.FundingOptions fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            java.lang.String str = null;
            java.util.List list2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.AllowedOption.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    list2 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.PrePaymentDisclosure.INSTANCE, true))).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (list == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "allowedOptions");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.FundingOptions(list, list2, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.FundingOptions value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("allowedOptions");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.AllowedOption.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getAllowedOptions());
            writer.name("prePaymentDisclosures");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.PrePaymentDisclosure.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getPrePaymentDisclosures());
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$AllowedOption;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$AllowedOption;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$AllowedOption;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$AllowedOption;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AllowedOption implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AllowedOption> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.AllowedOption INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.AllowedOption();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "fundingSources", "backupFundingSources", "amountsBreakdown", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "contingencies", "paymentDisclosures", "__typename"});
        public static final int $stable = 8;

        private AllowedOption() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AllowedOption(r2, r3, r4, r5, r6, r7, r8, r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x00c7, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r13, "__typename");
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x00d1, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00d2, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r13, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00dc, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00dd, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r13, "fundingSources");
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00e7, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00e8, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r13, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00f2, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        
            if (r2 == null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
        
            if (r3 == null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        
            if (r1 == null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        
            r6 = r1.booleanValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        
            if (r9 == null) goto L20;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AllowedOption fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.Object obj = null;
            java.util.List list = null;
            java.util.List list2 = null;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountsBreakdown amountsBreakdown = null;
            java.util.List list3 = null;
            java.util.List list4 = null;
            java.lang.String str = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.FundingSource.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        list2 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.BackupFundingSource.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        amountsBreakdown = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountsBreakdown) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.AmountsBreakdown.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        list3 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Contingency.INSTANCE, true))).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        list4 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.PaymentDisclosure.INSTANCE, true))).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AllowedOption value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("fundingSources");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.FundingSource.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getFundingSources());
            writer.name("backupFundingSources");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.BackupFundingSource.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getBackupFundingSources());
            writer.name("amountsBreakdown");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.AmountsBreakdown.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getAmountsBreakdown());
            writer.name(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT);
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getDefault()));
            writer.name("contingencies");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Contingency.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getContingencies());
            writer.name("paymentDisclosures");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.PaymentDisclosure.INSTANCE, true))).toJson(writer, customScalarAdapters, value.getPaymentDisclosures());
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$FundingSource;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$FundingSource;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$FundingSource;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$FundingSource;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FundingSource implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.FundingSource> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.FundingSource INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.FundingSource();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"amount", "instrument", "__typename"});
        public static final int $stable = 8;

        private FundingSource() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.FundingSource fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Amount amount = null;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Instrument instrument = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    amount = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Amount) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Amount.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    instrument = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Instrument) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Instrument.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (amount == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "amount");
                throw new kotlin.KotlinNothingValueException();
            }
            if (instrument == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "instrument");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.FundingSource(amount, instrument, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.FundingSource value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("amount");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Amount.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getAmount());
            writer.name("instrument");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Instrument.INSTANCE, true).toJson(writer, customScalarAdapters, value.getInstrument());
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$Amount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Amount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Amount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Amount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Amount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Amount> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Amount INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Amount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename"});
        public static final int $stable = 8;

        private Amount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Amount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Amount(obj, str, str2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Amount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$Instrument;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Instrument;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Instrument;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Instrument;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Instrument implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Instrument> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Instrument INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Instrument();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Instrument() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Instrument fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBankAccount onBankAccount;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBalance onBalance;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnCard onCard = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("BankAccount"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onBankAccount = com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBankAccount.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onBankAccount = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.discover.mpos.sdk.core.ConstantsKt.BALANCE_OUTCOME_QUALIFIER), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onBalance = com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBalance.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onBalance = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onCard = com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnCard.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Instrument(str, onBankAccount, onBalance, onCard);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Instrument value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnBankAccount() != null) {
                com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBankAccount.INSTANCE.toJson(writer, customScalarAdapters, value.getOnBankAccount());
            }
            if (value.getOnBalance() != null) {
                com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBalance.INSTANCE.toJson(writer, customScalarAdapters, value.getOnBalance());
            }
            if (value.getOnCard() != null) {
                com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnCard.INSTANCE.toJson(writer, customScalarAdapters, value.getOnCard());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$OnBankAccount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnBankAccount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnBankAccount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnBankAccount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnBankAccount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBankAccount> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBankAccount INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBankAccount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnBankAccount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBankAccount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.p2p.graphql.fragment.BankAccountFields fromJson = com.paypal.oslo.feature.p2p.graphql.fragment.BankAccountFieldsImpl_ResponseAdapter.BankAccountFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBankAccount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBankAccount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.p2p.graphql.fragment.BankAccountFieldsImpl_ResponseAdapter.BankAccountFields.INSTANCE.toJson(writer, customScalarAdapters, value.getBankAccountFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$OnBalance;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnBalance;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnBalance;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnBalance;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnBalance implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBalance> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBalance INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBalance();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnBalance() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBalance fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields fromJson = com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFieldsImpl_ResponseAdapter.BalanceFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBalance(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBalance value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFieldsImpl_ResponseAdapter.BalanceFields.INSTANCE.toJson(writer, customScalarAdapters, value.getBalanceFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$OnCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnCard;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnCard;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnCard;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnCard implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnCard> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnCard INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnCard();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnCard() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnCard fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.p2p.graphql.fragment.CardFields fromJson = com.paypal.oslo.feature.p2p.graphql.fragment.CardFieldsImpl_ResponseAdapter.CardFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnCard(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnCard value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.p2p.graphql.fragment.CardFieldsImpl_ResponseAdapter.CardFields.INSTANCE.toJson(writer, customScalarAdapters, value.getCardFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$BackupFundingSource;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$BackupFundingSource;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$BackupFundingSource;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$BackupFundingSource;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BackupFundingSource implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.BackupFundingSource> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.BackupFundingSource INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.BackupFundingSource();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"instrument", "__typename"});
        public static final int $stable = 8;

        private BackupFundingSource() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.BackupFundingSource fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Instrument1 instrument1 = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    instrument1 = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Instrument1) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Instrument1.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (instrument1 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "instrument");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.BackupFundingSource(instrument1, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.BackupFundingSource value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("instrument");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Instrument1.INSTANCE, true).toJson(writer, customScalarAdapters, value.getInstrument());
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$Instrument1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Instrument1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Instrument1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Instrument1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Instrument1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Instrument1> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Instrument1 INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Instrument1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Instrument1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Instrument1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBankAccount1 onBankAccount1;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBalance1 onBalance1;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnCard1 onCard1 = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("BankAccount"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onBankAccount1 = com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBankAccount1.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onBankAccount1 = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.discover.mpos.sdk.core.ConstantsKt.BALANCE_OUTCOME_QUALIFIER), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onBalance1 = com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBalance1.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onBalance1 = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onCard1 = com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnCard1.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Instrument1(str, onBankAccount1, onBalance1, onCard1);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Instrument1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnBankAccount() != null) {
                com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBankAccount1.INSTANCE.toJson(writer, customScalarAdapters, value.getOnBankAccount());
            }
            if (value.getOnBalance() != null) {
                com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBalance1.INSTANCE.toJson(writer, customScalarAdapters, value.getOnBalance());
            }
            if (value.getOnCard() != null) {
                com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnCard1.INSTANCE.toJson(writer, customScalarAdapters, value.getOnCard());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$OnBankAccount1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnBankAccount1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnBankAccount1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnBankAccount1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnBankAccount1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBankAccount1> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBankAccount1 INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBankAccount1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnBankAccount1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBankAccount1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.p2p.graphql.fragment.BankAccountFields fromJson = com.paypal.oslo.feature.p2p.graphql.fragment.BankAccountFieldsImpl_ResponseAdapter.BankAccountFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBankAccount1(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBankAccount1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.p2p.graphql.fragment.BankAccountFieldsImpl_ResponseAdapter.BankAccountFields.INSTANCE.toJson(writer, customScalarAdapters, value.getBankAccountFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$OnBalance1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnBalance1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnBalance1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnBalance1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnBalance1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBalance1> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBalance1 INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnBalance1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnBalance1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBalance1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFields fromJson = com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFieldsImpl_ResponseAdapter.BalanceFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBalance1(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBalance1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.p2p.graphql.fragment.BalanceFieldsImpl_ResponseAdapter.BalanceFields.INSTANCE.toJson(writer, customScalarAdapters, value.getBalanceFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$OnCard1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnCard1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnCard1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$OnCard1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnCard1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnCard1> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnCard1 INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.OnCard1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnCard1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnCard1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.p2p.graphql.fragment.CardFields fromJson = com.paypal.oslo.feature.p2p.graphql.fragment.CardFieldsImpl_ResponseAdapter.CardFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnCard1(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnCard1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.p2p.graphql.fragment.CardFieldsImpl_ResponseAdapter.CardFields.INSTANCE.toJson(writer, customScalarAdapters, value.getCardFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$AmountsBreakdown;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$AmountsBreakdown;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$AmountsBreakdown;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$AmountsBreakdown;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AmountsBreakdown implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountsBreakdown> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.AmountsBreakdown INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.AmountsBreakdown();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"sender", "receiver", "__typename"});
        public static final int $stable = 8;

        private AmountsBreakdown() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountsBreakdown fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Sender sender = null;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Receiver1 receiver1 = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    sender = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Sender) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Sender.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    receiver1 = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Receiver1) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Receiver1.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (sender == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "sender");
                throw new kotlin.KotlinNothingValueException();
            }
            if (receiver1 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "receiver");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountsBreakdown(sender, receiver1, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountsBreakdown value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("sender");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Sender.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getSender());
            writer.name("receiver");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Receiver1.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getReceiver());
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$Sender;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Sender;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Sender;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Sender;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Sender implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Sender> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Sender INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Sender();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"amountSent", "totalFee", "feeBreakdown", "totalAmountSent", "__typename"});
        public static final int $stable = 8;

        private Sender() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Sender fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountSent amountSent = null;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.TotalFee totalFee = null;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.FeeBreakdown feeBreakdown = null;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.TotalAmountSent totalAmountSent = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    amountSent = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountSent) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.AmountSent.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    totalFee = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.TotalFee) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.TotalFee.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    feeBreakdown = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.FeeBreakdown) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.FeeBreakdown.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    totalAmountSent = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.TotalAmountSent) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.TotalAmountSent.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 4) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (amountSent == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "amountSent");
                throw new kotlin.KotlinNothingValueException();
            }
            if (totalFee == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "totalFee");
                throw new kotlin.KotlinNothingValueException();
            }
            if (totalAmountSent == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "totalAmountSent");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Sender(amountSent, totalFee, feeBreakdown, totalAmountSent, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Sender value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("amountSent");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.AmountSent.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getAmountSent());
            writer.name("totalFee");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.TotalFee.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getTotalFee());
            writer.name("feeBreakdown");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.FeeBreakdown.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getFeeBreakdown());
            writer.name("totalAmountSent");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.TotalAmountSent.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getTotalAmountSent());
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$AmountSent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$AmountSent;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$AmountSent;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$AmountSent;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AmountSent implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountSent> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.AmountSent INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.AmountSent();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename"});
        public static final int $stable = 8;

        private AmountSent() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountSent fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountSent(obj, str, str2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountSent value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$TotalFee;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$TotalFee;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$TotalFee;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$TotalFee;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TotalFee implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.TotalFee> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.TotalFee INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.TotalFee();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename"});
        public static final int $stable = 8;

        private TotalFee() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.TotalFee fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.TotalFee(obj, str, str2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.TotalFee value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$FeeBreakdown;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$FeeBreakdown;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$FeeBreakdown;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$FeeBreakdown;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FeeBreakdown implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.FeeBreakdown> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.FeeBreakdown INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.FeeBreakdown();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"instrumentFees", "crossBorderFees", "__typename"});
        public static final int $stable = 8;

        private FeeBreakdown() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.FeeBreakdown fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.InstrumentFees instrumentFees = null;
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.CrossBorderFees crossBorderFees = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    instrumentFees = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.InstrumentFees) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.InstrumentFees.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    crossBorderFees = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.CrossBorderFees) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.CrossBorderFees.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.FeeBreakdown(instrumentFees, crossBorderFees, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.FeeBreakdown value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("instrumentFees");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.InstrumentFees.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getInstrumentFees());
            writer.name("crossBorderFees");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.CrossBorderFees.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getCrossBorderFees());
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$InstrumentFees;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$InstrumentFees;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$InstrumentFees;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$InstrumentFees;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InstrumentFees implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.InstrumentFees> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.InstrumentFees INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.InstrumentFees();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename"});
        public static final int $stable = 8;

        private InstrumentFees() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.InstrumentFees fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.InstrumentFees(obj, str, str2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.InstrumentFees value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$CrossBorderFees;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$CrossBorderFees;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$CrossBorderFees;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$CrossBorderFees;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CrossBorderFees implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.CrossBorderFees> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.CrossBorderFees INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.CrossBorderFees();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename"});
        public static final int $stable = 8;

        private CrossBorderFees() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.CrossBorderFees fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.CrossBorderFees(obj, str, str2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.CrossBorderFees value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$TotalAmountSent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$TotalAmountSent;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$TotalAmountSent;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$TotalAmountSent;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TotalAmountSent implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.TotalAmountSent> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.TotalAmountSent INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.TotalAmountSent();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename"});
        public static final int $stable = 8;

        private TotalAmountSent() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.TotalAmountSent fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.TotalAmountSent(obj, str, str2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.TotalAmountSent value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$Receiver1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Receiver1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Receiver1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Receiver1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Receiver1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Receiver1> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Receiver1 INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Receiver1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"amountReceived", "__typename"});
        public static final int $stable = 8;

        private Receiver1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Receiver1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountReceived amountReceived = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    amountReceived = (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountReceived) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.AmountReceived.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (amountReceived == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "amountReceived");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Receiver1(amountReceived, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Receiver1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("amountReceived");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.AmountReceived.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getAmountReceived());
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$AmountReceived;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$AmountReceived;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$AmountReceived;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$AmountReceived;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AmountReceived implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountReceived> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.AmountReceived INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.AmountReceived();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "__typename"});
        public static final int $stable = 8;

        private AmountReceived() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountReceived fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountReceived(obj, str, str2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.AmountReceived value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$Contingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Contingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Contingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$Contingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Contingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Contingency> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Contingency INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.Contingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Contingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Contingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment fromJson = com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.PlanContingencyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Contingency(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Contingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.PlanContingencyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getPlanContingencyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$PaymentDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$PaymentDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$PaymentDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$PaymentDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaymentDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PaymentDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.PaymentDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.PaymentDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private PaymentDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PaymentDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment fromJson = com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.PaymentPlanDisclosureFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PaymentDisclosure(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PaymentDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.PaymentPlanDisclosureFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getPaymentPlanDisclosureFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/adapter/StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter$PrePaymentDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$PrePaymentDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$PrePaymentDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$PrePaymentDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PrePaymentDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PrePaymentDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.PrePaymentDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.adapter.StartPaymentTransferAttemptForSubflowMutation_ResponseAdapter.PrePaymentDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private PrePaymentDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PrePaymentDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment fromJson = com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.PrePaymentDisclosureFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PrePaymentDisclosure(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PrePaymentDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.PrePaymentDisclosureFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getPrePaymentDisclosureFragment());
        }
    }
}
