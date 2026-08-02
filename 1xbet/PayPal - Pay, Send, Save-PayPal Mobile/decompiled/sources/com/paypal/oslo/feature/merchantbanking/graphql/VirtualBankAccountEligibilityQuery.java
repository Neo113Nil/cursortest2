package com.paypal.oslo.feature.merchantbanking.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountEligibilityQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountEligibilityQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountEligibilityInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountEligibilityInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountEligibilityInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountEligibilityInput;)Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountEligibilityQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountEligibilityInput;", "getInput", "Companion", "Data", "VirtualBankAccountEligibility"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class VirtualBankAccountEligibilityQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.Data> {
    public static final java.lang.String OPERATION_ID = "74b5770f300a49cd73801803d3d281f89ecaaefa3d4d70c868f352498e04ec87";
    public static final java.lang.String OPERATION_NAME = "VirtualBankAccountEligibilityQuery";
    private final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.Companion INSTANCE = new com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.Companion(null);
    public static final int $stable = 8;

    public VirtualBankAccountEligibilityQuery(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityInput virtualBankAccountEligibilityInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualBankAccountEligibilityInput, "");
        this.input = virtualBankAccountEligibilityInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityInput getInput() {
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
        com.paypal.oslo.feature.merchantbanking.graphql.adapter.VirtualBankAccountEligibilityQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.merchantbanking.graphql.adapter.VirtualBankAccountEligibilityQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.merchantbanking.graphql.selections.VirtualBankAccountEligibilityQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountEligibilityQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountEligibilityQuery$VirtualBankAccountEligibility;", "virtualBankAccountEligibility", "<init>", "(Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountEligibilityQuery$VirtualBankAccountEligibility;)V", "component1", "()Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountEligibilityQuery$VirtualBankAccountEligibility;", "copy", "(Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountEligibilityQuery$VirtualBankAccountEligibility;)Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountEligibilityQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountEligibilityQuery$VirtualBankAccountEligibility;", "getVirtualBankAccountEligibility"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.VirtualBankAccountEligibility virtualBankAccountEligibility;

        public Data(com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.VirtualBankAccountEligibility virtualBankAccountEligibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualBankAccountEligibility, "");
            this.virtualBankAccountEligibility = virtualBankAccountEligibility;
        }

        public final com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.VirtualBankAccountEligibility getVirtualBankAccountEligibility() {
            return this.virtualBankAccountEligibility;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.VirtualBankAccountEligibility virtualBankAccountEligibility = this.virtualBankAccountEligibility;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(virtualBankAccountEligibility=");
            sb.append(virtualBankAccountEligibility);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.virtualBankAccountEligibility.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.virtualBankAccountEligibility, ((com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.Data) other).virtualBankAccountEligibility);
        }

        public final com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.Data copy(com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.VirtualBankAccountEligibility virtualBankAccountEligibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualBankAccountEligibility, "");
            return new com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.Data(virtualBankAccountEligibility);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.VirtualBankAccountEligibility getVirtualBankAccountEligibility() {
            return this.virtualBankAccountEligibility;
        }

        public static /* synthetic */ com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.Data copy$default(com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.Data data, com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.VirtualBankAccountEligibility virtualBankAccountEligibility, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                virtualBankAccountEligibility = data.virtualBankAccountEligibility;
            }
            return data.copy(virtualBankAccountEligibility);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountEligibilityQuery$VirtualBankAccountEligibility;", "", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountEligibilityStatus;", "status", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountIneligibilityReason;", "reason", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountEligibilityStatus;Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountIneligibilityReason;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountEligibilityStatus;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountIneligibilityReason;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountEligibilityStatus;Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountIneligibilityReason;)Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountEligibilityQuery$VirtualBankAccountEligibility;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountEligibilityStatus;", "getStatus", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountIneligibilityReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VirtualBankAccountEligibility {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason reason;
        private final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityStatus status;

        public VirtualBankAccountEligibility(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityStatus virtualBankAccountEligibilityStatus, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason virtualBankAccountIneligibilityReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualBankAccountEligibilityStatus, "");
            this.status = virtualBankAccountEligibilityStatus;
            this.reason = virtualBankAccountIneligibilityReason;
        }

        public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityStatus virtualBankAccountEligibilityStatus = this.status;
            com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason virtualBankAccountIneligibilityReason = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VirtualBankAccountEligibility(status=");
            sb.append(virtualBankAccountEligibilityStatus);
            sb.append(", reason=");
            sb.append(virtualBankAccountIneligibilityReason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.status.hashCode();
            com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason virtualBankAccountIneligibilityReason = this.reason;
            return (hashCode * 31) + (virtualBankAccountIneligibilityReason == null ? 0 : virtualBankAccountIneligibilityReason.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.VirtualBankAccountEligibility)) {
                return false;
            }
            com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.VirtualBankAccountEligibility virtualBankAccountEligibility = (com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.VirtualBankAccountEligibility) other;
            return this.status == virtualBankAccountEligibility.status && this.reason == virtualBankAccountEligibility.reason;
        }

        public final com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.VirtualBankAccountEligibility copy(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityStatus status, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.VirtualBankAccountEligibility(status, reason);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason getReason() {
            return this.reason;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.VirtualBankAccountEligibility copy$default(com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.VirtualBankAccountEligibility virtualBankAccountEligibility, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityStatus virtualBankAccountEligibilityStatus, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountIneligibilityReason virtualBankAccountIneligibilityReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                virtualBankAccountEligibilityStatus = virtualBankAccountEligibility.status;
            }
            if ((i & 2) != 0) {
                virtualBankAccountIneligibilityReason = virtualBankAccountEligibility.reason;
            }
            return virtualBankAccountEligibility.copy(virtualBankAccountEligibilityStatus, virtualBankAccountIneligibilityReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountEligibilityQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query VirtualBankAccountEligibilityQuery($input: VirtualBankAccountEligibilityInput!) { virtualBankAccountEligibility(input: $input) { status reason } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityInput virtualBankAccountEligibilityInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VirtualBankAccountEligibilityQuery(input=");
        sb.append(virtualBankAccountEligibilityInput);
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
        return (other instanceof com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery) other).input);
    }

    public final com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery copy(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery copy$default(com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery virtualBankAccountEligibilityQuery, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityInput virtualBankAccountEligibilityInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            virtualBankAccountEligibilityInput = virtualBankAccountEligibilityQuery.input;
        }
        return virtualBankAccountEligibilityQuery.copy(virtualBankAccountEligibilityInput);
    }
}
