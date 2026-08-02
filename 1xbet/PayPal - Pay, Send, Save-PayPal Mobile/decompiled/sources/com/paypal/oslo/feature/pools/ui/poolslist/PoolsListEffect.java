package com.paypal.oslo.feature.pools.ui.poolslist;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateToPoolDetails", com.paypal.oslo.feature.pools.constants.PoolsConstants.EffectNames.EFFECT_NAVIGATE_TO_ERROR, "Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListEffect$NavigateToError;", "Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListEffect$NavigateToPoolDetails;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PoolsListEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PoolsListEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListEffect$NavigateToPoolDetails;", "Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListEffect;", "", "poolId", "poolCreatorAccountId", "Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;", "userRole", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;)Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListEffect$NavigateToPoolDetails;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPoolId", "getPoolCreatorAccountId", "Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;", "getUserRole"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPoolDetails extends com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect {
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
            if (!(other instanceof com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect.NavigateToPoolDetails)) {
                return false;
            }
            com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect.NavigateToPoolDetails navigateToPoolDetails = (com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect.NavigateToPoolDetails) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.poolId, navigateToPoolDetails.poolId) && kotlin.jvm.internal.Intrinsics.areEqual(this.poolCreatorAccountId, navigateToPoolDetails.poolCreatorAccountId) && this.userRole == navigateToPoolDetails.userRole;
        }

        public final com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect.NavigateToPoolDetails copy(java.lang.String poolId, java.lang.String poolCreatorAccountId, com.paypal.oslo.feature.pools.domain.models.PoolUserRole userRole) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolCreatorAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userRole, "");
            return new com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect.NavigateToPoolDetails(poolId, poolCreatorAccountId, userRole);
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

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect.NavigateToPoolDetails copy$default(com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect.NavigateToPoolDetails navigateToPoolDetails, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.pools.domain.models.PoolUserRole poolUserRole, int i, java.lang.Object obj) {
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

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListEffect$NavigateToError;", "Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListEffect;", "Lcom/paypal/oslo/feature/pools/shared/ui/error/ErrorNavArgs;", "errorNavArgs", "<init>", "(Lcom/paypal/oslo/feature/pools/shared/ui/error/ErrorNavArgs;)V", "component1", "()Lcom/paypal/oslo/feature/pools/shared/ui/error/ErrorNavArgs;", "copy", "(Lcom/paypal/oslo/feature/pools/shared/ui/error/ErrorNavArgs;)Lcom/paypal/oslo/feature/pools/ui/poolslist/PoolsListEffect$NavigateToError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/pools/shared/ui/error/ErrorNavArgs;", "getErrorNavArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToError extends com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs errorNavArgs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToError(com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs errorNavArgs) {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.EffectNames.EFFECT_NAVIGATE_TO_ERROR, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorNavArgs, "");
            this.errorNavArgs = errorNavArgs;
        }

        public final com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs getErrorNavArgs() {
            return this.errorNavArgs;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs errorNavArgs = this.errorNavArgs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToError(errorNavArgs=");
            sb.append(errorNavArgs);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorNavArgs.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect.NavigateToError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorNavArgs, ((com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect.NavigateToError) other).errorNavArgs);
        }

        public final com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect.NavigateToError copy(com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs errorNavArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorNavArgs, "");
            return new com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect.NavigateToError(errorNavArgs);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs getErrorNavArgs() {
            return this.errorNavArgs;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect.NavigateToError copy$default(com.paypal.oslo.feature.pools.ui.poolslist.PoolsListEffect.NavigateToError navigateToError, com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs errorNavArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                errorNavArgs = navigateToError.errorNavArgs;
            }
            return navigateToError.copy(errorNavArgs);
        }
    }

    public /* synthetic */ PoolsListEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
