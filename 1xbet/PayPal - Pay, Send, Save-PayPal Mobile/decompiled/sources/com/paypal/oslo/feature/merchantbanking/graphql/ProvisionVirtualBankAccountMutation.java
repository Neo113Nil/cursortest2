package com.paypal.oslo.feature.merchantbanking.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/ProvisionVirtualBankAccountInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ProvisionVirtualBankAccountInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ProvisionVirtualBankAccountInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ProvisionVirtualBankAccountInput;)Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/ProvisionVirtualBankAccountInput;", "getInput", "Companion", "Data", "ProvisionVirtualBankAccount", "VirtualBankAccount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProvisionVirtualBankAccountMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.Data> {
    public static final java.lang.String OPERATION_ID = "8a45239f28e32b18caec266bc0c5ab33800857aa98d4a7c8eadc10d7e3ec575e";
    public static final java.lang.String OPERATION_NAME = "ProvisionVirtualBankAccountMutation";
    private final com.paypal.oslo.api.graphql.schema.type.ProvisionVirtualBankAccountInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.Companion INSTANCE = new com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.Companion(null);
    public static final int $stable = 8;

    public ProvisionVirtualBankAccountMutation(com.paypal.oslo.api.graphql.schema.type.ProvisionVirtualBankAccountInput provisionVirtualBankAccountInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionVirtualBankAccountInput, "");
        this.input = provisionVirtualBankAccountInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ProvisionVirtualBankAccountInput getInput() {
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
        com.paypal.oslo.feature.merchantbanking.graphql.adapter.ProvisionVirtualBankAccountMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.merchantbanking.graphql.adapter.ProvisionVirtualBankAccountMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.merchantbanking.graphql.selections.ProvisionVirtualBankAccountMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$ProvisionVirtualBankAccount;", "provisionVirtualBankAccount", "<init>", "(Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$ProvisionVirtualBankAccount;)V", "component1", "()Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$ProvisionVirtualBankAccount;", "copy", "(Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$ProvisionVirtualBankAccount;)Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$ProvisionVirtualBankAccount;", "getProvisionVirtualBankAccount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount provisionVirtualBankAccount;

        public Data(com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount provisionVirtualBankAccount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionVirtualBankAccount, "");
            this.provisionVirtualBankAccount = provisionVirtualBankAccount;
        }

        public final com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount getProvisionVirtualBankAccount() {
            return this.provisionVirtualBankAccount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount provisionVirtualBankAccount = this.provisionVirtualBankAccount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(provisionVirtualBankAccount=");
            sb.append(provisionVirtualBankAccount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.provisionVirtualBankAccount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.provisionVirtualBankAccount, ((com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.Data) other).provisionVirtualBankAccount);
        }

        public final com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.Data copy(com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount provisionVirtualBankAccount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionVirtualBankAccount, "");
            return new com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.Data(provisionVirtualBankAccount);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount getProvisionVirtualBankAccount() {
            return this.provisionVirtualBankAccount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.Data copy$default(com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.Data data, com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount provisionVirtualBankAccount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                provisionVirtualBankAccount = data.provisionVirtualBankAccount;
            }
            return data.copy(provisionVirtualBankAccount);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$ProvisionVirtualBankAccount;", "", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountProvisioningStatus;", "status", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountProvisioningOutcomeReason;", "reason", "Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$VirtualBankAccount;", "virtualBankAccount", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountProvisioningStatus;Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountProvisioningOutcomeReason;Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$VirtualBankAccount;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountProvisioningStatus;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountProvisioningOutcomeReason;", "component3", "()Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$VirtualBankAccount;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountProvisioningStatus;Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountProvisioningOutcomeReason;Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$VirtualBankAccount;)Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$ProvisionVirtualBankAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountProvisioningStatus;", "getStatus", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountProvisioningOutcomeReason;", "getReason", "Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$VirtualBankAccount;", "getVirtualBankAccount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProvisionVirtualBankAccount {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason reason;
        private final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus status;
        private final com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount virtualBankAccount;

        public ProvisionVirtualBankAccount(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus virtualBankAccountProvisioningStatus, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason virtualBankAccountProvisioningOutcomeReason, com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount virtualBankAccount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualBankAccountProvisioningStatus, "");
            this.status = virtualBankAccountProvisioningStatus;
            this.reason = virtualBankAccountProvisioningOutcomeReason;
            this.virtualBankAccount = virtualBankAccount;
        }

        public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason getReason() {
            return this.reason;
        }

        public final com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount getVirtualBankAccount() {
            return this.virtualBankAccount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus virtualBankAccountProvisioningStatus = this.status;
            com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason virtualBankAccountProvisioningOutcomeReason = this.reason;
            com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount virtualBankAccount = this.virtualBankAccount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProvisionVirtualBankAccount(status=");
            sb.append(virtualBankAccountProvisioningStatus);
            sb.append(", reason=");
            sb.append(virtualBankAccountProvisioningOutcomeReason);
            sb.append(", virtualBankAccount=");
            sb.append(virtualBankAccount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.status.hashCode();
            com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason virtualBankAccountProvisioningOutcomeReason = this.reason;
            int hashCode2 = virtualBankAccountProvisioningOutcomeReason == null ? 0 : virtualBankAccountProvisioningOutcomeReason.hashCode();
            com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount virtualBankAccount = this.virtualBankAccount;
            return (((hashCode * 31) + hashCode2) * 31) + (virtualBankAccount != null ? virtualBankAccount.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount provisionVirtualBankAccount = (com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount) other;
            return this.status == provisionVirtualBankAccount.status && this.reason == provisionVirtualBankAccount.reason && kotlin.jvm.internal.Intrinsics.areEqual(this.virtualBankAccount, provisionVirtualBankAccount.virtualBankAccount);
        }

        public final com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount copy(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus status, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason reason, com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount virtualBankAccount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount(status, reason, virtualBankAccount);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount getVirtualBankAccount() {
            return this.virtualBankAccount;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason getReason() {
            return this.reason;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount copy$default(com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount provisionVirtualBankAccount, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus virtualBankAccountProvisioningStatus, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason virtualBankAccountProvisioningOutcomeReason, com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount virtualBankAccount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                virtualBankAccountProvisioningStatus = provisionVirtualBankAccount.status;
            }
            if ((i & 2) != 0) {
                virtualBankAccountProvisioningOutcomeReason = provisionVirtualBankAccount.reason;
            }
            if ((i & 4) != 0) {
                virtualBankAccount = provisionVirtualBankAccount.virtualBankAccount;
            }
            return provisionVirtualBankAccount.copy(virtualBankAccountProvisioningStatus, virtualBankAccountProvisioningOutcomeReason, virtualBankAccount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$VirtualBankAccount;", "", "", "bankAccountNumber", "routingNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$VirtualBankAccount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBankAccountNumber", "getRoutingNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VirtualBankAccount {
        public static final int $stable = 0;
        private final java.lang.String bankAccountNumber;
        private final java.lang.String routingNumber;

        public VirtualBankAccount(java.lang.String str, java.lang.String str2) {
            this.bankAccountNumber = str;
            this.routingNumber = str2;
        }

        public final java.lang.String getBankAccountNumber() {
            return this.bankAccountNumber;
        }

        public final java.lang.String getRoutingNumber() {
            return this.routingNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.bankAccountNumber;
            java.lang.String str2 = this.routingNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VirtualBankAccount(bankAccountNumber=");
            sb.append(str);
            sb.append(", routingNumber=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.bankAccountNumber;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.routingNumber;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount virtualBankAccount = (com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountNumber, virtualBankAccount.bankAccountNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.routingNumber, virtualBankAccount.routingNumber);
        }

        public final com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount copy(java.lang.String bankAccountNumber, java.lang.String routingNumber) {
            return new com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount(bankAccountNumber, routingNumber);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRoutingNumber() {
            return this.routingNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBankAccountNumber() {
            return this.bankAccountNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount copy$default(com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount virtualBankAccount, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = virtualBankAccount.bankAccountNumber;
            }
            if ((i & 2) != 0) {
                str2 = virtualBankAccount.routingNumber;
            }
            return virtualBankAccount.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation ProvisionVirtualBankAccountMutation($input: ProvisionVirtualBankAccountInput!) { provisionVirtualBankAccount(input: $input) { status reason virtualBankAccount { bankAccountNumber routingNumber } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ProvisionVirtualBankAccountInput provisionVirtualBankAccountInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProvisionVirtualBankAccountMutation(input=");
        sb.append(provisionVirtualBankAccountInput);
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
        return (other instanceof com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation) other).input);
    }

    public final com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation copy(com.paypal.oslo.api.graphql.schema.type.ProvisionVirtualBankAccountInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ProvisionVirtualBankAccountInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation copy$default(com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation provisionVirtualBankAccountMutation, com.paypal.oslo.api.graphql.schema.type.ProvisionVirtualBankAccountInput provisionVirtualBankAccountInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            provisionVirtualBankAccountInput = provisionVirtualBankAccountMutation.input;
        }
        return provisionVirtualBankAccountMutation.copy(provisionVirtualBankAccountInput);
    }
}
