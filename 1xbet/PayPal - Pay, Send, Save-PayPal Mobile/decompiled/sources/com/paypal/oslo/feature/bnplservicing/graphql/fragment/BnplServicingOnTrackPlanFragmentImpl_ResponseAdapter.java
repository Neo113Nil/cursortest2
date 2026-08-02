package com.paypal.oslo.feature.bnplservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "BnplServicingOnTrackPlanFragment", "CurrentPaymentDue", "NextPaymentDueAmount", "Product", "VariantPolicy"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter$BnplServicingOnTrackPlanFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BnplServicingOnTrackPlanFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter.BnplServicingOnTrackPlanFragment INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter.BnplServicingOnTrackPlanFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"contextualLabel", "creditAccountId", "currencyCode", "currentPaymentDue", "isDueToday", "merchantLogoUrl", "merchantName", "nextPaymentDueAmount", "nextPaymentDueDate", "planStatus", "product", "totalInstallmentsCount", "totalInstallmentsPaid", "totalInstallmentsRemaining", "variantPolicy"});
        public static final int $stable = 8;

        private BnplServicingOnTrackPlanFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
        
            if (r12 == null) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
        
            if (r13 == null) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        
            if (r14 == null) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if (r15 == null) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            if (r3 == null) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        
            r2 = r3.intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        
            if (r4 == null) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        
            r19 = r4.intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
        
            if (r6 == null) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        
            r20 = r6.intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        
            if (r18 == null) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
        
            return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment(r7, r5, r8, r17, r1, r16, r11, r12, r13, r14, r15, r2, r19, r20, r18);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0117, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r22, "variantPolicy");
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0121, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0122, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r22, "totalInstallmentsRemaining");
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x012c, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x012d, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r22, "totalInstallmentsPaid");
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0137, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0138, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r22, "totalInstallmentsCount");
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0142, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0143, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r22, "product");
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x014d, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x014e, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r22, "planStatus");
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0158, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0159, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r22, "nextPaymentDueDate");
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0163, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0164, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r22, "nextPaymentDueAmount");
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x016e, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x016f, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r22, "merchantName");
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0179, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x017a, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r22, "isDueToday");
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0184, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0185, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r22, "currencyCode");
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x018f, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0190, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r22, "creditAccountId");
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x019a, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
        
            if (r5 == null) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
        
            if (r8 == null) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
        
            if (r2 == null) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
        
            r1 = r2.booleanValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
        
            if (r11 == null) goto L55;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.Integer num = null;
            java.lang.Integer num2 = null;
            java.lang.Object obj = null;
            java.lang.Integer num3 = null;
            com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanContextualLabel bNPLServicingPlanContextualLabel = null;
            java.lang.Object obj2 = null;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.CurrentPaymentDue currentPaymentDue = null;
            java.lang.String str = null;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.NextPaymentDueAmount nextPaymentDueAmount = null;
            java.lang.Object obj3 = null;
            com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanStatus bNPLServicingPlanStatus = null;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.Product product = null;
            java.lang.Object obj4 = null;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.VariantPolicy variantPolicy = null;
            while (true) {
                com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.CurrentPaymentDue currentPaymentDue2 = currentPaymentDue;
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
                        currentPaymentDue = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.CurrentPaymentDue) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter.CurrentPaymentDue.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        obj4 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        nextPaymentDueAmount = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.NextPaymentDueAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter.NextPaymentDueAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        obj3 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        bNPLServicingPlanStatus = com.paypal.oslo.api.graphql.schema.type.adapter.BNPLServicingPlanStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        product = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.Product) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter.Product.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        num2 = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 13:
                        num3 = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 14:
                        variantPolicy = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.VariantPolicy) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter.VariantPolicy.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                }
                currentPaymentDue = currentPaymentDue2;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("contextualLabel");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BNPLServicingPlanContextualLabel_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getContextualLabel());
            writer.name("creditAccountId");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCreditAccountId());
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name("currentPaymentDue");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter.CurrentPaymentDue.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getCurrentPaymentDue());
            writer.name("isDueToday");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.isDueToday()));
            writer.name("merchantLogoUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getMerchantLogoUrl());
            writer.name("merchantName");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getMerchantName());
            writer.name("nextPaymentDueAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter.NextPaymentDueAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getNextPaymentDueAmount());
            writer.name("nextPaymentDueDate");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getNextPaymentDueDate());
            writer.name("planStatus");
            com.paypal.oslo.api.graphql.schema.type.adapter.BNPLServicingPlanStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getPlanStatus());
            writer.name("product");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter.Product.INSTANCE, true).toJson(writer, customScalarAdapters, value.getProduct());
            writer.name("totalInstallmentsCount");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getTotalInstallmentsCount()));
            writer.name("totalInstallmentsPaid");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getTotalInstallmentsPaid()));
            writer.name("totalInstallmentsRemaining");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getTotalInstallmentsRemaining()));
            writer.name("variantPolicy");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter.VariantPolicy.INSTANCE, true).toJson(writer, customScalarAdapters, value.getVariantPolicy());
        }
    }

    private BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter$CurrentPaymentDue;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment$CurrentPaymentDue;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment$CurrentPaymentDue;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment$CurrentPaymentDue;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CurrentPaymentDue implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.CurrentPaymentDue> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter.CurrentPaymentDue INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter.CurrentPaymentDue();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private CurrentPaymentDue() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.CurrentPaymentDue fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment fromJson = com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragmentImpl_ResponseAdapter.BnplServicingMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.CurrentPaymentDue(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.CurrentPaymentDue value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragmentImpl_ResponseAdapter.BnplServicingMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplServicingMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter$NextPaymentDueAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment$NextPaymentDueAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment$NextPaymentDueAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment$NextPaymentDueAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NextPaymentDueAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.NextPaymentDueAmount> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter.NextPaymentDueAmount INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter.NextPaymentDueAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private NextPaymentDueAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.NextPaymentDueAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment fromJson = com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragmentImpl_ResponseAdapter.BnplServicingMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.NextPaymentDueAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.NextPaymentDueAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragmentImpl_ResponseAdapter.BnplServicingMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplServicingMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter$Product;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment$Product;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment$Product;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment$Product;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Product implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.Product> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter.Product INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter.Product();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Product() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.Product fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragment fromJson = com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragmentImpl_ResponseAdapter.BnplServicingProductFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.Product(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.Product value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingProductFragmentImpl_ResponseAdapter.BnplServicingProductFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplServicingProductFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter$VariantPolicy;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment$VariantPolicy;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment$VariantPolicy;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingOnTrackPlanFragment$VariantPolicy;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class VariantPolicy implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.VariantPolicy> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter.VariantPolicy INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragmentImpl_ResponseAdapter.VariantPolicy();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private VariantPolicy() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.VariantPolicy fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragment fromJson = com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragmentImpl_ResponseAdapter.BnplServicingVariantPolicyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.VariantPolicy(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingOnTrackPlanFragment.VariantPolicy value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVariantPolicyFragmentImpl_ResponseAdapter.BnplServicingVariantPolicyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplServicingVariantPolicyFragment());
        }
    }
}
