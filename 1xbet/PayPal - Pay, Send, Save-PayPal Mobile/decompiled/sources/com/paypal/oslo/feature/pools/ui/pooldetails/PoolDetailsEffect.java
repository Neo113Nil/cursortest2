package com.paypal.oslo.feature.pools.ui.pooldetails;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000b"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", com.paypal.oslo.feature.pools.constants.PoolsConstants.EffectNames.EFFECT_NAVIGATE_TO_ERROR, "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsEffect$NavigateToError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PoolDetailsEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PoolDetailsEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsEffect$NavigateToError;", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsEffect;", "Lcom/paypal/oslo/feature/pools/shared/ui/error/ErrorNavArgs;", "errorNavArgs", "<init>", "(Lcom/paypal/oslo/feature/pools/shared/ui/error/ErrorNavArgs;)V", "component1", "()Lcom/paypal/oslo/feature/pools/shared/ui/error/ErrorNavArgs;", "copy", "(Lcom/paypal/oslo/feature/pools/shared/ui/error/ErrorNavArgs;)Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsEffect$NavigateToError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/pools/shared/ui/error/ErrorNavArgs;", "getErrorNavArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToError extends com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs errorNavArgs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToError(com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs errorNavArgs) {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.EffectNames.EFFECT_POOL_DETAILS_NAVIGATE_TO_ERROR, null);
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
            return (other instanceof com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsEffect.NavigateToError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorNavArgs, ((com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsEffect.NavigateToError) other).errorNavArgs);
        }

        public final com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsEffect.NavigateToError copy(com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs errorNavArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorNavArgs, "");
            return new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsEffect.NavigateToError(errorNavArgs);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs getErrorNavArgs() {
            return this.errorNavArgs;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsEffect.NavigateToError copy$default(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsEffect.NavigateToError navigateToError, com.paypal.oslo.feature.pools.shared.ui.error.ErrorNavArgs errorNavArgs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                errorNavArgs = navigateToError.errorNavArgs;
            }
            return navigateToError.copy(errorNavArgs);
        }
    }

    public /* synthetic */ PoolDetailsEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
