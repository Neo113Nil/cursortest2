package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJF\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionPromotionInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionOfferType;", "offerType", "financingCode", "selectedCreditOfferId", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionPromotionInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getOfferType", "getFinancingCode", "getSelectedCreditOfferId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RevolvingCreditAcquisitionPromotionInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Object> financingCode;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionOfferType> offerType;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> selectedCreditOfferId;

    /* JADX WARN: Multi-variable type inference failed */
    public RevolvingCreditAcquisitionPromotionInput(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionOfferType> optional, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional2, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.offerType = optional;
        this.financingCode = optional2;
        this.selectedCreditOfferId = optional3;
    }

    public /* synthetic */ RevolvingCreditAcquisitionPromotionInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionOfferType> getOfferType() {
        return this.offerType;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getFinancingCode() {
        return this.financingCode;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getSelectedCreditOfferId() {
        return this.selectedCreditOfferId;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionOfferType> optional = this.offerType;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional2 = this.financingCode;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional3 = this.selectedCreditOfferId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditAcquisitionPromotionInput(offerType=");
        sb.append(optional);
        sb.append(", financingCode=");
        sb.append(optional2);
        sb.append(", selectedCreditOfferId=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.offerType.hashCode() * 31) + this.financingCode.hashCode()) * 31) + this.selectedCreditOfferId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionPromotionInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionPromotionInput revolvingCreditAcquisitionPromotionInput = (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionPromotionInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.offerType, revolvingCreditAcquisitionPromotionInput.offerType) && kotlin.jvm.internal.Intrinsics.areEqual(this.financingCode, revolvingCreditAcquisitionPromotionInput.financingCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCreditOfferId, revolvingCreditAcquisitionPromotionInput.selectedCreditOfferId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionPromotionInput copy(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionOfferType> offerType, com.apollographql.apollo.api.Optional<? extends java.lang.Object> financingCode, com.apollographql.apollo.api.Optional<? extends java.lang.Object> selectedCreditOfferId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financingCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedCreditOfferId, "");
        return new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionPromotionInput(offerType, financingCode, selectedCreditOfferId);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component3() {
        return this.selectedCreditOfferId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component2() {
        return this.financingCode;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionOfferType> component1() {
        return this.offerType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionPromotionInput copy$default(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionPromotionInput revolvingCreditAcquisitionPromotionInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = revolvingCreditAcquisitionPromotionInput.offerType;
        }
        if ((i & 2) != 0) {
            optional2 = revolvingCreditAcquisitionPromotionInput.financingCode;
        }
        if ((i & 4) != 0) {
            optional3 = revolvingCreditAcquisitionPromotionInput.selectedCreditOfferId;
        }
        return revolvingCreditAcquisitionPromotionInput.copy(optional, optional2, optional3);
    }

    public RevolvingCreditAcquisitionPromotionInput() {
        this(null, null, null, 7, null);
    }
}
