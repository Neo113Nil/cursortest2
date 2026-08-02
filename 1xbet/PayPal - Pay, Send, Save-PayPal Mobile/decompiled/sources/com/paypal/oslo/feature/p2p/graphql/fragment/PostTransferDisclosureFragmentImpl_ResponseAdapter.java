package com.paypal.oslo.feature.p2p.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "PostTransferDisclosureFragment", "OnPaymentLinkDisclosure", "OnReceiverSignupDisclosure", "OnRegulatoryReviewDisclosure", "OnPostTransferPaymentHoldDisclosure", "OnReceiverPreferenceDisclosure", "OnInstantPaymentProcessedDisclosure"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PostTransferDisclosureFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragmentImpl_ResponseAdapter$PostTransferDisclosureFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PostTransferDisclosureFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.PostTransferDisclosureFragment INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.PostTransferDisclosureFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private PostTransferDisclosureFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnPaymentLinkDisclosure onPaymentLinkDisclosure;
            com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnReceiverSignupDisclosure onReceiverSignupDisclosure;
            com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnRegulatoryReviewDisclosure onRegulatoryReviewDisclosure;
            com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnPostTransferPaymentHoldDisclosure onPostTransferPaymentHoldDisclosure;
            com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnReceiverPreferenceDisclosure onReceiverPreferenceDisclosure;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnInstantPaymentProcessedDisclosure onInstantPaymentProcessedDisclosure = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PaymentLinkDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPaymentLinkDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onPaymentLinkDisclosure = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("ReceiverSignupDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onReceiverSignupDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnReceiverSignupDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onReceiverSignupDisclosure = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("RegulatoryReviewDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onRegulatoryReviewDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnRegulatoryReviewDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onRegulatoryReviewDisclosure = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PostTransferPaymentHoldDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPostTransferPaymentHoldDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnPostTransferPaymentHoldDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onPostTransferPaymentHoldDisclosure = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("ReceiverPreferenceDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onReceiverPreferenceDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnReceiverPreferenceDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onReceiverPreferenceDisclosure = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("InstantPaymentProcessedDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onInstantPaymentProcessedDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnInstantPaymentProcessedDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment(str, onPaymentLinkDisclosure, onReceiverSignupDisclosure, onRegulatoryReviewDisclosure, onPostTransferPaymentHoldDisclosure, onReceiverPreferenceDisclosure, onInstantPaymentProcessedDisclosure);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnPaymentLinkDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPaymentLinkDisclosure());
            }
            if (value.getOnReceiverSignupDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnReceiverSignupDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnReceiverSignupDisclosure());
            }
            if (value.getOnRegulatoryReviewDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnRegulatoryReviewDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRegulatoryReviewDisclosure());
            }
            if (value.getOnPostTransferPaymentHoldDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnPostTransferPaymentHoldDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPostTransferPaymentHoldDisclosure());
            }
            if (value.getOnReceiverPreferenceDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnReceiverPreferenceDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnReceiverPreferenceDisclosure());
            }
            if (value.getOnInstantPaymentProcessedDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnInstantPaymentProcessedDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnInstantPaymentProcessedDisclosure());
            }
        }
    }

    private PostTransferDisclosureFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragmentImpl_ResponseAdapter$OnPaymentLinkDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment$OnPaymentLinkDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment$OnPaymentLinkDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment$OnPaymentLinkDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPaymentLinkDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnPaymentLinkDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"priority", "expiryTime"});
        public static final int $stable = 8;

        private OnPaymentLinkDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnPaymentLinkDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (num != null) {
                int intValue = num.intValue();
                if (obj != null) {
                    return new com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnPaymentLinkDisclosure(intValue, obj);
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, "expiryTime");
                throw new kotlin.KotlinNothingValueException();
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnPaymentLinkDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
            writer.name("expiryTime");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getExpiryTime());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragmentImpl_ResponseAdapter$OnReceiverSignupDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment$OnReceiverSignupDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment$OnReceiverSignupDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment$OnReceiverSignupDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnReceiverSignupDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnReceiverSignupDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnReceiverSignupDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnReceiverSignupDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnReceiverSignupDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnReceiverSignupDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnReceiverSignupDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnReceiverSignupDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragmentImpl_ResponseAdapter$OnRegulatoryReviewDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment$OnRegulatoryReviewDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment$OnRegulatoryReviewDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment$OnRegulatoryReviewDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnRegulatoryReviewDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnRegulatoryReviewDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnRegulatoryReviewDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnRegulatoryReviewDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnRegulatoryReviewDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnRegulatoryReviewDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnRegulatoryReviewDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnRegulatoryReviewDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragmentImpl_ResponseAdapter$OnPostTransferPaymentHoldDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment$OnPostTransferPaymentHoldDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment$OnPostTransferPaymentHoldDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment$OnPostTransferPaymentHoldDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPostTransferPaymentHoldDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnPostTransferPaymentHoldDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnPostTransferPaymentHoldDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnPostTransferPaymentHoldDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnPostTransferPaymentHoldDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnPostTransferPaymentHoldDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnPostTransferPaymentHoldDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnPostTransferPaymentHoldDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragmentImpl_ResponseAdapter$OnReceiverPreferenceDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment$OnReceiverPreferenceDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment$OnReceiverPreferenceDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment$OnReceiverPreferenceDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnReceiverPreferenceDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnReceiverPreferenceDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnReceiverPreferenceDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnReceiverPreferenceDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnReceiverPreferenceDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnReceiverPreferenceDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnReceiverPreferenceDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnReceiverPreferenceDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragmentImpl_ResponseAdapter$OnInstantPaymentProcessedDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment$OnInstantPaymentProcessedDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment$OnInstantPaymentProcessedDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PostTransferDisclosureFragment$OnInstantPaymentProcessedDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnInstantPaymentProcessedDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnInstantPaymentProcessedDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnInstantPaymentProcessedDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragmentImpl_ResponseAdapter.OnInstantPaymentProcessedDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnInstantPaymentProcessedDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnInstantPaymentProcessedDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnInstantPaymentProcessedDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PostTransferDisclosureFragment.OnInstantPaymentProcessedDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }
}
