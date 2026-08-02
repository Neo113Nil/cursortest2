package com.paypal.oslo.feature.shoppingrewards.graphql;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,)B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/EnrollInPromotionOfferInput;", "input", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/EnrollInPromotionOfferInput;)V", "", "id", "()Ljava/lang/String;", "document", "name", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "", "withDefaultValues", "", "serializeVariables", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Z)V", "Lcom/apollographql/apollo/api/Adapter;", "adapter", "()Lcom/apollographql/apollo/api/Adapter;", "Lcom/apollographql/apollo/api/CompiledField;", "rootField", "()Lcom/apollographql/apollo/api/CompiledField;", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/EnrollInPromotionOfferInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/EnrollInPromotionOfferInput;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/EnrollInPromotionOfferInput;", "getInput", "Companion", "Data", com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInPromotionOfferMutation.OPERATION_NAME, "Offer"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class EnrollInCategoryMutation implements com.apollographql.apollo.api.Mutation<com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Data> {
    public static final java.lang.String OPERATION_ID = "bccfd62c6499dca30b5c60fc34c04504f500a46e24dbd1da5710f4444e1a30c7";
    public static final java.lang.String OPERATION_NAME = "EnrollInCategory";
    private final com.paypal.oslo.api.graphql.schema.type.EnrollInPromotionOfferInput input;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Companion INSTANCE = new com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Companion(null);
    public static final int $stable = 8;

    public EnrollInCategoryMutation(com.paypal.oslo.api.graphql.schema.type.EnrollInPromotionOfferInput enrollInPromotionOfferInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollInPromotionOfferInput, "");
        this.input = enrollInPromotionOfferInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.EnrollInPromotionOfferInput getInput() {
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
        com.paypal.oslo.feature.shoppingrewards.graphql.adapter.EnrollInCategoryMutation_VariablesAdapter.INSTANCE.serializeVariables(writer, this, customScalarAdapters, withDefaultValues);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Data> adapter() {
        return com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.shoppingrewards.graphql.adapter.EnrollInCategoryMutation_ResponseAdapter.Data.INSTANCE, false, 1, null);
    }

    @Override // com.apollographql.apollo.api.Executable
    public final com.apollographql.apollo.api.CompiledField rootField() {
        return new com.apollographql.apollo.api.CompiledField.Builder(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.paypal.oslo.api.graphql.schema.type.Mutation.INSTANCE.getType()).selections(com.paypal.oslo.feature.shoppingrewards.graphql.selections.EnrollInCategoryMutationSelections.INSTANCE.get__root()).build();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation$EnrollInPromotionOffer;", "enrollInPromotionOffer", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation$EnrollInPromotionOffer;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation$EnrollInPromotionOffer;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation$EnrollInPromotionOffer;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation$Data;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation$EnrollInPromotionOffer;", "getEnrollInPromotionOffer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Data implements com.apollographql.apollo.api.Mutation.Data {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.EnrollInPromotionOffer enrollInPromotionOffer;

        public Data(com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.EnrollInPromotionOffer enrollInPromotionOffer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollInPromotionOffer, "");
            this.enrollInPromotionOffer = enrollInPromotionOffer;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.EnrollInPromotionOffer getEnrollInPromotionOffer() {
            return this.enrollInPromotionOffer;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.EnrollInPromotionOffer enrollInPromotionOffer = this.enrollInPromotionOffer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(enrollInPromotionOffer=");
            sb.append(enrollInPromotionOffer);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.enrollInPromotionOffer.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Data) && kotlin.jvm.internal.Intrinsics.areEqual(this.enrollInPromotionOffer, ((com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Data) other).enrollInPromotionOffer);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Data copy(com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.EnrollInPromotionOffer enrollInPromotionOffer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollInPromotionOffer, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Data(enrollInPromotionOffer);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.EnrollInPromotionOffer getEnrollInPromotionOffer() {
            return this.enrollInPromotionOffer;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Data copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Data data, com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.EnrollInPromotionOffer enrollInPromotionOffer, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                enrollInPromotionOffer = data.enrollInPromotionOffer;
            }
            return data.copy(enrollInPromotionOffer);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J<\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation$EnrollInPromotionOffer;", "", "", "id", "expiryTime", "Lcom/paypal/oslo/api/graphql/schema/type/PromotionOfferEnrollmentStatus;", "status", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation$Offer;", "offer", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PromotionOfferEnrollmentStatus;Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation$Offer;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/PromotionOfferEnrollmentStatus;", "component4", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation$Offer;", "copy", "(Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PromotionOfferEnrollmentStatus;Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation$Offer;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation$EnrollInPromotionOffer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Ljava/lang/Object;", "getExpiryTime", "Lcom/paypal/oslo/api/graphql/schema/type/PromotionOfferEnrollmentStatus;", "getStatus", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation$Offer;", "getOffer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EnrollInPromotionOffer {
        public static final int $stable = 8;
        private final java.lang.Object expiryTime;
        private final java.lang.String id;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Offer offer;
        private final com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus status;

        public EnrollInPromotionOffer(java.lang.String str, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus promotionOfferEnrollmentStatus, com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Offer offer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promotionOfferEnrollmentStatus, "");
            this.id = str;
            this.expiryTime = obj;
            this.status = promotionOfferEnrollmentStatus;
            this.offer = offer;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.Object getExpiryTime() {
            return this.expiryTime;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus getStatus() {
            return this.status;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Offer getOffer() {
            return this.offer;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.Object obj = this.expiryTime;
            com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus promotionOfferEnrollmentStatus = this.status;
            com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Offer offer = this.offer;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EnrollInPromotionOffer(id=");
            sb.append(str);
            sb.append(", expiryTime=");
            sb.append(obj);
            sb.append(", status=");
            sb.append(promotionOfferEnrollmentStatus);
            sb.append(", offer=");
            sb.append(offer);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode();
            java.lang.Object obj = this.expiryTime;
            int hashCode2 = obj == null ? 0 : obj.hashCode();
            int hashCode3 = this.status.hashCode();
            com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Offer offer = this.offer;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (offer != null ? offer.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.EnrollInPromotionOffer)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.EnrollInPromotionOffer enrollInPromotionOffer = (com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.EnrollInPromotionOffer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, enrollInPromotionOffer.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiryTime, enrollInPromotionOffer.expiryTime) && this.status == enrollInPromotionOffer.status && kotlin.jvm.internal.Intrinsics.areEqual(this.offer, enrollInPromotionOffer.offer);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.EnrollInPromotionOffer copy(java.lang.String id, java.lang.Object expiryTime, com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus status, com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Offer offer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.EnrollInPromotionOffer(id, expiryTime, status, offer);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Offer getOffer() {
            return this.offer;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus getStatus() {
            return this.status;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getExpiryTime() {
            return this.expiryTime;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.EnrollInPromotionOffer copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.EnrollInPromotionOffer enrollInPromotionOffer, java.lang.String str, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus promotionOfferEnrollmentStatus, com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Offer offer, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = enrollInPromotionOffer.id;
            }
            if ((i & 2) != 0) {
                obj = enrollInPromotionOffer.expiryTime;
            }
            if ((i & 4) != 0) {
                promotionOfferEnrollmentStatus = enrollInPromotionOffer.status;
            }
            if ((i & 8) != 0) {
                offer = enrollInPromotionOffer.offer;
            }
            return enrollInPromotionOffer.copy(str, obj, promotionOfferEnrollmentStatus, offer);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation$Offer;", "", "", "__typename", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/PromotionOfferFragment;", "promotionOfferFragment", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment;", "categoryDetailsPresentmentFragment", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/PromotionOfferFragment;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/PromotionOfferFragment;", "component3", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/PromotionOfferFragment;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation$Offer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/PromotionOfferFragment;", "getPromotionOfferFragment", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/CategoryDetailsPresentmentFragment;", "getCategoryDetailsPresentmentFragment"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Offer {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment categoryDetailsPresentmentFragment;
        private final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment promotionOfferFragment;

        public Offer(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment promotionOfferFragment, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment categoryDetailsPresentmentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promotionOfferFragment, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categoryDetailsPresentmentFragment, "");
            this.__typename = str;
            this.promotionOfferFragment = promotionOfferFragment;
            this.categoryDetailsPresentmentFragment = categoryDetailsPresentmentFragment;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment getPromotionOfferFragment() {
            return this.promotionOfferFragment;
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment getCategoryDetailsPresentmentFragment() {
            return this.categoryDetailsPresentmentFragment;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment promotionOfferFragment = this.promotionOfferFragment;
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment categoryDetailsPresentmentFragment = this.categoryDetailsPresentmentFragment;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Offer(__typename=");
            sb.append(str);
            sb.append(", promotionOfferFragment=");
            sb.append(promotionOfferFragment);
            sb.append(", categoryDetailsPresentmentFragment=");
            sb.append(categoryDetailsPresentmentFragment);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.__typename.hashCode() * 31) + this.promotionOfferFragment.hashCode()) * 31) + this.categoryDetailsPresentmentFragment.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Offer)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Offer offer = (com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Offer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, offer.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.promotionOfferFragment, offer.promotionOfferFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.categoryDetailsPresentmentFragment, offer.categoryDetailsPresentmentFragment);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Offer copy(java.lang.String __typename, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment promotionOfferFragment, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment categoryDetailsPresentmentFragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promotionOfferFragment, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categoryDetailsPresentmentFragment, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Offer(__typename, promotionOfferFragment, categoryDetailsPresentmentFragment);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment getCategoryDetailsPresentmentFragment() {
            return this.categoryDetailsPresentmentFragment;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment getPromotionOfferFragment() {
            return this.promotionOfferFragment;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Offer copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation.Offer offer, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment promotionOfferFragment, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.CategoryDetailsPresentmentFragment categoryDetailsPresentmentFragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = offer.__typename;
            }
            if ((i & 2) != 0) {
                promotionOfferFragment = offer.promotionOfferFragment;
            }
            if ((i & 4) != 0) {
                categoryDetailsPresentmentFragment = offer.categoryDetailsPresentmentFragment;
            }
            return offer.copy(str, promotionOfferFragment, categoryDetailsPresentmentFragment);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/EnrollInCategoryMutation$Companion;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "getOPERATION_DOCUMENT", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getOPERATION_DOCUMENT() {
            return "mutation EnrollInCategory($input: EnrollInPromotionOfferInput!) { enrollInPromotionOffer(input: $input) { id expiryTime status offer { __typename ...PromotionOfferFragment ...CategoryDetailsPresentmentFragment } } }  fragment PromotionOfferFragment on PromotionOffer { id externalId schedule { endTime } }  fragment CategoryDetailsPresentmentFragment on PromotionOffer { presentmentAssets { __typename ... on RewardsCategoryOffer { offerDetailsHeroImageUrl offerDetailsOfferTitleText offerDetailsExpirationText offerDetailsPpuiTokens offerDetailsTexts offerDetailsSubtexts offerDetailsTermsText offerDetailsTermsUrl offerDetailsCtaText } } }";
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.EnrollInPromotionOfferInput enrollInPromotionOfferInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EnrollInCategoryMutation(input=");
        sb.append(enrollInPromotionOfferInput);
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
        return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation) other).input);
    }

    public final com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation copy(com.paypal.oslo.api.graphql.schema.type.EnrollInPromotionOfferInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.EnrollInPromotionOfferInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.EnrollInCategoryMutation enrollInCategoryMutation, com.paypal.oslo.api.graphql.schema.type.EnrollInPromotionOfferInput enrollInPromotionOfferInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            enrollInPromotionOfferInput = enrollInCategoryMutation.input;
        }
        return enrollInCategoryMutation.copy(enrollInPromotionOfferInput);
    }
}
