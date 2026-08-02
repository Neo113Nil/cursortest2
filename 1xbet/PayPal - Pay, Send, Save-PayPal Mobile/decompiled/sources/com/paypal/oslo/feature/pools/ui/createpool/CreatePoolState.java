package com.paypal.oslo.feature.pools.ui.createpool;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", com.paypal.oslo.feature.pools.constants.PoolsConstants.StateNames.STATE_EDITING, "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Editing;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Error;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Loading;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CreatePoolState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CreatePoolState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJH\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b#\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Editing;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState;", "", "poolName", "poolDescription", "backgroundImageUrl", "Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "targetAmount", "targetDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;Ljava/lang/String;)Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Editing;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPoolName", "getPoolDescription", "getBackgroundImageUrl", "Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "getTargetAmount", "getTargetDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Editing extends com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState {
        public static final int $stable = 0;
        private final java.lang.String backgroundImageUrl;
        private final java.lang.String poolDescription;
        private final java.lang.String poolName;
        private final com.paypal.oslo.feature.pools.domain.models.PoolAmount targetAmount;
        private final java.lang.String targetDate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Editing(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount, java.lang.String str4) {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.StateNames.STATE_EDITING, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.poolName = str;
            this.poolDescription = str2;
            this.backgroundImageUrl = str3;
            this.targetAmount = poolAmount;
            this.targetDate = str4;
        }

        public /* synthetic */ Editing(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : poolAmount, (i & 16) != 0 ? null : str4);
        }

        public final java.lang.String getPoolName() {
            return this.poolName;
        }

        public final java.lang.String getPoolDescription() {
            return this.poolDescription;
        }

        public final java.lang.String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        public final com.paypal.oslo.feature.pools.domain.models.PoolAmount getTargetAmount() {
            return this.targetAmount;
        }

        public final java.lang.String getTargetDate() {
            return this.targetDate;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.poolName;
            java.lang.String str2 = this.poolDescription;
            java.lang.String str3 = this.backgroundImageUrl;
            com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount = this.targetAmount;
            java.lang.String str4 = this.targetDate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Editing(poolName=");
            sb.append(str);
            sb.append(", poolDescription=");
            sb.append(str2);
            sb.append(", backgroundImageUrl=");
            sb.append(str3);
            sb.append(", targetAmount=");
            sb.append(poolAmount);
            sb.append(", targetDate=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.poolName.hashCode();
            int hashCode2 = this.poolDescription.hashCode();
            java.lang.String str = this.backgroundImageUrl;
            int hashCode3 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount = this.targetAmount;
            int hashCode4 = poolAmount == null ? 0 : poolAmount.hashCode();
            java.lang.String str2 = this.targetDate;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing)) {
                return false;
            }
            com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing editing = (com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.poolName, editing.poolName) && kotlin.jvm.internal.Intrinsics.areEqual(this.poolDescription, editing.poolDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.backgroundImageUrl, editing.backgroundImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetAmount, editing.targetAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetDate, editing.targetDate);
        }

        public final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing copy(java.lang.String poolName, java.lang.String poolDescription, java.lang.String backgroundImageUrl, com.paypal.oslo.feature.pools.domain.models.PoolAmount targetAmount, java.lang.String targetDate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolDescription, "");
            return new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing(poolName, poolDescription, backgroundImageUrl, targetAmount, targetDate);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getTargetDate() {
            return this.targetDate;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.pools.domain.models.PoolAmount getTargetAmount() {
            return this.targetAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPoolDescription() {
            return this.poolDescription;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPoolName() {
            return this.poolName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing copy$default(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing editing, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = editing.poolName;
            }
            if ((i & 2) != 0) {
                str2 = editing.poolDescription;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                str3 = editing.backgroundImageUrl;
            }
            java.lang.String str6 = str3;
            if ((i & 8) != 0) {
                poolAmount = editing.targetAmount;
            }
            com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount2 = poolAmount;
            if ((i & 16) != 0) {
                str4 = editing.targetDate;
            }
            return editing.copy(str, str5, str6, poolAmount2, str4);
        }

        public Editing() {
            this(null, null, null, null, null, 31, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Loading;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Editing;", "formState", "<init>", "(Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Editing;)V", "component1", "()Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Editing;", "copy", "(Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Editing;)Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Editing;", "getFormState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing formState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing editing) {
            super("Loading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editing, "");
            this.formState = editing;
        }

        public final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing getFormState() {
            return this.formState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing editing = this.formState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(formState=");
            sb.append(editing);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.formState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.formState, ((com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Loading) other).formState);
        }

        public final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Loading copy(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing formState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formState, "");
            return new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Loading(formState);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing getFormState() {
            return this.formState;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Loading copy$default(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Loading loading, com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing editing, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                editing = loading.formState;
            }
            return loading.copy(editing);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Success;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState;", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "pool", "<init>", "(Lcom/paypal/oslo/feature/pools/domain/models/Pool;)V", "component1", "()Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "copy", "(Lcom/paypal/oslo/feature/pools/domain/models/Pool;)Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "getPool"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.pools.domain.models.Pool pool;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.pools.domain.models.Pool pool) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pool, "");
            this.pool = pool;
        }

        public final com.paypal.oslo.feature.pools.domain.models.Pool getPool() {
            return this.pool;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.pools.domain.models.Pool pool = this.pool;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(pool=");
            sb.append(pool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.pool.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.pool, ((com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Success) other).pool);
        }

        public final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Success copy(com.paypal.oslo.feature.pools.domain.models.Pool pool) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pool, "");
            return new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Success(pool);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.pools.domain.models.Pool getPool() {
            return this.pool;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Success copy$default(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Success success, com.paypal.oslo.feature.pools.domain.models.Pool pool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                pool = success.pool;
            }
            return success.copy(pool);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Error;", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState;", "", "titleRes", "descriptionRes", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Editing;", "formState", "<init>", "(ILjava/lang/Integer;Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Editing;)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "()Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Editing;", "copy", "(ILjava/lang/Integer;Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Editing;)Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTitleRes", "Ljava/lang/Integer;", "getDescriptionRes", "Lcom/paypal/oslo/feature/pools/ui/createpool/CreatePoolState$Editing;", "getFormState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState {
        public static final int $stable = 0;
        private final java.lang.Integer descriptionRes;
        private final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing formState;
        private final int titleRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(int i, java.lang.Integer num, com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing editing) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editing, "");
            this.titleRes = i;
            this.descriptionRes = num;
            this.formState = editing;
        }

        public /* synthetic */ Error(int i, java.lang.Integer num, com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing editing, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : num, editing);
        }

        public final int getTitleRes() {
            return this.titleRes;
        }

        public final java.lang.Integer getDescriptionRes() {
            return this.descriptionRes;
        }

        public final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing getFormState() {
            return this.formState;
        }

        public final java.lang.String toString() {
            int i = this.titleRes;
            java.lang.Integer num = this.descriptionRes;
            com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing editing = this.formState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(titleRes=");
            sb.append(i);
            sb.append(", descriptionRes=");
            sb.append(num);
            sb.append(", formState=");
            sb.append(editing);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.titleRes);
            java.lang.Integer num = this.descriptionRes;
            return (((hashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.formState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Error error = (com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Error) other;
            return this.titleRes == error.titleRes && kotlin.jvm.internal.Intrinsics.areEqual(this.descriptionRes, error.descriptionRes) && kotlin.jvm.internal.Intrinsics.areEqual(this.formState, error.formState);
        }

        public final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Error copy(int titleRes, java.lang.Integer descriptionRes, com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing formState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formState, "");
            return new com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Error(titleRes, descriptionRes, formState);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing getFormState() {
            return this.formState;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getDescriptionRes() {
            return this.descriptionRes;
        }

        /* renamed from: component1, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Error copy$default(com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Error error, int i, java.lang.Integer num, com.paypal.oslo.feature.pools.ui.createpool.CreatePoolState.Editing editing, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = error.titleRes;
            }
            if ((i2 & 2) != 0) {
                num = error.descriptionRes;
            }
            if ((i2 & 4) != 0) {
                editing = error.formState;
            }
            return error.copy(i, num, editing);
        }
    }

    public /* synthetic */ CreatePoolState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
