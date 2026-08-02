package com.paypal.oslo.feature.bnplservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "BnplServicingReadyToUsePlanFragment", "ApprovedLoanAmount", "Product", "VariantPolicy", com.paypal.oslo.feature.bnplacquisition.ui.common.components.VirtualCardTestTag.VIRTUAL_CARD}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter$BnplServicingReadyToUsePlanFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BnplServicingReadyToUsePlanFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter.BnplServicingReadyToUsePlanFragment INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter.BnplServicingReadyToUsePlanFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"approvedLoanAmount", "contextualLabel", "creditAccountId", "currencyCode", "merchantLogoUrl", "planStatus", "product", "validityDuration", "variantPolicy", "virtualCard"});
        public static final int $stable = 8;

        private BnplServicingReadyToUsePlanFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        
            if (r9 == null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        
            if (r10 == null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        
            if (r11 == null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00a9, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r13, "virtualCard");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00b3, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00b4, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r13, "variantPolicy");
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00be, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00bf, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r13, "validityDuration");
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00c9, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00ca, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r13, "product");
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00d4, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00d5, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r13, "planStatus");
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00df, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00e0, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r13, "currencyCode");
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ea, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00eb, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r13, "creditAccountId");
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00f5, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00f6, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r13, "approvedLoanAmount");
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0100, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
        
            if (r2 == null) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
        
            if (r4 == null) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
        
            if (r5 == null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if (r7 == null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            if (r8 == null) goto L31;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.ApprovedLoanAmount approvedLoanAmount = null;
            com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel bNPLServicingPlanContextualLabel = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            java.lang.Object obj3 = null;
            com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanStatus bNPLServicingPlanStatus = null;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.Product product = null;
            java.lang.Object obj4 = null;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.VariantPolicy variantPolicy = null;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.VirtualCard virtualCard = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        approvedLoanAmount = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.ApprovedLoanAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter.ApprovedLoanAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bNPLServicingPlanContextualLabel = (com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BNPLServicingPlanContextualLabel_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        obj2 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        obj3 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bNPLServicingPlanStatus = com.paypal.oslo.api.graphql.schema.type.adapter.BNPLServicingPlanStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        product = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.Product) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter.Product.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        obj4 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        variantPolicy = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.VariantPolicy) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter.VariantPolicy.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        virtualCard = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.VirtualCard) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter.VirtualCard.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("approvedLoanAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter.ApprovedLoanAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getApprovedLoanAmount());
            writer.name("contextualLabel");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BNPLServicingPlanContextualLabel_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getContextualLabel());
            writer.name("creditAccountId");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCreditAccountId());
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name("merchantLogoUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getMerchantLogoUrl());
            writer.name("planStatus");
            com.paypal.oslo.api.graphql.schema.type.adapter.BNPLServicingPlanStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getPlanStatus());
            writer.name("product");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter.Product.INSTANCE, true).toJson(writer, customScalarAdapters, value.getProduct());
            writer.name("validityDuration");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getValidityDuration());
            writer.name("variantPolicy");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter.VariantPolicy.INSTANCE, true).toJson(writer, customScalarAdapters, value.getVariantPolicy());
            writer.name("virtualCard");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter.VirtualCard.INSTANCE, true).toJson(writer, customScalarAdapters, value.getVirtualCard());
        }
    }

    private BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter$ApprovedLoanAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment$ApprovedLoanAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment$ApprovedLoanAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment$ApprovedLoanAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ApprovedLoanAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.ApprovedLoanAmount> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter.ApprovedLoanAmount INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter.ApprovedLoanAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private ApprovedLoanAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.ApprovedLoanAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment fromJson = com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragmentImpl_ResponseAdapter.BnplServicingMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.ApprovedLoanAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.ApprovedLoanAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragmentImpl_ResponseAdapter.BnplServicingMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplServicingMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter$Product;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment$Product;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment$Product;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment$Product;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Product implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.Product> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter.Product INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter.Product();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Product() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.Product fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragment fromJson = com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragmentImpl_ResponseAdapter.BnplServicingProductFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.Product(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.Product value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragmentImpl_ResponseAdapter.BnplServicingProductFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplServicingProductFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter$VariantPolicy;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment$VariantPolicy;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment$VariantPolicy;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment$VariantPolicy;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class VariantPolicy implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.VariantPolicy> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter.VariantPolicy INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter.VariantPolicy();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private VariantPolicy() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.VariantPolicy fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragment fromJson = com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragmentImpl_ResponseAdapter.BnplServicingVariantPolicyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.VariantPolicy(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.VariantPolicy value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragmentImpl_ResponseAdapter.BnplServicingVariantPolicyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplServicingVariantPolicyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter$VirtualCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment$VirtualCard;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment$VirtualCard;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingReadyToUsePlanFragment$VirtualCard;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class VirtualCard implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.VirtualCard> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter.VirtualCard INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragmentImpl_ResponseAdapter.VirtualCard();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private VirtualCard() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.VirtualCard fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVirtualCardFragment fromJson = com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVirtualCardFragmentImpl_ResponseAdapter.BnplServicingVirtualCardFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.VirtualCard(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingReadyToUsePlanFragment.VirtualCard value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVirtualCardFragmentImpl_ResponseAdapter.BnplServicingVirtualCardFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplServicingVirtualCardFragment());
        }
    }
}
