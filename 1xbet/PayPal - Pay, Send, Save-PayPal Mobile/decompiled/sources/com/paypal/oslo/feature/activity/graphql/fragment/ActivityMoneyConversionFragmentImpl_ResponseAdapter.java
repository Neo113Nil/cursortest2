package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "ActivityMoneyConversionFragment", "SourceAmount", "TargetAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityMoneyConversionFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragmentImpl_ResponseAdapter$ActivityMoneyConversionFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActivityMoneyConversionFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragmentImpl_ResponseAdapter.ActivityMoneyConversionFragment INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragmentImpl_ResponseAdapter.ActivityMoneyConversionFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"sourceAmount", "targetAmount", "exchangeRate"});
        public static final int $stable = 8;

        private ActivityMoneyConversionFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.SourceAmount sourceAmount = null;
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.TargetAmount targetAmount = null;
            java.lang.Double d = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    sourceAmount = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.SourceAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragmentImpl_ResponseAdapter.SourceAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    targetAmount = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.TargetAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragmentImpl_ResponseAdapter.TargetAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    d = com.apollographql.apollo.api.Adapters.NullableDoubleAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (sourceAmount == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "sourceAmount");
                throw new kotlin.KotlinNothingValueException();
            }
            if (targetAmount != null) {
                return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment(sourceAmount, targetAmount, d);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "targetAmount");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("sourceAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragmentImpl_ResponseAdapter.SourceAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getSourceAmount());
            writer.name("targetAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragmentImpl_ResponseAdapter.TargetAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getTargetAmount());
            writer.name("exchangeRate");
            com.apollographql.apollo.api.Adapters.NullableDoubleAdapter.toJson(writer, customScalarAdapters, value.getExchangeRate());
        }
    }

    private ActivityMoneyConversionFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragmentImpl_ResponseAdapter$SourceAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment$SourceAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment$SourceAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment$SourceAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SourceAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.SourceAmount> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragmentImpl_ResponseAdapter.SourceAmount INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragmentImpl_ResponseAdapter.SourceAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private SourceAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.SourceAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment fromJson = com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragmentImpl_ResponseAdapter.ActivityMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.SourceAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.SourceAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragmentImpl_ResponseAdapter.ActivityMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getActivityMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragmentImpl_ResponseAdapter$TargetAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment$TargetAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment$TargetAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityMoneyConversionFragment$TargetAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TargetAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.TargetAmount> {
        public static final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragmentImpl_ResponseAdapter.TargetAmount INSTANCE = new com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragmentImpl_ResponseAdapter.TargetAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private TargetAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.TargetAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragment fromJson = com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragmentImpl_ResponseAdapter.ActivityMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.TargetAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyConversionFragment.TargetAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityMoneyFragmentImpl_ResponseAdapter.ActivityMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getActivityMoneyFragment());
        }
    }
}
