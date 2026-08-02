package com.paypal.oslo.feature.debitcard.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentPinQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentPinQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinInput;)Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentPinQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPinInput;", "getInput", "Companion", "Data", "DebitInstrumentPin"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GetDebitInstrumentPinQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.Data> {
    public static final java.lang.String OPERATION_ID = "ebc48ec2211781ca228d4fb0e8fa35145b5e8044d118b6df66299a8854981deb";
    public static final java.lang.String OPERATION_NAME = "GetDebitInstrumentPin";
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.Companion(null);
    public static final int $stable = 8;

    public GetDebitInstrumentPinQuery(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinInput debitInstrumentPinInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentPinInput, "");
        this.input = debitInstrumentPinInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinInput getInput() {
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
        com.paypal.oslo.feature.debitcard.graphql.adapter.GetDebitInstrumentPinQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.debitcard.graphql.adapter.GetDebitInstrumentPinQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.debitcard.graphql.selections.GetDebitInstrumentPinQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentPinQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentPinQuery$DebitInstrumentPin;", "debitInstrumentPin", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentPinQuery$DebitInstrumentPin;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentPinQuery$DebitInstrumentPin;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentPinQuery$DebitInstrumentPin;)Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentPinQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentPinQuery$DebitInstrumentPin;", "getDebitInstrumentPin"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.DebitInstrumentPin debitInstrumentPin;

        public Data(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.DebitInstrumentPin debitInstrumentPin) {
            this.debitInstrumentPin = debitInstrumentPin;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.DebitInstrumentPin getDebitInstrumentPin() {
            return this.debitInstrumentPin;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.DebitInstrumentPin debitInstrumentPin = this.debitInstrumentPin;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(debitInstrumentPin=");
            sb.append(debitInstrumentPin);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.DebitInstrumentPin debitInstrumentPin = this.debitInstrumentPin;
            if (debitInstrumentPin == null) {
                return 0;
            }
            return debitInstrumentPin.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentPin, ((com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.Data) other).debitInstrumentPin);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.Data copy(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.DebitInstrumentPin debitInstrumentPin) {
            return new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.Data(debitInstrumentPin);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.DebitInstrumentPin getDebitInstrumentPin() {
            return this.debitInstrumentPin;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.Data copy$default(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.Data data, com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.DebitInstrumentPin debitInstrumentPin, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrumentPin = data.debitInstrumentPin;
            }
            return data.copy(debitInstrumentPin);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentPinQuery$DebitInstrumentPin;", "", "", "__typename", "pin", "", "expiresInSec", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentPinFragment;", "debitInstrumentPinFragment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentPinFragment;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentPinFragment;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentPinFragment;)Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentPinQuery$DebitInstrumentPin;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "getPin", "Ljava/lang/Integer;", "getExpiresInSec", "Lcom/paypal/oslo/feature/debitcard/graphql/fragment/DebitInstrumentPinFragment;", "getDebitInstrumentPinFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DebitInstrumentPin {
        public static final int $stable = 0;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPinFragment debitInstrumentPinFragment;
        private final java.lang.Integer expiresInSec;
        private final java.lang.String pin;

        public DebitInstrumentPin(java.lang.String str, java.lang.String str2, java.lang.Integer num, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPinFragment debitInstrumentPinFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentPinFragment, "");
            this.__typename = str;
            this.pin = str2;
            this.expiresInSec = num;
            this.debitInstrumentPinFragment = debitInstrumentPinFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final java.lang.String getPin() {
            return this.pin;
        }

        public final java.lang.Integer getExpiresInSec() {
            return this.expiresInSec;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPinFragment getDebitInstrumentPinFragment() {
            return this.debitInstrumentPinFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            java.lang.String str2 = this.pin;
            java.lang.Integer num = this.expiresInSec;
            com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPinFragment debitInstrumentPinFragment = this.debitInstrumentPinFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentPin(__typename=");
            sb.append(str);
            sb.append(", pin=");
            sb.append(str2);
            sb.append(", expiresInSec=");
            sb.append(num);
            sb.append(", debitInstrumentPinFragment=");
            sb.append(debitInstrumentPinFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            java.lang.String str = this.pin;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.Integer num = this.expiresInSec;
            return (((((hashCode * 31) + hashCode2) * 31) + (num != null ? num.hashCode() : 0)) * 31) + this.debitInstrumentPinFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.DebitInstrumentPin)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.DebitInstrumentPin debitInstrumentPin = (com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.DebitInstrumentPin) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, debitInstrumentPin.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.pin, debitInstrumentPin.pin) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiresInSec, debitInstrumentPin.expiresInSec) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentPinFragment, debitInstrumentPin.debitInstrumentPinFragment);
        }

        public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.DebitInstrumentPin copy(java.lang.String __typename, java.lang.String pin, java.lang.Integer expiresInSec, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPinFragment debitInstrumentPinFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentPinFragment, "");
            return new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.DebitInstrumentPin(__typename, pin, expiresInSec, debitInstrumentPinFragment);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPinFragment getDebitInstrumentPinFragment() {
            return this.debitInstrumentPinFragment;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getExpiresInSec() {
            return this.expiresInSec;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPin() {
            return this.pin;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.DebitInstrumentPin copy$default(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery.DebitInstrumentPin debitInstrumentPin, java.lang.String str, java.lang.String str2, java.lang.Integer num, com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPinFragment debitInstrumentPinFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = debitInstrumentPin.__typename;
            }
            if ((i & 2) != 0) {
                str2 = debitInstrumentPin.pin;
            }
            if ((i & 4) != 0) {
                num = debitInstrumentPin.expiresInSec;
            }
            if ((i & 8) != 0) {
                debitInstrumentPinFragment = debitInstrumentPin.debitInstrumentPinFragment;
            }
            return debitInstrumentPin.copy(str, str2, num, debitInstrumentPinFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/graphql/GetDebitInstrumentPinQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetDebitInstrumentPin($input: DebitInstrumentPinInput!) { debitInstrumentPin(input: $input) { __typename ...DebitInstrumentPinFragment pin expiresInSec } }  fragment DebitInstrumentPinFragment on DebitInstrumentPin { status profileName origin }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinInput debitInstrumentPinInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetDebitInstrumentPinQuery(input=");
        sb.append(debitInstrumentPinInput);
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
        return (other instanceof com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery) other).input);
    }

    public final com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery copy$default(com.paypal.oslo.feature.debitcard.graphql.GetDebitInstrumentPinQuery getDebitInstrumentPinQuery, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinInput debitInstrumentPinInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitInstrumentPinInput = getDebitInstrumentPinQuery.input;
        }
        return getDebitInstrumentPinQuery.copy(debitInstrumentPinInput);
    }
}
