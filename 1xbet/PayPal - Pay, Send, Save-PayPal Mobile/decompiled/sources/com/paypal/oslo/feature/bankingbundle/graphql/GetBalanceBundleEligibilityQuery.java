package com.paypal.oslo.feature.bankingbundle.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005!\"#$ B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "BalanceBundleEligibility", "Balances", "TotalAvailableAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetBalanceBundleEligibilityQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Companion INSTANCE = new com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "e8f73ef4951bbdea449b83b7b2cf53c5f4a6a6ab3478ae26c8d7bf76be4f1069";
    public static final java.lang.String OPERATION_NAME = "GetBalanceBundleEligibility";

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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.bankingbundle.graphql.adapter.GetBalanceBundleEligibilityQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.bankingbundle.graphql.selections.GetBalanceBundleEligibilityQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$BalanceBundleEligibility;", "balanceBundleEligibility", "Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$Balances;", "balances", "<init>", "(Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$BalanceBundleEligibility;Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$Balances;)V", "component1", "()Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$BalanceBundleEligibility;", "component2", "()Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$Balances;", "copy", "(Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$BalanceBundleEligibility;Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$Balances;)Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$BalanceBundleEligibility;", "getBalanceBundleEligibility", "Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$Balances;", "getBalances"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility balanceBundleEligibility;
        private final com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Balances balances;

        public Data(com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility balanceBundleEligibility, com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Balances balances) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balances, "");
            this.balanceBundleEligibility = balanceBundleEligibility;
            this.balances = balances;
        }

        public final com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility getBalanceBundleEligibility() {
            return this.balanceBundleEligibility;
        }

        public final com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Balances getBalances() {
            return this.balances;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility balanceBundleEligibility = this.balanceBundleEligibility;
            com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Balances balances = this.balances;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(balanceBundleEligibility=");
            sb.append(balanceBundleEligibility);
            sb.append(", balances=");
            sb.append(balances);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility balanceBundleEligibility = this.balanceBundleEligibility;
            return ((balanceBundleEligibility == null ? 0 : balanceBundleEligibility.hashCode()) * 31) + this.balances.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Data)) {
                return false;
            }
            com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Data data = (com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Data) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.balanceBundleEligibility, data.balanceBundleEligibility) && kotlin.jvm.internal.Intrinsics.areEqual(this.balances, data.balances);
        }

        public final com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Data copy(com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility balanceBundleEligibility, com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Balances balances) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balances, "");
            return new com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Data(balanceBundleEligibility, balances);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Balances getBalances() {
            return this.balances;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility getBalanceBundleEligibility() {
            return this.balanceBundleEligibility;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Data copy$default(com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Data data, com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility balanceBundleEligibility, com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Balances balances, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                balanceBundleEligibility = data.balanceBundleEligibility;
            }
            if ((i & 2) != 0) {
                balances = data.balances;
            }
            return data.copy(balanceBundleEligibility, balances);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$BalanceBundleEligibility;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceBundleEligibilityStatus;", "status", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceBundleEligibilityReason;", "reason", "", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceBundleProductName;", com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ModuleName.Products, "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BalanceBundleEligibilityStatus;Lcom/paypal/oslo/api/graphql/schema/type/BalanceBundleEligibilityReason;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BalanceBundleEligibilityStatus;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/BalanceBundleEligibilityReason;", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BalanceBundleEligibilityStatus;Lcom/paypal/oslo/api/graphql/schema/type/BalanceBundleEligibilityReason;Ljava/util/List;)Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$BalanceBundleEligibility;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceBundleEligibilityStatus;", "getStatus", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceBundleEligibilityReason;", "getReason", "Ljava/util/List;", "getProducts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BalanceBundleEligibility {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductName> products;
        private final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason reason;
        private final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityStatus status;

        /* JADX WARN: Multi-variable type inference failed */
        public BalanceBundleEligibility(com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityStatus balanceBundleEligibilityStatus, com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason balanceBundleEligibilityReason, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductName> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceBundleEligibilityStatus, "");
            this.status = balanceBundleEligibilityStatus;
            this.reason = balanceBundleEligibilityReason;
            this.products = list;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason getReason() {
            return this.reason;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductName> getProducts() {
            return this.products;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityStatus balanceBundleEligibilityStatus = this.status;
            com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason balanceBundleEligibilityReason = this.reason;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductName> list = this.products;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceBundleEligibility(status=");
            sb.append(balanceBundleEligibilityStatus);
            sb.append(", reason=");
            sb.append(balanceBundleEligibilityReason);
            sb.append(", products=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.status.hashCode();
            com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason balanceBundleEligibilityReason = this.reason;
            int hashCode2 = balanceBundleEligibilityReason == null ? 0 : balanceBundleEligibilityReason.hashCode();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductName> list = this.products;
            return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility)) {
                return false;
            }
            com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility balanceBundleEligibility = (com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility) other;
            return this.status == balanceBundleEligibility.status && this.reason == balanceBundleEligibility.reason && kotlin.jvm.internal.Intrinsics.areEqual(this.products, balanceBundleEligibility.products);
        }

        public final com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility copy(com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityStatus status, com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason reason, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductName> products) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility(status, reason, products);
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductName> component3() {
            return this.products;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason getReason() {
            return this.reason;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityStatus getStatus() {
            return this.status;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility copy$default(com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.BalanceBundleEligibility balanceBundleEligibility, com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityStatus balanceBundleEligibilityStatus, com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityReason balanceBundleEligibilityReason, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                balanceBundleEligibilityStatus = balanceBundleEligibility.status;
            }
            if ((i & 2) != 0) {
                balanceBundleEligibilityReason = balanceBundleEligibility.reason;
            }
            if ((i & 4) != 0) {
                list = balanceBundleEligibility.products;
            }
            return balanceBundleEligibility.copy(balanceBundleEligibilityStatus, balanceBundleEligibilityReason, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$Balances;", "", "Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$TotalAvailableAmount;", "totalAvailableAmount", "<init>", "(Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$TotalAvailableAmount;)V", "component1", "()Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$TotalAvailableAmount;", "copy", "(Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$TotalAvailableAmount;)Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$Balances;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$TotalAvailableAmount;", "getTotalAvailableAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Balances {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.TotalAvailableAmount totalAvailableAmount;

        public Balances(com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.TotalAvailableAmount totalAvailableAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAvailableAmount, "");
            this.totalAvailableAmount = totalAvailableAmount;
        }

        public final com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.TotalAvailableAmount getTotalAvailableAmount() {
            return this.totalAvailableAmount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.TotalAvailableAmount totalAvailableAmount = this.totalAvailableAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Balances(totalAvailableAmount=");
            sb.append(totalAvailableAmount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.totalAvailableAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Balances) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAvailableAmount, ((com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Balances) other).totalAvailableAmount);
        }

        public final com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Balances copy(com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.TotalAvailableAmount totalAvailableAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAvailableAmount, "");
            return new com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Balances(totalAvailableAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.TotalAvailableAmount getTotalAvailableAmount() {
            return this.totalAvailableAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Balances copy$default(com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.Balances balances, com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.TotalAvailableAmount totalAvailableAmount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                totalAvailableAmount = balances.totalAvailableAmount;
            }
            return balances.copy(totalAvailableAmount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$TotalAvailableAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$TotalAvailableAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalAvailableAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TotalAvailableAmount(java.lang.Object obj, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.currencyCode = obj;
            this.value = str;
        }

        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.currencyCode;
            java.lang.String str = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalAvailableAmount(currencyCode=");
            sb.append(obj);
            sb.append(", value=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.currencyCode.hashCode() * 31) + this.value.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.TotalAvailableAmount)) {
                return false;
            }
            com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.TotalAvailableAmount totalAvailableAmount = (com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.TotalAvailableAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalAvailableAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalAvailableAmount.value);
        }

        public final com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.TotalAvailableAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.TotalAvailableAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.TotalAvailableAmount copy$default(com.paypal.oslo.feature.bankingbundle.graphql.GetBalanceBundleEligibilityQuery.TotalAvailableAmount totalAvailableAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = totalAvailableAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = totalAvailableAmount.value;
            }
            return totalAvailableAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/graphql/GetBalanceBundleEligibilityQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetBalanceBundleEligibility { balanceBundleEligibility(input: { includePreEligibilityDecision: true } ) { status reason products } balances { totalAvailableAmount { currencyCode value } } }";
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
