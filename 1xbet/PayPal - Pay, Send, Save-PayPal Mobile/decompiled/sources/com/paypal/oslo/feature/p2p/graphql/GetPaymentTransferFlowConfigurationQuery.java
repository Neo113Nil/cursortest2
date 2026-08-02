package com.paypal.oslo.feature.p2p.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003!\" B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFlowConfigurationQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFlowConfigurationQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "PaymentTransferFlowConfiguration"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetPaymentTransferFlowConfigurationQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.Companion INSTANCE = new com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "0e405dcf04bf3edb04ff600d524fb168040f4aedcdddb119d491344fa6dc432a";
    public static final java.lang.String OPERATION_NAME = "GetPaymentTransferFlowConfiguration";

    public final boolean equals(java.lang.Object other) {
        return other != null && other.getClass() == getClass();
    }

    public final int hashCode() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String id() {
        return OPERATION_ID;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String document() {
        return INSTANCE.getOPERATION_DOCUMENT();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final java.lang.String name() {
        return OPERATION_NAME;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.p2p.graphql.adapter.GetPaymentTransferFlowConfigurationQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.p2p.graphql.selections.GetPaymentTransferFlowConfigurationQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFlowConfigurationQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFlowConfigurationQuery$PaymentTransferFlowConfiguration;", "paymentTransferFlowConfiguration", "<init>", "(Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFlowConfigurationQuery$PaymentTransferFlowConfiguration;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFlowConfigurationQuery$PaymentTransferFlowConfiguration;", "copy", "(Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFlowConfigurationQuery$PaymentTransferFlowConfiguration;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFlowConfigurationQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFlowConfigurationQuery$PaymentTransferFlowConfiguration;", "getPaymentTransferFlowConfiguration"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.PaymentTransferFlowConfiguration paymentTransferFlowConfiguration;

        public Data(com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.PaymentTransferFlowConfiguration paymentTransferFlowConfiguration) {
            this.paymentTransferFlowConfiguration = paymentTransferFlowConfiguration;
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.PaymentTransferFlowConfiguration getPaymentTransferFlowConfiguration() {
            return this.paymentTransferFlowConfiguration;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.PaymentTransferFlowConfiguration paymentTransferFlowConfiguration = this.paymentTransferFlowConfiguration;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(paymentTransferFlowConfiguration=");
            sb.append(paymentTransferFlowConfiguration);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.PaymentTransferFlowConfiguration paymentTransferFlowConfiguration = this.paymentTransferFlowConfiguration;
            if (paymentTransferFlowConfiguration == null) {
                return 0;
            }
            return paymentTransferFlowConfiguration.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTransferFlowConfiguration, ((com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.Data) other).paymentTransferFlowConfiguration);
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.Data copy(com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.PaymentTransferFlowConfiguration paymentTransferFlowConfiguration) {
            return new com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.Data(paymentTransferFlowConfiguration);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.PaymentTransferFlowConfiguration getPaymentTransferFlowConfiguration() {
            return this.paymentTransferFlowConfiguration;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.Data copy$default(com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.Data data, com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.PaymentTransferFlowConfiguration paymentTransferFlowConfiguration, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentTransferFlowConfiguration = data.paymentTransferFlowConfiguration;
            }
            return data.copy(paymentTransferFlowConfiguration);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFlowConfigurationQuery$PaymentTransferFlowConfiguration;", "", "primaryCurrencyCode", "", "cryptoCurrencyEnabled", "", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentTransferIntent;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SUPPORTED_INTENTS, "<init>", "(Ljava/lang/Object;ZLjava/util/List;)V", "component1", "()Ljava/lang/Object;", "component2", "()Z", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/Object;ZLjava/util/List;)Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFlowConfigurationQuery$PaymentTransferFlowConfiguration;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getPrimaryCurrencyCode", "Z", "getCryptoCurrencyEnabled", "Ljava/util/List;", "getSupportedIntents"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentTransferFlowConfiguration {
        public static final int $stable = 8;
        private final boolean cryptoCurrencyEnabled;
        private final java.lang.Object primaryCurrencyCode;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent> supportedIntents;

        /* JADX WARN: Multi-variable type inference failed */
        public PaymentTransferFlowConfiguration(java.lang.Object obj, boolean z, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.primaryCurrencyCode = obj;
            this.cryptoCurrencyEnabled = z;
            this.supportedIntents = list;
        }

        public final java.lang.Object getPrimaryCurrencyCode() {
            return this.primaryCurrencyCode;
        }

        public final boolean getCryptoCurrencyEnabled() {
            return this.cryptoCurrencyEnabled;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent> getSupportedIntents() {
            return this.supportedIntents;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.primaryCurrencyCode;
            boolean z = this.cryptoCurrencyEnabled;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent> list = this.supportedIntents;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentTransferFlowConfiguration(primaryCurrencyCode=");
            sb.append(obj);
            sb.append(", cryptoCurrencyEnabled=");
            sb.append(z);
            sb.append(", supportedIntents=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.primaryCurrencyCode.hashCode() * 31) + java.lang.Boolean.hashCode(this.cryptoCurrencyEnabled)) * 31) + this.supportedIntents.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.PaymentTransferFlowConfiguration)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.PaymentTransferFlowConfiguration paymentTransferFlowConfiguration = (com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.PaymentTransferFlowConfiguration) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.primaryCurrencyCode, paymentTransferFlowConfiguration.primaryCurrencyCode) && this.cryptoCurrencyEnabled == paymentTransferFlowConfiguration.cryptoCurrencyEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.supportedIntents, paymentTransferFlowConfiguration.supportedIntents);
        }

        public final com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.PaymentTransferFlowConfiguration copy(java.lang.Object primaryCurrencyCode, boolean cryptoCurrencyEnabled, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent> supportedIntents) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryCurrencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedIntents, "");
            return new com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.PaymentTransferFlowConfiguration(primaryCurrencyCode, cryptoCurrencyEnabled, supportedIntents);
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent> component3() {
            return this.supportedIntents;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getCryptoCurrencyEnabled() {
            return this.cryptoCurrencyEnabled;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getPrimaryCurrencyCode() {
            return this.primaryCurrencyCode;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.PaymentTransferFlowConfiguration copy$default(com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFlowConfigurationQuery.PaymentTransferFlowConfiguration paymentTransferFlowConfiguration, java.lang.Object obj, boolean z, java.util.List list, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = paymentTransferFlowConfiguration.primaryCurrencyCode;
            }
            if ((i & 2) != 0) {
                z = paymentTransferFlowConfiguration.cryptoCurrencyEnabled;
            }
            if ((i & 4) != 0) {
                list = paymentTransferFlowConfiguration.supportedIntents;
            }
            return paymentTransferFlowConfiguration.copy(obj, z, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferFlowConfigurationQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetPaymentTransferFlowConfiguration { paymentTransferFlowConfiguration { primaryCurrencyCode cryptoCurrencyEnabled supportedIntents } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
    }
}
