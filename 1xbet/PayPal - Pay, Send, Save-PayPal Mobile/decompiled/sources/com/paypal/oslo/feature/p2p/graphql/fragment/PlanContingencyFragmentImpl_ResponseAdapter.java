package com.paypal.oslo.feature.p2p.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragmentImpl_ResponseAdapter;", "", "<init>", "()V", "PlanContingencyFragment", "Details", "OnThreeDSecureDataCollectionContingency", "OnThreeDSecureAuthenticationContingency", "RedirectRequestParameter", "OnPlanUserDataCollection", "OnRealTimeBalanceContingency", "OnTopUpInstrumentContingency", "MinimumAmount", "OnCardVerificationDataCollectionContingency"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PlanContingencyFragmentImpl_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragmentImpl_ResponseAdapter$PlanContingencyFragment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PlanContingencyFragment implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.PlanContingencyFragment INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.PlanContingencyFragment();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"action", "status", "details"});
        public static final int $stable = 8;

        private PlanContingencyFragment() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction = null;
            com.paypal.oslo.api.graphql.schema.type.ContingencyStatus contingencyStatus = null;
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details details = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    planContingencyAction = com.paypal.oslo.api.graphql.schema.type.adapter.PlanContingencyAction_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    contingencyStatus = com.paypal.oslo.api.graphql.schema.type.adapter.ContingencyStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    details = (com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.Details.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (planContingencyAction == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "action");
                throw new kotlin.KotlinNothingValueException();
            }
            if (contingencyStatus != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment(planContingencyAction, contingencyStatus, details);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "status");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("action");
            com.paypal.oslo.api.graphql.schema.type.adapter.PlanContingencyAction_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getAction());
            writer.name("status");
            com.paypal.oslo.api.graphql.schema.type.adapter.ContingencyStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("details");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.Details.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getDetails());
        }
    }

    private PlanContingencyFragmentImpl_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragmentImpl_ResponseAdapter$Details;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$Details;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$Details;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$Details;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Details implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.Details INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.Details();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Details() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureDataCollectionContingency onThreeDSecureDataCollectionContingency;
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureAuthenticationContingency onThreeDSecureAuthenticationContingency;
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection onPlanUserDataCollection;
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnRealTimeBalanceContingency onRealTimeBalanceContingency;
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency onTopUpInstrumentContingency;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnCardVerificationDataCollectionContingency onCardVerificationDataCollectionContingency = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("ThreeDSecureDataCollectionContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onThreeDSecureDataCollectionContingency = com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnThreeDSecureDataCollectionContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onThreeDSecureDataCollectionContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("ThreeDSecureAuthenticationContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onThreeDSecureAuthenticationContingency = com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnThreeDSecureAuthenticationContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onThreeDSecureAuthenticationContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("PlanUserDataCollection"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onPlanUserDataCollection = com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnPlanUserDataCollection.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onPlanUserDataCollection = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("RealTimeBalanceContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onRealTimeBalanceContingency = com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnRealTimeBalanceContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onRealTimeBalanceContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("TopUpInstrumentContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onTopUpInstrumentContingency = com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnTopUpInstrumentContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onTopUpInstrumentContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("CardVerificationDataCollectionContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onCardVerificationDataCollectionContingency = com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnCardVerificationDataCollectionContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details(str, onThreeDSecureDataCollectionContingency, onThreeDSecureAuthenticationContingency, onPlanUserDataCollection, onRealTimeBalanceContingency, onTopUpInstrumentContingency, onCardVerificationDataCollectionContingency);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnThreeDSecureDataCollectionContingency() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnThreeDSecureDataCollectionContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnThreeDSecureDataCollectionContingency());
            }
            if (value.getOnThreeDSecureAuthenticationContingency() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnThreeDSecureAuthenticationContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnThreeDSecureAuthenticationContingency());
            }
            if (value.getOnPlanUserDataCollection() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnPlanUserDataCollection.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPlanUserDataCollection());
            }
            if (value.getOnRealTimeBalanceContingency() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnRealTimeBalanceContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRealTimeBalanceContingency());
            }
            if (value.getOnTopUpInstrumentContingency() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnTopUpInstrumentContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnTopUpInstrumentContingency());
            }
            if (value.getOnCardVerificationDataCollectionContingency() != null) {
                com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnCardVerificationDataCollectionContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnCardVerificationDataCollectionContingency());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragmentImpl_ResponseAdapter$OnThreeDSecureDataCollectionContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnThreeDSecureDataCollectionContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnThreeDSecureDataCollectionContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnThreeDSecureDataCollectionContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnThreeDSecureDataCollectionContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureDataCollectionContingency> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnThreeDSecureDataCollectionContingency INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnThreeDSecureDataCollectionContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"version", "referenceId", "deviceDataCollectionUrl", com.paypal.android.threeds.utils.NetworkUtil.JWT, "deviceDataCollectionMode", "authenticationProvider", "returnUrl", "source", "reason"});
        public static final int $stable = 8;

        private OnThreeDSecureDataCollectionContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureDataCollectionContingency(r2, r3, r4, r5, r6, r7, r8, r9, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x008d, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, com.paypal.android.threeds.utils.NetworkUtil.JWT);
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0097, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0098, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "deviceDataCollectionUrl");
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00a2, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "referenceId");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00ad, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00ae, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "version");
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00b8, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        
            if (r2 == null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
        
            if (r3 == null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
        
            if (r4 == null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (r5 == null) goto L20;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureDataCollectionContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion threeDSecureVersion = null;
            java.lang.String str = null;
            java.lang.Object obj = null;
            java.lang.String str2 = null;
            com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDeviceDataCollectionMode threeDSecureDeviceDataCollectionMode = null;
            com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationProvider threeDSecureAuthenticationProvider = null;
            java.lang.Object obj2 = null;
            com.paypal.oslo.api.graphql.schema.type.ThreeDSecureContingencySource threeDSecureContingencySource = null;
            java.lang.String str3 = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        threeDSecureVersion = com.paypal.oslo.api.graphql.schema.type.adapter.ThreeDSecureVersion_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        threeDSecureDeviceDataCollectionMode = (com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDeviceDataCollectionMode) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.ThreeDSecureDeviceDataCollectionMode_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        threeDSecureAuthenticationProvider = (com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationProvider) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.ThreeDSecureAuthenticationProvider_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        obj2 = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        threeDSecureContingencySource = (com.paypal.oslo.api.graphql.schema.type.ThreeDSecureContingencySource) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.ThreeDSecureContingencySource_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureDataCollectionContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("version");
            com.paypal.oslo.api.graphql.schema.type.adapter.ThreeDSecureVersion_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getVersion());
            writer.name("referenceId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getReferenceId());
            writer.name("deviceDataCollectionUrl");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getDeviceDataCollectionUrl());
            writer.name(com.paypal.android.threeds.utils.NetworkUtil.JWT);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getJwt());
            writer.name("deviceDataCollectionMode");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.ThreeDSecureDeviceDataCollectionMode_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getDeviceDataCollectionMode());
            writer.name("authenticationProvider");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.ThreeDSecureAuthenticationProvider_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getAuthenticationProvider());
            writer.name("returnUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getReturnUrl());
            writer.name("source");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.ThreeDSecureContingencySource_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getSource());
            writer.name("reason");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getReason());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragmentImpl_ResponseAdapter$OnThreeDSecureAuthenticationContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnThreeDSecureAuthenticationContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnThreeDSecureAuthenticationContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnThreeDSecureAuthenticationContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnThreeDSecureAuthenticationContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureAuthenticationContingency> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnThreeDSecureAuthenticationContingency INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnThreeDSecureAuthenticationContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"version", "referenceId", com.paypal.android.threeds.utils.NetworkUtil.JWT, "resolutionRedirectUrl", "resolutionRedirectMethod", "transactionId", "externalTransactionId", "authenticationProvider", "paymentAuthRequest", "redirectRequestParameters"});
        public static final int $stable = 8;

        private OnThreeDSecureAuthenticationContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        
            if (r7 == null) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureAuthenticationContingency(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x00a6, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "transactionId");
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00b0, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00b1, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "resolutionRedirectMethod");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00bb, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00bc, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "resolutionRedirectUrl");
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00c6, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00c7, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, com.paypal.android.threeds.utils.NetworkUtil.JWT);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00d1, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00d2, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "referenceId");
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00dc, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00dd, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r14, "version");
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00e7, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        
            if (r2 == null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
        
            if (r3 == null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        
            if (r4 == null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        
            if (r5 == null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        
            if (r6 == null) goto L25;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureAuthenticationContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion threeDSecureVersion = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.Object obj = null;
            com.paypal.oslo.api.graphql.schema.type.HttpMethod httpMethod = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationProvider threeDSecureAuthenticationProvider = null;
            java.lang.String str5 = null;
            java.util.List list = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        threeDSecureVersion = com.paypal.oslo.api.graphql.schema.type.adapter.ThreeDSecureVersion_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        httpMethod = com.paypal.oslo.api.graphql.schema.type.adapter.HttpMethod_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str3 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str4 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        threeDSecureAuthenticationProvider = (com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationProvider) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.ThreeDSecureAuthenticationProvider_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str5 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.RedirectRequestParameter.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureAuthenticationContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("version");
            com.paypal.oslo.api.graphql.schema.type.adapter.ThreeDSecureVersion_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getVersion());
            writer.name("referenceId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getReferenceId());
            writer.name(com.paypal.android.threeds.utils.NetworkUtil.JWT);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getJwt());
            writer.name("resolutionRedirectUrl");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getResolutionRedirectUrl());
            writer.name("resolutionRedirectMethod");
            com.paypal.oslo.api.graphql.schema.type.adapter.HttpMethod_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getResolutionRedirectMethod());
            writer.name("transactionId");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getTransactionId());
            writer.name("externalTransactionId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getExternalTransactionId());
            writer.name("authenticationProvider");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.api.graphql.schema.type.adapter.ThreeDSecureAuthenticationProvider_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getAuthenticationProvider());
            writer.name("paymentAuthRequest");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPaymentAuthRequest());
            writer.name("redirectRequestParameters");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.RedirectRequestParameter.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getRedirectRequestParameters());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragmentImpl_ResponseAdapter$RedirectRequestParameter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$RedirectRequestParameter;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$RedirectRequestParameter;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$RedirectRequestParameter;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RedirectRequestParameter implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.RedirectRequestParameter> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.RedirectRequestParameter INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.RedirectRequestParameter();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE});
        public static final int $stable = 8;

        private RedirectRequestParameter() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.RedirectRequestParameter fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "key");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.RedirectRequestParameter(str, str2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.RedirectRequestParameter value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("key");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getKey());
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragmentImpl_ResponseAdapter$OnPlanUserDataCollection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnPlanUserDataCollection;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnPlanUserDataCollection;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnPlanUserDataCollection;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnPlanUserDataCollection implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnPlanUserDataCollection INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnPlanUserDataCollection();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"requiredFields", "identityDocuments"});
        public static final int $stable = 8;

        private OnPlanUserDataCollection() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            java.util.List list2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.PlanUserDataCollectionAttribute_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    list2 = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.IdentityDocumentType_ResponseAdapter.INSTANCE)).fromJson(reader, customScalarAdapters);
                }
            }
            if (list != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection(list, list2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "requiredFields");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("requiredFields");
            com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.PlanUserDataCollectionAttribute_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, (java.util.List) value.getRequiredFields());
            writer.name("identityDocuments");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.paypal.oslo.api.graphql.schema.type.adapter.IdentityDocumentType_ResponseAdapter.INSTANCE)).toJson(writer, customScalarAdapters, value.getIdentityDocuments());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragmentImpl_ResponseAdapter$OnRealTimeBalanceContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnRealTimeBalanceContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnRealTimeBalanceContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnRealTimeBalanceContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnRealTimeBalanceContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnRealTimeBalanceContingency> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnRealTimeBalanceContingency INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnRealTimeBalanceContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("confirmationUrl");
        public static final int $stable = 8;

        private OnRealTimeBalanceContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnRealTimeBalanceContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                obj = com.apollographql.apollo.api.Adapters.NullableAnyAdapter.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnRealTimeBalanceContingency(obj);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnRealTimeBalanceContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("confirmationUrl");
            com.apollographql.apollo.api.Adapters.NullableAnyAdapter.toJson(writer, customScalarAdapters, value.getConfirmationUrl());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragmentImpl_ResponseAdapter$OnTopUpInstrumentContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnTopUpInstrumentContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnTopUpInstrumentContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnTopUpInstrumentContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnTopUpInstrumentContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnTopUpInstrumentContingency INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnTopUpInstrumentContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"provider", "minimumAmount"});
        public static final int $stable = 8;

        private OnTopUpInstrumentContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.api.graphql.schema.type.TopUpInstrumentProvider topUpInstrumentProvider = null;
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.MinimumAmount minimumAmount = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    topUpInstrumentProvider = com.paypal.oslo.api.graphql.schema.type.adapter.TopUpInstrumentProvider_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    minimumAmount = (com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.MinimumAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.MinimumAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (topUpInstrumentProvider == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "provider");
                throw new kotlin.KotlinNothingValueException();
            }
            if (minimumAmount != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency(topUpInstrumentProvider, minimumAmount);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "minimumAmount");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("provider");
            com.paypal.oslo.api.graphql.schema.type.adapter.TopUpInstrumentProvider_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getProvider());
            writer.name("minimumAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.MinimumAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getMinimumAmount());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragmentImpl_ResponseAdapter$MinimumAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$MinimumAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$MinimumAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$MinimumAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MinimumAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.MinimumAmount> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.MinimumAmount INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.MinimumAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private MinimumAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.MinimumAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragment fromJson = com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragmentImpl_ResponseAdapter.P2PMoneyFragment.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.MinimumAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.MinimumAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.p2p.graphql.fragment.P2PMoneyFragmentImpl_ResponseAdapter.P2PMoneyFragment.INSTANCE.toJson(writer, customScalarAdapters, value.getP2PMoneyFragment());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragmentImpl_ResponseAdapter$OnCardVerificationDataCollectionContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnCardVerificationDataCollectionContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnCardVerificationDataCollectionContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment$OnCardVerificationDataCollectionContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnCardVerificationDataCollectionContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnCardVerificationDataCollectionContingency> {
        public static final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnCardVerificationDataCollectionContingency INSTANCE = new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragmentImpl_ResponseAdapter.OnCardVerificationDataCollectionContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("cvvLength");
        public static final int $stable = 8;

        private OnCardVerificationDataCollectionContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnCardVerificationDataCollectionContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Integer num = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                num = com.apollographql.apollo.api.Adapters.NullableIntAdapter.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnCardVerificationDataCollectionContingency(num);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnCardVerificationDataCollectionContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("cvvLength");
            com.apollographql.apollo.api.Adapters.NullableIntAdapter.toJson(writer, customScalarAdapters, value.getCvvLength());
        }
    }
}
