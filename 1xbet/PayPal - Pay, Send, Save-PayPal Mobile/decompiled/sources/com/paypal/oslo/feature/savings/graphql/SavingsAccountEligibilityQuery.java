package com.paypal.oslo.feature.savings.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\b*+,-./0)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountEligibilityInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountEligibilityInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountEligibilityInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountEligibilityInput;)Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountEligibilityInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OPERATION_NAME, "SavingsProductSubscription", "IneligibilityReason", "OnboardingProperties", "Policy", "CashPlusProductSubscription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SavingsAccountEligibilityQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Data> {
    public static final java.lang.String OPERATION_ID = "a948b3023fa81e66b6be25f8af7e28e9e84dbfd6b280550aa5667d3197e890d0";
    public static final java.lang.String OPERATION_NAME = "SavingsAccountEligibility";
    private final com.paypal.oslo.api.graphql.schema.type.SavingsAccountEligibilityInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Companion INSTANCE = new com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Companion(null);
    public static final int $stable = 8;

    public SavingsAccountEligibilityQuery(com.paypal.oslo.api.graphql.schema.type.SavingsAccountEligibilityInput savingsAccountEligibilityInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccountEligibilityInput, "");
        this.input = savingsAccountEligibilityInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SavingsAccountEligibilityInput getInput() {
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
        com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.SavingsAccountEligibilityQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.savings.graphql.selections.SavingsAccountEligibilityQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$SavingsAccountEligibility;", "savingsAccountEligibility", "<init>", "(Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$SavingsAccountEligibility;)V", "component1", "()Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$SavingsAccountEligibility;", "copy", "(Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$SavingsAccountEligibility;)Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$SavingsAccountEligibility;", "getSavingsAccountEligibility"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsAccountEligibility savingsAccountEligibility;

        public Data(com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsAccountEligibility savingsAccountEligibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccountEligibility, "");
            this.savingsAccountEligibility = savingsAccountEligibility;
        }

        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsAccountEligibility getSavingsAccountEligibility() {
            return this.savingsAccountEligibility;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsAccountEligibility savingsAccountEligibility = this.savingsAccountEligibility;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(savingsAccountEligibility=");
            sb.append(savingsAccountEligibility);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.savingsAccountEligibility.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsAccountEligibility, ((com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Data) other).savingsAccountEligibility);
        }

        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Data copy(com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsAccountEligibility savingsAccountEligibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccountEligibility, "");
            return new com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Data(savingsAccountEligibility);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsAccountEligibility getSavingsAccountEligibility() {
            return this.savingsAccountEligibility;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Data copy$default(com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Data data, com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsAccountEligibility savingsAccountEligibility, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                savingsAccountEligibility = data.savingsAccountEligibility;
            }
            return data.copy(savingsAccountEligibility);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$SavingsAccountEligibility;", "", "Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$SavingsProductSubscription;", "savingsProductSubscription", "Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$CashPlusProductSubscription;", "cashPlusProductSubscription", "<init>", "(Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$SavingsProductSubscription;Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$CashPlusProductSubscription;)V", "component1", "()Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$SavingsProductSubscription;", "component2", "()Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$CashPlusProductSubscription;", "copy", "(Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$SavingsProductSubscription;Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$CashPlusProductSubscription;)Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$SavingsAccountEligibility;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$SavingsProductSubscription;", "getSavingsProductSubscription", "Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$CashPlusProductSubscription;", "getCashPlusProductSubscription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SavingsAccountEligibility {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.CashPlusProductSubscription cashPlusProductSubscription;
        private final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsProductSubscription savingsProductSubscription;

        public SavingsAccountEligibility(com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsProductSubscription savingsProductSubscription, com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.CashPlusProductSubscription cashPlusProductSubscription) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsProductSubscription, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashPlusProductSubscription, "");
            this.savingsProductSubscription = savingsProductSubscription;
            this.cashPlusProductSubscription = cashPlusProductSubscription;
        }

        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsProductSubscription getSavingsProductSubscription() {
            return this.savingsProductSubscription;
        }

        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.CashPlusProductSubscription getCashPlusProductSubscription() {
            return this.cashPlusProductSubscription;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsProductSubscription savingsProductSubscription = this.savingsProductSubscription;
            com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.CashPlusProductSubscription cashPlusProductSubscription = this.cashPlusProductSubscription;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsAccountEligibility(savingsProductSubscription=");
            sb.append(savingsProductSubscription);
            sb.append(", cashPlusProductSubscription=");
            sb.append(cashPlusProductSubscription);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.savingsProductSubscription.hashCode() * 31) + this.cashPlusProductSubscription.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsAccountEligibility)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsAccountEligibility savingsAccountEligibility = (com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsAccountEligibility) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.savingsProductSubscription, savingsAccountEligibility.savingsProductSubscription) && kotlin.jvm.internal.Intrinsics.areEqual(this.cashPlusProductSubscription, savingsAccountEligibility.cashPlusProductSubscription);
        }

        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsAccountEligibility copy(com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsProductSubscription savingsProductSubscription, com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.CashPlusProductSubscription cashPlusProductSubscription) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsProductSubscription, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashPlusProductSubscription, "");
            return new com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsAccountEligibility(savingsProductSubscription, cashPlusProductSubscription);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.CashPlusProductSubscription getCashPlusProductSubscription() {
            return this.cashPlusProductSubscription;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsProductSubscription getSavingsProductSubscription() {
            return this.savingsProductSubscription;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsAccountEligibility copy$default(com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsAccountEligibility savingsAccountEligibility, com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsProductSubscription savingsProductSubscription, com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.CashPlusProductSubscription cashPlusProductSubscription, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                savingsProductSubscription = savingsAccountEligibility.savingsProductSubscription;
            }
            if ((i & 2) != 0) {
                cashPlusProductSubscription = savingsAccountEligibility.cashPlusProductSubscription;
            }
            return savingsAccountEligibility.copy(savingsProductSubscription, cashPlusProductSubscription);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$SavingsProductSubscription;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsProductSubscriptionStatus;", "status", "Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$IneligibilityReason;", "ineligibilityReason", "Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$OnboardingProperties;", "onboardingProperties", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/SavingsProductSubscriptionStatus;Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$IneligibilityReason;Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$OnboardingProperties;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/SavingsProductSubscriptionStatus;", "component3", "()Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$IneligibilityReason;", "component4", "()Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$OnboardingProperties;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/SavingsProductSubscriptionStatus;Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$IneligibilityReason;Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$OnboardingProperties;)Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$SavingsProductSubscription;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsProductSubscriptionStatus;", "getStatus", "Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$IneligibilityReason;", "getIneligibilityReason", "Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$OnboardingProperties;", "getOnboardingProperties"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SavingsProductSubscription {
        public static final int $stable = 8;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason ineligibilityReason;
        private final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties onboardingProperties;
        private final com.paypal.oslo.api.graphql.schema.type.SavingsProductSubscriptionStatus status;

        public SavingsProductSubscription(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.SavingsProductSubscriptionStatus savingsProductSubscriptionStatus, com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason ineligibilityReason, com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties onboardingProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsProductSubscriptionStatus, "");
            this.id = str;
            this.status = savingsProductSubscriptionStatus;
            this.ineligibilityReason = ineligibilityReason;
            this.onboardingProperties = onboardingProperties;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.SavingsProductSubscriptionStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason getIneligibilityReason() {
            return this.ineligibilityReason;
        }

        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties getOnboardingProperties() {
            return this.onboardingProperties;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.SavingsProductSubscriptionStatus savingsProductSubscriptionStatus = this.status;
            com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason ineligibilityReason = this.ineligibilityReason;
            com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties onboardingProperties = this.onboardingProperties;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsProductSubscription(id=");
            sb.append(str);
            sb.append(", status=");
            sb.append(savingsProductSubscriptionStatus);
            sb.append(", ineligibilityReason=");
            sb.append(ineligibilityReason);
            sb.append(", onboardingProperties=");
            sb.append(onboardingProperties);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            int hashCode2 = this.status.hashCode();
            com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason ineligibilityReason = this.ineligibilityReason;
            int hashCode3 = ineligibilityReason == null ? 0 : ineligibilityReason.hashCode();
            com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties onboardingProperties = this.onboardingProperties;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (onboardingProperties != null ? onboardingProperties.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsProductSubscription)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsProductSubscription savingsProductSubscription = (com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsProductSubscription) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, savingsProductSubscription.id) && this.status == savingsProductSubscription.status && kotlin.jvm.internal.Intrinsics.areEqual(this.ineligibilityReason, savingsProductSubscription.ineligibilityReason) && kotlin.jvm.internal.Intrinsics.areEqual(this.onboardingProperties, savingsProductSubscription.onboardingProperties);
        }

        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsProductSubscription copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.SavingsProductSubscriptionStatus status, com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason ineligibilityReason, com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties onboardingProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsProductSubscription(id, status, ineligibilityReason, onboardingProperties);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties getOnboardingProperties() {
            return this.onboardingProperties;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason getIneligibilityReason() {
            return this.ineligibilityReason;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.SavingsProductSubscriptionStatus getStatus() {
            return this.status;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsProductSubscription copy$default(com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsProductSubscription savingsProductSubscription, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.SavingsProductSubscriptionStatus savingsProductSubscriptionStatus, com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason ineligibilityReason, com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties onboardingProperties, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = savingsProductSubscription.id;
            }
            if ((i & 2) != 0) {
                savingsProductSubscriptionStatus = savingsProductSubscription.status;
            }
            if ((i & 4) != 0) {
                ineligibilityReason = savingsProductSubscription.ineligibilityReason;
            }
            if ((i & 8) != 0) {
                onboardingProperties = savingsProductSubscription.onboardingProperties;
            }
            return savingsProductSubscription.copy(str, savingsProductSubscriptionStatus, ineligibilityReason, onboardingProperties);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$IneligibilityReason;", "", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsIneligibilityReasonCode;", "reasonCode", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SavingsIneligibilityReasonCode;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SavingsIneligibilityReasonCode;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SavingsIneligibilityReasonCode;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$IneligibilityReason;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsIneligibilityReasonCode;", "getReasonCode", "Ljava/lang/String;", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class IneligibilityReason {
        public static final int $stable = 0;
        private final java.lang.String description;
        private final com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode reasonCode;

        public IneligibilityReason(com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode savingsIneligibilityReasonCode, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsIneligibilityReasonCode, "");
            this.reasonCode = savingsIneligibilityReasonCode;
            this.description = str;
        }

        public final com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode getReasonCode() {
            return this.reasonCode;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode savingsIneligibilityReasonCode = this.reasonCode;
            java.lang.String str = this.description;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("IneligibilityReason(reasonCode=");
            sb.append(savingsIneligibilityReasonCode);
            sb.append(", description=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.reasonCode.hashCode();
            java.lang.String str = this.description;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason ineligibilityReason = (com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason) other;
            return this.reasonCode == ineligibilityReason.reasonCode && kotlin.jvm.internal.Intrinsics.areEqual(this.description, ineligibilityReason.description);
        }

        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason copy(com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode reasonCode, java.lang.String description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reasonCode, "");
            return new com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason(reasonCode, description);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode getReasonCode() {
            return this.reasonCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason copy$default(com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason ineligibilityReason, com.paypal.oslo.api.graphql.schema.type.SavingsIneligibilityReasonCode savingsIneligibilityReasonCode, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                savingsIneligibilityReasonCode = ineligibilityReason.reasonCode;
            }
            if ((i & 2) != 0) {
                str = ineligibilityReason.description;
            }
            return ineligibilityReason.copy(savingsIneligibilityReasonCode, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$OnboardingProperties;", "", "", "showDocUpload", "", "Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$Policy;", "policies", "<init>", "(ZLjava/util/List;)V", "component1", "()Z", "component2", "()Ljava/util/List;", "copy", "(ZLjava/util/List;)Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$OnboardingProperties;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getShowDocUpload", "Ljava/util/List;", "getPolicies"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnboardingProperties {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Policy> policies;
        private final boolean showDocUpload;

        public OnboardingProperties(boolean z, java.util.List<com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Policy> list) {
            this.showDocUpload = z;
            this.policies = list;
        }

        public final boolean getShowDocUpload() {
            return this.showDocUpload;
        }

        public final java.util.List<com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Policy> getPolicies() {
            return this.policies;
        }

        public final java.lang.String toString() {
            boolean z = this.showDocUpload;
            java.util.List<com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Policy> list = this.policies;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnboardingProperties(showDocUpload=");
            sb.append(z);
            sb.append(", policies=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.showDocUpload);
            java.util.List<com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Policy> list = this.policies;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties onboardingProperties = (com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties) other;
            return this.showDocUpload == onboardingProperties.showDocUpload && kotlin.jvm.internal.Intrinsics.areEqual(this.policies, onboardingProperties.policies);
        }

        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties copy(boolean showDocUpload, java.util.List<com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Policy> policies) {
            return new com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties(showDocUpload, policies);
        }

        public final java.util.List<com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Policy> component2() {
            return this.policies;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowDocUpload() {
            return this.showDocUpload;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties copy$default(com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties onboardingProperties, boolean z, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = onboardingProperties.showDocUpload;
            }
            if ((i & 2) != 0) {
                list = onboardingProperties.policies;
            }
            return onboardingProperties.copy(z, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$Policy;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsSubscriptionPolicyName;", "name", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/SavingsSubscriptionPolicyName;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/SavingsSubscriptionPolicyName;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/SavingsSubscriptionPolicyName;)Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$Policy;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsSubscriptionPolicyName;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Policy {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final com.paypal.oslo.api.graphql.schema.type.SavingsSubscriptionPolicyName name;

        public Policy(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.SavingsSubscriptionPolicyName savingsSubscriptionPolicyName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsSubscriptionPolicyName, "");
            this.id = str;
            this.name = savingsSubscriptionPolicyName;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.SavingsSubscriptionPolicyName getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.SavingsSubscriptionPolicyName savingsSubscriptionPolicyName = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Policy(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(savingsSubscriptionPolicyName);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Policy)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Policy policy = (com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Policy) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, policy.id) && this.name == policy.name;
        }

        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Policy copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.SavingsSubscriptionPolicyName name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Policy(id, name2);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.SavingsSubscriptionPolicyName getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Policy copy$default(com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Policy policy, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.SavingsSubscriptionPolicyName savingsSubscriptionPolicyName, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = policy.id;
            }
            if ((i & 2) != 0) {
                savingsSubscriptionPolicyName = policy.name;
            }
            return policy.copy(str, savingsSubscriptionPolicyName);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$CashPlusProductSubscription;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/CashPlusProductSubscriptionStatus;", "status", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CashPlusProductSubscriptionStatus;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CashPlusProductSubscriptionStatus;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CashPlusProductSubscriptionStatus;)Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$CashPlusProductSubscription;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/CashPlusProductSubscriptionStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CashPlusProductSubscription {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final com.paypal.oslo.api.graphql.schema.type.CashPlusProductSubscriptionStatus status;

        public CashPlusProductSubscription(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CashPlusProductSubscriptionStatus cashPlusProductSubscriptionStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashPlusProductSubscriptionStatus, "");
            this.id = str;
            this.status = cashPlusProductSubscriptionStatus;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CashPlusProductSubscriptionStatus getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.CashPlusProductSubscriptionStatus cashPlusProductSubscriptionStatus = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CashPlusProductSubscription(id=");
            sb.append(str);
            sb.append(", status=");
            sb.append(cashPlusProductSubscriptionStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.status.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.CashPlusProductSubscription)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.CashPlusProductSubscription cashPlusProductSubscription = (com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.CashPlusProductSubscription) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, cashPlusProductSubscription.id) && this.status == cashPlusProductSubscription.status;
        }

        public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.CashPlusProductSubscription copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.CashPlusProductSubscriptionStatus status) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.CashPlusProductSubscription(id, status);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CashPlusProductSubscriptionStatus getStatus() {
            return this.status;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.CashPlusProductSubscription copy$default(com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.CashPlusProductSubscription cashPlusProductSubscription, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CashPlusProductSubscriptionStatus cashPlusProductSubscriptionStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cashPlusProductSubscription.id;
            }
            if ((i & 2) != 0) {
                cashPlusProductSubscriptionStatus = cashPlusProductSubscription.status;
            }
            return cashPlusProductSubscription.copy(str, cashPlusProductSubscriptionStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query SavingsAccountEligibility($input: SavingsAccountEligibilityInput!) { savingsAccountEligibility(input: $input) { savingsProductSubscription { id status ineligibilityReason { reasonCode description } onboardingProperties { showDocUpload policies { id name } } } cashPlusProductSubscription { id status } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.SavingsAccountEligibilityInput savingsAccountEligibilityInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsAccountEligibilityQuery(input=");
        sb.append(savingsAccountEligibilityInput);
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
        return (other instanceof com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery) other).input);
    }

    public final com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery copy(com.paypal.oslo.api.graphql.schema.type.SavingsAccountEligibilityInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.SavingsAccountEligibilityInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery copy$default(com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery savingsAccountEligibilityQuery, com.paypal.oslo.api.graphql.schema.type.SavingsAccountEligibilityInput savingsAccountEligibilityInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            savingsAccountEligibilityInput = savingsAccountEligibilityQuery.input;
        }
        return savingsAccountEligibilityQuery.copy(savingsAccountEligibilityInput);
    }
}
