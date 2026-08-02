package com.paypal.oslo.feature.activity.domain.common.queryparams;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus;", "", "<init>", "()V", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "Recent", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.UPCOMING, "Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus$Completed;", "Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus$Pending;", "Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus$Recent;", "Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus$Upcoming;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ActivityGraphQLQueryFilterStatus {
    public static final int $stable = 0;

    private ActivityGraphQLQueryFilterStatus() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R'\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus$Pending;", "Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus;", "Lcom/apollographql/apollo/api/Optional;", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityStatus;", "activityStatuses", "<init>", "(Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus$Pending;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getActivityStatuses"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Pending extends com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus {
        public static final int $stable = 8;
        private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> activityStatuses;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Pending(com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> optional) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
            this.activityStatuses = optional;
        }

        public /* synthetic */ Pending(com.apollographql.apollo.api.Optional.Present present, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ActivityStatus[]{com.paypal.oslo.api.graphql.schema.type.ActivityStatus.CREATED, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.HELD, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.UNCLAIMED, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.PENDING, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.PARTIALLY_PAID})) : present);
        }

        public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> getActivityStatuses() {
            return this.activityStatuses;
        }

        public final java.lang.String toString() {
            com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> optional = this.activityStatuses;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Pending(activityStatuses=");
            sb.append(optional);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityStatuses.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Pending) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityStatuses, ((com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Pending) other).activityStatuses);
        }

        public final com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Pending copy(com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> activityStatuses) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityStatuses, "");
            return new com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Pending(activityStatuses);
        }

        public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> component1() {
            return this.activityStatuses;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Pending copy$default(com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Pending pending, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                optional = pending.activityStatuses;
            }
            return pending.copy(optional);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Pending() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R'\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus$Completed;", "Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus;", "Lcom/apollographql/apollo/api/Optional;", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityStatus;", "activityStatuses", "<init>", "(Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus$Completed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getActivityStatuses"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Completed extends com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus {
        public static final int $stable = 8;
        private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> activityStatuses;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Completed(com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> optional) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
            this.activityStatuses = optional;
        }

        public /* synthetic */ Completed(com.apollographql.apollo.api.Optional.Present present, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ActivityStatus[]{com.paypal.oslo.api.graphql.schema.type.ActivityStatus.BLOCKED, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.CANCELED, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.COMPLETED, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.DENIED, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.FAILED, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.PAID, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.REFUNDED, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.REVERSED, com.paypal.oslo.api.graphql.schema.type.ActivityStatus.PARTIALLY_REFUNDED})) : present);
        }

        public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> getActivityStatuses() {
            return this.activityStatuses;
        }

        public final java.lang.String toString() {
            com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> optional = this.activityStatuses;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Completed(activityStatuses=");
            sb.append(optional);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityStatuses.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Completed) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityStatuses, ((com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Completed) other).activityStatuses);
        }

        public final com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Completed copy(com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> activityStatuses) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityStatuses, "");
            return new com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Completed(activityStatuses);
        }

        public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> component1() {
            return this.activityStatuses;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Completed copy$default(com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Completed completed, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                optional = completed.activityStatuses;
            }
            return completed.copy(optional);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Completed() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R'\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus$Recent;", "Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus;", "Lcom/apollographql/apollo/api/Optional;", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityStatus;", "activityStatuses", "<init>", "(Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus$Recent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getActivityStatuses"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Recent extends com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus {
        public static final int $stable = 8;
        private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> activityStatuses;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Recent(com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> optional) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
            this.activityStatuses = optional;
        }

        public /* synthetic */ Recent(com.apollographql.apollo.api.Optional.Present present, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.collections.CollectionsKt.emptyList()) : present);
        }

        public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> getActivityStatuses() {
            return this.activityStatuses;
        }

        public final java.lang.String toString() {
            com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> optional = this.activityStatuses;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Recent(activityStatuses=");
            sb.append(optional);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityStatuses.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Recent) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityStatuses, ((com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Recent) other).activityStatuses);
        }

        public final com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Recent copy(com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> activityStatuses) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityStatuses, "");
            return new com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Recent(activityStatuses);
        }

        public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> component1() {
            return this.activityStatuses;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Recent copy$default(com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Recent recent, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                optional = recent.activityStatuses;
            }
            return recent.copy(optional);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Recent() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00030\u0002\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00030\u0002\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\nj\u0002`\u000b0\u00030\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0011\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J \u0010\u0012\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\nj\u0002`\u000b0\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J^\u0010\u0013\u001a\u00020\u00002\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00030\u00022\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00030\u00022\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\nj\u0002`\u000b0\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR'\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0010R*\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b\"\u0010\u0010R*\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\nj\u0002`\u000b0\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b#\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus$Upcoming;", "Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus;", "Lcom/apollographql/apollo/api/Optional;", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityStatus;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityStatus;", "activityStatuses", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingStatus;", "Lcom/paypal/oslo/feature/activity/graphql/type/PackageTrackingStatus;", "packageStatuses", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityType;", "types", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus$Upcoming;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getActivityStatuses", "getPackageStatuses", "getTypes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Upcoming extends com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus {
        public static final int $stable = 8;
        private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> activityStatuses;
        private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus>> packageStatuses;
        private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityType>> types;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Upcoming(com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> optional, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus>> optional2, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ActivityType>> optional3) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
            this.activityStatuses = optional;
            this.packageStatuses = optional2;
            this.types = optional3;
        }

        public /* synthetic */ Upcoming(com.apollographql.apollo.api.Optional.Present present, com.apollographql.apollo.api.Optional.Present present2, com.apollographql.apollo.api.Optional.Present present3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.collections.CollectionsKt.emptyList()) : present, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus[]{com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.IN_TRANSIT, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.INFORMATION_RECEIVED, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.EXCEPTION, com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus.OUT_FOR_DELIVERY})) : present2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.api.graphql.schema.type.ActivityType.PACKAGE)) : present3);
        }

        public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> getActivityStatuses() {
            return this.activityStatuses;
        }

        public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus>> getPackageStatuses() {
            return this.packageStatuses;
        }

        public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityType>> getTypes() {
            return this.types;
        }

        public final java.lang.String toString() {
            com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> optional = this.activityStatuses;
            com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus>> optional2 = this.packageStatuses;
            com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityType>> optional3 = this.types;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Upcoming(activityStatuses=");
            sb.append(optional);
            sb.append(", packageStatuses=");
            sb.append(optional2);
            sb.append(", types=");
            sb.append(optional3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.activityStatuses.hashCode() * 31) + this.packageStatuses.hashCode()) * 31) + this.types.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Upcoming)) {
                return false;
            }
            com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Upcoming upcoming = (com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Upcoming) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.activityStatuses, upcoming.activityStatuses) && kotlin.jvm.internal.Intrinsics.areEqual(this.packageStatuses, upcoming.packageStatuses) && kotlin.jvm.internal.Intrinsics.areEqual(this.types, upcoming.types);
        }

        public final com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Upcoming copy(com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> activityStatuses, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus>> packageStatuses, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ActivityType>> types) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityStatuses, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageStatuses, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(types, "");
            return new com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Upcoming(activityStatuses, packageStatuses, types);
        }

        public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityType>> component3() {
            return this.types;
        }

        public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.PackageTrackingStatus>> component2() {
            return this.packageStatuses;
        }

        public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityStatus>> component1() {
            return this.activityStatuses;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Upcoming copy$default(com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus.Upcoming upcoming, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                optional = upcoming.activityStatuses;
            }
            if ((i & 2) != 0) {
                optional2 = upcoming.packageStatuses;
            }
            if ((i & 4) != 0) {
                optional3 = upcoming.types;
            }
            return upcoming.copy(optional, optional2, optional3);
        }

        public Upcoming() {
            this(null, null, null, 7, null);
        }
    }

    public /* synthetic */ ActivityGraphQLQueryFilterStatus(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
