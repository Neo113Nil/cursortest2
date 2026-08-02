package com.paypal.oslo.feature.shoppingrewards.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/UserEnrollmentsFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/UserEnrollmentsFragment$UserEnrollment;", "userEnrollments", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/UserEnrollmentsFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getUserEnrollments", "UserEnrollment"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UserEnrollmentsFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment.UserEnrollment> userEnrollments;

    public UserEnrollmentsFragment(java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment.UserEnrollment> list) {
        this.userEnrollments = list;
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment.UserEnrollment> getUserEnrollments() {
        return this.userEnrollments;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/UserEnrollmentsFragment$UserEnrollment;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PromotionOfferEnrollmentStatus;", "status", "expiryTime", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PromotionOfferEnrollmentStatus;Ljava/lang/Object;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PromotionOfferEnrollmentStatus;", "component2", "()Ljava/lang/Object;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PromotionOfferEnrollmentStatus;Ljava/lang/Object;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/UserEnrollmentsFragment$UserEnrollment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/PromotionOfferEnrollmentStatus;", "getStatus", "Ljava/lang/Object;", "getExpiryTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserEnrollment {
        public static final int $stable = 8;
        private final java.lang.Object expiryTime;
        private final com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus status;

        public UserEnrollment(com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus promotionOfferEnrollmentStatus, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promotionOfferEnrollmentStatus, "");
            this.status = promotionOfferEnrollmentStatus;
            this.expiryTime = obj;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus getStatus() {
            return this.status;
        }

        public final java.lang.Object getExpiryTime() {
            return this.expiryTime;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus promotionOfferEnrollmentStatus = this.status;
            java.lang.Object obj = this.expiryTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UserEnrollment(status=");
            sb.append(promotionOfferEnrollmentStatus);
            sb.append(", expiryTime=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.status.hashCode();
            java.lang.Object obj = this.expiryTime;
            return (hashCode * 31) + (obj == null ? 0 : obj.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment.UserEnrollment)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment.UserEnrollment userEnrollment = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment.UserEnrollment) other;
            return this.status == userEnrollment.status && kotlin.jvm.internal.Intrinsics.areEqual(this.expiryTime, userEnrollment.expiryTime);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment.UserEnrollment copy(com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus status, java.lang.Object expiryTime) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment.UserEnrollment(status, expiryTime);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getExpiryTime() {
            return this.expiryTime;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment.UserEnrollment copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment.UserEnrollment userEnrollment, com.paypal.oslo.api.graphql.schema.type.PromotionOfferEnrollmentStatus promotionOfferEnrollmentStatus, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                promotionOfferEnrollmentStatus = userEnrollment.status;
            }
            if ((i & 2) != 0) {
                obj = userEnrollment.expiryTime;
            }
            return userEnrollment.copy(promotionOfferEnrollmentStatus, obj);
        }
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment.UserEnrollment> list = this.userEnrollments;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserEnrollmentsFragment(userEnrollments=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment.UserEnrollment> list = this.userEnrollments;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment) && kotlin.jvm.internal.Intrinsics.areEqual(this.userEnrollments, ((com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment) other).userEnrollments);
    }

    public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment copy(java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment.UserEnrollment> userEnrollments) {
        return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment(userEnrollments);
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment.UserEnrollment> component1() {
        return this.userEnrollments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.UserEnrollmentsFragment userEnrollmentsFragment, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = userEnrollmentsFragment.userEnrollments;
        }
        return userEnrollmentsFragment.copy(list);
    }
}
