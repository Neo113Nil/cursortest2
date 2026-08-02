package com.paypal.oslo.feature.identity.graphql;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003+,*B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b'\u0010\nR\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/RegisterDeviceMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/identity/graphql/RegisterDeviceMutation$Data;", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/RegisterDeviceInput;", "input", "<init>", "(Lcom/apollographql/apollo/api/Optional;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/identity/graphql/RegisterDeviceMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/apollographql/apollo/api/Optional;", "getInput", "Companion", "Data", com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RegisterDeviceMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.Data> {
    public static final java.lang.String OPERATION_ID = "c32e119aa3bb2538916773b9b0a900bb0d554392f5ac3c6123d029442c209dff";
    public static final java.lang.String OPERATION_NAME = "RegisterDevice";
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RegisterDeviceInput> input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.Companion INSTANCE = new com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.Companion(null);
    public static final int $stable = 8;

    public RegisterDeviceMutation(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RegisterDeviceInput> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.input = optional;
    }

    public /* synthetic */ RegisterDeviceMutation(com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RegisterDeviceInput> getInput() {
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
        com.paypal.oslo.feature.identity.graphql.adapter.RegisterDeviceMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.identity.graphql.adapter.RegisterDeviceMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.identity.graphql.selections.RegisterDeviceMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/RegisterDeviceMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/identity/graphql/RegisterDeviceMutation$RegisterDevice;", "registerDevice", "<init>", "(Lcom/paypal/oslo/feature/identity/graphql/RegisterDeviceMutation$RegisterDevice;)V", "component1", "()Lcom/paypal/oslo/feature/identity/graphql/RegisterDeviceMutation$RegisterDevice;", "copy", "(Lcom/paypal/oslo/feature/identity/graphql/RegisterDeviceMutation$RegisterDevice;)Lcom/paypal/oslo/feature/identity/graphql/RegisterDeviceMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/graphql/RegisterDeviceMutation$RegisterDevice;", "getRegisterDevice"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.RegisterDevice registerDevice;

        public Data(com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.RegisterDevice registerDevice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registerDevice, "");
            this.registerDevice = registerDevice;
        }

        public final com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.RegisterDevice getRegisterDevice() {
            return this.registerDevice;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.RegisterDevice registerDevice = this.registerDevice;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(registerDevice=");
            sb.append(registerDevice);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.registerDevice.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.registerDevice, ((com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.Data) other).registerDevice);
        }

        public final com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.Data copy(com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.RegisterDevice registerDevice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registerDevice, "");
            return new com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.Data(registerDevice);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.RegisterDevice getRegisterDevice() {
            return this.registerDevice;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.Data copy$default(com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.Data data, com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.RegisterDevice registerDevice, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                registerDevice = data.registerDevice;
            }
            return data.copy(registerDevice);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/RegisterDeviceMutation$RegisterDevice;", "", "", "deviceId", "", "deviceConfirmed", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/identity/graphql/RegisterDeviceMutation$RegisterDevice;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDeviceId", "Ljava/lang/Boolean;", "getDeviceConfirmed"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RegisterDevice {
        public static final int $stable = 0;
        private final java.lang.Boolean deviceConfirmed;
        private final java.lang.String deviceId;

        public RegisterDevice(java.lang.String str, java.lang.Boolean bool) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.deviceId = str;
            this.deviceConfirmed = bool;
        }

        public final java.lang.String getDeviceId() {
            return this.deviceId;
        }

        public final java.lang.Boolean getDeviceConfirmed() {
            return this.deviceConfirmed;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.deviceId;
            java.lang.Boolean bool = this.deviceConfirmed;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RegisterDevice(deviceId=");
            sb.append(str);
            sb.append(", deviceConfirmed=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.deviceId.hashCode();
            java.lang.Boolean bool = this.deviceConfirmed;
            return (hashCode * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.RegisterDevice)) {
                return false;
            }
            com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.RegisterDevice registerDevice = (com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.RegisterDevice) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.deviceId, registerDevice.deviceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceConfirmed, registerDevice.deviceConfirmed);
        }

        public final com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.RegisterDevice copy(java.lang.String deviceId, java.lang.Boolean deviceConfirmed) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "");
            return new com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.RegisterDevice(deviceId, deviceConfirmed);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getDeviceConfirmed() {
            return this.deviceConfirmed;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDeviceId() {
            return this.deviceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.RegisterDevice copy$default(com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.RegisterDevice registerDevice, java.lang.String str, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = registerDevice.deviceId;
            }
            if ((i & 2) != 0) {
                bool = registerDevice.deviceConfirmed;
            }
            return registerDevice.copy(str, bool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/RegisterDeviceMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation RegisterDevice($input: RegisterDeviceInput) { registerDevice(input: $input) { deviceId deviceConfirmed } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RegisterDeviceInput> optional = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RegisterDeviceMutation(input=");
        sb.append(optional);
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
        return (other instanceof com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation) other).input);
    }

    public final com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation copy(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RegisterDeviceInput> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation(input);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RegisterDeviceInput> component1() {
        return this.input;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation copy$default(com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation registerDeviceMutation, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = registerDeviceMutation.input;
        }
        return registerDeviceMutation.copy(optional);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RegisterDeviceMutation() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
