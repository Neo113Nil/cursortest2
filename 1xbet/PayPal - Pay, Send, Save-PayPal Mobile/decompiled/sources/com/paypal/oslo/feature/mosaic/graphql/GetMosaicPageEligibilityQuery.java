package com.paypal.oslo.feature.mosaic.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003*+)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/graphql/GetMosaicPageEligibilityQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/paypal/oslo/feature/mosaic/graphql/GetMosaicPageEligibilityQuery$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageEligibilityInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageEligibilityInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageEligibilityInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageEligibilityInput;)Lcom/paypal/oslo/feature/mosaic/graphql/GetMosaicPageEligibilityQuery;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageEligibilityInput;", "getInput", "Companion", "Data", "MosaicPageEligibility"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GetMosaicPageEligibilityQuery implements com.apollographql.apollo.api.Query<com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.Data> {
    public static final java.lang.String OPERATION_ID = "0724957693dfed4d6ec4f444e2074385fdaddb277ba6540121f48c69f3280847";
    public static final java.lang.String OPERATION_NAME = "GetMosaicPageEligibility";
    private final com.paypal.oslo.api.graphql.schema.type.MosaicPageEligibilityInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.Companion INSTANCE = new com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.Companion(null);
    public static final int $stable = 8;

    public GetMosaicPageEligibilityQuery(com.paypal.oslo.api.graphql.schema.type.MosaicPageEligibilityInput mosaicPageEligibilityInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicPageEligibilityInput, "");
        this.input = mosaicPageEligibilityInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MosaicPageEligibilityInput getInput() {
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
        com.paypal.oslo.feature.mosaic.graphql.adapter.GetMosaicPageEligibilityQuery_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.mosaic.graphql.adapter.GetMosaicPageEligibilityQuery_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Query.INSTANCE.getType()).selections(com.paypal.oslo.feature.mosaic.graphql.selections.GetMosaicPageEligibilityQuerySelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/graphql/GetMosaicPageEligibilityQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "Lcom/paypal/oslo/feature/mosaic/graphql/GetMosaicPageEligibilityQuery$MosaicPageEligibility;", "mosaicPageEligibility", "<init>", "(Lcom/paypal/oslo/feature/mosaic/graphql/GetMosaicPageEligibilityQuery$MosaicPageEligibility;)V", "component1", "()Lcom/paypal/oslo/feature/mosaic/graphql/GetMosaicPageEligibilityQuery$MosaicPageEligibility;", "copy", "(Lcom/paypal/oslo/feature/mosaic/graphql/GetMosaicPageEligibilityQuery$MosaicPageEligibility;)Lcom/paypal/oslo/feature/mosaic/graphql/GetMosaicPageEligibilityQuery$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/mosaic/graphql/GetMosaicPageEligibilityQuery$MosaicPageEligibility;", "getMosaicPageEligibility"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Query.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility mosaicPageEligibility;

        public Data(com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility mosaicPageEligibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicPageEligibility, "");
            this.mosaicPageEligibility = mosaicPageEligibility;
        }

        public final com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility getMosaicPageEligibility() {
            return this.mosaicPageEligibility;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility mosaicPageEligibility = this.mosaicPageEligibility;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(mosaicPageEligibility=");
            sb.append(mosaicPageEligibility);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.mosaicPageEligibility.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.mosaicPageEligibility, ((com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.Data) other).mosaicPageEligibility);
        }

        public final com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.Data copy(com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility mosaicPageEligibility) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicPageEligibility, "");
            return new com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.Data(mosaicPageEligibility);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility getMosaicPageEligibility() {
            return this.mosaicPageEligibility;
        }

        public static /* synthetic */ com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.Data copy$default(com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.Data data, com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility mosaicPageEligibility, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                mosaicPageEligibility = data.mosaicPageEligibility;
            }
            return data.copy(mosaicPageEligibility);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u0003\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u0004\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/graphql/GetMosaicPageEligibilityQuery$MosaicPageEligibility;", "", "", "isSupportedOnMosaic", "isWebSupported", "isNativeSupported", "qualifiedIntentId", "<init>", "(ZZZLjava/lang/Object;)V", "component1", "()Z", "component2", "component3", "component4", "()Ljava/lang/Object;", "copy", "(ZZZLjava/lang/Object;)Lcom/paypal/oslo/feature/mosaic/graphql/GetMosaicPageEligibilityQuery$MosaicPageEligibility;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Ljava/lang/Object;", "getQualifiedIntentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MosaicPageEligibility {
        public static final int $stable = 8;
        private final boolean isNativeSupported;
        private final boolean isSupportedOnMosaic;
        private final boolean isWebSupported;
        private final java.lang.Object qualifiedIntentId;

        public MosaicPageEligibility(boolean z, boolean z2, boolean z3, java.lang.Object obj) {
            this.isSupportedOnMosaic = z;
            this.isWebSupported = z2;
            this.isNativeSupported = z3;
            this.qualifiedIntentId = obj;
        }

        public final boolean isSupportedOnMosaic() {
            return this.isSupportedOnMosaic;
        }

        public final boolean isWebSupported() {
            return this.isWebSupported;
        }

        public final boolean isNativeSupported() {
            return this.isNativeSupported;
        }

        public final java.lang.Object getQualifiedIntentId() {
            return this.qualifiedIntentId;
        }

        public final java.lang.String toString() {
            boolean z = this.isSupportedOnMosaic;
            boolean z2 = this.isWebSupported;
            boolean z3 = this.isNativeSupported;
            java.lang.Object obj = this.qualifiedIntentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MosaicPageEligibility(isSupportedOnMosaic=");
            sb.append(z);
            sb.append(", isWebSupported=");
            sb.append(z2);
            sb.append(", isNativeSupported=");
            sb.append(z3);
            sb.append(", qualifiedIntentId=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.isSupportedOnMosaic);
            int hashCode2 = java.lang.Boolean.hashCode(this.isWebSupported);
            int hashCode3 = java.lang.Boolean.hashCode(this.isNativeSupported);
            java.lang.Object obj = this.qualifiedIntentId;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (obj == null ? 0 : obj.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility)) {
                return false;
            }
            com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility mosaicPageEligibility = (com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility) other;
            return this.isSupportedOnMosaic == mosaicPageEligibility.isSupportedOnMosaic && this.isWebSupported == mosaicPageEligibility.isWebSupported && this.isNativeSupported == mosaicPageEligibility.isNativeSupported && kotlin.jvm.internal.Intrinsics.areEqual(this.qualifiedIntentId, mosaicPageEligibility.qualifiedIntentId);
        }

        public final com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility copy(boolean isSupportedOnMosaic, boolean isWebSupported, boolean isNativeSupported, java.lang.Object qualifiedIntentId) {
            return new com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility(isSupportedOnMosaic, isWebSupported, isNativeSupported, qualifiedIntentId);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Object getQualifiedIntentId() {
            return this.qualifiedIntentId;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsNativeSupported() {
            return this.isNativeSupported;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsWebSupported() {
            return this.isWebSupported;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSupportedOnMosaic() {
            return this.isSupportedOnMosaic;
        }

        public static /* synthetic */ com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility copy$default(com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery.MosaicPageEligibility mosaicPageEligibility, boolean z, boolean z2, boolean z3, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                z = mosaicPageEligibility.isSupportedOnMosaic;
            }
            if ((i & 2) != 0) {
                z2 = mosaicPageEligibility.isWebSupported;
            }
            if ((i & 4) != 0) {
                z3 = mosaicPageEligibility.isNativeSupported;
            }
            if ((i & 8) != 0) {
                obj = mosaicPageEligibility.qualifiedIntentId;
            }
            return mosaicPageEligibility.copy(z, z2, z3, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/graphql/GetMosaicPageEligibilityQuery$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "query GetMosaicPageEligibility($input: MosaicPageEligibilityInput!) { mosaicPageEligibility(input: $input) { isSupportedOnMosaic isWebSupported isNativeSupported qualifiedIntentId } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.MosaicPageEligibilityInput mosaicPageEligibilityInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetMosaicPageEligibilityQuery(input=");
        sb.append(mosaicPageEligibilityInput);
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
        return (other instanceof com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery) other).input);
    }

    public final com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery copy(com.paypal.oslo.api.graphql.schema.type.MosaicPageEligibilityInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.MosaicPageEligibilityInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery copy$default(com.paypal.oslo.feature.mosaic.graphql.GetMosaicPageEligibilityQuery getMosaicPageEligibilityQuery, com.paypal.oslo.api.graphql.schema.type.MosaicPageEligibilityInput mosaicPageEligibilityInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            mosaicPageEligibilityInput = getMosaicPageEligibilityQuery.input;
        }
        return getMosaicPageEligibilityQuery.copy(mosaicPageEligibilityInput);
    }
}
