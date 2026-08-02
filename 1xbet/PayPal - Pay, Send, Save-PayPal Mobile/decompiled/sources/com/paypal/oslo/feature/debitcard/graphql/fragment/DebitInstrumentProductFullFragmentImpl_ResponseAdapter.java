package com.paypal.oslo.feature.debitcard.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "DebitInstrumentProductFullFragment", "SmallImage", com.knotapi.knot.utilities.Constants.META_BACK_BUTTON, "Front", "PhysicalCardOrderProgressCardArt", "ActionUrls", "IssuanceConfig"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitInstrumentProductFullFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragmentImpl_ResponseAdapter$DebitInstrumentProductFullFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DebitInstrumentProductFullFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment> {
        public static final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.DebitInstrumentProductFullFragment INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.DebitInstrumentProductFullFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"__typename", "smallImage", "physicalCardOrderProgressCardArt", "learnMoreUrl", "faqUrl", "helpUrl", "cardHolderAgreementUrl", "virtualCardHolderAgreementUrl", "privacyPolicyUrl", "feeUrl", "actionUrls", "tags", "availableActions", "brand", "capabilities", "maxAdditionalCardsAllowed", "issuanceConfig"});
        public static final int $stable = 8;

        private DebitInstrumentProductFullFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0029. Please report as an issue. */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            java.lang.Object obj;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.ActionUrls actionUrls;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.SmallImage smallImage = null;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.PhysicalCardOrderProgressCardArt physicalCardOrderProgressCardArt = null;
            java.lang.Object obj2 = null;
            java.lang.Object obj3 = null;
            java.lang.Object obj4 = null;
            java.lang.Object obj5 = null;
            java.lang.Object obj6 = null;
            java.lang.Object obj7 = null;
            java.lang.Object obj8 = null;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.ActionUrls actionUrls2 = null;
            java.util.List list = null;
            java.util.List list2 = null;
            com.paypal.oslo.api.graphql.schema.type.CardBrand cardBrand = null;
            java.util.List list3 = null;
            java.lang.Integer num = null;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.IssuanceConfig issuanceConfig = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        actionUrls2 = actionUrls2;
                    case 1:
                        obj = obj8;
                        actionUrls = actionUrls2;
                        smallImage = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.SmallImage) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.SmallImage.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        actionUrls2 = actionUrls;
                        obj8 = obj;
                    case 2:
                        obj = obj8;
                        actionUrls = actionUrls2;
                        physicalCardOrderProgressCardArt = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.PhysicalCardOrderProgressCardArt) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.PhysicalCardOrderProgressCardArt.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        actionUrls2 = actionUrls;
                        obj8 = obj;
                    case 3:
                        obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                    case 4:
                        obj3 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                    case 5:
                        obj4 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                    case 6:
                        obj5 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                    case 7:
                        obj6 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                    case 8:
                        obj7 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                    case 9:
                        obj8 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                    case 10:
                        obj = obj8;
                        actionUrls2 = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.ActionUrls) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.ActionUrls.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        obj8 = obj;
                    case 11:
                        list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).fromJson(reader, customScalarAdapters);
                    case 12:
                        list2 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentServicingAction_ResponseAdapter.INSTANCE)).fromJson(reader, customScalarAdapters);
                    case 13:
                        cardBrand = (com.paypal.oslo.api.graphql.schema.type.CardBrand) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.CardBrand_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                    case 14:
                        list3 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentCapability_ResponseAdapter.INSTANCE)).fromJson(reader, customScalarAdapters);
                    case 15:
                        num = com.apollographql.apollo.api.Adapters.NullableIntAdapter.fromJson(reader, customScalarAdapters);
                    case 16:
                        obj = obj8;
                        actionUrls = actionUrls2;
                        issuanceConfig = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.IssuanceConfig) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.IssuanceConfig.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        actionUrls2 = actionUrls;
                        obj8 = obj;
                }
                java.lang.Object obj9 = obj8;
                com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.ActionUrls actionUrls3 = actionUrls2;
                reader.rewind();
                com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductCoreFragment fromJson = com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductCoreFragmentImpl_ResponseAdapter.DebitInstrumentProductCoreFragment.INSTANCE.fromJson(reader, customScalarAdapters);
                if (str == null) {
                    com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (list != null) {
                    return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment(str, smallImage, physicalCardOrderProgressCardArt, obj2, obj3, obj4, obj5, obj6, obj7, obj9, actionUrls3, list, list2, cardBrand, list3, num, issuanceConfig, fromJson);
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, "tags");
                throw new kotlin.KotlinNothingValueException();
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            writer.name("smallImage");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.SmallImage.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getSmallImage());
            writer.name("physicalCardOrderProgressCardArt");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.PhysicalCardOrderProgressCardArt.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getPhysicalCardOrderProgressCardArt());
            writer.name("learnMoreUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getLearnMoreUrl());
            writer.name("faqUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getFaqUrl());
            writer.name("helpUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getHelpUrl());
            writer.name("cardHolderAgreementUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getCardHolderAgreementUrl());
            writer.name("virtualCardHolderAgreementUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getVirtualCardHolderAgreementUrl());
            writer.name("privacyPolicyUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getPrivacyPolicyUrl());
            writer.name("feeUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getFeeUrl());
            writer.name("actionUrls");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.ActionUrls.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getActionUrls());
            writer.name("tags");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).toJson(writer, customScalarAdapters, (java.util.List) value.getTags());
            writer.name("availableActions");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentServicingAction_ResponseAdapter.INSTANCE)).toJson(writer, customScalarAdapters, value.getAvailableActions());
            writer.name("brand");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.CardBrand_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getBrand());
            writer.name("capabilities");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentCapability_ResponseAdapter.INSTANCE)).toJson(writer, customScalarAdapters, value.getCapabilities());
            writer.name("maxAdditionalCardsAllowed");
            com.apollographql.apollo.api.Adapters.NullableIntAdapter.toJson(writer, customScalarAdapters, value.getMaxAdditionalCardsAllowed());
            writer.name("issuanceConfig");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.IssuanceConfig.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getIssuanceConfig());
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductCoreFragmentImpl_ResponseAdapter.DebitInstrumentProductCoreFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getDebitInstrumentProductCoreFragment());
        }
    }

    private DebitInstrumentProductFullFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragmentImpl_ResponseAdapter$SmallImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment$SmallImage;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment$SmallImage;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment$SmallImage;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SmallImage implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.SmallImage> {
        public static final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.SmallImage INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.SmallImage();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"back", "front"});
        public static final int $stable = 8;

        private SmallImage() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.SmallImage fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.Back back = null;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.Front front = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    back = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.Back) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.Back.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    front = (com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.Front) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.Front.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                }
            }
            if (back == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "back");
                throw new kotlin.KotlinNothingValueException();
            }
            if (front != null) {
                return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.SmallImage(back, front);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "front");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.SmallImage value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("back");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.Back.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getBack());
            writer.name("front");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.Front.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getFront());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragmentImpl_ResponseAdapter$Back;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment$Back;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment$Back;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment$Back;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Back implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.Back> {
        public static final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.Back INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.Back();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "referenceUrl"});
        public static final int $stable = 8;

        private Back() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.Back fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    obj2 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj2 != null) {
                return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.Back(obj, obj2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "referenceUrl");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.Back value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE);
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getContentType());
            writer.name("referenceUrl");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getReferenceUrl());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragmentImpl_ResponseAdapter$Front;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment$Front;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment$Front;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment$Front;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Front implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.Front> {
        public static final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.Front INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.Front();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "referenceUrl"});
        public static final int $stable = 8;

        private Front() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.Front fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    obj2 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj2 != null) {
                return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.Front(obj, obj2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "referenceUrl");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.Front value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE);
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getContentType());
            writer.name("referenceUrl");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getReferenceUrl());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragmentImpl_ResponseAdapter$PhysicalCardOrderProgressCardArt;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment$PhysicalCardOrderProgressCardArt;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment$PhysicalCardOrderProgressCardArt;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment$PhysicalCardOrderProgressCardArt;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PhysicalCardOrderProgressCardArt implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.PhysicalCardOrderProgressCardArt> {
        public static final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.PhysicalCardOrderProgressCardArt INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.PhysicalCardOrderProgressCardArt();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "referenceUrl"});
        public static final int $stable = 8;

        private PhysicalCardOrderProgressCardArt() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.PhysicalCardOrderProgressCardArt fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    obj2 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj2 != null) {
                return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.PhysicalCardOrderProgressCardArt(obj, obj2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "referenceUrl");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.PhysicalCardOrderProgressCardArt value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE);
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getContentType());
            writer.name("referenceUrl");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getReferenceUrl());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragmentImpl_ResponseAdapter$ActionUrls;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment$ActionUrls;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment$ActionUrls;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment$ActionUrls;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActionUrls implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.ActionUrls> {
        public static final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.ActionUrls INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.ActionUrls();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"activateCard", "learnMore", "faq", "reportCardLost"});
        public static final int $stable = 8;

        private ActionUrls() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.ActionUrls fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            java.lang.Object obj3 = null;
            java.lang.Object obj4 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    obj3 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    obj4 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.ActionUrls(obj, obj2, obj3, obj4);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.ActionUrls value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("activateCard");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getActivateCard());
            writer.name("learnMore");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getLearnMore());
            writer.name("faq");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getFaq());
            writer.name("reportCardLost");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getReportCardLost());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragmentImpl_ResponseAdapter$IssuanceConfig;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment$IssuanceConfig;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment$IssuanceConfig;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentProductFullFragment$IssuanceConfig;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class IssuanceConfig implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.IssuanceConfig> {
        public static final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.IssuanceConfig INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragmentImpl_ResponseAdapter.IssuanceConfig();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"defaultDebitIssuanceFormFactor", "allowFormFactorChoice", "formFactors"});
        public static final int $stable = 8;

        private IssuanceConfig() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.IssuanceConfig fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFormFactor debitInstrumentFormFactor = null;
            java.lang.Boolean bool = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    debitInstrumentFormFactor = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFormFactor) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentFormFactor_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    bool = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentFormFactor_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                }
            }
            if (list != null) {
                return new com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.IssuanceConfig(debitInstrumentFormFactor, bool, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "formFactors");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment.IssuanceConfig value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("defaultDebitIssuanceFormFactor");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentFormFactor_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getDefaultDebitIssuanceFormFactor());
            writer.name("allowFormFactorChoice");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getAllowFormFactorChoice());
            writer.name("formFactors");
            com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.DebitInstrumentFormFactor_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, (java.util.List) value.getFormFactors());
        }
    }
}
