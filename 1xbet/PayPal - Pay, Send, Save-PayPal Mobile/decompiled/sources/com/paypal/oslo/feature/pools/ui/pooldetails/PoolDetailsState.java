package com.paypal.oslo.feature.pools.ui.pooldetails;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsState$Error;", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsState$Initial;", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsState$Loading;", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PoolDetailsState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsState$Initial;", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Initial INSTANCE = new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Initial();

        public final int hashCode() {
            return 572615099;
        }

        private Initial() {
            super("Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Initial)) {
                return false;
            }
            return true;
        }
    }

    private PoolDetailsState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsState$Loading;", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Loading INSTANCE = new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Loading();

        public final int hashCode() {
            return -1039076429;
        }

        private Loading() {
            super("Loading", null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsState$Success;", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsState;", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "poolDetails", "<init>", "(Lcom/paypal/oslo/feature/pools/domain/models/Pool;)V", "component1", "()Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "copy", "(Lcom/paypal/oslo/feature/pools/domain/models/Pool;)Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "getPoolDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.pools.domain.models.Pool poolDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.pools.domain.models.Pool pool) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pool, "");
            this.poolDetails = pool;
        }

        public final com.paypal.oslo.feature.pools.domain.models.Pool getPoolDetails() {
            return this.poolDetails;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.pools.domain.models.Pool pool = this.poolDetails;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(poolDetails=");
            sb.append(pool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.poolDetails.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.poolDetails, ((com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Success) other).poolDetails);
        }

        public final com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Success copy(com.paypal.oslo.feature.pools.domain.models.Pool poolDetails) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolDetails, "");
            return new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Success(poolDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.pools.domain.models.Pool getPoolDetails() {
            return this.poolDetails;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Success copy$default(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Success success, com.paypal.oslo.feature.pools.domain.models.Pool pool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                pool = success.poolDetails;
            }
            return success.copy(pool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsState$Error;", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsState;", "", "titleRes", "descriptionRes", "", "poolId", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/String;", "copy", "(ILjava/lang/Integer;Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getTitleRes", "Ljava/lang/Integer;", "getDescriptionRes", "Ljava/lang/String;", "getPoolId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState {
        public static final int $stable = 0;
        private final java.lang.Integer descriptionRes;
        private final java.lang.String poolId;
        private final int titleRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(int i, java.lang.Integer num, java.lang.String str) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.titleRes = i;
            this.descriptionRes = num;
            this.poolId = str;
        }

        public /* synthetic */ Error(int i, java.lang.Integer num, java.lang.String str, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : num, str);
        }

        public final int getTitleRes() {
            return this.titleRes;
        }

        public final java.lang.Integer getDescriptionRes() {
            return this.descriptionRes;
        }

        public final java.lang.String getPoolId() {
            return this.poolId;
        }

        public final java.lang.String toString() {
            int i = this.titleRes;
            java.lang.Integer num = this.descriptionRes;
            java.lang.String str = this.poolId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(titleRes=");
            sb.append(i);
            sb.append(", descriptionRes=");
            sb.append(num);
            sb.append(", poolId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.titleRes);
            java.lang.Integer num = this.descriptionRes;
            return (((hashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.poolId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Error error = (com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Error) other;
            return this.titleRes == error.titleRes && kotlin.jvm.internal.Intrinsics.areEqual(this.descriptionRes, error.descriptionRes) && kotlin.jvm.internal.Intrinsics.areEqual(this.poolId, error.poolId);
        }

        public final com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Error copy(int titleRes, java.lang.Integer descriptionRes, java.lang.String poolId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolId, "");
            return new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Error(titleRes, descriptionRes, poolId);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPoolId() {
            return this.poolId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getDescriptionRes() {
            return this.descriptionRes;
        }

        /* renamed from: component1, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Error copy$default(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Error error, int i, java.lang.Integer num, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = error.titleRes;
            }
            if ((i2 & 2) != 0) {
                num = error.descriptionRes;
            }
            if ((i2 & 4) != 0) {
                str = error.poolId;
            }
            return error.copy(i, num, str);
        }
    }

    public /* synthetic */ PoolDetailsState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
