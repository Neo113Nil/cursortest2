package com.paypal.oslo.feature.activity.domain.common.remote;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0010\u0011B-\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00018\u00008\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00018\u00008\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00018\u00008\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\u0082\u0001\u0002\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/remote/ActivitiesQueriesResult;", "T", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "upcomingActivities", "Ljava/lang/Object;", "getUpcomingActivities", "()Ljava/lang/Object;", "pendingActivities", "getPendingActivities", "completedActivities", "getCompletedActivities", "SectionedActivitiesQueriesResult", "GetUserActivitiesQueriesResultForPagination", "Lcom/paypal/oslo/feature/activity/domain/common/remote/ActivitiesQueriesResult$GetUserActivitiesQueriesResultForPagination;", "Lcom/paypal/oslo/feature/activity/domain/common/remote/ActivitiesQueriesResult$SectionedActivitiesQueriesResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ActivitiesQueriesResult<T> {
    public static final int $stable = 0;
    private final T completedActivities;
    private final T pendingActivities;
    private final T upcomingActivities;

    private ActivitiesQueriesResult(T t, T t2, T t3) {
        this.upcomingActivities = t;
        this.pendingActivities = t2;
        this.completedActivities = t3;
    }

    public /* synthetic */ ActivitiesQueriesResult(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : obj2, (i & 4) != 0 ? null : obj3, null);
    }

    public T getUpcomingActivities() {
        return this.upcomingActivities;
    }

    public T getPendingActivities() {
        return this.pendingActivities;
    }

    public T getCompletedActivities() {
        return this.completedActivities;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00018\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00018\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00018\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ:\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00018\u00018\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00018\u00018\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00018\u00018\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/remote/ActivitiesQueriesResult$SectionedActivitiesQueriesResult;", "T", "Lcom/paypal/oslo/feature/activity/domain/common/remote/ActivitiesQueriesResult;", "upcomingActivities", "pendingActivities", "completedActivities", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/paypal/oslo/feature/activity/domain/common/remote/ActivitiesQueriesResult$SectionedActivitiesQueriesResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getUpcomingActivities", "getPendingActivities", "getCompletedActivities"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SectionedActivitiesQueriesResult<T> extends com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult<T> {
        public static final int $stable = 8;
        private final T completedActivities;
        private final T pendingActivities;
        private final T upcomingActivities;

        public SectionedActivitiesQueriesResult(T t, T t2, T t3) {
            super(null, null, null, 7, null);
            this.upcomingActivities = t;
            this.pendingActivities = t2;
            this.completedActivities = t3;
        }

        @Override // com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult
        public final T getUpcomingActivities() {
            return this.upcomingActivities;
        }

        @Override // com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult
        public final T getPendingActivities() {
            return this.pendingActivities;
        }

        @Override // com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult
        public final T getCompletedActivities() {
            return this.completedActivities;
        }

        public final java.lang.String toString() {
            T t = this.upcomingActivities;
            T t2 = this.pendingActivities;
            T t3 = this.completedActivities;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SectionedActivitiesQueriesResult(upcomingActivities=");
            sb.append(t);
            sb.append(", pendingActivities=");
            sb.append(t2);
            sb.append(", completedActivities=");
            sb.append(t3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            T t = this.upcomingActivities;
            int hashCode = t == null ? 0 : t.hashCode();
            T t2 = this.pendingActivities;
            int hashCode2 = t2 == null ? 0 : t2.hashCode();
            T t3 = this.completedActivities;
            return (((hashCode * 31) + hashCode2) * 31) + (t3 != null ? t3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult.SectionedActivitiesQueriesResult)) {
                return false;
            }
            com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult.SectionedActivitiesQueriesResult sectionedActivitiesQueriesResult = (com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult.SectionedActivitiesQueriesResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.upcomingActivities, sectionedActivitiesQueriesResult.upcomingActivities) && kotlin.jvm.internal.Intrinsics.areEqual(this.pendingActivities, sectionedActivitiesQueriesResult.pendingActivities) && kotlin.jvm.internal.Intrinsics.areEqual(this.completedActivities, sectionedActivitiesQueriesResult.completedActivities);
        }

        public final com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult.SectionedActivitiesQueriesResult<T> copy(T upcomingActivities, T pendingActivities, T completedActivities) {
            return new com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult.SectionedActivitiesQueriesResult<>(upcomingActivities, pendingActivities, completedActivities);
        }

        public final T component3() {
            return this.completedActivities;
        }

        public final T component2() {
            return this.pendingActivities;
        }

        public final T component1() {
            return this.upcomingActivities;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult.SectionedActivitiesQueriesResult copy$default(com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult.SectionedActivitiesQueriesResult sectionedActivitiesQueriesResult, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i, java.lang.Object obj4) {
            if ((i & 1) != 0) {
                obj = sectionedActivitiesQueriesResult.upcomingActivities;
            }
            if ((i & 2) != 0) {
                obj2 = sectionedActivitiesQueriesResult.pendingActivities;
            }
            if ((i & 4) != 0) {
                obj3 = sectionedActivitiesQueriesResult.completedActivities;
            }
            return sectionedActivitiesQueriesResult.copy(obj, obj2, obj3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00018\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00018\u00018\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/remote/ActivitiesQueriesResult$GetUserActivitiesQueriesResultForPagination;", "T", "Lcom/paypal/oslo/feature/activity/domain/common/remote/ActivitiesQueriesResult;", "completedActivities", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/activity/domain/common/remote/ActivitiesQueriesResult$GetUserActivitiesQueriesResultForPagination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getCompletedActivities"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GetUserActivitiesQueriesResultForPagination<T> extends com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult<T> {
        public static final int $stable = 8;
        private final T completedActivities;

        public GetUserActivitiesQueriesResultForPagination(T t) {
            super(null, null, null, 7, null);
            this.completedActivities = t;
        }

        @Override // com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult
        public final T getCompletedActivities() {
            return this.completedActivities;
        }

        public final java.lang.String toString() {
            T t = this.completedActivities;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GetUserActivitiesQueriesResultForPagination(completedActivities=");
            sb.append(t);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            T t = this.completedActivities;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult.GetUserActivitiesQueriesResultForPagination) && kotlin.jvm.internal.Intrinsics.areEqual(this.completedActivities, ((com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult.GetUserActivitiesQueriesResultForPagination) other).completedActivities);
        }

        public final com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult.GetUserActivitiesQueriesResultForPagination<T> copy(T completedActivities) {
            return new com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult.GetUserActivitiesQueriesResultForPagination<>(completedActivities);
        }

        public final T component1() {
            return this.completedActivities;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult.GetUserActivitiesQueriesResultForPagination copy$default(com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult.GetUserActivitiesQueriesResultForPagination getUserActivitiesQueriesResultForPagination, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = getUserActivitiesQueriesResultForPagination.completedActivities;
            }
            return getUserActivitiesQueriesResultForPagination.copy(obj);
        }
    }

    public /* synthetic */ ActivitiesQueriesResult(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2, obj3);
    }
}
