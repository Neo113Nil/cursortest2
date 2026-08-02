package com.paypal.oslo.feature.p2p.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "PaymentPlanDisclosureFragment", "OnInsufficientFundsDisclosure", "OnQuasiCashDisclosure", "OnBankAccountEcheckDisclosure", "OnPaymentLinkAchDisclosure", "OnPaymentLinkGenericDisclosure", "OnPaymentLinkAchWithTermDisclosure", "OnPaymentLinkGenericWithTermDisclosure"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentPlanDisclosureFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragmentImpl_ResponseAdapter$PaymentPlanDisclosureFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaymentPlanDisclosureFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.PaymentPlanDisclosureFragment INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.PaymentPlanDisclosureFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private PaymentPlanDisclosureFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnInsufficientFundsDisclosure onInsufficientFundsDisclosure;
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnQuasiCashDisclosure onQuasiCashDisclosure;
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnBankAccountEcheckDisclosure onBankAccountEcheckDisclosure;
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchDisclosure onPaymentLinkAchDisclosure;
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericDisclosure onPaymentLinkGenericDisclosure;
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchWithTermDisclosure onPaymentLinkAchWithTermDisclosure;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure onPaymentLinkGenericWithTermDisclosure = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("InsufficientFundsDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onInsufficientFundsDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnInsufficientFundsDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onInsufficientFundsDisclosure = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.p2p.domain.model.Disclosure.TYPENAME_QUASI_CASH), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onQuasiCashDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnQuasiCashDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onQuasiCashDisclosure = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.p2p.domain.model.Disclosure.TYPENAME_BANK_ACCOUNT_ECHECK), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onBankAccountEcheckDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnBankAccountEcheckDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onBankAccountEcheckDisclosure = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PaymentLinkAchDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPaymentLinkAchDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkAchDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onPaymentLinkAchDisclosure = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PaymentLinkGenericDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPaymentLinkGenericDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkGenericDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onPaymentLinkGenericDisclosure = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PaymentLinkAchWithTermDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPaymentLinkAchWithTermDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkAchWithTermDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onPaymentLinkAchWithTermDisclosure = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PaymentLinkGenericWithTermDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPaymentLinkGenericWithTermDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkGenericWithTermDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment(str, onInsufficientFundsDisclosure, onQuasiCashDisclosure, onBankAccountEcheckDisclosure, onPaymentLinkAchDisclosure, onPaymentLinkGenericDisclosure, onPaymentLinkAchWithTermDisclosure, onPaymentLinkGenericWithTermDisclosure);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnInsufficientFundsDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnInsufficientFundsDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnInsufficientFundsDisclosure());
            }
            if (value.getOnQuasiCashDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnQuasiCashDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnQuasiCashDisclosure());
            }
            if (value.getOnBankAccountEcheckDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnBankAccountEcheckDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnBankAccountEcheckDisclosure());
            }
            if (value.getOnPaymentLinkAchDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkAchDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPaymentLinkAchDisclosure());
            }
            if (value.getOnPaymentLinkGenericDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkGenericDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPaymentLinkGenericDisclosure());
            }
            if (value.getOnPaymentLinkAchWithTermDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkAchWithTermDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPaymentLinkAchWithTermDisclosure());
            }
            if (value.getOnPaymentLinkGenericWithTermDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkGenericWithTermDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPaymentLinkGenericWithTermDisclosure());
            }
        }
    }

    private PaymentPlanDisclosureFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragmentImpl_ResponseAdapter$OnInsufficientFundsDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnInsufficientFundsDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnInsufficientFundsDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnInsufficientFundsDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnInsufficientFundsDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnInsufficientFundsDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnInsufficientFundsDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnInsufficientFundsDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnInsufficientFundsDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnInsufficientFundsDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnInsufficientFundsDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnInsufficientFundsDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragmentImpl_ResponseAdapter$OnQuasiCashDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnQuasiCashDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnQuasiCashDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnQuasiCashDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnQuasiCashDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnQuasiCashDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnQuasiCashDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnQuasiCashDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnQuasiCashDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnQuasiCashDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnQuasiCashDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnQuasiCashDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragmentImpl_ResponseAdapter$OnBankAccountEcheckDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnBankAccountEcheckDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnBankAccountEcheckDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnBankAccountEcheckDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnBankAccountEcheckDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnBankAccountEcheckDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnBankAccountEcheckDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnBankAccountEcheckDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnBankAccountEcheckDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnBankAccountEcheckDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnBankAccountEcheckDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnBankAccountEcheckDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragmentImpl_ResponseAdapter$OnPaymentLinkAchDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkAchDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkAchDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkAchDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPaymentLinkAchDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkAchDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkAchDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnPaymentLinkAchDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragmentImpl_ResponseAdapter$OnPaymentLinkGenericDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkGenericDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkGenericDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkGenericDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPaymentLinkGenericDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkGenericDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkGenericDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnPaymentLinkGenericDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragmentImpl_ResponseAdapter$OnPaymentLinkAchWithTermDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkAchWithTermDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkAchWithTermDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkAchWithTermDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPaymentLinkAchWithTermDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchWithTermDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkAchWithTermDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkAchWithTermDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnPaymentLinkAchWithTermDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchWithTermDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchWithTermDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkAchWithTermDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragmentImpl_ResponseAdapter$OnPaymentLinkGenericWithTermDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkGenericWithTermDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkGenericWithTermDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PaymentPlanDisclosureFragment$OnPaymentLinkGenericWithTermDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPaymentLinkGenericWithTermDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkGenericWithTermDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkGenericWithTermDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnPaymentLinkGenericWithTermDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PaymentPlanDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }
}
