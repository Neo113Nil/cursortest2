package com.paypal.oslo.feature.cryptocurrency.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004!\"# B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencySubscriptionCapabilitiesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencySubscriptionCapabilitiesQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "CryptocurrencySubscriptions", "Capability"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetCryptocurrencySubscriptionCapabilitiesQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Companion INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "56f18a87310dc4bd329023ed2c2215edacbca4c4e441e23ce67f838fb2e7053b";
    public static final java.lang.String OPERATION_NAME = "GetCryptocurrencySubscriptionCapabilities";

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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencySubscriptionCapabilitiesQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.cryptocurrency.graphql.selections.GetCryptocurrencySubscriptionCapabilitiesQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencySubscriptionCapabilitiesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencySubscriptionCapabilitiesQuery$CryptocurrencySubscriptions;", "cryptocurrencySubscriptions", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencySubscriptionCapabilitiesQuery$CryptocurrencySubscriptions;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencySubscriptionCapabilitiesQuery$CryptocurrencySubscriptions;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencySubscriptionCapabilitiesQuery$CryptocurrencySubscriptions;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencySubscriptionCapabilitiesQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencySubscriptionCapabilitiesQuery$CryptocurrencySubscriptions;", "getCryptocurrencySubscriptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.CryptocurrencySubscriptions cryptocurrencySubscriptions;

        public Data(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.CryptocurrencySubscriptions cryptocurrencySubscriptions) {
            this.cryptocurrencySubscriptions = cryptocurrencySubscriptions;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.CryptocurrencySubscriptions getCryptocurrencySubscriptions() {
            return this.cryptocurrencySubscriptions;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.CryptocurrencySubscriptions cryptocurrencySubscriptions = this.cryptocurrencySubscriptions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(cryptocurrencySubscriptions=");
            sb.append(cryptocurrencySubscriptions);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.CryptocurrencySubscriptions cryptocurrencySubscriptions = this.cryptocurrencySubscriptions;
            if (cryptocurrencySubscriptions == null) {
                return 0;
            }
            return cryptocurrencySubscriptions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptocurrencySubscriptions, ((com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Data) other).cryptocurrencySubscriptions);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Data copy(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.CryptocurrencySubscriptions cryptocurrencySubscriptions) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Data(cryptocurrencySubscriptions);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.CryptocurrencySubscriptions getCryptocurrencySubscriptions() {
            return this.cryptocurrencySubscriptions;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Data copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Data data, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.CryptocurrencySubscriptions cryptocurrencySubscriptions, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cryptocurrencySubscriptions = data.cryptocurrencySubscriptions;
            }
            return data.copy(cryptocurrencySubscriptions);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencySubscriptionCapabilitiesQuery$CryptocurrencySubscriptions;", "", "", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencySubscriptionCapabilitiesQuery$Capability;", "capabilities", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencySubscriptionCapabilitiesQuery$CryptocurrencySubscriptions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getCapabilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CryptocurrencySubscriptions {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Capability> capabilities;

        public CryptocurrencySubscriptions(java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Capability> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.capabilities = list;
        }

        public final java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Capability> getCapabilities() {
            return this.capabilities;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Capability> list = this.capabilities;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptocurrencySubscriptions(capabilities=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.capabilities.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.CryptocurrencySubscriptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.capabilities, ((com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.CryptocurrencySubscriptions) other).capabilities);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.CryptocurrencySubscriptions copy(java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Capability> capabilities) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capabilities, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.CryptocurrencySubscriptions(capabilities);
        }

        public final java.util.List<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Capability> component1() {
            return this.capabilities;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.CryptocurrencySubscriptions copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.CryptocurrencySubscriptions cryptocurrencySubscriptions, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = cryptocurrencySubscriptions.capabilities;
            }
            return cryptocurrencySubscriptions.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencySubscriptionCapabilitiesQuery$Capability;", "", "", "name", "", "provisioningRequired", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyCapabilityIntent;", "intent", "<init>", "(Ljava/lang/String;ZLcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyCapabilityIntent;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyCapabilityIntent;", "copy", "(Ljava/lang/String;ZLcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyCapabilityIntent;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencySubscriptionCapabilitiesQuery$Capability;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Z", "getProvisioningRequired", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyCapabilityIntent;", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Capability {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent intent;
        private final java.lang.String name;
        private final boolean provisioningRequired;

        public Capability(java.lang.String str, boolean z, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent cryptocurrencyCapabilityIntent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
            this.provisioningRequired = z;
            this.intent = cryptocurrencyCapabilityIntent;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final boolean getProvisioningRequired() {
            return this.provisioningRequired;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent getIntent() {
            return this.intent;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            boolean z = this.provisioningRequired;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent cryptocurrencyCapabilityIntent = this.intent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Capability(name=");
            sb.append(str);
            sb.append(", provisioningRequired=");
            sb.append(z);
            sb.append(", intent=");
            sb.append(cryptocurrencyCapabilityIntent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.provisioningRequired);
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent cryptocurrencyCapabilityIntent = this.intent;
            return (((hashCode * 31) + hashCode2) * 31) + (cryptocurrencyCapabilityIntent == null ? 0 : cryptocurrencyCapabilityIntent.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Capability)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Capability capability = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Capability) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, capability.name) && this.provisioningRequired == capability.provisioningRequired && this.intent == capability.intent;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Capability copy(java.lang.String name2, boolean provisioningRequired, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Capability(name2, provisioningRequired, intent);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent getIntent() {
            return this.intent;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getProvisioningRequired() {
            return this.provisioningRequired;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Capability copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencySubscriptionCapabilitiesQuery.Capability capability, java.lang.String str, boolean z, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyCapabilityIntent cryptocurrencyCapabilityIntent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = capability.name;
            }
            if ((i & 2) != 0) {
                z = capability.provisioningRequired;
            }
            if ((i & 4) != 0) {
                cryptocurrencyCapabilityIntent = capability.intent;
            }
            return capability.copy(str, z, cryptocurrencyCapabilityIntent);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencySubscriptionCapabilitiesQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetCryptocurrencySubscriptionCapabilities { cryptocurrencySubscriptions { capabilities { name provisioningRequired intent } } }";
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
