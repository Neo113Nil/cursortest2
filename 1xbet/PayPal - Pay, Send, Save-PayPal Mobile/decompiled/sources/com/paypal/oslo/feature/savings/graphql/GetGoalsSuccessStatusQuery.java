package com.paypal.oslo.feature.savings.graphql;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003'(&B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0007J'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0007J\u001a\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetGoalsSuccessStatusQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/savings/graphql/GetGoalsSuccessStatusQuery$Data;", "", "id", "<init>", "(Ljava/lang/String;)V", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/graphql/GetGoalsSuccessStatusQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Companion", "Data", "Moneybox"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GetGoalsSuccessStatusQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Companion INSTANCE = new com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "03b353d67d14c025f8e338f28e9a91b37fcef0751113ef43b31632e98b39118f";
    public static final java.lang.String OPERATION_NAME = "GetGoalsSuccessStatus";
    private final java.lang.String id;

    public GetGoalsSuccessStatusQuery(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    public final java.lang.String getId() {
        return this.id;
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
        com.paypal.oslo.feature.savings.graphql.adapter.GetGoalsSuccessStatusQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.savings.graphql.adapter.GetGoalsSuccessStatusQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.savings.graphql.selections.GetGoalsSuccessStatusQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetGoalsSuccessStatusQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/savings/graphql/GetGoalsSuccessStatusQuery$Moneybox;", "moneybox", "<init>", "(Lcom/paypal/oslo/feature/savings/graphql/GetGoalsSuccessStatusQuery$Moneybox;)V", "component1", "()Lcom/paypal/oslo/feature/savings/graphql/GetGoalsSuccessStatusQuery$Moneybox;", "copy", "(Lcom/paypal/oslo/feature/savings/graphql/GetGoalsSuccessStatusQuery$Moneybox;)Lcom/paypal/oslo/feature/savings/graphql/GetGoalsSuccessStatusQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/graphql/GetGoalsSuccessStatusQuery$Moneybox;", "getMoneybox"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Moneybox moneybox;

        public Data(com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Moneybox moneybox) {
            this.moneybox = moneybox;
        }

        public final com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Moneybox getMoneybox() {
            return this.moneybox;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Moneybox moneybox = this.moneybox;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(moneybox=");
            sb.append(moneybox);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Moneybox moneybox = this.moneybox;
            if (moneybox == null) {
                return 0;
            }
            return moneybox.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneybox, ((com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Data) other).moneybox);
        }

        public final com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Data copy(com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Moneybox moneybox) {
            return new com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Data(moneybox);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Moneybox getMoneybox() {
            return this.moneybox;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Data copy$default(com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Data data, com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Moneybox moneybox, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                moneybox = data.moneybox;
            }
            return data.copy(moneybox);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetGoalsSuccessStatusQuery$Moneybox;", "", "", "id", "name", "", "hasAcknowledgedTargetReached", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/savings/graphql/GetGoalsSuccessStatusQuery$Moneybox;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "Z", "getHasAcknowledgedTargetReached"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Moneybox {
        public static final int $stable = 0;
        private final boolean hasAcknowledgedTargetReached;
        private final java.lang.String id;
        private final java.lang.String name;

        public Moneybox(java.lang.String str, java.lang.String str2, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.id = str;
            this.name = str2;
            this.hasAcknowledgedTargetReached = z;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final boolean getHasAcknowledgedTargetReached() {
            return this.hasAcknowledgedTargetReached;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.name;
            boolean z = this.hasAcknowledgedTargetReached;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Moneybox(id=");
            sb.append(str);
            sb.append(", name=");
            sb.append(str2);
            sb.append(", hasAcknowledgedTargetReached=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + java.lang.Boolean.hashCode(this.hasAcknowledgedTargetReached);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Moneybox)) {
                return false;
            }
            com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Moneybox moneybox = (com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Moneybox) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, moneybox.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, moneybox.name) && this.hasAcknowledgedTargetReached == moneybox.hasAcknowledgedTargetReached;
        }

        public final com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Moneybox copy(java.lang.String id, java.lang.String name2, boolean hasAcknowledgedTargetReached) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Moneybox(id, name2, hasAcknowledgedTargetReached);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHasAcknowledgedTargetReached() {
            return this.hasAcknowledgedTargetReached;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Moneybox copy$default(com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery.Moneybox moneybox, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = moneybox.id;
            }
            if ((i & 2) != 0) {
                str2 = moneybox.name;
            }
            if ((i & 4) != 0) {
                z = moneybox.hasAcknowledgedTargetReached;
            }
            return moneybox.copy(str, str2, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetGoalsSuccessStatusQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetGoalsSuccessStatus($id: ID!) { moneybox(id: $id) { id name hasAcknowledgedTargetReached } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetGoalsSuccessStatusQuery(id=");
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
        return (other instanceof com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery) other).id);
    }

    public final com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery copy(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery(id);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery copy$default(com.paypal.oslo.feature.savings.graphql.GetGoalsSuccessStatusQuery getGoalsSuccessStatusQuery, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = getGoalsSuccessStatusQuery.id;
        }
        return getGoalsSuccessStatusQuery.copy(str);
    }
}
