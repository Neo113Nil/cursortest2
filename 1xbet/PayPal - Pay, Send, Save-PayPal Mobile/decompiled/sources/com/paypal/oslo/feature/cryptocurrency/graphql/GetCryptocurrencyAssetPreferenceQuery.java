package com.paypal.oslo.feature.cryptocurrency.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferencesInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferencesInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferencesInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferencesInput;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferencesInput;", "getInput", "Companion", "Data", "CryptocurrencyPreferences", "AssetPreference"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GetCryptocurrencyAssetPreferenceQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.Data> {
    public static final java.lang.String OPERATION_ID = "0fe9575e9ce9db262dce569ae824a38f4186a9b44b20845961393ca1ceea580d";
    public static final java.lang.String OPERATION_NAME = "GetCryptocurrencyAssetPreference";
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferencesInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.Companion INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.Companion(null);
    public static final int $stable = 8;

    public GetCryptocurrencyAssetPreferenceQuery(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferencesInput cryptocurrencyPreferencesInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyPreferencesInput, "");
        this.input = cryptocurrencyPreferencesInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferencesInput getInput() {
        return this.input;
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
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyAssetPreferenceQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.GetCryptocurrencyAssetPreferenceQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.cryptocurrency.graphql.selections.GetCryptocurrencyAssetPreferenceQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery$CryptocurrencyPreferences;", "cryptocurrencyPreferences", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery$CryptocurrencyPreferences;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery$CryptocurrencyPreferences;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery$CryptocurrencyPreferences;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery$CryptocurrencyPreferences;", "getCryptocurrencyPreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.CryptocurrencyPreferences cryptocurrencyPreferences;

        public Data(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.CryptocurrencyPreferences cryptocurrencyPreferences) {
            this.cryptocurrencyPreferences = cryptocurrencyPreferences;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.CryptocurrencyPreferences getCryptocurrencyPreferences() {
            return this.cryptocurrencyPreferences;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.CryptocurrencyPreferences cryptocurrencyPreferences = this.cryptocurrencyPreferences;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(cryptocurrencyPreferences=");
            sb.append(cryptocurrencyPreferences);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.CryptocurrencyPreferences cryptocurrencyPreferences = this.cryptocurrencyPreferences;
            if (cryptocurrencyPreferences == null) {
                return 0;
            }
            return cryptocurrencyPreferences.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptocurrencyPreferences, ((com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.Data) other).cryptocurrencyPreferences);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.Data copy(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.CryptocurrencyPreferences cryptocurrencyPreferences) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.Data(cryptocurrencyPreferences);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.CryptocurrencyPreferences getCryptocurrencyPreferences() {
            return this.cryptocurrencyPreferences;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.Data copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.Data data, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.CryptocurrencyPreferences cryptocurrencyPreferences, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cryptocurrencyPreferences = data.cryptocurrencyPreferences;
            }
            return data.copy(cryptocurrencyPreferences);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery$CryptocurrencyPreferences;", "", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery$AssetPreference;", "assetPreference", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery$AssetPreference;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery$AssetPreference;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery$AssetPreference;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery$CryptocurrencyPreferences;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery$AssetPreference;", "getAssetPreference"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CryptocurrencyPreferences {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.AssetPreference assetPreference;

        public CryptocurrencyPreferences(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.AssetPreference assetPreference) {
            this.assetPreference = assetPreference;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.AssetPreference getAssetPreference() {
            return this.assetPreference;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.AssetPreference assetPreference = this.assetPreference;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptocurrencyPreferences(assetPreference=");
            sb.append(assetPreference);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.AssetPreference assetPreference = this.assetPreference;
            if (assetPreference == null) {
                return 0;
            }
            return assetPreference.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.CryptocurrencyPreferences) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetPreference, ((com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.CryptocurrencyPreferences) other).assetPreference);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.CryptocurrencyPreferences copy(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.AssetPreference assetPreference) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.CryptocurrencyPreferences(assetPreference);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.AssetPreference getAssetPreference() {
            return this.assetPreference;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.CryptocurrencyPreferences copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.CryptocurrencyPreferences cryptocurrencyPreferences, com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.AssetPreference assetPreference, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                assetPreference = cryptocurrencyPreferences.assetPreference;
            }
            return cryptocurrencyPreferences.copy(assetPreference);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JD\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0014R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery$AssetPreference;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "", "hasOptInBefore", "rate", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetPreferenceType;", "preferenceType", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferenceStatus;", "status", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;ZLjava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetPreferenceType;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferenceStatus;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "component2", "()Z", "component3", "()Ljava/lang/Object;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetPreferenceType;", "component5", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferenceStatus;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;ZLjava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetPreferenceType;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferenceStatus;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery$AssetPreference;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetSymbol;", "getAssetSymbol", "Z", "getHasOptInBefore", "Ljava/lang/Object;", "getRate", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyAssetPreferenceType;", "getPreferenceType", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyPreferenceStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AssetPreference {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol;
        private final boolean hasOptInBefore;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceType preferenceType;
        private final java.lang.Object rate;
        private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus status;

        public AssetPreference(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, boolean z, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceType cryptocurrencyAssetPreferenceType, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus cryptocurrencyPreferenceStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyAssetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyAssetPreferenceType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyPreferenceStatus, "");
            this.assetSymbol = cryptocurrencyAssetSymbol;
            this.hasOptInBefore = z;
            this.rate = obj;
            this.preferenceType = cryptocurrencyAssetPreferenceType;
            this.status = cryptocurrencyPreferenceStatus;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        public final boolean getHasOptInBefore() {
            return this.hasOptInBefore;
        }

        public final java.lang.Object getRate() {
            return this.rate;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceType getPreferenceType() {
            return this.preferenceType;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol = this.assetSymbol;
            boolean z = this.hasOptInBefore;
            java.lang.Object obj = this.rate;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceType cryptocurrencyAssetPreferenceType = this.preferenceType;
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus cryptocurrencyPreferenceStatus = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AssetPreference(assetSymbol=");
            sb.append(cryptocurrencyAssetSymbol);
            sb.append(", hasOptInBefore=");
            sb.append(z);
            sb.append(", rate=");
            sb.append(obj);
            sb.append(", preferenceType=");
            sb.append(cryptocurrencyAssetPreferenceType);
            sb.append(", status=");
            sb.append(cryptocurrencyPreferenceStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.assetSymbol.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.hasOptInBefore);
            java.lang.Object obj = this.rate;
            return (((((((hashCode * 31) + hashCode2) * 31) + (obj == null ? 0 : obj.hashCode())) * 31) + this.preferenceType.hashCode()) * 31) + this.status.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.AssetPreference)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.AssetPreference assetPreference = (com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.AssetPreference) other;
            return this.assetSymbol == assetPreference.assetSymbol && this.hasOptInBefore == assetPreference.hasOptInBefore && kotlin.jvm.internal.Intrinsics.areEqual(this.rate, assetPreference.rate) && this.preferenceType == assetPreference.preferenceType && this.status == assetPreference.status;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.AssetPreference copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol assetSymbol, boolean hasOptInBefore, java.lang.Object rate, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceType preferenceType, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferenceType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.AssetPreference(assetSymbol, hasOptInBefore, rate, preferenceType, status);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus getStatus() {
            return this.status;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceType getPreferenceType() {
            return this.preferenceType;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getRate() {
            return this.rate;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHasOptInBefore() {
            return this.hasOptInBefore;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol getAssetSymbol() {
            return this.assetSymbol;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.AssetPreference copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery.AssetPreference assetPreference, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetSymbol cryptocurrencyAssetSymbol, boolean z, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceType cryptocurrencyAssetPreferenceType, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferenceStatus cryptocurrencyPreferenceStatus, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                cryptocurrencyAssetSymbol = assetPreference.assetSymbol;
            }
            if ((i & 2) != 0) {
                z = assetPreference.hasOptInBefore;
            }
            boolean z2 = z;
            if ((i & 4) != 0) {
                obj = assetPreference.rate;
            }
            java.lang.Object obj3 = obj;
            if ((i & 8) != 0) {
                cryptocurrencyAssetPreferenceType = assetPreference.preferenceType;
            }
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceType cryptocurrencyAssetPreferenceType2 = cryptocurrencyAssetPreferenceType;
            if ((i & 16) != 0) {
                cryptocurrencyPreferenceStatus = assetPreference.status;
            }
            return assetPreference.copy(cryptocurrencyAssetSymbol, z2, obj3, cryptocurrencyAssetPreferenceType2, cryptocurrencyPreferenceStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/GetCryptocurrencyAssetPreferenceQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetCryptocurrencyAssetPreference($input: CryptocurrencyPreferencesInput!) { cryptocurrencyPreferences(input: $input) { assetPreference { assetSymbol hasOptInBefore rate preferenceType status } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferencesInput cryptocurrencyPreferencesInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetCryptocurrencyAssetPreferenceQuery(input=");
        sb.append(cryptocurrencyPreferencesInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.input.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery) other).input);
    }

    public final com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferencesInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferencesInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.GetCryptocurrencyAssetPreferenceQuery getCryptocurrencyAssetPreferenceQuery, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferencesInput cryptocurrencyPreferencesInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cryptocurrencyPreferencesInput = getCryptocurrencyAssetPreferenceQuery.input;
        }
        return getCryptocurrencyAssetPreferenceQuery.copy(cryptocurrencyPreferencesInput);
    }
}
