package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityEtaProgressFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", org.bouncycastle.i18n.ErrorBundle.SUMMARY_ENTRY, "", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityEtaProgressFragment$Milestone;", "milestones", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityEtaProgressFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSummary", "Ljava/util/List;", "getMilestones", "Milestone"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityEtaProgressFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment.Milestone> milestones;
    private final java.lang.String summary;

    public ActivityEtaProgressFragment(java.lang.String str, java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment.Milestone> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.summary = str;
        this.milestones = list;
    }

    public final java.lang.String getSummary() {
        return this.summary;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment.Milestone> getMilestones() {
        return this.milestones;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000bJ<\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b!\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityEtaProgressFragment$Milestone;", "", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/api/graphql/schema/type/ActivityETAMilestoneStatus;", "status", "milestoneTime", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.NOTE, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivityETAMilestoneStatus;Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivityETAMilestoneStatus;", "component3", "()Ljava/lang/Object;", "component4", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivityETAMilestoneStatus;Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityEtaProgressFragment$Milestone;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDescription", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityETAMilestoneStatus;", "getStatus", "Ljava/lang/Object;", "getMilestoneTime", "getNote"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Milestone {
        public static final int $stable = 8;
        private final java.lang.String description;
        private final java.lang.Object milestoneTime;
        private final java.lang.String note;
        private final com.paypal.oslo.api.graphql.schema.type.ActivityETAMilestoneStatus status;

        public Milestone(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ActivityETAMilestoneStatus activityETAMilestoneStatus, java.lang.Object obj, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityETAMilestoneStatus, "");
            this.description = str;
            this.status = activityETAMilestoneStatus;
            this.milestoneTime = obj;
            this.note = str2;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final com.paypal.oslo.api.graphql.schema.type.ActivityETAMilestoneStatus getStatus() {
            return this.status;
        }

        public final java.lang.Object getMilestoneTime() {
            return this.milestoneTime;
        }

        public final java.lang.String getNote() {
            return this.note;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.description;
            com.paypal.oslo.api.graphql.schema.type.ActivityETAMilestoneStatus activityETAMilestoneStatus = this.status;
            java.lang.Object obj = this.milestoneTime;
            java.lang.String str2 = this.note;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Milestone(description=");
            sb.append(str);
            sb.append(", status=");
            sb.append(activityETAMilestoneStatus);
            sb.append(", milestoneTime=");
            sb.append(obj);
            sb.append(", note=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.description.hashCode();
            int hashCode2 = this.status.hashCode();
            java.lang.Object obj = this.milestoneTime;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            java.lang.String str = this.note;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment.Milestone)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment.Milestone milestone = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment.Milestone) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.description, milestone.description) && this.status == milestone.status && kotlin.jvm.internal.Intrinsics.areEqual(this.milestoneTime, milestone.milestoneTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.note, milestone.note);
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment.Milestone copy(java.lang.String description, com.paypal.oslo.api.graphql.schema.type.ActivityETAMilestoneStatus status, java.lang.Object milestoneTime, java.lang.String note) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment.Milestone(description, status, milestoneTime, note);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getNote() {
            return this.note;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getMilestoneTime() {
            return this.milestoneTime;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.ActivityETAMilestoneStatus getStatus() {
            return this.status;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment.Milestone copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment.Milestone milestone, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ActivityETAMilestoneStatus activityETAMilestoneStatus, java.lang.Object obj, java.lang.String str2, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = milestone.description;
            }
            if ((i & 2) != 0) {
                activityETAMilestoneStatus = milestone.status;
            }
            if ((i & 4) != 0) {
                obj = milestone.milestoneTime;
            }
            if ((i & 8) != 0) {
                str2 = milestone.note;
            }
            return milestone.copy(str, activityETAMilestoneStatus, obj, str2);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.summary;
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment.Milestone> list = this.milestones;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityEtaProgressFragment(summary=");
        sb.append(str);
        sb.append(", milestones=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.summary;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.milestones.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment activityEtaProgressFragment = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.summary, activityEtaProgressFragment.summary) && kotlin.jvm.internal.Intrinsics.areEqual(this.milestones, activityEtaProgressFragment.milestones);
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment copy(java.lang.String summary, java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment.Milestone> milestones) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(milestones, "");
        return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment(summary, milestones);
    }

    public final java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment.Milestone> component2() {
        return this.milestones;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSummary() {
        return this.summary;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityEtaProgressFragment activityEtaProgressFragment, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activityEtaProgressFragment.summary;
        }
        if ((i & 2) != 0) {
            list = activityEtaProgressFragment.milestones;
        }
        return activityEtaProgressFragment.copy(str, list);
    }
}
