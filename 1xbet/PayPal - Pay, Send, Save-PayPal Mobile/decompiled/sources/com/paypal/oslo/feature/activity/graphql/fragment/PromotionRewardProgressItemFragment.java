package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardProgressItemFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardProgressItemFragment$Progress;", "progress", "", "enrollmentExpiryDateTime", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardProgressItemFragment$Progress;Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardProgressItemFragment$Progress;", "component2", "()Ljava/lang/Object;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardProgressItemFragment$Progress;Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardProgressItemFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardProgressItemFragment$Progress;", "getProgress", "Ljava/lang/Object;", "getEnrollmentExpiryDateTime", "Ljava/lang/String;", "getDescription", "Progress"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PromotionRewardProgressItemFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String description;
    private final java.lang.Object enrollmentExpiryDateTime;
    private final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment.Progress progress;

    public PromotionRewardProgressItemFragment(com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment.Progress progress, java.lang.Object obj, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.progress = progress;
        this.enrollmentExpiryDateTime = obj;
        this.description = str;
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment.Progress getProgress() {
        return this.progress;
    }

    public final java.lang.Object getEnrollmentExpiryDateTime() {
        return this.enrollmentExpiryDateTime;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardProgressItemFragment$Progress;", "", "", "transactionCountCompleted", "transactionCountRemaining", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/activity/graphql/fragment/PromotionRewardProgressItemFragment$Progress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getTransactionCountCompleted", "getTransactionCountRemaining"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Progress {
        public static final int $stable = 0;
        private final java.lang.Integer transactionCountCompleted;
        private final java.lang.Integer transactionCountRemaining;

        public Progress(java.lang.Integer num, java.lang.Integer num2) {
            this.transactionCountCompleted = num;
            this.transactionCountRemaining = num2;
        }

        public final java.lang.Integer getTransactionCountCompleted() {
            return this.transactionCountCompleted;
        }

        public final java.lang.Integer getTransactionCountRemaining() {
            return this.transactionCountRemaining;
        }

        public final java.lang.String toString() {
            java.lang.Integer num = this.transactionCountCompleted;
            java.lang.Integer num2 = this.transactionCountRemaining;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Progress(transactionCountCompleted=");
            sb.append(num);
            sb.append(", transactionCountRemaining=");
            sb.append(num2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Integer num = this.transactionCountCompleted;
            int hashCode = num == null ? 0 : num.hashCode();
            java.lang.Integer num2 = this.transactionCountRemaining;
            return (hashCode * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment.Progress)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment.Progress progress = (com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment.Progress) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionCountCompleted, progress.transactionCountCompleted) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionCountRemaining, progress.transactionCountRemaining);
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment.Progress copy(java.lang.Integer transactionCountCompleted, java.lang.Integer transactionCountRemaining) {
            return new com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment.Progress(transactionCountCompleted, transactionCountRemaining);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getTransactionCountRemaining() {
            return this.transactionCountRemaining;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Integer getTransactionCountCompleted() {
            return this.transactionCountCompleted;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment.Progress copy$default(com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment.Progress progress, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = progress.transactionCountCompleted;
            }
            if ((i & 2) != 0) {
                num2 = progress.transactionCountRemaining;
            }
            return progress.copy(num, num2);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment.Progress progress = this.progress;
        java.lang.Object obj = this.enrollmentExpiryDateTime;
        java.lang.String str = this.description;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PromotionRewardProgressItemFragment(progress=");
        sb.append(progress);
        sb.append(", enrollmentExpiryDateTime=");
        sb.append(obj);
        sb.append(", description=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment.Progress progress = this.progress;
        int hashCode = progress == null ? 0 : progress.hashCode();
        java.lang.Object obj = this.enrollmentExpiryDateTime;
        return (((hashCode * 31) + (obj != null ? obj.hashCode() : 0)) * 31) + this.description.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment promotionRewardProgressItemFragment = (com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.progress, promotionRewardProgressItemFragment.progress) && kotlin.jvm.internal.Intrinsics.areEqual(this.enrollmentExpiryDateTime, promotionRewardProgressItemFragment.enrollmentExpiryDateTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, promotionRewardProgressItemFragment.description);
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment copy(com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment.Progress progress, java.lang.Object enrollmentExpiryDateTime, java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        return new com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment(progress, enrollmentExpiryDateTime, description);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getEnrollmentExpiryDateTime() {
        return this.enrollmentExpiryDateTime;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment.Progress getProgress() {
        return this.progress;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment promotionRewardProgressItemFragment, com.paypal.oslo.feature.activity.graphql.fragment.PromotionRewardProgressItemFragment.Progress progress, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            progress = promotionRewardProgressItemFragment.progress;
        }
        if ((i & 2) != 0) {
            obj = promotionRewardProgressItemFragment.enrollmentExpiryDateTime;
        }
        if ((i & 4) != 0) {
            str = promotionRewardProgressItemFragment.description;
        }
        return promotionRewardProgressItemFragment.copy(progress, obj, str);
    }
}
