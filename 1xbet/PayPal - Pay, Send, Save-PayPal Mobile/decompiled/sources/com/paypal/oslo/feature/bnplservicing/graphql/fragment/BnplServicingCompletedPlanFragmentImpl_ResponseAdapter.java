package com.paypal.oslo.feature.bnplservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "BnplServicingCompletedPlanFragment", "Product", "PurchaseAmount", "VariantPolicy"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BnplServicingCompletedPlanFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragmentImpl_ResponseAdapter$BnplServicingCompletedPlanFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BnplServicingCompletedPlanFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragmentImpl_ResponseAdapter.BnplServicingCompletedPlanFragment INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragmentImpl_ResponseAdapter.BnplServicingCompletedPlanFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"contextualLabel", "creditAccountId", "currencyCode", "isRefundPending", "merchantLogoUrl", "merchantName", "planCompletedDateTime", "planStatus", "product", "purchaseAmount", "totalInstallmentsCount", "totalInstallmentsPaid", "totalInstallmentsRemaining", "variantPolicy"});
        public static final int $stable = 8;

        private BnplServicingCompletedPlanFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        
            if (r11 == null) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        
            if (r12 == null) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
        
            if (r13 == null) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        
            if (r14 == null) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            if (r3 == null) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        
            r2 = r3.intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        
            if (r4 == null) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        
            r15 = r4.intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        
            if (r6 == null) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        
            r18 = r6.intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        
            if (r17 == null) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment(r7, r5, r8, r1, r16, r10, r11, r12, r13, r14, r2, r15, r18, r17);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00fb, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "variantPolicy");
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0105, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0106, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "totalInstallmentsRemaining");
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0110, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0111, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "totalInstallmentsPaid");
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x011b, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x011c, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "totalInstallmentsCount");
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0126, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0127, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "purchaseAmount");
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0131, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0132, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "product");
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x013c, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x013d, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "planStatus");
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0147, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0148, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "planCompletedDateTime");
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0152, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0153, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "merchantName");
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x015d, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x015e, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "isRefundPending");
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0168, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0169, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "currencyCode");
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0173, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0174, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "creditAccountId");
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x017e, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
        
            if (r5 == null) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
        
            if (r8 == null) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
        
            if (r2 == null) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        
            r1 = r2.booleanValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
        
            if (r10 == null) goto L54;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.Integer num = null;
            java.lang.Integer num2 = null;
            java.lang.Object obj = null;
            java.lang.Integer num3 = null;
            com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel bNPLServicingPlanContextualLabel = null;
            java.lang.Object obj2 = null;
            java.lang.Object obj3 = null;
            java.lang.String str = null;
            java.lang.Object obj4 = null;
            com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanStatus bNPLServicingPlanStatus = null;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment.Product product = null;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment.PurchaseAmount purchaseAmount = null;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment.VariantPolicy variantPolicy = null;
            while (true) {
                java.lang.Object obj5 = obj3;
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        bNPLServicingPlanContextualLabel = (com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BNPLServicingPlanContextualLabel_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        obj2 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        obj3 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        continue;
                    case 5:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        obj4 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bNPLServicingPlanStatus = com.paypal.oslo.api.graphql.schema.type.adapter.BNPLServicingPlanStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        product = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment.Product) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragmentImpl_ResponseAdapter.Product.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        purchaseAmount = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment.PurchaseAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragmentImpl_ResponseAdapter.PurchaseAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        num2 = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        num3 = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 13:
                        variantPolicy = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment.VariantPolicy) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragmentImpl_ResponseAdapter.VariantPolicy.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                }
                obj3 = obj5;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("contextualLabel");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BNPLServicingPlanContextualLabel_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getContextualLabel());
            writer.name("creditAccountId");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCreditAccountId());
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name("isRefundPending");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.isRefundPending()));
            writer.name("merchantLogoUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getMerchantLogoUrl());
            writer.name("merchantName");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getMerchantName());
            writer.name("planCompletedDateTime");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getPlanCompletedDateTime());
            writer.name("planStatus");
            com.paypal.oslo.api.graphql.schema.type.adapter.BNPLServicingPlanStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getPlanStatus());
            writer.name("product");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragmentImpl_ResponseAdapter.Product.INSTANCE, true).toJson(writer, customScalarAdapters, value.getProduct());
            writer.name("purchaseAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragmentImpl_ResponseAdapter.PurchaseAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getPurchaseAmount());
            writer.name("totalInstallmentsCount");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getTotalInstallmentsCount()));
            writer.name("totalInstallmentsPaid");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getTotalInstallmentsPaid()));
            writer.name("totalInstallmentsRemaining");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getTotalInstallmentsRemaining()));
            writer.name("variantPolicy");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragmentImpl_ResponseAdapter.VariantPolicy.INSTANCE, true).toJson(writer, customScalarAdapters, value.getVariantPolicy());
        }
    }

    private BnplServicingCompletedPlanFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragmentImpl_ResponseAdapter$Product;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment$Product;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment$Product;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment$Product;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Product implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment.Product> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragmentImpl_ResponseAdapter.Product INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragmentImpl_ResponseAdapter.Product();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Product() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment.Product fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragment fromJson = com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragmentImpl_ResponseAdapter.BnplServicingProductFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment.Product(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment.Product value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragmentImpl_ResponseAdapter.BnplServicingProductFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplServicingProductFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragmentImpl_ResponseAdapter$PurchaseAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment$PurchaseAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment$PurchaseAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment$PurchaseAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PurchaseAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment.PurchaseAmount> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragmentImpl_ResponseAdapter.PurchaseAmount INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragmentImpl_ResponseAdapter.PurchaseAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private PurchaseAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment.PurchaseAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment fromJson = com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragmentImpl_ResponseAdapter.BnplServicingMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment.PurchaseAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment.PurchaseAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragmentImpl_ResponseAdapter.BnplServicingMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplServicingMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragmentImpl_ResponseAdapter$VariantPolicy;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment$VariantPolicy;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment$VariantPolicy;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingCompletedPlanFragment$VariantPolicy;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class VariantPolicy implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment.VariantPolicy> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragmentImpl_ResponseAdapter.VariantPolicy INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragmentImpl_ResponseAdapter.VariantPolicy();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private VariantPolicy() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment.VariantPolicy fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragment fromJson = com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragmentImpl_ResponseAdapter.BnplServicingVariantPolicyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment.VariantPolicy(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingCompletedPlanFragment.VariantPolicy value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragmentImpl_ResponseAdapter.BnplServicingVariantPolicyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplServicingVariantPolicyFragment());
        }
    }
}
