package com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Awaiting", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState$Awaiting;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState$Initial;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class RequestPhysicalCardState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private RequestPhysicalCardState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState$Initial;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Initial INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Initial();

        public final int hashCode() {
            return 523231282;
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
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState$Awaiting;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/AwaitingData;", "awaitingData", "", "isRefreshRequired", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/AwaitingData;Z)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/AwaitingData;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/AwaitingData;Z)Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState$Awaiting;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/AwaitingData;", "getAwaitingData", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Awaiting extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.AwaitingData awaitingData;
        private final boolean isRefreshRequired;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Awaiting(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.AwaitingData awaitingData, boolean z) {
            super("Awaiting", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(awaitingData, "");
            this.awaitingData = awaitingData;
            this.isRefreshRequired = z;
        }

        public /* synthetic */ Awaiting(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.AwaitingData awaitingData, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(awaitingData, (i & 2) != 0 ? false : z);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.AwaitingData getAwaitingData() {
            return this.awaitingData;
        }

        public final boolean isRefreshRequired() {
            return this.isRefreshRequired;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.AwaitingData awaitingData = this.awaitingData;
            boolean z = this.isRefreshRequired;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Awaiting(awaitingData=");
            sb.append(awaitingData);
            sb.append(", isRefreshRequired=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.awaitingData.hashCode() * 31) + java.lang.Boolean.hashCode(this.isRefreshRequired);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Awaiting)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Awaiting awaiting = (com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Awaiting) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.awaitingData, awaiting.awaitingData) && this.isRefreshRequired == awaiting.isRefreshRequired;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Awaiting copy(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.AwaitingData awaitingData, boolean isRefreshRequired) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(awaitingData, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Awaiting(awaitingData, isRefreshRequired);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsRefreshRequired() {
            return this.isRefreshRequired;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.AwaitingData getAwaitingData() {
            return this.awaitingData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Awaiting copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Awaiting awaiting, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.AwaitingData awaitingData, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                awaitingData = awaiting.awaitingData;
            }
            if ((i & 2) != 0) {
                z = awaiting.isRefreshRequired;
            }
            return awaiting.copy(awaitingData, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u0006\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState;", "", "cardId", "addressId", "", "isRefreshRequired", "", "retryCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;ZI)Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState$Loading;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getCardId", "getAddressId", "Z", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState {
        public static final int $stable = 0;
        private final java.lang.String addressId;
        private final java.lang.String cardId;
        private final boolean isRefreshRequired;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(java.lang.String str, java.lang.String str2, boolean z, int i) {
            super("Loading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.cardId = str;
            this.addressId = str2;
            this.isRefreshRequired = z;
            this.retryCount = i;
        }

        public /* synthetic */ Loading(java.lang.String str, java.lang.String str2, boolean z, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 0 : i);
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final java.lang.String getAddressId() {
            return this.addressId;
        }

        public final boolean isRefreshRequired() {
            return this.isRefreshRequired;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardId;
            java.lang.String str2 = this.addressId;
            boolean z = this.isRefreshRequired;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(cardId=");
            sb.append(str);
            sb.append(", addressId=");
            sb.append(str2);
            sb.append(", isRefreshRequired=");
            sb.append(z);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.cardId.hashCode() * 31) + this.addressId.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isRefreshRequired)) * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Loading)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Loading loading = (com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Loading) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, loading.cardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressId, loading.addressId) && this.isRefreshRequired == loading.isRefreshRequired && this.retryCount == loading.retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Loading copy(java.lang.String cardId, java.lang.String addressId, boolean isRefreshRequired, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressId, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Loading(cardId, addressId, isRefreshRequired, retryCount);
        }

        /* renamed from: component4, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsRefreshRequired() {
            return this.isRefreshRequired;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAddressId() {
            return this.addressId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Loading copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Loading loading, java.lang.String str, java.lang.String str2, boolean z, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = loading.cardId;
            }
            if ((i2 & 2) != 0) {
                str2 = loading.addressId;
            }
            if ((i2 & 4) != 0) {
                z = loading.isRefreshRequired;
            }
            if ((i2 & 8) != 0) {
                i = loading.retryCount;
            }
            return loading.copy(str, str2, z, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState$Success;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState;", "", "estimatedDeliveryDate", "", "isRefreshRequired", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEstimatedDeliveryDate", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState {
        public static final int $stable = 0;
        private final java.lang.String estimatedDeliveryDate;
        private final boolean isRefreshRequired;

        public Success(java.lang.String str, boolean z) {
            super("Success", null);
            this.estimatedDeliveryDate = str;
            this.isRefreshRequired = z;
        }

        public /* synthetic */ Success(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z);
        }

        public final java.lang.String getEstimatedDeliveryDate() {
            return this.estimatedDeliveryDate;
        }

        public final boolean isRefreshRequired() {
            return this.isRefreshRequired;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.estimatedDeliveryDate;
            boolean z = this.isRefreshRequired;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(estimatedDeliveryDate=");
            sb.append(str);
            sb.append(", isRefreshRequired=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.estimatedDeliveryDate;
            return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isRefreshRequired);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Success success = (com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.estimatedDeliveryDate, success.estimatedDeliveryDate) && this.isRefreshRequired == success.isRefreshRequired;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Success copy(java.lang.String estimatedDeliveryDate, boolean isRefreshRequired) {
            return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Success(estimatedDeliveryDate, isRefreshRequired);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsRefreshRequired() {
            return this.isRefreshRequired;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getEstimatedDeliveryDate() {
            return this.estimatedDeliveryDate;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Success copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Success success, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = success.estimatedDeliveryDate;
            }
            if ((i & 2) != 0) {
                z = success.isRefreshRequired;
            }
            return success.copy(str, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b\b\u0010\u0013R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState$Error;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState;", "", "cardId", "addressId", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "isRefreshRequired", "", "retryCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;ZI)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component4", "()Z", "component5", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;ZI)Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardState$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getCardId", "getAddressId", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", "Z", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState {
        public static final int $stable = 0;
        private final java.lang.String addressId;
        private final java.lang.String cardId;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;
        private final boolean isRefreshRequired;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, boolean z, int i) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            this.cardId = str;
            this.addressId = str2;
            this.errorType = debitErrorType;
            this.isRefreshRequired = z;
            this.retryCount = i;
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, boolean z, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, debitErrorType, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? 0 : i);
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final java.lang.String getAddressId() {
            return this.addressId;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final boolean isRefreshRequired() {
            return this.isRefreshRequired;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardId;
            java.lang.String str2 = this.addressId;
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            boolean z = this.isRefreshRequired;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(cardId=");
            sb.append(str);
            sb.append(", addressId=");
            sb.append(str2);
            sb.append(", errorType=");
            sb.append(debitErrorType);
            sb.append(", isRefreshRequired=");
            sb.append(z);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.cardId.hashCode() * 31) + this.addressId.hashCode()) * 31) + this.errorType.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isRefreshRequired)) * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, error.cardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressId, error.addressId) && this.errorType == error.errorType && this.isRefreshRequired == error.isRefreshRequired && this.retryCount == error.retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Error copy(java.lang.String cardId, java.lang.String addressId, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, boolean isRefreshRequired, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Error(cardId, addressId, errorType, isRefreshRequired, retryCount);
        }

        /* renamed from: component5, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsRefreshRequired() {
            return this.isRefreshRequired;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAddressId() {
            return this.addressId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Error copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardState.Error error, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, boolean z, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = error.cardId;
            }
            if ((i2 & 2) != 0) {
                str2 = error.addressId;
            }
            java.lang.String str3 = str2;
            if ((i2 & 4) != 0) {
                debitErrorType = error.errorType;
            }
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType2 = debitErrorType;
            if ((i2 & 8) != 0) {
                z = error.isRefreshRequired;
            }
            boolean z2 = z;
            if ((i2 & 16) != 0) {
                i = error.retryCount;
            }
            return error.copy(str, str3, debitErrorType2, z2, i);
        }
    }

    public /* synthetic */ RequestPhysicalCardState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
