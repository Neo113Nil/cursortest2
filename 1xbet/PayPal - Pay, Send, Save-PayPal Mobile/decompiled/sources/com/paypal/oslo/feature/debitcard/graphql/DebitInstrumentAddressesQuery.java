package com.paypal.oslo.feature.debitcard.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentAddressesQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentAddressesQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentAddressesInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentAddressesInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentAddressesInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentAddressesInput;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentAddressesQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentAddressesInput;", "getInput", "Companion", "Data", "DebitInstrumentAddress", "Address"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitInstrumentAddressesQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Data> {
    public static final java.lang.String OPERATION_ID = "69c65fd3b652df394d70339616e75f92cb4eed1a6f1d4c5fe5ea855e2abdadb0";
    public static final java.lang.String OPERATION_NAME = "DebitInstrumentAddresses";
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentAddressesInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Companion(null);
    public static final int $stable = 8;

    public DebitInstrumentAddressesQuery(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentAddressesInput debitInstrumentAddressesInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentAddressesInput, "");
        this.input = debitInstrumentAddressesInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentAddressesInput getInput() {
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
        com.paypal.oslo.feature.debitcard.graphql.adapter.DebitInstrumentAddressesQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.DebitInstrumentAddressesQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.debitcard.graphql.selections.DebitInstrumentAddressesQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentAddressesQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentAddressesQuery$DebitInstrumentAddress;", "debitInstrumentAddresses", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentAddressesQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getDebitInstrumentAddresses"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.DebitInstrumentAddress> debitInstrumentAddresses;

        public Data(java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.DebitInstrumentAddress> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.debitInstrumentAddresses = list;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.DebitInstrumentAddress> getDebitInstrumentAddresses() {
            return this.debitInstrumentAddresses;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.DebitInstrumentAddress> list = this.debitInstrumentAddresses;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(debitInstrumentAddresses=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.debitInstrumentAddresses.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentAddresses, ((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Data) other).debitInstrumentAddresses);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Data copy(java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.DebitInstrumentAddress> debitInstrumentAddresses) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentAddresses, "");
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Data(debitInstrumentAddresses);
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.DebitInstrumentAddress> component1() {
            return this.debitInstrumentAddresses;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Data copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Data data, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = data.debitInstrumentAddresses;
            }
            return data.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JL\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentAddressesQuery$DebitInstrumentAddress;", "", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentAddressesQuery$Address;", "address", "", "", "displayAddress", "normalizationInvalidFields", "id", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentAddressesQuery$Address;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentAddressesQuery$Address;", "component2", "()Ljava/util/List;", "component3", "component4", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentAddressesQuery$Address;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentAddressesQuery$DebitInstrumentAddress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentAddressesQuery$Address;", "getAddress", "Ljava/util/List;", "getDisplayAddress", "getNormalizationInvalidFields", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DebitInstrumentAddress {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Address address;
        private final java.util.List<java.lang.String> displayAddress;
        private final java.lang.String id;
        private final java.util.List<java.lang.String> normalizationInvalidFields;

        public DebitInstrumentAddress(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Address address, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.lang.String str) {
            this.address = address;
            this.displayAddress = list;
            this.normalizationInvalidFields = list2;
            this.id = str;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Address getAddress() {
            return this.address;
        }

        public final java.util.List<java.lang.String> getDisplayAddress() {
            return this.displayAddress;
        }

        public final java.util.List<java.lang.String> getNormalizationInvalidFields() {
            return this.normalizationInvalidFields;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Address address = this.address;
            java.util.List<java.lang.String> list = this.displayAddress;
            java.util.List<java.lang.String> list2 = this.normalizationInvalidFields;
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentAddress(address=");
            sb.append(address);
            sb.append(", displayAddress=");
            sb.append(list);
            sb.append(", normalizationInvalidFields=");
            sb.append(list2);
            sb.append(", id=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Address address = this.address;
            int hashCode = address == null ? 0 : address.hashCode();
            java.util.List<java.lang.String> list = this.displayAddress;
            int hashCode2 = list == null ? 0 : list.hashCode();
            java.util.List<java.lang.String> list2 = this.normalizationInvalidFields;
            int hashCode3 = list2 == null ? 0 : list2.hashCode();
            java.lang.String str = this.id;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.DebitInstrumentAddress)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.DebitInstrumentAddress debitInstrumentAddress = (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.DebitInstrumentAddress) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.address, debitInstrumentAddress.address) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayAddress, debitInstrumentAddress.displayAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.normalizationInvalidFields, debitInstrumentAddress.normalizationInvalidFields) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, debitInstrumentAddress.id);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.DebitInstrumentAddress copy(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Address address, java.util.List<java.lang.String> displayAddress, java.util.List<java.lang.String> normalizationInvalidFields, java.lang.String id) {
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.DebitInstrumentAddress(address, displayAddress, normalizationInvalidFields, id);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public final java.util.List<java.lang.String> component3() {
            return this.normalizationInvalidFields;
        }

        public final java.util.List<java.lang.String> component2() {
            return this.displayAddress;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Address getAddress() {
            return this.address;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.DebitInstrumentAddress copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.DebitInstrumentAddress debitInstrumentAddress, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Address address, java.util.List list, java.util.List list2, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                address = debitInstrumentAddress.address;
            }
            if ((i & 2) != 0) {
                list = debitInstrumentAddress.displayAddress;
            }
            if ((i & 4) != 0) {
                list2 = debitInstrumentAddress.normalizationInvalidFields;
            }
            if ((i & 8) != 0) {
                str = debitInstrumentAddress.id;
            }
            return debitInstrumentAddress.copy(address, list, list2, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentAddressesQuery$Address;", "", "", "addressLine1", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentAddressesQuery$Address;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAddressLine1"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Address {
        public static final int $stable = 0;
        private final java.lang.String addressLine1;

        public Address(java.lang.String str) {
            this.addressLine1 = str;
        }

        public final java.lang.String getAddressLine1() {
            return this.addressLine1;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.addressLine1;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Address(addressLine1=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.addressLine1;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Address) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine1, ((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Address) other).addressLine1);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Address copy(java.lang.String addressLine1) {
            return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Address(addressLine1);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAddressLine1() {
            return this.addressLine1;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Address copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Address address, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = address.addressLine1;
            }
            return address.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentAddressesQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query DebitInstrumentAddresses($input: DebitInstrumentAddressesInput!) { debitInstrumentAddresses(input: $input) { address { addressLine1 } displayAddress normalizationInvalidFields id } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentAddressesInput debitInstrumentAddressesInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentAddressesQuery(input=");
        sb.append(debitInstrumentAddressesInput);
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
        return (other instanceof com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery) other).input);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentAddressesInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentAddressesInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery copy$default(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery debitInstrumentAddressesQuery, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentAddressesInput debitInstrumentAddressesInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitInstrumentAddressesInput = debitInstrumentAddressesQuery.input;
        }
        return debitInstrumentAddressesQuery.copy(debitInstrumentAddressesInput);
    }
}
