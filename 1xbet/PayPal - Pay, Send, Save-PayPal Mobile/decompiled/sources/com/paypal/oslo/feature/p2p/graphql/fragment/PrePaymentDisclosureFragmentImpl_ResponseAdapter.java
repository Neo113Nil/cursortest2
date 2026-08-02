package com.paypal.oslo.feature.p2p.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "PrePaymentDisclosureFragment", "OnPaymentCannotBeReversedDisclosure", "OnConfirmPurchaseTransactionDisclosure", "OnPrePaymentRemittanceDisclosure", "OnForeignTaxDisclosure", "OnPaymentHoldDisclosure", "OnStateMandatedFraudulentActivityDisclosure", "OnDelayedDebitDisclosure", "OnPaymentLinkAchDisclosure", "OnPaymentLinkGenericDisclosure", "OnPaymentLinkAchWithTermDisclosure", "OnPaymentLinkGenericWithTermDisclosure", "OnUnilateralRecipientDisclosure"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PrePaymentDisclosureFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragmentImpl_ResponseAdapter$PrePaymentDisclosureFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PrePaymentDisclosureFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.PrePaymentDisclosureFragment INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.PrePaymentDisclosureFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private PrePaymentDisclosureFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentCannotBeReversedDisclosure onPaymentCannotBeReversedDisclosure;
            com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnConfirmPurchaseTransactionDisclosure onConfirmPurchaseTransactionDisclosure;
            com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPrePaymentRemittanceDisclosure onPrePaymentRemittanceDisclosure;
            com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnForeignTaxDisclosure onForeignTaxDisclosure;
            com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentHoldDisclosure onPaymentHoldDisclosure;
            com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnStateMandatedFraudulentActivityDisclosure onStateMandatedFraudulentActivityDisclosure;
            com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnDelayedDebitDisclosure onDelayedDebitDisclosure;
            com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkAchDisclosure onPaymentLinkAchDisclosure;
            com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkGenericDisclosure onPaymentLinkGenericDisclosure;
            com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkAchWithTermDisclosure onPaymentLinkAchWithTermDisclosure;
            com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure onPaymentLinkGenericWithTermDisclosure;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnUnilateralRecipientDisclosure onUnilateralRecipientDisclosure = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PaymentCannotBeReversedDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPaymentCannotBeReversedDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentCannotBeReversedDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onPaymentCannotBeReversedDisclosure = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("ConfirmPurchaseTransactionDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onConfirmPurchaseTransactionDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnConfirmPurchaseTransactionDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onConfirmPurchaseTransactionDisclosure = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PrePaymentRemittanceDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPrePaymentRemittanceDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPrePaymentRemittanceDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onPrePaymentRemittanceDisclosure = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes(com.paypal.oslo.feature.p2p.domain.model.Disclosure.TYPENAME_FOREIGN_TAX_DISCLOSURE), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onForeignTaxDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnForeignTaxDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onForeignTaxDisclosure = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PaymentHoldDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPaymentHoldDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentHoldDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onPaymentHoldDisclosure = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("StateMandatedFraudulentActivityDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onStateMandatedFraudulentActivityDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnStateMandatedFraudulentActivityDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onStateMandatedFraudulentActivityDisclosure = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("DelayedDebitDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onDelayedDebitDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnDelayedDebitDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onDelayedDebitDisclosure = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PaymentLinkAchDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPaymentLinkAchDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkAchDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onPaymentLinkAchDisclosure = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PaymentLinkGenericDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPaymentLinkGenericDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkGenericDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onPaymentLinkGenericDisclosure = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PaymentLinkAchWithTermDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPaymentLinkAchWithTermDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkAchWithTermDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onPaymentLinkAchWithTermDisclosure = null;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkAchWithTermDisclosure onPaymentLinkAchWithTermDisclosure2 = onPaymentLinkAchWithTermDisclosure;
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PaymentLinkGenericWithTermDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPaymentLinkGenericWithTermDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkGenericWithTermDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onPaymentLinkGenericWithTermDisclosure = null;
            }
            com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure onPaymentLinkGenericWithTermDisclosure2 = onPaymentLinkGenericWithTermDisclosure;
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("UnilateralRecipientDisclosure"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onUnilateralRecipientDisclosure = com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnUnilateralRecipientDisclosure.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment(str, onPaymentCannotBeReversedDisclosure, onConfirmPurchaseTransactionDisclosure, onPrePaymentRemittanceDisclosure, onForeignTaxDisclosure, onPaymentHoldDisclosure, onStateMandatedFraudulentActivityDisclosure, onDelayedDebitDisclosure, onPaymentLinkAchDisclosure, onPaymentLinkGenericDisclosure, onPaymentLinkAchWithTermDisclosure2, onPaymentLinkGenericWithTermDisclosure2, onUnilateralRecipientDisclosure);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnPaymentCannotBeReversedDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentCannotBeReversedDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPaymentCannotBeReversedDisclosure());
            }
            if (value.getOnConfirmPurchaseTransactionDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnConfirmPurchaseTransactionDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnConfirmPurchaseTransactionDisclosure());
            }
            if (value.getOnPrePaymentRemittanceDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPrePaymentRemittanceDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPrePaymentRemittanceDisclosure());
            }
            if (value.getOnForeignTaxDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnForeignTaxDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnForeignTaxDisclosure());
            }
            if (value.getOnPaymentHoldDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentHoldDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPaymentHoldDisclosure());
            }
            if (value.getOnStateMandatedFraudulentActivityDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnStateMandatedFraudulentActivityDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnStateMandatedFraudulentActivityDisclosure());
            }
            if (value.getOnDelayedDebitDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnDelayedDebitDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnDelayedDebitDisclosure());
            }
            if (value.getOnPaymentLinkAchDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkAchDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPaymentLinkAchDisclosure());
            }
            if (value.getOnPaymentLinkGenericDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkGenericDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPaymentLinkGenericDisclosure());
            }
            if (value.getOnPaymentLinkAchWithTermDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkAchWithTermDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPaymentLinkAchWithTermDisclosure());
            }
            if (value.getOnPaymentLinkGenericWithTermDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkGenericWithTermDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPaymentLinkGenericWithTermDisclosure());
            }
            if (value.getOnUnilateralRecipientDisclosure() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnUnilateralRecipientDisclosure.INSTANCE.toJson(writer, customScalarAdapters, value.getOnUnilateralRecipientDisclosure());
            }
        }
    }

    private PrePaymentDisclosureFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragmentImpl_ResponseAdapter$OnPaymentCannotBeReversedDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnPaymentCannotBeReversedDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnPaymentCannotBeReversedDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnPaymentCannotBeReversedDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPaymentCannotBeReversedDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentCannotBeReversedDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentCannotBeReversedDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentCannotBeReversedDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnPaymentCannotBeReversedDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentCannotBeReversedDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentCannotBeReversedDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentCannotBeReversedDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragmentImpl_ResponseAdapter$OnConfirmPurchaseTransactionDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnConfirmPurchaseTransactionDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnConfirmPurchaseTransactionDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnConfirmPurchaseTransactionDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnConfirmPurchaseTransactionDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnConfirmPurchaseTransactionDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnConfirmPurchaseTransactionDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnConfirmPurchaseTransactionDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnConfirmPurchaseTransactionDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnConfirmPurchaseTransactionDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnConfirmPurchaseTransactionDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnConfirmPurchaseTransactionDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragmentImpl_ResponseAdapter$OnPrePaymentRemittanceDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnPrePaymentRemittanceDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnPrePaymentRemittanceDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnPrePaymentRemittanceDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPrePaymentRemittanceDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPrePaymentRemittanceDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPrePaymentRemittanceDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPrePaymentRemittanceDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnPrePaymentRemittanceDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPrePaymentRemittanceDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPrePaymentRemittanceDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPrePaymentRemittanceDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragmentImpl_ResponseAdapter$OnForeignTaxDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnForeignTaxDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnForeignTaxDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnForeignTaxDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnForeignTaxDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnForeignTaxDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnForeignTaxDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnForeignTaxDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnForeignTaxDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnForeignTaxDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnForeignTaxDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnForeignTaxDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragmentImpl_ResponseAdapter$OnPaymentHoldDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnPaymentHoldDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnPaymentHoldDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnPaymentHoldDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPaymentHoldDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentHoldDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentHoldDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentHoldDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"priority", "holdDuration"});
        public static final int $stable = 8;

        private OnPaymentHoldDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentHoldDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
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
                    return new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentHoldDisclosure(intValue, obj);
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, "holdDuration");
                throw new kotlin.KotlinNothingValueException();
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentHoldDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
            writer.name("holdDuration");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getHoldDuration());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragmentImpl_ResponseAdapter$OnStateMandatedFraudulentActivityDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnStateMandatedFraudulentActivityDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnStateMandatedFraudulentActivityDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnStateMandatedFraudulentActivityDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnStateMandatedFraudulentActivityDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnStateMandatedFraudulentActivityDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnStateMandatedFraudulentActivityDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnStateMandatedFraudulentActivityDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnStateMandatedFraudulentActivityDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnStateMandatedFraudulentActivityDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnStateMandatedFraudulentActivityDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnStateMandatedFraudulentActivityDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragmentImpl_ResponseAdapter$OnDelayedDebitDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnDelayedDebitDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnDelayedDebitDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnDelayedDebitDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnDelayedDebitDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnDelayedDebitDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnDelayedDebitDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnDelayedDebitDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"priority", "maxDuration"});
        public static final int $stable = 8;

        private OnDelayedDebitDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnDelayedDebitDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
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
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnDelayedDebitDisclosure(num.intValue(), obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnDelayedDebitDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
            writer.name("maxDuration");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getMaxDuration());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragmentImpl_ResponseAdapter$OnPaymentLinkAchDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnPaymentLinkAchDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnPaymentLinkAchDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnPaymentLinkAchDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPaymentLinkAchDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkAchDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkAchDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkAchDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnPaymentLinkAchDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkAchDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkAchDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkAchDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragmentImpl_ResponseAdapter$OnPaymentLinkGenericDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnPaymentLinkGenericDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnPaymentLinkGenericDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnPaymentLinkGenericDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPaymentLinkGenericDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkGenericDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkGenericDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkGenericDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnPaymentLinkGenericDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkGenericDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkGenericDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkGenericDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragmentImpl_ResponseAdapter$OnPaymentLinkAchWithTermDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnPaymentLinkAchWithTermDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnPaymentLinkAchWithTermDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnPaymentLinkAchWithTermDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPaymentLinkAchWithTermDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkAchWithTermDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkAchWithTermDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkAchWithTermDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnPaymentLinkAchWithTermDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkAchWithTermDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkAchWithTermDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkAchWithTermDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragmentImpl_ResponseAdapter$OnPaymentLinkGenericWithTermDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnPaymentLinkGenericWithTermDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnPaymentLinkGenericWithTermDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnPaymentLinkGenericWithTermDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPaymentLinkGenericWithTermDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkGenericWithTermDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnPaymentLinkGenericWithTermDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnPaymentLinkGenericWithTermDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnPaymentLinkGenericWithTermDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragmentImpl_ResponseAdapter$OnUnilateralRecipientDisclosure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnUnilateralRecipientDisclosure;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnUnilateralRecipientDisclosure;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PrePaymentDisclosureFragment$OnUnilateralRecipientDisclosure;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnUnilateralRecipientDisclosure implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnUnilateralRecipientDisclosure> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnUnilateralRecipientDisclosure INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragmentImpl_ResponseAdapter.OnUnilateralRecipientDisclosure();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("priority");
        public static final int $stable = 8;

        private OnUnilateralRecipientDisclosure() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnUnilateralRecipientDisclosure fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.IntAdapter.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnUnilateralRecipientDisclosure(num.intValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "priority");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PrePaymentDisclosureFragment.OnUnilateralRecipientDisclosure value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("priority");
            com.apollographql.apollo.api.Adapters.IntAdapter.toJson(writer, customScalarAdapters, java.lang.Integer.valueOf(value.getPriority()));
        }
    }
}
