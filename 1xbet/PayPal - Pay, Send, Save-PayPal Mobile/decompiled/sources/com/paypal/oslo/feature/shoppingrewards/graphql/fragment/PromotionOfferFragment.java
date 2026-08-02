package com.paypal.oslo.feature.shoppingrewards.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/PromotionOfferFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "id", "externalId", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/PromotionOfferFragment$Schedule;", "schedule", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/PromotionOfferFragment$Schedule;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/PromotionOfferFragment$Schedule;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/PromotionOfferFragment$Schedule;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/PromotionOfferFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getExternalId", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/PromotionOfferFragment$Schedule;", "getSchedule", "Schedule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PromotionOfferFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String externalId;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment.Schedule schedule;

    public PromotionOfferFragment(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment.Schedule schedule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        this.externalId = str2;
        this.schedule = schedule;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getExternalId() {
        return this.externalId;
    }

    public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment.Schedule getSchedule() {
        return this.schedule;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/PromotionOfferFragment$Schedule;", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_END_TIME, "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/shoppingrewards/graphql/fragment/PromotionOfferFragment$Schedule;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getEndTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Schedule {
        public static final int $stable = 8;
        private final java.lang.Object endTime;

        public Schedule(java.lang.Object obj) {
            this.endTime = obj;
        }

        public final java.lang.Object getEndTime() {
            return this.endTime;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.endTime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Schedule(endTime=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Object obj = this.endTime;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment.Schedule) && kotlin.jvm.internal.Intrinsics.areEqual(this.endTime, ((com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment.Schedule) other).endTime);
        }

        public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment.Schedule copy(java.lang.Object endTime) {
            return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment.Schedule(endTime);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getEndTime() {
            return this.endTime;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment.Schedule copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment.Schedule schedule, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = schedule.endTime;
            }
            return schedule.copy(obj);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.externalId;
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment.Schedule schedule = this.schedule;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PromotionOfferFragment(id=");
        sb.append(str);
        sb.append(", externalId=");
        sb.append(str2);
        sb.append(", schedule=");
        sb.append(schedule);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        java.lang.String str = this.externalId;
        int hashCode2 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment.Schedule schedule = this.schedule;
        return (((hashCode * 31) + hashCode2) * 31) + (schedule != null ? schedule.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment promotionOfferFragment = (com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, promotionOfferFragment.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalId, promotionOfferFragment.externalId) && kotlin.jvm.internal.Intrinsics.areEqual(this.schedule, promotionOfferFragment.schedule);
    }

    public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment copy(java.lang.String id, java.lang.String externalId, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment.Schedule schedule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment(id, externalId, schedule);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment.Schedule getSchedule() {
        return this.schedule;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getExternalId() {
        return this.externalId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment copy$default(com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment promotionOfferFragment, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.shoppingrewards.graphql.fragment.PromotionOfferFragment.Schedule schedule, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = promotionOfferFragment.id;
        }
        if ((i & 2) != 0) {
            str2 = promotionOfferFragment.externalId;
        }
        if ((i & 4) != 0) {
            schedule = promotionOfferFragment.schedule;
        }
        return promotionOfferFragment.copy(str, str2, schedule);
    }
}
