package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", "WalletInstrumentsSuccess", "PushProvisioningWidgetSuccess", "WalletInstrumentsError", "PushProvisioningWidgetError", "LockUnlockError", "RemoveWalletError", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$Initial;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$LockUnlockError;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$PushProvisioningWidgetError;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$PushProvisioningWidgetSuccess;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$RemoveWalletError;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$WalletInstrumentsError;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$WalletInstrumentsSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ManageWalletState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ManageWalletState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$Initial;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Initial INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Initial();

        public final int hashCode() {
            return -935340154;
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
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$Loading;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState;", "", "retryCount", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/WidgetStatus;", "widgetStatus", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/LoadingType;", "loadingType", "", "", "provisionedTokenIds", "<init>", "(Ljava/lang/Integer;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/WidgetStatus;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/LoadingType;Ljava/util/Set;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/WidgetStatus;", "component3", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/LoadingType;", "component4", "()Ljava/util/Set;", "copy", "(Ljava/lang/Integer;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/WidgetStatus;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/LoadingType;Ljava/util/Set;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getRetryCount", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/WidgetStatus;", "getWidgetStatus", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/LoadingType;", "getLoadingType", "Ljava/util/Set;", "getProvisionedTokenIds"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType loadingType;
        private final java.util.Set<java.lang.String> provisionedTokenIds;
        private final java.lang.Integer retryCount;
        private final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus widgetStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(java.lang.Integer num, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus widgetStatus, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType loadingType, java.util.Set<java.lang.String> set) {
            super("Loading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(widgetStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadingType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            this.retryCount = num;
            this.widgetStatus = widgetStatus;
            this.loadingType = loadingType;
            this.provisionedTokenIds = set;
        }

        public final java.lang.Integer getRetryCount() {
            return this.retryCount;
        }

        public /* synthetic */ Loading(java.lang.Integer num, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus.Loading loading, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Screen screen, java.util.Set set, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus.Loading.INSTANCE : loading, (i & 4) != 0 ? com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Screen.INSTANCE : screen, (i & 8) != 0 ? kotlin.collections.SetsKt.emptySet() : set);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus getWidgetStatus() {
            return this.widgetStatus;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType getLoadingType() {
            return this.loadingType;
        }

        public final java.util.Set<java.lang.String> getProvisionedTokenIds() {
            return this.provisionedTokenIds;
        }

        public final java.lang.String toString() {
            java.lang.Integer num = this.retryCount;
            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus widgetStatus = this.widgetStatus;
            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType loadingType = this.loadingType;
            java.util.Set<java.lang.String> set = this.provisionedTokenIds;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(retryCount=");
            sb.append(num);
            sb.append(", widgetStatus=");
            sb.append(widgetStatus);
            sb.append(", loadingType=");
            sb.append(loadingType);
            sb.append(", provisionedTokenIds=");
            sb.append(set);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Integer num = this.retryCount;
            return ((((((num == null ? 0 : num.hashCode()) * 31) + this.widgetStatus.hashCode()) * 31) + this.loadingType.hashCode()) * 31) + this.provisionedTokenIds.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading loading = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.retryCount, loading.retryCount) && kotlin.jvm.internal.Intrinsics.areEqual(this.widgetStatus, loading.widgetStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.loadingType, loading.loadingType) && kotlin.jvm.internal.Intrinsics.areEqual(this.provisionedTokenIds, loading.provisionedTokenIds);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading copy(java.lang.Integer retryCount, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus widgetStatus, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType loadingType, java.util.Set<java.lang.String> provisionedTokenIds) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(widgetStatus, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadingType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionedTokenIds, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading(retryCount, widgetStatus, loadingType, provisionedTokenIds);
        }

        public final java.util.Set<java.lang.String> component4() {
            return this.provisionedTokenIds;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType getLoadingType() {
            return this.loadingType;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus getWidgetStatus() {
            return this.widgetStatus;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Integer getRetryCount() {
            return this.retryCount;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading loading, java.lang.Integer num, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus widgetStatus, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType loadingType, java.util.Set set, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = loading.retryCount;
            }
            if ((i & 2) != 0) {
                widgetStatus = loading.widgetStatus;
            }
            if ((i & 4) != 0) {
                loadingType = loading.loadingType;
            }
            if ((i & 8) != 0) {
                set = loading.provisionedTokenIds;
            }
            return loading.copy(num, widgetStatus, loadingType, set);
        }

        public Loading() {
            this(null, null, null, null, 15, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$WalletInstrumentsSuccess;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/managewallet/model/WalletInstrument;", "walletInstruments", "", "", "provisionedTokenIds", "", "retryCount", "<init>", "(Ljava/util/List;Ljava/util/Set;Ljava/lang/Integer;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Set;", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/util/List;Ljava/util/Set;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$WalletInstrumentsSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getWalletInstruments", "Ljava/util/Set;", "getProvisionedTokenIds", "Ljava/lang/Integer;", "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WalletInstrumentsSuccess extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState {
        public static final int $stable = 8;
        private final java.util.Set<java.lang.String> provisionedTokenIds;
        private final java.lang.Integer retryCount;
        private final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> walletInstruments;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WalletInstrumentsSuccess(java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> list, java.util.Set<java.lang.String> set, java.lang.Integer num) {
            super("WalletInstrumentsSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            this.walletInstruments = list;
            this.provisionedTokenIds = set;
            this.retryCount = num;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> getWalletInstruments() {
            return this.walletInstruments;
        }

        public /* synthetic */ WalletInstrumentsSuccess(java.util.List list, java.util.Set set, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? kotlin.collections.SetsKt.emptySet() : set, (i & 4) != 0 ? null : num);
        }

        public final java.util.Set<java.lang.String> getProvisionedTokenIds() {
            return this.provisionedTokenIds;
        }

        public final java.lang.Integer getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> list = this.walletInstruments;
            java.util.Set<java.lang.String> set = this.provisionedTokenIds;
            java.lang.Integer num = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WalletInstrumentsSuccess(walletInstruments=");
            sb.append(list);
            sb.append(", provisionedTokenIds=");
            sb.append(set);
            sb.append(", retryCount=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.walletInstruments.hashCode();
            int hashCode2 = this.provisionedTokenIds.hashCode();
            java.lang.Integer num = this.retryCount;
            return (((hashCode * 31) + hashCode2) * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsSuccess walletInstrumentsSuccess = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.walletInstruments, walletInstrumentsSuccess.walletInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.provisionedTokenIds, walletInstrumentsSuccess.provisionedTokenIds) && kotlin.jvm.internal.Intrinsics.areEqual(this.retryCount, walletInstrumentsSuccess.retryCount);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsSuccess copy(java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> walletInstruments, java.util.Set<java.lang.String> provisionedTokenIds, java.lang.Integer retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletInstruments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionedTokenIds, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsSuccess(walletInstruments, provisionedTokenIds, retryCount);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getRetryCount() {
            return this.retryCount;
        }

        public final java.util.Set<java.lang.String> component2() {
            return this.provisionedTokenIds;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> component1() {
            return this.walletInstruments;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsSuccess copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsSuccess walletInstrumentsSuccess, java.util.List list, java.util.Set set, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = walletInstrumentsSuccess.walletInstruments;
            }
            if ((i & 2) != 0) {
                set = walletInstrumentsSuccess.provisionedTokenIds;
            }
            if ((i & 4) != 0) {
                num = walletInstrumentsSuccess.retryCount;
            }
            return walletInstrumentsSuccess.copy(list, set, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JF\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$PushProvisioningWidgetSuccess;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/managewallet/model/WalletInstrument;", "walletInstruments", "", "", "provisionedTokenIds", "", "retryCount", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/WidgetStatus;", "widgetStatus", "<init>", "(Ljava/util/List;Ljava/util/Set;Ljava/lang/Integer;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/WidgetStatus;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Set;", "component3", "()Ljava/lang/Integer;", "component4", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/WidgetStatus;", "copy", "(Ljava/util/List;Ljava/util/Set;Ljava/lang/Integer;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/WidgetStatus;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$PushProvisioningWidgetSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getWalletInstruments", "Ljava/util/Set;", "getProvisionedTokenIds", "Ljava/lang/Integer;", "getRetryCount", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/WidgetStatus;", "getWidgetStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PushProvisioningWidgetSuccess extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState {
        public static final int $stable = 8;
        private final java.util.Set<java.lang.String> provisionedTokenIds;
        private final java.lang.Integer retryCount;
        private final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> walletInstruments;
        private final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus widgetStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PushProvisioningWidgetSuccess(java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> list, java.util.Set<java.lang.String> set, java.lang.Integer num, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus widgetStatus) {
            super("PushProvisioningWidgetSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(widgetStatus, "");
            this.walletInstruments = list;
            this.provisionedTokenIds = set;
            this.retryCount = num;
            this.widgetStatus = widgetStatus;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> getWalletInstruments() {
            return this.walletInstruments;
        }

        public /* synthetic */ PushProvisioningWidgetSuccess(java.util.List list, java.util.Set set, java.lang.Integer num, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus.Ready ready, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? kotlin.collections.SetsKt.emptySet() : set, (i & 4) != 0 ? null : num, (i & 8) != 0 ? com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus.Ready.INSTANCE : ready);
        }

        public final java.util.Set<java.lang.String> getProvisionedTokenIds() {
            return this.provisionedTokenIds;
        }

        public final java.lang.Integer getRetryCount() {
            return this.retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus getWidgetStatus() {
            return this.widgetStatus;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> list = this.walletInstruments;
            java.util.Set<java.lang.String> set = this.provisionedTokenIds;
            java.lang.Integer num = this.retryCount;
            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus widgetStatus = this.widgetStatus;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PushProvisioningWidgetSuccess(walletInstruments=");
            sb.append(list);
            sb.append(", provisionedTokenIds=");
            sb.append(set);
            sb.append(", retryCount=");
            sb.append(num);
            sb.append(", widgetStatus=");
            sb.append(widgetStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.walletInstruments.hashCode();
            int hashCode2 = this.provisionedTokenIds.hashCode();
            java.lang.Integer num = this.retryCount;
            return (((((hashCode * 31) + hashCode2) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.widgetStatus.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess pushProvisioningWidgetSuccess = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.walletInstruments, pushProvisioningWidgetSuccess.walletInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.provisionedTokenIds, pushProvisioningWidgetSuccess.provisionedTokenIds) && kotlin.jvm.internal.Intrinsics.areEqual(this.retryCount, pushProvisioningWidgetSuccess.retryCount) && kotlin.jvm.internal.Intrinsics.areEqual(this.widgetStatus, pushProvisioningWidgetSuccess.widgetStatus);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess copy(java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> walletInstruments, java.util.Set<java.lang.String> provisionedTokenIds, java.lang.Integer retryCount, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus widgetStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletInstruments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionedTokenIds, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(widgetStatus, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess(walletInstruments, provisionedTokenIds, retryCount, widgetStatus);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus getWidgetStatus() {
            return this.widgetStatus;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getRetryCount() {
            return this.retryCount;
        }

        public final java.util.Set<java.lang.String> component2() {
            return this.provisionedTokenIds;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> component1() {
            return this.walletInstruments;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess pushProvisioningWidgetSuccess, java.util.List list, java.util.Set set, java.lang.Integer num, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus widgetStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = pushProvisioningWidgetSuccess.walletInstruments;
            }
            if ((i & 2) != 0) {
                set = pushProvisioningWidgetSuccess.provisionedTokenIds;
            }
            if ((i & 4) != 0) {
                num = pushProvisioningWidgetSuccess.retryCount;
            }
            if ((i & 8) != 0) {
                widgetStatus = pushProvisioningWidgetSuccess.widgetStatus;
            }
            return pushProvisioningWidgetSuccess.copy(list, set, num, widgetStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$WalletInstrumentsError;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "errorTag", "", "retryCount", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$WalletInstrumentsError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", "Ljava/lang/String;", "getErrorTag", "Ljava/lang/Integer;", "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WalletInstrumentsError extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState {
        public static final int $stable = 0;
        private final java.lang.String errorTag;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;
        private final java.lang.Integer retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WalletInstrumentsError(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, java.lang.Integer num) {
            super("WalletInstrumentsError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorType = debitErrorType;
            this.errorTag = str;
            this.retryCount = num;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public /* synthetic */ WalletInstrumentsError(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(debitErrorType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : num);
        }

        public final java.lang.String getErrorTag() {
            return this.errorTag;
        }

        public final java.lang.Integer getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            java.lang.String str = this.errorTag;
            java.lang.Integer num = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WalletInstrumentsError(errorType=");
            sb.append(debitErrorType);
            sb.append(", errorTag=");
            sb.append(str);
            sb.append(", retryCount=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorType.hashCode();
            int hashCode2 = this.errorTag.hashCode();
            java.lang.Integer num = this.retryCount;
            return (((hashCode * 31) + hashCode2) * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsError)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsError walletInstrumentsError = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsError) other;
            return this.errorType == walletInstrumentsError.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.errorTag, walletInstrumentsError.errorTag) && kotlin.jvm.internal.Intrinsics.areEqual(this.retryCount, walletInstrumentsError.retryCount);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsError copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, java.lang.String errorTag, java.lang.Integer retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTag, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsError(errorType, errorTag, retryCount);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorTag() {
            return this.errorTag;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsError copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsError walletInstrumentsError, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitErrorType = walletInstrumentsError.errorType;
            }
            if ((i & 2) != 0) {
                str = walletInstrumentsError.errorTag;
            }
            if ((i & 4) != 0) {
                num = walletInstrumentsError.retryCount;
            }
            return walletInstrumentsError.copy(debitErrorType, str, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$PushProvisioningWidgetError;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "errorTag", "", "retryCount", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$PushProvisioningWidgetError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", "Ljava/lang/String;", "getErrorTag", "Ljava/lang/Integer;", "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PushProvisioningWidgetError extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState {
        public static final int $stable = 0;
        private final java.lang.String errorTag;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;
        private final java.lang.Integer retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PushProvisioningWidgetError(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, java.lang.Integer num) {
            super("PushProvisioningWidgetError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorType = debitErrorType;
            this.errorTag = str;
            this.retryCount = num;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public /* synthetic */ PushProvisioningWidgetError(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(debitErrorType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : num);
        }

        public final java.lang.String getErrorTag() {
            return this.errorTag;
        }

        public final java.lang.Integer getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            java.lang.String str = this.errorTag;
            java.lang.Integer num = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PushProvisioningWidgetError(errorType=");
            sb.append(debitErrorType);
            sb.append(", errorTag=");
            sb.append(str);
            sb.append(", retryCount=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorType.hashCode();
            int hashCode2 = this.errorTag.hashCode();
            java.lang.Integer num = this.retryCount;
            return (((hashCode * 31) + hashCode2) * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetError)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetError pushProvisioningWidgetError = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetError) other;
            return this.errorType == pushProvisioningWidgetError.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.errorTag, pushProvisioningWidgetError.errorTag) && kotlin.jvm.internal.Intrinsics.areEqual(this.retryCount, pushProvisioningWidgetError.retryCount);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetError copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, java.lang.String errorTag, java.lang.Integer retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTag, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetError(errorType, errorTag, retryCount);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorTag() {
            return this.errorTag;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetError copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetError pushProvisioningWidgetError, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitErrorType = pushProvisioningWidgetError.errorType;
            }
            if ((i & 2) != 0) {
                str = pushProvisioningWidgetError.errorTag;
            }
            if ((i & 4) != 0) {
                num = pushProvisioningWidgetError.retryCount;
            }
            return pushProvisioningWidgetError.copy(debitErrorType, str, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JD\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b\u0007\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b$\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$LockUnlockError;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "cardId", "", "isLockOperation", "errorTag", "", "retryCount", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "component5", "()Ljava/lang/Integer;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$LockUnlockError;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", "Ljava/lang/String;", "getCardId", "Z", "getErrorTag", "Ljava/lang/Integer;", "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LockUnlockError extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState {
        public static final int $stable = 0;
        private final java.lang.String cardId;
        private final java.lang.String errorTag;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;
        private final boolean isLockOperation;
        private final java.lang.Integer retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockUnlockError(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, boolean z, java.lang.String str2, java.lang.Integer num) {
            super("LockUnlockError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.errorType = debitErrorType;
            this.cardId = str;
            this.isLockOperation = z;
            this.errorTag = str2;
            this.retryCount = num;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final boolean isLockOperation() {
            return this.isLockOperation;
        }

        public /* synthetic */ LockUnlockError(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, boolean z, java.lang.String str2, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(debitErrorType, str, z, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : num);
        }

        public final java.lang.String getErrorTag() {
            return this.errorTag;
        }

        public final java.lang.Integer getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            java.lang.String str = this.cardId;
            boolean z = this.isLockOperation;
            java.lang.String str2 = this.errorTag;
            java.lang.Integer num = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LockUnlockError(errorType=");
            sb.append(debitErrorType);
            sb.append(", cardId=");
            sb.append(str);
            sb.append(", isLockOperation=");
            sb.append(z);
            sb.append(", errorTag=");
            sb.append(str2);
            sb.append(", retryCount=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorType.hashCode();
            int hashCode2 = this.cardId.hashCode();
            int hashCode3 = java.lang.Boolean.hashCode(this.isLockOperation);
            int hashCode4 = this.errorTag.hashCode();
            java.lang.Integer num = this.retryCount;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError lockUnlockError = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError) other;
            return this.errorType == lockUnlockError.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, lockUnlockError.cardId) && this.isLockOperation == lockUnlockError.isLockOperation && kotlin.jvm.internal.Intrinsics.areEqual(this.errorTag, lockUnlockError.errorTag) && kotlin.jvm.internal.Intrinsics.areEqual(this.retryCount, lockUnlockError.retryCount);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, java.lang.String cardId, boolean isLockOperation, java.lang.String errorTag, java.lang.Integer retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTag, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError(errorType, cardId, isLockOperation, errorTag, retryCount);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Integer getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getErrorTag() {
            return this.errorTag;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsLockOperation() {
            return this.isLockOperation;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError lockUnlockError, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, boolean z, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitErrorType = lockUnlockError.errorType;
            }
            if ((i & 2) != 0) {
                str = lockUnlockError.cardId;
            }
            java.lang.String str3 = str;
            if ((i & 4) != 0) {
                z = lockUnlockError.isLockOperation;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                str2 = lockUnlockError.errorTag;
            }
            java.lang.String str4 = str2;
            if ((i & 16) != 0) {
                num = lockUnlockError.retryCount;
            }
            return lockUnlockError.copy(debitErrorType, str3, z2, str4, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$RemoveWalletError;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "cardId", "errorTag", "", "retryCount", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Integer;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState$RemoveWalletError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", "Ljava/lang/String;", "getCardId", "getErrorTag", "Ljava/lang/Integer;", "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RemoveWalletError extends com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState {
        public static final int $stable = 0;
        private final java.lang.String cardId;
        private final java.lang.String errorTag;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;
        private final java.lang.Integer retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoveWalletError(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, java.lang.String str2, java.lang.Integer num) {
            super("RemoveWalletError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.errorType = debitErrorType;
            this.cardId = str;
            this.errorTag = str2;
            this.retryCount = num;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public /* synthetic */ RemoveWalletError(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(debitErrorType, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : num);
        }

        public final java.lang.String getErrorTag() {
            return this.errorTag;
        }

        public final java.lang.Integer getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            java.lang.String str = this.cardId;
            java.lang.String str2 = this.errorTag;
            java.lang.Integer num = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RemoveWalletError(errorType=");
            sb.append(debitErrorType);
            sb.append(", cardId=");
            sb.append(str);
            sb.append(", errorTag=");
            sb.append(str2);
            sb.append(", retryCount=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorType.hashCode();
            int hashCode2 = this.cardId.hashCode();
            int hashCode3 = this.errorTag.hashCode();
            java.lang.Integer num = this.retryCount;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError removeWalletError = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError) other;
            return this.errorType == removeWalletError.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, removeWalletError.cardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorTag, removeWalletError.errorTag) && kotlin.jvm.internal.Intrinsics.areEqual(this.retryCount, removeWalletError.retryCount);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, java.lang.String cardId, java.lang.String errorTag, java.lang.Integer retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorTag, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError(errorType, cardId, errorTag, retryCount);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Integer getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getErrorTag() {
            return this.errorTag;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError removeWalletError, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitErrorType = removeWalletError.errorType;
            }
            if ((i & 2) != 0) {
                str = removeWalletError.cardId;
            }
            if ((i & 4) != 0) {
                str2 = removeWalletError.errorTag;
            }
            if ((i & 8) != 0) {
                num = removeWalletError.retryCount;
            }
            return removeWalletError.copy(debitErrorType, str, str2, num);
        }
    }

    public /* synthetic */ ManageWalletState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
