package com.paypal.oslo.feature.activity.domain.common.models;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\b\t\nR\u001e\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType;", "Lcom/paypal/oslo/feature/activity/domain/base/result/IActivityRemoteBaseResult;", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityActionType;", "getActions", "()Ljava/util/Set;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "NavigationActions", "WebKitActions", "MutationActions", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$MutationActions;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$NavigationActions;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$WebKitActions;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface ActivityActionNavigationType extends com.paypal.oslo.feature.activity.domain.base.result.IActivityRemoteBaseResult {
    java.util.Set<com.paypal.oslo.api.graphql.schema.type.ActivityActionType> getActions();

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u00020\u00002\u0012\b\u0002\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$NavigationActions;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType;", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityActionType;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "<init>", "(Ljava/util/Set;)V", "component1", "()Ljava/util/Set;", "copy", "(Ljava/util/Set;)Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$NavigationActions;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Set;", "getActions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigationActions implements com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType {
        public static final int $stable = 8;
        private final java.util.Set<com.paypal.oslo.api.graphql.schema.type.ActivityActionType> actions;

        /* JADX WARN: Multi-variable type inference failed */
        public NavigationActions(java.util.Set<? extends com.paypal.oslo.api.graphql.schema.type.ActivityActionType> set) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            this.actions = set;
        }

        @Override // com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType
        public final java.util.Set<com.paypal.oslo.api.graphql.schema.type.ActivityActionType> getActions() {
            return this.actions;
        }

        public final java.lang.String toString() {
            java.util.Set<com.paypal.oslo.api.graphql.schema.type.ActivityActionType> set = this.actions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigationActions(actions=");
            sb.append(set);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.actions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.NavigationActions) && kotlin.jvm.internal.Intrinsics.areEqual(this.actions, ((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.NavigationActions) other).actions);
        }

        public final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.NavigationActions copy(java.util.Set<? extends com.paypal.oslo.api.graphql.schema.type.ActivityActionType> actions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actions, "");
            return new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.NavigationActions(actions);
        }

        public final java.util.Set<com.paypal.oslo.api.graphql.schema.type.ActivityActionType> component1() {
            return this.actions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.NavigationActions copy$default(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.NavigationActions navigationActions, java.util.Set set, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                set = navigationActions.actions;
            }
            return navigationActions.copy(set);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u00020\u00002\u0012\b\u0002\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$WebKitActions;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType;", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityActionType;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "<init>", "(Ljava/util/Set;)V", "component1", "()Ljava/util/Set;", "copy", "(Ljava/util/Set;)Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$WebKitActions;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Set;", "getActions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WebKitActions implements com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType {
        public static final int $stable = 8;
        private final java.util.Set<com.paypal.oslo.api.graphql.schema.type.ActivityActionType> actions;

        /* JADX WARN: Multi-variable type inference failed */
        public WebKitActions(java.util.Set<? extends com.paypal.oslo.api.graphql.schema.type.ActivityActionType> set) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            this.actions = set;
        }

        @Override // com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType
        public final java.util.Set<com.paypal.oslo.api.graphql.schema.type.ActivityActionType> getActions() {
            return this.actions;
        }

        public final java.lang.String toString() {
            java.util.Set<com.paypal.oslo.api.graphql.schema.type.ActivityActionType> set = this.actions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WebKitActions(actions=");
            sb.append(set);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.actions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.WebKitActions) && kotlin.jvm.internal.Intrinsics.areEqual(this.actions, ((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.WebKitActions) other).actions);
        }

        public final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.WebKitActions copy(java.util.Set<? extends com.paypal.oslo.api.graphql.schema.type.ActivityActionType> actions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actions, "");
            return new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.WebKitActions(actions);
        }

        public final java.util.Set<com.paypal.oslo.api.graphql.schema.type.ActivityActionType> component1() {
            return this.actions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.WebKitActions copy$default(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.WebKitActions webKitActions, java.util.Set set, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                set = webKitActions.actions;
            }
            return webKitActions.copy(set);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u00020\u00002\u0012\b\u0002\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$MutationActions;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType;", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityActionType;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "<init>", "(Ljava/util/Set;)V", "component1", "()Ljava/util/Set;", "copy", "(Ljava/util/Set;)Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionNavigationType$MutationActions;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Set;", "getActions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MutationActions implements com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType {
        public static final int $stable = 8;
        private final java.util.Set<com.paypal.oslo.api.graphql.schema.type.ActivityActionType> actions;

        /* JADX WARN: Multi-variable type inference failed */
        public MutationActions(java.util.Set<? extends com.paypal.oslo.api.graphql.schema.type.ActivityActionType> set) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            this.actions = set;
        }

        @Override // com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType
        public final java.util.Set<com.paypal.oslo.api.graphql.schema.type.ActivityActionType> getActions() {
            return this.actions;
        }

        public final java.lang.String toString() {
            java.util.Set<com.paypal.oslo.api.graphql.schema.type.ActivityActionType> set = this.actions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MutationActions(actions=");
            sb.append(set);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.actions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.MutationActions) && kotlin.jvm.internal.Intrinsics.areEqual(this.actions, ((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.MutationActions) other).actions);
        }

        public final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.MutationActions copy(java.util.Set<? extends com.paypal.oslo.api.graphql.schema.type.ActivityActionType> actions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actions, "");
            return new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.MutationActions(actions);
        }

        public final java.util.Set<com.paypal.oslo.api.graphql.schema.type.ActivityActionType> component1() {
            return this.actions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.MutationActions copy$default(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType.MutationActions mutationActions, java.util.Set set, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                set = mutationActions.actions;
            }
            return mutationActions.copy(set);
        }
    }
}
