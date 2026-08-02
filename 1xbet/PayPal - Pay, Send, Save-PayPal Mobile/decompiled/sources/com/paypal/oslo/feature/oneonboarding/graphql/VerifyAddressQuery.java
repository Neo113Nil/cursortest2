package com.paypal.oslo.feature.oneonboarding.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005*+,-)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/AddressVerificationInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/AddressVerificationInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/AddressVerificationInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/AddressVerificationInput;)Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/AddressVerificationInput;", "getInput", "Companion", "Data", "AddressVerification", "Address", "Address1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class VerifyAddressQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Data> {
    public static final java.lang.String OPERATION_ID = "436687d1e1bcf5de23b4c7c5c0b0102fb6c41f30a069c97e707e7c0c7d564318";
    public static final java.lang.String OPERATION_NAME = "VerifyAddress";
    private final com.paypal.oslo.api.graphql.schema.type.AddressVerificationInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Companion INSTANCE = new com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Companion(null);
    public static final int $stable = 8;

    public VerifyAddressQuery(com.paypal.oslo.api.graphql.schema.type.AddressVerificationInput addressVerificationInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressVerificationInput, "");
        this.input = addressVerificationInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AddressVerificationInput getInput() {
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
        com.paypal.oslo.feature.oneonboarding.graphql.adapter.VerifyAddressQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.oneonboarding.graphql.adapter.VerifyAddressQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.oneonboarding.graphql.selections.VerifyAddressQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$AddressVerification;", "addressVerification", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$AddressVerification;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$AddressVerification;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$AddressVerification;)Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$AddressVerification;", "getAddressVerification"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.AddressVerification addressVerification;

        public Data(com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.AddressVerification addressVerification) {
            this.addressVerification = addressVerification;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.AddressVerification getAddressVerification() {
            return this.addressVerification;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.AddressVerification addressVerification = this.addressVerification;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(addressVerification=");
            sb.append(addressVerification);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.AddressVerification addressVerification = this.addressVerification;
            if (addressVerification == null) {
                return 0;
            }
            return addressVerification.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressVerification, ((com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Data) other).addressVerification);
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Data copy(com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.AddressVerification addressVerification) {
            return new com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Data(addressVerification);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.AddressVerification getAddressVerification() {
            return this.addressVerification;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Data copy$default(com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Data data, com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.AddressVerification addressVerification, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addressVerification = data.addressVerification;
            }
            return data.copy(addressVerification);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$AddressVerification;", "", "Lcom/paypal/oslo/api/graphql/schema/type/AddressVerifyStatus;", "status", "Lcom/paypal/oslo/api/graphql/schema/type/AddressType;", "addressType", "Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$Address;", "address", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/AddressVerifyStatus;Lcom/paypal/oslo/api/graphql/schema/type/AddressType;Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$Address;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/AddressVerifyStatus;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/AddressType;", "component3", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$Address;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/AddressVerifyStatus;Lcom/paypal/oslo/api/graphql/schema/type/AddressType;Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$Address;)Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$AddressVerification;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/AddressVerifyStatus;", "getStatus", "Lcom/paypal/oslo/api/graphql/schema/type/AddressType;", "getAddressType", "Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$Address;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressVerification {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address address;
        private final com.paypal.oslo.api.graphql.schema.type.AddressType addressType;
        private final com.paypal.oslo.api.graphql.schema.type.AddressVerifyStatus status;

        public AddressVerification(com.paypal.oslo.api.graphql.schema.type.AddressVerifyStatus addressVerifyStatus, com.paypal.oslo.api.graphql.schema.type.AddressType addressType, com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address address) {
            this.status = addressVerifyStatus;
            this.addressType = addressType;
            this.address = address;
        }

        public final com.paypal.oslo.api.graphql.schema.type.AddressVerifyStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.api.graphql.schema.type.AddressType getAddressType() {
            return this.addressType;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address getAddress() {
            return this.address;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.AddressVerifyStatus addressVerifyStatus = this.status;
            com.paypal.oslo.api.graphql.schema.type.AddressType addressType = this.addressType;
            com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address address = this.address;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressVerification(status=");
            sb.append(addressVerifyStatus);
            sb.append(", addressType=");
            sb.append(addressType);
            sb.append(", address=");
            sb.append(address);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.AddressVerifyStatus addressVerifyStatus = this.status;
            int hashCode = addressVerifyStatus == null ? 0 : addressVerifyStatus.hashCode();
            com.paypal.oslo.api.graphql.schema.type.AddressType addressType = this.addressType;
            int hashCode2 = addressType == null ? 0 : addressType.hashCode();
            com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address address = this.address;
            return (((hashCode * 31) + hashCode2) * 31) + (address != null ? address.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.AddressVerification)) {
                return false;
            }
            com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.AddressVerification addressVerification = (com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.AddressVerification) other;
            return this.status == addressVerification.status && this.addressType == addressVerification.addressType && kotlin.jvm.internal.Intrinsics.areEqual(this.address, addressVerification.address);
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.AddressVerification copy(com.paypal.oslo.api.graphql.schema.type.AddressVerifyStatus status, com.paypal.oslo.api.graphql.schema.type.AddressType addressType, com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address address) {
            return new com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.AddressVerification(status, addressType, address);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address getAddress() {
            return this.address;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.AddressType getAddressType() {
            return this.addressType;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.AddressVerifyStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.AddressVerification copy$default(com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.AddressVerification addressVerification, com.paypal.oslo.api.graphql.schema.type.AddressVerifyStatus addressVerifyStatus, com.paypal.oslo.api.graphql.schema.type.AddressType addressType, com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address address, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addressVerifyStatus = addressVerification.status;
            }
            if ((i & 2) != 0) {
                addressType = addressVerification.addressType;
            }
            if ((i & 4) != 0) {
                address = addressVerification.address;
            }
            return addressVerification.copy(addressVerifyStatus, addressType, address);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$Address;", "", "Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$Address1;", "address", "", "completeAddress", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$Address1;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$Address1;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$Address1;Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$Address;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$Address1;", "getAddress", "Ljava/lang/String;", "getCompleteAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Address {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address1 address;
        private final java.lang.String completeAddress;

        public Address(com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address1 address1, java.lang.String str) {
            this.address = address1;
            this.completeAddress = str;
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address1 getAddress() {
            return this.address;
        }

        public final java.lang.String getCompleteAddress() {
            return this.completeAddress;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address1 address1 = this.address;
            java.lang.String str = this.completeAddress;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Address(address=");
            sb.append(address1);
            sb.append(", completeAddress=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address1 address1 = this.address;
            int hashCode = address1 == null ? 0 : address1.hashCode();
            java.lang.String str = this.completeAddress;
            return (hashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address)) {
                return false;
            }
            com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address address = (com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.address, address.address) && kotlin.jvm.internal.Intrinsics.areEqual(this.completeAddress, address.completeAddress);
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address copy(com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address1 address, java.lang.String completeAddress) {
            return new com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address(address, completeAddress);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCompleteAddress() {
            return this.completeAddress;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address1 getAddress() {
            return this.address;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address copy$default(com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address address, com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address1 address1, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                address1 = address.address;
            }
            if ((i & 2) != 0) {
                str = address.completeAddress;
            }
            return address.copy(address1, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018Jz\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b*\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b+\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$Address1;", "", "", "addressLine1", "addressLine2", "addressLine3", "adminArea1", "adminArea2", "adminArea3", "adminArea4", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$Address1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAddressLine1", "getAddressLine2", "getAddressLine3", "getAdminArea1", "getAdminArea2", "getAdminArea3", "getAdminArea4", "getPostalCode", "Ljava/lang/Object;", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            if (!(other instanceof com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address1)) {
                return false;
            }
            com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address1 address1 = (com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine1, address1.addressLine1) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine2, address1.addressLine2) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine3, address1.addressLine3) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea1, address1.adminArea1) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea2, address1.adminArea2) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea3, address1.adminArea3) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea4, address1.adminArea4) && kotlin.jvm.internal.Intrinsics.areEqual(this.postalCode, address1.postalCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, address1.countryCode);
        }

        public final com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address1 copy(java.lang.String addressLine1, java.lang.String addressLine2, java.lang.String addressLine3, java.lang.String adminArea1, java.lang.String adminArea2, java.lang.String adminArea3, java.lang.String adminArea4, java.lang.String postalCode, java.lang.Object countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery.Address1(addressLine1, addressLine2, addressLine3, adminArea1, adminArea2, adminArea3, adminArea4, postalCode, countryCode);
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

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/VerifyAddressQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query VerifyAddress($input: AddressVerificationInput!) { addressVerification(input: $input) { status addressType address { address { addressLine1 addressLine2 addressLine3 adminArea1 adminArea2 adminArea3 adminArea4 postalCode countryCode } completeAddress } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.AddressVerificationInput addressVerificationInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VerifyAddressQuery(input=");
        sb.append(addressVerificationInput);
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
        return (other instanceof com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery) other).input);
    }

    public final com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery copy(com.paypal.oslo.api.graphql.schema.type.AddressVerificationInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AddressVerificationInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery copy$default(com.paypal.oslo.feature.oneonboarding.graphql.VerifyAddressQuery verifyAddressQuery, com.paypal.oslo.api.graphql.schema.type.AddressVerificationInput addressVerificationInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            addressVerificationInput = verifyAddressQuery.input;
        }
        return verifyAddressQuery.copy(addressVerificationInput);
    }
}
