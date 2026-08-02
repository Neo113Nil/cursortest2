package com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fR$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\r\u000e\u000f\u0010À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType;", "", "", "Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus;", "Lcom/paypal/oslo/api/graphql/schema/type/ActivitiesInput;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivitiesInput;", "getActivityInput", "()Ljava/util/Map;", "activityInput", "ActivityLedgerQueryType", "ActivityWidgetQueryType", "ActivityLedgerFilterQueryType", "ActivityLedgerPaginationQueryType", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType$ActivityLedgerFilterQueryType;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType$ActivityLedgerPaginationQueryType;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType$ActivityLedgerQueryType;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType$ActivityWidgetQueryType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface ActivityLedgerUseCaseInputQueryType {
    java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> getActivityInput();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R*\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType$ActivityLedgerQueryType;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType;", "", "Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus;", "Lcom/paypal/oslo/api/graphql/schema/type/ActivitiesInput;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivitiesInput;", "activityInput", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType$ActivityLedgerQueryType;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getActivityInput"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ActivityLedgerQueryType implements com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType {
        public static final int $stable = 8;
        private final java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> activityInput;

        public ActivityLedgerQueryType(java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.activityInput = map;
        }

        @Override // com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType
        public final java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> getActivityInput() {
            return this.activityInput;
        }

        public final java.lang.String toString() {
            java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> map = this.activityInput;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityLedgerQueryType(activityInput=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityInput.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerQueryType) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityInput, ((com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerQueryType) other).activityInput);
        }

        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerQueryType copy(java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> activityInput) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityInput, "");
            return new com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerQueryType(activityInput);
        }

        public final java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> component1() {
            return this.activityInput;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerQueryType copy$default(com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerQueryType activityLedgerQueryType, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                map = activityLedgerQueryType.activityInput;
            }
            return activityLedgerQueryType.copy(map);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R*\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType$ActivityWidgetQueryType;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType;", "", "Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus;", "Lcom/paypal/oslo/api/graphql/schema/type/ActivitiesInput;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivitiesInput;", "activityInput", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType$ActivityWidgetQueryType;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getActivityInput"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ActivityWidgetQueryType implements com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType {
        public static final int $stable = 8;
        private final java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> activityInput;

        public ActivityWidgetQueryType(java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.activityInput = map;
        }

        @Override // com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType
        public final java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> getActivityInput() {
            return this.activityInput;
        }

        public final java.lang.String toString() {
            java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> map = this.activityInput;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityWidgetQueryType(activityInput=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityInput.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityWidgetQueryType) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityInput, ((com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityWidgetQueryType) other).activityInput);
        }

        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityWidgetQueryType copy(java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> activityInput) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityInput, "");
            return new com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityWidgetQueryType(activityInput);
        }

        public final java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> component1() {
            return this.activityInput;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityWidgetQueryType copy$default(com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityWidgetQueryType activityWidgetQueryType, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                map = activityWidgetQueryType.activityInput;
            }
            return activityWidgetQueryType.copy(map);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R*\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType$ActivityLedgerFilterQueryType;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType;", "", "Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus;", "Lcom/paypal/oslo/api/graphql/schema/type/ActivitiesInput;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivitiesInput;", "activityInput", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType$ActivityLedgerFilterQueryType;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getActivityInput"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ActivityLedgerFilterQueryType implements com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType {
        public static final int $stable = 8;
        private final java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> activityInput;

        public ActivityLedgerFilterQueryType(java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.activityInput = map;
        }

        @Override // com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType
        public final java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> getActivityInput() {
            return this.activityInput;
        }

        public final java.lang.String toString() {
            java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> map = this.activityInput;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityLedgerFilterQueryType(activityInput=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityInput.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerFilterQueryType) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityInput, ((com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerFilterQueryType) other).activityInput);
        }

        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerFilterQueryType copy(java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> activityInput) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityInput, "");
            return new com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerFilterQueryType(activityInput);
        }

        public final java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> component1() {
            return this.activityInput;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerFilterQueryType copy$default(com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerFilterQueryType activityLedgerFilterQueryType, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                map = activityLedgerFilterQueryType.activityInput;
            }
            return activityLedgerFilterQueryType.copy(map);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R*\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType$ActivityLedgerPaginationQueryType;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType;", "", "Lcom/paypal/oslo/feature/activity/domain/common/queryparams/ActivityGraphQLQueryFilterStatus;", "Lcom/paypal/oslo/api/graphql/schema/type/ActivitiesInput;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivitiesInput;", "activityInput", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType$ActivityLedgerPaginationQueryType;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getActivityInput"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ActivityLedgerPaginationQueryType implements com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType {
        public static final int $stable = 8;
        private final java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> activityInput;

        public ActivityLedgerPaginationQueryType(java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.activityInput = map;
        }

        @Override // com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType
        public final java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> getActivityInput() {
            return this.activityInput;
        }

        public final java.lang.String toString() {
            java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> map = this.activityInput;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityLedgerPaginationQueryType(activityInput=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityInput.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerPaginationQueryType) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityInput, ((com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerPaginationQueryType) other).activityInput);
        }

        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerPaginationQueryType copy(java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> activityInput) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityInput, "");
            return new com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerPaginationQueryType(activityInput);
        }

        public final java.util.Map<com.paypal.oslo.feature.activity.domain.common.queryparams.ActivityGraphQLQueryFilterStatus, com.paypal.oslo.api.graphql.schema.type.ActivitiesInput> component1() {
            return this.activityInput;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerPaginationQueryType copy$default(com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerPaginationQueryType activityLedgerPaginationQueryType, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                map = activityLedgerPaginationQueryType.activityInput;
            }
            return activityLedgerPaginationQueryType.copy(map);
        }
    }
}
