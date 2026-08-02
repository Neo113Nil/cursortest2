package com.paypal.oslo.feature.balance.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\t!\"#$%&'( B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "ThresholdConfig", "OnBalanceAutoReloadThreshold", "ReloadAmount", "ThresholdAmount", "FrequencyConfig", "OnBalanceAutoReloadFrequency", "ReloadAmount1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetBalanceAutoReloadConfigQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.Companion INSTANCE = new com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "66fc4d53e1f6d0af5bb8a4e931940601d373577e36869cbf8a1fbc05712db14d";
    public static final java.lang.String OPERATION_NAME = "GetBalanceAutoReloadConfig";

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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.balance.graphql.adapter.GetBalanceAutoReloadConfigQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.balance.graphql.selections.GetBalanceAutoReloadConfigQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ThresholdConfig;", "thresholdConfig", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$FrequencyConfig;", "frequencyConfig", "<init>", "(Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ThresholdConfig;Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$FrequencyConfig;)V", "component1", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ThresholdConfig;", "component2", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$FrequencyConfig;", "copy", "(Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ThresholdConfig;Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$FrequencyConfig;)Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ThresholdConfig;", "getThresholdConfig", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$FrequencyConfig;", "getFrequencyConfig"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.FrequencyConfig frequencyConfig;
        private final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdConfig thresholdConfig;

        public Data(com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdConfig thresholdConfig, com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.FrequencyConfig frequencyConfig) {
            this.thresholdConfig = thresholdConfig;
            this.frequencyConfig = frequencyConfig;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdConfig getThresholdConfig() {
            return this.thresholdConfig;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.FrequencyConfig getFrequencyConfig() {
            return this.frequencyConfig;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdConfig thresholdConfig = this.thresholdConfig;
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.FrequencyConfig frequencyConfig = this.frequencyConfig;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(thresholdConfig=");
            sb.append(thresholdConfig);
            sb.append(", frequencyConfig=");
            sb.append(frequencyConfig);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdConfig thresholdConfig = this.thresholdConfig;
            int hashCode = thresholdConfig == null ? 0 : thresholdConfig.hashCode();
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.FrequencyConfig frequencyConfig = this.frequencyConfig;
            return (hashCode * 31) + (frequencyConfig != null ? frequencyConfig.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.Data)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.Data data = (com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.Data) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.thresholdConfig, data.thresholdConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.frequencyConfig, data.frequencyConfig);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.Data copy(com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdConfig thresholdConfig, com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.FrequencyConfig frequencyConfig) {
            return new com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.Data(thresholdConfig, frequencyConfig);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.FrequencyConfig getFrequencyConfig() {
            return this.frequencyConfig;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdConfig getThresholdConfig() {
            return this.thresholdConfig;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.Data copy$default(com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.Data data, com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdConfig thresholdConfig, com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.FrequencyConfig frequencyConfig, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                thresholdConfig = data.thresholdConfig;
            }
            if ((i & 2) != 0) {
                frequencyConfig = data.frequencyConfig;
            }
            return data.copy(thresholdConfig, frequencyConfig);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ThresholdConfig;", "", "", "__typename", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$OnBalanceAutoReloadThreshold;", "onBalanceAutoReloadThreshold", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$OnBalanceAutoReloadThreshold;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$OnBalanceAutoReloadThreshold;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$OnBalanceAutoReloadThreshold;)Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ThresholdConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$OnBalanceAutoReloadThreshold;", "getOnBalanceAutoReloadThreshold"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ThresholdConfig {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold;

        public ThresholdConfig(java.lang.String str, com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onBalanceAutoReloadThreshold = onBalanceAutoReloadThreshold;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadThreshold getOnBalanceAutoReloadThreshold() {
            return this.onBalanceAutoReloadThreshold;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold = this.onBalanceAutoReloadThreshold;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ThresholdConfig(__typename=");
            sb.append(str);
            sb.append(", onBalanceAutoReloadThreshold=");
            sb.append(onBalanceAutoReloadThreshold);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold = this.onBalanceAutoReloadThreshold;
            return (hashCode * 31) + (onBalanceAutoReloadThreshold == null ? 0 : onBalanceAutoReloadThreshold.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdConfig)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdConfig thresholdConfig = (com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdConfig) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, thresholdConfig.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBalanceAutoReloadThreshold, thresholdConfig.onBalanceAutoReloadThreshold);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdConfig copy(java.lang.String __typename, com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdConfig(__typename, onBalanceAutoReloadThreshold);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadThreshold getOnBalanceAutoReloadThreshold() {
            return this.onBalanceAutoReloadThreshold;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdConfig copy$default(com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdConfig thresholdConfig, java.lang.String str, com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = thresholdConfig.__typename;
            }
            if ((i & 2) != 0) {
                onBalanceAutoReloadThreshold = thresholdConfig.onBalanceAutoReloadThreshold;
            }
            return thresholdConfig.copy(str, onBalanceAutoReloadThreshold);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$OnBalanceAutoReloadThreshold;", "", "", "balanceId", "financialInstrumentId", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ReloadAmount;", "reloadAmount", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ThresholdAmount;", "thresholdAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ReloadAmount;Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ThresholdAmount;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ReloadAmount;", "component4", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ThresholdAmount;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ReloadAmount;Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ThresholdAmount;)Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$OnBalanceAutoReloadThreshold;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBalanceId", "getFinancialInstrumentId", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ReloadAmount;", "getReloadAmount", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ThresholdAmount;", "getThresholdAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBalanceAutoReloadThreshold {
        public static final int $stable = 8;
        private final java.lang.String balanceId;
        private final java.lang.String financialInstrumentId;
        private final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount reloadAmount;
        private final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdAmount thresholdAmount;

        public OnBalanceAutoReloadThreshold(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount reloadAmount, com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdAmount thresholdAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thresholdAmount, "");
            this.balanceId = str;
            this.financialInstrumentId = str2;
            this.reloadAmount = reloadAmount;
            this.thresholdAmount = thresholdAmount;
        }

        public final java.lang.String getBalanceId() {
            return this.balanceId;
        }

        public final java.lang.String getFinancialInstrumentId() {
            return this.financialInstrumentId;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount getReloadAmount() {
            return this.reloadAmount;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdAmount getThresholdAmount() {
            return this.thresholdAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.balanceId;
            java.lang.String str2 = this.financialInstrumentId;
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount reloadAmount = this.reloadAmount;
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdAmount thresholdAmount = this.thresholdAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBalanceAutoReloadThreshold(balanceId=");
            sb.append(str);
            sb.append(", financialInstrumentId=");
            sb.append(str2);
            sb.append(", reloadAmount=");
            sb.append(reloadAmount);
            sb.append(", thresholdAmount=");
            sb.append(thresholdAmount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.balanceId.hashCode() * 31) + this.financialInstrumentId.hashCode()) * 31) + this.reloadAmount.hashCode()) * 31) + this.thresholdAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadThreshold)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold = (com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadThreshold) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.balanceId, onBalanceAutoReloadThreshold.balanceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstrumentId, onBalanceAutoReloadThreshold.financialInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.reloadAmount, onBalanceAutoReloadThreshold.reloadAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.thresholdAmount, onBalanceAutoReloadThreshold.thresholdAmount);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadThreshold copy(java.lang.String balanceId, java.lang.String financialInstrumentId, com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount reloadAmount, com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdAmount thresholdAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstrumentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thresholdAmount, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadThreshold(balanceId, financialInstrumentId, reloadAmount, thresholdAmount);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdAmount getThresholdAmount() {
            return this.thresholdAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount getReloadAmount() {
            return this.reloadAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFinancialInstrumentId() {
            return this.financialInstrumentId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBalanceId() {
            return this.balanceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadThreshold copy$default(com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount reloadAmount, com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdAmount thresholdAmount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBalanceAutoReloadThreshold.balanceId;
            }
            if ((i & 2) != 0) {
                str2 = onBalanceAutoReloadThreshold.financialInstrumentId;
            }
            if ((i & 4) != 0) {
                reloadAmount = onBalanceAutoReloadThreshold.reloadAmount;
            }
            if ((i & 8) != 0) {
                thresholdAmount = onBalanceAutoReloadThreshold.thresholdAmount;
            }
            return onBalanceAutoReloadThreshold.copy(str, str2, reloadAmount, thresholdAmount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ReloadAmount;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ReloadAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Ljava/lang/Object;", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReloadAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public ReloadAmount(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.value = str;
            this.currencyCode = obj;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.Object obj = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReloadAmount(value=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.value.hashCode() * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount reloadAmount = (com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, reloadAmount.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, reloadAmount.currencyCode);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount copy(java.lang.String value, java.lang.Object currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount copy$default(com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount reloadAmount, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = reloadAmount.value;
            }
            if ((i & 2) != 0) {
                obj = reloadAmount.currencyCode;
            }
            return reloadAmount.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ThresholdAmount;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ThresholdAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Ljava/lang/Object;", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ThresholdAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public ThresholdAmount(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.value = str;
            this.currencyCode = obj;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.Object obj = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ThresholdAmount(value=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.value.hashCode() * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdAmount)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdAmount thresholdAmount = (com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, thresholdAmount.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, thresholdAmount.currencyCode);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdAmount copy(java.lang.String value, java.lang.Object currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdAmount(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdAmount copy$default(com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdAmount thresholdAmount, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = thresholdAmount.value;
            }
            if ((i & 2) != 0) {
                obj = thresholdAmount.currencyCode;
            }
            return thresholdAmount.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$FrequencyConfig;", "", "", "__typename", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$OnBalanceAutoReloadFrequency;", "onBalanceAutoReloadFrequency", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$OnBalanceAutoReloadFrequency;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$OnBalanceAutoReloadFrequency;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$OnBalanceAutoReloadFrequency;)Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$FrequencyConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$OnBalanceAutoReloadFrequency;", "getOnBalanceAutoReloadFrequency"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FrequencyConfig {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency;

        public FrequencyConfig(java.lang.String str, com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onBalanceAutoReloadFrequency = onBalanceAutoReloadFrequency;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadFrequency getOnBalanceAutoReloadFrequency() {
            return this.onBalanceAutoReloadFrequency;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency = this.onBalanceAutoReloadFrequency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FrequencyConfig(__typename=");
            sb.append(str);
            sb.append(", onBalanceAutoReloadFrequency=");
            sb.append(onBalanceAutoReloadFrequency);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency = this.onBalanceAutoReloadFrequency;
            return (hashCode * 31) + (onBalanceAutoReloadFrequency == null ? 0 : onBalanceAutoReloadFrequency.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.FrequencyConfig)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.FrequencyConfig frequencyConfig = (com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.FrequencyConfig) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, frequencyConfig.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBalanceAutoReloadFrequency, frequencyConfig.onBalanceAutoReloadFrequency);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.FrequencyConfig copy(java.lang.String __typename, com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.FrequencyConfig(__typename, onBalanceAutoReloadFrequency);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadFrequency getOnBalanceAutoReloadFrequency() {
            return this.onBalanceAutoReloadFrequency;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.FrequencyConfig copy$default(com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.FrequencyConfig frequencyConfig, java.lang.String str, com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = frequencyConfig.__typename;
            }
            if ((i & 2) != 0) {
                onBalanceAutoReloadFrequency = frequencyConfig.onBalanceAutoReloadFrequency;
            }
            return frequencyConfig.copy(str, onBalanceAutoReloadFrequency);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010\u0014R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010!\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0014R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$OnBalanceAutoReloadFrequency;", "", "startDate", "Lcom/paypal/oslo/api/graphql/schema/type/DayOfWeek;", "startDay", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadRecurrence;", "recurrence", "", "financialInstrumentId", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ReloadAmount1;", "reloadAmount", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/DayOfWeek;Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadRecurrence;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ReloadAmount1;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/DayOfWeek;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadRecurrence;", "component4", "()Ljava/lang/String;", "component5", "()Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ReloadAmount1;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/DayOfWeek;Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadRecurrence;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ReloadAmount1;)Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$OnBalanceAutoReloadFrequency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getStartDate", "Lcom/paypal/oslo/api/graphql/schema/type/DayOfWeek;", "getStartDay", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadRecurrence;", "getRecurrence", "Ljava/lang/String;", "getFinancialInstrumentId", "Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ReloadAmount1;", "getReloadAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBalanceAutoReloadFrequency {
        public static final int $stable = 8;
        private final java.lang.String financialInstrumentId;
        private final com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadRecurrence recurrence;
        private final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount1 reloadAmount;
        private final java.lang.Object startDate;
        private final com.paypal.oslo.api.graphql.schema.type.DayOfWeek startDay;

        public OnBalanceAutoReloadFrequency(java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.DayOfWeek dayOfWeek, com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadRecurrence balanceAutoReloadRecurrence, java.lang.String str, com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount1 reloadAmount1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceAutoReloadRecurrence, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmount1, "");
            this.startDate = obj;
            this.startDay = dayOfWeek;
            this.recurrence = balanceAutoReloadRecurrence;
            this.financialInstrumentId = str;
            this.reloadAmount = reloadAmount1;
        }

        public final java.lang.Object getStartDate() {
            return this.startDate;
        }

        public final com.paypal.oslo.api.graphql.schema.type.DayOfWeek getStartDay() {
            return this.startDay;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadRecurrence getRecurrence() {
            return this.recurrence;
        }

        public final java.lang.String getFinancialInstrumentId() {
            return this.financialInstrumentId;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount1 getReloadAmount() {
            return this.reloadAmount;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.startDate;
            com.paypal.oslo.api.graphql.schema.type.DayOfWeek dayOfWeek = this.startDay;
            com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadRecurrence balanceAutoReloadRecurrence = this.recurrence;
            java.lang.String str = this.financialInstrumentId;
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount1 reloadAmount1 = this.reloadAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBalanceAutoReloadFrequency(startDate=");
            sb.append(obj);
            sb.append(", startDay=");
            sb.append(dayOfWeek);
            sb.append(", recurrence=");
            sb.append(balanceAutoReloadRecurrence);
            sb.append(", financialInstrumentId=");
            sb.append(str);
            sb.append(", reloadAmount=");
            sb.append(reloadAmount1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.startDate.hashCode() * 31) + this.startDay.hashCode()) * 31) + this.recurrence.hashCode()) * 31) + this.financialInstrumentId.hashCode()) * 31) + this.reloadAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadFrequency)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency = (com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadFrequency) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, onBalanceAutoReloadFrequency.startDate) && this.startDay == onBalanceAutoReloadFrequency.startDay && this.recurrence == onBalanceAutoReloadFrequency.recurrence && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstrumentId, onBalanceAutoReloadFrequency.financialInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.reloadAmount, onBalanceAutoReloadFrequency.reloadAmount);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadFrequency copy(java.lang.Object startDate, com.paypal.oslo.api.graphql.schema.type.DayOfWeek startDay, com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadRecurrence recurrence, java.lang.String financialInstrumentId, com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount1 reloadAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDay, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurrence, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstrumentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmount, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadFrequency(startDate, startDay, recurrence, financialInstrumentId, reloadAmount);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount1 getReloadAmount() {
            return this.reloadAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getFinancialInstrumentId() {
            return this.financialInstrumentId;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadRecurrence getRecurrence() {
            return this.recurrence;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.DayOfWeek getStartDay() {
            return this.startDay;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getStartDate() {
            return this.startDate;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadFrequency copy$default(com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.DayOfWeek dayOfWeek, com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadRecurrence balanceAutoReloadRecurrence, java.lang.String str, com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount1 reloadAmount1, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = onBalanceAutoReloadFrequency.startDate;
            }
            if ((i & 2) != 0) {
                dayOfWeek = onBalanceAutoReloadFrequency.startDay;
            }
            com.paypal.oslo.api.graphql.schema.type.DayOfWeek dayOfWeek2 = dayOfWeek;
            if ((i & 4) != 0) {
                balanceAutoReloadRecurrence = onBalanceAutoReloadFrequency.recurrence;
            }
            com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadRecurrence balanceAutoReloadRecurrence2 = balanceAutoReloadRecurrence;
            if ((i & 8) != 0) {
                str = onBalanceAutoReloadFrequency.financialInstrumentId;
            }
            java.lang.String str2 = str;
            if ((i & 16) != 0) {
                reloadAmount1 = onBalanceAutoReloadFrequency.reloadAmount;
            }
            return onBalanceAutoReloadFrequency.copy(obj, dayOfWeek2, balanceAutoReloadRecurrence2, str2, reloadAmount1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ReloadAmount1;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$ReloadAmount1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue", "Ljava/lang/Object;", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReloadAmount1 {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public ReloadAmount1(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.value = str;
            this.currencyCode = obj;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.value;
            java.lang.Object obj = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReloadAmount1(value=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.value.hashCode() * 31) + this.currencyCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount1)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount1 reloadAmount1 = (com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.value, reloadAmount1.value) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, reloadAmount1.currencyCode);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount1 copy(java.lang.String value, java.lang.Object currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            return new com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount1(value, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount1 copy$default(com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ReloadAmount1 reloadAmount1, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = reloadAmount1.value;
            }
            if ((i & 2) != 0) {
                obj = reloadAmount1.currencyCode;
            }
            return reloadAmount1.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetBalanceAutoReloadConfigQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetBalanceAutoReloadConfig { thresholdConfig: balanceAutoReload(input: { scheduleType: AUTO_RELOAD_THRESHOLD } ) { __typename ... on BalanceAutoReloadThreshold { balanceId financialInstrumentId reloadAmount { value currencyCode } thresholdAmount { value currencyCode } } } frequencyConfig: balanceAutoReload(input: { scheduleType: AUTO_RELOAD_FREQUENCY } ) { __typename ... on BalanceAutoReloadFrequency { startDate startDay recurrence financialInstrumentId reloadAmount { value currencyCode } } } }";
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
