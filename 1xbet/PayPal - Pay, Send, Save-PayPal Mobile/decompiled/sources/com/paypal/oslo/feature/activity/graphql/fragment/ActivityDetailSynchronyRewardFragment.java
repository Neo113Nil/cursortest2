package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDetailSynchronyRewardFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDetailSynchronyRewardFragment$RewardList;", "rewardList", "", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.NOTE, "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDetailSynchronyRewardFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getRewardList", "Ljava/lang/String;", "getNote", "RewardList"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityDetailSynchronyRewardFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String note;
    private final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment.RewardList> rewardList;

    public ActivityDetailSynchronyRewardFragment(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment.RewardList> list, java.lang.String str) {
        this.rewardList = list;
        this.note = str;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment.RewardList> getRewardList() {
        return this.rewardList;
    }

    public final java.lang.String getNote() {
        return this.note;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDetailSynchronyRewardFragment$RewardList;", "", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/api/graphql/schema/type/ActivityRewardStatus;", "status", "percentage", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivityRewardStatus;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivityRewardStatus;", "component3", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivityRewardStatus;Ljava/lang/Object;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityDetailSynchronyRewardFragment$RewardList;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDescription", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityRewardStatus;", "getStatus", "Ljava/lang/Object;", "getPercentage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RewardList {
        public static final int $stable = 8;
        private final java.lang.String description;
        private final java.lang.Object percentage;
        private final com.paypal.oslo.api.graphql.schema.type.ActivityRewardStatus status;

        public RewardList(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ActivityRewardStatus activityRewardStatus, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityRewardStatus, "");
            this.description = str;
            this.status = activityRewardStatus;
            this.percentage = obj;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ActivityRewardStatus getStatus() {
            return this.status;
        }

        public final java.lang.Object getPercentage() {
            return this.percentage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.description;
            com.paypal.oslo.api.graphql.schema.type.ActivityRewardStatus activityRewardStatus = this.status;
            java.lang.Object obj = this.percentage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RewardList(description=");
            sb.append(str);
            sb.append(", status=");
            sb.append(activityRewardStatus);
            sb.append(", percentage=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.description;
            int hashCode = str == null ? 0 : str.hashCode();
            int hashCode2 = this.status.hashCode();
            java.lang.Object obj = this.percentage;
            return (((hashCode * 31) + hashCode2) * 31) + (obj != null ? obj.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment.RewardList)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment.RewardList rewardList = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment.RewardList) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.description, rewardList.description) && this.status == rewardList.status && kotlin.jvm.internal.Intrinsics.areEqual(this.percentage, rewardList.percentage);
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment.RewardList copy(java.lang.String description, com.paypal.oslo.api.graphql.schema.type.ActivityRewardStatus status, java.lang.Object percentage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment.RewardList(description, status, percentage);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getPercentage() {
            return this.percentage;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ActivityRewardStatus getStatus() {
            return this.status;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment.RewardList copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment.RewardList rewardList, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ActivityRewardStatus activityRewardStatus, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = rewardList.description;
            }
            if ((i & 2) != 0) {
                activityRewardStatus = rewardList.status;
            }
            if ((i & 4) != 0) {
                obj = rewardList.percentage;
            }
            return rewardList.copy(str, activityRewardStatus, obj);
        }
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment.RewardList> list = this.rewardList;
        java.lang.String str = this.note;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityDetailSynchronyRewardFragment(rewardList=");
        sb.append(list);
        sb.append(", note=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment.RewardList> list = this.rewardList;
        int hashCode = list == null ? 0 : list.hashCode();
        java.lang.String str = this.note;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment activityDetailSynchronyRewardFragment = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.rewardList, activityDetailSynchronyRewardFragment.rewardList) && kotlin.jvm.internal.Intrinsics.areEqual(this.note, activityDetailSynchronyRewardFragment.note);
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment copy(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment.RewardList> rewardList, java.lang.String note) {
        return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment(rewardList, note);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getNote() {
        return this.note;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment.RewardList> component1() {
        return this.rewardList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityDetailSynchronyRewardFragment activityDetailSynchronyRewardFragment, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = activityDetailSynchronyRewardFragment.rewardList;
        }
        if ((i & 2) != 0) {
            str = activityDetailSynchronyRewardFragment.note;
        }
        return activityDetailSynchronyRewardFragment.copy(list, str);
    }
}
