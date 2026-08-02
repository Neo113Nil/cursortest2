package com.paypal.oslo.feature.pools.shared.ui.error;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\tJ0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/pools/shared/ui/error/PoolUiError;", "", "", "titleRes", "descriptionRes", "primaryButtonRes", "<init>", "(ILjava/lang/Integer;I)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "copy", "(ILjava/lang/Integer;I)Lcom/paypal/oslo/feature/pools/shared/ui/error/PoolUiError;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTitleRes", "Ljava/lang/Integer;", "getDescriptionRes", "getPrimaryButtonRes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PoolUiError {
    public static final int $stable = 0;
    private final java.lang.Integer descriptionRes;
    private final int primaryButtonRes;
    private final int titleRes;

    public PoolUiError(int i, java.lang.Integer num, int i2) {
        this.titleRes = i;
        this.descriptionRes = num;
        this.primaryButtonRes = i2;
    }

    public /* synthetic */ PoolUiError(int i, java.lang.Integer num, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PoolUiError(titleRes=");
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
        if (!(other instanceof com.paypal.oslo.feature.pools.shared.ui.error.PoolUiError)) {
            return false;
        }
        com.paypal.oslo.feature.pools.shared.ui.error.PoolUiError poolUiError = (com.paypal.oslo.feature.pools.shared.ui.error.PoolUiError) other;
        return this.titleRes == poolUiError.titleRes && kotlin.jvm.internal.Intrinsics.areEqual(this.descriptionRes, poolUiError.descriptionRes) && this.primaryButtonRes == poolUiError.primaryButtonRes;
    }

    public final com.paypal.oslo.feature.pools.shared.ui.error.PoolUiError copy(int titleRes, java.lang.Integer descriptionRes, int primaryButtonRes) {
        return new com.paypal.oslo.feature.pools.shared.ui.error.PoolUiError(titleRes, descriptionRes, primaryButtonRes);
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

    public static /* synthetic */ com.paypal.oslo.feature.pools.shared.ui.error.PoolUiError copy$default(com.paypal.oslo.feature.pools.shared.ui.error.PoolUiError poolUiError, int i, java.lang.Integer num, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = poolUiError.titleRes;
        }
        if ((i3 & 2) != 0) {
            num = poolUiError.descriptionRes;
        }
        if ((i3 & 4) != 0) {
            i2 = poolUiError.primaryButtonRes;
        }
        return poolUiError.copy(i, num, i2);
    }
}
