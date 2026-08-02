package com.paypal.oslo.feature.wallet.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/InitiateExternalBankAccessMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/wallet/graphql/InitiateExternalBankAccessMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/InitiateExternalBankAccessInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/InitiateExternalBankAccessInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/InitiateExternalBankAccessInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/InitiateExternalBankAccessInput;)Lcom/paypal/oslo/feature/wallet/graphql/InitiateExternalBankAccessMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/InitiateExternalBankAccessInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class InitiateExternalBankAccessMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.Data> {
    public static final java.lang.String OPERATION_ID = "26e650567bf949b7666b3ec738fcb661cbeb6afad54c786c00c349c73d7b0daa";
    public static final java.lang.String OPERATION_NAME = "InitiateExternalBankAccess";
    private final com.paypal.oslo.api.graphql.schema.type.InitiateExternalBankAccessInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.Companion INSTANCE = new com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.Companion(null);
    public static final int $stable = 8;

    public InitiateExternalBankAccessMutation(com.paypal.oslo.api.graphql.schema.type.InitiateExternalBankAccessInput initiateExternalBankAccessInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initiateExternalBankAccessInput, "");
        this.input = initiateExternalBankAccessInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.InitiateExternalBankAccessInput getInput() {
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
        com.paypal.oslo.feature.wallet.graphql.adapter.InitiateExternalBankAccessMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.wallet.graphql.adapter.InitiateExternalBankAccessMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.wallet.graphql.selections.InitiateExternalBankAccessMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/InitiateExternalBankAccessMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/wallet/graphql/InitiateExternalBankAccessMutation$InitiateExternalBankAccess;", "initiateExternalBankAccess", "<init>", "(Lcom/paypal/oslo/feature/wallet/graphql/InitiateExternalBankAccessMutation$InitiateExternalBankAccess;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/graphql/InitiateExternalBankAccessMutation$InitiateExternalBankAccess;", "copy", "(Lcom/paypal/oslo/feature/wallet/graphql/InitiateExternalBankAccessMutation$InitiateExternalBankAccess;)Lcom/paypal/oslo/feature/wallet/graphql/InitiateExternalBankAccessMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/graphql/InitiateExternalBankAccessMutation$InitiateExternalBankAccess;", "getInitiateExternalBankAccess"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.InitiateExternalBankAccess initiateExternalBankAccess;

        public Data(com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.InitiateExternalBankAccess initiateExternalBankAccess) {
            this.initiateExternalBankAccess = initiateExternalBankAccess;
        }

        public final com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.InitiateExternalBankAccess getInitiateExternalBankAccess() {
            return this.initiateExternalBankAccess;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.InitiateExternalBankAccess initiateExternalBankAccess = this.initiateExternalBankAccess;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(initiateExternalBankAccess=");
            sb.append(initiateExternalBankAccess);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.InitiateExternalBankAccess initiateExternalBankAccess = this.initiateExternalBankAccess;
            if (initiateExternalBankAccess == null) {
                return 0;
            }
            return initiateExternalBankAccess.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.initiateExternalBankAccess, ((com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.Data) other).initiateExternalBankAccess);
        }

        public final com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.Data copy(com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.InitiateExternalBankAccess initiateExternalBankAccess) {
            return new com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.Data(initiateExternalBankAccess);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.InitiateExternalBankAccess getInitiateExternalBankAccess() {
            return this.initiateExternalBankAccess;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.Data copy$default(com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.Data data, com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.InitiateExternalBankAccess initiateExternalBankAccess, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                initiateExternalBankAccess = data.initiateExternalBankAccess;
            }
            return data.copy(initiateExternalBankAccess);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/InitiateExternalBankAccessMutation$InitiateExternalBankAccess;", "", "", "externalReferenceId", "connectUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/InitiateExternalBankAccessMutation$InitiateExternalBankAccess;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getExternalReferenceId", "getConnectUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InitiateExternalBankAccess {
        public static final int $stable = 0;
        private final java.lang.String connectUrl;
        private final java.lang.String externalReferenceId;

        public InitiateExternalBankAccess(java.lang.String str, java.lang.String str2) {
            this.externalReferenceId = str;
            this.connectUrl = str2;
        }

        public final java.lang.String getExternalReferenceId() {
            return this.externalReferenceId;
        }

        public final java.lang.String getConnectUrl() {
            return this.connectUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.externalReferenceId;
            java.lang.String str2 = this.connectUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InitiateExternalBankAccess(externalReferenceId=");
            sb.append(str);
            sb.append(", connectUrl=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.externalReferenceId;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.connectUrl;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.InitiateExternalBankAccess)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.InitiateExternalBankAccess initiateExternalBankAccess = (com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.InitiateExternalBankAccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.externalReferenceId, initiateExternalBankAccess.externalReferenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.connectUrl, initiateExternalBankAccess.connectUrl);
        }

        public final com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.InitiateExternalBankAccess copy(java.lang.String externalReferenceId, java.lang.String connectUrl) {
            return new com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.InitiateExternalBankAccess(externalReferenceId, connectUrl);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getConnectUrl() {
            return this.connectUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getExternalReferenceId() {
            return this.externalReferenceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.InitiateExternalBankAccess copy$default(com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.InitiateExternalBankAccess initiateExternalBankAccess, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initiateExternalBankAccess.externalReferenceId;
            }
            if ((i & 2) != 0) {
                str2 = initiateExternalBankAccess.connectUrl;
            }
            return initiateExternalBankAccess.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/InitiateExternalBankAccessMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation InitiateExternalBankAccess($input: InitiateExternalBankAccessInput!) { initiateExternalBankAccess(input: $input) { externalReferenceId connectUrl } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.InitiateExternalBankAccessInput initiateExternalBankAccessInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InitiateExternalBankAccessMutation(input=");
        sb.append(initiateExternalBankAccessInput);
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
        return (other instanceof com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation) other).input);
    }

    public final com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation copy(com.paypal.oslo.api.graphql.schema.type.InitiateExternalBankAccessInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.InitiateExternalBankAccessInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation copy$default(com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation initiateExternalBankAccessMutation, com.paypal.oslo.api.graphql.schema.type.InitiateExternalBankAccessInput initiateExternalBankAccessInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            initiateExternalBankAccessInput = initiateExternalBankAccessMutation.input;
        }
        return initiateExternalBankAccessMutation.copy(initiateExternalBankAccessInput);
    }
}
