package com.paypal.oslo.feature.pools.ui.pooldetails;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsIntent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_POOL_DETAILS_LOADED, "Error", "RetryRequested", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsIntent$Error;", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsIntent$Initialize;", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsIntent$PoolDetailsLoaded;", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsIntent$RetryRequested;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PoolDetailsIntent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PoolDetailsIntent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsIntent$Initialize;", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsIntent;", "", "poolId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsIntent$Initialize;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPoolId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent {
        public static final int $stable = 0;
        private final java.lang.String poolId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialize(java.lang.String str) {
            super("Initialize", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.poolId = str;
        }

        public final java.lang.String getPoolId() {
            return this.poolId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.poolId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(poolId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.poolId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.Initialize) && kotlin.jvm.internal.Intrinsics.areEqual(this.poolId, ((com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.Initialize) other).poolId);
        }

        public final com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.Initialize copy(java.lang.String poolId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolId, "");
            return new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.Initialize(poolId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPoolId() {
            return this.poolId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.Initialize copy$default(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.Initialize initialize, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initialize.poolId;
            }
            return initialize.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsIntent$PoolDetailsLoaded;", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsIntent;", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "poolDetail", "<init>", "(Lcom/paypal/oslo/feature/pools/domain/models/Pool;)V", "component1", "()Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "copy", "(Lcom/paypal/oslo/feature/pools/domain/models/Pool;)Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsIntent$PoolDetailsLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "getPoolDetail"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PoolDetailsLoaded extends com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.pools.domain.models.Pool poolDetail;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PoolDetailsLoaded(com.paypal.oslo.feature.pools.domain.models.Pool pool) {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_POOL_DETAILS_LOADED, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pool, "");
            this.poolDetail = pool;
        }

        public final com.paypal.oslo.feature.pools.domain.models.Pool getPoolDetail() {
            return this.poolDetail;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.pools.domain.models.Pool pool = this.poolDetail;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PoolDetailsLoaded(poolDetail=");
            sb.append(pool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.poolDetail.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.PoolDetailsLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.poolDetail, ((com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.PoolDetailsLoaded) other).poolDetail);
        }

        public final com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.PoolDetailsLoaded copy(com.paypal.oslo.feature.pools.domain.models.Pool poolDetail) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolDetail, "");
            return new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.PoolDetailsLoaded(poolDetail);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.pools.domain.models.Pool getPoolDetail() {
            return this.poolDetail;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.PoolDetailsLoaded copy$default(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.PoolDetailsLoaded poolDetailsLoaded, com.paypal.oslo.feature.pools.domain.models.Pool pool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                pool = poolDetailsLoaded.poolDetail;
            }
            return poolDetailsLoaded.copy(pool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bJ\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsIntent$Error;", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsIntent;", "", "titleRes", "descriptionRes", "primaryButtonRes", "", "poolId", "<init>", "(ILjava/lang/Integer;ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Ljava/lang/String;", "copy", "(ILjava/lang/Integer;ILjava/lang/String;)Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsIntent$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getTitleRes", "Ljava/lang/Integer;", "getDescriptionRes", "getPrimaryButtonRes", "Ljava/lang/String;", "getPoolId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent {
        public static final int $stable = 0;
        private final java.lang.Integer descriptionRes;
        private final java.lang.String poolId;
        private final int primaryButtonRes;
        private final int titleRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(int i, java.lang.Integer num, int i2, java.lang.String str) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.titleRes = i;
            this.descriptionRes = num;
            this.primaryButtonRes = i2;
            this.poolId = str;
        }

        public /* synthetic */ Error(int i, java.lang.Integer num, int i2, java.lang.String str, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? null : num, i2, str);
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

        public final java.lang.String getPoolId() {
            return this.poolId;
        }

        public final java.lang.String toString() {
            int i = this.titleRes;
            java.lang.Integer num = this.descriptionRes;
            int i2 = this.primaryButtonRes;
            java.lang.String str = this.poolId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(titleRes=");
            sb.append(i);
            sb.append(", descriptionRes=");
            sb.append(num);
            sb.append(", primaryButtonRes=");
            sb.append(i2);
            sb.append(", poolId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.titleRes);
            java.lang.Integer num = this.descriptionRes;
            return (((((hashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + java.lang.Integer.hashCode(this.primaryButtonRes)) * 31) + this.poolId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.Error)) {
                return false;
            }
            com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.Error error = (com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.Error) other;
            return this.titleRes == error.titleRes && kotlin.jvm.internal.Intrinsics.areEqual(this.descriptionRes, error.descriptionRes) && this.primaryButtonRes == error.primaryButtonRes && kotlin.jvm.internal.Intrinsics.areEqual(this.poolId, error.poolId);
        }

        public final com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.Error copy(int titleRes, java.lang.Integer descriptionRes, int primaryButtonRes, java.lang.String poolId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolId, "");
            return new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.Error(titleRes, descriptionRes, primaryButtonRes, poolId);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getPoolId() {
            return this.poolId;
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

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.Error copy$default(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.Error error, int i, java.lang.Integer num, int i2, java.lang.String str, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = error.titleRes;
            }
            if ((i3 & 2) != 0) {
                num = error.descriptionRes;
            }
            if ((i3 & 4) != 0) {
                i2 = error.primaryButtonRes;
            }
            if ((i3 & 8) != 0) {
                str = error.poolId;
            }
            return error.copy(i, num, i2, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsIntent$RetryRequested;", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsIntent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryRequested extends com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.RetryRequested INSTANCE = new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.RetryRequested();

        public final int hashCode() {
            return 1983891020;
        }

        private RetryRequested() {
            super("RetryRequested", null);
        }

        public final java.lang.String toString() {
            return "RetryRequested";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.RetryRequested)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PoolDetailsIntent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
