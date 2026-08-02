package com.paypal.oslo.feature.bnplservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingActivityFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "BnplServicingActivityFragment", "TransactionAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BnplServicingActivityFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingActivityFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingActivityFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingActivityFragmentImpl_ResponseAdapter$BnplServicingActivityFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingActivityFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingActivityFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingActivityFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BnplServicingActivityFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingActivityFragment> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingActivityFragmentImpl_ResponseAdapter.BnplServicingActivityFragment INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingActivityFragmentImpl_ResponseAdapter.BnplServicingActivityFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"transactionDate", "type", "subType", "transactionAmount", "softDescriptor"});
        public static final int $stable = 8;

        private BnplServicingActivityFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingActivityFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType bNPLServicingPlanActivityType = null;
            com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivitySubType bNPLServicingPlanActivitySubType = null;
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingActivityFragment.TransactionAmount transactionAmount = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    bNPLServicingPlanActivityType = com.paypal.oslo.api.graphql.schema.type.adapter.BNPLServicingPlanActivityType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    bNPLServicingPlanActivitySubType = (com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivitySubType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BNPLServicingPlanActivitySubType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    transactionAmount = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingActivityFragment.TransactionAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingActivityFragmentImpl_ResponseAdapter.TransactionAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 4) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "transactionDate");
                throw new kotlin.KotlinNothingValueException();
            }
            if (bNPLServicingPlanActivityType == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "type");
                throw new kotlin.KotlinNothingValueException();
            }
            if (transactionAmount != null) {
                return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingActivityFragment(obj, bNPLServicingPlanActivityType, bNPLServicingPlanActivitySubType, transactionAmount, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "transactionAmount");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingActivityFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("transactionDate");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getTransactionDate());
            writer.name("type");
            com.paypal.oslo.api.graphql.schema.type.adapter.BNPLServicingPlanActivityType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("subType");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.BNPLServicingPlanActivitySubType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getSubType());
            writer.name("transactionAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingActivityFragmentImpl_ResponseAdapter.TransactionAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getTransactionAmount());
            writer.name("softDescriptor");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getSoftDescriptor());
        }
    }

    private BnplServicingActivityFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingActivityFragmentImpl_ResponseAdapter$TransactionAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingActivityFragment$TransactionAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingActivityFragment$TransactionAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingActivityFragment$TransactionAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TransactionAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingActivityFragment.TransactionAmount> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingActivityFragmentImpl_ResponseAdapter.TransactionAmount INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingActivityFragmentImpl_ResponseAdapter.TransactionAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private TransactionAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingActivityFragment.TransactionAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragment fromJson = com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragmentImpl_ResponseAdapter.BnplServicingMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingActivityFragment.TransactionAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingActivityFragment.TransactionAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingMoneyFragmentImpl_ResponseAdapter.BnplServicingMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getBnplServicingMoneyFragment());
        }
    }
}
