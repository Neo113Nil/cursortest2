package com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "StarPayWalletProvisioningFragment", "PrimaryDeviceEligibility", "OnRevolvingCreditPushProvisioningEligible", "OnRevolvingCreditPushProvisioningIneligible", "ProvisionedToken", "Component"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StarPayWalletProvisioningFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragmentImpl_ResponseAdapter$StarPayWalletProvisioningFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StarPayWalletProvisioningFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.StarPayWalletProvisioningFragment INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.StarPayWalletProvisioningFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"primaryDeviceEligibility", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT});
        public static final int $stable = 8;

        private StarPayWalletProvisioningFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.PrimaryDeviceEligibility primaryDeviceEligibility = null;
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.Component component = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    primaryDeviceEligibility = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.PrimaryDeviceEligibility) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.PrimaryDeviceEligibility.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    component = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.Component) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.Component.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                }
            }
            if (primaryDeviceEligibility == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "primaryDeviceEligibility");
                throw new kotlin.KotlinNothingValueException();
            }
            if (component != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment(primaryDeviceEligibility, component);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("primaryDeviceEligibility");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.PrimaryDeviceEligibility.INSTANCE, true).toJson(writer, customScalarAdapters, value.getPrimaryDeviceEligibility());
            writer.name(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT);
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.Component.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getComponent());
        }
    }

    private StarPayWalletProvisioningFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragmentImpl_ResponseAdapter$PrimaryDeviceEligibility;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$PrimaryDeviceEligibility;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$PrimaryDeviceEligibility;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$PrimaryDeviceEligibility;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PrimaryDeviceEligibility implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.PrimaryDeviceEligibility> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.PrimaryDeviceEligibility INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.PrimaryDeviceEligibility();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private PrimaryDeviceEligibility() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.PrimaryDeviceEligibility fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningEligible onRevolvingCreditPushProvisioningEligible;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningIneligible onRevolvingCreditPushProvisioningIneligible = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("RevolvingCreditPushProvisioningEligible"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onRevolvingCreditPushProvisioningEligible = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.OnRevolvingCreditPushProvisioningEligible.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onRevolvingCreditPushProvisioningEligible = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("RevolvingCreditPushProvisioningIneligible"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onRevolvingCreditPushProvisioningIneligible = com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.OnRevolvingCreditPushProvisioningIneligible.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.PrimaryDeviceEligibility(str, onRevolvingCreditPushProvisioningEligible, onRevolvingCreditPushProvisioningIneligible);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.PrimaryDeviceEligibility value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnRevolvingCreditPushProvisioningEligible() != null) {
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.OnRevolvingCreditPushProvisioningEligible.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRevolvingCreditPushProvisioningEligible());
            }
            if (value.getOnRevolvingCreditPushProvisioningIneligible() != null) {
                com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.OnRevolvingCreditPushProvisioningIneligible.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRevolvingCreditPushProvisioningIneligible());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragmentImpl_ResponseAdapter$OnRevolvingCreditPushProvisioningEligible;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$OnRevolvingCreditPushProvisioningEligible;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$OnRevolvingCreditPushProvisioningEligible;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$OnRevolvingCreditPushProvisioningEligible;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnRevolvingCreditPushProvisioningEligible implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningEligible> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.OnRevolvingCreditPushProvisioningEligible INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.OnRevolvingCreditPushProvisioningEligible();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("eligibleReason");
        public static final int $stable = 8;

        private OnRevolvingCreditPushProvisioningEligible() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningEligible fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningEligibleReason revolvingCreditPushProvisioningEligibleReason = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                revolvingCreditPushProvisioningEligibleReason = com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditPushProvisioningEligibleReason_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (revolvingCreditPushProvisioningEligibleReason != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningEligible(revolvingCreditPushProvisioningEligibleReason);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "eligibleReason");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningEligible value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("eligibleReason");
            com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditPushProvisioningEligibleReason_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getEligibleReason());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragmentImpl_ResponseAdapter$OnRevolvingCreditPushProvisioningIneligible;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$OnRevolvingCreditPushProvisioningIneligible;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$OnRevolvingCreditPushProvisioningIneligible;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$OnRevolvingCreditPushProvisioningIneligible;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnRevolvingCreditPushProvisioningIneligible implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningIneligible> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.OnRevolvingCreditPushProvisioningIneligible INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.OnRevolvingCreditPushProvisioningIneligible();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ineligibleReason", "provisionedTokens"});
        public static final int $stable = 8;

        private OnRevolvingCreditPushProvisioningIneligible() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningIneligible fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningIneligibleReason revolvingCreditPushProvisioningIneligibleReason = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    revolvingCreditPushProvisioningIneligibleReason = com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditPushProvisioningIneligibleReason_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.ProvisionedToken.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                }
            }
            if (revolvingCreditPushProvisioningIneligibleReason != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningIneligible(revolvingCreditPushProvisioningIneligibleReason, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "ineligibleReason");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.OnRevolvingCreditPushProvisioningIneligible value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("ineligibleReason");
            com.paypal.oslo.api.graphql.schema.type.adapter.RevolvingCreditPushProvisioningIneligibleReason_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getIneligibleReason());
            writer.name("provisionedTokens");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.ProvisionedToken.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getProvisionedTokens());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragmentImpl_ResponseAdapter$ProvisionedToken;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$ProvisionedToken;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$ProvisionedToken;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$ProvisionedToken;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ProvisionedToken implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.ProvisionedToken> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.ProvisionedToken INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.ProvisionedToken();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "fundingPrimaryAccountNumberReferenceId", "fundingPrimaryAccountNumberLastDigits", "state", "issuerName", "isCompanionToken", "isDefaultToken"});
        public static final int $stable = 8;

        private ProvisionedToken() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.ProvisionedToken(r2, r3, r4, r5, r6, r7, r1.booleanValue());
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "isDefaultToken");
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "isCompanionToken");
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "issuerName");
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0089, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r10, "state");
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (r5 == null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
        
            if (r6 == null) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
        
            if (r0 == null) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        
            r7 = r0.booleanValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        
            if (r1 == null) goto L19;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.ProvisionedToken fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.Boolean bool2 = null;
            java.lang.Object obj = null;
            java.lang.Object obj2 = null;
            java.lang.String str = null;
            com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState creditExternalWalletTokenState = null;
            java.lang.String str2 = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        creditExternalWalletTokenState = com.paypal.oslo.api.graphql.schema.type.adapter.CreditExternalWalletTokenState_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool2 = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.ProvisionedToken value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("fundingPrimaryAccountNumberReferenceId");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getFundingPrimaryAccountNumberReferenceId());
            writer.name("fundingPrimaryAccountNumberLastDigits");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getFundingPrimaryAccountNumberLastDigits());
            writer.name("state");
            com.paypal.oslo.api.graphql.schema.type.adapter.CreditExternalWalletTokenState_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getState());
            writer.name("issuerName");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getIssuerName());
            writer.name("isCompanionToken");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.isCompanionToken()));
            writer.name("isDefaultToken");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.isDefaultToken()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragmentImpl_ResponseAdapter$Component;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$Component;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$Component;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/StarPayWalletProvisioningFragment$Component;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Component implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.Component> {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.Component INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragmentImpl_ResponseAdapter.Component();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"isHidden", "personalizationTrackingId"});
        public static final int $stable = 8;

        private Component() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.Component fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (bool != null) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.Component(bool.booleanValue(), obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "isHidden");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.StarPayWalletProvisioningFragment.Component value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("isHidden");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.isHidden()));
            writer.name("personalizationTrackingId");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getPersonalizationTrackingId());
        }
    }
}
