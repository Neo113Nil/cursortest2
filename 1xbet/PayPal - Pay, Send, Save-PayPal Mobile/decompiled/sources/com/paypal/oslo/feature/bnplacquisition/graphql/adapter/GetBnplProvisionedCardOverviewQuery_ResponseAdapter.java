package com.paypal.oslo.feature.bnplacquisition.graphql.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/GetBnplProvisionedCardOverviewQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "BnplProvisionedCardOverview", "Token", "ApprovedLoanAmount", com.paypal.oslo.feature.bnplacquisition.ui.common.components.VirtualCardTestTag.VIRTUAL_CARD, "CardHolder", "InstallmentSummary"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetBnplProvisionedCardOverviewQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/GetBnplProvisionedCardOverviewQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.Data> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("bnplProvisionedCardOverview");
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.BnplProvisionedCardOverview bnplProvisionedCardOverview = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                bnplProvisionedCardOverview = (com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.BnplProvisionedCardOverview) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.BnplProvisionedCardOverview.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.Data(bnplProvisionedCardOverview);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("bnplProvisionedCardOverview");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.BnplProvisionedCardOverview.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getBnplProvisionedCardOverview());
        }
    }

    private GetBnplProvisionedCardOverviewQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/GetBnplProvisionedCardOverviewQuery_ResponseAdapter$BnplProvisionedCardOverview;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$BnplProvisionedCardOverview;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$BnplProvisionedCardOverview;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$BnplProvisionedCardOverview;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BnplProvisionedCardOverview implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.BnplProvisionedCardOverview> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.BnplProvisionedCardOverview INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.BnplProvisionedCardOverview();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"creditProductIdentifier", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "approvedLoanAmount", "virtualCard", "cardHolder", "installmentSummary", "primaryDeviceTokenRelinked"});
        public static final int $stable = 8;

        private BnplProvisionedCardOverview() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        
            if (r0 == null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        
            return new com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.BnplProvisionedCardOverview(r2, r3, r4, r5, r6, r7, r0.booleanValue());
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
        
            if (r4 == null) goto L28;
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
        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.BnplProvisionedCardOverview fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier bNPLCreditProductIdentifier = null;
            com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.Token token = null;
            com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.ApprovedLoanAmount approvedLoanAmount = null;
            com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.VirtualCard virtualCard = null;
            com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.CardHolder cardHolder = null;
            com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.InstallmentSummary installmentSummary = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        bNPLCreditProductIdentifier = com.paypal.oslo.api.graphql.schema.type.adapter.BNPLCreditProductIdentifier_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        token = (com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.Token) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.Token.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        approvedLoanAmount = (com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.ApprovedLoanAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.ApprovedLoanAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        virtualCard = (com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.VirtualCard) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.VirtualCard.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        cardHolder = (com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.CardHolder) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.CardHolder.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        installmentSummary = (com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.InstallmentSummary) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.InstallmentSummary.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.BnplProvisionedCardOverview value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("creditProductIdentifier");
            com.paypal.oslo.api.graphql.schema.type.adapter.BNPLCreditProductIdentifier_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getCreditProductIdentifier());
            writer.name(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY);
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.Token.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getToken());
            writer.name("approvedLoanAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.ApprovedLoanAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getApprovedLoanAmount());
            writer.name("virtualCard");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.VirtualCard.INSTANCE, true).toJson(writer, customScalarAdapters, value.getVirtualCard());
            writer.name("cardHolder");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.CardHolder.INSTANCE, true).toJson(writer, customScalarAdapters, value.getCardHolder());
            writer.name("installmentSummary");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.InstallmentSummary.INSTANCE, true).toJson(writer, customScalarAdapters, value.getInstallmentSummary());
            writer.name("primaryDeviceTokenRelinked");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getPrimaryDeviceTokenRelinked()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/GetBnplProvisionedCardOverviewQuery_ResponseAdapter$Token;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$Token;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$Token;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$Token;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Token implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.Token> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.Token INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.Token();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Token() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.Token fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragmentImpl_ResponseAdapter.BnplAcquisitionFpanTokenFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.Token(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.Token value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragmentImpl_ResponseAdapter.BnplAcquisitionFpanTokenFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionFpanTokenFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/GetBnplProvisionedCardOverviewQuery_ResponseAdapter$ApprovedLoanAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$ApprovedLoanAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$ApprovedLoanAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$ApprovedLoanAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ApprovedLoanAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.ApprovedLoanAmount> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.ApprovedLoanAmount INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.ApprovedLoanAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private ApprovedLoanAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.ApprovedLoanAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.ApprovedLoanAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.ApprovedLoanAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionMoneyFragmentImpl_ResponseAdapter.BnplAcquisitionMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/GetBnplProvisionedCardOverviewQuery_ResponseAdapter$VirtualCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$VirtualCard;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$VirtualCard;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$VirtualCard;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class VirtualCard implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.VirtualCard> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.VirtualCard INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.VirtualCard();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private VirtualCard() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.VirtualCard fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragmentImpl_ResponseAdapter.BnplAcquisitionVirtualCardFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.VirtualCard(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.VirtualCard value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragmentImpl_ResponseAdapter.BnplAcquisitionVirtualCardFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionVirtualCardFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/GetBnplProvisionedCardOverviewQuery_ResponseAdapter$CardHolder;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$CardHolder;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$CardHolder;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$CardHolder;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CardHolder implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.CardHolder> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.CardHolder INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.CardHolder();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private CardHolder() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.CardHolder fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragmentImpl_ResponseAdapter.BnplAcquisitionCardHolderFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.CardHolder(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.CardHolder value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionCardHolderFragmentImpl_ResponseAdapter.BnplAcquisitionCardHolderFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionCardHolderFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/adapter/GetBnplProvisionedCardOverviewQuery_ResponseAdapter$InstallmentSummary;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$InstallmentSummary;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$InstallmentSummary;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$InstallmentSummary;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InstallmentSummary implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.InstallmentSummary> {
        public static final com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.InstallmentSummary INSTANCE = new com.paypal.oslo.feature.bnplacquisition.graphql.adapter.GetBnplProvisionedCardOverviewQuery_ResponseAdapter.InstallmentSummary();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private InstallmentSummary() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.InstallmentSummary fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragment fromJson = com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragmentImpl_ResponseAdapter.BnplAcquisitionInstallmentSummaryFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.InstallmentSummary(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.InstallmentSummary value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionInstallmentSummaryFragmentImpl_ResponseAdapter.BnplAcquisitionInstallmentSummaryFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplAcquisitionInstallmentSummaryFragment());
        }
    }
}
