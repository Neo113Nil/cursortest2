package com.paypal.oslo.feature.settings.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/CloseAccountEligibilityQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/settings/graphql/CloseAccountEligibilityQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountEligibilityInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountEligibilityInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountEligibilityInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountEligibilityInput;)Lcom/paypal/oslo/feature/settings/graphql/CloseAccountEligibilityQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountEligibilityInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.OPERATION_NAME, "IneligibilityReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CloseAccountEligibilityQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.Data> {
    public static final java.lang.String OPERATION_ID = "8659e8634fd1a3627e7b1fc0a01d6406610130c31be2851c98f197066c02511d";
    public static final java.lang.String OPERATION_NAME = "CloseAccountEligibility";
    private final com.paypal.oslo.api.graphql.schema.type.CloseAccountEligibilityInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.Companion INSTANCE = new com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.Companion(null);
    public static final int $stable = 8;

    public CloseAccountEligibilityQuery(com.paypal.oslo.api.graphql.schema.type.CloseAccountEligibilityInput closeAccountEligibilityInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountEligibilityInput, "");
        this.input = closeAccountEligibilityInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CloseAccountEligibilityInput getInput() {
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
        com.paypal.oslo.feature.settings.graphql.adapter.CloseAccountEligibilityQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.settings.graphql.adapter.CloseAccountEligibilityQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.settings.graphql.selections.CloseAccountEligibilityQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/CloseAccountEligibilityQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/settings/graphql/CloseAccountEligibilityQuery$CloseAccountEligibility;", "closeAccountEligibility", "<init>", "(Lcom/paypal/oslo/feature/settings/graphql/CloseAccountEligibilityQuery$CloseAccountEligibility;)V", "component1", "()Lcom/paypal/oslo/feature/settings/graphql/CloseAccountEligibilityQuery$CloseAccountEligibility;", "copy", "(Lcom/paypal/oslo/feature/settings/graphql/CloseAccountEligibilityQuery$CloseAccountEligibility;)Lcom/paypal/oslo/feature/settings/graphql/CloseAccountEligibilityQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/settings/graphql/CloseAccountEligibilityQuery$CloseAccountEligibility;", "getCloseAccountEligibility"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.CloseAccountEligibility closeAccountEligibility;

        public Data(com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.CloseAccountEligibility closeAccountEligibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountEligibility, "");
            this.closeAccountEligibility = closeAccountEligibility;
        }

        public final com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.CloseAccountEligibility getCloseAccountEligibility() {
            return this.closeAccountEligibility;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.CloseAccountEligibility closeAccountEligibility = this.closeAccountEligibility;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(closeAccountEligibility=");
            sb.append(closeAccountEligibility);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.closeAccountEligibility.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.closeAccountEligibility, ((com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.Data) other).closeAccountEligibility);
        }

        public final com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.Data copy(com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.CloseAccountEligibility closeAccountEligibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountEligibility, "");
            return new com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.Data(closeAccountEligibility);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.CloseAccountEligibility getCloseAccountEligibility() {
            return this.closeAccountEligibility;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.Data copy$default(com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.Data data, com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.CloseAccountEligibility closeAccountEligibility, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                closeAccountEligibility = data.closeAccountEligibility;
            }
            return data.copy(closeAccountEligibility);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/CloseAccountEligibilityQuery$CloseAccountEligibility;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountEligibilityDecisionCode;", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_DECISION_CODE, "", "Lcom/paypal/oslo/feature/settings/graphql/CloseAccountEligibilityQuery$IneligibilityReason;", "ineligibilityReasons", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountEligibilityDecisionCode;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountEligibilityDecisionCode;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountEligibilityDecisionCode;Ljava/util/List;)Lcom/paypal/oslo/feature/settings/graphql/CloseAccountEligibilityQuery$CloseAccountEligibility;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountEligibilityDecisionCode;", "getDecisionCode", "Ljava/util/List;", "getIneligibilityReasons"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseAccountEligibility {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.CloseAccountEligibilityDecisionCode decisionCode;
        private final java.util.List<com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.IneligibilityReason> ineligibilityReasons;

        public CloseAccountEligibility(com.paypal.oslo.api.graphql.schema.type.CloseAccountEligibilityDecisionCode closeAccountEligibilityDecisionCode, java.util.List<com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.IneligibilityReason> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountEligibilityDecisionCode, "");
            this.decisionCode = closeAccountEligibilityDecisionCode;
            this.ineligibilityReasons = list;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CloseAccountEligibilityDecisionCode getDecisionCode() {
            return this.decisionCode;
        }

        public final java.util.List<com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.IneligibilityReason> getIneligibilityReasons() {
            return this.ineligibilityReasons;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.CloseAccountEligibilityDecisionCode closeAccountEligibilityDecisionCode = this.decisionCode;
            java.util.List<com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.IneligibilityReason> list = this.ineligibilityReasons;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CloseAccountEligibility(decisionCode=");
            sb.append(closeAccountEligibilityDecisionCode);
            sb.append(", ineligibilityReasons=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.decisionCode.hashCode();
            java.util.List<com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.IneligibilityReason> list = this.ineligibilityReasons;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.CloseAccountEligibility)) {
                return false;
            }
            com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.CloseAccountEligibility closeAccountEligibility = (com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.CloseAccountEligibility) other;
            return this.decisionCode == closeAccountEligibility.decisionCode && kotlin.jvm.internal.Intrinsics.areEqual(this.ineligibilityReasons, closeAccountEligibility.ineligibilityReasons);
        }

        public final com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.CloseAccountEligibility copy(com.paypal.oslo.api.graphql.schema.type.CloseAccountEligibilityDecisionCode decisionCode, java.util.List<com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.IneligibilityReason> ineligibilityReasons) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decisionCode, "");
            return new com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.CloseAccountEligibility(decisionCode, ineligibilityReasons);
        }

        public final java.util.List<com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.IneligibilityReason> component2() {
            return this.ineligibilityReasons;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CloseAccountEligibilityDecisionCode getDecisionCode() {
            return this.decisionCode;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.CloseAccountEligibility copy$default(com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.CloseAccountEligibility closeAccountEligibility, com.paypal.oslo.api.graphql.schema.type.CloseAccountEligibilityDecisionCode closeAccountEligibilityDecisionCode, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                closeAccountEligibilityDecisionCode = closeAccountEligibility.decisionCode;
            }
            if ((i & 2) != 0) {
                list = closeAccountEligibility.ineligibilityReasons;
            }
            return closeAccountEligibility.copy(closeAccountEligibilityDecisionCode, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/CloseAccountEligibilityQuery$IneligibilityReason;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountIneligibilityReasonCode;", "code", "", "message", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountIneligibilityReasonCode;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountIneligibilityReasonCode;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountIneligibilityReasonCode;Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/graphql/CloseAccountEligibilityQuery$IneligibilityReason;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountIneligibilityReasonCode;", "getCode", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class IneligibilityReason {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode code;
        private final java.lang.String message;

        public IneligibilityReason(com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountIneligibilityReasonCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.code = closeAccountIneligibilityReasonCode;
            this.message = str;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode getCode() {
            return this.code;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode = this.code;
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("IneligibilityReason(code=");
            sb.append(closeAccountIneligibilityReasonCode);
            sb.append(", message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.code.hashCode() * 31) + this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.IneligibilityReason)) {
                return false;
            }
            com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.IneligibilityReason ineligibilityReason = (com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.IneligibilityReason) other;
            return this.code == ineligibilityReason.code && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ineligibilityReason.message);
        }

        public final com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.IneligibilityReason copy(com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode code, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.IneligibilityReason(code, message);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode getCode() {
            return this.code;
        }

        public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.IneligibilityReason copy$default(com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.IneligibilityReason ineligibilityReason, com.paypal.oslo.api.graphql.schema.type.CloseAccountIneligibilityReasonCode closeAccountIneligibilityReasonCode, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                closeAccountIneligibilityReasonCode = ineligibilityReason.code;
            }
            if ((i & 2) != 0) {
                str = ineligibilityReason.message;
            }
            return ineligibilityReason.copy(closeAccountIneligibilityReasonCode, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/settings/graphql/CloseAccountEligibilityQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query CloseAccountEligibility($input: CloseAccountEligibilityInput!) { closeAccountEligibility(input: $input) { decisionCode ineligibilityReasons { code message } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CloseAccountEligibilityInput closeAccountEligibilityInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CloseAccountEligibilityQuery(input=");
        sb.append(closeAccountEligibilityInput);
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
        return (other instanceof com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery) other).input);
    }

    public final com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery copy(com.paypal.oslo.api.graphql.schema.type.CloseAccountEligibilityInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CloseAccountEligibilityInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery copy$default(com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery closeAccountEligibilityQuery, com.paypal.oslo.api.graphql.schema.type.CloseAccountEligibilityInput closeAccountEligibilityInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            closeAccountEligibilityInput = closeAccountEligibilityQuery.input;
        }
        return closeAccountEligibilityQuery.copy(closeAccountEligibilityInput);
    }
}
