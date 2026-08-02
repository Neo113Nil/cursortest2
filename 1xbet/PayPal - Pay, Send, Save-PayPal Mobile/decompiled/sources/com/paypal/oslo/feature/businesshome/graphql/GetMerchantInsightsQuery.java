package com.paypal.oslo.feature.businesshome.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0011!\"#$%&'()*+,-./0 B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "MerchantInsights", "TransactionMetrics", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING, "TotalAmount", "SingleActivity", "CounterParty", "Name", "BusinessName", "Payable", "TotalAmount1", "SingleActivity1", "CounterParty1", "Name1", "BusinessName1", "DisputeMetrics"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetMerchantInsightsQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Companion INSTANCE = new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "47738f629d533275900a488a08dbce474debeb6161a0a09d5711c51129060f97";
    public static final java.lang.String OPERATION_NAME = "GetMerchantInsights";

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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantInsightsQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.businesshome.graphql.selections.GetMerchantInsightsQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$MerchantInsights;", "merchantInsights", "<init>", "(Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$MerchantInsights;)V", "component1", "()Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$MerchantInsights;", "copy", "(Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$MerchantInsights;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$MerchantInsights;", "getMerchantInsights"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights merchantInsights;

        public Data(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights merchantInsights) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantInsights, "");
            this.merchantInsights = merchantInsights;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights getMerchantInsights() {
            return this.merchantInsights;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights merchantInsights = this.merchantInsights;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(merchantInsights=");
            sb.append(merchantInsights);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.merchantInsights.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantInsights, ((com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Data) other).merchantInsights);
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Data copy(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights merchantInsights) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantInsights, "");
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Data(merchantInsights);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights getMerchantInsights() {
            return this.merchantInsights;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Data copy$default(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Data data, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights merchantInsights, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                merchantInsights = data.merchantInsights;
            }
            return data.copy(merchantInsights);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$MerchantInsights;", "", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TransactionMetrics;", "transactionMetrics", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$DisputeMetrics;", "disputeMetrics", "<init>", "(Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TransactionMetrics;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$DisputeMetrics;)V", "component1", "()Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TransactionMetrics;", "component2", "()Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$DisputeMetrics;", "copy", "(Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TransactionMetrics;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$DisputeMetrics;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$MerchantInsights;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TransactionMetrics;", "getTransactionMetrics", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$DisputeMetrics;", "getDisputeMetrics"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MerchantInsights {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.DisputeMetrics disputeMetrics;
        private final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TransactionMetrics transactionMetrics;

        public MerchantInsights(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TransactionMetrics transactionMetrics, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.DisputeMetrics disputeMetrics) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionMetrics, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disputeMetrics, "");
            this.transactionMetrics = transactionMetrics;
            this.disputeMetrics = disputeMetrics;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TransactionMetrics getTransactionMetrics() {
            return this.transactionMetrics;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.DisputeMetrics getDisputeMetrics() {
            return this.disputeMetrics;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TransactionMetrics transactionMetrics = this.transactionMetrics;
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.DisputeMetrics disputeMetrics = this.disputeMetrics;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MerchantInsights(transactionMetrics=");
            sb.append(transactionMetrics);
            sb.append(", disputeMetrics=");
            sb.append(disputeMetrics);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.transactionMetrics.hashCode() * 31) + this.disputeMetrics.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights)) {
                return false;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights merchantInsights = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionMetrics, merchantInsights.transactionMetrics) && kotlin.jvm.internal.Intrinsics.areEqual(this.disputeMetrics, merchantInsights.disputeMetrics);
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights copy(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TransactionMetrics transactionMetrics, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.DisputeMetrics disputeMetrics) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionMetrics, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disputeMetrics, "");
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights(transactionMetrics, disputeMetrics);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.DisputeMetrics getDisputeMetrics() {
            return this.disputeMetrics;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TransactionMetrics getTransactionMetrics() {
            return this.transactionMetrics;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights copy$default(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights merchantInsights, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TransactionMetrics transactionMetrics, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.DisputeMetrics disputeMetrics, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                transactionMetrics = merchantInsights.transactionMetrics;
            }
            if ((i & 2) != 0) {
                disputeMetrics = merchantInsights.disputeMetrics;
            }
            return merchantInsights.copy(transactionMetrics, disputeMetrics);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TransactionMetrics;", "", "", "total", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Pending;", "pending", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Payable;", "payable", "<init>", "(ILcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Pending;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Payable;)V", "component1", "()I", "component2", "()Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Pending;", "component3", "()Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Payable;", "copy", "(ILcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Pending;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Payable;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TransactionMetrics;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTotal", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Pending;", "getPending", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Payable;", "getPayable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionMetrics {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Payable payable;
        private final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Pending pending;
        private final int total;

        public TransactionMetrics(int i, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Pending pending, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Payable payable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pending, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payable, "");
            this.total = i;
            this.pending = pending;
            this.payable = payable;
        }

        public final int getTotal() {
            return this.total;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Pending getPending() {
            return this.pending;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Payable getPayable() {
            return this.payable;
        }

        public final java.lang.String toString() {
            int i = this.total;
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Pending pending = this.pending;
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Payable payable = this.payable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionMetrics(total=");
            sb.append(i);
            sb.append(", pending=");
            sb.append(pending);
            sb.append(", payable=");
            sb.append(payable);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((java.lang.Integer.hashCode(this.total) * 31) + this.pending.hashCode()) * 31) + this.payable.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TransactionMetrics)) {
                return false;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TransactionMetrics transactionMetrics = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TransactionMetrics) other;
            return this.total == transactionMetrics.total && kotlin.jvm.internal.Intrinsics.areEqual(this.pending, transactionMetrics.pending) && kotlin.jvm.internal.Intrinsics.areEqual(this.payable, transactionMetrics.payable);
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TransactionMetrics copy(int total, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Pending pending, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Payable payable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pending, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payable, "");
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TransactionMetrics(total, pending, payable);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Payable getPayable() {
            return this.payable;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Pending getPending() {
            return this.pending;
        }

        /* renamed from: component1, reason: from getter */
        public final int getTotal() {
            return this.total;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TransactionMetrics copy$default(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TransactionMetrics transactionMetrics, int i, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Pending pending, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Payable payable, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = transactionMetrics.total;
            }
            if ((i2 & 2) != 0) {
                pending = transactionMetrics.pending;
            }
            if ((i2 & 4) != 0) {
                payable = transactionMetrics.payable;
            }
            return transactionMetrics.copy(i, pending, payable);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJV\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0011J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0016R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0018R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Pending;", "", "", com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.TOTAL_COUNT, "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TotalAmount;", "totalAmount", "overdueCount", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$SingleActivity;", "singleActivity", "", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$CounterParty;", "counterParties", "", "hasMultipleCurrencies", "<init>", "(ILcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TotalAmount;ILcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$SingleActivity;Ljava/util/List;Z)V", "component1", "()I", "component2", "()Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TotalAmount;", "component3", "component4", "()Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$SingleActivity;", "component5", "()Ljava/util/List;", "component6", "()Z", "copy", "(ILcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TotalAmount;ILcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$SingleActivity;Ljava/util/List;Z)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Pending;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTotalCount", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TotalAmount;", "getTotalAmount", "getOverdueCount", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$SingleActivity;", "getSingleActivity", "Ljava/util/List;", "getCounterParties", "Z", "getHasMultipleCurrencies"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Pending {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty> counterParties;
        private final boolean hasMultipleCurrencies;
        private final int overdueCount;
        private final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity singleActivity;
        private final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount totalAmount;
        private final int totalCount;

        public Pending(int i, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount totalAmount, int i2, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity singleActivity, java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty> list, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmount, "");
            this.totalCount = i;
            this.totalAmount = totalAmount;
            this.overdueCount = i2;
            this.singleActivity = singleActivity;
            this.counterParties = list;
            this.hasMultipleCurrencies = z;
        }

        public final int getTotalCount() {
            return this.totalCount;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount getTotalAmount() {
            return this.totalAmount;
        }

        public final int getOverdueCount() {
            return this.overdueCount;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity getSingleActivity() {
            return this.singleActivity;
        }

        public final java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty> getCounterParties() {
            return this.counterParties;
        }

        public final boolean getHasMultipleCurrencies() {
            return this.hasMultipleCurrencies;
        }

        public final java.lang.String toString() {
            int i = this.totalCount;
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount totalAmount = this.totalAmount;
            int i2 = this.overdueCount;
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity singleActivity = this.singleActivity;
            java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty> list = this.counterParties;
            boolean z = this.hasMultipleCurrencies;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Pending(totalCount=");
            sb.append(i);
            sb.append(", totalAmount=");
            sb.append(totalAmount);
            sb.append(", overdueCount=");
            sb.append(i2);
            sb.append(", singleActivity=");
            sb.append(singleActivity);
            sb.append(", counterParties=");
            sb.append(list);
            sb.append(", hasMultipleCurrencies=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.totalCount);
            int hashCode2 = this.totalAmount.hashCode();
            int hashCode3 = java.lang.Integer.hashCode(this.overdueCount);
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity singleActivity = this.singleActivity;
            int hashCode4 = singleActivity == null ? 0 : singleActivity.hashCode();
            java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty> list = this.counterParties;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (list != null ? list.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.hasMultipleCurrencies);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Pending)) {
                return false;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Pending pending = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Pending) other;
            return this.totalCount == pending.totalCount && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmount, pending.totalAmount) && this.overdueCount == pending.overdueCount && kotlin.jvm.internal.Intrinsics.areEqual(this.singleActivity, pending.singleActivity) && kotlin.jvm.internal.Intrinsics.areEqual(this.counterParties, pending.counterParties) && this.hasMultipleCurrencies == pending.hasMultipleCurrencies;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Pending copy(int totalCount, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount totalAmount, int overdueCount, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity singleActivity, java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty> counterParties, boolean hasMultipleCurrencies) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmount, "");
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Pending(totalCount, totalAmount, overdueCount, singleActivity, counterParties, hasMultipleCurrencies);
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getHasMultipleCurrencies() {
            return this.hasMultipleCurrencies;
        }

        public final java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty> component5() {
            return this.counterParties;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity getSingleActivity() {
            return this.singleActivity;
        }

        /* renamed from: component3, reason: from getter */
        public final int getOverdueCount() {
            return this.overdueCount;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount getTotalAmount() {
            return this.totalAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final int getTotalCount() {
            return this.totalCount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Pending copy$default(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Pending pending, int i, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount totalAmount, int i2, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity singleActivity, java.util.List list, boolean z, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = pending.totalCount;
            }
            if ((i3 & 2) != 0) {
                totalAmount = pending.totalAmount;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount totalAmount2 = totalAmount;
            if ((i3 & 4) != 0) {
                i2 = pending.overdueCount;
            }
            int i4 = i2;
            if ((i3 & 8) != 0) {
                singleActivity = pending.singleActivity;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity singleActivity2 = singleActivity;
            if ((i3 & 16) != 0) {
                list = pending.counterParties;
            }
            java.util.List list2 = list;
            if ((i3 & 32) != 0) {
                z = pending.hasMultipleCurrencies;
            }
            return pending.copy(i, totalAmount2, i4, singleActivity2, list2, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TotalAmount;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TotalAmount;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalAmount {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TotalAmount(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalAmount(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount)) {
                return false;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount totalAmount = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalAmount.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalAmount.value);
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount copy$default(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount totalAmount, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = totalAmount.currencyCode;
            }
            if ((i & 2) != 0) {
                str = totalAmount.value;
            }
            return totalAmount.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$SingleActivity;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantActivityType;", "type", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MerchantActivityType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/MerchantActivityType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MerchantActivityType;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$SingleActivity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantActivityType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SingleActivity {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final com.paypal.oslo.api.graphql.schema.type.MerchantActivityType type;

        public SingleActivity(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MerchantActivityType merchantActivityType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantActivityType, "");
            this.id = str;
            this.type = merchantActivityType;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.MerchantActivityType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.MerchantActivityType merchantActivityType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SingleActivity(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(merchantActivityType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity)) {
                return false;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity singleActivity = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, singleActivity.id) && this.type == singleActivity.type;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.MerchantActivityType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity(id, type);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.MerchantActivityType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity copy$default(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity singleActivity, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MerchantActivityType merchantActivityType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = singleActivity.id;
            }
            if ((i & 2) != 0) {
                merchantActivityType = singleActivity.type;
            }
            return singleActivity.copy(str, merchantActivityType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$CounterParty;", "", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Name;", "name", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$BusinessName;", "businessName", "profilePictureUrl", "<init>", "(Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Name;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$BusinessName;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Name;", "component2", "()Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$BusinessName;", "component3", "()Ljava/lang/Object;", "copy", "(Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Name;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$BusinessName;Ljava/lang/Object;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$CounterParty;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Name;", "getName", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$BusinessName;", "getBusinessName", "Ljava/lang/Object;", "getProfilePictureUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CounterParty {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName businessName;
        private final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name name;
        private final java.lang.Object profilePictureUrl;

        public CounterParty(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name name2, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName businessName, java.lang.Object obj) {
            this.name = name2;
            this.businessName = businessName;
            this.profilePictureUrl = obj;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name getName() {
            return this.name;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName getBusinessName() {
            return this.businessName;
        }

        public final java.lang.Object getProfilePictureUrl() {
            return this.profilePictureUrl;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name name2 = this.name;
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName businessName = this.businessName;
            java.lang.Object obj = this.profilePictureUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CounterParty(name=");
            sb.append(name2);
            sb.append(", businessName=");
            sb.append(businessName);
            sb.append(", profilePictureUrl=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name name2 = this.name;
            int hashCode = name2 == null ? 0 : name2.hashCode();
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName businessName = this.businessName;
            int hashCode2 = businessName == null ? 0 : businessName.hashCode();
            java.lang.Object obj = this.profilePictureUrl;
            return (((hashCode * 31) + hashCode2) * 31) + (obj != null ? obj.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty)) {
                return false;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty counterParty = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, counterParty.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.businessName, counterParty.businessName) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePictureUrl, counterParty.profilePictureUrl);
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty copy(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name name2, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName businessName, java.lang.Object profilePictureUrl) {
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty(name2, businessName, profilePictureUrl);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getProfilePictureUrl() {
            return this.profilePictureUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName getBusinessName() {
            return this.businessName;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty copy$default(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty counterParty, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name name2, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName businessName, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                name2 = counterParty.name;
            }
            if ((i & 2) != 0) {
                businessName = counterParty.businessName;
            }
            if ((i & 4) != 0) {
                obj = counterParty.profilePictureUrl;
            }
            return counterParty.copy(name2, businessName, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJd\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b%\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Name;", "", "", "prefix", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", "secondSurname", com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "suffix", "fullName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Name;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPrefix", "getGivenName", "getSurname", "getSecondSurname", "getMiddleName", "getSuffix", "getFullName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Name {
        public static final int $stable = 0;
        private final java.lang.String fullName;
        private final java.lang.String givenName;
        private final java.lang.String middleName;
        private final java.lang.String prefix;
        private final java.lang.String secondSurname;
        private final java.lang.String suffix;
        private final java.lang.String surname;

        public Name(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
            this.prefix = str;
            this.givenName = str2;
            this.surname = str3;
            this.secondSurname = str4;
            this.middleName = str5;
            this.suffix = str6;
            this.fullName = str7;
        }

        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public final java.lang.String getSurname() {
            return this.surname;
        }

        public final java.lang.String getSecondSurname() {
            return this.secondSurname;
        }

        public final java.lang.String getMiddleName() {
            return this.middleName;
        }

        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        public final java.lang.String getFullName() {
            return this.fullName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.prefix;
            java.lang.String str2 = this.givenName;
            java.lang.String str3 = this.surname;
            java.lang.String str4 = this.secondSurname;
            java.lang.String str5 = this.middleName;
            java.lang.String str6 = this.suffix;
            java.lang.String str7 = this.fullName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Name(prefix=");
            sb.append(str);
            sb.append(", givenName=");
            sb.append(str2);
            sb.append(", surname=");
            sb.append(str3);
            sb.append(", secondSurname=");
            sb.append(str4);
            sb.append(", middleName=");
            sb.append(str5);
            sb.append(", suffix=");
            sb.append(str6);
            sb.append(", fullName=");
            sb.append(str7);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.prefix;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.givenName;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.surname;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.secondSurname;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.middleName;
            int hashCode5 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.suffix;
            int hashCode6 = str6 == null ? 0 : str6.hashCode();
            java.lang.String str7 = this.fullName;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name)) {
                return false;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name name2 = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.prefix, name2.prefix) && kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, name2.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, name2.surname) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondSurname, name2.secondSurname) && kotlin.jvm.internal.Intrinsics.areEqual(this.middleName, name2.middleName) && kotlin.jvm.internal.Intrinsics.areEqual(this.suffix, name2.suffix) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, name2.fullName);
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name copy(java.lang.String prefix, java.lang.String givenName, java.lang.String surname, java.lang.String secondSurname, java.lang.String middleName, java.lang.String suffix, java.lang.String fullName) {
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name(prefix, givenName, surname, secondSurname, middleName, suffix, fullName);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getFullName() {
            return this.fullName;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getMiddleName() {
            return this.middleName;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getSecondSurname() {
            return this.secondSurname;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSurname() {
            return this.surname;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name copy$default(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name name2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = name2.prefix;
            }
            if ((i & 2) != 0) {
                str2 = name2.givenName;
            }
            java.lang.String str8 = str2;
            if ((i & 4) != 0) {
                str3 = name2.surname;
            }
            java.lang.String str9 = str3;
            if ((i & 8) != 0) {
                str4 = name2.secondSurname;
            }
            java.lang.String str10 = str4;
            if ((i & 16) != 0) {
                str5 = name2.middleName;
            }
            java.lang.String str11 = str5;
            if ((i & 32) != 0) {
                str6 = name2.suffix;
            }
            java.lang.String str12 = str6;
            if ((i & 64) != 0) {
                str7 = name2.fullName;
            }
            return name2.copy(str, str8, str9, str10, str11, str12, str7);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$BusinessName;", "", "", "businessName", "Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "orthography", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/Orthography;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/Orthography;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$BusinessName;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBusinessName", "Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "getOrthography"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BusinessName {
        public static final int $stable = 0;
        private final java.lang.String businessName;
        private final com.paypal.oslo.api.graphql.schema.type.Orthography orthography;

        public BusinessName(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.Orthography orthography) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.businessName = str;
            this.orthography = orthography;
        }

        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public final com.paypal.oslo.api.graphql.schema.type.Orthography getOrthography() {
            return this.orthography;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.businessName;
            com.paypal.oslo.api.graphql.schema.type.Orthography orthography = this.orthography;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BusinessName(businessName=");
            sb.append(str);
            sb.append(", orthography=");
            sb.append(orthography);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.businessName.hashCode();
            com.paypal.oslo.api.graphql.schema.type.Orthography orthography = this.orthography;
            return (hashCode * 31) + (orthography == null ? 0 : orthography.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName)) {
                return false;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName businessName = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.businessName, businessName.businessName) && this.orthography == businessName.orthography;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName copy(java.lang.String businessName, com.paypal.oslo.api.graphql.schema.type.Orthography orthography) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessName, "");
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName(businessName, orthography);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.Orthography getOrthography() {
            return this.orthography;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName copy$default(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName businessName, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.Orthography orthography, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = businessName.businessName;
            }
            if ((i & 2) != 0) {
                orthography = businessName.orthography;
            }
            return businessName.copy(str, orthography);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJV\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0011J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0018R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Payable;", "", "", com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes.TOTAL_COUNT, "overdueCount", "", "hasMultipleCurrencies", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TotalAmount1;", "totalAmount", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$SingleActivity1;", "singleActivity", "", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$CounterParty1;", "counterParties", "<init>", "(IIZLcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TotalAmount1;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$SingleActivity1;Ljava/util/List;)V", "component1", "()I", "component2", "component3", "()Z", "component4", "()Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TotalAmount1;", "component5", "()Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$SingleActivity1;", "component6", "()Ljava/util/List;", "copy", "(IIZLcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TotalAmount1;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$SingleActivity1;Ljava/util/List;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Payable;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTotalCount", "getOverdueCount", "Z", "getHasMultipleCurrencies", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TotalAmount1;", "getTotalAmount", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$SingleActivity1;", "getSingleActivity", "Ljava/util/List;", "getCounterParties"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Payable {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty1> counterParties;
        private final boolean hasMultipleCurrencies;
        private final int overdueCount;
        private final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1 singleActivity;
        private final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1 totalAmount;
        private final int totalCount;

        public Payable(int i, int i2, boolean z, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1 totalAmount1, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1 singleActivity1, java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty1> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmount1, "");
            this.totalCount = i;
            this.overdueCount = i2;
            this.hasMultipleCurrencies = z;
            this.totalAmount = totalAmount1;
            this.singleActivity = singleActivity1;
            this.counterParties = list;
        }

        public final int getTotalCount() {
            return this.totalCount;
        }

        public final int getOverdueCount() {
            return this.overdueCount;
        }

        public final boolean getHasMultipleCurrencies() {
            return this.hasMultipleCurrencies;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1 getTotalAmount() {
            return this.totalAmount;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1 getSingleActivity() {
            return this.singleActivity;
        }

        public final java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty1> getCounterParties() {
            return this.counterParties;
        }

        public final java.lang.String toString() {
            int i = this.totalCount;
            int i2 = this.overdueCount;
            boolean z = this.hasMultipleCurrencies;
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1 totalAmount1 = this.totalAmount;
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1 singleActivity1 = this.singleActivity;
            java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty1> list = this.counterParties;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Payable(totalCount=");
            sb.append(i);
            sb.append(", overdueCount=");
            sb.append(i2);
            sb.append(", hasMultipleCurrencies=");
            sb.append(z);
            sb.append(", totalAmount=");
            sb.append(totalAmount1);
            sb.append(", singleActivity=");
            sb.append(singleActivity1);
            sb.append(", counterParties=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.totalCount);
            int hashCode2 = java.lang.Integer.hashCode(this.overdueCount);
            int hashCode3 = java.lang.Boolean.hashCode(this.hasMultipleCurrencies);
            int hashCode4 = this.totalAmount.hashCode();
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1 singleActivity1 = this.singleActivity;
            int hashCode5 = singleActivity1 == null ? 0 : singleActivity1.hashCode();
            java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty1> list = this.counterParties;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Payable)) {
                return false;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Payable payable = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Payable) other;
            return this.totalCount == payable.totalCount && this.overdueCount == payable.overdueCount && this.hasMultipleCurrencies == payable.hasMultipleCurrencies && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmount, payable.totalAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.singleActivity, payable.singleActivity) && kotlin.jvm.internal.Intrinsics.areEqual(this.counterParties, payable.counterParties);
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Payable copy(int totalCount, int overdueCount, boolean hasMultipleCurrencies, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1 totalAmount, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1 singleActivity, java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty1> counterParties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmount, "");
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Payable(totalCount, overdueCount, hasMultipleCurrencies, totalAmount, singleActivity, counterParties);
        }

        public final java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty1> component6() {
            return this.counterParties;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1 getSingleActivity() {
            return this.singleActivity;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1 getTotalAmount() {
            return this.totalAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHasMultipleCurrencies() {
            return this.hasMultipleCurrencies;
        }

        /* renamed from: component2, reason: from getter */
        public final int getOverdueCount() {
            return this.overdueCount;
        }

        /* renamed from: component1, reason: from getter */
        public final int getTotalCount() {
            return this.totalCount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Payable copy$default(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Payable payable, int i, int i2, boolean z, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1 totalAmount1, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1 singleActivity1, java.util.List list, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = payable.totalCount;
            }
            if ((i3 & 2) != 0) {
                i2 = payable.overdueCount;
            }
            int i4 = i2;
            if ((i3 & 4) != 0) {
                z = payable.hasMultipleCurrencies;
            }
            boolean z2 = z;
            if ((i3 & 8) != 0) {
                totalAmount1 = payable.totalAmount;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1 totalAmount12 = totalAmount1;
            if ((i3 & 16) != 0) {
                singleActivity1 = payable.singleActivity;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1 singleActivity12 = singleActivity1;
            if ((i3 & 32) != 0) {
                list = payable.counterParties;
            }
            return payable.copy(i, i4, z2, totalAmount12, singleActivity12, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TotalAmount1;", "", "currencyCode", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$TotalAmount1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getCurrencyCode", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TotalAmount1 {
        public static final int $stable = 8;
        private final java.lang.Object currencyCode;
        private final java.lang.String value;

        public TotalAmount1(java.lang.Object obj, java.lang.String str) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TotalAmount1(currencyCode=");
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
            if (!(other instanceof com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1)) {
                return false;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1 totalAmount1 = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, totalAmount1.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, totalAmount1.value);
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1 copy(java.lang.Object currencyCode, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1(currencyCode, value);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getCurrencyCode() {
            return this.currencyCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1 copy$default(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1 totalAmount1, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = totalAmount1.currencyCode;
            }
            if ((i & 2) != 0) {
                str = totalAmount1.value;
            }
            return totalAmount1.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$SingleActivity1;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantActivityType;", "type", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MerchantActivityType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/MerchantActivityType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MerchantActivityType;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$SingleActivity1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantActivityType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SingleActivity1 {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final com.paypal.oslo.api.graphql.schema.type.MerchantActivityType type;

        public SingleActivity1(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MerchantActivityType merchantActivityType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantActivityType, "");
            this.id = str;
            this.type = merchantActivityType;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final com.paypal.oslo.api.graphql.schema.type.MerchantActivityType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            com.paypal.oslo.api.graphql.schema.type.MerchantActivityType merchantActivityType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SingleActivity1(id=");
            sb.append(str);
            sb.append(", type=");
            sb.append(merchantActivityType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.id.hashCode() * 31) + this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1)) {
                return false;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1 singleActivity1 = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, singleActivity1.id) && this.type == singleActivity1.type;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1 copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.MerchantActivityType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1(id, type);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.MerchantActivityType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1 copy$default(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1 singleActivity1, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MerchantActivityType merchantActivityType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = singleActivity1.id;
            }
            if ((i & 2) != 0) {
                merchantActivityType = singleActivity1.type;
            }
            return singleActivity1.copy(str, merchantActivityType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$CounterParty1;", "", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Name1;", "name", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$BusinessName1;", "businessName", "profilePictureUrl", "<init>", "(Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Name1;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$BusinessName1;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Name1;", "component2", "()Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$BusinessName1;", "component3", "()Ljava/lang/Object;", "copy", "(Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Name1;Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$BusinessName1;Ljava/lang/Object;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$CounterParty1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Name1;", "getName", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$BusinessName1;", "getBusinessName", "Ljava/lang/Object;", "getProfilePictureUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CounterParty1 {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1 businessName;
        private final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1 name;
        private final java.lang.Object profilePictureUrl;

        public CounterParty1(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1 name1, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1 businessName1, java.lang.Object obj) {
            this.name = name1;
            this.businessName = businessName1;
            this.profilePictureUrl = obj;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1 getName() {
            return this.name;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1 getBusinessName() {
            return this.businessName;
        }

        public final java.lang.Object getProfilePictureUrl() {
            return this.profilePictureUrl;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1 name1 = this.name;
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1 businessName1 = this.businessName;
            java.lang.Object obj = this.profilePictureUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CounterParty1(name=");
            sb.append(name1);
            sb.append(", businessName=");
            sb.append(businessName1);
            sb.append(", profilePictureUrl=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1 name1 = this.name;
            int hashCode = name1 == null ? 0 : name1.hashCode();
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1 businessName1 = this.businessName;
            int hashCode2 = businessName1 == null ? 0 : businessName1.hashCode();
            java.lang.Object obj = this.profilePictureUrl;
            return (((hashCode * 31) + hashCode2) * 31) + (obj != null ? obj.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty1)) {
                return false;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty1 counterParty1 = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, counterParty1.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.businessName, counterParty1.businessName) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePictureUrl, counterParty1.profilePictureUrl);
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty1 copy(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1 name2, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1 businessName, java.lang.Object profilePictureUrl) {
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty1(name2, businessName, profilePictureUrl);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getProfilePictureUrl() {
            return this.profilePictureUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1 getBusinessName() {
            return this.businessName;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1 getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty1 copy$default(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty1 counterParty1, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1 name1, com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1 businessName1, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                name1 = counterParty1.name;
            }
            if ((i & 2) != 0) {
                businessName1 = counterParty1.businessName;
            }
            if ((i & 4) != 0) {
                obj = counterParty1.profilePictureUrl;
            }
            return counterParty1.copy(name1, businessName1, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJd\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b%\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Name1;", "", "", "prefix", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", "secondSurname", com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "suffix", "fullName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Name1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPrefix", "getGivenName", "getSurname", "getSecondSurname", "getMiddleName", "getSuffix", "getFullName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Name1 {
        public static final int $stable = 0;
        private final java.lang.String fullName;
        private final java.lang.String givenName;
        private final java.lang.String middleName;
        private final java.lang.String prefix;
        private final java.lang.String secondSurname;
        private final java.lang.String suffix;
        private final java.lang.String surname;

        public Name1(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
            this.prefix = str;
            this.givenName = str2;
            this.surname = str3;
            this.secondSurname = str4;
            this.middleName = str5;
            this.suffix = str6;
            this.fullName = str7;
        }

        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public final java.lang.String getSurname() {
            return this.surname;
        }

        public final java.lang.String getSecondSurname() {
            return this.secondSurname;
        }

        public final java.lang.String getMiddleName() {
            return this.middleName;
        }

        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        public final java.lang.String getFullName() {
            return this.fullName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.prefix;
            java.lang.String str2 = this.givenName;
            java.lang.String str3 = this.surname;
            java.lang.String str4 = this.secondSurname;
            java.lang.String str5 = this.middleName;
            java.lang.String str6 = this.suffix;
            java.lang.String str7 = this.fullName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Name1(prefix=");
            sb.append(str);
            sb.append(", givenName=");
            sb.append(str2);
            sb.append(", surname=");
            sb.append(str3);
            sb.append(", secondSurname=");
            sb.append(str4);
            sb.append(", middleName=");
            sb.append(str5);
            sb.append(", suffix=");
            sb.append(str6);
            sb.append(", fullName=");
            sb.append(str7);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.prefix;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.givenName;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.surname;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.secondSurname;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.middleName;
            int hashCode5 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.suffix;
            int hashCode6 = str6 == null ? 0 : str6.hashCode();
            java.lang.String str7 = this.fullName;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1)) {
                return false;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1 name1 = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.prefix, name1.prefix) && kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, name1.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, name1.surname) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondSurname, name1.secondSurname) && kotlin.jvm.internal.Intrinsics.areEqual(this.middleName, name1.middleName) && kotlin.jvm.internal.Intrinsics.areEqual(this.suffix, name1.suffix) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, name1.fullName);
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1 copy(java.lang.String prefix, java.lang.String givenName, java.lang.String surname, java.lang.String secondSurname, java.lang.String middleName, java.lang.String suffix, java.lang.String fullName) {
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1(prefix, givenName, surname, secondSurname, middleName, suffix, fullName);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getFullName() {
            return this.fullName;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getMiddleName() {
            return this.middleName;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getSecondSurname() {
            return this.secondSurname;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSurname() {
            return this.surname;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1 copy$default(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1 name1, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = name1.prefix;
            }
            if ((i & 2) != 0) {
                str2 = name1.givenName;
            }
            java.lang.String str8 = str2;
            if ((i & 4) != 0) {
                str3 = name1.surname;
            }
            java.lang.String str9 = str3;
            if ((i & 8) != 0) {
                str4 = name1.secondSurname;
            }
            java.lang.String str10 = str4;
            if ((i & 16) != 0) {
                str5 = name1.middleName;
            }
            java.lang.String str11 = str5;
            if ((i & 32) != 0) {
                str6 = name1.suffix;
            }
            java.lang.String str12 = str6;
            if ((i & 64) != 0) {
                str7 = name1.fullName;
            }
            return name1.copy(str, str8, str9, str10, str11, str12, str7);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$BusinessName1;", "", "", "businessName", "Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "orthography", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/Orthography;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/Orthography;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$BusinessName1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBusinessName", "Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "getOrthography"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BusinessName1 {
        public static final int $stable = 0;
        private final java.lang.String businessName;
        private final com.paypal.oslo.api.graphql.schema.type.Orthography orthography;

        public BusinessName1(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.Orthography orthography) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.businessName = str;
            this.orthography = orthography;
        }

        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public final com.paypal.oslo.api.graphql.schema.type.Orthography getOrthography() {
            return this.orthography;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.businessName;
            com.paypal.oslo.api.graphql.schema.type.Orthography orthography = this.orthography;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BusinessName1(businessName=");
            sb.append(str);
            sb.append(", orthography=");
            sb.append(orthography);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.businessName.hashCode();
            com.paypal.oslo.api.graphql.schema.type.Orthography orthography = this.orthography;
            return (hashCode * 31) + (orthography == null ? 0 : orthography.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1)) {
                return false;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1 businessName1 = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.businessName, businessName1.businessName) && this.orthography == businessName1.orthography;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1 copy(java.lang.String businessName, com.paypal.oslo.api.graphql.schema.type.Orthography orthography) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessName, "");
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1(businessName, orthography);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.Orthography getOrthography() {
            return this.orthography;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1 copy$default(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1 businessName1, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.Orthography orthography, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = businessName1.businessName;
            }
            if ((i & 2) != 0) {
                orthography = businessName1.orthography;
            }
            return businessName1.copy(str, orthography);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$DisputeMetrics;", "", "", "total", "priorityTotal", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$DisputeMetrics;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTotal", "getPriorityTotal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DisputeMetrics {
        public static final int $stable = 0;
        private final int priorityTotal;
        private final int total;

        public DisputeMetrics(int i, int i2) {
            this.total = i;
            this.priorityTotal = i2;
        }

        public final int getTotal() {
            return this.total;
        }

        public final int getPriorityTotal() {
            return this.priorityTotal;
        }

        public final java.lang.String toString() {
            int i = this.total;
            int i2 = this.priorityTotal;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DisputeMetrics(total=");
            sb.append(i);
            sb.append(", priorityTotal=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.total) * 31) + java.lang.Integer.hashCode(this.priorityTotal);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.DisputeMetrics)) {
                return false;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.DisputeMetrics disputeMetrics = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.DisputeMetrics) other;
            return this.total == disputeMetrics.total && this.priorityTotal == disputeMetrics.priorityTotal;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.DisputeMetrics copy(int total, int priorityTotal) {
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.DisputeMetrics(total, priorityTotal);
        }

        /* renamed from: component2, reason: from getter */
        public final int getPriorityTotal() {
            return this.priorityTotal;
        }

        /* renamed from: component1, reason: from getter */
        public final int getTotal() {
            return this.total;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.DisputeMetrics copy$default(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.DisputeMetrics disputeMetrics, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = disputeMetrics.total;
            }
            if ((i3 & 2) != 0) {
                i2 = disputeMetrics.priorityTotal;
            }
            return disputeMetrics.copy(i, i2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetMerchantInsights { merchantInsights { transactionMetrics { total pending { totalCount totalAmount { currencyCode value } overdueCount singleActivity { id type } counterParties { name { prefix givenName surname secondSurname middleName suffix fullName } businessName { businessName orthography } profilePictureUrl } hasMultipleCurrencies } payable { totalCount overdueCount hasMultipleCurrencies totalAmount { currencyCode value } singleActivity { id type } counterParties { name { prefix givenName surname secondSurname middleName suffix fullName } businessName { businessName orthography } profilePictureUrl } } } disputeMetrics { total priorityTotal } } }";
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
