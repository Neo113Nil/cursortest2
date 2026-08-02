package com.paypal.oslo.feature.businesshome.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005!\"#$ B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantEligibilityQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantEligibilityQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "MerchantEligibility", "Recommendation", "Setup"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetMerchantEligibilityQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Companion INSTANCE = new com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "5896923cd382d4f4b670bf41e5cd0934d3b5a0c8be4b8e17bbfeb0d4aae5853c";
    public static final java.lang.String OPERATION_NAME = "GetMerchantEligibility";

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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesshome.graphql.adapter.GetMerchantEligibilityQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.businesshome.graphql.selections.GetMerchantEligibilityQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantEligibilityQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantEligibilityQuery$MerchantEligibility;", "merchantEligibility", "<init>", "(Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantEligibilityQuery$MerchantEligibility;)V", "component1", "()Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantEligibilityQuery$MerchantEligibility;", "copy", "(Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantEligibilityQuery$MerchantEligibility;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantEligibilityQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantEligibilityQuery$MerchantEligibility;", "getMerchantEligibility"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.MerchantEligibility merchantEligibility;

        public Data(com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.MerchantEligibility merchantEligibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantEligibility, "");
            this.merchantEligibility = merchantEligibility;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.MerchantEligibility getMerchantEligibility() {
            return this.merchantEligibility;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.MerchantEligibility merchantEligibility = this.merchantEligibility;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(merchantEligibility=");
            sb.append(merchantEligibility);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.merchantEligibility.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantEligibility, ((com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Data) other).merchantEligibility);
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Data copy(com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.MerchantEligibility merchantEligibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantEligibility, "");
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Data(merchantEligibility);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.MerchantEligibility getMerchantEligibility() {
            return this.merchantEligibility;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Data copy$default(com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Data data, com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.MerchantEligibility merchantEligibility, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                merchantEligibility = data.merchantEligibility;
            }
            return data.copy(merchantEligibility);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ4\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantEligibilityQuery$MerchantEligibility;", "", "", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantEligibilityQuery$Recommendation;", "recommendations", "Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantEligibilityQuery$Setup;", "setup", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantEligibilityQuery$MerchantEligibility;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getRecommendations", "getSetup"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MerchantEligibility {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Recommendation> recommendations;
        private final java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Setup> setup;

        public MerchantEligibility(java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Recommendation> list, java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Setup> list2) {
            this.recommendations = list;
            this.setup = list2;
        }

        public final java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Recommendation> getRecommendations() {
            return this.recommendations;
        }

        public final java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Setup> getSetup() {
            return this.setup;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Recommendation> list = this.recommendations;
            java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Setup> list2 = this.setup;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MerchantEligibility(recommendations=");
            sb.append(list);
            sb.append(", setup=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Recommendation> list = this.recommendations;
            int hashCode = list == null ? 0 : list.hashCode();
            java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Setup> list2 = this.setup;
            return (hashCode * 31) + (list2 != null ? list2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.MerchantEligibility)) {
                return false;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.MerchantEligibility merchantEligibility = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.MerchantEligibility) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.recommendations, merchantEligibility.recommendations) && kotlin.jvm.internal.Intrinsics.areEqual(this.setup, merchantEligibility.setup);
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.MerchantEligibility copy(java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Recommendation> recommendations, java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Setup> setup) {
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.MerchantEligibility(recommendations, setup);
        }

        public final java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Setup> component2() {
            return this.setup;
        }

        public final java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Recommendation> component1() {
            return this.recommendations;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.MerchantEligibility copy$default(com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.MerchantEligibility merchantEligibility, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = merchantEligibility.recommendations;
            }
            if ((i & 2) != 0) {
                list2 = merchantEligibility.setup;
            }
            return merchantEligibility.copy(list, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantEligibilityQuery$Recommendation;", "", "", com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.FlowOutcome.COMPLETED, "Lcom/paypal/oslo/api/graphql/schema/type/MerchantRecommendedStep;", "step", "<init>", "(ZLcom/paypal/oslo/api/graphql/schema/type/MerchantRecommendedStep;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/MerchantRecommendedStep;", "copy", "(ZLcom/paypal/oslo/api/graphql/schema/type/MerchantRecommendedStep;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantEligibilityQuery$Recommendation;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getCompleted", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantRecommendedStep;", "getStep"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Recommendation {
        public static final int $stable = 0;
        private final boolean completed;
        private final com.paypal.oslo.api.graphql.schema.type.MerchantRecommendedStep step;

        public Recommendation(boolean z, com.paypal.oslo.api.graphql.schema.type.MerchantRecommendedStep merchantRecommendedStep) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantRecommendedStep, "");
            this.completed = z;
            this.step = merchantRecommendedStep;
        }

        public final boolean getCompleted() {
            return this.completed;
        }

        public final com.paypal.oslo.api.graphql.schema.type.MerchantRecommendedStep getStep() {
            return this.step;
        }

        public final java.lang.String toString() {
            boolean z = this.completed;
            com.paypal.oslo.api.graphql.schema.type.MerchantRecommendedStep merchantRecommendedStep = this.step;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Recommendation(completed=");
            sb.append(z);
            sb.append(", step=");
            sb.append(merchantRecommendedStep);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.completed) * 31) + this.step.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Recommendation)) {
                return false;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Recommendation recommendation = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Recommendation) other;
            return this.completed == recommendation.completed && this.step == recommendation.step;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Recommendation copy(boolean completed, com.paypal.oslo.api.graphql.schema.type.MerchantRecommendedStep step) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Recommendation(completed, step);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.MerchantRecommendedStep getStep() {
            return this.step;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getCompleted() {
            return this.completed;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Recommendation copy$default(com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Recommendation recommendation, boolean z, com.paypal.oslo.api.graphql.schema.type.MerchantRecommendedStep merchantRecommendedStep, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = recommendation.completed;
            }
            if ((i & 2) != 0) {
                merchantRecommendedStep = recommendation.step;
            }
            return recommendation.copy(z, merchantRecommendedStep);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantEligibilityQuery$Setup;", "", "", com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.FlowOutcome.COMPLETED, "Lcom/paypal/oslo/api/graphql/schema/type/MerchantVerificationStep;", "verificationStep", "<init>", "(ZLcom/paypal/oslo/api/graphql/schema/type/MerchantVerificationStep;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/MerchantVerificationStep;", "copy", "(ZLcom/paypal/oslo/api/graphql/schema/type/MerchantVerificationStep;)Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantEligibilityQuery$Setup;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getCompleted", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantVerificationStep;", "getVerificationStep"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Setup {
        public static final int $stable = 0;
        private final boolean completed;
        private final com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep verificationStep;

        public Setup(boolean z, com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep merchantVerificationStep) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantVerificationStep, "");
            this.completed = z;
            this.verificationStep = merchantVerificationStep;
        }

        public final boolean getCompleted() {
            return this.completed;
        }

        public final com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep getVerificationStep() {
            return this.verificationStep;
        }

        public final java.lang.String toString() {
            boolean z = this.completed;
            com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep merchantVerificationStep = this.verificationStep;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Setup(completed=");
            sb.append(z);
            sb.append(", verificationStep=");
            sb.append(merchantVerificationStep);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Boolean.hashCode(this.completed) * 31) + this.verificationStep.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Setup)) {
                return false;
            }
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Setup setup = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Setup) other;
            return this.completed == setup.completed && this.verificationStep == setup.verificationStep;
        }

        public final com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Setup copy(boolean completed, com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep verificationStep) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationStep, "");
            return new com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Setup(completed, verificationStep);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep getVerificationStep() {
            return this.verificationStep;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getCompleted() {
            return this.completed;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Setup copy$default(com.paypal.oslo.feature.businesshome.graphql.GetMerchantEligibilityQuery.Setup setup, boolean z, com.paypal.oslo.api.graphql.schema.type.MerchantVerificationStep merchantVerificationStep, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = setup.completed;
            }
            if ((i & 2) != 0) {
                merchantVerificationStep = setup.verificationStep;
            }
            return setup.copy(z, merchantVerificationStep);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantEligibilityQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetMerchantEligibility { merchantEligibility { recommendations { completed step } setup { completed verificationStep } } }";
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
