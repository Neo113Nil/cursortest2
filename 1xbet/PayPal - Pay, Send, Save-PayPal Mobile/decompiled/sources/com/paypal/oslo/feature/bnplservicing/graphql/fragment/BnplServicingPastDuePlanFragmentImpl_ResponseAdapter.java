package com.paypal.oslo.feature.bnplservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "BnplServicingPastDuePlanFragment", "OverdueAmount", "Product", "VariantPolicy"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BnplServicingPastDuePlanFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragmentImpl_ResponseAdapter$BnplServicingPastDuePlanFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BnplServicingPastDuePlanFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragmentImpl_ResponseAdapter.BnplServicingPastDuePlanFragment INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragmentImpl_ResponseAdapter.BnplServicingPastDuePlanFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"contextualLabel", "creditAccountId", "currencyCode", "merchantLogoUrl", "merchantName", "overdueAmount", "planStatus", "product", "totalInstallmentsCount", "totalInstallmentsOverdue", "totalInstallmentsPaid", "totalInstallmentsRemaining", "variantPolicy"});
        public static final int $stable = 8;

        private BnplServicingPastDuePlanFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        
            if (r13 == null) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        
            if (r2 == null) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        
            r1 = r2.intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            if (r3 == null) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            r2 = r3.intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        
            if (r4 == null) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            r14 = r4.intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        
            if (r6 == null) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        
            r15 = r6.intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        
            if (r16 == null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
        
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment(r7, r5, r8, r9, r10, r11, r12, r13, r1, r2, r14, r15, r16);
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00e9, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r18, "variantPolicy");
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00f3, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00f4, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r18, "totalInstallmentsRemaining");
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00fe, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ff, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r18, "totalInstallmentsPaid");
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0109, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x010a, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r18, "totalInstallmentsOverdue");
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0114, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0115, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r18, "totalInstallmentsCount");
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x011f, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0120, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r18, "product");
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x012a, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x012b, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r18, "planStatus");
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0135, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0136, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r18, "overdueAmount");
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0140, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0141, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r18, "merchantName");
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x014b, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x014c, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r18, "currencyCode");
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0156, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0157, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r18, "creditAccountId");
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0161, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
        
            if (r5 == null) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
        
            if (r8 == null) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
        
            if (r10 == null) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
        
            if (r11 == null) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
        
            if (r12 == null) goto L47;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            java.lang.Integer num2 = null;
            java.lang.Integer num3 = null;
            java.lang.Object obj = null;
            java.lang.Integer num4 = null;
            com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel bNPLServicingPlanContextualLabel = null;
            java.lang.Object obj2 = null;
            java.lang.Object obj3 = null;
            java.lang.String str = null;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment.OverdueAmount overdueAmount = null;
            com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanStatus bNPLServicingPlanStatus = null;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment.Product product = null;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment.VariantPolicy variantPolicy = null;
            while (true) {
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
                        obj3 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        overdueAmount = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment.OverdueAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragmentImpl_ResponseAdapter.OverdueAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bNPLServicingPlanStatus = com.paypal.oslo.api.graphql.schema.type.adapter.BNPLServicingPlanStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        product = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment.Product) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragmentImpl_ResponseAdapter.Product.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        num2 = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        num3 = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        num4 = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        variantPolicy = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment.VariantPolicy) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragmentImpl_ResponseAdapter.VariantPolicy.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("contextualLabel");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BNPLServicingPlanContextualLabel_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getContextualLabel());
            writer.name("creditAccountId");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCreditAccountId());
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name("merchantLogoUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getMerchantLogoUrl());
            writer.name("merchantName");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getMerchantName());
            writer.name("overdueAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragmentImpl_ResponseAdapter.OverdueAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getOverdueAmount());
            writer.name("planStatus");
            com.paypal.oslo.api.graphql.schema.type.adapter.BNPLServicingPlanStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getPlanStatus());
            writer.name("product");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragmentImpl_ResponseAdapter.Product.INSTANCE, true).toJson(writer, customScalarAdapters, value.getProduct());
            writer.name("totalInstallmentsCount");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getTotalInstallmentsCount()));
            writer.name("totalInstallmentsOverdue");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getTotalInstallmentsOverdue()));
            writer.name("totalInstallmentsPaid");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getTotalInstallmentsPaid()));
            writer.name("totalInstallmentsRemaining");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getTotalInstallmentsRemaining()));
            writer.name("variantPolicy");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragmentImpl_ResponseAdapter.VariantPolicy.INSTANCE, true).toJson(writer, customScalarAdapters, value.getVariantPolicy());
        }
    }

    private BnplServicingPastDuePlanFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragmentImpl_ResponseAdapter$OverdueAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragment$OverdueAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragment$OverdueAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragment$OverdueAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OverdueAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment.OverdueAmount> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragmentImpl_ResponseAdapter.OverdueAmount INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragmentImpl_ResponseAdapter.OverdueAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OverdueAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment.OverdueAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment fromJson = com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragmentImpl_ResponseAdapter.BnplServicingMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment.OverdueAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment.OverdueAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragmentImpl_ResponseAdapter.BnplServicingMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplServicingMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragmentImpl_ResponseAdapter$Product;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragment$Product;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragment$Product;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragment$Product;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Product implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment.Product> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragmentImpl_ResponseAdapter.Product INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragmentImpl_ResponseAdapter.Product();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Product() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment.Product fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragment fromJson = com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragmentImpl_ResponseAdapter.BnplServicingProductFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment.Product(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment.Product value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragmentImpl_ResponseAdapter.BnplServicingProductFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplServicingProductFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragmentImpl_ResponseAdapter$VariantPolicy;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragment$VariantPolicy;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragment$VariantPolicy;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPastDuePlanFragment$VariantPolicy;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class VariantPolicy implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment.VariantPolicy> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragmentImpl_ResponseAdapter.VariantPolicy INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragmentImpl_ResponseAdapter.VariantPolicy();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private VariantPolicy() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment.VariantPolicy fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragment fromJson = com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragmentImpl_ResponseAdapter.BnplServicingVariantPolicyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment.VariantPolicy(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPastDuePlanFragment.VariantPolicy value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragmentImpl_ResponseAdapter.BnplServicingVariantPolicyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplServicingVariantPolicyFragment());
        }
    }
}
