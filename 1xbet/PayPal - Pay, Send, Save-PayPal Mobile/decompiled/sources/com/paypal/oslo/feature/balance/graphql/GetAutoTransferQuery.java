package com.paypal.oslo.feature.balance.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003!\" B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetAutoTransferQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/balance/graphql/GetAutoTransferQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "BalanceAutoTransfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetAutoTransferQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.Companion INSTANCE = new com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "b4d0d981176ad6acd3b629f55f5b8bfbfeedc9688fff0e763e3100e463e23c05";
    public static final java.lang.String OPERATION_NAME = "GetAutoTransfer";

    public final boolean equals(java.lang.Object other) {
        return other != null && other.getClass() == getClass();
    }

    public final int hashCode() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).hashCode();
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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.balance.graphql.adapter.GetAutoTransferQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.balance.graphql.selections.GetAutoTransferQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetAutoTransferQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/balance/graphql/GetAutoTransferQuery$BalanceAutoTransfer;", "balanceAutoTransfer", "<init>", "(Lcom/paypal/oslo/feature/balance/graphql/GetAutoTransferQuery$BalanceAutoTransfer;)V", "component1", "()Lcom/paypal/oslo/feature/balance/graphql/GetAutoTransferQuery$BalanceAutoTransfer;", "copy", "(Lcom/paypal/oslo/feature/balance/graphql/GetAutoTransferQuery$BalanceAutoTransfer;)Lcom/paypal/oslo/feature/balance/graphql/GetAutoTransferQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/graphql/GetAutoTransferQuery$BalanceAutoTransfer;", "getBalanceAutoTransfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.BalanceAutoTransfer balanceAutoTransfer;

        public Data(com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.BalanceAutoTransfer balanceAutoTransfer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceAutoTransfer, "");
            this.balanceAutoTransfer = balanceAutoTransfer;
        }

        public final com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.BalanceAutoTransfer getBalanceAutoTransfer() {
            return this.balanceAutoTransfer;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.BalanceAutoTransfer balanceAutoTransfer = this.balanceAutoTransfer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(balanceAutoTransfer=");
            sb.append(balanceAutoTransfer);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.balanceAutoTransfer.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceAutoTransfer, ((com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.Data) other).balanceAutoTransfer);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.Data copy(com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.BalanceAutoTransfer balanceAutoTransfer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceAutoTransfer, "");
            return new com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.Data(balanceAutoTransfer);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.BalanceAutoTransfer getBalanceAutoTransfer() {
            return this.balanceAutoTransfer;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.Data copy$default(com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.Data data, com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.BalanceAutoTransfer balanceAutoTransfer, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                balanceAutoTransfer = data.balanceAutoTransfer;
            }
            return data.copy(balanceAutoTransfer);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0003\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetAutoTransferQuery$BalanceAutoTransfer;", "", "", "isActive", "currencyCode", "<init>", "(ZLjava/lang/Object;)V", "component1", "()Z", "component2", "()Ljava/lang/Object;", "copy", "(ZLjava/lang/Object;)Lcom/paypal/oslo/feature/balance/graphql/GetAutoTransferQuery$BalanceAutoTransfer;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Ljava/lang/Object;", "getCurrencyCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BalanceAutoTransfer {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final boolean isActive;

        public BalanceAutoTransfer(boolean z, java.lang.Object obj) {
            this.isActive = z;
            this.currencyCode = obj;
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String toString() {
            boolean z = this.isActive;
            java.lang.Object obj = this.currencyCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceAutoTransfer(isActive=");
            sb.append(z);
            sb.append(", currencyCode=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.isActive);
            java.lang.Object obj = this.currencyCode;
            return (hashCode * 31) + (obj == null ? 0 : obj.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.BalanceAutoTransfer)) {
                return false;
            }
            com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.BalanceAutoTransfer balanceAutoTransfer = (com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.BalanceAutoTransfer) other;
            return this.isActive == balanceAutoTransfer.isActive && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, balanceAutoTransfer.currencyCode);
        }

        public final com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.BalanceAutoTransfer copy(boolean isActive, java.lang.Object currencyCode) {
            return new com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.BalanceAutoTransfer(isActive, currencyCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.BalanceAutoTransfer copy$default(com.paypal.oslo.feature.balance.graphql.GetAutoTransferQuery.BalanceAutoTransfer balanceAutoTransfer, boolean z, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                z = balanceAutoTransfer.isActive;
            }
            if ((i & 2) != 0) {
                obj = balanceAutoTransfer.currencyCode;
            }
            return balanceAutoTransfer.copy(z, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/graphql/GetAutoTransferQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetAutoTransfer { balanceAutoTransfer { isActive currencyCode } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, boolean withDefaultValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
    }
}
