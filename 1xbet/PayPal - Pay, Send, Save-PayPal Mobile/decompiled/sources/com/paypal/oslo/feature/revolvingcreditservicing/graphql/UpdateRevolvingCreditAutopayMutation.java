package com.paypal.oslo.feature.revolvingcreditservicing.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/UpdateRevolvingCreditAutopayMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/UpdateRevolvingCreditAutopayMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateRevolvingCreditAutopayInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateRevolvingCreditAutopayInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/UpdateRevolvingCreditAutopayInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/UpdateRevolvingCreditAutopayInput;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/UpdateRevolvingCreditAutopayMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateRevolvingCreditAutopayInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.OPERATION_NAME}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class UpdateRevolvingCreditAutopayMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.Data> {
    public static final java.lang.String OPERATION_ID = "e3ade6ddeb8645a43937e9fecf89e19ae2ef3289f0b7e175aaccc6d1face204e";
    public static final java.lang.String OPERATION_NAME = "UpdateRevolvingCreditAutopay";
    private final com.paypal.oslo.api.graphql.schema.type.UpdateRevolvingCreditAutopayInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.Companion(null);
    public static final int $stable = 8;

    public UpdateRevolvingCreditAutopayMutation(com.paypal.oslo.api.graphql.schema.type.UpdateRevolvingCreditAutopayInput updateRevolvingCreditAutopayInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateRevolvingCreditAutopayInput, "");
        this.input = updateRevolvingCreditAutopayInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdateRevolvingCreditAutopayInput getInput() {
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
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.UpdateRevolvingCreditAutopayMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.adapter.UpdateRevolvingCreditAutopayMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.revolvingcreditservicing.graphql.selections.UpdateRevolvingCreditAutopayMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/UpdateRevolvingCreditAutopayMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/UpdateRevolvingCreditAutopayMutation$UpdateRevolvingCreditAutopay;", "updateRevolvingCreditAutopay", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/UpdateRevolvingCreditAutopayMutation$UpdateRevolvingCreditAutopay;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/UpdateRevolvingCreditAutopayMutation$UpdateRevolvingCreditAutopay;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/UpdateRevolvingCreditAutopayMutation$UpdateRevolvingCreditAutopay;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/UpdateRevolvingCreditAutopayMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/UpdateRevolvingCreditAutopayMutation$UpdateRevolvingCreditAutopay;", "getUpdateRevolvingCreditAutopay"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.UpdateRevolvingCreditAutopay updateRevolvingCreditAutopay;

        public Data(com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.UpdateRevolvingCreditAutopay updateRevolvingCreditAutopay) {
            this.updateRevolvingCreditAutopay = updateRevolvingCreditAutopay;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.UpdateRevolvingCreditAutopay getUpdateRevolvingCreditAutopay() {
            return this.updateRevolvingCreditAutopay;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.UpdateRevolvingCreditAutopay updateRevolvingCreditAutopay = this.updateRevolvingCreditAutopay;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(updateRevolvingCreditAutopay=");
            sb.append(updateRevolvingCreditAutopay);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.UpdateRevolvingCreditAutopay updateRevolvingCreditAutopay = this.updateRevolvingCreditAutopay;
            if (updateRevolvingCreditAutopay == null) {
                return 0;
            }
            return updateRevolvingCreditAutopay.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateRevolvingCreditAutopay, ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.Data) other).updateRevolvingCreditAutopay);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.Data copy(com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.UpdateRevolvingCreditAutopay updateRevolvingCreditAutopay) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.Data(updateRevolvingCreditAutopay);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.UpdateRevolvingCreditAutopay getUpdateRevolvingCreditAutopay() {
            return this.updateRevolvingCreditAutopay;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.Data copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.Data data, com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.UpdateRevolvingCreditAutopay updateRevolvingCreditAutopay, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updateRevolvingCreditAutopay = data.updateRevolvingCreditAutopay;
            }
            return data.copy(updateRevolvingCreditAutopay);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/UpdateRevolvingCreditAutopayMutation$UpdateRevolvingCreditAutopay;", "", "", "enrolled", "effectiveInCurrentBillingCycle", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/UpdateRevolvingCreditAutopayMutation$UpdateRevolvingCreditAutopay;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getEnrolled", "getEffectiveInCurrentBillingCycle"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateRevolvingCreditAutopay {
        public static final int $stable = 0;
        private final java.lang.Boolean effectiveInCurrentBillingCycle;
        private final java.lang.Boolean enrolled;

        public UpdateRevolvingCreditAutopay(java.lang.Boolean bool, java.lang.Boolean bool2) {
            this.enrolled = bool;
            this.effectiveInCurrentBillingCycle = bool2;
        }

        public final java.lang.Boolean getEnrolled() {
            return this.enrolled;
        }

        public final java.lang.Boolean getEffectiveInCurrentBillingCycle() {
            return this.effectiveInCurrentBillingCycle;
        }

        public final java.lang.String toString() {
            java.lang.Boolean bool = this.enrolled;
            java.lang.Boolean bool2 = this.effectiveInCurrentBillingCycle;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateRevolvingCreditAutopay(enrolled=");
            sb.append(bool);
            sb.append(", effectiveInCurrentBillingCycle=");
            sb.append(bool2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Boolean bool = this.enrolled;
            int hashCode = bool == null ? 0 : bool.hashCode();
            java.lang.Boolean bool2 = this.effectiveInCurrentBillingCycle;
            return (hashCode * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.UpdateRevolvingCreditAutopay)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.UpdateRevolvingCreditAutopay updateRevolvingCreditAutopay = (com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.UpdateRevolvingCreditAutopay) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.enrolled, updateRevolvingCreditAutopay.enrolled) && kotlin.jvm.internal.Intrinsics.areEqual(this.effectiveInCurrentBillingCycle, updateRevolvingCreditAutopay.effectiveInCurrentBillingCycle);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.UpdateRevolvingCreditAutopay copy(java.lang.Boolean enrolled, java.lang.Boolean effectiveInCurrentBillingCycle) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.UpdateRevolvingCreditAutopay(enrolled, effectiveInCurrentBillingCycle);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getEffectiveInCurrentBillingCycle() {
            return this.effectiveInCurrentBillingCycle;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Boolean getEnrolled() {
            return this.enrolled;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.UpdateRevolvingCreditAutopay copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.UpdateRevolvingCreditAutopay updateRevolvingCreditAutopay, java.lang.Boolean bool, java.lang.Boolean bool2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bool = updateRevolvingCreditAutopay.enrolled;
            }
            if ((i & 2) != 0) {
                bool2 = updateRevolvingCreditAutopay.effectiveInCurrentBillingCycle;
            }
            return updateRevolvingCreditAutopay.copy(bool, bool2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/UpdateRevolvingCreditAutopayMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation UpdateRevolvingCreditAutopay($input: UpdateRevolvingCreditAutopayInput!) { updateRevolvingCreditAutopay(input: $input) { enrolled effectiveInCurrentBillingCycle } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.UpdateRevolvingCreditAutopayInput updateRevolvingCreditAutopayInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateRevolvingCreditAutopayMutation(input=");
        sb.append(updateRevolvingCreditAutopayInput);
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
        return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation) other).input);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation copy(com.paypal.oslo.api.graphql.schema.type.UpdateRevolvingCreditAutopayInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.UpdateRevolvingCreditAutopayInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation copy$default(com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation updateRevolvingCreditAutopayMutation, com.paypal.oslo.api.graphql.schema.type.UpdateRevolvingCreditAutopayInput updateRevolvingCreditAutopayInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            updateRevolvingCreditAutopayInput = updateRevolvingCreditAutopayMutation.input;
        }
        return updateRevolvingCreditAutopayMutation.copy(updateRevolvingCreditAutopayInput);
    }
}
