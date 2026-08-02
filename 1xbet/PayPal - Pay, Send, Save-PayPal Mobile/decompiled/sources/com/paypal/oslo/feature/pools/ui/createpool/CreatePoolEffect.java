package com.paypal.oslo.feature.pools.ui.createpool;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateToPoolDetails", "ShowErrorSnackbar", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolEffect$NavigateToPoolDetails;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolEffect$ShowErrorSnackbar;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CreatePoolEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CreatePoolEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolEffect$NavigateToPoolDetails;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolEffect;", "", "poolId", "poolCreatorAccountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolEffect$NavigateToPoolDetails;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPoolId", "getPoolCreatorAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPoolDetails extends com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect {
        public static final int $stable = 0;
        private final java.lang.String poolCreatorAccountId;
        private final java.lang.String poolId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToPoolDetails(java.lang.String str, java.lang.String str2) {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.EffectNames.EFFECT_CREATE_POOL_NAVIGATE_TO_POOL_DETAILS, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.poolId = str;
            this.poolCreatorAccountId = str2;
        }

        public final java.lang.String getPoolId() {
            return this.poolId;
        }

        public final java.lang.String getPoolCreatorAccountId() {
            return this.poolCreatorAccountId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.poolId;
            java.lang.String str2 = this.poolCreatorAccountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToPoolDetails(poolId=");
            sb.append(str);
            sb.append(", poolCreatorAccountId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.poolId.hashCode() * 31) + this.poolCreatorAccountId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect.NavigateToPoolDetails)) {
                return false;
            }
            com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect.NavigateToPoolDetails navigateToPoolDetails = (com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect.NavigateToPoolDetails) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.poolId, navigateToPoolDetails.poolId) && kotlin.jvm.internal.Intrinsics.areEqual(this.poolCreatorAccountId, navigateToPoolDetails.poolCreatorAccountId);
        }

        public final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect.NavigateToPoolDetails copy(java.lang.String poolId, java.lang.String poolCreatorAccountId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolCreatorAccountId, "");
            return new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect.NavigateToPoolDetails(poolId, poolCreatorAccountId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPoolCreatorAccountId() {
            return this.poolCreatorAccountId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPoolId() {
            return this.poolId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect.NavigateToPoolDetails copy$default(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect.NavigateToPoolDetails navigateToPoolDetails, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToPoolDetails.poolId;
            }
            if ((i & 2) != 0) {
                str2 = navigateToPoolDetails.poolCreatorAccountId;
            }
            return navigateToPoolDetails.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolEffect$ShowErrorSnackbar;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolEffect;", "", "titleRes", "descriptionRes", "<init>", "(ILjava/lang/Integer;)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "copy", "(ILjava/lang/Integer;)Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolEffect$ShowErrorSnackbar;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTitleRes", "Ljava/lang/Integer;", "getDescriptionRes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowErrorSnackbar extends com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect {
        public static final int $stable = 0;
        private final java.lang.Integer descriptionRes;
        private final int titleRes;

        public ShowErrorSnackbar(int i, java.lang.Integer num) {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.EffectNames.EFFECT_CREATE_POOL_SHOW_ERROR_SNACKBAR, null);
            this.titleRes = i;
            this.descriptionRes = num;
        }

        public /* synthetic */ ShowErrorSnackbar(int i, java.lang.Integer num, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : num);
        }

        public final int getTitleRes() {
            return this.titleRes;
        }

        public final java.lang.Integer getDescriptionRes() {
            return this.descriptionRes;
        }

        public final java.lang.String toString() {
            int i = this.titleRes;
            java.lang.Integer num = this.descriptionRes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowErrorSnackbar(titleRes=");
            sb.append(i);
            sb.append(", descriptionRes=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.titleRes);
            java.lang.Integer num = this.descriptionRes;
            return (hashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect.ShowErrorSnackbar)) {
                return false;
            }
            com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect.ShowErrorSnackbar showErrorSnackbar = (com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect.ShowErrorSnackbar) other;
            return this.titleRes == showErrorSnackbar.titleRes && kotlin.jvm.internal.Intrinsics.areEqual(this.descriptionRes, showErrorSnackbar.descriptionRes);
        }

        public final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect.ShowErrorSnackbar copy(int titleRes, java.lang.Integer descriptionRes) {
            return new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect.ShowErrorSnackbar(titleRes, descriptionRes);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getDescriptionRes() {
            return this.descriptionRes;
        }

        /* renamed from: component1, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect.ShowErrorSnackbar copy$default(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolEffect.ShowErrorSnackbar showErrorSnackbar, int i, java.lang.Integer num, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = showErrorSnackbar.titleRes;
            }
            if ((i2 & 2) != 0) {
                num = showErrorSnackbar.descriptionRes;
            }
            return showErrorSnackbar.copy(i, num);
        }
    }

    public /* synthetic */ CreatePoolEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
