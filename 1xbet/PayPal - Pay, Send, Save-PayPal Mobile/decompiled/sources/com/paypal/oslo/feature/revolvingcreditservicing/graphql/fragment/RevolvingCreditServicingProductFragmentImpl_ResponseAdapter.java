package com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "RevolvingCreditServicingProductFragment", "CardDisplayLogo", "Capabilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RevolvingCreditServicingProductFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragmentImpl_ResponseAdapter$RevolvingCreditServicingProductFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RevolvingCreditServicingProductFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragmentImpl_ResponseAdapter.RevolvingCreditServicingProductFragment INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragmentImpl_ResponseAdapter.RevolvingCreditServicingProductFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"tier", "cardNetwork", "cardDisplayName", "tokenServiceProvider", "cardDisplayLogo", "locale", "currencyCode", "capabilities", "valuePropositions"});
        public static final int $stable = 8;

        private RevolvingCreditServicingProductFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
        
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment(r2, r3, r4, r5, r6, r7, r8, r9, r10);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductTier revolvingCreditProductTier = null;
            com.paypal.oslo.api.graphql.schema.type.IssuanceCardNetwork issuanceCardNetwork = null;
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider issuanceNetworkTokenServiceProvider = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.CardDisplayLogo cardDisplayLogo = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities capabilities = null;
            java.util.List list = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        revolvingCreditProductTier = (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductTier) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditProductTier_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        issuanceCardNetwork = (com.paypal.oslo.api.graphql.schema.type.IssuanceCardNetwork) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.IssuanceCardNetwork_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        issuanceNetworkTokenServiceProvider = (com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.IssuanceNetworkTokenServiceProvider_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        cardDisplayLogo = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.CardDisplayLogo) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragmentImpl_ResponseAdapter.CardDisplayLogo.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        capabilities = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragmentImpl_ResponseAdapter.Capabilities.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditProductValueProposition_ResponseAdapter.INSTANCE)).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("tier");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditProductTier_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getTier());
            writer.name("cardNetwork");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.IssuanceCardNetwork_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getCardNetwork());
            writer.name("cardDisplayName");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getCardDisplayName());
            writer.name("tokenServiceProvider");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.IssuanceNetworkTokenServiceProvider_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getTokenServiceProvider());
            writer.name("cardDisplayLogo");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragmentImpl_ResponseAdapter.CardDisplayLogo.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getCardDisplayLogo());
            writer.name("locale");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getLocale());
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name("capabilities");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragmentImpl_ResponseAdapter.Capabilities.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getCapabilities());
            writer.name("valuePropositions");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditProductValueProposition_ResponseAdapter.INSTANCE)).toJson(writer, customScalarAdapters, value.getValuePropositions());
        }
    }

    private RevolvingCreditServicingProductFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragmentImpl_ResponseAdapter$CardDisplayLogo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$CardDisplayLogo;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$CardDisplayLogo;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$CardDisplayLogo;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CardDisplayLogo implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.CardDisplayLogo> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragmentImpl_ResponseAdapter.CardDisplayLogo INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragmentImpl_ResponseAdapter.CardDisplayLogo();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private CardDisplayLogo() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.CardDisplayLogo fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment fromJson = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragmentImpl_ResponseAdapter.RevolvingCreditImageFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.CardDisplayLogo(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.CardDisplayLogo value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragmentImpl_ResponseAdapter.RevolvingCreditImageFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getRevolvingCreditImageFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragmentImpl_ResponseAdapter$Capabilities;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$Capabilities;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$Capabilities;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$Capabilities;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Capabilities implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragmentImpl_ResponseAdapter.Capabilities INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragmentImpl_ResponseAdapter.Capabilities();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"card", "creditLine", "payment"});
        public static final int $stable = 8;

        private Capabilities() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            java.util.List list2 = null;
            java.util.List list3 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditServicingCardCapability_ResponseAdapter.INSTANCE)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    list2 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditServicingLineCapability_ResponseAdapter.INSTANCE)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    list3 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditServicingPaymentCapability_ResponseAdapter.INSTANCE)).fromJson(reader, customScalarAdapters);
                } else {
                    return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities(list, list2, list3);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("card");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditServicingCardCapability_ResponseAdapter.INSTANCE)).toJson(writer, customScalarAdapters, value.getCard());
            writer.name("creditLine");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditServicingLineCapability_ResponseAdapter.INSTANCE)).toJson(writer, customScalarAdapters, value.getCreditLine());
            writer.name("payment");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditServicingPaymentCapability_ResponseAdapter.INSTANCE)).toJson(writer, customScalarAdapters, value.getPayment());
        }
    }
}
