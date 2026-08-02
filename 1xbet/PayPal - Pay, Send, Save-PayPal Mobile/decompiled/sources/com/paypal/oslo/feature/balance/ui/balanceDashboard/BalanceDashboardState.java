package com.paypal.oslo.feature.balance.ui.balanceDashboard;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Idle", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardState$Error;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardState$Idle;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardState$Loading;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BalanceDashboardState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardState$Idle;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle extends com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Idle INSTANCE = new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Idle();

        public final int hashCode() {
            return 32528776;
        }

        private Idle() {
            super("Idle", null);
        }

        public final java.lang.String toString() {
            return "Idle";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Idle)) {
                return false;
            }
            return true;
        }
    }

    private BalanceDashboardState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardState$Loading;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Loading INSTANCE = new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Loading();

        public final int hashCode() {
            return 1369504520;
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
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0092\u0001\u0010'\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b4\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b\u0006\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b\u0007\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\u001cR\u001a\u0010\n\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b\n\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010!R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b<\u0010\u0017R\u001a\u0010\u0011\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b\u0011\u0010\u0019R\u001a\u0010\u0012\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b\u0012\u0010\u0019R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\b\u0013\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardState$Success;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardState;", "", "Lcom/paypal/oslo/feature/balance/domain/model/CurrencyBalance;", "currencyBalances", "", "isViewCurrenciesBottomSheetVisible", "isCurrenciesLoading", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceUiModel;", "balanceUiModel", "isRefreshing", "Lcom/paypal/oslo/feature/balance/domain/model/TaxHoldPolicy;", "taxHoldPolicy", "Lcom/paypal/oslo/feature/balance/domain/model/AutoReloadInfo;", "autoReloadInfo", "Lcom/paypal/oslo/feature/balance/domain/model/nba/NbaRecommendation;", "nbaRecommendations", "isNbaDismissed", "isNbaLoading", "isAccountRoutingEligible", "<init>", "(Ljava/util/List;ZZLcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceUiModel;ZLcom/paypal/oslo/feature/balance/domain/model/TaxHoldPolicy;Lcom/paypal/oslo/feature/balance/domain/model/AutoReloadInfo;Ljava/util/List;ZZLjava/lang/Boolean;)V", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "component4", "()Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceUiModel;", "component5", "component6", "()Lcom/paypal/oslo/feature/balance/domain/model/TaxHoldPolicy;", "component7", "()Lcom/paypal/oslo/feature/balance/domain/model/AutoReloadInfo;", "component8", "component9", "component10", "component11", "()Ljava/lang/Boolean;", "copy", "(Ljava/util/List;ZZLcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceUiModel;ZLcom/paypal/oslo/feature/balance/domain/model/TaxHoldPolicy;Lcom/paypal/oslo/feature/balance/domain/model/AutoReloadInfo;Ljava/util/List;ZZLjava/lang/Boolean;)Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getCurrencyBalances", "Z", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceUiModel;", "getBalanceUiModel", "Lcom/paypal/oslo/feature/balance/domain/model/TaxHoldPolicy;", "getTaxHoldPolicy", "Lcom/paypal/oslo/feature/balance/domain/model/AutoReloadInfo;", "getAutoReloadInfo", "getNbaRecommendations", "Ljava/lang/Boolean;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo;
        private final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel balanceUiModel;
        private final java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> currencyBalances;
        private final java.lang.Boolean isAccountRoutingEligible;
        private final boolean isCurrenciesLoading;
        private final boolean isNbaDismissed;
        private final boolean isNbaLoading;
        private final boolean isRefreshing;
        private final boolean isViewCurrenciesBottomSheetVisible;
        private final java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> nbaRecommendations;
        private final com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy taxHoldPolicy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> list, boolean z, boolean z2, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel balanceUiModel, boolean z3, com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy taxHoldPolicy, com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo, java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> list2, boolean z4, boolean z5, java.lang.Boolean bool) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.currencyBalances = list;
            this.isViewCurrenciesBottomSheetVisible = z;
            this.isCurrenciesLoading = z2;
            this.balanceUiModel = balanceUiModel;
            this.isRefreshing = z3;
            this.taxHoldPolicy = taxHoldPolicy;
            this.autoReloadInfo = autoReloadInfo;
            this.nbaRecommendations = list2;
            this.isNbaDismissed = z4;
            this.isNbaLoading = z5;
            this.isAccountRoutingEligible = bool;
        }

        public /* synthetic */ Success(java.util.List list, boolean z, boolean z2, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel balanceUiModel, boolean z3, com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy taxHoldPolicy, com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo, java.util.List list2, boolean z4, boolean z5, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : balanceUiModel, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : taxHoldPolicy, (i & 64) != 0 ? null : autoReloadInfo, (i & 128) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 256) == 0 ? z4 : false, (i & 512) != 0 ? true : z5, (i & 1024) == 0 ? bool : null);
        }

        public final java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> getCurrencyBalances() {
            return this.currencyBalances;
        }

        public final boolean isViewCurrenciesBottomSheetVisible() {
            return this.isViewCurrenciesBottomSheetVisible;
        }

        public final boolean isCurrenciesLoading() {
            return this.isCurrenciesLoading;
        }

        public final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel getBalanceUiModel() {
            return this.balanceUiModel;
        }

        public final boolean isRefreshing() {
            return this.isRefreshing;
        }

        public final com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy getTaxHoldPolicy() {
            return this.taxHoldPolicy;
        }

        public final com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo getAutoReloadInfo() {
            return this.autoReloadInfo;
        }

        public final java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> getNbaRecommendations() {
            return this.nbaRecommendations;
        }

        public final boolean isNbaDismissed() {
            return this.isNbaDismissed;
        }

        public final boolean isNbaLoading() {
            return this.isNbaLoading;
        }

        public final java.lang.Boolean isAccountRoutingEligible() {
            return this.isAccountRoutingEligible;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> list = this.currencyBalances;
            boolean z = this.isViewCurrenciesBottomSheetVisible;
            boolean z2 = this.isCurrenciesLoading;
            com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel balanceUiModel = this.balanceUiModel;
            boolean z3 = this.isRefreshing;
            com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy taxHoldPolicy = this.taxHoldPolicy;
            com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo = this.autoReloadInfo;
            java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> list2 = this.nbaRecommendations;
            boolean z4 = this.isNbaDismissed;
            boolean z5 = this.isNbaLoading;
            java.lang.Boolean bool = this.isAccountRoutingEligible;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(currencyBalances=");
            sb.append(list);
            sb.append(", isViewCurrenciesBottomSheetVisible=");
            sb.append(z);
            sb.append(", isCurrenciesLoading=");
            sb.append(z2);
            sb.append(", balanceUiModel=");
            sb.append(balanceUiModel);
            sb.append(", isRefreshing=");
            sb.append(z3);
            sb.append(", taxHoldPolicy=");
            sb.append(taxHoldPolicy);
            sb.append(", autoReloadInfo=");
            sb.append(autoReloadInfo);
            sb.append(", nbaRecommendations=");
            sb.append(list2);
            sb.append(", isNbaDismissed=");
            sb.append(z4);
            sb.append(", isNbaLoading=");
            sb.append(z5);
            sb.append(", isAccountRoutingEligible=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.currencyBalances.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.isViewCurrenciesBottomSheetVisible);
            int hashCode3 = java.lang.Boolean.hashCode(this.isCurrenciesLoading);
            com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel balanceUiModel = this.balanceUiModel;
            int hashCode4 = balanceUiModel == null ? 0 : balanceUiModel.hashCode();
            int hashCode5 = java.lang.Boolean.hashCode(this.isRefreshing);
            com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy taxHoldPolicy = this.taxHoldPolicy;
            int hashCode6 = taxHoldPolicy == null ? 0 : taxHoldPolicy.hashCode();
            com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo = this.autoReloadInfo;
            int hashCode7 = autoReloadInfo == null ? 0 : autoReloadInfo.hashCode();
            int hashCode8 = this.nbaRecommendations.hashCode();
            int hashCode9 = java.lang.Boolean.hashCode(this.isNbaDismissed);
            int hashCode10 = java.lang.Boolean.hashCode(this.isNbaLoading);
            java.lang.Boolean bool = this.isAccountRoutingEligible;
            return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (bool != null ? bool.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Success success = (com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyBalances, success.currencyBalances) && this.isViewCurrenciesBottomSheetVisible == success.isViewCurrenciesBottomSheetVisible && this.isCurrenciesLoading == success.isCurrenciesLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceUiModel, success.balanceUiModel) && this.isRefreshing == success.isRefreshing && kotlin.jvm.internal.Intrinsics.areEqual(this.taxHoldPolicy, success.taxHoldPolicy) && kotlin.jvm.internal.Intrinsics.areEqual(this.autoReloadInfo, success.autoReloadInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.nbaRecommendations, success.nbaRecommendations) && this.isNbaDismissed == success.isNbaDismissed && this.isNbaLoading == success.isNbaLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.isAccountRoutingEligible, success.isAccountRoutingEligible);
        }

        public final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Success copy(java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> currencyBalances, boolean isViewCurrenciesBottomSheetVisible, boolean isCurrenciesLoading, com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel balanceUiModel, boolean isRefreshing, com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy taxHoldPolicy, com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo autoReloadInfo, java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> nbaRecommendations, boolean isNbaDismissed, boolean isNbaLoading, java.lang.Boolean isAccountRoutingEligible) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyBalances, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nbaRecommendations, "");
            return new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Success(currencyBalances, isViewCurrenciesBottomSheetVisible, isCurrenciesLoading, balanceUiModel, isRefreshing, taxHoldPolicy, autoReloadInfo, nbaRecommendations, isNbaDismissed, isNbaLoading, isAccountRoutingEligible);
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsNbaDismissed() {
            return this.isNbaDismissed;
        }

        public final java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> component8() {
            return this.nbaRecommendations;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.balance.domain.model.AutoReloadInfo getAutoReloadInfo() {
            return this.autoReloadInfo;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.balance.domain.model.TaxHoldPolicy getTaxHoldPolicy() {
            return this.taxHoldPolicy;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsRefreshing() {
            return this.isRefreshing;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceUiModel getBalanceUiModel() {
            return this.balanceUiModel;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsCurrenciesLoading() {
            return this.isCurrenciesLoading;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsViewCurrenciesBottomSheetVisible() {
            return this.isViewCurrenciesBottomSheetVisible;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.Boolean getIsAccountRoutingEligible() {
            return this.isAccountRoutingEligible;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getIsNbaLoading() {
            return this.isNbaLoading;
        }

        public final java.util.List<com.paypal.oslo.feature.balance.domain.model.CurrencyBalance> component1() {
            return this.currencyBalances;
        }

        public Success() {
            this(null, false, false, null, false, null, null, null, false, false, null, 2047, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017Jl\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b\b\u0010\u0017R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0019R\u001a\u0010\f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b\f\u0010\u0017R\u001a\u0010\r\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b\r\u0010\u0017R\u001a\u0010\u000e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b\u000e\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardState$Error;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardState;", "", "errorMessage", "", "errorCode", "errorType", "", "isRetrying", "", "Lcom/paypal/oslo/feature/balance/domain/model/nba/NbaRecommendation;", "nbaRecommendations", "isNbaDismissed", "isNbaLoading", "isPrepaidError", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/List;ZZZ)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Z", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/List;ZZZ)Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardState$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage", "Ljava/lang/Integer;", "getErrorCode", "getErrorType", "Z", "Ljava/util/List;", "getNbaRecommendations"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState {
        public static final int $stable = 8;
        private final java.lang.Integer errorCode;
        private final java.lang.String errorMessage;
        private final java.lang.String errorType;
        private final boolean isNbaDismissed;
        private final boolean isNbaLoading;
        private final boolean isPrepaidError;
        private final boolean isRetrying;
        private final java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> nbaRecommendations;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, java.lang.Integer num, java.lang.String str2, boolean z, java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> list, boolean z2, boolean z3, boolean z4) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.errorMessage = str;
            this.errorCode = num;
            this.errorType = str2;
            this.isRetrying = z;
            this.nbaRecommendations = list;
            this.isNbaDismissed = z2;
            this.isNbaLoading = z3;
            this.isPrepaidError = z4;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.Integer getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String getErrorType() {
            return this.errorType;
        }

        public final boolean isRetrying() {
            return this.isRetrying;
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.Integer num, java.lang.String str2, boolean z, java.util.List list, boolean z2, boolean z3, boolean z4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) == 0 ? str2 : null, (i & 8) != 0 ? false : z, (i & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? true : z3, (i & 128) == 0 ? z4 : false);
        }

        public final java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> getNbaRecommendations() {
            return this.nbaRecommendations;
        }

        public final boolean isNbaDismissed() {
            return this.isNbaDismissed;
        }

        public final boolean isNbaLoading() {
            return this.isNbaLoading;
        }

        public final boolean isPrepaidError() {
            return this.isPrepaidError;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.Integer num = this.errorCode;
            java.lang.String str2 = this.errorType;
            boolean z = this.isRetrying;
            java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> list = this.nbaRecommendations;
            boolean z2 = this.isNbaDismissed;
            boolean z3 = this.isNbaLoading;
            boolean z4 = this.isPrepaidError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorMessage=");
            sb.append(str);
            sb.append(", errorCode=");
            sb.append(num);
            sb.append(", errorType=");
            sb.append(str2);
            sb.append(", isRetrying=");
            sb.append(z);
            sb.append(", nbaRecommendations=");
            sb.append(list);
            sb.append(", isNbaDismissed=");
            sb.append(z2);
            sb.append(", isNbaLoading=");
            sb.append(z3);
            sb.append(", isPrepaidError=");
            sb.append(z4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.errorMessage;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.Integer num = this.errorCode;
            int hashCode2 = num == null ? 0 : num.hashCode();
            java.lang.String str2 = this.errorType;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isRetrying)) * 31) + this.nbaRecommendations.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isNbaDismissed)) * 31) + java.lang.Boolean.hashCode(this.isNbaLoading)) * 31) + java.lang.Boolean.hashCode(this.isPrepaidError);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Error error = (com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, error.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorType, error.errorType) && this.isRetrying == error.isRetrying && kotlin.jvm.internal.Intrinsics.areEqual(this.nbaRecommendations, error.nbaRecommendations) && this.isNbaDismissed == error.isNbaDismissed && this.isNbaLoading == error.isNbaLoading && this.isPrepaidError == error.isPrepaidError;
        }

        public final com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Error copy(java.lang.String errorMessage, java.lang.Integer errorCode, java.lang.String errorType, boolean isRetrying, java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> nbaRecommendations, boolean isNbaDismissed, boolean isNbaLoading, boolean isPrepaidError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nbaRecommendations, "");
            return new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardState.Error(errorMessage, errorCode, errorType, isRetrying, nbaRecommendations, isNbaDismissed, isNbaLoading, isPrepaidError);
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsPrepaidError() {
            return this.isPrepaidError;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsNbaLoading() {
            return this.isNbaLoading;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsNbaDismissed() {
            return this.isNbaDismissed;
        }

        public final java.util.List<com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation> component5() {
            return this.nbaRecommendations;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsRetrying() {
            return this.isRetrying;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getErrorType() {
            return this.errorType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public Error() {
            this(null, null, null, false, null, false, false, false, 255, null);
        }
    }

    public /* synthetic */ BalanceDashboardState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
