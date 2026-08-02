package com.paypal.oslo.feature.oneonboarding.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/AddressSuggestionInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/AddressSuggestionInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/AddressSuggestionInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/AddressSuggestionInput;)Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/AddressSuggestionInput;", "getInput", "Companion", "Data", "AddressSuggestions", "Address", "Address1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GetAddressSuggestionsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Data> {
    public static final java.lang.String OPERATION_ID = "182520e46955a57a2460353141e00bd2acea75c6729446ad04967acf4dc3e9b4";
    public static final java.lang.String OPERATION_NAME = "GetAddressSuggestions";
    private final com.paypal.oslo.api.graphql.schema.type.AddressSuggestionInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Companion INSTANCE = new com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Companion(null);
    public static final int $stable = 8;

    public GetAddressSuggestionsQuery(com.paypal.oslo.api.graphql.schema.type.AddressSuggestionInput addressSuggestionInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressSuggestionInput, "");
        this.input = addressSuggestionInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AddressSuggestionInput getInput() {
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
        com.paypal.oslo.feature.oneonboarding.graphql.adapter.GetAddressSuggestionsQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.oneonboarding.graphql.adapter.GetAddressSuggestionsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.oneonboarding.graphql.selections.GetAddressSuggestionsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$AddressSuggestions;", "addressSuggestions", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$AddressSuggestions;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$AddressSuggestions;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$AddressSuggestions;)Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$AddressSuggestions;", "getAddressSuggestions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.AddressSuggestions addressSuggestions;

        public Data(com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.AddressSuggestions addressSuggestions) {
            this.addressSuggestions = addressSuggestions;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.AddressSuggestions getAddressSuggestions() {
            return this.addressSuggestions;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.AddressSuggestions addressSuggestions = this.addressSuggestions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(addressSuggestions=");
            sb.append(addressSuggestions);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.AddressSuggestions addressSuggestions = this.addressSuggestions;
            if (addressSuggestions == null) {
                return 0;
            }
            return addressSuggestions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressSuggestions, ((com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Data) other).addressSuggestions);
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Data copy(com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.AddressSuggestions addressSuggestions) {
            return new com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Data(addressSuggestions);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.AddressSuggestions getAddressSuggestions() {
            return this.addressSuggestions;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Data copy$default(com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Data data, com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.AddressSuggestions addressSuggestions, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addressSuggestions = data.addressSuggestions;
            }
            return data.copy(addressSuggestions);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$AddressSuggestions;", "", "", "Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$Address;", "addresses", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$AddressSuggestions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getAddresses"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressSuggestions {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address> addresses;

        public AddressSuggestions(java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.addresses = list;
        }

        public final java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address> getAddresses() {
            return this.addresses;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address> list = this.addresses;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressSuggestions(addresses=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.addresses.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.AddressSuggestions) && kotlin.jvm.internal.Intrinsics.areEqual(this.addresses, ((com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.AddressSuggestions) other).addresses);
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.AddressSuggestions copy(java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address> addresses) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addresses, "");
            return new com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.AddressSuggestions(addresses);
        }

        public final java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address> component1() {
            return this.addresses;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.AddressSuggestions copy$default(com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.AddressSuggestions addressSuggestions, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = addressSuggestions.addresses;
            }
            return addressSuggestions.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JP\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b&\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$Address;", "", "Lcom/paypal/oslo/api/graphql/schema/type/AddressType;", "addressType", "", "", "formattedAddress", "completeAddress", "openLocationCode", "Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$Address1;", "address", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/AddressType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$Address1;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/AddressType;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$Address1;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/AddressType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$Address1;)Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$Address;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/AddressType;", "getAddressType", "Ljava/util/List;", "getFormattedAddress", "Ljava/lang/String;", "getCompleteAddress", "getOpenLocationCode", "Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$Address1;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Address {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address1 address;
        private final com.paypal.oslo.api.graphql.schema.type.AddressType addressType;
        private final java.lang.String completeAddress;
        private final java.util.List<java.lang.String> formattedAddress;
        private final java.lang.String openLocationCode;

        public Address(com.paypal.oslo.api.graphql.schema.type.AddressType addressType, java.util.List<java.lang.String> list, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address1 address1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address1, "");
            this.addressType = addressType;
            this.formattedAddress = list;
            this.completeAddress = str;
            this.openLocationCode = str2;
            this.address = address1;
        }

        public final com.paypal.oslo.api.graphql.schema.type.AddressType getAddressType() {
            return this.addressType;
        }

        public final java.util.List<java.lang.String> getFormattedAddress() {
            return this.formattedAddress;
        }

        public final java.lang.String getCompleteAddress() {
            return this.completeAddress;
        }

        public final java.lang.String getOpenLocationCode() {
            return this.openLocationCode;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address1 getAddress() {
            return this.address;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.AddressType addressType = this.addressType;
            java.util.List<java.lang.String> list = this.formattedAddress;
            java.lang.String str = this.completeAddress;
            java.lang.String str2 = this.openLocationCode;
            com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address1 address1 = this.address;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Address(addressType=");
            sb.append(addressType);
            sb.append(", formattedAddress=");
            sb.append(list);
            sb.append(", completeAddress=");
            sb.append(str);
            sb.append(", openLocationCode=");
            sb.append(str2);
            sb.append(", address=");
            sb.append(address1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.AddressType addressType = this.addressType;
            int hashCode = addressType == null ? 0 : addressType.hashCode();
            java.util.List<java.lang.String> list = this.formattedAddress;
            int hashCode2 = list == null ? 0 : list.hashCode();
            java.lang.String str = this.completeAddress;
            int hashCode3 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.openLocationCode;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.address.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address)) {
                return false;
            }
            com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address address = (com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address) other;
            return this.addressType == address.addressType && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAddress, address.formattedAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.completeAddress, address.completeAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.openLocationCode, address.openLocationCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, address.address);
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address copy(com.paypal.oslo.api.graphql.schema.type.AddressType addressType, java.util.List<java.lang.String> formattedAddress, java.lang.String completeAddress, java.lang.String openLocationCode, com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address1 address) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            return new com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address(addressType, formattedAddress, completeAddress, openLocationCode, address);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address1 getAddress() {
            return this.address;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getOpenLocationCode() {
            return this.openLocationCode;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCompleteAddress() {
            return this.completeAddress;
        }

        public final java.util.List<java.lang.String> component2() {
            return this.formattedAddress;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.AddressType getAddressType() {
            return this.addressType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address copy$default(com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address address, com.paypal.oslo.api.graphql.schema.type.AddressType addressType, java.util.List list, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address1 address1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addressType = address.addressType;
            }
            if ((i & 2) != 0) {
                list = address.formattedAddress;
            }
            java.util.List list2 = list;
            if ((i & 4) != 0) {
                str = address.completeAddress;
            }
            java.lang.String str3 = str;
            if ((i & 8) != 0) {
                str2 = address.openLocationCode;
            }
            java.lang.String str4 = str2;
            if ((i & 16) != 0) {
                address1 = address.address;
            }
            return address.copy(addressType, list2, str3, str4, address1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018Jz\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b*\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b+\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$Address1;", "", "", "addressLine1", "addressLine2", "addressLine3", "adminArea1", "adminArea2", "adminArea3", "adminArea4", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$Address1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAddressLine1", "getAddressLine2", "getAddressLine3", "getAdminArea1", "getAdminArea2", "getAdminArea3", "getAdminArea4", "getPostalCode", "Ljava/lang/Object;", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Address1 {
        public static final int $stable = 8;
        private final java.lang.String addressLine1;
        private final java.lang.String addressLine2;
        private final java.lang.String addressLine3;
        private final java.lang.String adminArea1;
        private final java.lang.String adminArea2;
        private final java.lang.String adminArea3;
        private final java.lang.String adminArea4;
        private final java.lang.Object countryCode;
        private final java.lang.String postalCode;

        public Address1(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.addressLine1 = str;
            this.addressLine2 = str2;
            this.addressLine3 = str3;
            this.adminArea1 = str4;
            this.adminArea2 = str5;
            this.adminArea3 = str6;
            this.adminArea4 = str7;
            this.postalCode = str8;
            this.countryCode = obj;
        }

        public final java.lang.String getAddressLine1() {
            return this.addressLine1;
        }

        public final java.lang.String getAddressLine2() {
            return this.addressLine2;
        }

        public final java.lang.String getAddressLine3() {
            return this.addressLine3;
        }

        public final java.lang.String getAdminArea1() {
            return this.adminArea1;
        }

        public final java.lang.String getAdminArea2() {
            return this.adminArea2;
        }

        public final java.lang.String getAdminArea3() {
            return this.adminArea3;
        }

        public final java.lang.String getAdminArea4() {
            return this.adminArea4;
        }

        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.addressLine1;
            java.lang.String str2 = this.addressLine2;
            java.lang.String str3 = this.addressLine3;
            java.lang.String str4 = this.adminArea1;
            java.lang.String str5 = this.adminArea2;
            java.lang.String str6 = this.adminArea3;
            java.lang.String str7 = this.adminArea4;
            java.lang.String str8 = this.postalCode;
            java.lang.Object obj = this.countryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Address1(addressLine1=");
            sb.append(str);
            sb.append(", addressLine2=");
            sb.append(str2);
            sb.append(", addressLine3=");
            sb.append(str3);
            sb.append(", adminArea1=");
            sb.append(str4);
            sb.append(", adminArea2=");
            sb.append(str5);
            sb.append(", adminArea3=");
            sb.append(str6);
            sb.append(", adminArea4=");
            sb.append(str7);
            sb.append(", postalCode=");
            sb.append(str8);
            sb.append(", countryCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.addressLine1;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.addressLine2;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.addressLine3;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.adminArea1;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.adminArea2;
            int hashCode5 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.adminArea3;
            int hashCode6 = str6 == null ? 0 : str6.hashCode();
            java.lang.String str7 = this.adminArea4;
            int hashCode7 = str7 == null ? 0 : str7.hashCode();
            java.lang.String str8 = this.postalCode;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str8 != null ? str8.hashCode() : 0)) * 31) + this.countryCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address1)) {
                return false;
            }
            com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address1 address1 = (com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine1, address1.addressLine1) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine2, address1.addressLine2) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine3, address1.addressLine3) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea1, address1.adminArea1) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea2, address1.adminArea2) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea3, address1.adminArea3) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea4, address1.adminArea4) && kotlin.jvm.internal.Intrinsics.areEqual(this.postalCode, address1.postalCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, address1.countryCode);
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address1 copy(java.lang.String addressLine1, java.lang.String addressLine2, java.lang.String addressLine3, java.lang.String adminArea1, java.lang.String adminArea2, java.lang.String adminArea3, java.lang.String adminArea4, java.lang.String postalCode, java.lang.Object countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery.Address1(addressLine1, addressLine2, addressLine3, adminArea1, adminArea2, adminArea3, adminArea4, postalCode, countryCode);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.Object getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getPostalCode() {
            return this.postalCode;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getAdminArea4() {
            return this.adminArea4;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getAdminArea3() {
            return this.adminArea3;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getAdminArea2() {
            return this.adminArea2;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAdminArea1() {
            return this.adminArea1;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAddressLine3() {
            return this.addressLine3;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAddressLine2() {
            return this.addressLine2;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAddressLine1() {
            return this.addressLine1;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/GetAddressSuggestionsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetAddressSuggestions($input: AddressSuggestionInput!) { addressSuggestions(input: $input) { addresses { addressType formattedAddress completeAddress openLocationCode address { addressLine1 addressLine2 addressLine3 adminArea1 adminArea2 adminArea3 adminArea4 postalCode countryCode } } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.AddressSuggestionInput addressSuggestionInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetAddressSuggestionsQuery(input=");
        sb.append(addressSuggestionInput);
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
        return (other instanceof com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery) other).input);
    }

    public final com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery copy(com.paypal.oslo.api.graphql.schema.type.AddressSuggestionInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AddressSuggestionInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery copy$default(com.paypal.oslo.feature.oneonboarding.graphql.GetAddressSuggestionsQuery getAddressSuggestionsQuery, com.paypal.oslo.api.graphql.schema.type.AddressSuggestionInput addressSuggestionInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            addressSuggestionInput = getAddressSuggestionsQuery.input;
        }
        return getAddressSuggestionsQuery.copy(addressSuggestionInput);
    }
}
