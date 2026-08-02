package com.paypal.oslo.feature.cryptocurrency.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/CreateCryptocurrencyRolloverMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/CreateCryptocurrencyRolloverMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/RolloverCryptocurrencyInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RolloverCryptocurrencyInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RolloverCryptocurrencyInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RolloverCryptocurrencyInput;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/CreateCryptocurrencyRolloverMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/RolloverCryptocurrencyInput;", "getInput", "Companion", "Data", "RolloverCryptocurrency"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CreateCryptocurrencyRolloverMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.Data> {
    public static final java.lang.String OPERATION_ID = "9fdf7e8406ce9b97531096b2772b0ee6dbdb96c9c33a3979598c025d26435e90";
    public static final java.lang.String OPERATION_NAME = "CreateCryptocurrencyRollover";
    private final com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.Companion INSTANCE = new com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.Companion(null);
    public static final int $stable = 8;

    public CreateCryptocurrencyRolloverMutation(com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyInput rolloverCryptocurrencyInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rolloverCryptocurrencyInput, "");
        this.input = rolloverCryptocurrencyInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyInput getInput() {
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
        com.paypal.oslo.feature.cryptocurrency.graphql.adapter.CreateCryptocurrencyRolloverMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.cryptocurrency.graphql.adapter.CreateCryptocurrencyRolloverMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.cryptocurrency.graphql.selections.CreateCryptocurrencyRolloverMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/CreateCryptocurrencyRolloverMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/CreateCryptocurrencyRolloverMutation$RolloverCryptocurrency;", "rolloverCryptocurrency", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/CreateCryptocurrencyRolloverMutation$RolloverCryptocurrency;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/graphql/CreateCryptocurrencyRolloverMutation$RolloverCryptocurrency;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/CreateCryptocurrencyRolloverMutation$RolloverCryptocurrency;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/CreateCryptocurrencyRolloverMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/graphql/CreateCryptocurrencyRolloverMutation$RolloverCryptocurrency;", "getRolloverCryptocurrency"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.RolloverCryptocurrency rolloverCryptocurrency;

        public Data(com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.RolloverCryptocurrency rolloverCryptocurrency) {
            this.rolloverCryptocurrency = rolloverCryptocurrency;
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.RolloverCryptocurrency getRolloverCryptocurrency() {
            return this.rolloverCryptocurrency;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.RolloverCryptocurrency rolloverCryptocurrency = this.rolloverCryptocurrency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(rolloverCryptocurrency=");
            sb.append(rolloverCryptocurrency);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.RolloverCryptocurrency rolloverCryptocurrency = this.rolloverCryptocurrency;
            if (rolloverCryptocurrency == null) {
                return 0;
            }
            return rolloverCryptocurrency.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.rolloverCryptocurrency, ((com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.Data) other).rolloverCryptocurrency);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.Data copy(com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.RolloverCryptocurrency rolloverCryptocurrency) {
            return new com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.Data(rolloverCryptocurrency);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.RolloverCryptocurrency getRolloverCryptocurrency() {
            return this.rolloverCryptocurrency;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.Data copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.Data data, com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.RolloverCryptocurrency rolloverCryptocurrency, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                rolloverCryptocurrency = data.rolloverCryptocurrency;
            }
            return data.copy(rolloverCryptocurrency);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/CreateCryptocurrencyRolloverMutation$RolloverCryptocurrency;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/graphql/CreateCryptocurrencyRolloverMutation$RolloverCryptocurrency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RolloverCryptocurrency {
        public static final int $stable = 0;
        private final java.lang.String id;

        public RolloverCryptocurrency(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RolloverCryptocurrency(id=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.RolloverCryptocurrency) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.RolloverCryptocurrency) other).id);
        }

        public final com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.RolloverCryptocurrency copy(java.lang.String id) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            return new com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.RolloverCryptocurrency(id);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.RolloverCryptocurrency copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.RolloverCryptocurrency rolloverCryptocurrency, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = rolloverCryptocurrency.id;
            }
            return rolloverCryptocurrency.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/CreateCryptocurrencyRolloverMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation CreateCryptocurrencyRollover($input: RolloverCryptocurrencyInput!) { rolloverCryptocurrency(input: $input) { id } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyInput rolloverCryptocurrencyInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateCryptocurrencyRolloverMutation(input=");
        sb.append(rolloverCryptocurrencyInput);
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
        return (other instanceof com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation) other).input);
    }

    public final com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation copy(com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation copy$default(com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation createCryptocurrencyRolloverMutation, com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyInput rolloverCryptocurrencyInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            rolloverCryptocurrencyInput = createCryptocurrencyRolloverMutation.input;
        }
        return createCryptocurrencyRolloverMutation.copy(rolloverCryptocurrencyInput);
    }
}
