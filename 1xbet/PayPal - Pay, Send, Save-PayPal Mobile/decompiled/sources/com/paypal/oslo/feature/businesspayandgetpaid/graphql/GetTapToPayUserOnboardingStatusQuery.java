package com.paypal.oslo.feature.businesspayandgetpaid.graphql;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003!\" B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetTapToPayUserOnboardingStatusQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetTapToPayUserOnboardingStatusQuery$Data;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "Companion", "Data", "MerchantTapToPayOnboarding"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetTapToPayUserOnboardingStatusQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.Data> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.Companion(null);
    public static final java.lang.String OPERATION_ID = "2e66462ff17d9fd5abebb09a4bf3b64e8184edbdcb27bd208a8f46312f0d7774";
    public static final java.lang.String OPERATION_NAME = "GetTapToPayUserOnboardingStatus";

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
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.adapter.GetTapToPayUserOnboardingStatusQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.businesspayandgetpaid.graphql.selections.GetTapToPayUserOnboardingStatusQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetTapToPayUserOnboardingStatusQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetTapToPayUserOnboardingStatusQuery$MerchantTapToPayOnboarding;", "merchantTapToPayOnboarding", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetTapToPayUserOnboardingStatusQuery$MerchantTapToPayOnboarding;)V", "component1", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetTapToPayUserOnboardingStatusQuery$MerchantTapToPayOnboarding;", "copy", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetTapToPayUserOnboardingStatusQuery$MerchantTapToPayOnboarding;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetTapToPayUserOnboardingStatusQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetTapToPayUserOnboardingStatusQuery$MerchantTapToPayOnboarding;", "getMerchantTapToPayOnboarding"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.MerchantTapToPayOnboarding merchantTapToPayOnboarding;

        public Data(com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.MerchantTapToPayOnboarding merchantTapToPayOnboarding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantTapToPayOnboarding, "");
            this.merchantTapToPayOnboarding = merchantTapToPayOnboarding;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.MerchantTapToPayOnboarding getMerchantTapToPayOnboarding() {
            return this.merchantTapToPayOnboarding;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.MerchantTapToPayOnboarding merchantTapToPayOnboarding = this.merchantTapToPayOnboarding;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(merchantTapToPayOnboarding=");
            sb.append(merchantTapToPayOnboarding);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.merchantTapToPayOnboarding.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantTapToPayOnboarding, ((com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.Data) other).merchantTapToPayOnboarding);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.Data copy(com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.MerchantTapToPayOnboarding merchantTapToPayOnboarding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantTapToPayOnboarding, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.Data(merchantTapToPayOnboarding);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.MerchantTapToPayOnboarding getMerchantTapToPayOnboarding() {
            return this.merchantTapToPayOnboarding;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.Data copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.Data data, com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.MerchantTapToPayOnboarding merchantTapToPayOnboarding, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                merchantTapToPayOnboarding = data.merchantTapToPayOnboarding;
            }
            return data.copy(merchantTapToPayOnboarding);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetTapToPayUserOnboardingStatusQuery$MerchantTapToPayOnboarding;", "", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantTapToPayOnboardingStatus;", "status", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/MerchantTapToPayOnboardingStatus;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/MerchantTapToPayOnboardingStatus;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/MerchantTapToPayOnboardingStatus;)Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetTapToPayUserOnboardingStatusQuery$MerchantTapToPayOnboarding;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantTapToPayOnboardingStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MerchantTapToPayOnboarding {
        public static final int $stable = 0;
        private final com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus status;

        public MerchantTapToPayOnboarding(com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus merchantTapToPayOnboardingStatus) {
            this.status = merchantTapToPayOnboardingStatus;
        }

        public final com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus merchantTapToPayOnboardingStatus = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MerchantTapToPayOnboarding(status=");
            sb.append(merchantTapToPayOnboardingStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus merchantTapToPayOnboardingStatus = this.status;
            if (merchantTapToPayOnboardingStatus == null) {
                return 0;
            }
            return merchantTapToPayOnboardingStatus.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.MerchantTapToPayOnboarding) && this.status == ((com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.MerchantTapToPayOnboarding) other).status;
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.MerchantTapToPayOnboarding copy(com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus status) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.MerchantTapToPayOnboarding(status);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.MerchantTapToPayOnboarding copy$default(com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetTapToPayUserOnboardingStatusQuery.MerchantTapToPayOnboarding merchantTapToPayOnboarding, com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus merchantTapToPayOnboardingStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                merchantTapToPayOnboardingStatus = merchantTapToPayOnboarding.status;
            }
            return merchantTapToPayOnboarding.copy(merchantTapToPayOnboardingStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/graphql/GetTapToPayUserOnboardingStatusQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetTapToPayUserOnboardingStatus { merchantTapToPayOnboarding { status } }";
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
