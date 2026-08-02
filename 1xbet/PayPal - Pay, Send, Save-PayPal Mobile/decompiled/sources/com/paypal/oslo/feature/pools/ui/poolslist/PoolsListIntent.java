package com.paypal.oslo.feature.pools.ui.poolslist;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListIntent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", "NavigateToPoolDetails", com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_NAVIGATE_TO_ERROR, "Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListIntent$Initialize;", "Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListIntent$NavigateToPoolDetails;", "Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListIntent$OnLoadError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PoolsListIntent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PoolsListIntent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListIntent$Initialize;", "Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.Initialize INSTANCE = new com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.Initialize();

        public final int hashCode() {
            return 4477912;
        }

        private Initialize() {
            super("Initialize", null);
        }

        public final java.lang.String toString() {
            return "Initialize";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.Initialize)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListIntent$NavigateToPoolDetails;", "Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListIntent;", "", "poolId", "poolCreatorAccountId", "Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;", "userRole", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;)Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListIntent$NavigateToPoolDetails;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPoolId", "getPoolCreatorAccountId", "Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;", "getUserRole"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPoolDetails extends com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent {
        public static final int $stable = 0;
        private final java.lang.String poolCreatorAccountId;
        private final java.lang.String poolId;
        private final com.paypal.oslo.feature.pools.domain.models.PoolUserRole userRole;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToPoolDetails(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.pools.domain.models.PoolUserRole poolUserRole) {
            super("NavigateToPoolDetails", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolUserRole, "");
            this.poolId = str;
            this.poolCreatorAccountId = str2;
            this.userRole = poolUserRole;
        }

        public final java.lang.String getPoolId() {
            return this.poolId;
        }

        public final java.lang.String getPoolCreatorAccountId() {
            return this.poolCreatorAccountId;
        }

        public final com.paypal.oslo.feature.pools.domain.models.PoolUserRole getUserRole() {
            return this.userRole;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.poolId;
            java.lang.String str2 = this.poolCreatorAccountId;
            com.paypal.oslo.feature.pools.domain.models.PoolUserRole poolUserRole = this.userRole;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToPoolDetails(poolId=");
            sb.append(str);
            sb.append(", poolCreatorAccountId=");
            sb.append(str2);
            sb.append(", userRole=");
            sb.append(poolUserRole);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.poolId.hashCode() * 31) + this.poolCreatorAccountId.hashCode()) * 31) + this.userRole.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.NavigateToPoolDetails)) {
                return false;
            }
            com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.NavigateToPoolDetails navigateToPoolDetails = (com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.NavigateToPoolDetails) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.poolId, navigateToPoolDetails.poolId) && kotlin.jvm.internal.Intrinsics.areEqual(this.poolCreatorAccountId, navigateToPoolDetails.poolCreatorAccountId) && this.userRole == navigateToPoolDetails.userRole;
        }

        public final com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.NavigateToPoolDetails copy(java.lang.String poolId, java.lang.String poolCreatorAccountId, com.paypal.oslo.feature.pools.domain.models.PoolUserRole userRole) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolCreatorAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userRole, "");
            return new com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.NavigateToPoolDetails(poolId, poolCreatorAccountId, userRole);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.pools.domain.models.PoolUserRole getUserRole() {
            return this.userRole;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPoolCreatorAccountId() {
            return this.poolCreatorAccountId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPoolId() {
            return this.poolId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.NavigateToPoolDetails copy$default(com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.NavigateToPoolDetails navigateToPoolDetails, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.pools.domain.models.PoolUserRole poolUserRole, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToPoolDetails.poolId;
            }
            if ((i & 2) != 0) {
                str2 = navigateToPoolDetails.poolCreatorAccountId;
            }
            if ((i & 4) != 0) {
                poolUserRole = navigateToPoolDetails.userRole;
            }
            return navigateToPoolDetails.copy(str, str2, poolUserRole);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\tJ0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListIntent$OnLoadError;", "Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListIntent;", "", "titleRes", "descriptionRes", "primaryButtonRes", "<init>", "(ILjava/lang/Integer;I)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "copy", "(ILjava/lang/Integer;I)Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListIntent$OnLoadError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTitleRes", "Ljava/lang/Integer;", "getDescriptionRes", "getPrimaryButtonRes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadError extends com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent {
        public static final int $stable = 0;
        private final java.lang.Integer descriptionRes;
        private final int primaryButtonRes;
        private final int titleRes;

        public OnLoadError(int i, java.lang.Integer num, int i2) {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_NAVIGATE_TO_ERROR, null);
            this.titleRes = i;
            this.descriptionRes = num;
            this.primaryButtonRes = i2;
        }

        public /* synthetic */ OnLoadError(int i, java.lang.Integer num, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? null : num, i2);
        }

        public final int getTitleRes() {
            return this.titleRes;
        }

        public final java.lang.Integer getDescriptionRes() {
            return this.descriptionRes;
        }

        public final int getPrimaryButtonRes() {
            return this.primaryButtonRes;
        }

        public final java.lang.String toString() {
            int i = this.titleRes;
            java.lang.Integer num = this.descriptionRes;
            int i2 = this.primaryButtonRes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoadError(titleRes=");
            sb.append(i);
            sb.append(", descriptionRes=");
            sb.append(num);
            sb.append(", primaryButtonRes=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.titleRes);
            java.lang.Integer num = this.descriptionRes;
            return (((hashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + java.lang.Integer.hashCode(this.primaryButtonRes);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.OnLoadError)) {
                return false;
            }
            com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.OnLoadError onLoadError = (com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.OnLoadError) other;
            return this.titleRes == onLoadError.titleRes && kotlin.jvm.internal.Intrinsics.areEqual(this.descriptionRes, onLoadError.descriptionRes) && this.primaryButtonRes == onLoadError.primaryButtonRes;
        }

        public final com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.OnLoadError copy(int titleRes, java.lang.Integer descriptionRes, int primaryButtonRes) {
            return new com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.OnLoadError(titleRes, descriptionRes, primaryButtonRes);
        }

        /* renamed from: component3, reason: from getter */
        public final int getPrimaryButtonRes() {
            return this.primaryButtonRes;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getDescriptionRes() {
            return this.descriptionRes;
        }

        /* renamed from: component1, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.OnLoadError copy$default(com.paypal.oslo.feature.pools.ui.poolslist.PoolsListIntent.OnLoadError onLoadError, int i, java.lang.Integer num, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = onLoadError.titleRes;
            }
            if ((i3 & 2) != 0) {
                num = onLoadError.descriptionRes;
            }
            if ((i3 & 4) != 0) {
                i2 = onLoadError.primaryButtonRes;
            }
            return onLoadError.copy(i, num, i2);
        }
    }

    public /* synthetic */ PoolsListIntent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
