package com.paypal.oslo.feature.bnplservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlanOverviewVirtualCardFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "BnplServicingPlanOverviewVirtualCardFragment", "CardArt"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BnplServicingPlanOverviewVirtualCardFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlanOverviewVirtualCardFragmentImpl_ResponseAdapter$BnplServicingPlanOverviewVirtualCardFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlanOverviewVirtualCardFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlanOverviewVirtualCardFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlanOverviewVirtualCardFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BnplServicingPlanOverviewVirtualCardFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragment> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragmentImpl_ResponseAdapter.BnplServicingPlanOverviewVirtualCardFragment INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragmentImpl_ResponseAdapter.BnplServicingPlanOverviewVirtualCardFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"cardArt", "validityDuration", "primaryAccountNumber", "expirationDate", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "lastNChars"});
        public static final int $stable = 8;

        private BnplServicingPlanOverviewVirtualCardFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragment.CardArt cardArt = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            java.lang.Object obj3 = null;
            java.lang.String str = null;
            java.lang.Object obj4 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    cardArt = (com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragment.CardArt) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragmentImpl_ResponseAdapter.CardArt.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    obj3 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 4) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 5) {
                        break;
                    }
                    obj4 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (cardArt == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "cardArt");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "validityDuration");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj4 != null) {
                return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragment(cardArt, obj, obj2, obj3, str, obj4);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "lastNChars");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("cardArt");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragmentImpl_ResponseAdapter.CardArt.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getCardArt());
            writer.name("validityDuration");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getValidityDuration());
            writer.name("primaryAccountNumber");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getPrimaryAccountNumber());
            writer.name("expirationDate");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getExpirationDate());
            writer.name(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv);
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getCvv());
            writer.name("lastNChars");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getLastNChars());
        }
    }

    private BnplServicingPlanOverviewVirtualCardFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlanOverviewVirtualCardFragmentImpl_ResponseAdapter$CardArt;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlanOverviewVirtualCardFragment$CardArt;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlanOverviewVirtualCardFragment$CardArt;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlanOverviewVirtualCardFragment$CardArt;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CardArt implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragment.CardArt> {
        public static final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragmentImpl_ResponseAdapter.CardArt INSTANCE = new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragmentImpl_ResponseAdapter.CardArt();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"url", "thumbnailUrl"});
        public static final int $stable = 8;

        private CardArt() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragment.CardArt fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragment.CardArt(obj, obj2);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragment.CardArt value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("url");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getUrl());
            writer.name("thumbnailUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getThumbnailUrl());
        }
    }
}
