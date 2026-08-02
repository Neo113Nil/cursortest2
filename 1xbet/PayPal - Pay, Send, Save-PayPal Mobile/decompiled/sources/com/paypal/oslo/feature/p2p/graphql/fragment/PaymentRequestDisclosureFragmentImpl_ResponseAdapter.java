package com.paypal.oslo.feature.p2p.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentRequestDisclosureFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "PaymentRequestDisclosureFragment", "OnPaymentLinkDisclosure", "OnPaymentLinkSecurityWarningDisclosure"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentRequestDisclosureFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentRequestDisclosureFragmentImpl_ResponseAdapter$PaymentRequestDisclosureFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentRequestDisclosureFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentRequestDisclosureFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentRequestDisclosureFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaymentRequestDisclosureFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragmentImpl_ResponseAdapter.PaymentRequestDisclosureFragment INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragmentImpl_ResponseAdapter.PaymentRequestDisclosureFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private PaymentRequestDisclosureFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment.OnPaymentLinkDisclosure onPaymentLinkDisclosure;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment.OnPaymentLinkSecurityWarningDisclosure onPaymentLinkSecurityWarningDisclosure = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PaymentLinkDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPaymentLinkDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onPaymentLinkDisclosure = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PaymentLinkSecurityWarningDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPaymentLinkSecurityWarningDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkSecurityWarningDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment(str, onPaymentLinkDisclosure, onPaymentLinkSecurityWarningDisclosure);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnPaymentLinkDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPaymentLinkDisclosure());
            }
            if (value.getOnPaymentLinkSecurityWarningDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkSecurityWarningDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPaymentLinkSecurityWarningDisclosure());
            }
        }
    }

    private PaymentRequestDisclosureFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentRequestDisclosureFragmentImpl_ResponseAdapter$OnPaymentLinkDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentRequestDisclosureFragment$OnPaymentLinkDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentRequestDisclosureFragment$OnPaymentLinkDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentRequestDisclosureFragment$OnPaymentLinkDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPaymentLinkDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment.OnPaymentLinkDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"priority", "expiryTime"});
        public static final int $stable = 8;

        private OnPaymentLinkDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment.OnPaymentLinkDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
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
                    return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment.OnPaymentLinkDisclosure(intValue, obj);
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, "expiryTime");
                throw new kotlin.KotlinNothingValueException();
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment.OnPaymentLinkDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
            writer.name("expiryTime");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getExpiryTime());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentRequestDisclosureFragmentImpl_ResponseAdapter$OnPaymentLinkSecurityWarningDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentRequestDisclosureFragment$OnPaymentLinkSecurityWarningDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentRequestDisclosureFragment$OnPaymentLinkSecurityWarningDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentRequestDisclosureFragment$OnPaymentLinkSecurityWarningDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPaymentLinkSecurityWarningDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment.OnPaymentLinkSecurityWarningDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkSecurityWarningDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkSecurityWarningDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"priority", "email", "expiryTime", "scamUrl"});
        public static final int $stable = 8;

        private OnPaymentLinkSecurityWarningDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment.OnPaymentLinkSecurityWarningDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            java.lang.Object obj3 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    obj2 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    obj3 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (num != null) {
                int intValue = num.intValue();
                if (obj == null) {
                    com.apollographql.apollo.api.Assertions.missingField(reader, "email");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (obj2 == null) {
                    com.apollographql.apollo.api.Assertions.missingField(reader, "expiryTime");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (obj3 != null) {
                    return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment.OnPaymentLinkSecurityWarningDisclosure(intValue, obj, obj2, obj3);
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, "scamUrl");
                throw new kotlin.KotlinNothingValueException();
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentRequestDisclosureFragment.OnPaymentLinkSecurityWarningDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
            writer.name("email");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getEmail());
            writer.name("expiryTime");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getExpiryTime());
            writer.name("scamUrl");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getScamUrl());
        }
    }
}
